// package com.example; https://github.com/spring-cloud/spring-cloud-stream/issues/686
package org.springframework.cloud.stream.schema.server;

import org.apache.catalina.filters.RequestDumperFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableSchemaRegistryServer
public class SchemaRegistryApplication {

	@Bean
	RequestDumperFilter dumperFilter() {
		return new RequestDumperFilter();
	}

	public static void main(String[] args) {
		SpringApplication.run(SchemaRegistryApplication.class, args);
	}
}
