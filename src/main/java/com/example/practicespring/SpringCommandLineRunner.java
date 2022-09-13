package com.example.practicespring;

import com.example.practicespring.Controller.MainController;
import com.formdev.flatlaf.FlatLightLaf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.awt.*;

@Component
public class SpringCommandLineRunner implements CommandLineRunner {
    private final MainController controller;

    @Autowired
    public SpringCommandLineRunner(MainController controller) {
        this.controller = controller;
    }

    @Override
    public void run(String... args) {
        FlatLightLaf.setup();
        //This boots up the GUI.
        EventQueue.invokeLater(() -> controller.setVisible(true));
    }

}
