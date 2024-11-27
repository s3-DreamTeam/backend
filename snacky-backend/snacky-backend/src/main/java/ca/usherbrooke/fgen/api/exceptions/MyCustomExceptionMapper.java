package ca.usherbrooke.fgen.api.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class MyCustomExceptionMapper implements ExceptionMapper<MyCustomException> {
    @Override
    public Response toResponse(MyCustomException exception) {
        // Here, you can specify the HTTP status code you want to return
        return Response
                .status(exception.statusCode) // Custom status code (e.g., 400 Bad Request)
                .entity("{\"Custom error message\": " + "\"" + exception.getMessage() + "\"}")
                .build();
    }
}