package com.example.practicespring;

import com.example.practicespring.Services.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

import javax.swing.*;
import java.awt.*;

@SpringBootApplication
public class PracticeSpringApplication implements CommandLineRunner {

    public static void main(String[] args) {
        new SpringApplicationBuilder(PracticeSpringApplication.class).headless(false).run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        JFrame frame = new JFrame("Spring Boot Swing App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JPanel panel = new JPanel(new BorderLayout());
        JTextField text = new JTextField("Swing frame test :)");
        panel.add(text, BorderLayout.CENTER);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

}
