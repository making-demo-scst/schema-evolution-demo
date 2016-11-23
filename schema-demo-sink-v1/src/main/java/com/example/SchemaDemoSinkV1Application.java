package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.schema.client.EnableSchemaRegistryClient;

@SpringBootApplication
@EnableBinding(Sink.class)
@EnableSchemaRegistryClient
public class SchemaDemoSinkV1Application {

	public static void main(String[] args) {
		SpringApplication.run(SchemaDemoSinkV1Application.class, args);
	}
}
