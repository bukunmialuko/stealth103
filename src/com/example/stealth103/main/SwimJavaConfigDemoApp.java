package com.example.stealth103.main;

import com.example.stealth103.SportConfig;
import com.example.stealth103.SwimCoach;
import com.example.stealth103.interfaces.ICoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        // read spring config java class
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // call our new swim coach method ... has the props values injected
        System.out.println("Email: "+theCoach.getEmail());
        System.out.println("Team: "+theCoach.getTeam());

        // close the context
        context.close();

    }
}
