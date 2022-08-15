package com.quintrix.banking.company;

import java.util.Set;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import com.quintrix.banking.DataModel;

@Embeddable
public class Organization extends DataModel  {

	public Set<Branch> branches;
	
}
