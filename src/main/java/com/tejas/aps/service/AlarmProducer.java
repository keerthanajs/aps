package com.tejas.aps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class AlarmProducer {
	public static final String TOPIC ="alarm-events";
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendAlarm(String alarmMessage) {
		kafkaTemplate.send(TOPIC, alarmMessage);
	}
}
