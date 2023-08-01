package org.springframework.spring_context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.spring_context.config.AppConfig;



public class App 
{
    public static void main( String[] args )
    {
    	  //ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
    	AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext(AppConfig.class);
          Citizen c = container.getBean(Citizen.class);
          System.out.println("sno:"+c.getSno()+"\n"+"Name :"+c.getName()+"\n"+"Age :"+c.getAge());
          System.out.println("Aadharno : "+c.getAadharcard().getAadharNo()+"\n"+"City :"+c.getAadharcard().getCity()+
        		  "\n"+"State :"+c.getAadharcard().getState());

    }
}
