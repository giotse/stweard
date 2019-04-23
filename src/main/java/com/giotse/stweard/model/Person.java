package com.giotse.stweard.model;

import java.util.List;

import com.giotse.stweard.enums.EGender;

public class Person {
	
	private Long id;
	
	private String fullName;
	
	private EGender gender;
	
	private String email;
	
	private boolean allowedEmailSend;
	
	private List<Phone> phones;

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(final String fullName) {
		this.fullName = fullName;
	}

	public EGender getGender() {
		return this.gender;
	}

	public void setGender(final EGender gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public boolean isAllowedEmailSend() {
		return this.allowedEmailSend;
	}

	public void setAllowedEmailSend(final boolean allowedEmailSend) {
		this.allowedEmailSend = allowedEmailSend;
	}

	public List<Phone> getPhones() {
		return this.phones;
	}

	public void setPhones(final List<Phone> phones) {
		this.phones = phones;
	}
		
}
