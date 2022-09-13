package com.example.practicespring;

import com.example.practicespring.Controller.CustomerController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;
import java.awt.*;

@SpringBootApplication
public class PracticeSpringApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(PracticeSpringApplication.class)
                .headless(false)
                .web(WebApplicationType.NONE)
                .run(args);
    }

}
