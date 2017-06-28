// http://www.codejava.net/frameworks/spring/creating-a-spring-mvc-project-using-maven-and-eclipse-in-one-minute
package com.matthew.jms.listener;

/* JMS is not a MOM (Message-oriented middleware) 
 * JMS API can connect different provider, ActiveMQ, TIBCO, WebsphereMQ, SonicMQ
 */
import javax.jms.Message;
import javax.jms.MessageListener;

import org.springframework.stereotype.Component;

//JMS consumer - a client application that receives and processes JMS messages
@Component
public class ConsumerListener implements MessageListener {

	@Override
	public void onMessage(Message arg0) {
		System.out.println("In onMessage()");

	}

}
