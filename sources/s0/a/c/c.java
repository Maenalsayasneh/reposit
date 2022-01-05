package s0.a.c;

import java.io.OutputStream;
import java.security.KeyStore;

public class c implements KeyStore.LoadStoreParameter {
    private final boolean forDEREncoding;
    private final OutputStream out;
    private final KeyStore.ProtectionParameter protectionParameter;

    public c(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter2) {
        this(outputStream, protectionParameter2, false);
    }

    public c(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter2, boolean z) {
        this.out = outputStream;
        this.protectionParameter = protectionParameter2;
        this.forDEREncoding = z;
    }

    public c(OutputStream outputStream, char[] cArr) {
        this(outputStream, cArr, false);
    }

    public c(OutputStream outputStream, char[] cArr, boolean z) {
        this(outputStream, (KeyStore.ProtectionParameter) new KeyStore.PasswordProtection(cArr), z);
    }

    public OutputStream getOutputStream() {
        return this.out;
    }

    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.protectionParameter;
    }

    public boolean isForDEREncoding() {
        return this.forDEREncoding;
    }
}
