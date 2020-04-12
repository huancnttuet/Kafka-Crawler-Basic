
import java.util.Scanner;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import config.Kafka;

public class SimpleProducer {
    public static void main(String[] args) throws Exception{

        //Assign topicName to string variable
        String topicName = "URL_Group";
        Kafka kafka = new Kafka();
        kafka.createProducer();
        Producer<String,String> producer = kafka.getProducer();

        while (true){
            Scanner input = new Scanner(System.in);
            System.out.println("Thêm url : ");
            String url = input.nextLine();
            if(url == "exit" || url == "quit"){
                System.out.println("Exit!!!");
                producer.close();
            }
            producer.send(new ProducerRecord<String, String>(topicName, url));
            System.out.println("Message sent successfully");
        }
    }
}