package com.example.common.service;

import com.example.common.model.Address;
import com.example.common.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    public Address getAddressById(String id) {
        Optional<Address> address = addressRepository.findById(id);
        return address.orElse(null);
    }

//    public Address updateAddress(String id, Address address) {
//        if (addressRepository.existsById(id)) {
//            address.setId(id);
//            return addressRepository.save(address);
//        }
//        return null;
//    }

    public void deleteAddress(String id) {
        addressRepository.deleteById(id);
    }
}
