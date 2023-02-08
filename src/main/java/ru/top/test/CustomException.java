package ru.top.test;

import java.io.Serial;

public class CustomException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = -2904174739443254737L;

    public CustomException(String message) {
        super(message);
    }
}
