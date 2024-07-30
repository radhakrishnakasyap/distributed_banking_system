package com.example.loan.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "loans")
public class Loan {
    @Id
    private String id;
    private String customerId;
    private String loanType;
    private BigDecimal principalAmount;
    private double interestRate;
    private int durationInMonths;
    private LocalDate startDate;
    private LocalDate endDate;
}
