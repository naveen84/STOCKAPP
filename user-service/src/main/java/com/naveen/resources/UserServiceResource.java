package com.naveen.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.customresponse.UserResponse;
import com.naveen.dao.UserDao;
import com.naveen.model.User;

@RestController
public class UserServiceResource {
	
	private static final Logger log = LoggerFactory.getLogger(UserServiceResource.class);

	/*
	 * @Autowired private StockInfoServiceClient serviceClient;
	 */
	
	@Autowired
	private UserDao userDao;
	
	@PostMapping(value = "/user",consumes = "application/json",produces = "application/json")
	public UserResponse saveUser(@RequestBody User user) {
		userDao.save(user);
		return new UserResponse("1", "0.0", "0.0");
	}
	
	/*
	 * @GetMapping("feign/market/{marketname}/company/{companyname}") public
	 * StockInfoResponse getStockInfo(@PathVariable("marketname")String
	 * marketName,@PathVariable("companyname")String companyName) {
	 * log.debug("<< INSIDE USERSERVICERESOURCE >>"); StockInfoResponse stockInfo
	 * =serviceClient.getShareValue(marketName, companyName); return stockInfo;
	 * 
	 * }
	 */
}
