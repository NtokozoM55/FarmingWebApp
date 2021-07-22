package com.farmingapp.twilio.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmingapp.twilio.service.SmsRequest;
import com.farmingapp.twilio.service.SmsService;



@RestController
@RequestMapping("Api/v1/sms")
public class SmsController {
	
	private final SmsService smsService;
	
	
	@Autowired
	public SmsController(SmsService smsService) {
		this.smsService = smsService;
	}
	
	
	 /* sending json data
	 */ 
	/*
	@PostMapping("/send")
	public void SendSms(@Valid @RequestBody SmsRequest smsRequest) {
		smsService.sendSms(smsRequest);
	}
	*/
	
	/*sending form data
	*/
	
	
	@PostMapping("/send")
	public void SendSms(@Valid SmsRequest smsRequest) {
		smsService.sendSms(smsRequest);
	}

}
