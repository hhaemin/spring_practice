package com.github.sample.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponentA {

    private MyComponentB componentB;

    public void sayHello(){
        String message = componentB.sayHello() + ", and I'm MyComponentA";
        System.out.println(message);
    }

    @Autowired
    public MyComponentA(MyComponentB componentB) {
        this.componentB = componentB;
    }


    public void setComponentB(MyComponentB componentB) {
        this.componentB = componentB;
    }
}
