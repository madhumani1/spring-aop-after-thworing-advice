/**
 * 
 */
package com.madhu.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.madhu.aopdemo.Account;

/**
 * @author 15197
 * Create an Aspect with @Before advice
 */

@Aspect
@Component
@Order(1)
public class MyDemoLoggingAspect {
	@AfterThrowing(pointcut="execution(* com.madhu.aopdemo.dao.AccountDAO.findAccounts(..))", throwing="e")
	public void afterThrowingFindAccountsAdvice(JoinPoint theJoinPoint, Throwable e)	{
		// print out which method we are advising on
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("\n=====>>> Executing @AfterThrowing on method: " + method);
		
		// log the exception
		System.out.println("\n=====>>> The exception is: "+e);
	}
	
	@AfterReturning(pointcut="execution(* com.madhu.aopdemo.dao.AccountDAO.findAccounts(..))", returning="result")
	public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint, List<Account> result)	{
		// printout which method we are advising on
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("\n=====>>> Executing @AfterReturning on method: " + method);
		
		// print out the results of the method call
		System.out.println("\n=====>>> result is: " + result);
		
		// let's post-process the data ... let's modify it :-)
		// convert the account names to uppercase
		//convertAccountNamesToUpperCase(result);
		
		System.out.println("\n=====>>> result is: " + result);
		
	}
	
	private void convertAccountNamesToUpperCase(List<Account> result) {
		// loop through accounts
		for (Account tempAccount : result) {
			// get uppercase version of name
			String theUpperName = tempAccount.getName().toUpperCase();
			
			// update the name on the account
			tempAccount.setName(theUpperName);
		}
	}
}
