package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

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
import s0.a.a.d3.h;
import s0.a.a.g2.b;
import s0.a.b.f0.k;
import s0.a.b.k0.a0;
import s0.a.b.k0.b0;
import s0.a.b.k0.c0;
import s0.a.b.k0.w;
import s0.a.b.k0.x;
import s0.a.b.k0.y;
import s0.a.c.n.j;
import s0.a.d.e.d;
import s0.a.d.e.e;

public class KeyPairGeneratorSpi extends KeyPairGenerator {
    public String algorithm = "ECGOST3410-2012";
    public Object ecParams = null;
    public k engine = new k();
    public boolean initialised = false;
    public y param;
    public SecureRandom random = null;
    public int strength = 239;

    public KeyPairGeneratorSpi() {
        super("ECGOST3410-2012");
    }

    private void init(j jVar, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        h a = b.a(jVar.a);
        if (a != null) {
            this.ecParams = new d(b.b(jVar.a), a.q, a.s(), a.y, a.Y1, a.u());
            y yVar = new y(new x(new a0(jVar.a, a), jVar.a, jVar.b, jVar.c), secureRandom);
            this.param = yVar;
            this.engine.a(yVar);
            this.initialised = true;
            return;
        }
        StringBuilder P0 = a.P0("unknown curve: ");
        P0.append(jVar.a);
        throw new InvalidAlgorithmParameterException(P0.toString());
    }

    public KeyPair generateKeyPair() {
        if (this.initialised) {
            s0.a.b.b b = this.engine.b();
            c0 c0Var = (c0) b.a;
            b0 b0Var = (b0) b.b;
            Object obj = this.ecParams;
            if (obj instanceof e) {
                e eVar = (e) obj;
                BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey = new BCECGOST3410_2012PublicKey(this.algorithm, c0Var, eVar);
                return new KeyPair(bCECGOST3410_2012PublicKey, new BCECGOST3410_2012PrivateKey(this.algorithm, b0Var, bCECGOST3410_2012PublicKey, eVar));
            } else if (obj == null) {
                return new KeyPair(new BCECGOST3410_2012PublicKey(this.algorithm, c0Var), new BCECGOST3410_2012PrivateKey(this.algorithm, b0Var));
            } else {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
                BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey2 = new BCECGOST3410_2012PublicKey(this.algorithm, c0Var, eCParameterSpec);
                return new KeyPair(bCECGOST3410_2012PublicKey2, new BCECGOST3410_2012PrivateKey(this.algorithm, b0Var, bCECGOST3410_2012PublicKey2, eCParameterSpec));
            }
        } else {
            throw new IllegalStateException("EC Key Pair Generator not initialised");
        }
    }

    public void initialize(int i, SecureRandom secureRandom) {
        this.strength = i;
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
        String str;
        if (algorithmParameterSpec instanceof j) {
            init((j) algorithmParameterSpec, secureRandom);
            return;
        }
        if (algorithmParameterSpec instanceof e) {
            e eVar = (e) algorithmParameterSpec;
            this.ecParams = algorithmParameterSpec;
            yVar = new y(new w(eVar.a, eVar.c, eVar.d, eVar.e), secureRandom);
        } else if (algorithmParameterSpec instanceof ECParameterSpec) {
            ECParameterSpec eCParameterSpec = (ECParameterSpec) algorithmParameterSpec;
            this.ecParams = algorithmParameterSpec;
            s0.a.e.b.e convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
            y yVar2 = new y(new w(convertCurve, EC5Util.convertPoint(convertCurve, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf((long) eCParameterSpec.getCofactor())), secureRandom);
            this.param = yVar2;
            this.engine.a(yVar2);
            this.initialised = true;
        } else {
            boolean z = algorithmParameterSpec instanceof ECGenParameterSpec;
            if (z || (algorithmParameterSpec instanceof s0.a.d.e.b)) {
                if (z) {
                    str = ((ECGenParameterSpec) algorithmParameterSpec).getName();
                } else {
                    Objects.requireNonNull((s0.a.d.e.b) algorithmParameterSpec);
                    str = null;
                }
                init(new j(str), secureRandom);
                return;
            }
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
        this.param = yVar;
        this.engine.a(yVar);
        this.initialised = true;
    }
}
