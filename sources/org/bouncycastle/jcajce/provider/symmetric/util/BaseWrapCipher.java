package org.bouncycastle.jcajce.provider.symmetric.util;

import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import s0.a.a.w2.p;
import s0.a.b.k0.c1;
import s0.a.b.k0.d1;
import s0.a.b.k0.e1;
import s0.a.b.k0.f1;
import s0.a.b.k0.y0;
import s0.a.b.y;
import s0.a.c.n.i;
import s0.a.c.o.a;
import s0.a.c.o.c;
import s0.a.e.b.b0.c.h3;

public abstract class BaseWrapCipher extends CipherSpi implements PBE {
    private Class[] availableSpecs;
    public AlgorithmParameters engineParams;
    private boolean forWrapping;
    private final c helper;
    private byte[] iv;
    private int ivSize;
    public int pbeHash;
    public int pbeIvSize;
    public int pbeKeySize;
    public int pbeType;
    public y wrapEngine;
    private ErasableOutputStream wrapStream;

    public static final class ErasableOutputStream extends ByteArrayOutputStream {
        public void erase() {
            Arrays.fill(this.buf, (byte) 0);
            reset();
        }

        public byte[] getBuf() {
            return this.buf;
        }
    }

    public static class InvalidKeyOrParametersException extends InvalidKeyException {
        private final Throwable cause;

        public InvalidKeyOrParametersException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        public Throwable getCause() {
            return this.cause;
        }
    }

