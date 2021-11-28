/**
 * 
 */
package com.madhu.aopdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author 15197
 * Create Spring Java Config class
 * @Configuration - Pure Java Configuration
 * @EnableAspectJAutoProxy - Spring AOP Proxy support
 * @ComponentScan - Component scan for components and aspects - Recurse packages
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.madhu.aopdemo")
public class DemoConfig {

}
