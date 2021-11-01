package com.mayankExamples.applicationContextExample;

import org.springframework.stereotype.Component;

@Component
public class Circle {

    private Float radius;

    public Circle(){
        this.radius = 1F;
    }

    public Circle(Float r){
        this.radius = r;
    }

    public double getArea(){
        return this.radius*this.radius*3.14;
    }

}
