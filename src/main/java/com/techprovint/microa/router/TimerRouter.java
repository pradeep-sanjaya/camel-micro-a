package com.techprovint.microa.router;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

//@Component
public class TimerRouter extends RouteBuilder {

    @Autowired
    CurrentTime currentTime;

    @Autowired
    MessageProcessor processor;

    @Override
    public void configure() throws Exception {
        from("timer:timer-a")
            .log("After timer: ${body}")
            //.transform().constant(LocalDateTime.now())
            //.bean("currentTime")
            .bean(currentTime)
            .log("After current time: ${body}")
            .process(processor)
            .to("log:log-a");
    }
}

@Component
class CurrentTime {
    public String getCurrentTime() {
        return "CurrentTime: " + LocalDateTime.now().toString();
    }
}

@Component
class MessageProcessor implements Processor {

    Logger logger = LoggerFactory.getLogger(MessageProcessor.class);

    @Override
    public void process(Exchange exchange) throws Exception {
        logger.info("MessageProcessor: {}", exchange.getMessage().getBody().toString());
    }
}
