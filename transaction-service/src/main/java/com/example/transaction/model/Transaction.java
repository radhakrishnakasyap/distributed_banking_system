package com.example.transaction.model;

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
@Document(collection = "transactions")
public class Transaction {
    @Id
    private String id;
    private String accountId;
    private String transactionType;
    private BigDecimal amount;
    private LocalDateTime transactionDate;
    private String description;
}
