package com.test.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	static final Logger LOG = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		LOG.trace("Hello World!");
		LOG.debug("How are you today?");
		LOG.info("I am fine.");
		LOG.warn("I love programming.");
		LOG.error("I am programming.");
		return "Hello World!";
	}

	@RequestMapping("/hello")
	public String hello(Map<String, Object> model) {
		List<String> l = new ArrayList<String>();
		l.add("hadoop");
		l.add("hbase");
		l.add("hive");
		l.add("pig");
		l.add("zookeeper");
		model.put("data", l);
		
		LOG.trace("Hello World!");
		LOG.debug("How are you today?");
		LOG.info("I am fine.");
		LOG.warn("I love programming.");
		LOG.error("I am programming.");
		
		return "hello";
	}

	@RequestMapping("/type1")
	public String hello2(Map<String, Object> model) {
		List<String> l = new ArrayList<String>();
		l.add("hadoop");
		l.add("hbase");
		l.add("hive");
		l.add("pig");
		l.add("zookeeper");
		model.put("data", l);
		
		LOG.trace("Hello World!");
		LOG.debug("How are you today?");
		LOG.info("I am fine.");
		LOG.warn("I love programming.");
		LOG.error("I am programming.");
		
		return "type1/type1";
	}
}