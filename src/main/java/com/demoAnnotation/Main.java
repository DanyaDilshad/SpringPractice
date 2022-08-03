package com.demoAnnotation;

import com.demo.Staff;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("springDemo.xml");

        Doctor staff = context.getBean(Doctor.class);

        staff.assist();

        ApplicationContext context1 = new AnnotationConfigApplicationContext(BeanConfig.class);

        Nurse nurse = context1.getBean(Nurse.class);
        nurse.assist();

        Technician technician = context1.getBean(Technician.class);
        technician.assist(); 
    }

}
