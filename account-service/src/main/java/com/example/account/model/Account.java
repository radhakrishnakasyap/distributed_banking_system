package com.example.account.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "accounts")
public class Account {
    @Id
    private String id;
    private String customerId;
    private String accountNumber;
    private String accountType;
    private BigDecimal balance;
    private LocalDateTime createdDate;
}