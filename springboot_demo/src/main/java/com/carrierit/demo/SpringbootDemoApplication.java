package com.carrierit.demo;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.carrierit.demo.beans.MessageGenerator;

@SpringBootApplication
public class SpringbootDemoApplication {

	@Bean
	public LocalDateTime localDateTime() {
		return LocalDateTime.now();
	}
	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringbootDemoApplication.class, args);
		MessageGenerator msg=ctx.getBean("msgenerator",MessageGenerator.class);
		String message=msg.getWishMessage("Raja");
		System.out.println(message);
	}
}
