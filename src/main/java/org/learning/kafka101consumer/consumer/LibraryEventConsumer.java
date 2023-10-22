package org.learning.kafka101consumer.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LibraryEventConsumer {

    @KafkaListener(topics = "library-events")
    public void onMessage(ConsumerRecords<?, ?> consumerRecord) throws JsonProcessingException {

        log.info("Record: {}", consumerRecord);
    }
}
