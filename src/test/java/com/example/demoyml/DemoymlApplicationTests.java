package com.example.demoyml;

import com.example.demoyml.bean.Person;
import com.example.demoyml.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoymlApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testService(){
        boolean b = ioc.containsBean("testService");
        System.out.println(b);
    }



    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
