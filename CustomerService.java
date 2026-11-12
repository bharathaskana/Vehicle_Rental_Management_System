package org.vehicle;

public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void registerCustomer(Customer customer) {
        customerRepository.addCustomer(customer);
    }

    public Customer searchCustomer(int customerId) {
        return customerRepository.findById(customerId);
    }
}
