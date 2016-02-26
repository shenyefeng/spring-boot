package com.test.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAdviceTest {
	static final Logger LOG = LoggerFactory.getLogger(BeforeAdviceTest.class);
	
	@Before("execution(* com.test.web.*Controller.*(..))")
	public void authority() {
		LOG.debug("aop before");
	}
}