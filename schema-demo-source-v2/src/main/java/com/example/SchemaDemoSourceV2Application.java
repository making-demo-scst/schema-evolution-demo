package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.cloud.stream.schema.client.EnableSchemaRegistryClient;

@SpringBootApplication
@EnableSchemaRegistryClient
@EnableBinding(Source.class)
public class SchemaDemoSourceV2Application {

	public static void main(String[] args) {
		SpringApplication.run(SchemaDemoSourceV2Application.class, args);
	}
}
