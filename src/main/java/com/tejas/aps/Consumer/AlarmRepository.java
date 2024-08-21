package com.tejas.aps.Consumer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlarmRepository  extends JpaRepository<Alarm, Long>{
	
}
