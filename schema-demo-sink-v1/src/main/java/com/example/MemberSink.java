package com.example;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class MemberSink {
	@StreamListener(Sink.INPUT)
	public void foo(Message<Member> message) {
		System.out.println(message);
	}
}
