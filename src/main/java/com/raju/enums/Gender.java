package com.raju.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Gender {

    MALE("Male"),
    FEMALE("Female");

    private final String gender;

    Gender(String value) {
        this.gender = value;
    }

    @JsonValue
    public String getGender() {
        return this.gender;
    }
}
