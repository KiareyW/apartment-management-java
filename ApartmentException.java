// ApartmentException.java
public class ApartmentException extends Exception {
    // Constructor with a custom message
    public ApartmentException(String message) {
        super(message);
    }

    // Default constructor with a default error message
    public ApartmentException() {
        super("Invalid apartment details provided.");
    }
}
