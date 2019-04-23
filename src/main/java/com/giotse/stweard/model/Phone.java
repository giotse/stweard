package com.giotse.stweard.model;

import com.giotse.stweard.enums.EPhoneType;

public class Phone {
	
	private String number;
	
	private EPhoneType phoneType;
	
	private boolean whatsAppEnabled;
	
	private boolean smsEnabled;

	public String getNumber() {
		return this.number;
	}

	public void setNumber(final String number) {
		this.number = number;
	}

	public EPhoneType getPhoneType() {
		return this.phoneType;
	}

	public void setPhoneType(final EPhoneType phoneType) {
		this.phoneType = phoneType;
	}

	public boolean isWhatsAppEnabled() {
		return this.whatsAppEnabled;
	}

	public void setWhatsAppEnabled(final boolean whatsAppEnabled) {
		this.whatsAppEnabled = whatsAppEnabled;
	}

	public boolean isSmsEnabled() {
		return this.smsEnabled;
	}

	public void setSmsEnabled(final boolean smsEnabled) {
		this.smsEnabled = smsEnabled;
	}	
}
