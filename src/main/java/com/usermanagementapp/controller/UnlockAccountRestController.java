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
public class UnlockAccountRestController {
	@Autowired
	UserManagementService usermanagementService;
	@Autowired
	User user;

	@GetMapping(AppStringConstants.UNLOCK_ACCOUNT)
	public String showUnlockAccountForm() {

		return AppStringConstants.UNLOCK_ACCOUNTFORM;
	}

	@PostMapping(value = "/unlockAccountSubmit", consumes = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<String> handleUnlockAccountSubmit(@RequestBody User user) {
		String msg = AppStringConstants.EMPTY;
		// i have doubt here
		/*
		 * if ((usermanagementService.isTempPwdValid(user.getEmail(), tempPwd)) &&
		 * (usermanagementService.unlockAccount(email, newPwd))) {
		 * 
		 * msg = "Account unlocked, please proceed with login"; }else { msg =
		 * "Failed to Unlock"; }
		 */
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
