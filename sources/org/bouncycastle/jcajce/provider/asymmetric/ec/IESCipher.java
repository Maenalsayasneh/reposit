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
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.IESUtil;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jce.interfaces.IESKey;
import s0.a.b.b0.v;
import s0.a.b.e;
import s0.a.b.e0.c0;
import s0.a.b.f;
import s0.a.b.f0.k;
import s0.a.b.f0.o;
import s0.a.b.f0.r;
import s0.a.b.h0.g;
import s0.a.b.i;
import s0.a.b.k0.b;
import s0.a.b.k0.c1;
import s0.a.b.k0.v0;
import s0.a.b.k0.w;
import s0.a.b.k0.y;
import s0.a.b.k0.z;
import s0.a.c.o.a;
import s0.a.c.o.c;
import s0.a.d.e.p;
import s0.a.g.j;

public class IESCipher extends CipherSpi {
    private ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    private boolean dhaesMode = false;
    private c0 engine;
    private AlgorithmParameters engineParam = null;
    private p engineSpec = null;
    private final c helper = new a();
    private int ivLength;
    private b key;
    private b otherKeyParameter = null;
    private SecureRandom random;
    private int state = -1;

    public static class ECIES extends IESCipher {
        public ECIES() {
            super(new c0(new s0.a.b.a0.c(), new r(new v()), new g(new v())));
        }
    }

    public static class ECIESwithAESCBC extends ECIESwithCipher {
        public ECIESwithAESCBC() {
            super(new s0.a.b.i0.c(new s0.a.b.e0.a()), 16);
        }
    }

    public static class ECIESwithCipher extends IESCipher {
        public ECIESwithCipher(e eVar, int i) {
            super(new c0(new s0.a.b.a0.c(), new r(new v()), new g(new v()), new s0.a.b.j0.e(eVar)), i);
        }
    }

    public static class ECIESwithDESedeCBC extends ECIESwithCipher {
        public ECIESwithDESedeCBC() {
            super(new s0.a.b.i0.c(new s0.a.b.e0.p()), 8);
        }
    }

    public IESCipher(c0 c0Var) {
        this.engine = c0Var;
        this.ivLength = 0;
    }

