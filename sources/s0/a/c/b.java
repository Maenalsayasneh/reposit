package s0.a.c;

import java.io.OutputStream;
import java.security.KeyStore;

public class b implements KeyStore.LoadStoreParameter {
    public OutputStream a() {
        throw new UnsupportedOperationException("parameter not configured for storage - no OutputStream");
    }

    public KeyStore.ProtectionParameter getProtectionParameter() {
        return null;
    }
}
