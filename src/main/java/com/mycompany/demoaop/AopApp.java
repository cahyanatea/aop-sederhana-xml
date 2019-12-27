/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demoaop;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author okt19
 */
public class AopApp {
    
    public static void main(String[] args) {
        BasicConfigurator.configure();
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:aop.xml");
        
        SampleAdder add = (SampleAdder) context.getBean("sampleAdder");
        System.out.println("com.mycompany.demoaop.AopApp.main() " + add.add(2, 5));
    }
}
