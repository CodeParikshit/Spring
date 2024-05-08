package controller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import model.Bank;

public class BankTest {
	public static void main(String[] args) {
		ApplicationContext ctx = null;
		ctx = new FileSystemXmlApplicationContext("./src/main/java/bankApp.xml");
        Bank b1	=(Bank)	ctx.getBean("bankObj1");
        Scanner sc =  new Scanner(System.in);
        System.out.println("eneter user id: ");
        String id = sc.next();
        String msg = b1.getLogin(id);
        System.out.println(msg);
        
       Bank b2 = (Bank) ctx.getBean("bankObj2");
       System.out.println("enter user id");
       String id1 = sc.next();
       String msg1 = b2.getLogin(id1);
       System.out.println(msg1);
        
	}

}
