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
@Table(name = AppStringConstants.STATEMASTER)
public class State {
	@Id
	@GeneratedValue
	@Column(name = AppStringConstants.STATEID)
	private Integer stateId;
	@Column(name = AppStringConstants.STATENAME)
	private String state;
	@Column(name = AppStringConstants.COUNTRYID)
	private Integer countryId;

}
