package org.bouncycastle.crypto.io;

public class InvalidCipherTextIOException extends CipherIOException {
    public InvalidCipherTextIOException(String str, Throwable th) {
        super(str, th);
    }
}
