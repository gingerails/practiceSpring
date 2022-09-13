package com.example.practicespring.Controller;

import com.example.practicespring.Entities.Customer;
import com.example.practicespring.Repository.CustomerRepository;
import com.example.practicespring.View.MainView;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.swing.*;
import java.util.Optional;


@Controller
public class MainController extends JFrame {


    private final MainView view;
    @Autowired
    CustomerRepository repo;

    @Autowired
    CustomerController customerController;

    /**
     * This autowired constructor automagically receives reference to both a customerRepository (for access to the
     * persistence mechanism) and a customerController for writing or displaying JournalEntries.
     *
     * @param customerRepository - A customerRepository instance provided via Autowiring.
     * @param customerController - A customerController provided via Autowiring.
     */
    @Autowired
    public MainController(CustomerRepository customerRepository, CustomerController customerController) {
        super("What a hideous application!");

        this.repo = customerRepository;
        this.customerController = customerController.setCaller(this);

        this.view = new MainView() {
            @Override
            protected void newEntryButtonClicked() {
                doNewEntry();
            }

            @Override
            protected void viewEntryButtonClicked() {
                doViewEntry();
            }
        };

        this.setContentPane(view.$$$getRootComponent$$$());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        view.setCustomerListContent(repo.findAll().toArray());

        this.pack();
    }

    private void doNewEntry() {
        customerController.setModel(new Customer());
        customerController.setVisible(true);
    }

    private void doViewEntry() {
        Integer id = ((Customer)view.getSelectedEntry()).getCustomer_id();
        Optional<Customer> maybeEntry = repo.findById(id);
        customerController.setModel(maybeEntry.orElse(new Customer()));
        customerController.setVisible(true);
    }

    /**
     * I hook the refresh of the JList up to the validate method.  Then you can call it from another view without
     * having to actually know the implementation under the hood.  It's just a JFrame that you're validating.
     */
    @Override
    public void validate() {
        super.validate();
        view.setCustomerListContent(repo.findAll().toArray());
    }

}
