package test.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashok.service.Bookservice;

import org.springframework.context.ApplicationContext;
public class Mytest {
	
	public static void main(String[] args) {
		 ApplicationContext context=
					new ClassPathXmlApplicationContext("configxml.xml");
			Bookservice s=context.getBean(Bookservice.class);
		s.saveBook();

	}
    
}
