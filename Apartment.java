// Apartment.java
public class Apartment {
    private String streetAddress;
    private String apartmentNumber;
    private int numberOfBedrooms;
    private double rent;

    // Constructor
    public Apartment(String streetAddress, String apartmentNumber, int numberOfBedrooms, double rent) throws ApartmentException {
        if (!apartmentNumber.matches("\\d{3}")) {
            throw new ApartmentException("Apartment number must be exactly three digits.");
        }
        if (numberOfBedrooms < 1 || numberOfBedrooms > 4) {
            throw new ApartmentException("Number of bedrooms must be between 1 and 4.");
        }
        if (rent < 500 || rent > 2500) {
            throw new ApartmentException("Rent must be between $500 and $2500.");
        }

        this.streetAddress = streetAddress;
        this.apartmentNumber = apartmentNumber;
        this.numberOfBedrooms = numberOfBedrooms;
        this.rent = rent;
    }

    // Getters
    public String getStreetAddress() { return streetAddress; }
    public String getApartmentNumber() { return apartmentNumber; }
    public int getNumberOfBedrooms() { return numberOfBedrooms; }
    public double getRent() { return rent; }

    // Setters
    public void setStreetAddress(String streetAddress) { this.streetAddress = streetAddress; }
    
    public void setApartmentNumber(String apartmentNumber) throws ApartmentException {
        if (!apartmentNumber.matches("\\d{3}")) {
            throw new ApartmentException("Apartment number must be exactly three digits.");
        }
        this.apartmentNumber = apartmentNumber;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) throws ApartmentException {
        if (numberOfBedrooms < 1 || numberOfBedrooms > 4) {
            throw new ApartmentException("Number of bedrooms must be between 1 and 4.");
        }
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public void setRent(double rent) throws ApartmentException {
        if (rent < 500 || rent > 2500) {
            throw new ApartmentException("Rent must be between $500 and $2500.");
        }
        this.rent = rent;
    }

    // toString method
    @Override
    public String toString() {
        return String.format( "Apartment Details:\n" +
               "Address: " + streetAddress + "\n" +
               "Apartment Number: " + apartmentNumber + "\n" +
               "Bedrooms: " + numberOfBedrooms + "\n" +
               "Rent: $%.2f", rent
    );
    }
}
