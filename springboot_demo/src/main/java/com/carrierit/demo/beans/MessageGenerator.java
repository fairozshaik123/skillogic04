package com.carrierit.demo.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("msgenerator")
public class MessageGenerator {

	@Autowired
	private LocalDateTime localDateTime;
	
	public String getWishMessage(String name) {
		int hours=localDateTime.getHour();
		if(hours>=20) {
			return "Mr/Miss "+name+" ,Good Night";
		}else if(hours<20 && hours>=17) {
			return "Mr/Miss "+name+" ,Good Evening";
		}else if(hours<17 && hours>=12) {
			return "Mr/Miss "+name+" ,Good Afternoon";
		}else {
			return "Mr/Miss "+name+" ,Good Morning";
		}
	}
}
