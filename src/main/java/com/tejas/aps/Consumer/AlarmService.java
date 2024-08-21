package com.tejas.aps.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlarmService {
	
	@Autowired
	private AlarmRepository alarmRepository;
	
	public void processAlarm(String alarmMessage) {
		Alarm alarm = new Alarm();
		alarm.setMessage(alarmMessage);
		alarm.setAcknowledged(false);
		alarmRepository.save(alarm);
	}
	
	public void acknowledgeAlarm(Long alarmId) {
		Alarm alarm = alarmRepository.findById(alarmId).orElseThrow();
        alarm.setAcknowledged(true);
        alarmRepository.save(alarm);
	}
}
