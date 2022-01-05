package org.bouncycastle.jcajce;

import javax.crypto.interfaces.PBEKey;

public class PBKDF1KeyWithParameters extends PBKDF1Key implements PBEKey {
    public int getIterationCount() {
        return 0;
    }

    public byte[] getSalt() {
        return null;
    }
}
