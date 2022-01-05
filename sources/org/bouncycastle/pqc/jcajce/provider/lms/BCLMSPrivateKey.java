package org.bouncycastle.pqc.jcajce.provider.lms;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;
import s0.a.a.v;
import s0.a.a.w2.p;
import s0.a.e.b.b0.c.h3;
import s0.a.f.b.a.f;

public class BCLMSPrivateKey implements PrivateKey, Key {
    public transient f c;
    public transient v d;

    public BCLMSPrivateKey(p pVar) throws IOException {
        this.d = pVar.x;
        this.c = (f) h3.s0(pVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCLMSPrivateKey)) {
            return false;
        }
        try {
            return Arrays.equals(this.c.getEncoded(), ((BCLMSPrivateKey) obj).c.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to perform equals");
        }
    }

    public String getAlgorithm() {
        return "LMS";
    }

    public byte[] getEncoded() {
        try {
            return h3.t0(this.c, this.d).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        try {
            return h3.m1(this.c.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to calculate hashCode");
        }
    }
}
