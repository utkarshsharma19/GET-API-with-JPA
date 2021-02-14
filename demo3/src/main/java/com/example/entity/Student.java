package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@EntityScan
@Table(name="Persons")
public class Student {
	
	
	
@Column(name ="PersonID")
private long PersonID;

@Column(name ="FirstName")
private String FirstName;

@Column(name ="LastName")
private String LastName;

@Column(name ="Address")
private String Address;

@Column(name ="City")
private String City;
}
