package com.naveen.model;


public class RequestModel {
	
	private String userId;
	private String marketName;
	
	public RequestModel() {
		super();
	}

	public RequestModel(String userId, String marketName) {
		super();
		this.userId = userId;
		this.marketName = marketName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMarketName() {
		return marketName;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}

	@Override
	public String toString() {
		return "RequestModel [userId=" + userId + ", marketName=" + marketName + "]";
	}
	
	
}
