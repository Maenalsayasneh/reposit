package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import androidx.recyclerview.widget.RecyclerView;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import s0.a.b.b0.x;
import s0.a.b.f0.i;
import s0.a.b.j;
import s0.a.b.k0.o;
import s0.a.b.k0.p;

public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {
    public o params;
    public SecureRandom random;
    public int strength = 2048;

    public AlgorithmParameters engineGenerateParameters() {
        i iVar = this.strength <= 1024 ? new i() : new i(new x());
        if (this.random == null) {
            this.random = j.a();
        }
        int defaultCertainty = PrimeCertaintyCalculator.getDefaultCertainty(this.strength);
        int i = this.strength;
        if (i == 1024) {
            o oVar = new o(RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE, 160, defaultCertainty, this.random);
            this.params = oVar;
            iVar.e(oVar);
        } else if (i > 1024) {
            o oVar2 = new o(i, 256, defaultCertainty, this.random);
            this.params = oVar2;
            iVar.e(oVar2);
        } else {
            iVar.d(i, defaultCertainty, this.random);
        }
        p b = iVar.b();
        try {
            AlgorithmParameters createParametersInstance = createParametersInstance("DSA");
            createParametersInstance.init(new DSAParameterSpec(b.q, b.d, b.c));
            return createParametersInstance;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void engineInit(int i, SecureRandom secureRandom) {
        if (i < 512 || i > 3072) {
            throw new InvalidParameterException("strength must be from 512 - 3072");
        } else if (i <= 1024 && i % 64 != 0) {
            throw new InvalidParameterException("strength must be a multiple of 64 below 1024 bits.");
        } else if (i <= 1024 || i % RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE == 0) {
            this.strength = i;
            this.random = secureRandom;
        } else {
            throw new InvalidParameterException("strength must be a multiple of 1024 above 1024 bits.");
        }
    }

    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DSA parameter generation.");
    }
}
