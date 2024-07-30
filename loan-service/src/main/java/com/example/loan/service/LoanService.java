package com.example.loan.service;

import com.example.loan.model.Loan;
import com.example.loan.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {

    @Autowired
    private LoanRepository loanRepository;

    public Loan createLoan(Loan loan) {
        return loanRepository.save(loan);
    }

    public Loan getLoanById(String id) {
        return loanRepository.findById(id).orElse(null);
    }

//    public Loan updateLoan(String id, Loan loan) {
//        loan.setId(id);
//        return loanRepository.save(loan);
//    }

    public void deleteLoan(String id) {
        loanRepository.deleteById(id);
    }

    public List<Loan> getLoansByCustomerId(String customerId) {
        return loanRepository.findByCustomerId(customerId);
    }
}