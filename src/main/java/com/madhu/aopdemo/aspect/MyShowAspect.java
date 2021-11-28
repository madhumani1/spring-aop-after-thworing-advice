/**
 * 
 */
package com.madhu.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 15197
 * Create an Aspect with @Before advice
 */

@Aspect
@Component
@Order(5)
public class MyShowAspect {
	// this is where we will add all of our related advices for logging
	
	@Before("com.madhu.aopdemo.aspect.MadAOPExpressions.forDaoPackageNoGetterSetter()")
	public void performApiAnalytics() {
		System.out.println("\n=====>>> SHOW");			
	}
}
