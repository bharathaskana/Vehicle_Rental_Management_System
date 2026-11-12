package org.vehicle;

public class Main {

    public static void main(String[] args) {

        // Creating repository objects
        VehicleRepository vehicleRepository =
                new VehicleRepository();

        CustomerRepository customerRepository =
                new CustomerRepository();

        RentalRepository rentalRepository =
                new RentalRepository();

        // Creating service objects manually
        VehicleService vehicleService =
                new VehicleService(vehicleRepository);

        CustomerService customerService =
                new CustomerService(customerRepository);

        RentalService rentalService =
                new RentalService(
                        customerRepository,
                        vehicleRepository,
                        rentalRepository
                );

        // Register vehicles
        Vehicle v1 = new Vehicle(
                101, "Toyota", "Innova", 2500, true
        );

        Vehicle v2 = new Vehicle(
                102, "Hyundai", "Creta", 1800, true
        );

        vehicleService.registerVehicle(v1);
        vehicleService.registerVehicle(v2);

        // Register customer
        Customer c1 = new Customer(
                1, "Rahul", "9876543210"
        );

        customerService.registerCustomer(c1);

        // Rent vehicle
        rentalService.rentVehicle(
                1001, 1, 101, 3
        );

        // Display rental history
        rentalService.showRentalHistory();

        // Return vehicle
        rentalService.returnVehicle(101);
    }
}

