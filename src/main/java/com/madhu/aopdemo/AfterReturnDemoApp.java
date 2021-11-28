/**
 * 
 */
package com.madhu.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.madhu.aopdemo.dao.AccountDAO;
import com.madhu.aopdemo.dao.MembershipDAO;

/**
 * @author 15197
 * Create main app
 */
public class AfterReturnDemoApp {
	public static void main(String[] args)	{
		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		// call method to find accounts
		theAccountDAO.findAccounts();
		
		// call method to find the accounts
		List<Account> theAccounts = theAccountDAO.findAccounts();
		
		// display the accounts
		System.out.println("\n\nMain Program: AfterReturningDemoApp");
		System.out.println("----");
		
		System.out.println(theAccounts);
		
		//close context
		context.close();
	}
}
