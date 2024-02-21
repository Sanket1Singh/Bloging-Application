package com.blog.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	private int id;
	@NotBlank
	@Size(min=4, message="Username must be min of 4 Characters !!")
	private String name;
	@Email(message="Email address is not valid !!")
	private String email;
	@NotBlank
	@Size(min=4,max=10,message="Password must be min 4 Characters and max 10 Characters !!")
	private String password;
	@NotBlank
	private String about;

}
