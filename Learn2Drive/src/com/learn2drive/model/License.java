package com.learn2drive.model;

import java.util.Date;

public class License {
	private String number;
	private String issueingRTO;
	private Date expiryDate;
	
	
	public License(String number, String issueingRTO, Date expiryDate) {
		super();
		this.number = number;
		this.issueingRTO = issueingRTO;
		this.expiryDate = expiryDate;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getIssueingRTO() {
		return issueingRTO;
	}
	public void setIssueingRTO(String issueingRTO) {
		this.issueingRTO = issueingRTO;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	

}
