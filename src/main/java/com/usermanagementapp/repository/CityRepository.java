package com.usermanagementapp.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usermanagementapp.entity.City;

public interface CityRepository extends JpaRepository<City, Serializable> {
	List<City> findAllByStateIdList(Integer stateId);
}
