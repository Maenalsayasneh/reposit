package org.bouncycastle.jce.interfaces;

import java.math.BigInteger;
import java.security.PrivateKey;
import s0.a.d.d.a;

public interface ECPrivateKey extends a, PrivateKey {
    BigInteger getD();
}
