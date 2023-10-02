package org.example.model;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CustomResponse<T> extends ResponseEntity<T> {

    public CustomResponse(T body, HttpStatus status) {
        super(body, status);
    }

    public static <T> CustomResponse<T> ok(T data) {
        return new CustomResponse<>(
                data,
                HttpStatus.OK
        );
    }

    public static <T> CustomResponse<T> internalServerError(T data) {
        return new CustomResponse<>(
                data,
                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }
}
