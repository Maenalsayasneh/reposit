package org.bouncycastle.jcajce;

import javax.crypto.interfaces.PBEKey;

public class PKCS12KeyWithParameters extends PKCS12Key implements PBEKey {
    public int getIterationCount() {
        return 0;
    }

    public byte[] getSalt() {
        return null;
    }
}
