package org.bouncycastle.jce.interfaces;

import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import s0.a.d.d.b;

public interface ElGamalPublicKey extends b, DHPublicKey {
    BigInteger getY();
}
