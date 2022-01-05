package org.bouncycastle.jce.interfaces;

import java.math.BigInteger;
import javax.crypto.interfaces.DHPrivateKey;
import s0.a.d.d.b;

public interface ElGamalPrivateKey extends b, DHPrivateKey {
    BigInteger getX();
}
