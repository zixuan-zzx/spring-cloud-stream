kafka-topics --create --topic users --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1

kafka-console-producer --broker-list localhost:9092 --topic users

kafka-console-consumer --bootstrap-server localhost:9092 --topic users --from-beginning