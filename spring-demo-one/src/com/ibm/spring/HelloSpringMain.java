package com.ibm.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrive bean from spring container
		Coach theCoach=context.getBean("myCoach",Coach.class);
		
		//call methods on bean
		System.out.println(theCoach.getDailyWorkOut());
		
		//close container
		context.close();

	}

}
