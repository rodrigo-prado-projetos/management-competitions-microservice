package br.com.management.competitions.microservice.kafka.producer;

import com.google.gson.Gson;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

@Service
public class GenericProducer {
    @Autowired
    private KafkaProducer<String, String> producer;
    @Value("${spring.kafka.topic.customer}")
    private String topic;

    public Future<RecordMetadata> producer(Object value) {
        return producer.send(new ProducerRecord<String, String>(topic, new Gson().toJson(value)));
    }
}
