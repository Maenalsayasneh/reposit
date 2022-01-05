package org.bouncycastle.jce.exception;

import java.io.IOException;

public class ExtIOException extends IOException {
    public Throwable getCause() {
        return null;
    }
}
