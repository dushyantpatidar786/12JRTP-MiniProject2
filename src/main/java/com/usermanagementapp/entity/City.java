package com.usermanagementapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.usermanagementapp.appstringconstants.AppStringConstants;

import lombok.Data;

@Data
@Entity
@Table(name = AppStringConstants.CITYMASTER)
public class City {
	@Id
	@GeneratedValue
	@Column(name = AppStringConstants.CITYID)
	private Integer cityId;
	@Column(name = AppStringConstants.CITYNAME)
	private String city;
	@Column(name = AppStringConstants.STATEID)
	private Integer stateId;

}
