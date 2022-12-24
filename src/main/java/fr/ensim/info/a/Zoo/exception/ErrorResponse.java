package fr.ensim.info.a.Zoo.exception;

import java.util.List;


public class ErrorResponse {

    private String message;
    private List<String> details;

    public ErrorResponse() {
    }


    public List<String> getDetails() {
        return details;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

