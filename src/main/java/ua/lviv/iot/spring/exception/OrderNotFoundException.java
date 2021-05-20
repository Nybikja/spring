package ua.lviv.iot.spring.exception;

public class OrderNotFoundException extends Exception {

    public OrderNotFoundException(String message) {
        super(message);
    }
}
