package com.example.account.service;

import com.example.account.model.Account;
import com.example.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    public Account getAccountById(String id) {
        return accountRepository.findById(id).orElse(null);
    }

//    public Account updateAccount(String id, Account account) {
//        account.setId(id);
//        return accountRepository.save(account);
//    }

    public void deleteAccount(String id) {
        accountRepository.deleteById(id);
    }

    public List<Account> getAccountsByCustomerId(String customerId) {
        return accountRepository.findByCustomerId(customerId);
    }
}