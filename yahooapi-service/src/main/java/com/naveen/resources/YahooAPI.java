package com.naveen.resources;

import java.io.IOException;
import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

@RestController
public class YahooAPI {
	private static final Logger LOG = LoggerFactory.getLogger(YahooAPI.class);
	@Autowired
	private Environment environment;
	@GetMapping(value = "/stock/{name}")
	public BigDecimal getStock(@PathVariable("name")String name) throws IOException {
		Stock stock = YahooFinance.get(name);
		LOG.info("<<PRICE>> "+ stock.getQuote().getPrice());
		LOG.info("<<SERVER PORT RESPONDED : >>"+environment.getProperty("local.server.port"));
		return stock.getQuote().getPrice();
	}
}
