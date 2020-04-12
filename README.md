# KAFKA (Bài tập Crawl Website môn Kiến trúc dịch vụ)

## Kafka 2.12-2.4.1
## Java Code 
## IntelliJ


1. Cài và chạy Kafka :
   [Link tải cài và chạy kafka](https://kafka.apache.org/quickstart)

   `On Window`

   + Giải nén `kafka_2.12-2.4.1.tgz` trong project
   + `cd kafka_2.12-2.4.1/bin/windows` 
   + Chạy server (chạy song song 2 cmd):
	
      .../kafka_2.12-2.4.1/bin/windows>`zookeeper-server-start.bat config/zookeeper.properties`
   
      .../kafka_2.12-2.4.1/bin/windows>`kafka-server-start.bat config/server.properties`

2. Tạo Producer và đẩy message lên topic:
	
	Chạy file `SimpleProducer.java`

3. Tạo Consumer và lấy message từ topic:
	
	Chạy file `SimpleConsumer.java`
