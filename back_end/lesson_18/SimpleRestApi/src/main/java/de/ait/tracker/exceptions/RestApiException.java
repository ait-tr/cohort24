package de.ait.tracker.exceptions;

import org.springframework.http.HttpStatus;

/**
 * 8/11/2023
 * SimpleRestApi
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class RestApiException extends RuntimeException {
    private final HttpStatus status;

    public RestApiException(HttpStatus status, String message) {
        super(message);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
