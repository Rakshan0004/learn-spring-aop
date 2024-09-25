package com.rakshan.learn_spring_aop.aopexample.data;

import org.springframework.stereotype.Repository;

@Repository
public class DataService1 {
	
	
	public int[] retrieveData() {
		return new int[] {11, 33, 55, 33, 55};
	}
}
