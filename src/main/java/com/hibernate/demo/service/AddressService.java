package com.hibernate.demo.service;

import com.hibernate.demo.dao.AddressRepository;
import com.hibernate.demo.domain.Address;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public Iterable<Address> getAll(){
        Iterable<Address> list = addressRepository.findAll();
        return list;
    }

    public Address getById(long id){
        return addressRepository.findOne(id);
    }

    public List<Address> getByCity(String city){
        return addressRepository.findByCityIgnoreCase(city);
    }

    public List<Address> getByCountry(String country){
        return addressRepository.findByCountryIgnoreCase(country);
    }

    public void addAddress(Address address){
        addressRepository.save(address);
    }

    public void deleteAddress(long id){
        addressRepository.delete(id);
    }
}
