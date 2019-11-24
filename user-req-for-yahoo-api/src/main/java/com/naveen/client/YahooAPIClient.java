package com.naveen.client;

import java.io.IOException;
import java.math.BigDecimal;

import org.springframework.cloud.netflix.ribbon.RibbonAutoConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "yahooapi-service",fallbackFactory = YahooAPIFailedReason.class)
@FeignClient(name = "zuulapigatewayserver",fallbackFactory = YahooAPIFailedReason.class)
@RibbonClient(name = "yahooapi-service",configuration =RibbonAutoConfiguration.class)
public interface YahooAPIClient {	
	@GetMapping(value = "/yahooapi-service/stock/{name}")
	public BigDecimal getStock(@PathVariable(value="name")String name) throws IOException;
}
