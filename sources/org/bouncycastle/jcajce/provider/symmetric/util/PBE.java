package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import m0.r.t.a.r.m.a1.a;
import s0.a.b.b0.a0;
import s0.a.b.b0.d;
import s0.a.b.b0.d0;
import s0.a.b.b0.g0;
import s0.a.b.b0.n;
import s0.a.b.b0.p;
import s0.a.b.b0.s;
import s0.a.b.b0.v;
import s0.a.b.b0.w;
import s0.a.b.b0.x;
import s0.a.b.b0.y;
import s0.a.b.f0.u;
import s0.a.b.i;
import s0.a.b.k0.c;
import s0.a.b.k0.c1;
import s0.a.b.k0.y0;
import s0.a.b.t;

public interface PBE {
    public static final int GOST3411 = 6;
    public static final int MD2 = 5;
    public static final int MD5 = 0;
    public static final int OPENSSL = 3;
    public static final int PKCS12 = 2;
    public static final int PKCS5S1 = 0;
    public static final int PKCS5S1_UTF8 = 4;
    public static final int PKCS5S2 = 1;
    public static final int PKCS5S2_UTF8 = 5;
    public static final int RIPEMD160 = 2;
    public static final int SHA1 = 1;
    public static final int SHA224 = 7;
    public static final int SHA256 = 4;
    public static final int SHA384 = 8;
    public static final int SHA3_224 = 10;
    public static final int SHA3_256 = 11;
    public static final int SHA3_384 = 12;
    public static final int SHA3_512 = 13;
    public static final int SHA512 = 9;
    public static final int SM3 = 14;
    public static final int TIGER = 3;

    public static class Util {
        private static byte[] convertPassword(int i, PBEKeySpec pBEKeySpec) {
            return i == 2 ? t.PKCS12PasswordToBytes(pBEKeySpec.getPassword()) : (i == 5 || i == 4) ? t.PKCS5PasswordToUTF8Bytes(pBEKeySpec.getPassword()) : t.PKCS5PasswordToBytes(pBEKeySpec.getPassword());
        }

        private static t makePBEGenerator(int i, int i2) {
            if (i == 0 || i == 4) {
                if (i2 == 0) {
                    return new u(new p());
                }
                if (i2 == 1) {
                    return new u(new v());
                }
                if (i2 == 5) {
                    return new u(new n());
                }
                throw new IllegalStateException("PKCS5 scheme 1 only supports MD2, MD5 and SHA1.");
            } else if (i == 1 || i == 5) {
                switch (i2) {
                    case 0:
                        return new s0.a.b.f0.v(new p());
                    case 1:
                        return new s0.a.b.f0.v(new v());
                    case 2:
                        return new s0.a.b.f0.v(new s());
                    case 3:
                        return new s0.a.b.f0.v(new g0());
                    case 4:
                        return new s0.a.b.f0.v(new x());
                    case 5:
                        return new s0.a.b.f0.v(new n());
                    case 6:
                        return new s0.a.b.f0.v(new d());
                    case 7:
                        return new s0.a.b.f0.v(new w());
                    case 8:
                        return new s0.a.b.f0.v(new y());
                    case 9:
                        return new s0.a.b.f0.v(new a0());
                    case 10:
                        return new s0.a.b.f0.v(a.R0());
                    case 11:
                        return new s0.a.b.f0.v(a.S0());
                    case 12:
                        return new s0.a.b.f0.v(a.T0());
                    case 13:
                        return new s0.a.b.f0.v(a.U0());
                    case 14:
                        return new s0.a.b.f0.v(new d0());
                    default:
                        throw new IllegalStateException("unknown digest scheme for PBE PKCS5S2 encryption.");
                }
            } else if (i != 2) {
                return new s0.a.b.f0.s();
            } else {
                switch (i2) {
                    case 0:
                        return new s0.a.b.f0.t(new p());
                    case 1:
                        return new s0.a.b.f0.t(new v());
                    case 2:
                        return new s0.a.b.f0.t(new s());
                    case 3:
                        return new s0.a.b.f0.t(new g0());
                    case 4:
                        return new s0.a.b.f0.t(new x());
                    case 5:
                        return new s0.a.b.f0.t(new n());
                    case 6:
                        return new s0.a.b.f0.t(new d());
                    case 7:
                        return new s0.a.b.f0.t(new w());
                    case 8:
                        return new s0.a.b.f0.t(new y());
                    case 9:
                        return new s0.a.b.f0.t(new a0());
                    default:
                        throw new IllegalStateException("unknown digest scheme for PBE encryption.");
                }
            }
        }

