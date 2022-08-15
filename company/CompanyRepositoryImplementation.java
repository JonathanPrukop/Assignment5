package com.quintrix.banking.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CompanyRepositoryImplementation implements CompanyRepository {

	@Autowired
	CompanyRepository2 companyOb;
	
	@Override
	public Branch addBranch(Branch newBranch){
		return companyOb.save(newBranch);
	}
	
	@Override
	public Branch findBranchByLocation(String location){
		return companyOb.findByLocation(location);
	}
	
	@Override
	public Branch findBranchById(long id){
		return companyOb.findById(id).get();
	}
	
}