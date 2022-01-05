package io.michaelrocks.libphonenumber.android;

import i0.d.a.a.a;

public class NumberParseException extends Exception {
    public ErrorType c;
    public String d;

    public enum ErrorType {
        INVALID_COUNTRY_CODE,
        NOT_A_NUMBER,
        TOO_SHORT_AFTER_IDD,
        TOO_SHORT_NSN,
        TOO_LONG
    }

    public NumberParseException(ErrorType errorType, String str) {
        super(str);
        this.d = str;
        this.c = errorType;
    }

    public String toString() {
        StringBuilder P0 = a.P0("Error type: ");
        P0.append(this.c);
        P0.append(". ");
        P0.append(this.d);
        return P0.toString();
    }
}
