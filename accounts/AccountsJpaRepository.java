package com.quintrix.banking.accounts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quintrix.banking.company.Branch;
/***
 * Please read about JPA repositories and utilize them here
 * @author drhin
 *
 */
public interface AccountsJpaRepository extends JpaRepository<Branch, Long> {
	
	public Account findById(long Id);
	public Account findByName(String name);
}
