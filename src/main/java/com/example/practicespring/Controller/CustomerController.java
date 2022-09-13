package com.example.practicespring.Controller;


import com.example.practicespring.Entities.Customer;
import com.example.practicespring.Repository.CustomerRepository;
import com.example.practicespring.View.DatabaseView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;

import static javax.swing.WindowConstants.HIDE_ON_CLOSE;

@Component
public class CustomerController extends JFrame{

    private final CustomerRepository repo;

    private final DatabaseView view;

    private  Customer model;

    private JFrame caller;

    @Autowired
    public CustomerController(CustomerRepository customerRepository){
        this.repo = customerRepository;
        this.view = new DatabaseView() {
            @Override
            protected void actionButtonClicked() {
                doAction();
            }
        };
        this.setContentPane(view.$$$getRootComponent$$$());
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.pack();

    }

    /**
     * We allow for two potential actions.  If the JournalEntry is new, then the action is Save.  If the JournalEntry
     * already exists in the database, we just display it and close the window when we're done.
     */
    private void doAction() {
//        if(model.isNew()) {
//            model.se(view.getText());
//            model.setEntryTime(LocalDateTime.now());
//            repo.save(model);
//        }
        this.setVisible(false);
        model = null;

    }

    /**
     * Set the model and manipulate the view appropriately.  If the model is New, then set the View into Write Mode.  If
     * it isn't new, set it in Write mode.
     *
     * @param model - The JournalEntry object to be displayed and - maybe - edited.
     */
    public void setModel(Customer model) {
        this.model = model;
        view.setText(model.getAddress());
        view.viewMode();
    }

    /**
     * Set the View calling to this one, so that we can get it to refresh after we save an entry to the database.
     *
     * @param caller - A JFrame that instantiated this one.
     * @return A reference to this instance of JournalEntryController.  This is a builder method, because I like them.
     */
    public CustomerController setCaller(JFrame caller) {
        this.caller = caller;
        return this;
    }


}