        public static i makePBEMacParameters(SecretKey secretKey, int i, int i2, int i3, PBEParameterSpec pBEParameterSpec) {
            t makePBEGenerator = makePBEGenerator(i, i2);
            byte[] encoded = secretKey.getEncoded();
            makePBEGenerator.init(secretKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            i generateDerivedMacParameters = makePBEGenerator.generateDerivedMacParameters(i3);
            for (int i4 = 0; i4 != encoded.length; i4++) {
                encoded[i4] = 0;
            }
            return generateDerivedMacParameters;
        }

        public static i makePBEMacParameters(PBEKeySpec pBEKeySpec, int i, int i2, int i3) {
            t makePBEGenerator = makePBEGenerator(i, i2);
            byte[] convertPassword = convertPassword(i, pBEKeySpec);
            makePBEGenerator.init(convertPassword, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
            i generateDerivedMacParameters = makePBEGenerator.generateDerivedMacParameters(i3);
            for (int i4 = 0; i4 != convertPassword.length; i4++) {
                convertPassword[i4] = 0;
            }
            return generateDerivedMacParameters;
        }

        public static i makePBEMacParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            t makePBEGenerator = makePBEGenerator(bCPBEKey.getType(), bCPBEKey.getDigest());
            makePBEGenerator.init(bCPBEKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            return makePBEGenerator.generateDerivedMacParameters(bCPBEKey.getKeySize());
        }

        public static i makePBEParameters(PBEKeySpec pBEKeySpec, int i, int i2, int i3, int i4) {
            t makePBEGenerator = makePBEGenerator(i, i2);
            byte[] convertPassword = convertPassword(i, pBEKeySpec);
            makePBEGenerator.init(convertPassword, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
            i generateDerivedParameters = i4 != 0 ? makePBEGenerator.generateDerivedParameters(i3, i4) : makePBEGenerator.generateDerivedParameters(i3);
            for (int i5 = 0; i5 != convertPassword.length; i5++) {
                convertPassword[i5] = 0;
            }
            return generateDerivedParameters;
        }

        public static i makePBEParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec, String str) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            t makePBEGenerator = makePBEGenerator(bCPBEKey.getType(), bCPBEKey.getDigest());
            byte[] encoded = bCPBEKey.getEncoded();
            if (bCPBEKey.shouldTryWrongPKCS12()) {
                encoded = new byte[2];
            }
            makePBEGenerator.init(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            i generateDerivedParameters = bCPBEKey.getIvSize() != 0 ? makePBEGenerator.generateDerivedParameters(bCPBEKey.getKeySize(), bCPBEKey.getIvSize()) : makePBEGenerator.generateDerivedParameters(bCPBEKey.getKeySize());
            if (str.startsWith("DES")) {
                if (generateDerivedParameters instanceof c1) {
                    c.c(((y0) ((c1) generateDerivedParameters).d).c);
                } else {
                    c.c(((y0) generateDerivedParameters).c);
                }
            }
            return generateDerivedParameters;
        }

        public static i makePBEParameters(byte[] bArr, int i, int i2, int i3, int i4, AlgorithmParameterSpec algorithmParameterSpec, String str) throws InvalidAlgorithmParameterException {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new InvalidAlgorithmParameterException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            t makePBEGenerator = makePBEGenerator(i, i2);
            makePBEGenerator.init(bArr, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            i generateDerivedParameters = i4 != 0 ? makePBEGenerator.generateDerivedParameters(i3, i4) : makePBEGenerator.generateDerivedParameters(i3);
            if (str.startsWith("DES")) {
                if (generateDerivedParameters instanceof c1) {
                    c.c(((y0) ((c1) generateDerivedParameters).d).c);
                } else {
                    c.c(((y0) generateDerivedParameters).c);
                }
            }
            return generateDerivedParameters;
        }
    }
}
