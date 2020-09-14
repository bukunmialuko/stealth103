package com.example.stealth103.main;

import com.example.stealth103.SportConfig;
import com.example.stealth103.interfaces.ICoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        // read spring config java class
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        ICoach theCoach = context.getBean("swimCoach", ICoach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();

    }
}
