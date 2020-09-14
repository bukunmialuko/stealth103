package com.example.stealth103.main;

import com.example.stealth103.interfaces.ICoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        // read spring config file
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from spring container
        ICoach theCoach = context.getBean("tennisCoach", ICoach.class);
        ICoach alphaCoach = context.getBean("tennisCoach", ICoach.class);

        // call a method on the bean
        boolean result = (theCoach == alphaCoach);

        System.out.println("\nPointing to the same object: " + result);
        System.out.println("Memory location for theCoach: " + theCoach);
        System.out.println("Memory location for alphaCoach: " + alphaCoach +"\n");

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();

    }
}
