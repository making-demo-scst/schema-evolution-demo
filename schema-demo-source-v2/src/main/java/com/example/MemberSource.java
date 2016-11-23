package com.example;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberSource {
	private final Source source;
	private final AtomicInteger counter = new AtomicInteger(0);

	public MemberSource(Source source) {
		this.source = source;
	}

	@GetMapping("/")
	void foo() {
		int i = counter.incrementAndGet();
		Member m = Member.newBuilder().setName("foo" + i).setYears(20 + i)
				.setGender("male")
				.setEmails(Collections.singletonList("foo" + i + "@example.com")).build();
		System.out.println("send " + m);
		source.output().send(MessageBuilder.withPayload(m).build());
	}

}
