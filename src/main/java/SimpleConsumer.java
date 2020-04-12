
import java.util.Arrays;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import config.Kafka;
import crawler.Crawler;

public class SimpleConsumer {
    public static void main(String[] args) throws Exception {

        //Kafka consumer configuration settings
        String topicName = "URL_Group";
        Kafka kafka = new Kafka();

        KafkaConsumer<String, String> consumer = kafka.createConsumer();

        //Kafka Consumer subscribes list of topics here.
        consumer.subscribe(Arrays.asList(topicName));
        //print the topic name
        System.out.println("Subscribed to topic " + topicName);
        try{
            while (true) {
                ConsumerRecords<String, String> records = consumer.poll(100);
                for (ConsumerRecord<String, String> record : records) {
                    // print the offset,key and value for the consumer records.
                    System.out.printf("offset = %d, key = %s, value = %s\n",
                            record.offset(), record.key(), record.value());
//                String url = record.value();
//                Crawler c1 = new Crawler();
//                c1.crawling(url);
                }
            }
        } finally {
            consumer.close();
        }

    }
}