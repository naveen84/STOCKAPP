package com.naveen.customresponse;

public class UserResponse {
	
	private String accountNum;
	private String totalBal;
	private String totalInvested;
	public UserResponse(String accountNum, String totalBal, String totalInvested) {
		super();
		this.accountNum = accountNum;
		this.totalBal = totalBal;
		this.totalInvested = totalInvested;
	}
	public UserResponse() {
		super();
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getTotalBal() {
		return totalBal;
	}
	public void setTotalBal(String totalBal) {
		this.totalBal = totalBal;
	}
	public String getTotalInvested() {
		return totalInvested;
	}
	public void setTotalInvested(String totalInvested) {
		this.totalInvested = totalInvested;
	}
	@Override
	public String toString() {
		return "UserResponse [accountNum=" + accountNum + ", totalBal=" + totalBal + ", totalInvested=" + totalInvested
				+ "]";
	}
	
}
