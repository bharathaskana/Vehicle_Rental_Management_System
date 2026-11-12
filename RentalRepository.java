package org.vehicle;

import java.util.ArrayList;
import java.util.List;

public class RentalRepository {

    private List<Rental> rentals = new ArrayList<>();

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public List<Rental> getAllRentals() {
        return rentals;
    }
}
