package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("Beans.xml");
		// welcome ww=(welcome)c.getBean("w1");
		// System.out.println(ww.getMsg());

//		computer comp = (computer) c.getBean("comp");
//		System.out.println(comp.getBrandName());
//		System.out.println(comp.cpu.getCpuBrand());
		
		computer p=(computer)c.getBean("compu");
		System.out.println(p.cpu.getCpuBrand());
	}

}
