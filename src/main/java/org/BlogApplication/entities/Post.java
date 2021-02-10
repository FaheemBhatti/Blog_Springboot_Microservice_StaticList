package org.BlogApplication.entities;

public class Post 
{
	private int postId;
	private String postTitle;
	private String postBody;
	
	public Post(int postId , String postTitle , String postBody) 
	{
		this.postBody = postBody;
		this.postId = postId;
		this.postTitle = postTitle;
	}
	
	public void setPostBody(String postBody) {
		this.postBody = postBody;
	}
	
	public String getPostBody() {
		return postBody;
	}
	
	public void setPostId(int postId) {
		this.postId = postId;
	}
	
	public int getPostId() {
		return postId;
	}
	
	public String getPostTitle() {
		return postTitle;
	}
	
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
}
