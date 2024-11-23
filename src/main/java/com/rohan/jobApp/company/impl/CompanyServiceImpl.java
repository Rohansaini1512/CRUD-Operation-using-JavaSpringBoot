package com.rohan.jobApp.company.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rohan.jobApp.company.Company;
import com.rohan.jobApp.company.CompanyRepository;
import com.rohan.jobApp.company.CompanyService;
// import com.rohan.jobApp.job.Job;

@Service
public class CompanyServiceImpl implements CompanyService{
    private CompanyRepository companyRepository;
    public CompanyServiceImpl(CompanyRepository companyRepository){
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public boolean updateCompany(Long id ,Company company) {
        Optional<Company> companyOptional = companyRepository.findById(id);
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

    @Override
    public void createCompany(Company company) {
        companyRepository.save(company);
    }

}
