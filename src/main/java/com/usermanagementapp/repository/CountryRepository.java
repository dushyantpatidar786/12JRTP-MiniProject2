package com.usermanagementapp.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usermanagementapp.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Serializable> {

}
