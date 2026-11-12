package org.vehicle;

public class Rental {

    private int rentalId;
    private Customer customer;
    private Vehicle vehicle;
    private int rentalDays;
    private double totalAmount;

    public Rental(int rentalId, Customer customer,
                  Vehicle vehicle, int rentalDays) {

        this.rentalId = rentalId;
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;

        this.totalAmount =
                vehicle.getDailyRate() * rentalDays;
    }

    public int getRentalId() {
        return rentalId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "rentalId=" + rentalId +
                ", customer=" + customer.getName() +
                ", vehicle=" + vehicle.getBrand() +
                " " + vehicle.getModel() +
                ", rentalDays=" + rentalDays +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
