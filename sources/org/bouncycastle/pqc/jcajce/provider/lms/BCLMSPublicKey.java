package org.bouncycastle.pqc.jcajce.provider.lms;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;
import s0.a.a.c3.m0;
import s0.a.e.b.b0.c.h3;
import s0.a.f.b.a.f;
import s0.a.f.b.g.a;

public class BCLMSPublicKey implements PublicKey, Key {
    public transient f c;

    public BCLMSPublicKey(m0 m0Var) throws IOException {
        this.c = (f) a.a(m0Var);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BCLMSPublicKey) {
            try {
                return Arrays.equals(this.c.getEncoded(), ((BCLMSPublicKey) obj).c.getEncoded());
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final String getAlgorithm() {
        return "LMS";
    }

    public byte[] getEncoded() {
        try {
            return h3.u0(this.c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        try {
            return h3.m1(this.c.getEncoded());
        } catch (IOException unused) {
            return -1;
        }
    }
}
