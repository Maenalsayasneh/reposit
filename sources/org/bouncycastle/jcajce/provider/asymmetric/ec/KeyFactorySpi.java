package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Objects;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import s0.a.a.c3.b;
import s0.a.a.c3.m0;
import s0.a.a.d3.m;
import s0.a.a.n;
import s0.a.a.v;
import s0.a.a.w2.p;
import s0.a.a.y2.a;
import s0.a.b.k0.c0;
import s0.a.b.k0.w;
import s0.a.c.n.l;
import s0.a.d.e.e;
import s0.a.d.e.f;
import s0.a.d.e.g;
import s0.a.d.e.q;
import s0.a.d.e.r;

public class KeyFactorySpi extends BaseKeyFactorySpi implements AsymmetricKeyInfoConverter {
    public String algorithm;
    public ProviderConfiguration configuration;

    public static class EC extends KeyFactorySpi {
        public EC() {
            super("EC", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDH extends KeyFactorySpi {
        public ECDH() {
            super("ECDH", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDHC extends KeyFactorySpi {
        public ECDHC() {
            super("ECDHC", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDSA extends KeyFactorySpi {
        public ECDSA() {
            super("ECDSA", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECGOST3410 extends KeyFactorySpi {
        public ECGOST3410() {
            super("ECGOST3410", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECGOST3410_2012 extends KeyFactorySpi {
        public ECGOST3410_2012() {
            super("ECGOST3410-2012", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECMQV extends KeyFactorySpi {
        public ECMQV() {
            super("ECMQV", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public KeyFactorySpi(String str, ProviderConfiguration providerConfiguration) {
        this.algorithm = str;
        this.configuration = providerConfiguration;
    }

    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof f) {
            return new BCECPrivateKey(this.algorithm, (f) keySpec, this.configuration);
        }
        if (keySpec instanceof ECPrivateKeySpec) {
            return new BCECPrivateKey(this.algorithm, (ECPrivateKeySpec) keySpec, this.configuration);
        }
        if (!(keySpec instanceof l)) {
            return super.engineGeneratePrivate(keySpec);
        }
        a s = a.s(((l) keySpec).getEncoded());
        try {
            return new BCECPrivateKey(this.algorithm, new p(new b(m.h1, s.u(0)), s, (v) null, (byte[]) null), this.configuration);
        } catch (IOException e) {
            throw new InvalidKeySpecException(i0.d.a.a.a.V(e, i0.d.a.a.a.P0("bad encoding: ")));
        }
    }

    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        try {
            if (keySpec instanceof g) {
                return new BCECPublicKey(this.algorithm, (g) keySpec, this.configuration);
            }
            if (keySpec instanceof ECPublicKeySpec) {
                return new BCECPublicKey(this.algorithm, (ECPublicKeySpec) keySpec, this.configuration);
            }
            if (!(keySpec instanceof s0.a.c.n.m)) {
                return super.engineGeneratePublic(keySpec);
            }
            s0.a.b.k0.b S2 = m0.r.t.a.r.m.a1.a.S2(((s0.a.c.n.m) keySpec).getEncoded());
            if (S2 instanceof c0) {
                w wVar = ((c0) S2).d;
                return engineGeneratePublic(new g(((c0) S2).q, new e(wVar.g, wVar.i, wVar.j, wVar.k, wVar.a())));
            }
            throw new IllegalArgumentException("openssh key is not ec public key");
        } catch (Exception e) {
            throw new InvalidKeySpecException(i0.d.a.a.a.a0(e, i0.d.a.a.a.P0("invalid KeySpec: ")), e);
        }
    }

    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if ((cls.isAssignableFrom(KeySpec.class) || cls.isAssignableFrom(ECPublicKeySpec.class)) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey = (ECPublicKey) key;
            if (eCPublicKey.getParams() != null) {
                return new ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams());
            }
            e ecImplicitlyCa = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            return new ECPublicKeySpec(eCPublicKey.getW(), EC5Util.convertSpec(EC5Util.convertCurve(ecImplicitlyCa.a, ecImplicitlyCa.b), ecImplicitlyCa));
        } else if ((cls.isAssignableFrom(KeySpec.class) || cls.isAssignableFrom(ECPrivateKeySpec.class)) && (key instanceof ECPrivateKey)) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) key;
            if (eCPrivateKey.getParams() != null) {
                return new ECPrivateKeySpec(eCPrivateKey.getS(), eCPrivateKey.getParams());
            }
            e ecImplicitlyCa2 = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            return new ECPrivateKeySpec(eCPrivateKey.getS(), EC5Util.convertSpec(EC5Util.convertCurve(ecImplicitlyCa2.a, ecImplicitlyCa2.b), ecImplicitlyCa2));
        } else if (cls.isAssignableFrom(g.class) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey2 = (ECPublicKey) key;
            if (eCPublicKey2.getParams() != null) {
                return new g(EC5Util.convertPoint(eCPublicKey2.getParams(), eCPublicKey2.getW()), EC5Util.convertSpec(eCPublicKey2.getParams()));
            }
            return new g(EC5Util.convertPoint(eCPublicKey2.getParams(), eCPublicKey2.getW()), BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa());
        } else if (cls.isAssignableFrom(f.class) && (key instanceof ECPrivateKey)) {
            ECPrivateKey eCPrivateKey2 = (ECPrivateKey) key;
            if (eCPrivateKey2.getParams() != null) {
                return new f(eCPrivateKey2.getS(), EC5Util.convertSpec(eCPrivateKey2.getParams()));
            }
            return new f(eCPrivateKey2.getS(), BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa());
        } else if (!cls.isAssignableFrom(s0.a.c.n.m.class) || !(key instanceof ECPublicKey)) {
            if (!cls.isAssignableFrom(l.class) || !(key instanceof ECPrivateKey)) {
                if (!cls.isAssignableFrom(r.class) || !(key instanceof ECPublicKey)) {
                    if (!cls.isAssignableFrom(q.class) || !(key instanceof ECPrivateKey)) {
                        return super.engineGetKeySpec(key, cls);
                    }
                    if (key instanceof BCECPrivateKey) {
                        try {
                            s0.a.a.r rVar = (s0.a.a.r) p.s(key.getEncoded()).u();
                            Objects.requireNonNull(rVar);
                            return new q(rVar.getEncoded());
                        } catch (IOException e) {
                            throw new IllegalArgumentException(i0.d.a.a.a.V(e, i0.d.a.a.a.P0("cannot encoded key: ")));
                        }
                    } else {
                        StringBuilder P0 = i0.d.a.a.a.P0("invalid key type: ");
                        P0.append(key.getClass().getName());
                        throw new IllegalArgumentException(P0.toString());
                    }
                } else if (key instanceof BCECPublicKey) {
                    BCECPublicKey bCECPublicKey = (BCECPublicKey) key;
                    e parameters = bCECPublicKey.getParameters();
                    try {
                        return new r(m0.r.t.a.r.m.a1.a.m1(new c0(bCECPublicKey.getQ(), new w(parameters.a, parameters.c, parameters.d, parameters.e, parameters.b))));
                    } catch (IOException e2) {
                        throw new IllegalArgumentException(i0.d.a.a.a.V(e2, i0.d.a.a.a.P0("unable to produce encoding: ")));
                    }
                } else {
                    StringBuilder P02 = i0.d.a.a.a.P0("invalid key type: ");
                    P02.append(key.getClass().getName());
                    throw new IllegalArgumentException(P02.toString());
                }
            } else if (key instanceof BCECPrivateKey) {
                try {
                    s0.a.a.r rVar2 = (s0.a.a.r) p.s(key.getEncoded()).u();
                    Objects.requireNonNull(rVar2);
                    return new l(rVar2.getEncoded());
                } catch (IOException e3) {
                    throw new IllegalArgumentException(i0.d.a.a.a.V(e3, i0.d.a.a.a.P0("cannot encoded key: ")));
                }
            } else {
                StringBuilder P03 = i0.d.a.a.a.P0("invalid key type: ");
                P03.append(key.getClass().getName());
                throw new IllegalArgumentException(P03.toString());
            }
        } else if (key instanceof BCECPublicKey) {
            BCECPublicKey bCECPublicKey2 = (BCECPublicKey) key;
            e parameters2 = bCECPublicKey2.getParameters();
            try {
                return new s0.a.c.n.m(m0.r.t.a.r.m.a1.a.m1(new c0(bCECPublicKey2.getQ(), new w(parameters2.a, parameters2.c, parameters2.d, parameters2.e, parameters2.b))));
            } catch (IOException e4) {
                throw new IllegalArgumentException(i0.d.a.a.a.V(e4, i0.d.a.a.a.P0("unable to produce encoding: ")));
            }
        } else {
            StringBuilder P04 = i0.d.a.a.a.P0("invalid key type: ");
            P04.append(key.getClass().getName());
            throw new IllegalArgumentException(P04.toString());
        }
    }

    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof ECPublicKey) {
            return new BCECPublicKey((ECPublicKey) key, this.configuration);
        }
        if (key instanceof ECPrivateKey) {
            return new BCECPrivateKey((ECPrivateKey) key, this.configuration);
        }
        throw new InvalidKeyException("key type unknown");
    }

    public PrivateKey generatePrivate(p pVar) throws IOException {
        n nVar = pVar.d.c;
        if (nVar.w(m.h1)) {
            return new BCECPrivateKey(this.algorithm, pVar, this.configuration);
        }
        throw new IOException(i0.d.a.a.a.r0("algorithm identifier ", nVar, " in key not recognised"));
    }

    public PublicKey generatePublic(m0 m0Var) throws IOException {
        n nVar = m0Var.c.c;
        if (nVar.w(m.h1)) {
            return new BCECPublicKey(this.algorithm, m0Var, this.configuration);
        }
        throw new IOException(i0.d.a.a.a.r0("algorithm identifier ", nVar, " in key not recognised"));
    }
}
