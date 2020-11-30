package com.users;

public class User {
private int id;
private String name;
private String passsword;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public User(int id, String name,String passsword) {
	super();
	this.id = id;
	this.name=name;
	this.passsword = passsword;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPasssword() {
	return passsword;
}
public void setPasssword(String passsword) {
	this.passsword = passsword;
}
}
