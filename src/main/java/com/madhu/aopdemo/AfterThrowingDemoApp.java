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
public class AfterThrowingDemoApp {
	public static void main(String[] args)	{
		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		// call method to find accounts
		theAccountDAO.findAccounts();
		List<Account> theAccounts = null;
		try {
			// call method to find the accounts
			theAccounts = theAccountDAO.findAccounts();
		
		} catch (Exception e) {
			System.out.println("\n\nMain Program ... caught exception: " + e);
		}
		// display the accounts
		System.out.println("\n\nMain Program: AfterReturningDemoApp");
		System.out.println("----");
		
		//System.out.println(theAccounts);
		
		//close context
		context.close();
	}
}
