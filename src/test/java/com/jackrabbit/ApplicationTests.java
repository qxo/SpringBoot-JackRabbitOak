package com.jackrabbit;

import javax.jcr.Repository;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jackrabbit.service.JackRabbitService;

@SpringBootTest
public class ApplicationTests {
	/**
	* Logger for this class.
	*/
	private static final Logger LOG = LoggerFactory.getLogger(ApplicationTests.class);
	
	@Autowired Repository repository;
	@Autowired JackRabbitService service;

	@Test
	public void contextLoads() {
		LOG.info("repository={}", repository);
		LOG.info("service={}", service);
		System.out.println("done.");
		//Assert.assertTrue(false);
	}

}
