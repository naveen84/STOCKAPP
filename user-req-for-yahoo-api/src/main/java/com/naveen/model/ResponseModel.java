package com.naveen.model;

public class ResponseModel {
	
	private String stockPrice;
	private String marketName;
	private String msg;
	
	public ResponseModel() {
		super();
	}
	
	public ResponseModel(String stockPrice, String marketName, String msg) {
		super();
		this.stockPrice = stockPrice;
		this.marketName = marketName;
		this.msg = msg;
	}

	public ResponseModel(String msg) {
		this.msg = msg;
	}

	public ResponseModel(String stockPrice, String marketName) {
		super();
		this.stockPrice = stockPrice;
		this.marketName = marketName;
	}

	public String getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(String stockPrice) {
		this.stockPrice = stockPrice;
	}

	public String getMarketName() {
		return marketName;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "ResponseModel [stockPrice=" + stockPrice + ", marketName=" + marketName + ", msg=" + msg + "]";
	}

	
	
	
}
