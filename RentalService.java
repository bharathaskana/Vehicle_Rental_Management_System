package org.vehicle;

public class RentalService {

    private final CustomerRepository customerRepository;
    private final VehicleRepository vehicleRepository;
    private final RentalRepository rentalRepository;

    public RentalService(
            CustomerRepository customerRepository,
            VehicleRepository vehicleRepository,
            RentalRepository rentalRepository) {

        this.customerRepository = customerRepository;
        this.vehicleRepository = vehicleRepository;
        this.rentalRepository = rentalRepository;
    }

    public void rentVehicle(int rentalId,
                            int customerId,
                            int vehicleId,
                            int days) {

        Customer customer =
                customerRepository.findById(customerId);

        Vehicle vehicle =
                vehicleRepository.findById(vehicleId);

        if (customer == null) {
            System.out.println("Customer not found!");
            return;
        }

        if (vehicle == null) {
            System.out.println("Vehicle not found!");
            return;
        }

        if (!vehicle.isAvailable()) {
            System.out.println("Vehicle is already rented!");
            return;
        }

        if (days <= 0) {
            System.out.println("Invalid rental duration!");
            return;
        }

        Rental rental =
                new Rental(rentalId, customer, vehicle, days);

        vehicle.setAvailable(false);

        rentalRepository.addRental(rental);

        System.out.println("Vehicle rented successfully!");
        System.out.println(rental);
    }

    public void returnVehicle(int vehicleId) {

        Vehicle vehicle =
                vehicleRepository.findById(vehicleId);

        if (vehicle == null) {
            System.out.println("Vehicle not found!");
            return;
        }

        if (vehicle.isAvailable()) {
            System.out.println("Vehicle is not currently rented!");
            return;
        }

        vehicle.setAvailable(true);

        System.out.println("Vehicle returned successfully!");
    }

    public void showRentalHistory() {
        rentalRepository.getAllRentals()
                .forEach(System.out::println);
    }
}
