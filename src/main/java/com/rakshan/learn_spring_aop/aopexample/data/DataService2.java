package com.rakshan.learn_spring_aop.aopexample.data;

import org.springframework.stereotype.Repository;

@Repository
public class DataService2 {
	
	
	public int[] retrieveData() {
		return new int[] {111, 333, 555, 343, 555};
	}
}
