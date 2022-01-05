package org.bouncycastle.jcajce.provider.asymmetric.gost;

import androidx.recyclerview.widget.RecyclerView;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import s0.a.a.g2.a;
import s0.a.b.b;
import s0.a.b.f0.p;
import s0.a.b.j;
import s0.a.b.k0.o0;
import s0.a.b.k0.q0;
import s0.a.b.k0.r0;
import s0.a.b.k0.s0;
import s0.a.d.e.l;
import s0.a.d.e.n;

public class KeyPairGeneratorSpi extends KeyPairGenerator {
    public p engine = new p();
    public l gost3410Params;
    public boolean initialised = false;
    public o0 param;
    public SecureRandom random = null;
    public int strength = RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE;

    public KeyPairGeneratorSpi() {
        super("GOST3410");
    }

    private void init(l lVar, SecureRandom secureRandom) {
        n nVar = lVar.a;
        o0 o0Var = new o0(secureRandom, new q0(nVar.a, nVar.b, nVar.c));
        this.param = o0Var;
        p pVar = this.engine;
        Objects.requireNonNull(pVar);
        pVar.g = o0Var;
        this.initialised = true;
        this.gost3410Params = lVar;
    }

    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            init(new l(a.q.d, a.p.d, (String) null), j.a());
        }
        b b = this.engine.b();
        return new KeyPair(new BCGOST3410PublicKey((s0) b.a, this.gost3410Params), new BCGOST3410PrivateKey((r0) b.b, this.gost3410Params));
    }

    public void initialize(int i, SecureRandom secureRandom) {
        this.strength = i;
        this.random = secureRandom;
    }

    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof l) {
            init((l) algorithmParameterSpec, secureRandom);
            return;
        }
        throw new InvalidAlgorithmParameterException("parameter object not a GOST3410ParameterSpec");
    }
}
