package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import s0.a.a.c3.m0;
import s0.a.a.j;
import s0.a.a.n;
import s0.a.a.o;
import s0.a.a.s;
import s0.a.a.w2.p;
import s0.a.a.x0;
import s0.a.b.k0.b;
import s0.a.b.k0.e0;
import s0.a.b.k0.f0;
import s0.a.b.o0.a;
import s0.a.c.n.l;
import s0.a.c.n.m;
import s0.a.d.e.q;
import s0.a.d.e.r;
import s0.a.g.k.d;

public class KeyFactorySpi extends BaseKeyFactorySpi implements AsymmetricKeyInfoConverter {
    public static final byte[] Ed25519Prefix = d.a("302a300506032b6570032100");
    private static final byte Ed25519_type = 112;
    public static final byte[] Ed448Prefix = d.a("3043300506032b6571033a00");
    private static final byte Ed448_type = 113;
    public static final byte[] x25519Prefix = d.a("302a300506032b656e032100");
    private static final byte x25519_type = 110;
    public static final byte[] x448Prefix = d.a("3042300506032b656f033900");
    private static final byte x448_type = 111;
    public String algorithm;
    private final boolean isXdh;
    private final int specificBase;

    public static class Ed25519 extends KeyFactorySpi {
        public Ed25519() {
            super("Ed25519", false, 112);
        }
    }

    public static class Ed448 extends KeyFactorySpi {
        public Ed448() {
            super("Ed448", false, 113);
        }
    }

    public static class EdDSA extends KeyFactorySpi {
        public EdDSA() {
            super("EdDSA", false, 0);
        }
    }

    public static class X25519 extends KeyFactorySpi {
        public X25519() {
            super("X25519", true, 110);
        }
    }

    public static class X448 extends KeyFactorySpi {
        public X448() {
            super("X448", true, 111);
        }
    }

    public static class XDH extends KeyFactorySpi {
        public XDH() {
            super("XDH", true, 0);
        }
    }

