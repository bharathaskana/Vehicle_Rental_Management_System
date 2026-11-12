package org.vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleRepository {

    private List<Vehicle> vehicles = new ArrayList<>();

    // Add vehicle
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Vehicle added successfully!");
    }

    // Display all vehicles
    public List<Vehicle> getAllVehicles() {
        return vehicles;
    }

    // Find vehicle by ID
    public Vehicle findById(int vehicleId) {

        for (Vehicle vehicle : vehicles) {

            if (vehicle.getVehicleId() == vehicleId) {
                return vehicle;
            }
        }

        return null;
    }
}
