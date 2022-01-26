package com.example.rabbitproducer;

import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class ProducerController {

    private final StreamBridge streamBridge;

    public ProducerController(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }

    @GetMapping
    public String produceMessage(){
        streamBridge.send("myOutputBinding", "Sent");
        return "success";
    }
}
