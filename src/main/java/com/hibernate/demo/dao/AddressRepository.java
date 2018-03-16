package com.hibernate.demo.dao;

import com.hibernate.demo.domain.Address;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface AddressRepository extends CrudRepository<Address, Long> {

    List<Address> findByCityIgnoreCase(String city);
    List<Address> findByCountryIgnoreCase(String country);
}
