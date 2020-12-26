package com.usermanagementapp.appstringconstants;

import org.springframework.stereotype.Component;

@Component
public class AppStringConstants {

	// USER_MASTER database table
	public static final String USERMASTER = "USER_MASTER";
	public static final String USERID = "USER_ID";
	public static final String FIRSTNAME = "FNAME";
	public static final String LASTNAME = "LNAME";
	public static final String EMAIL = "EMAIL";
	public static final String PHONENUMBER = "PHNO";
	public static final String DATEOFBIRTH = "DOB";
	public static final String GENDER = "GENDER";
	public static final String COUNTRY = "COUNTRY";
	public static final String STATE = "STATE";
	public static final String CITY = "CITY";
	public static final String PASSWORD = "PWD";
	public static final String ACCOUNTSTATUS = "ACC_STATUS";

	// COUNTRY_MASTER database table
	public static final String COUNTRYMASTER = "COUNTRY_MASTER";
	public static final String COUNTRYID = "COUNTRY_ID";
	public static final String COUNTRYNAME = "COUNTRY_NAME";

	// STATE_MASTER database table
	public static final String STATEMASTER = "STATE_MASTER";
	public static final String STATEID = "STATE_ID";
	public static final String STATENAME = "STATE_NAME";

	// CITY_MASTER database table
	public static final String CITYMASTER = "CITY_MASTER";
	public static final String CITYID = "CITY_ID";
	public static final String CITYNAME = "CITY_NAME";

	// Controller
	public static final String EMPTY = "";
	public static final String SIGNUP = "/signUp";
	public static final String REGISTER = "/register";
	public static final String REGISTER_FORM = "registrationForm";
	public static final String REGISTERED_SUCCESS = "is successfully Registered,Please check your mail to Unlock account";
	public static final String REGISTERED_FAIL = "user failed to register";
	public static final String REGISTERED_ALREADY = "This Email is already Registered";
	public static final String UNLOCK_ACCOUNT = "/unlockAccount";
	public static final String UNLOCK_ACCOUNTFORM = "unlockAccountForm";
	
	//service
	public static final String LOCKED = "LOCKED";
	public static final String UNLOCK = "UNLOCK";
	public static final String ACCOUNT_LOCK = "Account is Locked";
	public static final String ACCOUNT_UNLOCK = "Account is Unlocked";
	public static final String CREDENTIALS_INVALID = "Invalid credentials";
	public static final String PWD_SENTINMAIL = "Password sent to your mail,please check and Login";
	public static final String INVALID_EMAIL = "Invalid Email";

}
