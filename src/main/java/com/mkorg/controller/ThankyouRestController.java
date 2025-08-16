package com.mkorg.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThankyouRestController {

	Logger logger = LoggerFactory.getLogger(ThankyouRestController.class);
	@GetMapping(value = "/thankyou")
	public String ThankyouMesg() {
		
		logger.info("----------getThankyouMsg() execution started--------");
		
		String Msg = "Thank youMesg...Client-1 MK.ORG visiting to us.................!";
		
		logger.info("----------getThankyouMsg() execution ended--------");

		return Msg;
	}
	
	@GetMapping(value = "/good")
	public String GoodMesg() {
		
		logger.info("----------getGoodMsg() execution started--------");
		
		String Msg = "GoodMesg...Client-1 MK.ORG.................!";
		
		logger.info("----------getGoodMsg() execution ended--------");

		return Msg;
	}

}
