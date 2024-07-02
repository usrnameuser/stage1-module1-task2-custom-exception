package com.epam.mjc;

import java.lang.IllegalArgumentException;

public class CustomException extends IllegalArgumentException {
      public CustomException(String id) {
        super("Could not find student with ID {" + id + "}");
    }
}
