package com.psl.main;

public class BankAccount implements Comparable<BankAccount>{
	private String fullName,accountNo;
	private double ammount;
	
	public BankAccount(String accountNo, double ammount) {
		super();
		this.accountNo = accountNo;
		this.ammount = ammount;
	}
	
	

	public BankAccount(String fullName, String accountNo, double ammount) {
		this(accountNo,ammount);
		this.fullName = fullName;
		
	}



	public BankAccount() {
		this.fullName=null;
		this.accountNo=null;
		this.ammount=0.0;
	}



	public String getFullName() {
		return fullName;
	}



	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	public String getAccountNo() {
		return accountNo;
	}



	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}



	public double getAmmount() {
		return ammount;
	}



	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}



	


	@Override
	public String toString() {
		return "BankAccount [fullName=" + fullName + ", accountNo=" + accountNo
				+ ", ammount=" + ammount + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((accountNo == null) ? 0 : accountNo.hashCode());
	
		result = prime * result;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (accountNo == null) {
			if (other.accountNo != null)
				return false;
		} else if (!accountNo.equals(other.accountNo))
			return false;
//		if (Double.doubleToLongBits(ammount) != Double
//				.doubleToLongBits(other.ammount))
//			return false;
		return true;
	}



	@Override
	public int compareTo(BankAccount ba) {
		if(getAmmount() < ba.getAmmount())
			return -1;
		else if(getAmmount() > ba.getAmmount())
			return 1;
		else
			return getFullName().compareTo(ba.getFullName());
	}
	
	
	
	
}
