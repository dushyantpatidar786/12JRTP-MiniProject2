package com.usermanagementapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.usermanagementapp.appstringconstants.AppStringConstants;
import com.usermanagementapp.entity.User;
import com.usermanagementapp.service.UserManagementService;

@RestController
public class RegistrationRestController {
	@Autowired
	UserManagementService userManageService;

	@GetMapping(AppStringConstants.SIGNUP)
	public String showRegistrationForm() {
		return AppStringConstants.REGISTER_FORM;
	}

	// GetMethod for requesting country list
	// GetMethod for requesting state list
	// GetMethod for requesting city list

	@PostMapping(value = AppStringConstants.REGISTER,consumes = {MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> registerUser(@RequestBody User user) {
		String message = AppStringConstants.EMPTY;
		if (userManageService.isEmailUnique(user.getEmail())) {
			if (userManageService.saveUser(user)) {
				message = user.getFirstName() + user.getLastName()
						+ AppStringConstants.REGISTERED_SUCCESS;
			}
			message = AppStringConstants.REGISTERED_FAIL;
		}
		message = AppStringConstants.REGISTERED_ALREADY;
		return new ResponseEntity<String>(message, HttpStatus.CREATED);

	}
}
