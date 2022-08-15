package com.quintrix.banking.company;

import org.springframework.data.jpa.repository.JpaRepository;
/***
 * Please read about JPA repositories and utilize them here
 * @author drhin
 *
 */
public interface CompanyRepository2 extends JpaRepository<Branch, Long>/* extends CrudRepository<Branch, Long> */ {
	public Branch findByLocation(String location);
}
