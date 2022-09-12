package com.example.practicespring.Controller;


import com.example.practicespring.Repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import javax.swing.*;
import java.awt.*;

@Component
public class CustomerController implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    CustomerRepository customerRepository;


    @Override
    public void run(String... args) throws Exception {

        logger.info("EXECUTING : Command Line Runner");
        JFrame frame = new JFrame("Spring Boot Swing App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JPanel panel = new JPanel(new BorderLayout());
        JTextField text = new JTextField("Swing frame test :)");
        panel.add(text, BorderLayout.CENTER);
        frame.setContentPane(panel);
        frame.setVisible(true);


        //List<Customer> customerList = customerService.printPersonInfo();
    }
}
