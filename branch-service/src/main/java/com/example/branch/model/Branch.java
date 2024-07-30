package com.example.branch.model;

import com.example.common.model.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "branches")
public class Branch {
    @Id
    private String id;
    private String branchName;
    private Address address;
    private String phoneNumber;
}
