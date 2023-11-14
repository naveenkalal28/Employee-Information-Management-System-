package com.example.form.user;

//import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.web.multipart.MultipartFile;

@Document(value="User")

public class User 
{
	@Id
	private String id;
	private String username;
	private String password;
	private String country;
	private String gender;
	private String comments;
	//private List<String> interests; 
	private boolean selectAll;
    
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public boolean isSelectAll() {
		return selectAll;
	}
	public void setSelectAll(boolean selectAll) {
		this.selectAll = selectAll;
	}
	
	/*
	 * public List<String> getInterests() { return interests; } public void
	 * setInterests(List<String> interests) { this.interests = interests; }
	 */
}
	
