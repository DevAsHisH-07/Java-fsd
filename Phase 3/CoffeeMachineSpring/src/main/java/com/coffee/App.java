package com.coffee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac=new ClassPathXmlApplicationContext("coffee.xml");
    	
    	Capacinoo cap=ac.getBean(Capacinoo.class);
    	cap.rateOfCoffee();
    	cap.typeOfCoffee();
    	System.out.println(cap.getCream());
    	
    	Xpressoo xp=ac.getBean(Xpressoo.class);
    	xp.rateOfCoffee();
    	xp.typeOfCoffee();
    	System.out.println(xp.getCream());
    	
    	
    }
}
