//package com.blog.security;
//
//import java.util.Date;
//import java.util.function.Function;
//
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Component;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import java.util.Map;
//import java.util.HashMap;
//
//@Component
//public class JwtTokenHelper {
//	
//	public static final long JWT_TOKEN_VALIDITY=5*60*50;
//	
//	private String secret="jwtTokenKey";
//	
//	// retrive username from jwt Token
//	
//	public String getUsernameFromToken(String Token) {
//		
//		return getClaimFromToken(Token,Claims::getSubject);
//		
//		
//	}
//	
//	//retrieve expression date from jwt token
//	
//	public Date getExpirationDateFromToken(String Token)
//	{
//		return getClaimFromToken(Token,Claims::getExpiration);
//	}
//	
//	public <T>T getClaimFromToken(String token, Function<Claims,T> claimsResolver){
//		final Claims claims=getAllClaimsFromToken(token);
//		return claimsResolver.apply(claims);
//		
//		
//	}
//	
//	//for retrieve any information from token  we will need the secret key
//	
//	private Claims getAllClaimsFromToken(String token) {
//		
//		return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
//	}
//	
//	// check the token if tokern has expired 
//	
//	private Boolean isTokenExpiration(String token) {
//		final Date expiration=getExpirationDateFromToken(token);
//		return expiration.before(new Date());
//	}
//	
//	//generate token from user
//	
//	public String generateToken (UserDetails userDetails)
//	{
//		Map<String,Object>claims=new HashMap<>();
//		return doGenerateToken(claims,userDetails.getUsername());
//	}
//	
//	//while creting a token 
//	//1 Define claims of the token , like Issue , Expiration ,Subject and the ID
//	//2 Sign the JWT Using the HS512 alogorithm and secret key
//	//3 According to JWS compact Serilization (https://tools.ietf.org/html/fraf-ietf-jose
//	// compaction of the JWT to a URL -safe String 
//	
//	private String doGenerateToken(Map<String,Object> claims,String subject) {
//		
//		return Jwts.builder().setClaims(claims).setSubject(subject).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
//				.setExpiration(new Date (System.currentTimeMillis()+ JWT_TOKEN_VALIDITY*1))
//		
//	}
//	
//	
//	
//
//}
