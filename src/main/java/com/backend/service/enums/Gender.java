package com.backend.service.enums;

/**
 * Created by Ankit Bhatia on 12/17/16.
 */
public enum Gender {
    MALE("MALE"),
    FEMALE("FEMALE");

    private String value;

    Gender(String gender) {
        this.value = gender;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
