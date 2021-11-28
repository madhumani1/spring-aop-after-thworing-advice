/**
 * 
 */
package com.madhu.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author 15197
 * if org.aspectj.lang.annotation.Aspect does not work. 
 * close eclipse, from cmd, run <b>mvn eclipse:clean</b> and then <b>mvn eclipse:eclipse</b>
 */
@Aspect
public class MadAOPExpressions {
	@Pointcut("execution(* com.madhu.aopdemo.dao.*.*(..))")
	public void forDaoPackage() {
	}

	// create pointcut for getter methods
	@Pointcut("execution(* com.madhu.aopdemo.dao.*.get*(..))")
	public void getter() {
	}

	// create pointcut for setter methods
	@Pointcut("execution(* com.madhu.aopdemo.dao.*.set*(..))")
	public void setter() {
	}

	// create pointcut: include package ... exclude getter/setter
	@Pointcut("forDaoPackage() && !(getter()||setter())")
	// @Pointcut("forDaoPackage()")
	public void forDaoPackageNoGetterSetter() {
	}
}
