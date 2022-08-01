package org.example.spring;



public class WrongIdPasswordException extends RuntimeException {

    public WrongIdPasswordException(){
        super(message);
    }
}
