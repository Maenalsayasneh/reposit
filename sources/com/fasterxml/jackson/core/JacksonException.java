package com.fasterxml.jackson.core;

import java.io.IOException;

public abstract class JacksonException extends IOException {
    public JacksonException(String str) {
        super(str);
    }

    public JacksonException(String str, Throwable th) {
        super(str, th);
    }
}
