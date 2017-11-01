/**
 * 
 */

app.controller('BlogPostDetailController', function($scope, $location,
		BlogPostService, $routeParams) {
	$scope.isRejected = false
	$scope.isLinked = false

	var id = $routeParams.id

	BlogPostService.getBlogPostById(id).then(function(response) {
		$scope.blogPost = response.data // Blogpost [select * from blogpost
		// where id =?]
	}, function(response) {
		if (response.status == 401)
			$location.path('/login')
	})

	/*
	 * update approved/rejection reason in blogPost table update blogpost set
	 * approved = 1 and where id = ?
	 * 
	 * r update blogpost set rejectionreason
	 * 
	 */
	$scope.updateLikes = function() {
		$scope.isLiked = !$scope.isLiked;
		if ($scope.isLiked) {
			$scope.blogPost.likes = $scope.blogPost.likes + 1 // 1st click
		} else {
			$scope.blogPost.likes = $scope.blogPost.likes - 1 // 2nd click
		}
		// update blogPost set likes=? where id=?
		BlogPostService.updateBlogPost($scope.blogPost).then(
				function(response) {
				}, function(response) {
				})
	}
	$scope.updateBlogPost = function() {
		console.log('update Blog')
		BlogPostService.updateBlogPost($scope.blogPost).then(
				function(response) {
				}, function(response) {
				})
				$location.path('/getblogs')
	}
	
	$scope.showRejectionTxt = function(val) {
		$scope.isRejected = val
	}
	$scope.addComment = function() {
		console.log($scope.blogComment) // comment text property in blogcomment
		$scope.blogComment.blogPost = $scope.blogPost // blogpost property in
		// blogComment
		console.log($scope.blogComment)
		BlogPostService.addComment($scope.blogComment).then(function(response) {
			console.log(response.data);
		})
		$scope.blogComment.commentText = '';
		getBlogComments();
	}, function(response) {
		if (response.status = 401)
			$location.path('/login') // login.html
		else
			$location.path('/getblogbyid/' + id) // blogdetails.html
	}

	function getBlogComments() { // select blogComment for particular
		// blogPost
		BlogPostService.getBlogComment(id).then(function(response) {
		}, function(response) {
			if (response.status = 401)
				$location.path('/login')
		})
	}

	function getNotification() { // select blogComment for particular
		// blogPost
		BlogPostService.getNotification().then(function(response) {
		}, function(response) {
			if (response.status = 401)
	 			$location.path('/login')
		})
	}
})