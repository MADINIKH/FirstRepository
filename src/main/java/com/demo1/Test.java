package com.demo1;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
 
public class Test {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r=new ClassPathResource("applicationContext.xml");
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("user.xml");
		BeanFactory b=new XmlBeanFactory(r);
		Employee e=(Employee)b.getBean("e");
		Address add=(Address) b.getBean("a1");
		add.show();
		e.show();
 
	}
 
}