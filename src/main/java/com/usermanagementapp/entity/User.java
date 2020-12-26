package com.usermanagementapp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.usermanagementapp.appstringconstants.AppStringConstants;

import lombok.Data;

@Data
@Entity
@Table(name = AppStringConstants.USERMASTER)
public class User {
	@Id
	@GeneratedValue
	@Column(name = AppStringConstants.USERID)
	private String userId;
	@Column(name = AppStringConstants.FIRSTNAME)
	private String firstName;
	@Column(name = AppStringConstants.LASTNAME)
	private String lastName;
	@Column(name = AppStringConstants.EMAIL,unique = true)
	private String email;
	@Column(name = AppStringConstants.PHONENUMBER)
	private Integer phoneNumber;
	@Column(name = AppStringConstants.DATEOFBIRTH)
	private Date dateOfBirth;
	@Column(name = AppStringConstants.GENDER)
	private String gender;
	@Column(name = AppStringConstants.COUNTRY)
	private String country;
	@Column(name = AppStringConstants.STATE)
	private String state;
	@Column(name = AppStringConstants.CITY)
	private String city;
	@Column(name = AppStringConstants.PASSWORD)
	private String password;
	@Column(name = AppStringConstants.ACCOUNTSTATUS)
	private String accStatus;

}
