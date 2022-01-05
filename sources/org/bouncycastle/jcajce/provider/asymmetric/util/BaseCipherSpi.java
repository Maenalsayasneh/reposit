package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import s0.a.a.w2.p;
import s0.a.b.y;
import s0.a.c.o.a;
import s0.a.c.o.c;

public abstract class BaseCipherSpi extends CipherSpi {
    private Class[] availableSpecs = {IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};
    public AlgorithmParameters engineParams = null;
    private final c helper = new a();
    private byte[] iv;
    private int ivSize;
    public y wrapEngine = null;

    public static final class ErasableOutputStream extends ByteArrayOutputStream {
        public void erase() {
            Arrays.fill(this.buf, (byte) 0);
            reset();
        }

        public byte[] getBuf() {
            return this.buf;
        }
    }

    public final AlgorithmParameters createParametersInstance(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return this.helper.f(str);
    }

    public int engineGetBlockSize() {
        return 0;
    }

    public byte[] engineGetIV() {
        return null;
    }

    public int engineGetKeySize(Key key) {
        return key.getEncoded().length;
    }

    public int engineGetOutputSize(int i) {
        return -1;
    }

    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(i0.d.a.a.a.n0("can't support mode ", str));
    }

    public void engineSetPadding(String str) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(i0.d.a.a.a.o0("Padding ", str, " unknown."));
    }

    public Key engineUnwrap(byte[] bArr, String str, int i) throws InvalidKeyException {
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
                } catch (NoSuchAlgorithmException e) {
                    StringBuilder P0 = i0.d.a.a.a.P0("Unknown key type ");
                    P0.append(e.getMessage());
                    throw new InvalidKeyException(P0.toString());
                } catch (InvalidKeySpecException e2) {
                    StringBuilder P02 = i0.d.a.a.a.P0("Unknown key type ");
                    P02.append(e2.getMessage());
                    throw new InvalidKeyException(P02.toString());
                } catch (NoSuchProviderException e3) {
                    StringBuilder P03 = i0.d.a.a.a.P0("Unknown key type ");
                    P03.append(e3.getMessage());
                    throw new InvalidKeyException(P03.toString());
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
        } catch (InvalidCipherTextException e4) {
            throw new InvalidKeyException(e4.getMessage());
        } catch (BadPaddingException e5) {
            throw new InvalidKeyException("unable to unwrap") {
                public synchronized Throwable getCause() {
                    return e5;
                }
            };
        } catch (IllegalBlockSizeException e6) {
            throw new InvalidKeyException(e6.getMessage());
        }
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
