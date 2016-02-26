package com.test.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
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
	public void authority(JoinPoint point) {
		LOG.debug("@Before：模拟权限检查...");
		LOG.debug(
				"@Before：目标方法为：" + point.getSignature().getDeclaringTypeName() + "." + point.getSignature().getName());
		LOG.debug("@Before：参数为：" + Arrays.toString(point.getArgs()));
		LOG.debug("@Before：被织入的目标对象为：" + point.getTarget());
	}

	@After("execution(* com.test.web.*Controller.*(..))")
	public void releaseResource(JoinPoint point) {
		LOG.debug("@After：模拟释放资源...");
		LOG.debug("@After：目标方法为：" + point.getSignature().getDeclaringTypeName() + "." + point.getSignature().getName());
		LOG.debug("@After：参数为：" + Arrays.toString(point.getArgs()));
		LOG.debug("@After：被织入的目标对象为：" + point.getTarget());
	}

//	@Around("execution(* com.test.web.*Controller.*(..))")
//	public Object process(ProceedingJoinPoint point) throws Throwable {
//		LOG.debug("@Around：执行目标方法之前...");
//		// 访问目标方法的参数：
//		Object[] args = point.getArgs();
//		if (args != null && args.length > 0 && args[0].getClass() == String.class) {
//			args[0] = "改变后的参数1";
//		}
//		// 用改变后的参数执行目标方法
//		Object returnValue = point.proceed(args);
//		LOG.debug("@Around：执行目标方法之后...");
//		LOG.debug("@Around：被织入的目标对象为：" + point.getTarget());
//		return "原返回值：" + returnValue + "，这是返回结果的后缀";
//	}

//	@AfterReturning(pointcut = "execution(* com.test.web.*Controller.*(..))", returning = "returnValue")
//	public void log(JoinPoint point, Object returnValue) {
//		LOG.debug("@AfterReturning：模拟日志记录功能...");
//		LOG.debug("@AfterReturning：目标方法为：" + point.getSignature().getDeclaringTypeName() + "."
//				+ point.getSignature().getName());
//		LOG.debug("@AfterReturning：参数为：" + Arrays.toString(point.getArgs()));
//		LOG.debug("@AfterReturning：返回值为：" + returnValue);
//		LOG.debug("@AfterReturning：被织入的目标对象为：" + point.getTarget());
//
//	}
}