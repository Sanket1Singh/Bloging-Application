package com.blog.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.entities.Post;
import com.blog.payloads.PostDto;
import com.blog.payloads.PostResponse;
@Service
public interface PostService {
	
	//create
	
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	//update
	
	PostDto updatePost(PostDto postDto,Integer postId);
	
	//delete
	
	void deletePost(Integer postId);
	
	//getAll post
	PostResponse getAllPost(Integer pageNumber,Integer pageSize,String sortBy,String sortDir);
	
	//get single post
	
	PostDto getPostById(Integer postId);
	
	// get all post by category
	List<PostDto>getPostsByCategory(Integer categoryId);
	
	//get All post By User
	List<PostDto>getPostsByUser(Integer userId);
	
	//SearchPosts
	List<PostDto>searchPosts(String keyword);
	

}
