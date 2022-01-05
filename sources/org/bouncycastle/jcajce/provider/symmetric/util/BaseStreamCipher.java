package org.bouncycastle.jcajce.provider.symmetric.util;

import i0.d.a.a.a;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jcajce.PKCS12KeyWithParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import s0.a.b.i;
import s0.a.b.j;
import s0.a.b.k0.c1;
import s0.a.b.k0.y0;
import s0.a.b.x;

public class BaseStreamCipher extends BaseWrapCipher implements PBE {
    private Class[] availableSpecs;
    private x cipher;
    private int digest;
    private int ivLength;
    private c1 ivParam;
    private int keySizeInBits;
    private String pbeAlgorithm;
    private PBEParameterSpec pbeSpec;

    public BaseStreamCipher(x xVar, int i) {
        this(xVar, i, -1, -1);
    }

    public BaseStreamCipher(x xVar, int i, int i2) {
        this(xVar, i, i2, -1);
    }

    public BaseStreamCipher(x xVar, int i, int i2, int i3) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.ivLength = 0;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.cipher = xVar;
        this.ivLength = i;
        this.keySizeInBits = i2;
        this.digest = i3;
    }

    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        if (i3 + i2 <= bArr2.length) {
            if (i2 != 0) {
                this.cipher.processBytes(bArr, i, i2, bArr2, i3);
            }
            this.cipher.reset();
            return i2;
        }
        throw new ShortBufferException("output buffer too short for input.");
    }

    public byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            byte[] engineUpdate = engineUpdate(bArr, i, i2);
            this.cipher.reset();
            return engineUpdate;
        }
        this.cipher.reset();
        return new byte[0];
    }

    public int engineGetBlockSize() {
        return 0;
    }

    public byte[] engineGetIV() {
        c1 c1Var = this.ivParam;
        if (c1Var != null) {
            return c1Var.c;
        }
        return null;
    }

    public int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    public int engineGetOutputSize(int i) {
        return i;
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null) {
            if (this.pbeSpec != null) {
                try {
                    AlgorithmParameters createParametersInstance = createParametersInstance(this.pbeAlgorithm);
                    createParametersInstance.init(this.pbeSpec);
                    return createParametersInstance;
                } catch (Exception unused) {
                    return null;
                }
            } else if (this.ivParam != null) {
                String algorithmName = this.cipher.getAlgorithmName();
                if (algorithmName.indexOf(47) >= 0) {
                    algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
                }
                if (algorithmName.startsWith("ChaCha7539")) {
                    algorithmName = "ChaCha7539";
                } else if (algorithmName.startsWith("Grain")) {
                    algorithmName = "Grainv1";
                } else if (algorithmName.startsWith("HC")) {
                    int indexOf = algorithmName.indexOf(45);
                    algorithmName = algorithmName.substring(0, indexOf) + algorithmName.substring(indexOf + 1);
                }
                try {
                    AlgorithmParameters createParametersInstance2 = createParametersInstance(algorithmName);
                    this.engineParams = createParametersInstance2;
                    createParametersInstance2.init(new IvParameterSpec(this.ivParam.c));
                } catch (Exception e) {
                    throw new RuntimeException(e.toString());
                }
            }
        }
        return this.engineParams;
    }

    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec;
        if (algorithmParameters != null) {
            algorithmParameterSpec = SpecUtil.extractSpec(algorithmParameters, this.availableSpecs);
            if (algorithmParameterSpec == null) {
                StringBuilder P0 = a.P0("can't handle parameter ");
                P0.append(algorithmParameters.toString());
                throw new InvalidAlgorithmParameterException(P0.toString());
            }
        } else {
            algorithmParameterSpec = null;
        }
        engineInit(i, key, algorithmParameterSpec, secureRandom);
        this.engineParams = algorithmParameters;
    }

    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        c1 c1Var;
        i iVar;
        String str;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.engineParams = null;
        if (key instanceof SecretKey) {
            if (key instanceof PKCS12Key) {
                PKCS12Key pKCS12Key = (PKCS12Key) key;
                PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                this.pbeSpec = pBEParameterSpec;
                if ((pKCS12Key instanceof PKCS12KeyWithParameters) && pBEParameterSpec == null) {
                    PKCS12KeyWithParameters pKCS12KeyWithParameters = (PKCS12KeyWithParameters) pKCS12Key;
                    Objects.requireNonNull(pKCS12KeyWithParameters);
                    Objects.requireNonNull(pKCS12KeyWithParameters);
                    this.pbeSpec = new PBEParameterSpec((byte[]) null, 0);
                }
                c1Var = PBE.Util.makePBEParameters(pKCS12Key.getEncoded(), 2, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
            } else {
                if (key instanceof BCPBEKey) {
                    BCPBEKey bCPBEKey = (BCPBEKey) key;
                    if (bCPBEKey.getOID() != null) {
                        str = bCPBEKey.getOID().d;
                    } else {
                        str = bCPBEKey.getAlgorithm();
                    }
                    this.pbeAlgorithm = str;
                    if (bCPBEKey.getParam() != null) {
                        iVar = bCPBEKey.getParam();
                        this.pbeSpec = new PBEParameterSpec(bCPBEKey.getSalt(), bCPBEKey.getIterationCount());
                    } else if (algorithmParameterSpec instanceof PBEParameterSpec) {
                        i makePBEParameters = PBE.Util.makePBEParameters(bCPBEKey, algorithmParameterSpec, this.cipher.getAlgorithmName());
                        this.pbeSpec = (PBEParameterSpec) algorithmParameterSpec;
                        iVar = makePBEParameters;
                    } else {
                        throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                    }
                    if (bCPBEKey.getIvSize() != 0) {
                        this.ivParam = (c1) iVar;
                    }
                } else if (algorithmParameterSpec == null) {
                    if (this.digest <= 0) {
                        iVar = new y0(key.getEncoded());
                    } else {
                        throw new InvalidKeyException("Algorithm requires a PBE key");
                    }
                } else if (algorithmParameterSpec instanceof IvParameterSpec) {
                    c1 c1Var2 = new c1(new y0(key.getEncoded()), ((IvParameterSpec) algorithmParameterSpec).getIV());
                    this.ivParam = c1Var2;
                    c1Var = c1Var2;
                } else {
                    throw new InvalidAlgorithmParameterException("unknown parameter type.");
                }
                c1Var = iVar;
            }
            if (this.ivLength != 0 && !(c1Var instanceof c1)) {
                if (secureRandom == null) {
                    secureRandom = j.a();
                }
                if (i == 1 || i == 3) {
                    byte[] bArr = new byte[this.ivLength];
                    secureRandom.nextBytes(bArr);
                    c1 c1Var3 = new c1(c1Var, bArr);
                    this.ivParam = c1Var3;
                    c1Var = c1Var3;
                } else {
                    throw new InvalidAlgorithmParameterException("no IV set when one expected");
                }
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            try {
                                throw new InvalidParameterException("unknown opmode " + i + " passed");
                            } catch (Exception e) {
                                throw new InvalidKeyException(e.getMessage());
                            }
                        }
                    }
                }
                this.cipher.init(false, c1Var);
                return;
            }
            this.cipher.init(true, c1Var);
            return;
        }
        StringBuilder P0 = a.P0("Key for algorithm ");
        P0.append(key.getAlgorithm());
        P0.append(" not suitable for symmetric enryption.");
        throw new InvalidKeyException(P0.toString());
    }

    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        if (!str.equalsIgnoreCase("ECB") && !str.equals("NONE")) {
            throw new NoSuchAlgorithmException(a.n0("can't support mode ", str));
        }
    }

    public void engineSetPadding(String str) throws NoSuchPaddingException {
        if (!str.equalsIgnoreCase("NoPadding")) {
            throw new NoSuchPaddingException(a.o0("Padding ", str, " unknown."));
        }
    }

    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        if (i3 + i2 <= bArr2.length) {
            try {
                this.cipher.processBytes(bArr, i, i2, bArr2, i3);
                return i2;
            } catch (DataLengthException e) {
                throw new IllegalStateException(e.getMessage());
            }
        } else {
            throw new ShortBufferException("output buffer too short for input.");
        }
    }

    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.cipher.processBytes(bArr, i, i2, bArr2, 0);
        return bArr2;
    }
}
