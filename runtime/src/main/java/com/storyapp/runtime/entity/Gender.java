package com.storyapp.runtime.entity;

/**
 * Created by deepas on 21/01/18.
 */

public enum Gender {

    MALE("male"),FEMALE("female"),OTHER("other");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }
}
