package com.example.kafka.consumer;

import com.example.kafka.dto.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    @KafkaListener(
            topics = "orders",
            groupId = "order-group"
    )
    public void consume(Order order) {

        System.out.println("Received Order");

        System.out.println(
                order.getOrderId()
                        + " "
                        + order.getProductName()
        );
    }
}