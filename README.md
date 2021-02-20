# Spring Boot with Kafka Consumer Example

This Project covers how to use Spring Boot with Spring Kafka to Consume JSON/String message from Kafka topics
## Start Zookeeper
- `bin/zookeeper-server-start.sh config/zookeeper.properties`

## Start Kafka Server
- `bin/kafka-server-start.sh config/server.properties`

## Create Kafka Topic
- `bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic account`
- `bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic transaction`

## Publish to the Kafka Topic via Console
- `bin/kafka-console-producer.sh --broker-list localhost:9092 --topic account`
- `bin/kafka-console-producer.sh --broker-list localhost:9092 --topic transaction`

## Sample Jsons:
Account
-  {"accountNumber": "abc", "lastUpdateTimestamp": "2020-01-01T01:02:03.8Z", "balance": 89.1}

Transaction
- {"accountNumber": "abc", "transactionTs": "2020-01-03T01:02:03.8Z", "type": "DEPOSIT", "amount": 89.1}