    public KeyFactorySpi(String str, boolean z, int i) {
        this.algorithm = str;
        this.isXdh = z;
        this.specificBase = i;
    }

    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof l)) {
            return super.engineGeneratePrivate(keySpec);
        }
        b c = a.c(((l) keySpec).getEncoded());
        if (c instanceof e0) {
            return new BCEdDSAPrivateKey((b) (e0) c);
        }
        throw new IllegalStateException("openssh private key not Ed25519 private key");
    }

    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            byte[] encoded = ((X509EncodedKeySpec) keySpec).getEncoded();
            int i = this.specificBase;
            if (i == 0 || i == encoded[8]) {
                if (encoded[9] == 5 && encoded[10] == 0) {
                    m0 s = m0.s(encoded);
                    try {
                        encoded = new m0(new s0.a.a.c3.b(s.c.c), s.d.B()).r("DER");
                    } catch (IOException e) {
                        throw new InvalidKeySpecException(i0.d.a.a.a.V(e, i0.d.a.a.a.P0("attempt to reconstruct key failed: ")));
                    }
                }
                switch (encoded[8]) {
                    case 110:
                        return new BCXDHPublicKey(x25519Prefix, encoded);
                    case 111:
                        return new BCXDHPublicKey(x448Prefix, encoded);
                    case 112:
                        return new BCEdDSAPublicKey(Ed25519Prefix, encoded);
                    case 113:
                        return new BCEdDSAPublicKey(Ed448Prefix, encoded);
                    default:
                        return super.engineGeneratePublic(keySpec);
                }
            }
        } else if (keySpec instanceof m) {
            b S2 = m0.r.t.a.r.m.a1.a.S2(((m) keySpec).getEncoded());
            if (S2 instanceof f0) {
                return new BCEdDSAPublicKey(new byte[0], ((f0) S2).getEncoded());
            }
            throw new IllegalStateException("openssh public key not Ed25519 public key");
        }
        return super.engineGeneratePublic(keySpec);
    }

    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(l.class) && (key instanceof BCEdDSAPrivateKey)) {
            try {
                return new l(a.b(new e0(o.B(new j(((x0) s.B(key.getEncoded()).D(2)).c).i()).c, 0)));
            } catch (IOException e) {
                throw new InvalidKeySpecException(e.getMessage(), e.getCause());
            }
        } else if (cls.isAssignableFrom(m.class) && (key instanceof BCEdDSAPublicKey)) {
            try {
                return new m(m0.r.t.a.r.m.a1.a.m1(new f0(key.getEncoded(), Ed25519Prefix.length)));
            } catch (IOException e2) {
                throw new InvalidKeySpecException(e2.getMessage(), e2.getCause());
            }
        } else if (cls.isAssignableFrom(q.class) && (key instanceof BCEdDSAPrivateKey)) {
            try {
                return new q(a.b(new e0(o.B(new j(((x0) s.B(key.getEncoded()).D(2)).c).i()).c, 0)));
            } catch (IOException e3) {
                throw new InvalidKeySpecException(e3.getMessage(), e3.getCause());
            }
        } else if (!cls.isAssignableFrom(r.class) || !(key instanceof BCEdDSAPublicKey)) {
            return super.engineGetKeySpec(key, cls);
        } else {
            try {
                return new r(m0.r.t.a.r.m.a1.a.m1(new f0(key.getEncoded(), Ed25519Prefix.length)));
            } catch (IOException e4) {
                throw new InvalidKeySpecException(e4.getMessage(), e4.getCause());
            }
        }
    }

    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        throw new InvalidKeyException("key type unknown");
    }

    public PrivateKey generatePrivate(p pVar) throws IOException {
        n nVar = pVar.d.c;
        if (this.isXdh) {
            int i = this.specificBase;
            if ((i == 0 || i == 111) && nVar.w(s0.a.a.i2.a.c)) {
                return new BCXDHPrivateKey(pVar);
            }
            int i2 = this.specificBase;
            if ((i2 == 0 || i2 == 110) && nVar.w(s0.a.a.i2.a.b)) {
                return new BCXDHPrivateKey(pVar);
            }
        } else {
            n nVar2 = s0.a.a.i2.a.e;
            if (nVar.w(nVar2) || nVar.w(s0.a.a.i2.a.d)) {
                int i3 = this.specificBase;
                if ((i3 == 0 || i3 == 113) && nVar.w(nVar2)) {
                    return new BCEdDSAPrivateKey(pVar);
                }
                int i4 = this.specificBase;
                if ((i4 == 0 || i4 == 112) && nVar.w(s0.a.a.i2.a.d)) {
                    return new BCEdDSAPrivateKey(pVar);
                }
            }
        }
        throw new IOException(i0.d.a.a.a.r0("algorithm identifier ", nVar, " in key not recognized"));
    }

    public PublicKey generatePublic(m0 m0Var) throws IOException {
        n nVar = m0Var.c.c;
        if (this.isXdh) {
            int i = this.specificBase;
            if ((i == 0 || i == 111) && nVar.w(s0.a.a.i2.a.c)) {
                return new BCXDHPublicKey(m0Var);
            }
            int i2 = this.specificBase;
            if ((i2 == 0 || i2 == 110) && nVar.w(s0.a.a.i2.a.b)) {
                return new BCXDHPublicKey(m0Var);
            }
        } else {
            n nVar2 = s0.a.a.i2.a.e;
            if (nVar.w(nVar2) || nVar.w(s0.a.a.i2.a.d)) {
                int i3 = this.specificBase;
                if ((i3 == 0 || i3 == 113) && nVar.w(nVar2)) {
                    return new BCEdDSAPublicKey(m0Var);
                }
                int i4 = this.specificBase;
                if ((i4 == 0 || i4 == 112) && nVar.w(s0.a.a.i2.a.d)) {
                    return new BCEdDSAPublicKey(m0Var);
                }
            }
        }
        throw new IOException(i0.d.a.a.a.r0("algorithm identifier ", nVar, " in key not recognized"));
    }
}
