package com.mayankExamples.applicationContextExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.junit.Assert;

import java.util.Arrays;

public class Application {

    private static AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfiguration.class);

    public static void main(String args[]){

        //print all beans contained in the context
        System.out.println(Arrays.asList(ctx.getBeanDefinitionNames()));

        Object myShape = ctx.getBean("myShape");
        Assert.assertEquals(myShape.getClass(), Circle.class);

        Object circle = ctx.getBean("circle");
        Assert.assertEquals(circle.getClass(), Circle.class);

    }
}
