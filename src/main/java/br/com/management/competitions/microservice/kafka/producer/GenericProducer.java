package br.com.management.competitions.microservice.kafka.producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.concurrent.Future;

@Service
public class GenericProducer {
    @Autowired
    private KafkaProducer<String, String> producer;

    public Future<RecordMetadata> producer(String topic, String key, String value) {
        return producer.send(new ProducerRecord<String, String>(topic, key, value));
    }
}
