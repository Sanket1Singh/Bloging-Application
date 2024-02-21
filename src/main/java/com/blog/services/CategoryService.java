package com.blog.services;

import java.util.List;

import com.blog.payloads.CategoryDto;


public interface CategoryService {
	
	//crate
	CategoryDto createCategory(CategoryDto categoryDto);
	//update
	CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
	//delete
	public void deleteCategory(Integer categoryId);
	//get
	public CategoryDto getCategory(Integer categoryId);
	//get All
	List<CategoryDto> getCategories();
	
	
	

}
