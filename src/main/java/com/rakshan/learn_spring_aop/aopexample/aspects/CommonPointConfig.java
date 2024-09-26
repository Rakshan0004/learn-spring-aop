package com.rakshan.learn_spring_aop.aopexample.aspects;

import org.aspectj.lang.annotation.Pointcut;


public class CommonPointConfig {
	
	@Pointcut("execution(* com.rakshan.learn_spring_aop.aopexample.*.*.*(..))")
	public void businessAndDataPackageConfig() {
		
	}
	
	@Pointcut("execution(* com.rakshan.learn_spring_aop.aopexample.business.*.*(..))")
	public void businessPackageConfig() {
		
	}
	
	@Pointcut("execution(* com.rakshan.learn_spring_aop.aopexample.data.*.*(..))")
	public void DataPackageConfig() {
		
	}
	
	@Pointcut("bean(*Service*)")
	public void allPackageConfigUsingBean() {}
	
	@Pointcut("@annotation(com.rakshan.learn_spring_aop.aopexample.annotations.TrackTime)")
	public void trackTimeAnnotation() {}
}
