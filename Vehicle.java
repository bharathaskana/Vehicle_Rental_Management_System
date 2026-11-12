package org.vehicle;

public class Vehicle {

    private int vehicleId;
    private String brand;
    private String model;
    private double dailyRate;
    private boolean available;

    public Vehicle(int vehicleId, String brand,
                   String model, double dailyRate,
                   boolean available) {

        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.dailyRate = dailyRate;
        this.available = available;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", dailyRate=" + dailyRate +
                ", available=" + available +
                '}';
    }
}
