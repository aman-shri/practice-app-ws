package org.example.ui.exceptions;

import java.io.Serial;

public class UserServiceException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 2545726405815598104L;

    public UserServiceException(String message){
        super(message);
    }


}
