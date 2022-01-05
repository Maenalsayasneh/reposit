package org.bouncycastle.jcajce.provider.asymmetric.util;

import s0.a.a.c3.b;
import s0.a.a.c3.m0;
import s0.a.a.e;
import s0.a.a.v;
import s0.a.a.w2.p;

public class KeyUtil {
    public static byte[] getEncodedPrivateKeyInfo(b bVar, e eVar) {
        try {
            return getEncodedPrivateKeyInfo(new p(bVar, eVar.c(), (v) null, (byte[]) null));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedPrivateKeyInfo(p pVar) {
        try {
            return pVar.r("DER");
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(b bVar, e eVar) {
        try {
            return getEncodedSubjectPublicKeyInfo(new m0(bVar, eVar));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(b bVar, byte[] bArr) {
        try {
            return getEncodedSubjectPublicKeyInfo(new m0(bVar, bArr));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(m0 m0Var) {
        try {
            return m0Var.r("DER");
        } catch (Exception unused) {
            return null;
        }
    }
}
