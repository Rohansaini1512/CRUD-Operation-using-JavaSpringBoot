package com.rohan.jobApp.company;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();
    boolean updateCompany(Company company , Long id );
    boolean deleteCompany(Long id);
    void  createCompany(Company company);
    Company getCompanyById(Long id);
}
