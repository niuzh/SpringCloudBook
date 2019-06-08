package com.didispace.aggregate.Sink;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;

@SpringBootApplication
public class HelloApplication {

	private static Logger logger = LoggerFactory.getLogger(HelloApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
}