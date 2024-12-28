package com.testeincasa.testeincasa.services.exception;

public class ObjectNotFoundException extends RuntimeException {


    private static final long serialVersionUID = 9143213705443767894L;

    public ObjectNotFoundException(String msg) {
        super(msg);
    }

}
