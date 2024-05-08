package controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import model.Product;

public class ProductTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("productApp.xml");
	Product p	= (Product) context.getBean("productObj");
	Map<Integer, String> map = p.getProductInfo();
	Set<Entry<Integer, String>> entries = map.entrySet();
	//Entry is an interface 
	for(Entry<Integer,String> e: entries) {
		System.out.println(e.getKey()+" "+e.getValue());
	}
	System.out.println(Arrays.toString(p.getCategegory()));
	}

}
