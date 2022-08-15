package com.quintrix.banking.transactions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Set;

@Component
public class TransactionsRepositoryImplementation implements TransactionsRepository {

	@Autowired
	TransactionsJpaRepository transactionsOb;
	
	@Override
	public Batch startBatchProcessing(){
		return transactionsOb.startBatchProcessing();
	}
	
	@Override
	public boolean submitNewTransaction(Transaction transactionToSubmit){
		if(transactionsOb.save(transactionToSubmit) != null) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public Set<Transaction> getAllPendingTransactions(Date date){
		return transactionsOb.get(date, Date);
	}
	
}