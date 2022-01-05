package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import androidx.recyclerview.widget.RecyclerView;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import s0.a.b.b;
import s0.a.b.f0.g;
import s0.a.b.f0.n;
import s0.a.b.j;
import s0.a.b.k0.j0;
import s0.a.b.k0.l0;
import s0.a.b.k0.m0;
import s0.a.b.k0.n0;
import s0.a.d.e.i;

public class KeyPairGeneratorSpi extends KeyPairGenerator {
    public int certainty = 20;
    public n engine = new n();
    public boolean initialised = false;
    public j0 param;
    public SecureRandom random = j.a();
    public int strength = RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE;

    public KeyPairGeneratorSpi() {
        super("ElGamal");
    }

    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            DHParameterSpec dHDefaultParameters = BouncyCastleProvider.CONFIGURATION.getDHDefaultParameters(this.strength);
            if (dHDefaultParameters != null) {
                this.param = new j0(this.random, new l0(dHDefaultParameters.getP(), dHDefaultParameters.getG(), dHDefaultParameters.getL()));
            } else {
                int i = this.strength;
                int i2 = this.certainty;
                SecureRandom secureRandom = this.random;
                BigInteger[] a = g.a(i, i2, secureRandom);
                BigInteger bigInteger = a[0];
                BigInteger bigInteger2 = a[1];
                this.param = new j0(secureRandom, new l0(bigInteger, g.b(bigInteger, secureRandom)));
            }
            n nVar = this.engine;
            j0 j0Var = this.param;
            Objects.requireNonNull(nVar);
            nVar.g = j0Var;
            this.initialised = true;
        }
        b b = this.engine.b();
        return new KeyPair(new BCElGamalPublicKey((n0) b.a), new BCElGamalPrivateKey((m0) b.b));
    }

    public void initialize(int i, SecureRandom secureRandom) {
        this.strength = i;
        this.random = secureRandom;
    }

    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        j0 j0Var;
        boolean z = algorithmParameterSpec instanceof i;
        if (z || (algorithmParameterSpec instanceof DHParameterSpec)) {
            if (z) {
                i iVar = (i) algorithmParameterSpec;
                j0Var = new j0(secureRandom, new l0(iVar.a, iVar.b));
            } else {
                DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
                j0Var = new j0(secureRandom, new l0(dHParameterSpec.getP(), dHParameterSpec.getG(), dHParameterSpec.getL()));
            }
            this.param = j0Var;
            n nVar = this.engine;
            j0 j0Var2 = this.param;
            Objects.requireNonNull(nVar);
            nVar.g = j0Var2;
            this.initialised = true;
            return;
        }
        throw new InvalidAlgorithmParameterException("parameter object not a DHParameterSpec or an ElGamalParameterSpec");
    }
}
