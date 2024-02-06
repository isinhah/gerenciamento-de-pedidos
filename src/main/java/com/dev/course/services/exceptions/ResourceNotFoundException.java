package com.dev.course.services.exceptions;

//O compilador não obriga a tratar
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }
}
