package com.usermanagementapp.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usermanagementapp.appstringconstants.AppStringConstants;
import com.usermanagementapp.entity.City;
import com.usermanagementapp.entity.Country;
import com.usermanagementapp.entity.State;
import com.usermanagementapp.entity.User;
import com.usermanagementapp.repository.CityRepository;
import com.usermanagementapp.repository.CountryRepository;
import com.usermanagementapp.repository.StateRepository;
import com.usermanagementapp.repository.UserRepository;

import lombok.Data;

@Service
@Data
public class UserManagementServiceImpl implements UserManagementService {
	@Autowired
	private CountryRepository countryRepo;
	@Autowired
	private StateRepository stateRepo;
	@Autowired
	private CityRepository cityRepo;
	@Autowired
	private UserRepository userRepo;

	@Override
	public Map<Integer, String> findCountries() {
		Map<Integer, String> countryMap = new HashMap<Integer, String>();
		List<Country> countryList = countryRepo.findAll();
		for (Country country : countryList) {
			countryMap.put(country.getCountryId(), country.getCountryName());
		}
		return countryMap;
	}

	@Override
	public Map<Integer, String> findStates(Integer countryId) {
		Map<Integer, String> stateMap = new HashMap<Integer, String>();
		List<State> stateList = stateRepo.findAllByCountryIdList(countryId);
		for (State state : stateList) {
			stateMap.put(state.getStateId(), state.getState());
		}

		return stateMap;
	}

	@Override
	public Map<Integer, String> findCities(Integer stateId) {
		Map<Integer, String> cityMap = new HashMap<Integer, String>();
		List<City> cities = cityRepo.findAllByStateIdList(stateId);
		for (City city : cities) {
			cityMap.put(city.getCityId(), city.getCity());
		}

		return cityMap;
	}

	@Override
	public boolean isEmailUnique(String email) {
		User user = userRepo.findByEmail(email);
		if (user != null) {
			return false;
		}
		return true;

	}

	@Override
	public boolean saveUser(User user) {
		if (user != null) {
			// generate random pwd
			String password = "generaterandom_pwd";
			user.setPassword(password);
			user.setAccStatus(AppStringConstants.LOCKED);
			userRepo.save(user);
			// After inserting record send an Email to user to unlock account
			return true;
			
		}
		return false;
	}

	@Override
	public String loginCheck(String email, String pwd) {
		User user = userRepo.findByEmail(email);
		if ((user != null) && (user.getPassword() == pwd)) {
			if (user.getAccStatus() == AppStringConstants.LOCKED) {
				return AppStringConstants.ACCOUNT_LOCK;
			}
			return AppStringConstants.ACCOUNT_UNLOCK;

		}
		return AppStringConstants.CREDENTIALS_INVALID;
	}

	@Override
	public boolean isTempPwdValid(String email, String tempPwd) {
		User user = userRepo.findByEmail(email);
		return (((user!=null) && (user.getPassword() == tempPwd))?true:false);
	}

	@Override
	public boolean unlockAccount(String email, String newPwd) {
		User user = userRepo.findByEmail(email);
		if (user!=null){
			user.setAccStatus(AppStringConstants.UNLOCK);
			user.setPassword(newPwd);
			userRepo.save(user);
			return true;
		}
		
		return false;
	}

	@Override
	public String forgotPassword(String email) {
		User user = userRepo.findByEmail(email);
		if(user!=null) {
			//String password = user.getPassword();
			//Logic to send password to user through mail
			return AppStringConstants.PWD_SENTINMAIL;
		}
		
		return AppStringConstants.INVALID_EMAIL;
	}

}
