package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.Objects;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import s0.a.a.c3.b;
import s0.a.a.v0;
import s0.a.a.w2.n;
import s0.a.b.f0.x;
import s0.a.b.j;
import s0.a.b.k0.j1;
import s0.a.b.k0.k1;
import s0.a.b.k0.l1;

public class KeyPairGeneratorSpi extends KeyPairGenerator {
    private static final b PKCS_ALGID = new b(n.n, v0.c);
    /* access modifiers changed from: private */
    public static final b PSS_ALGID = new b(n.w);
    public static final BigInteger defaultPublicExponent = BigInteger.valueOf(65537);
    public b algId;
    public x engine;
    public j1 param;

    public static class PSS extends KeyPairGeneratorSpi {
        public PSS() {
            super("RSASSA-PSS", KeyPairGeneratorSpi.PSS_ALGID);
        }
    }

    public KeyPairGeneratorSpi() {
        this("RSA", PKCS_ALGID);
    }

    public KeyPairGeneratorSpi(String str, b bVar) {
        super(str);
        this.algId = bVar;
        this.engine = new x();
        j1 j1Var = new j1(defaultPublicExponent, j.a(), 2048, PrimeCertaintyCalculator.getDefaultCertainty(2048));
        this.param = j1Var;
        x xVar = this.engine;
        Objects.requireNonNull(xVar);
        xVar.h = j1Var;
    }

    public KeyPair generateKeyPair() {
        s0.a.b.b b = this.engine.b();
        return new KeyPair(new BCRSAPublicKey(this.algId, (k1) b.a), new BCRSAPrivateCrtKey(this.algId, (l1) b.b));
    }

    public void initialize(int i, SecureRandom secureRandom) {
        j1 j1Var = new j1(defaultPublicExponent, secureRandom, i, PrimeCertaintyCalculator.getDefaultCertainty(i));
        this.param = j1Var;
        x xVar = this.engine;
        Objects.requireNonNull(xVar);
        xVar.h = j1Var;
    }

    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof RSAKeyGenParameterSpec) {
            RSAKeyGenParameterSpec rSAKeyGenParameterSpec = (RSAKeyGenParameterSpec) algorithmParameterSpec;
            j1 j1Var = new j1(rSAKeyGenParameterSpec.getPublicExponent(), secureRandom, rSAKeyGenParameterSpec.getKeysize(), PrimeCertaintyCalculator.getDefaultCertainty(2048));
            this.param = j1Var;
            x xVar = this.engine;
            Objects.requireNonNull(xVar);
            xVar.h = j1Var;
            return;
        }
        throw new InvalidAlgorithmParameterException("parameter object not a RSAKeyGenParameterSpec");
    }
}
