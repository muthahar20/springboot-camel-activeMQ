package com.mtr.springbootcamelactiveMQ.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class OrderAnswerRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("activemq:queue:orders").
        	log("Pattern: ${exchange.pattern}").
        end();
    }

}