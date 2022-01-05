package org.bouncycastle.jcajce.provider.symmetric.util;

import androidx.recyclerview.widget.RecyclerView;
import java.security.AlgorithmParameterGeneratorSpi;
import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import s0.a.c.o.a;
import s0.a.c.o.c;

public abstract class BaseAlgorithmParameterGenerator extends AlgorithmParameterGeneratorSpi {
    private final c helper = new a();
    public SecureRandom random;
    public int strength = RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE;

    public final AlgorithmParameters createParametersInstance(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return this.helper.f(str);
    }

    public void engineInit(int i, SecureRandom secureRandom) {
        this.strength = i;
        this.random = secureRandom;
    }
}