    public IESCipher(c0 c0Var, int i) {
        this.engine = c0Var;
        this.ivLength = i;
    }

    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        byte[] engineDoFinal = engineDoFinal(bArr, i, i2);
        System.arraycopy(engineDoFinal, 0, bArr2, i3, engineDoFinal.length);
        return engineDoFinal.length;
    }

    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        if (i2 != 0) {
            this.buffer.write(bArr, i, i2);
        }
        byte[] byteArray = this.buffer.toByteArray();
        this.buffer.reset();
        byte[] a = this.engineSpec.a();
        byte[] b = this.engineSpec.b();
        p pVar = this.engineSpec;
        i v0Var = new v0(a, b, pVar.c, pVar.d);
        if (this.engineSpec.c() != null) {
            v0Var = new c1(v0Var, this.engineSpec.c());
        }
        b bVar = this.key;
        w wVar = ((z) bVar).d;
        b bVar2 = this.otherKeyParameter;
        if (bVar2 != null) {
            try {
                int i3 = this.state;
                if (i3 != 1) {
                    if (i3 != 3) {
                        this.engine.d(false, bVar, bVar2, v0Var);
                        return this.engine.e(byteArray, 0, byteArray.length);
                    }
                }
                this.engine.d(true, bVar2, bVar, v0Var);
                return this.engine.e(byteArray, 0, byteArray.length);
            } catch (Exception e) {
                throw new BadBlockException("unable to process block", e);
            }
        } else {
            int i4 = this.state;
            if (i4 == 1 || i4 == 3) {
                k kVar = new k();
                kVar.a(new y(wVar, this.random));
                final boolean z = this.engineSpec.f;
                o oVar = new o(kVar, new s0.a.b.p() {
                    public byte[] getEncoded(b bVar) {
                        return ((s0.a.b.k0.c0) bVar).q.i(z);
                    }
                });
                try {
                    c0 c0Var = this.engine;
                    b bVar3 = this.key;
                    c0Var.e = true;
                    c0Var.g = bVar3;
                    c0Var.j = oVar;
                    c0Var.c(v0Var);
                    return this.engine.e(byteArray, 0, byteArray.length);
                } catch (Exception e2) {
                    throw new BadBlockException("unable to process block", e2);
                }
            } else if (i4 == 2 || i4 == 4) {
                try {
                    c0 c0Var2 = this.engine;
                    s0.a.b.l0.b bVar4 = new s0.a.b.l0.b(wVar);
                    c0Var2.e = false;
                    c0Var2.f = bVar;
                    c0Var2.k = bVar4;
                    c0Var2.c(v0Var);
                    return this.engine.e(byteArray, 0, byteArray.length);
                } catch (InvalidCipherTextException e3) {
                    throw new BadBlockException("unable to process block", e3);
                }
            } else {
                throw new IllegalStateException("cipher not initialised");
            }
        }
    }

    public int engineGetBlockSize() {
        f fVar = this.engine.d;
        if (fVar != null) {
            return fVar.b();
        }
        return 0;
    }

    public byte[] engineGetIV() {
        p pVar = this.engineSpec;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public int engineGetKeySize(Key key2) {
        if (key2 instanceof s0.a.d.d.a) {
            return ((s0.a.d.d.a) key2).getParameters().a.l();
        }
        throw new IllegalArgumentException("not an EC key");
    }

    public int engineGetOutputSize(int i) {
        int i2;
        if (this.key != null) {
            int macSize = this.engine.c.getMacSize();
            int l = this.otherKeyParameter == null ? ((((z) this.key).d.g.l() + 7) / 8) * 2 : 0;
            f fVar = this.engine.d;
            if (fVar != null) {
                int i3 = this.state;
                if (!(i3 == 1 || i3 == 3)) {
                    if (i3 == 2 || i3 == 4) {
                        i = (i - macSize) - l;
                    } else {
                        throw new IllegalStateException("cipher not initialised");
                    }
                }
                i = fVar.c(i);
            }
            int i4 = this.state;
            if (i4 == 1 || i4 == 3) {
                i2 = this.buffer.size() + macSize + 1 + l;
            } else if (i4 == 2 || i4 == 4) {
                i2 = (this.buffer.size() - macSize) - l;
            } else {
                throw new IllegalStateException("cipher not initialised");
            }
            return i2 + i;
        }
        throw new IllegalStateException("cipher not initialised");
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.engineParam == null && this.engineSpec != null) {
            try {
                AlgorithmParameters f = this.helper.f("IES");
                this.engineParam = f;
                f.init(this.engineSpec);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.engineParam;
    }

    public void engineInit(int i, Key key2, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec;
        if (algorithmParameters != null) {
            try {
                algorithmParameterSpec = algorithmParameters.getParameterSpec(p.class);
            } catch (Exception e) {
                throw new InvalidAlgorithmParameterException(i0.d.a.a.a.b0(e, i0.d.a.a.a.P0("cannot recognise parameters: ")));
            }
        } else {
            algorithmParameterSpec = null;
        }
        this.engineParam = algorithmParameters;
        engineInit(i, key2, algorithmParameterSpec, secureRandom);
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
        p pVar;
        b bVar;
        PrivateKey privateKey;
        byte[] bArr = null;
        this.otherKeyParameter = null;
        if (algorithmParameterSpec == null) {
            int i2 = this.ivLength;
            if (i2 != 0 && i == 1) {
                bArr = new byte[i2];
                secureRandom.nextBytes(bArr);
            }
            pVar = IESUtil.guessParameterSpec(this.engine.d, bArr);
        } else if (algorithmParameterSpec instanceof p) {
            pVar = (p) algorithmParameterSpec;
        } else {
            throw new InvalidAlgorithmParameterException("must be passed IES parameters");
        }
        this.engineSpec = pVar;
        byte[] c = this.engineSpec.c();
        int i3 = this.ivLength;
        if (i3 == 0 || (c != null && c.length == i3)) {
            if (i == 1 || i == 3) {
                if (key2 instanceof PublicKey) {
                    bVar = ECUtils.generatePublicKeyParameter((PublicKey) key2);
                } else if (key2 instanceof IESKey) {
                    IESKey iESKey = (IESKey) key2;
                    this.key = ECUtils.generatePublicKeyParameter(iESKey.K());
                    this.otherKeyParameter = ECUtil.generatePrivateKeyParameter(iESKey.S());
                    this.random = secureRandom;
                    this.state = i;
                    this.buffer.reset();
                    return;
                } else {
                    throw new InvalidKeyException("must be passed recipient's public EC key for encryption");
                }
            } else if (i == 2 || i == 4) {
                if (key2 instanceof PrivateKey) {
                    privateKey = (PrivateKey) key2;
                } else if (key2 instanceof IESKey) {
                    IESKey iESKey2 = (IESKey) key2;
                    this.otherKeyParameter = ECUtils.generatePublicKeyParameter(iESKey2.K());
                    privateKey = iESKey2.S();
                } else {
                    throw new InvalidKeyException("must be passed recipient's private EC key for decryption");
                }
                bVar = ECUtil.generatePrivateKeyParameter(privateKey);
            } else {
                throw new InvalidKeyException("must be passed EC key");
            }
            this.key = bVar;
            this.random = secureRandom;
            this.state = i;
            this.buffer.reset();
            return;
        }
        throw new InvalidAlgorithmParameterException(i0.d.a.a.a.u0(i0.d.a.a.a.P0("NONCE in IES Parameters needs to be "), this.ivLength, " bytes long"));
    }

    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        boolean z;
        String g = j.g(str);
        if (g.equals("NONE")) {
            z = false;
        } else if (g.equals("DHAES")) {
            z = true;
        } else {
            throw new IllegalArgumentException(i0.d.a.a.a.n0("can't support mode ", str));
        }
        this.dhaesMode = z;
    }

    public void engineSetPadding(String str) throws NoSuchPaddingException {
        String g = j.g(str);
        if (!g.equals("NOPADDING") && !g.equals("PKCS5PADDING") && !g.equals("PKCS7PADDING")) {
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
