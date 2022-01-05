package org.bouncycastle.jce.provider;

import i0.d.a.a.a;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jce.provider.BrokenPBE;
import s0.a.b.e;
import s0.a.b.e0.b1;
import s0.a.b.e0.o;
import s0.a.b.e0.p;
import s0.a.b.f;
import s0.a.b.i;
import s0.a.b.i0.c;
import s0.a.b.i0.t;
import s0.a.b.j;
import s0.a.b.k0.c1;
import s0.a.b.k0.g1;
import s0.a.b.k0.h1;
import s0.a.b.k0.y0;

public class BrokenJCEBlockCipher implements BrokenPBE {
    private Class[] availableSpecs = {IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};
    private f cipher;
    private AlgorithmParameters engineParams = null;
    private int ivLength = 0;
    private c1 ivParam;
    private int pbeHash = 1;
    private int pbeIvSize;
    private int pbeKeySize;
    private int pbeType = 2;

    public static class BrokePBEWithMD5AndDES extends BrokenJCEBlockCipher {
        public BrokePBEWithMD5AndDES() {
            super(new c(new o()), 0, 0, 64, 64);
        }
    }

    public static class BrokePBEWithSHA1AndDES extends BrokenJCEBlockCipher {
        public BrokePBEWithSHA1AndDES() {
            super(new c(new o()), 0, 1, 64, 64);
        }
    }

    public static class BrokePBEWithSHAAndDES2Key extends BrokenJCEBlockCipher {
        public BrokePBEWithSHAAndDES2Key() {
            super(new c(new p()), 2, 1, 128, 64);
        }
    }

    public static class BrokePBEWithSHAAndDES3Key extends BrokenJCEBlockCipher {
        public BrokePBEWithSHAAndDES3Key() {
            super(new c(new p()), 2, 1, 192, 64);
        }
    }

    public static class OldPBEWithSHAAndDES3Key extends BrokenJCEBlockCipher {
        public OldPBEWithSHAAndDES3Key() {
            super(new c(new p()), 3, 1, 192, 64);
        }
    }

    public static class OldPBEWithSHAAndTwofish extends BrokenJCEBlockCipher {
        public OldPBEWithSHAAndTwofish() {
            super(new c(new b1()), 3, 1, 256, 128);
        }
    }

    public BrokenJCEBlockCipher(e eVar) {
        this.cipher = new s0.a.b.j0.e(eVar);
    }

