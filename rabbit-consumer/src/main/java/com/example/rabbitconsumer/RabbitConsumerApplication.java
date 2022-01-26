package com.example.rabbitconsumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
@Slf4j
public class RabbitConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitConsumerApplication.class, args);
    }


    @Bean("input1")
    Consumer<String> input1() {
        return s -> log.info("Listener1: " + s);
    }

    @Bean("input2")
    Consumer<String> input2() {
        return s -> log.info("Listener2: " + s);
    }

    @Bean("input3")
    Consumer<String> input3() {
        return s -> log.info("Listener3: " + s);
    }
}
