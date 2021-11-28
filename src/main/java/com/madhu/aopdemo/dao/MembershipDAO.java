/**
 * 
 */
package com.madhu.aopdemo.dao;

import org.springframework.stereotype.Component;

/**
 * @author 15197
 * Create target object: MembershipDAO
 */
@Component
public class MembershipDAO {
	public void addAccount() {
		System.out.println(getClass() + ": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");
	}
	
	public void goToSleep() {
		System.out.println(getClass() + ": I'm going to sleep now...");
	}
}
