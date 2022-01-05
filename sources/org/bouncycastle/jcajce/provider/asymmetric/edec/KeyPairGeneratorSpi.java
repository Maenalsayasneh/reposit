package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.util.Objects;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import s0.a.a.i2.a;
import s0.a.b.b;
import s0.a.b.c;
import s0.a.b.f0.l;
import s0.a.b.f0.m;
import s0.a.b.f0.y;
import s0.a.b.f0.z;
import s0.a.b.k0.d0;
import s0.a.b.k0.g0;
import s0.a.b.k0.o1;
import s0.a.b.k0.r1;
import s0.a.b.q;
import s0.a.c.n.g;
import s0.a.c.n.t;

public class KeyPairGeneratorSpi extends java.security.KeyPairGeneratorSpi {
    private static final int Ed25519 = 1;
    private static final int Ed448 = 0;
    private static final int EdDSA = -1;
    private static final int X25519 = 3;
    private static final int X448 = 2;
    private static final int XDH = -2;
    private int algorithm;
    private c generator;
    private boolean initialised;
    private SecureRandom secureRandom;

    public static final class Ed25519 extends KeyPairGeneratorSpi {
        public Ed25519() {
            super(1, new l());
        }
    }

    public static final class Ed448 extends KeyPairGeneratorSpi {
        public Ed448() {
            super(0, new m());
        }
    }

    public static final class EdDSA extends KeyPairGeneratorSpi {
        public EdDSA() {
            super(-1, (c) null);
        }
    }

    public static final class X25519 extends KeyPairGeneratorSpi {
        public X25519() {
            super(3, new y());
        }
    }

    public static final class X448 extends KeyPairGeneratorSpi {
        public X448() {
            super(2, new z());
        }
    }

    public static final class XDH extends KeyPairGeneratorSpi {
        public XDH() {
            super(-2, (c) null);
        }
    }

    public KeyPairGeneratorSpi(int i, c cVar) {
        this.algorithm = i;
        this.generator = cVar;
    }

    private void algorithmCheck(int i) throws InvalidAlgorithmParameterException {
        int i2 = this.algorithm;
        if (i2 == i) {
            return;
        }
        if (i2 == 1 || i2 == 0) {
            throw new InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
        } else if (i2 == -1 && i != 1 && i != 0) {
            throw new InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
        } else if (i2 == 3 || i2 == 2) {
            throw new InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
        } else if (i2 == -2 && i != 3 && i != 2) {
            throw new InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
        }
    }

    private void initializeGenerator(String str) throws InvalidAlgorithmParameterException {
        int i;
        c cVar;
        if (str.equalsIgnoreCase("Ed448") || str.equals(a.e.d)) {
            i = 0;
            algorithmCheck(0);
            cVar = new m();
        } else if (str.equalsIgnoreCase("Ed25519") || str.equals(a.d.d)) {
            i = 1;
            algorithmCheck(1);
            cVar = new l();
        } else if (str.equalsIgnoreCase("X448") || str.equals(a.c.d)) {
            i = 2;
            algorithmCheck(2);
            cVar = new z();
        } else if (str.equalsIgnoreCase("X25519") || str.equals(a.b.d)) {
            i = 3;
            algorithmCheck(3);
            cVar = new y();
        } else {
            return;
        }
        this.generator = cVar;
        setupGenerator(i);
    }

    private void setupGenerator(int i) {
        c cVar;
        q qVar;
        this.initialised = true;
        if (i != -2) {
            if (i != -1) {
                if (i == 0) {
                    cVar = this.generator;
                    qVar = new g0(this.secureRandom);
                } else if (i != 1) {
                    if (i == 2) {
                        cVar = this.generator;
                        qVar = new r1(this.secureRandom);
                    } else if (i != 3) {
                        return;
                    }
                }
                cVar.a(qVar);
            }
            cVar = this.generator;
            qVar = new d0(this.secureRandom);
            cVar.a(qVar);
        }
        cVar = this.generator;
        qVar = new o1(this.secureRandom);
        cVar.a(qVar);
    }

    public KeyPair generateKeyPair() {
        if (this.generator != null) {
            if (!this.initialised) {
                setupGenerator(this.algorithm);
            }
            b b = this.generator.b();
            int i = this.algorithm;
            if (i == -2 || i == 2 || i == 3) {
                return new KeyPair(new BCXDHPublicKey(b.a), new BCXDHPrivateKey(b.b));
            }
            return new KeyPair(new BCEdDSAPublicKey(b.a), new BCEdDSAPrivateKey(b.b));
        }
        throw new IllegalStateException("generator not correctly initialized");
    }

    public void initialize(int i, SecureRandom secureRandom2) {
        int i2;
        this.secureRandom = secureRandom2;
        if (i == 255 || i == 256) {
            int i3 = this.algorithm;
            i2 = 3;
            if (i3 != -2) {
                if (i3 == -1 || i3 == 1) {
                    algorithmCheck(1);
                    this.generator = new l();
                    setupGenerator(1);
                    return;
                } else if (i3 != 3) {
                    throw new InvalidParameterException("key size not configurable");
                }
            }
            algorithmCheck(3);
            this.generator = new y();
        } else if (i == 448) {
            try {
                int i4 = this.algorithm;
                i2 = 2;
                if (i4 != -2) {
                    if (i4 == -1 || i4 == 0) {
                        algorithmCheck(0);
                        this.generator = new m();
                        setupGenerator(0);
                        return;
                    } else if (i4 != 2) {
                        throw new InvalidParameterException("key size not configurable");
                    }
                }
                algorithmCheck(2);
                this.generator = new z();
            } catch (InvalidAlgorithmParameterException e) {
                throw new InvalidParameterException(e.getMessage());
            }
        } else {
            throw new InvalidParameterException("unknown key size");
        }
        setupGenerator(i2);
    }

    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom2) throws InvalidAlgorithmParameterException {
        Object obj;
        this.secureRandom = secureRandom2;
        if (algorithmParameterSpec instanceof ECGenParameterSpec) {
            initializeGenerator(((ECGenParameterSpec) algorithmParameterSpec).getName());
            return;
        }
        if (algorithmParameterSpec instanceof s0.a.d.e.b) {
            obj = (s0.a.d.e.b) algorithmParameterSpec;
        } else if (algorithmParameterSpec instanceof g) {
            obj = (g) algorithmParameterSpec;
        } else if (algorithmParameterSpec instanceof t) {
            obj = (t) algorithmParameterSpec;
        } else {
            String nameFrom = ECUtil.getNameFrom(algorithmParameterSpec);
            if (nameFrom != null) {
                initializeGenerator(nameFrom);
                return;
            }
            throw new InvalidAlgorithmParameterException("invalid parameterSpec: " + algorithmParameterSpec);
        }
        Objects.requireNonNull(obj);
        initializeGenerator((String) null);
    }
}
