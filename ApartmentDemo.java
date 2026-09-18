// ApartmentDemo.java
import java.util.Scanner;

public class ApartmentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter apartment details:");

        System.out.print("Street Address: ");
        String streetAddress = scanner.nextLine();

        System.out.print("Apartment Number (3 digits): ");
        String apartmentNumber = scanner.nextLine();

        System.out.print("Number of Bedrooms (1-4): ");
        int numberOfBedrooms = scanner.nextInt();

        System.out.print("Rent (500-2500): ");
        double rent = scanner.nextDouble();

        try {
            Apartment apartment = new Apartment(streetAddress, apartmentNumber, numberOfBedrooms, rent);
            System.out.println("\nApartment successfully created!");
            System.out.println(apartment);
        } catch (ApartmentException e) {
            System.out.println("\nError: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
