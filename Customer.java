package org.vehicle;

public class Customer {

    private int customerId;
    private String name;
    private String phoneNumber;

    public Customer(int customerId, String name,
                    String phoneNumber) {

        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
