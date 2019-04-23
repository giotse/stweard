package com.giotse.stweard.enums;

public enum EPhoneType {
	CELLPHONE("cellphone"),
	HOMEPHONE("homephone"),
	WORKPHONE("workphone");
	
	private String type;

	private EPhoneType(final String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public void setType(final String type) {
		this.type = type;
	}
		
}
