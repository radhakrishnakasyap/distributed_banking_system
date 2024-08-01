package com.example.common.controller;

import com.example.common.model.Address;
import com.example.common.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping
    public Address createAddress(@RequestBody Address address) {
        return addressService.createAddress(address);
    }

    @GetMapping
    public List<Address> getAllAddresses() {
        return addressService.getAllAddresses();
    }

    @GetMapping("/{id}")
    public Address getAddressById(@PathVariable String id) {
        return addressService.getAddressById(id);
    }

//    @PutMapping("/{id}")
//    public Address updateAddress(@PathVariable String id, @RequestBody Address address) {
//        return addressService.updateAddress(id, address);
//    }

    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable String id) {
        addressService.deleteAddress(id);
    }
}
