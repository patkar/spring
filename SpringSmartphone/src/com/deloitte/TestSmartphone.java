package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSmartphone {

	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("Beans.xml");
		smartphone sp1 = (smartphone)c.getBean("sp");
		System.out.println(sp1.getName());
		System.out.println(sp1.getPrice());
		System.out.println(sp1.apps.getName());
		System.out.println(sp1.apps.getType());
	}

}
