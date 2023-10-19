package com.mtr.springbootcamelactiveMQ;
import javax.annotation.PostConstruct;

import org.apache.camel.CamelContext;
import org.apache.camel.component.activemq.ActiveMQComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SpringbootCamelActiveMqApplication {

	@Autowired
	private CamelContext context;

	@PostConstruct
	public void init() throws Exception {
		context.addComponent("activemq", ActiveMQComponent.activeMQComponent("tcp://localhost:61616"));
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCamelActiveMqApplication.class, args);
	}

}
