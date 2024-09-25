package com.rakshan.learn_spring_aop.aopexample.aspects;

import org.springframework.context.annotation.Configuration;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Configuration
@Aspect
public class LoggingAspect {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	//PoindCut - When?
//	"com.rakshan.learn_spring_aop.aopexample.business.*.*(..))"
	@Before("execution(* com.rakshan.learn_spring_aop.aopexample.*.*.*(..))")
	public void logMethodCallBeforeExecution(JoinPoint joinPoint) {
		logger.info("Before Aspect - {} is called with arguments: {}", joinPoint, joinPoint.getArgs());
		

	}
	
	@After("execution(* com.rakshan.learn_spring_aop.aopexample.*.*.*(..))")
	public void logMethodCallAfterExcecution(JoinPoint joinPoint) {
		logger.info("After Aspect - {} has executed", joinPoint);
	}
	
	@AfterThrowing(
			pointcut = "execution(* com.rakshan.learn_spring_aop.aopexample.*.*.*(..))",
			throwing = "exception"
			)
	public void logMethodCallAfterThrowing(JoinPoint joinPoint, Exception exception) {
		logger.info("Afterthrowing Aspect - {} has thrown an exception {}", joinPoint,  exception);
	}
	
	@AfterReturning(
			pointcut = "execution(* com.rakshan.learn_spring_aop.aopexample.*.*.*(..))",
			returning = "resultValue"
			)
	public void logMethodCallAfterSucessfulException(JoinPoint joinPoint, Object resultValue) {
		logger.info("AfterReturning Aspect - {} has returned {}", joinPoint,  resultValue);
	}
}
