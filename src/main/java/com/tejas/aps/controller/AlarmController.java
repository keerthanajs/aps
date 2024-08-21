package com.tejas.aps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tejas.aps.service.AlarmProducer;

@RestController("/api")
public class AlarmController {
	
	@Autowired
	private AlarmProducer alarmProducer;
	
	@GetMapping("/sendAlarm")
	public void sendAlarm(@RequestParam("message") String message) {
		alarmProducer.sendAlarm(message);
		//return "ALarm sent: " + message;
	}
}
