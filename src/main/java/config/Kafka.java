package config;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;

import java.util.Properties;


public class Kafka {
    private Properties props = new Properties();
    private Producer<String, String> producer ;
    private KafkaConsumer<String, String> consumer;

    public Kafka(){
        this.props.put("bootstrap.servers", "localhost:9092");
    }

    public Properties getProps() {
        return this.props;
    }

    public Producer<String,String> getProducer(){
         return  this.producer;
    }

    public KafkaConsumer<String, String> getConsumer(){
        return this.consumer;
    }

    public Producer<String,String> createProducer(){
        //Set acknowledgements for producer requests.
        this.props.put("acks", "all");
        //If the request fails, the producer can automatically retry,
        this.props.put("retries", 0);
        //Specify buffer size in config
        this.props.put("batch.size", 16384);
        //Reduce the no of requests less than 0
        this.props.put("linger.ms", 1);
        //The buffer.memory controls the total amount of memory available to the producer for buffering.
        this.props.put("buffer.memory", 33554432);
        this.props.put("key.serializer",
                "org.apache.kafka.common.serialization.StringSerializer");
        this.props.put("value.serializer",
                "org.apache.kafka.common.serialization.StringSerializer");
        this.producer = new KafkaProducer
                <String, String>(this.props);
        return this.producer;
    }

    public KafkaConsumer<String, String> createConsumer(){
        this.props.put("group.id", "test");
        this.props.put("enable.auto.commit", "true");
        this.props.put("auto.offset.reset", "earliest");
        this.props.put("auto.commit.interval.ms", "1000");
        this.props.put("session.timeout.ms", "30000");
        this.props.put("key.deserializer",
                "org.apache.kafka.common.serialization.StringDeserializer");
        this.props.put("value.deserializer",
                "org.apache.kafka.common.serialization.StringDeserializer");
        this.consumer = new KafkaConsumer
                <String, String>(this.props);
        System.out.println("created consumer");
        return  this.consumer;
    }


}
