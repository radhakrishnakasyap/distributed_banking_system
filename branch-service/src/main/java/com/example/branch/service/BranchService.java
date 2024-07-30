package com.example.branch.service;

import com.example.branch.model.Branch;
import com.example.branch.repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchService {

    @Autowired
    private BranchRepository branchRepository;

    public Branch createBranch(Branch branch) {
        return branchRepository.save(branch);
    }

    public Branch getBranchById(String id) {
        return branchRepository.findById(id).orElse(null);
    }

//    public Branch updateBranch(String id, Branch branch) {
//        branch.setId(id);
//        return branchRepository.save(branch);
//    }

    public void deleteBranch(String id) {
        branchRepository.deleteById(id);
    }

    public List<Branch> getAllBranches() {
        return branchRepository.findAll();
    }
}
