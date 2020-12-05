package com.tutiempolibro.customermanagement.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tutiempolibro.customermanagement.producer.SendEmail;

@Service
public class CustomerProducer {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	private ObjectMapper objectMapper = new ObjectMapper();
	
	public void sendMessage(SendEmail send) throws JsonProcessingException {
		String json = objectMapper.writeValueAsString(send);
		kafkaTemplate.send("t_customer_creation", json);
	}
}
