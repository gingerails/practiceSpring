package com.example.practicespring;

import com.example.practicespring.Controller.CustomerController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;
import java.awt.*;

@Configuration
@ComponentScan(basePackageClasses = {CustomerController.class})
public class PracticeSpringApplication {

    private static final Logger logger = LoggerFactory.getLogger(PracticeSpringApplication.class);


    public static void main(String[] args) {
        logger.info("APPLICATION EXECUTION - INITIATED");
        new SpringApplicationBuilder(PracticeSpringApplication.class).headless(false).run(args);
        logger.info("APPLICATION EXECUTION - COMPLETED");
    }


}
