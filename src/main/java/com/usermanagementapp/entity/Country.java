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
@Table(name = AppStringConstants.COUNTRYMASTER)
public class Country {
	@Id
	@GeneratedValue
	@Column(name = AppStringConstants.COUNTRYID)
	private Integer countryId;
	@Column(name = AppStringConstants.COUNTRYNAME)
	private String countryName;

}
