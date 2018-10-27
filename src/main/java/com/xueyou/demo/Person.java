package com.xueyou.demo;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.xueyou.demo.Body;
 
@Component
public class Person {
 
    @Autowired
    private Body body;
 
    public void showMyBody(){
        body.setId(100);
        System.out.println(body.getId());
    }
}