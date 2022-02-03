# kafka POC

Launch kafka + zookeeper locally

```bash
docker compose up
```

Reading events from kafka topic `test` on cli

```bash
brew install kafka
kafka-console-consumer --bootstrap-server localhost:29092 --topic test --from-beginning
```
