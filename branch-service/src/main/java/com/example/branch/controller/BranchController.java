package com.example.branch.controller;

import com.example.branch.model.Branch;
import com.example.branch.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/branches")
public class BranchController {

    @Autowired
    private BranchService branchService;

    @PostMapping
    public Branch createBranch(@RequestBody Branch branch) {
        return branchService.createBranch(branch);
    }

    @GetMapping("/{id}")
    public Branch getBranchById(@PathVariable String id) {
        return branchService.getBranchById(id);
    }

//    @PutMapping("/{id}")
//    public Branch updateBranch(@PathVariable String id, @RequestBody Branch branch) {
//        return branchService.updateBranch(id, branch);
//    }

    @DeleteMapping("/{id}")
    public void deleteBranch(@PathVariable String id) {
        branchService.deleteBranch(id);
    }

    @GetMapping
    public List<Branch> getAllBranches() {
        return branchService.getAllBranches();
    }
}
