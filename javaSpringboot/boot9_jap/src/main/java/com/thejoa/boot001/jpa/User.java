package com.thejoa.boot001.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class User {
	
	@Id @GeneratedValue
	private Long id;
	private String username;
	
	@ManyToMany
	@JoinTable(name="likes" , 
		joinColumns= @JoinColumn(name="user_id"),
		inverseJoinColumns=@JoinColumn(name="post_id"))
	private List<Post> likedPosts = new ArrayList<>();
}
