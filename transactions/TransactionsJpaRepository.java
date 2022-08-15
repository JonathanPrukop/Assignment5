package com.quintrix.banking.transactions;

import java.util.Date;
import java.util.Set;


import org.springframework.data.jpa.repository.JpaRepository;

/***
 * Please read about JPA repositories and utilize them here
 * @author drhin
 *
 */
public interface TransactionsJpaRepository extends JpaRepository {
	Batch startBatchProcessing();
}
