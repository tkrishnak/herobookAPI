package com.gcp.heropersona.customexception;

import java.util.function.Supplier;

public class HeroNotFoundException extends RuntimeException{
    String message;
    public HeroNotFoundException(String message) {
       super(message);
    }

}
