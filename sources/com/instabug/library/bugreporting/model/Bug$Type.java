package com.instabug.library.bugreporting.model;

public enum Bug$Type {
    BUG("bug"),
    FEEDBACK("feedback"),
    NOT_AVAILABLE("not-available");
    
    private final String name;

    private Bug$Type(String str) {
        this.name = str;
    }

    public String toString() {
        return this.name;
    }
}
