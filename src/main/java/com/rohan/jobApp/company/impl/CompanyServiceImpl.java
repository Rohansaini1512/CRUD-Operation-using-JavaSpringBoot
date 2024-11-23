package com.rohan.jobApp.company.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rohan.jobApp.company.Company;
import com.rohan.jobApp.company.CompanyRepository;
import com.rohan.jobApp.company.CompanyService;
import com.rohan.jobApp.job.Job;

@Service
public class CompanyServiceImpl implements CompanyService{
    public CompanyServiceImpl(CompanyRepository companyRepository){
    }

    @Override
    public List<Company> getAllCompanies() {
        return null;
    }

    @Override
    public boolean updateCompany(Company company, Long id) {
        Optional<Job> companyOptional = companyRepository.findById(id);
        if(companyOptional.isPresent()){
            Company companyToUpdate = companyOptional.get();
            companyToUpdate.setDescription(company.getDescription());
            companyToUpdate.setName(company.getName());
            companyToUpdate.setJobs(company.getJobs());
            companyRepository.save(companyToUpdate);
            return true;
            }else{
                return false;
            }
        
    }

}
