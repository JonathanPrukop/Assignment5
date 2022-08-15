package com.quintrix.banking.accounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountsRepositoryImplementation implements AccountsRepository {
	
	@Autowired
	AccountsJpaRepository accountOb;
	
	@Override
	public Account addAccount(Account accountToAdd){
		return accountOb.save(accountToAdd);
	}
	
	@Override
	public boolean closeAccount(Account accountToClose){
		if(accountOb.delete(accountToClose)) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public boolean updateAccount(Account updatedAccount){
		if(accountOb.addAccount(updatedAccount)) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public Account findAccountByOwnerName(String name){
		return accountOb.findByName(name);
	}
	
	@Override
	public Account findAccountById(long id){
		return accountOb.findById(id);
	}
	
}