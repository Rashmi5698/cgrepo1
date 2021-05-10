package com.cg.SpringLab12;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("employee.xml");
		Employee employee=(Employee)ctx.getBean("emp");
		System.out.println(employee);
	}

}
