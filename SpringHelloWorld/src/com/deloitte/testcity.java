package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testcity {

	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("collectionexample.xml");
		collectionexample ce=(collectionexample)c.getBean("collectionexample");
		ce.getCityList();
		ce.getCityMap();
		ce.getCitySetl();
		ce.getCityProp();
	}

}
