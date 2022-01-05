package org.bouncycastle.jcajce.provider.asymmetric.util;

import s0.a.b.e;
import s0.a.b.f;
import s0.a.d.e.p;

public class IESUtil {
    public static p guessParameterSpec(f fVar, byte[] bArr) {
        if (fVar == null) {
            return new p((byte[]) null, (byte[]) null, 128);
        }
        e eVar = fVar.d;
        if (eVar.getAlgorithmName().equals("DES") || eVar.getAlgorithmName().equals("RC2") || eVar.getAlgorithmName().equals("RC5-32") || eVar.getAlgorithmName().equals("RC5-64")) {
            return new p((byte[]) null, (byte[]) null, 64, 64, bArr);
        }
        if (eVar.getAlgorithmName().equals("SKIPJACK")) {
            return new p((byte[]) null, (byte[]) null, 80, 80, bArr);
        }
        return eVar.getAlgorithmName().equals("GOST28147") ? new p((byte[]) null, (byte[]) null, 256, 256, bArr) : new p((byte[]) null, (byte[]) null, 128, 128, bArr);
    }
}
