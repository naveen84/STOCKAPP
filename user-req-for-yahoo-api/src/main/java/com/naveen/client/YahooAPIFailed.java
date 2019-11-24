package com.naveen.client;

import java.io.IOException;
import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class YahooAPIFailed implements YahooAPIClient{

	@Override
	public BigDecimal getStock(String name) throws IOException {
		// TODO Auto-generated method stub
		return new BigDecimal("0.0");
	}

}
