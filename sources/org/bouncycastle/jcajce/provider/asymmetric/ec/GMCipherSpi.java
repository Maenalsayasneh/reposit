package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import org.bouncycastle.crypto.engines.SM2Engine;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import s0.a.b.b0.a0;
import s0.a.b.b0.d0;
import s0.a.b.b0.h0;
import s0.a.b.b0.p;
import s0.a.b.b0.s;
import s0.a.b.b0.v;
import s0.a.b.b0.w;
import s0.a.b.b0.x;
import s0.a.b.b0.y;
import s0.a.b.j;
import s0.a.b.k0.b;
import s0.a.b.k0.d1;
import s0.a.c.o.a;
import s0.a.c.o.c;

public class GMCipherSpi extends CipherSpi {
    private ErasableOutputStream buffer = new ErasableOutputStream();
    private SM2Engine engine;
    private final c helper = new a();
    private b key;
    private SecureRandom random;
    private int state = -1;

    public static final class ErasableOutputStream extends ByteArrayOutputStream {
        public void erase() {
            Arrays.fill(this.buf, (byte) 0);
            reset();
        }

        public byte[] getBuf() {
            return this.buf;
        }
    }

    public static class SM2 extends GMCipherSpi {
        public SM2() {
            super(new SM2Engine(new d0()));
        }
    }

    public static class SM2withBlake2b extends GMCipherSpi {
        public SM2withBlake2b() {
            super(new SM2Engine(new s0.a.b.b0.a(512)));
        }
    }

    public static class SM2withBlake2s extends GMCipherSpi {
        public SM2withBlake2s() {
            super(new SM2Engine(new s0.a.b.b0.b(256)));
        }
    }

    public static class SM2withMD5 extends GMCipherSpi {
        public SM2withMD5() {
            super(new SM2Engine(new p()));
        }
    }

    public static class SM2withRMD extends GMCipherSpi {
        public SM2withRMD() {
            super(new SM2Engine(new s()));
        }
    }

    public static class SM2withSha1 extends GMCipherSpi {
        public SM2withSha1() {
            super(new SM2Engine(new v()));
        }
    }

    public static class SM2withSha224 extends GMCipherSpi {
        public SM2withSha224() {
            super(new SM2Engine(new w()));
        }
    }

    public static class SM2withSha256 extends GMCipherSpi {
        public SM2withSha256() {
            super(new SM2Engine(new x()));
        }
    }

    public static class SM2withSha384 extends GMCipherSpi {
        public SM2withSha384() {
            super(new SM2Engine(new y()));
        }
    }

    public static class SM2withSha512 extends GMCipherSpi {
        public SM2withSha512() {
            super(new SM2Engine(new a0()));
        }
    }

    public static class SM2withWhirlpool extends GMCipherSpi {
        public SM2withWhirlpool() {
            super(new SM2Engine(new h0()));
        }
    }

    public GMCipherSpi(SM2Engine sM2Engine) {
        this.engine = sM2Engine;
    }

    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        byte[] engineDoFinal = engineDoFinal(bArr, i, i2);
        System.arraycopy(engineDoFinal, 0, bArr2, i3, engineDoFinal.length);
        return engineDoFinal.length;
    }

    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        byte[] d;
        if (i2 != 0) {
            this.buffer.write(bArr, i, i2);
        }
        try {
            int i3 = this.state;
            if (i3 == 1 || i3 == 3) {
                this.engine.b(true, new d1(this.key, this.random));
                d = this.engine.d(this.buffer.getBuf(), 0, this.buffer.size());
            } else if (i3 == 2 || i3 == 4) {
                this.engine.b(false, this.key);
                d = this.engine.d(this.buffer.getBuf(), 0, this.buffer.size());
            } else {
                throw new IllegalStateException("cipher not initialised");
            }
            this.buffer.erase();
            return d;
        } catch (Exception e) {
            throw new BadBlockException("unable to process block", e);
        } catch (Exception e2) {
            throw new BadBlockException("unable to process block", e2);
        } catch (Throwable th) {
            this.buffer.erase();
            throw th;
        }
    }

    public int engineGetBlockSize() {
        return 0;
    }

    public byte[] engineGetIV() {
        return null;
    }

    public int engineGetKeySize(Key key2) {
        if (key2 instanceof s0.a.d.d.a) {
            return ((s0.a.d.d.a) key2).getParameters().a.l();
        }
        throw new IllegalArgumentException("not an EC key");
    }

    public int engineGetOutputSize(int i) {
        SM2Engine sM2Engine;
        int i2 = this.state;
        if (i2 == 1 || i2 == 3) {
            sM2Engine = this.engine;
        } else if (i2 == 2 || i2 == 4) {
            sM2Engine = this.engine;
        } else {
            throw new IllegalStateException("cipher not initialised");
        }
        return sM2Engine.a.getDigestSize() + (sM2Engine.f * 2) + 1 + i;
    }

    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    public void engineInit(int i, Key key2, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameters == null) {
            engineInit(i, key2, (AlgorithmParameterSpec) null, secureRandom);
            return;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("cannot recognise parameters: ");
        P0.append(algorithmParameters.getClass().getName());
        throw new InvalidAlgorithmParameterException(P0.toString());
    }

    public void engineInit(int i, Key key2, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key2, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            StringBuilder P0 = i0.d.a.a.a.P0("cannot handle supplied parameter spec: ");
            P0.append(e.getMessage());
            throw new IllegalArgumentException(P0.toString());
        }
    }

    public void engineInit(int i, Key key2, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException, InvalidKeyException {
        b bVar;
        if (i == 1 || i == 3) {
            if (key2 instanceof PublicKey) {
                bVar = ECUtils.generatePublicKeyParameter((PublicKey) key2);
            } else {
                throw new InvalidKeyException("must be passed public EC key for encryption");
            }
        } else if (i != 2 && i != 4) {
            throw new InvalidKeyException("must be passed EC key");
        } else if (key2 instanceof PrivateKey) {
            bVar = ECUtil.generatePrivateKeyParameter((PrivateKey) key2);
        } else {
            throw new InvalidKeyException("must be passed private EC key for decryption");
        }
        this.key = bVar;
        if (secureRandom != null) {
            this.random = secureRandom;
        } else {
            this.random = j.a();
        }
        this.state = i;
        this.buffer.reset();
    }

    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        if (!s0.a.g.j.g(str).equals("NONE")) {
            throw new IllegalArgumentException(i0.d.a.a.a.n0("can't support mode ", str));
        }
    }

    public void engineSetPadding(String str) throws NoSuchPaddingException {
        if (!s0.a.g.j.g(str).equals("NOPADDING")) {
            throw new NoSuchPaddingException("padding not available with IESCipher");
        }
    }

    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.buffer.write(bArr, i, i2);
        return 0;
    }

    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.buffer.write(bArr, i, i2);
        return null;
    }
}
