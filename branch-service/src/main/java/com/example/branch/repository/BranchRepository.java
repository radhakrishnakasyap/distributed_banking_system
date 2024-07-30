package com.example.branch.repository;

import com.example.branch.model.Branch;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends MongoRepository<Branch, String> {
}