package com.blog;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.blog.repositories.UserRepo;

@SpringBootTest
class BlogAppApplicationTests {
     
	private UserRepo userRepo;
	@Test
	void contextLoads() {
		
	}
	public void RepoTest()
	{
		String ClassName=this.userRepo.getClass().getName();
		String PackName=this.userRepo.getClass().getPackageName();
		System.out.println(ClassName);
		System.out.println(PackName+"##################################################################");
	}

}
