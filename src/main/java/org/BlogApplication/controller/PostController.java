package org.BlogApplication.controller;

import java.util.List;
import org.BlogApplication.entities.Post;
import org.BlogApplication.service.PostService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController 
{
	@RequestMapping("/posts")
	public List<Post> getPosts()
	{
		return new PostService().getPosts();
	}
	
	@RequestMapping("/posts/{id}")
	public Post getPost(@PathVariable("id") int id)
	{
		return new PostService().getPost(id);
	}
	
	@RequestMapping(value = "/posts" , 
			method = RequestMethod.POST , 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addPost(@RequestBody Post post)
	{
		new PostService().addPost(post);
	}
	
	@RequestMapping(value = "/posts" , 
			method = RequestMethod.PUT,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updatePost(@RequestBody Post post)
	{
		new PostService().updatePost(post);
	}
	
	@RequestMapping(value ="/posts/{id}" ,
			method = RequestMethod.DELETE)
	public void deletePost(@PathVariable int id)
	{
		new PostService().deletePost(id);
	}

}
