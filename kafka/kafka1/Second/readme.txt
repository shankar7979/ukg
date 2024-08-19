C:\kafka_2.12-3.8.0\bin\windows>start zookeeper-server-start.bat  ..\..\config\zookeeper.properties

C:\kafka_2.12-3.8.0\bin\windows>start kafka-server-start.bat ..\..\config\server.properties

C:\kafka_2.12-3.8.0\bin\windows>kafka-console-consumer.bat  --bootstrap-server localhost:9092 --topic NewTopic --from-beginning


C:\kafka_2.12-3.8.0\bin\windows>kafka-console-consumer.bat  --bootstrap-server localhost:9092 --topic ukg-topic --from-b
eginning

http://localhost:8080/kafka/producer?message=welcome india
http://localhost:8080/kafka
