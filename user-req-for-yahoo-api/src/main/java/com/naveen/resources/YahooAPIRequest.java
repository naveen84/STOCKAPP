package com.naveen.resources;

import java.io.IOException;
import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.client.YahooAPIClient;
import com.naveen.model.ResponseModel;

@RestController
public class YahooAPIRequest {
	
	private static final Logger LOG = LoggerFactory.getLogger(YahooAPIRequest.class);
	@Autowired
	private YahooAPIClient yahooAPIClient;
	
	
	
	@GetMapping(value = "/market/{marketName}")
	public ResponseModel getMarketPrice(@PathVariable("marketName")String marketName) throws IOException {
		BigDecimal stockPrice = yahooAPIClient.getStock(marketName);
		LOG.info("<<STOCK PRICE >>"+ stockPrice.toString());
		return new ResponseModel(stockPrice.toString(), marketName,HttpStatus.OK.toString());
	}
	
}
