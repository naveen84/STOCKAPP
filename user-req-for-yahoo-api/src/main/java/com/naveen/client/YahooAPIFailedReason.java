package com.naveen.client;

import java.io.IOException;
import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

@Component
public class YahooAPIFailedReason implements FallbackFactory<YahooAPIClient> {

	private static final Logger LOG = LoggerFactory.getLogger(YahooAPIFailedReason.class); 
	
	@Override
	public YahooAPIClient create(Throwable cause) {
		
		return new YahooAPIClient() {
			
			@Override
			public BigDecimal getStock(String name) throws IOException {
				LOG.info("<< FAIL OF MARKET NAME >>"+name);
				LOG.error("<<EXCEPTION>>"+ cause.getMessage());
				return new BigDecimal("0.0");
			}
		};
	}

	

}
