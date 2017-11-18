package com.backend.service.utils.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Date;

/**
 * Created by Ankit Bhatia on 11/18/17.
 */
public class JacksonObjectMapperFactory {

	private static final JacksonObjectMapperFactory _instance = new JacksonObjectMapperFactory();
	
	public static JacksonObjectMapperFactory createFactory() {
		return _instance;
	}

	public ObjectMapper getObjectMapper() {
		
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		
		return objectMapper;
	}

	public static void main(String[] args) {
		JacksonObjectMapperFactory f = JacksonObjectMapperFactory.createFactory();
		try {
			System.out.println(f.getObjectMapper().writeValueAsString(new Date()));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
