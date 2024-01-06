package com.city.cw.stockadvisor.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

import com.city.cw.stockadvisor.model.Advice;
import com.google.cloud.spring.pubsub.support.BasicAcknowledgeablePubsubMessage;
import com.google.cloud.spring.pubsub.support.GcpPubSubHeaders;

@Service
public class AdviceService {
	
	private Set<String> advices = new HashSet<>();
	
	
	public Set<Advice> getAdvices(Set<String> shares) {
		System.out.println("In getAdvices(), getting advices for " + shares);
		Set<Advice> advices = new HashSet<>();
		shares.forEach( share -> {
			Advice ad = new Advice();
			ad.setShareName(share);
			List<String> desc = new ArrayList<>();
			desc.add(share + " : Strong quarterly earnings, promising growth potential. Consider buying for mid-term investment.\"\n"
					+ "\n"
					+ "This advice provides a brief overview of the company's positive quarterly earnings and suggests considering it for a mid-term investment due to its potential growth.");
			ad.setAdviceList(desc);
			advices.add(ad);
		});
		
		return advices;
	}
	
	
	@ServiceActivator(inputChannel = "inputMessageChannel")
	public void messageReceiver(
	    String payload,
	    @Header(GcpPubSubHeaders.ORIGINAL_MESSAGE) BasicAcknowledgeablePubsubMessage message) {
		System.out.println("Message arrived via an inbound channel adapter from stock_price_1! Payload: " + payload);
		//message.ack();
		advices.add(payload);
	  
	}

}
