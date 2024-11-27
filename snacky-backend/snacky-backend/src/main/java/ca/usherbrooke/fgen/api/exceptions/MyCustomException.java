package ca.usherbrooke.fgen.api.exceptions;

public class MyCustomException extends RuntimeException {
    Integer statusCode;

    public MyCustomException(String message, int code) {
        super(message);
        statusCode = code;
    }
}
