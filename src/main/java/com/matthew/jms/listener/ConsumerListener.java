package com.matthew.jms.listener;

import javax.jms.Message;
import javax.jms.MessageListener;

import org.springframework.stereotype.Component;

@Component
public class ConsumerListener implements MessageListener {

	@Override
	public void onMessage(Message arg0) {
		System.out.println("In onMessage()");

	}

}
