package controller;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.List;

import model.Customer;

public class CustomerApp {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("FirstApp.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
	Customer c	= (Customer) factory.getBean("customerObj1");
	System.out.println(c);
	System.out.println(c.hashCode());
	
	Customer c1	= (Customer) factory.getBean("customerObj1");
	Scanner sc = new Scanner(System.in);
	
	System.out.println("print the customer id: ");
	long id = Long.parseLong(sc.next());
	
	System.out.println("print the customer name: ");
	String name = sc.next();
	
	System.out.println("print the customer email: ");
	String email = sc.next();
	
	System.out.println("print the customer phone: ");
	long ph = sc.nextLong();
	

	c1.setCustomerId(id);
	c1.setCustomerName(name);
	c1.setCustomerEmail(email);
	java.util.List<Long> listOfPhone = new ArrayList();
	listOfPhone.add(1234L);
	listOfPhone.add(45345L);
	listOfPhone.add(543213L);
	listOfPhone.add(65846L);

	c1.setCustomerPhone(listOfPhone);
	
	System.out.println(c1);
	System.out.println(c1.hashCode());
	sc.close();
	
	
	}

}
