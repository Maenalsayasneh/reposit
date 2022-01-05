package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import java.util.Objects;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import s0.a.b.f0.c;
import s0.a.b.f0.f;
import s0.a.b.j;
import s0.a.b.k0.d;
import s0.a.b.k0.h;
import s0.a.b.k0.i;
import s0.a.c.n.b;

public class KeyPairGeneratorSpi extends KeyPairGenerator {
    private static Object lock = new Object();
    private static Hashtable params = new Hashtable();
    public c engine = new c();
    public boolean initialised = false;
    public d param;
    public SecureRandom random = j.a();
    public int strength = 2048;

    public KeyPairGeneratorSpi() {
        super("DH");
    }

    private d convertParams(SecureRandom secureRandom, DHParameterSpec dHParameterSpec) {
        return dHParameterSpec instanceof b ? new d(secureRandom, ((b) dHParameterSpec).a()) : new d(secureRandom, new h(dHParameterSpec.getP(), dHParameterSpec.getG(), (BigInteger) null, dHParameterSpec.getL()));
    }

    public KeyPair generateKeyPair() {
        d dVar;
        if (!this.initialised) {
            Integer valueOf = Integer.valueOf(this.strength);
            if (params.containsKey(valueOf)) {
                dVar = (d) params.get(valueOf);
            } else {
                DHParameterSpec dHDefaultParameters = BouncyCastleProvider.CONFIGURATION.getDHDefaultParameters(this.strength);
                if (dHDefaultParameters != null) {
                    dVar = convertParams(this.random, dHDefaultParameters);
                } else {
                    synchronized (lock) {
                        if (params.containsKey(valueOf)) {
                            this.param = (d) params.get(valueOf);
                        } else {
                            f fVar = new f();
                            int i = this.strength;
                            int defaultCertainty = PrimeCertaintyCalculator.getDefaultCertainty(i);
                            SecureRandom secureRandom = this.random;
                            fVar.b = i;
                            fVar.c = defaultCertainty;
                            fVar.d = secureRandom;
                            d dVar2 = new d(secureRandom, fVar.a());
                            this.param = dVar2;
                            params.put(valueOf, dVar2);
                        }
                    }
                    c cVar = this.engine;
                    d dVar3 = this.param;
                    Objects.requireNonNull(cVar);
                    cVar.g = dVar3;
                    this.initialised = true;
                }
            }
            this.param = dVar;
            c cVar2 = this.engine;
            d dVar32 = this.param;
            Objects.requireNonNull(cVar2);
            cVar2.g = dVar32;
            this.initialised = true;
        }
        s0.a.b.b b = this.engine.b();
        return new KeyPair(new BCDHPublicKey((s0.a.b.k0.j) b.a), new BCDHPrivateKey((i) b.b));
    }

    public void initialize(int i, SecureRandom secureRandom) {
        this.strength = i;
        this.random = secureRandom;
        this.initialised = false;
    }

    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof DHParameterSpec) {
            try {
                d convertParams = convertParams(secureRandom, (DHParameterSpec) algorithmParameterSpec);
                this.param = convertParams;
                c cVar = this.engine;
                Objects.requireNonNull(cVar);
                cVar.g = convertParams;
                this.initialised = true;
            } catch (IllegalArgumentException e) {
                throw new InvalidAlgorithmParameterException(e.getMessage(), e);
            }
        } else {
            throw new InvalidAlgorithmParameterException("parameter object not a DHParameterSpec");
        }
    }
}
