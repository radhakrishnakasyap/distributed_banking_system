package com.example.loan.controller;

import com.example.loan.model.Loan;
import com.example.loan.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping
    public Loan createLoan(@RequestBody Loan loan) {
        return loanService.createLoan(loan);
    }

    @GetMapping("/{id}")
    public Loan getLoanById(@PathVariable String id) {
        return loanService.getLoanById(id);
    }
//
//    @PutMapping("/{id}")
//    public Loan updateLoan(@PathVariable String id, @RequestBody Loan loan) {
//        return loanService.updateLoan(id, loan);
//    }

    @DeleteMapping("/{id}")
    public void deleteLoan(@PathVariable String id) {
        loanService.deleteLoan(id);
    }

    @GetMapping("/customer/{customerId}")
    public List<Loan> getLoansByCustomerId(@PathVariable String customerId) {
        return loanService.getLoansByCustomerId(customerId);
    }
}
