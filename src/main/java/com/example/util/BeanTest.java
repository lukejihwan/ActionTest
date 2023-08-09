package com.example.util;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class BeanTest {

    //@RunWith(SpringRunner.class)
    //@SpringBootTest(classes = BeanTest.class)

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void contextLoads() throws Exception {
        if (applicationContext != null) {
            String[] beans = applicationContext.getBeanDefinitionNames();

            for (String bean : beans) {
                System.out.println("bean : " + bean);
            }
        }
    }
}
