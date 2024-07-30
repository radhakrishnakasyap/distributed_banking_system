package com.example.account.controller;

import com.example.account.model.Account;
import com.example.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable String id) {
        return accountService.getAccountById(id);
    }

//    @PutMapping("/{id}")
//    public Account updateAccount(@PathVariable String id, @RequestBody Account account) {
//        return accountService.updateAccount(id, account);
//    }

    @DeleteMapping("/{id}")
    public void deleteAccount(@PathVariable String id) {
        accountService.deleteAccount(id);
    }

    @GetMapping("/customer/{customerId}")
    public List<Account> getAccountsByCustomerId(@PathVariable String customerId) {
        return accountService.getAccountsByCustomerId(customerId);
    }
}