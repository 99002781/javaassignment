package com.ltts.activitydemo;

public class Student {
private String name;
private String address;
private Integer id;

public Student(String name, String address, Integer id) {
	super();
	this.name = name;
	this.address = address;
	this.id = id;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
@Override
public String toString() {
	return "student [name=" + name + ", address=" + address + ", id=" + id;
}
}

