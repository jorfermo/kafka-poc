package com.jorfermo.kafkapoc;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
   @KafkaListener(topics = "test", groupId = "group-id")
   void listener(String data) {
      System.out.println("Received: " + data + " 👍🏽");
   }
}
