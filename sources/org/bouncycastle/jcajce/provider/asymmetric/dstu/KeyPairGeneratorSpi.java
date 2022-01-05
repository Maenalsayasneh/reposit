package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import i0.d.a.a.a;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.util.Objects;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import s0.a.a.a3.c;
import s0.a.a.n;
import s0.a.b.b;
import s0.a.b.f0.j;
import s0.a.b.f0.k;
import s0.a.b.k0.b0;
import s0.a.b.k0.c0;
import s0.a.b.k0.t;
import s0.a.b.k0.w;
import s0.a.b.k0.y;
import s0.a.c.n.f;
import s0.a.d.e.d;
import s0.a.d.e.e;
import s0.a.e.b.b0.c.h3;
import s0.a.e.b.h;

public class KeyPairGeneratorSpi extends KeyPairGenerator {
    public String algorithm = "DSTU4145";
    public Object ecParams = null;
    public k engine = new j();
    public boolean initialised = false;
    public y param;
    public SecureRandom random = null;

    public KeyPairGeneratorSpi() {
        super("DSTU4145");
    }

    public KeyPair generateKeyPair() {
        if (this.initialised) {
            b b = this.engine.b();
            c0 c0Var = (c0) b.a;
            b0 b0Var = (b0) b.b;
            Object obj = this.ecParams;
            if (obj instanceof e) {
                e eVar = (e) obj;
                BCDSTU4145PublicKey bCDSTU4145PublicKey = new BCDSTU4145PublicKey(this.algorithm, c0Var, eVar);
                return new KeyPair(bCDSTU4145PublicKey, new BCDSTU4145PrivateKey(this.algorithm, b0Var, bCDSTU4145PublicKey, eVar));
            } else if (obj == null) {
                return new KeyPair(new BCDSTU4145PublicKey(this.algorithm, c0Var), new BCDSTU4145PrivateKey(this.algorithm, b0Var));
            } else {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
                BCDSTU4145PublicKey bCDSTU4145PublicKey2 = new BCDSTU4145PublicKey(this.algorithm, c0Var, eCParameterSpec);
                return new KeyPair(bCDSTU4145PublicKey2, new BCDSTU4145PrivateKey(this.algorithm, b0Var, bCDSTU4145PublicKey2, eCParameterSpec));
            }
        } else {
            throw new IllegalStateException("DSTU Key Pair Generator not initialised");
        }
    }

    public void initialize(int i, SecureRandom secureRandom) {
        this.random = secureRandom;
        Object obj = this.ecParams;
        if (obj != null) {
            try {
                initialize((AlgorithmParameterSpec) (ECGenParameterSpec) obj, secureRandom);
            } catch (InvalidAlgorithmParameterException unused) {
                throw new InvalidParameterException("key size not configurable.");
            }
        } else {
            throw new InvalidParameterException("unknown key size.");
        }
    }

    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        y yVar;
        if (algorithmParameterSpec instanceof e) {
            e eVar = (e) algorithmParameterSpec;
            this.ecParams = algorithmParameterSpec;
            yVar = new y(new w(eVar.a, eVar.c, eVar.d, eVar.e), secureRandom);
        } else {
            String str = null;
            if (algorithmParameterSpec instanceof ECParameterSpec) {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) algorithmParameterSpec;
                this.ecParams = algorithmParameterSpec;
                s0.a.e.b.e convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                h convertPoint = EC5Util.convertPoint(convertCurve, eCParameterSpec.getGenerator());
                if (eCParameterSpec instanceof f) {
                    f fVar = (f) eCParameterSpec;
                    this.param = new y(new t(new w(convertCurve, convertPoint, eCParameterSpec.getOrder(), BigInteger.valueOf((long) eCParameterSpec.getCofactor())), h3.I((byte[]) null)), secureRandom);
                } else {
                    this.param = new y(new w(convertCurve, convertPoint, eCParameterSpec.getOrder(), BigInteger.valueOf((long) eCParameterSpec.getCofactor())), secureRandom);
                }
                this.engine.a(this.param);
            } else {
                boolean z = algorithmParameterSpec instanceof ECGenParameterSpec;
                if (z || (algorithmParameterSpec instanceof s0.a.d.e.b)) {
                    if (z) {
                        str = ((ECGenParameterSpec) algorithmParameterSpec).getName();
                    } else {
                        Objects.requireNonNull((s0.a.d.e.b) algorithmParameterSpec);
                    }
                    String str2 = str;
                    w a = c.a(new n(str2));
                    if (a != null) {
                        d dVar = new d(str2, a.g, a.i, a.j, a.k, a.a());
                        this.ecParams = dVar;
                        ECParameterSpec eCParameterSpec2 = dVar;
                        s0.a.e.b.e convertCurve2 = EC5Util.convertCurve(eCParameterSpec2.getCurve());
                        y yVar2 = new y(new w(convertCurve2, EC5Util.convertPoint(convertCurve2, eCParameterSpec2.getGenerator()), eCParameterSpec2.getOrder(), BigInteger.valueOf((long) eCParameterSpec2.getCofactor())), secureRandom);
                        this.param = yVar2;
                        this.engine.a(yVar2);
                    } else {
                        throw new InvalidAlgorithmParameterException(a.n0("unknown curve name: ", str2));
                    }
                } else {
                    if (algorithmParameterSpec == null) {
                        ProviderConfiguration providerConfiguration = BouncyCastleProvider.CONFIGURATION;
                        if (providerConfiguration.getEcImplicitlyCa() != null) {
                            e ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
                            this.ecParams = algorithmParameterSpec;
                            yVar = new y(new w(ecImplicitlyCa.a, ecImplicitlyCa.c, ecImplicitlyCa.d, ecImplicitlyCa.e), secureRandom);
                        }
                    }
                    if (algorithmParameterSpec == null && BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa() == null) {
                        throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
                    }
                    StringBuilder P0 = a.P0("parameter object not a ECParameterSpec: ");
                    P0.append(algorithmParameterSpec.getClass().getName());
                    throw new InvalidAlgorithmParameterException(P0.toString());
                }
            }
            this.initialised = true;
        }
        this.param = yVar;
        this.engine.a(yVar);
        this.initialised = true;
    }
}
