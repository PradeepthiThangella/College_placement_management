package com.college.college.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Colleges")

public class College {
@Id
@GeneratedValue

  private int Id;
  private String clgname;
  private String location;
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getClgname() {
	return clgname;
}
public void setClgname(String clgname) {
	this.clgname = clgname;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
   
}
