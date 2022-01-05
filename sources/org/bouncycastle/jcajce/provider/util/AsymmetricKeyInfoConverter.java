package org.bouncycastle.jcajce.provider.util;

import java.io.IOException;
import java.security.PrivateKey;
import java.security.PublicKey;
import s0.a.a.c3.m0;
import s0.a.a.w2.p;

public interface AsymmetricKeyInfoConverter {
    PrivateKey generatePrivate(p pVar) throws IOException;

    PublicKey generatePublic(m0 m0Var) throws IOException;
}
