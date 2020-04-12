# KAFKA (Bài tập Crawl Website môn Kiến trúc dịch vụ)

## Java Code 
## Kafka 2.12-2.4.1	
1. Cài và chạy Kafka :
[I'm an inline-style link](https://www.google.com)
   [a link](https://kafka.apache.org/quickstart)	
###On Win:
	+ Giải nén file `kafka_2.12-2.4.1.tgz` trong thư mục
	+ `cd kafka_2.12-2.4.1`
	+ `cd bin\windows`
	+ Chạy server :(chạy song song 2 cmd)
		`zookeeper-server-start.bat config/zookeeper.properties`
		`kafka-server-start.bat config/server.properties`

2. Tạo Producer và đẩy message lên topic:
    Chạy file `SimpleProducer.java`

3. Tạo Consumer và lấy message từ topic: 
	Chạy file `SimpleConsumer.java`
