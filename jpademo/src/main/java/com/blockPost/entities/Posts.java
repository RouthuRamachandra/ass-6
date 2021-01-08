package com.blockPost.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tblPosts")
public class Posts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDate postDate;
	@JoinColumn(name = "UserID")
	@ManyToOne
	private Users users;
	private String details;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getPostDate() {
		return postDate;
	}

	public void setPostDate(LocalDate postDate) {
		this.postDate = postDate;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Posts() {
	}

	public Posts(LocalDate postDate, Users users, String details) {
		super();
		this.postDate = postDate;
		this.users = users;
		this.details = details;
	}

	@Override
	public String toString() {
		return "Posts [id=" + id + ", postDate=" + postDate + ", users=" + users + ", details=" + details + "]";
	}

}
