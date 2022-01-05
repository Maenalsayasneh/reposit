package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import androidx.recyclerview.widget.RecyclerView;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHGenParameterSpec;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;
import s0.a.b.f0.g;
import s0.a.b.j;

public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {
    private int l = 0;
    public SecureRandom random;
    public int strength = RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE;

    public AlgorithmParameters engineGenerateParameters() {
        SecureRandom secureRandom = this.random;
        int i = this.strength;
        if (secureRandom == null) {
            secureRandom = j.a();
        }
        BigInteger[] a = g.a(i, 20, secureRandom);
        BigInteger bigInteger = a[0];
        BigInteger bigInteger2 = a[1];
        BigInteger b = g.b(bigInteger, secureRandom);
        try {
            AlgorithmParameters createParametersInstance = createParametersInstance("ElGamal");
            createParametersInstance.init(new DHParameterSpec(bigInteger, b, this.l));
            return createParametersInstance;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void engineInit(int i, SecureRandom secureRandom) {
        this.strength = i;
        this.random = secureRandom;
    }

    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof DHGenParameterSpec) {
            DHGenParameterSpec dHGenParameterSpec = (DHGenParameterSpec) algorithmParameterSpec;
            this.strength = dHGenParameterSpec.getPrimeSize();
            this.l = dHGenParameterSpec.getExponentSize();
            this.random = secureRandom;
            return;
        }
        throw new InvalidAlgorithmParameterException("DH parameter generator requires a DHGenParameterSpec for initialisation");
    }
}