    public BrokenJCEBlockCipher(e eVar, int i, int i2, int i3, int i4) {
        this.cipher = new s0.a.b.j0.e(eVar);
        this.pbeType = i;
        this.pbeHash = i2;
        this.pbeKeySize = i3;
        this.pbeIvSize = i4;
    }

    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalBlockSizeException, BadPaddingException {
        int g = i2 != 0 ? this.cipher.g(bArr, i, i2, bArr2, i3) : 0;
        try {
            return g + this.cipher.a(bArr2, i3 + g);
        } catch (DataLengthException e) {
            throw new IllegalBlockSizeException(e.getMessage());
        } catch (InvalidCipherTextException e2) {
            throw new BadPaddingException(e2.getMessage());
        }
    }

    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        byte[] bArr2 = new byte[engineGetOutputSize(i2)];
        int g = i2 != 0 ? this.cipher.g(bArr, i, i2, bArr2, 0) : 0;
        try {
            int a = g + this.cipher.a(bArr2, g);
            byte[] bArr3 = new byte[a];
            System.arraycopy(bArr2, 0, bArr3, 0, a);
            return bArr3;
        } catch (DataLengthException e) {
            throw new IllegalBlockSizeException(e.getMessage());
        } catch (InvalidCipherTextException e2) {
            throw new BadPaddingException(e2.getMessage());
        }
    }

    public int engineGetBlockSize() {
        return this.cipher.b();
    }

    public byte[] engineGetIV() {
        c1 c1Var = this.ivParam;
        if (c1Var != null) {
            return c1Var.c;
        }
        return null;
    }

    public int engineGetKeySize(Key key) {
        return key.getEncoded().length;
    }

    public int engineGetOutputSize(int i) {
        return this.cipher.c(i);
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.ivParam != null) {
            String algorithmName = this.cipher.d.getAlgorithmName();
            if (algorithmName.indexOf(47) >= 0) {
                algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
            }
            try {
                AlgorithmParameters instance = AlgorithmParameters.getInstance(algorithmName, BouncyCastleProvider.PROVIDER_NAME);
                this.engineParams = instance;
                instance.init(this.ivParam.c);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.engineParams;
    }

    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec = null;
        if (algorithmParameters != null) {
            int i2 = 0;
            while (true) {
                Class[] clsArr = this.availableSpecs;
                if (i2 == clsArr.length) {
                    break;
                }
                try {
                    algorithmParameterSpec = algorithmParameters.getParameterSpec(clsArr[i2]);
                    break;
                } catch (Exception unused) {
                    i2++;
                }
            }
            if (algorithmParameterSpec == null) {
                StringBuilder P0 = a.P0("can't handle parameter ");
                P0.append(algorithmParameters.toString());
                throw new InvalidAlgorithmParameterException(P0.toString());
            }
        }
        this.engineParams = algorithmParameters;
        engineInit(i, key, algorithmParameterSpec, secureRandom);
    }

    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        y0 y0Var;
        c1 c1Var;
        c1 c1Var2;
        y0 y0Var2;
        if (key instanceof BCPBEKey) {
            i makePBEParameters = BrokenPBE.Util.makePBEParameters((BCPBEKey) key, algorithmParameterSpec, this.pbeType, this.pbeHash, this.cipher.d.getAlgorithmName(), this.pbeKeySize, this.pbeIvSize);
            y0Var = makePBEParameters;
            if (this.pbeIvSize != 0) {
                this.ivParam = (c1) makePBEParameters;
                y0Var = makePBEParameters;
            }
        } else {
            if (algorithmParameterSpec == null) {
                y0Var2 = new y0(key.getEncoded());
            } else {
                if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
                    if (algorithmParameterSpec instanceof RC2ParameterSpec) {
                        RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
                        g1 g1Var = new g1(key.getEncoded(), rC2ParameterSpec.getEffectiveKeyBits());
                        c1Var2 = g1Var;
                        if (rC2ParameterSpec.getIV() != null) {
                            c1Var2 = g1Var;
                            if (this.ivLength != 0) {
                                c1Var = new c1(g1Var, rC2ParameterSpec.getIV());
                            }
                        }
                    } else if (algorithmParameterSpec instanceof RC5ParameterSpec) {
                        RC5ParameterSpec rC5ParameterSpec = (RC5ParameterSpec) algorithmParameterSpec;
                        h1 h1Var = new h1(key.getEncoded(), rC5ParameterSpec.getRounds());
                        if (rC5ParameterSpec.getWordSize() == 32) {
                            c1Var2 = h1Var;
                            if (rC5ParameterSpec.getIV() != null) {
                                c1Var2 = h1Var;
                                if (this.ivLength != 0) {
                                    c1Var = new c1(h1Var, rC5ParameterSpec.getIV());
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("can only accept RC5 word size 32 (at the moment...)");
                        }
                    } else {
                        throw new InvalidAlgorithmParameterException("unknown parameter type.");
                    }
                    this.ivParam = c1Var;
                    y0Var = c1Var;
                } else if (this.ivLength != 0) {
                    c1 c1Var3 = new c1(new y0(key.getEncoded()), ((IvParameterSpec) algorithmParameterSpec).getIV());
                    this.ivParam = c1Var3;
                    c1Var2 = c1Var3;
                } else {
                    y0Var2 = new y0(key.getEncoded());
                }
                y0Var = c1Var2;
            }
            y0Var = y0Var2;
        }
        c1 c1Var4 = y0Var;
        if (this.ivLength != 0) {
            boolean z = y0Var instanceof c1;
            c1Var4 = y0Var;
            if (!z) {
                if (secureRandom == null) {
                    secureRandom = j.a();
                }
                if (i == 1 || i == 3) {
                    byte[] bArr = new byte[this.ivLength];
                    secureRandom.nextBytes(bArr);
                    c1 c1Var5 = new c1(y0Var, bArr);
                    this.ivParam = c1Var5;
                    c1Var4 = c1Var5;
                } else {
                    throw new InvalidAlgorithmParameterException("no IV set when one expected");
                }
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        System.out.println("eeek!");
                        return;
                    }
                }
            }
            this.cipher.e(false, c1Var4);
            return;
        }
        this.cipher.e(true, c1Var4);
    }

    public void engineSetMode(String str) {
        s0.a.b.j0.e eVar;
        s0.a.b.j0.e eVar2;
        String g = s0.a.g.j.g(str);
        if (g.equals("ECB")) {
            this.ivLength = 0;
            eVar = new s0.a.b.j0.e(this.cipher.d);
        } else if (g.equals("CBC")) {
            this.ivLength = this.cipher.d.b();
            eVar = new s0.a.b.j0.e(new c(this.cipher.d));
        } else {
            if (g.startsWith("OFB")) {
                this.ivLength = this.cipher.d.b();
                if (g.length() != 3) {
                    eVar2 = new s0.a.b.j0.e(new t(this.cipher.d, Integer.parseInt(g.substring(3))));
                } else {
                    f fVar = this.cipher;
                    eVar = new s0.a.b.j0.e(new t(fVar.d, fVar.b() * 8));
                }
            } else if (g.startsWith("CFB")) {
                this.ivLength = this.cipher.d.b();
                if (g.length() != 3) {
                    eVar2 = new s0.a.b.j0.e(new s0.a.b.i0.e(this.cipher.d, Integer.parseInt(g.substring(3))));
                } else {
                    f fVar2 = this.cipher;
                    eVar = new s0.a.b.j0.e(new s0.a.b.i0.e(fVar2.d, fVar2.b() * 8));
                }
            } else {
                throw new IllegalArgumentException(a.n0("can't support mode ", str));
            }
            this.cipher = eVar2;
            return;
        }
        this.cipher = eVar;
    }

    public void engineSetPadding(String str) throws NoSuchPaddingException {
        f fVar;
        String g = s0.a.g.j.g(str);
        if (g.equals("NOPADDING")) {
            fVar = new f(this.cipher.d);
        } else if (g.equals("PKCS5PADDING") || g.equals("PKCS7PADDING") || g.equals("ISO10126PADDING")) {
            fVar = new s0.a.b.j0.e(this.cipher.d);
        } else if (g.equals("WITHCTS")) {
            fVar = new s0.a.b.i0.f(this.cipher.d);
        } else {
            throw new NoSuchPaddingException(a.o0("Padding ", str, " unknown."));
        }
        this.cipher = fVar;
    }

    public Key engineUnwrap(byte[] bArr, String str, int i) throws InvalidKeyException {
        try {
            byte[] engineDoFinal = engineDoFinal(bArr, 0, bArr.length);
            if (i == 3) {
                return new SecretKeySpec(engineDoFinal, str);
            }
            try {
                KeyFactory instance = KeyFactory.getInstance(str, BouncyCastleProvider.PROVIDER_NAME);
                if (i == 1) {
                    return instance.generatePublic(new X509EncodedKeySpec(engineDoFinal));
                }
                if (i == 2) {
                    return instance.generatePrivate(new PKCS8EncodedKeySpec(engineDoFinal));
                }
                throw new InvalidKeyException(a.e0("Unknown key type ", i));
            } catch (NoSuchProviderException e) {
                StringBuilder P0 = a.P0("Unknown key type ");
                P0.append(e.getMessage());
                throw new InvalidKeyException(P0.toString());
            } catch (NoSuchAlgorithmException e2) {
                StringBuilder P02 = a.P0("Unknown key type ");
                P02.append(e2.getMessage());
                throw new InvalidKeyException(P02.toString());
            } catch (InvalidKeySpecException e3) {
                StringBuilder P03 = a.P0("Unknown key type ");
                P03.append(e3.getMessage());
                throw new InvalidKeyException(P03.toString());
            }
        } catch (BadPaddingException e4) {
            throw new InvalidKeyException(e4.getMessage());
        } catch (IllegalBlockSizeException e5) {
            throw new InvalidKeyException(e5.getMessage());
        }
    }

    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return this.cipher.g(bArr, i, i2, bArr2, i3);
    }

    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        int d = this.cipher.d(i2);
        if (d > 0) {
            byte[] bArr2 = new byte[d];
            this.cipher.g(bArr, i, i2, bArr2, 0);
            return bArr2;
        }
        this.cipher.g(bArr, i, i2, (byte[]) null, 0);
        return null;
    }

    public byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        byte[] encoded = key.getEncoded();
        if (encoded != null) {
            try {
                return engineDoFinal(encoded, 0, encoded.length);
            } catch (BadPaddingException e) {
                throw new IllegalBlockSizeException(e.getMessage());
            }
        } else {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
    }
}
