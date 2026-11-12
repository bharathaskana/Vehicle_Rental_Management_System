package org.vehicle;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {

    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer registered successfully!");
    }

    public Customer findById(int customerId) {

        for (Customer customer : customers) {

            if (customer.getCustomerId() == customerId) {
                return customer;
            }
        }

        return null;
    }

    public List<Customer> getAllCustomers() {
        return customers;
    }
}
