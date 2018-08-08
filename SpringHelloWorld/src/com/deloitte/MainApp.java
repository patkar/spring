package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("Beans.xml");
		helloworld hw = (helloworld) c.getBean("helloworld");
		hw.getMessage1();
		hw.getMessage2();
		helloindia hi = (helloindia) c.getBean("helloindia");
		hi.getMessage1();
		hi.getMessage2();
		hi.getMessage3();

	}

}
