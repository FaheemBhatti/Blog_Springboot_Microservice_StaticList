package org.BlogApplication.service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.BlogApplication.entities.Post;
import org.springframework.stereotype.Service;

@Service
public class PostService 
{
	private static List<Post> listOfPosts = new ArrayList<>(Arrays.asList
			(new Post(1, "Title1", "Post1"), 
			 new Post(2, "Title2", "Post2"),
			 new Post(3, "Title3", "Post3")));
	
	public List<Post> getPosts()
	{
		return listOfPosts;
	}

	public Post getPost(int id) 
	{
		for(Post post :listOfPosts)
		{
			if (post.getPostId() == id)
			{
				return post;
			}
		}
		return null;
	}

	public void addPost(Post post) 
	{
		listOfPosts.add(post);
	}

	public void updatePost(Post post) 
	{
		for(Post elementToUpdate : listOfPosts)
		{
			if(post.getPostId() == elementToUpdate.getPostId())
			{
				elementToUpdate.setPostBody(post.getPostBody());
				elementToUpdate.setPostTitle(post.getPostTitle());
			}
		}		
	}

	public void deletePost(int id) 
	{
		listOfPosts.remove(id);
	}
}
