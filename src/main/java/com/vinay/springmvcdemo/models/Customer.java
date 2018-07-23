package com.vinay.springmvcdemo.models;

import javax.validation.constraints.*;
import java.io.Serializable;

public class Customer implements Serializable {
    private static final long serialVersionUID = 1l;

    private String firstName;


    @NotNull(message = " is required")
    @Size(min = 1 , message = "is required")
    private String lastName;

    @NotNull(message = " is required")
    @Min(value = 0, message = "must be greater than or equal to zero")
    @Max(value = 10, message = "must be less than or equal to 10")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{6}", message = " only 6 chars/digits")
    private String postalCode;

    private String courseCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }


    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
