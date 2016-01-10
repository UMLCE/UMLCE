package com.mbe.umlce.beans;


public class UserPlagarismReportBean {
	
	int id;
	String name;
	String username;
	Integer submissions;
	Integer above80;
	Integer above50;
	Integer aboveaverage;
	Integer less50;
	
	public UserPlagarismReportBean(int id, String name, String username,
			Integer submissions, Integer above80,
			Integer above50, Integer aboveaverage, Integer less50) {
		super();
		this.id = id;
		this.username = username;
		this.name = name;
		this.submissions = submissions;
		this.above80 = above80;
		this.above50 = above50;
		this.aboveaverage = aboveaverage;
		this.less50 = less50;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSubmissions() {
		return submissions;
	}
	public void setSubmissions(Integer submissions) {
		this.submissions = submissions;
	}
	public Integer getAbove80() {
		return above80;
	}
	public void setAbove80(Integer above80) {
		this.above80 = above80;
	}
	public Integer getAbove50() {
		return above50;
	}
	public void setAbove50(Integer above50) {
		this.above50 = above50;
	}
	public Integer getAboveaverage() {
		return aboveaverage;
	}
	public void setAboveaverage(Integer aboveaverage) {
		this.aboveaverage = aboveaverage;
	}
	public Integer getLess50() {
		return less50;
	}
	public void setLess50(Integer less50) {
		this.less50 = less50;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}
	
	
}