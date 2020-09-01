package com.example.restwithredis.queue;

public interface MessagePublisher {
    void publish(final String message);
}