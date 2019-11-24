/*
 * package com.naveen.restclient;
 * 
 * import org.springframework.cloud.netflix.ribbon.RibbonAutoConfiguration;
 * import org.springframework.cloud.netflix.ribbon.RibbonClient; import
 * org.springframework.cloud.openfeign.FeignClient; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable;
 * 
 * 
 * 
 * //@FeignClient(name = "stock-info-service" , url = "localhost:2011"
 * ,decode404 = true)
 * 
 * @FeignClient(name = "stock-info-service")
 * 
 * @RibbonClient(name = "stock-info-service")//,configuration =
 * RibbonAutoConfiguration.class) public interface StockInfoServiceClient {
 * 
 * @GetMapping("/stock-info-service/market/{marketname}/company/{companyname}")
 * public StockInfoResponse getShareValue(@PathVariable("marketname")String
 * marketName,@PathVariable("companyname")String companyName); }
 */