    public BaseWrapCipher() {
        this.availableSpecs = new Class[]{i.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.engineParams = null;
        this.wrapEngine = null;
        this.wrapStream = null;
        this.helper = new a();
    }

    public BaseWrapCipher(y yVar) {
        this(yVar, 0);
    }

    public BaseWrapCipher(y yVar, int i) {
        this.availableSpecs = new Class[]{i.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.engineParams = null;
        this.wrapEngine = null;
        this.wrapStream = null;
        this.helper = new a();
        this.wrapEngine = yVar;
        this.ivSize = i;
    }

    public final AlgorithmParameters createParametersInstance(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return this.helper.f(str);
    }

    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalBlockSizeException, BadPaddingException, ShortBufferException {
        ErasableOutputStream erasableOutputStream = this.wrapStream;
        if (erasableOutputStream != null) {
            erasableOutputStream.write(bArr, i, i2);
            try {
                byte[] b = this.forWrapping ? this.wrapEngine.b(this.wrapStream.getBuf(), 0, this.wrapStream.size()) : this.wrapEngine.a(this.wrapStream.getBuf(), 0, this.wrapStream.size());
                if (b.length + i3 <= bArr2.length) {
                    System.arraycopy(b, 0, bArr2, i3, b.length);
                    int length = b.length;
                    this.wrapStream.erase();
                    return length;
                }
                throw new ShortBufferException("output buffer too short for input.");
            } catch (InvalidCipherTextException e) {
                throw new BadPaddingException(e.getMessage());
            } catch (Exception e2) {
                throw new IllegalBlockSizeException(e2.getMessage());
            } catch (Throwable th) {
                this.wrapStream.erase();
                throw th;
            }
        } else {
            throw new IllegalStateException("not supported in a wrapping mode");
        }
    }

    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        ErasableOutputStream erasableOutputStream = this.wrapStream;
        if (erasableOutputStream != null) {
            if (bArr != null) {
                erasableOutputStream.write(bArr, i, i2);
            }
            try {
                byte[] b = this.forWrapping ? this.wrapEngine.b(this.wrapStream.getBuf(), 0, this.wrapStream.size()) : this.wrapEngine.a(this.wrapStream.getBuf(), 0, this.wrapStream.size());
                this.wrapStream.erase();
                return b;
            } catch (InvalidCipherTextException e) {
                throw new BadPaddingException(e.getMessage());
            } catch (Exception e2) {
                throw new IllegalBlockSizeException(e2.getMessage());
            } catch (Throwable th) {
                this.wrapStream.erase();
                throw th;
            }
        } else {
            throw new IllegalStateException("not supported in a wrapping mode");
        }
    }

    public int engineGetBlockSize() {
        return 0;
    }

    public byte[] engineGetIV() {
        return h3.I(this.iv);
    }

    public int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    public int engineGetOutputSize(int i) {
        return -1;
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.iv != null) {
            String algorithmName = this.wrapEngine.getAlgorithmName();
            if (algorithmName.indexOf(47) >= 0) {
                algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
            }
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance(algorithmName);
                this.engineParams = createParametersInstance;
                createParametersInstance.init(new IvParameterSpec(this.iv));
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.engineParams;
    }

    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec;
        if (algorithmParameters != null) {
            algorithmParameterSpec = SpecUtil.extractSpec(algorithmParameters, this.availableSpecs);
            if (algorithmParameterSpec == null) {
                StringBuilder P0 = i0.d.a.a.a.P0("can't handle parameter ");
                P0.append(algorithmParameters.toString());
                throw new InvalidAlgorithmParameterException(P0.toString());
            }
        } else {
            algorithmParameterSpec = null;
        }
        this.engineParams = algorithmParameters;
        engineInit(i, key, algorithmParameterSpec, secureRandom);
    }

    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyOrParametersException(e.getMessage(), e);
        }
    }

    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        c1 c1Var;
        int i2;
        if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                c1Var = PBE.Util.makePBEParameters(bCPBEKey, algorithmParameterSpec, this.wrapEngine.getAlgorithmName());
            } else if (bCPBEKey.getParam() != null) {
                c1Var = bCPBEKey.getParam();
            } else {
                throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
            }
        } else {
            c1Var = new y0(key.getEncoded());
        }
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            byte[] iv2 = ((IvParameterSpec) algorithmParameterSpec).getIV();
            this.iv = iv2;
            c1Var = new c1(c1Var, iv2);
        }
        if (algorithmParameterSpec instanceof i) {
            Objects.requireNonNull((i) algorithmParameterSpec);
            byte[] I = h3.I((byte[]) null);
            if (I != null) {
                c1Var = new e1(c1Var, I);
            }
            c1Var = new f1(c1Var, h3.I((byte[]) null));
        }
        if ((c1Var instanceof y0) && (i2 = this.ivSize) != 0 && (i == 3 || i == 1)) {
            byte[] bArr = new byte[i2];
            this.iv = bArr;
            secureRandom.nextBytes(bArr);
            c1Var = new c1(c1Var, this.iv);
        }
        if (secureRandom != null) {
            c1Var = new d1(c1Var, secureRandom);
        }
        if (i != 1) {
            if (i == 2) {
                this.wrapEngine.init(false, c1Var);
                this.wrapStream = new ErasableOutputStream();
            } else if (i == 3) {
                this.wrapEngine.init(true, c1Var);
                this.wrapStream = null;
            } else if (i == 4) {
                try {
                    this.wrapEngine.init(false, c1Var);
                    this.wrapStream = null;
                } catch (Exception e) {
                    throw new InvalidKeyOrParametersException(e.getMessage(), e);
                }
            } else {
                throw new InvalidParameterException("Unknown mode parameter passed to init.");
            }
            this.forWrapping = false;
            return;
        }
        this.wrapEngine.init(true, c1Var);
        this.wrapStream = new ErasableOutputStream();
        this.forWrapping = true;
    }

    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(i0.d.a.a.a.n0("can't support mode ", str));
    }

    public void engineSetPadding(String str) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(i0.d.a.a.a.o0("Padding ", str, " unknown."));
    }

    public Key engineUnwrap(byte[] bArr, String str, int i) throws InvalidKeyException, NoSuchAlgorithmException {
        try {
            y yVar = this.wrapEngine;
            byte[] engineDoFinal = yVar == null ? engineDoFinal(bArr, 0, bArr.length) : yVar.a(bArr, 0, bArr.length);
            if (i == 3) {
                return new SecretKeySpec(engineDoFinal, str);
            }
            if (!str.equals("") || i != 2) {
                try {
                    KeyFactory h = this.helper.h(str);
                    if (i == 1) {
                        return h.generatePublic(new X509EncodedKeySpec(engineDoFinal));
                    }
                    if (i == 2) {
                        return h.generatePrivate(new PKCS8EncodedKeySpec(engineDoFinal));
                    }
                    throw new InvalidKeyException(i0.d.a.a.a.e0("Unknown key type ", i));
                } catch (NoSuchProviderException e) {
                    StringBuilder P0 = i0.d.a.a.a.P0("Unknown key type ");
                    P0.append(e.getMessage());
                    throw new InvalidKeyException(P0.toString());
                } catch (InvalidKeySpecException e2) {
                    StringBuilder P02 = i0.d.a.a.a.P0("Unknown key type ");
                    P02.append(e2.getMessage());
                    throw new InvalidKeyException(P02.toString());
                }
            } else {
                try {
                    p s = p.s(engineDoFinal);
                    PrivateKey privateKey = BouncyCastleProvider.getPrivateKey(s);
                    if (privateKey != null) {
                        return privateKey;
                    }
                    throw new InvalidKeyException("algorithm " + s.d.c + " not supported");
                } catch (Exception unused) {
                    throw new InvalidKeyException("Invalid key encoding.");
                }
            }
        } catch (InvalidCipherTextException e3) {
            throw new InvalidKeyException(e3.getMessage());
        } catch (BadPaddingException e4) {
            throw new InvalidKeyException(e4.getMessage());
        } catch (IllegalBlockSizeException e5) {
            throw new InvalidKeyException(e5.getMessage());
        }
    }

    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        ErasableOutputStream erasableOutputStream = this.wrapStream;
        if (erasableOutputStream != null) {
            erasableOutputStream.write(bArr, i, i2);
            return 0;
        }
        throw new IllegalStateException("not supported in a wrapping mode");
    }

    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        ErasableOutputStream erasableOutputStream = this.wrapStream;
        if (erasableOutputStream != null) {
            erasableOutputStream.write(bArr, i, i2);
            return null;
        }
        throw new IllegalStateException("not supported in a wrapping mode");
    }

    public byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        byte[] encoded = key.getEncoded();
        if (encoded != null) {
            try {
                y yVar = this.wrapEngine;
                return yVar == null ? engineDoFinal(encoded, 0, encoded.length) : yVar.b(encoded, 0, encoded.length);
            } catch (BadPaddingException e) {
                throw new IllegalBlockSizeException(e.getMessage());
            }
        } else {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
    }
}
