# Spring Boot Kafka Demo

A simple Kafka project built with Spring Boot to understand core Kafka concepts:

- Kafka Producer
- Kafka Consumer
- Kafka Topics
- Partitions
- Offsets
- Consumer Groups
- JSON Message Serialization
- REST API Integration

## Flow

Postman → Spring Boot Controller → Kafka Producer → Kafka Topic → Kafka Consumer

## Technologies

- Java 17
- Spring Boot 3.5
- Apache Kafka
- Docker
- Maven

## API

### Send Order

POST /orders

```json
{
  "orderId": "1001",
  "productName": "Laptop",
  "quantity": 2
}
