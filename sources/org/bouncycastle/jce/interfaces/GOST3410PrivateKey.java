package org.bouncycastle.jce.interfaces;

import java.math.BigInteger;
import java.security.PrivateKey;
import s0.a.d.d.c;

public interface GOST3410PrivateKey extends c, PrivateKey {
    BigInteger getX();
}
