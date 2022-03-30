# Running Locally

```shell
docker-compose up -d

docker-compose exec kafka bash

kafka-topics --create --topic users --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1

```