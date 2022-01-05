package com.fasterxml.jackson.core;

public class JsonProcessingException extends JacksonException {
    public JsonLocation c;

    public JsonProcessingException(String str, JsonLocation jsonLocation) {
        super(str, (Throwable) null);
        this.c = jsonLocation;
    }

    public String a() {
        return null;
    }

    public String b() {
        return super.getMessage();
    }

    public Object c() {
        return null;
    }

    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        JsonLocation jsonLocation = this.c;
        String a = a();
        if (jsonLocation == null && a == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append(message);
        if (a != null) {
            sb.append(a);
        }
        if (jsonLocation != null) {
            sb.append(10);
            sb.append(" at ");
            sb.append(jsonLocation.toString());
        }
        return sb.toString();
    }

    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    public JsonProcessingException(String str, JsonLocation jsonLocation, Throwable th) {
        super(str, th);
        this.c = jsonLocation;
    }

    public JsonProcessingException(String str, Throwable th) {
        super(str, th);
        this.c = null;
    }

    public JsonProcessingException(String str) {
        super(str);
    }
}
