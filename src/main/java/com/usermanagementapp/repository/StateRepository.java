package com.usermanagementapp.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usermanagementapp.entity.State;

public interface StateRepository extends JpaRepository<State, Serializable> {
	List<State> findAllByCountryIdList(Integer countryId);

}
