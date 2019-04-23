package com.giotse.stweard.enums;

public enum EGender {
	MALE("male"), 
	FEMALE("female");
	
	private String description;

	private EGender(final String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}
	
}