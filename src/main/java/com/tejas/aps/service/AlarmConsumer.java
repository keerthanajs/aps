package com.tejas.aps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.tejas.aps.Consumer.AlarmService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AlarmConsumer {
	
	@Autowired
	private AlarmService alarmService;
	
	@KafkaListener(topics = "alarm-events", groupId = "alarm-consumers")
	public void consume(String alarmMessage) {
		log.info("Alarm Received: "+ alarmMessage);
		//System.out.println("Alarm Received: "+ alarmMessage);
		alarmService.processAlarm(alarmMessage);
	}
}
