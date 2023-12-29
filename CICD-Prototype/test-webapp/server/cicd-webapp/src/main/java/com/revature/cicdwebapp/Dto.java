package com.revature.cicdwebapp;

public class Dto {
    String message;

    public Dto() {
    }

    public Dto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
