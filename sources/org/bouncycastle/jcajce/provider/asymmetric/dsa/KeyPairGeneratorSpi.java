package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import androidx.recyclerview.widget.RecyclerView;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import java.util.Hashtable;
import java.util.Objects;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import s0.a.b.b;
import s0.a.b.b0.x;
import s0.a.b.f0.h;
import s0.a.b.f0.i;
import s0.a.b.j;
import s0.a.b.k0.m;
import s0.a.b.k0.o;
import s0.a.b.k0.p;
import s0.a.b.k0.q;
import s0.a.b.k0.r;
import s0.a.g.g;

public class KeyPairGeneratorSpi extends KeyPairGenerator {
    private static Object lock = new Object();
    private static Hashtable params = new Hashtable();
    public h engine = new h();
    public boolean initialised = false;
    public m param;
    public SecureRandom random = j.a();
    public int strength = 2048;

    public KeyPairGeneratorSpi() {
        super("DSA");
    }

    public KeyPair generateKeyPair() {
        i iVar;
        int i;
        SecureRandom secureRandom;
        if (!this.initialised) {
            Integer valueOf = Integer.valueOf(this.strength);
            if (params.containsKey(valueOf)) {
                this.param = (m) params.get(valueOf);
            } else {
                synchronized (lock) {
                    if (params.containsKey(valueOf)) {
                        this.param = (m) params.get(valueOf);
                    } else {
                        int defaultCertainty = PrimeCertaintyCalculator.getDefaultCertainty(this.strength);
                        int i2 = this.strength;
                        if (i2 == 1024) {
                            iVar = new i();
                            if (g.b("org.bouncycastle.dsa.FIPS186-2for1024bits")) {
                                i = this.strength;
                                secureRandom = this.random;
                            } else {
                                iVar.e(new o(RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE, 160, defaultCertainty, this.random));
                                m mVar = new m(this.random, iVar.b());
                                this.param = mVar;
                                params.put(valueOf, mVar);
                            }
                        } else if (i2 > 1024) {
                            o oVar = new o(i2, 256, defaultCertainty, this.random);
                            iVar = new i(new x());
                            iVar.e(oVar);
                            m mVar2 = new m(this.random, iVar.b());
                            this.param = mVar2;
                            params.put(valueOf, mVar2);
                        } else {
                            iVar = new i();
                            i = this.strength;
                            secureRandom = this.random;
                        }
                        iVar.d(i, defaultCertainty, secureRandom);
                        m mVar22 = new m(this.random, iVar.b());
                        this.param = mVar22;
                        params.put(valueOf, mVar22);
                    }
                }
            }
            h hVar = this.engine;
            m mVar3 = this.param;
            Objects.requireNonNull(hVar);
            hVar.h = mVar3;
            this.initialised = true;
        }
        b b = this.engine.b();
        return new KeyPair(new BCDSAPublicKey((r) b.a), new BCDSAPrivateKey((q) b.b));
    }

    public void initialize(int i, SecureRandom secureRandom) {
        boolean z;
        if (i < 512 || i > 4096 || ((i < 1024 && i % 64 != 0) || (i >= 1024 && i % RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE != 0))) {
            throw new InvalidParameterException("strength must be from 512 - 4096 and a multiple of 1024 above 1024");
        }
        DSAParameterSpec dSADefaultParameters = BouncyCastleProvider.CONFIGURATION.getDSADefaultParameters(i);
        if (dSADefaultParameters != null) {
            m mVar = new m(secureRandom, new p(dSADefaultParameters.getP(), dSADefaultParameters.getQ(), dSADefaultParameters.getG()));
            this.param = mVar;
            h hVar = this.engine;
            Objects.requireNonNull(hVar);
            hVar.h = mVar;
            z = true;
        } else {
            this.strength = i;
            this.random = secureRandom;
            z = false;
        }
        this.initialised = z;
    }

    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof DSAParameterSpec) {
            DSAParameterSpec dSAParameterSpec = (DSAParameterSpec) algorithmParameterSpec;
            m mVar = new m(secureRandom, new p(dSAParameterSpec.getP(), dSAParameterSpec.getQ(), dSAParameterSpec.getG()));
            this.param = mVar;
            h hVar = this.engine;
            Objects.requireNonNull(hVar);
            hVar.h = mVar;
            this.initialised = true;
            return;
        }
        throw new InvalidAlgorithmParameterException("parameter object not a DSAParameterSpec");
    }
}
