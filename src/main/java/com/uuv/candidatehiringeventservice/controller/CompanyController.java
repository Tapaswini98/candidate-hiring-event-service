package com.uuv.candidatehiringeventservice.controller;

import com.uuv.candidatehiringeventservice.model.Company;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {
    @GetMapping("/company")
    public List<Company> getAllAddressList(){
        return null;
    }
    @GetMapping("/company/{uuid}")
    public Company getCompanyById(@PathVariable ("uuid") String uid){
        return null;
    }
    @PostMapping("/addresses")
    public Company createCompany(@RequestBody Company company){
        return null;
    }
    @PutMapping("/addresses/{uuid}")
    public Company updateCompany(@RequestBody Company company ,@PathVariable ("uuid") String uid){
        return null;
    }
    @DeleteMapping("/addresses/{uuid}")
    public Company deleteCompany(@PathVariable("uuid") String uid){
        return null;
    }
}
