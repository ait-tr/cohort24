package de.ait.tracker.handler;

import de.ait.tracker.dto.ErrorDto;
import de.ait.tracker.exceptions.RestApiException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 8/11/2023
 * SimpleRestApi
 *
 * @author Marsel Sidikov (AIT TR)
 */
@ControllerAdvice
public class RestApiExceptionsHandler {

    @ExceptionHandler(value = RestApiException.class)
    public ResponseEntity<ErrorDto> handleException(RestApiException e) {
        return ResponseEntity
                .status(e.getStatus())
                .body(new ErrorDto(e.getMessage()));
    }
}
