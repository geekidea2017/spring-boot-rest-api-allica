package com.hometask.allica.model;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@SequenceGenerator(name = "customer_sequence", sequenceName = "customer_sequence", initialValue = 5)
public class Customer {
	
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_sequence")
	private Long id;
	
	@Column 
	private String firstName;

	@Column
	private String lastName;
	
	@Column
	private Date dateOfBirth;
	

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
