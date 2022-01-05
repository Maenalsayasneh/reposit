package org.bouncycastle.jce.provider;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import s0.a.b.b0.p;
import s0.a.b.b0.s;
import s0.a.b.b0.v;
import s0.a.b.f0.u;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.b.k0.y0;
import s0.a.b.t;

public interface BrokenPBE {
    public static final int MD5 = 0;
    public static final int OLD_PKCS12 = 3;
    public static final int PKCS12 = 2;
    public static final int PKCS5S1 = 0;
    public static final int PKCS5S2 = 1;
    public static final int RIPEMD160 = 2;
    public static final int SHA1 = 1;

    public static class Util {
        private static t makePBEGenerator(int i, int i2) {
            if (i == 0) {
                if (i2 == 0) {
                    return new u(new p());
                }
                if (i2 == 1) {
                    return new u(new v());
                }
                throw new IllegalStateException("PKCS5 scheme 1 only supports only MD5 and SHA1.");
            } else if (i == 1) {
                return new s0.a.b.f0.v(new v());
            } else {
                if (i == 3) {
                    if (i2 == 0) {
                        return new OldPKCS12ParametersGenerator(new p());
                    }
                    if (i2 == 1) {
                        return new OldPKCS12ParametersGenerator(new v());
                    }
                    if (i2 == 2) {
                        return new OldPKCS12ParametersGenerator(new s());
                    }
                    throw new IllegalStateException("unknown digest scheme for PBE encryption.");
                } else if (i2 == 0) {
                    return new s0.a.b.f0.t(new p());
                } else {
                    if (i2 == 1) {
                        return new s0.a.b.f0.t(new v());
                    }
                    if (i2 == 2) {
                        return new s0.a.b.f0.t(new s());
                    }
                    throw new IllegalStateException("unknown digest scheme for PBE encryption.");
                }
            }
        }

        public static i makePBEMacParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec, int i, int i2, int i3) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            t makePBEGenerator = makePBEGenerator(i, i2);
            byte[] encoded = bCPBEKey.getEncoded();
            makePBEGenerator.init(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            i generateDerivedMacParameters = makePBEGenerator.generateDerivedMacParameters(i3);
            for (int i4 = 0; i4 != encoded.length; i4++) {
                encoded[i4] = 0;
            }
            return generateDerivedMacParameters;
        }

        public static i makePBEParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec, int i, int i2, String str, int i3, int i4) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            t makePBEGenerator = makePBEGenerator(i, i2);
            byte[] encoded = bCPBEKey.getEncoded();
            makePBEGenerator.init(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            i generateDerivedParameters = i4 != 0 ? makePBEGenerator.generateDerivedParameters(i3, i4) : makePBEGenerator.generateDerivedParameters(i3);
            if (str.startsWith("DES")) {
                if (generateDerivedParameters instanceof c1) {
                    setOddParity(((y0) ((c1) generateDerivedParameters).d).c);
                } else {
                    setOddParity(((y0) generateDerivedParameters).c);
                }
            }
            for (int i5 = 0; i5 != encoded.length; i5++) {
                encoded[i5] = 0;
            }
            return generateDerivedParameters;
        }

        private static void setOddParity(byte[] bArr) {
            for (int i = 0; i < bArr.length; i++) {
                byte b = bArr[i];
                bArr[i] = (byte) ((((b >> 7) ^ ((((((b >> 1) ^ (b >> 2)) ^ (b >> 3)) ^ (b >> 4)) ^ (b >> 5)) ^ (b >> 6))) ^ 1) | (b & 254));
            }
        }
    }
}
