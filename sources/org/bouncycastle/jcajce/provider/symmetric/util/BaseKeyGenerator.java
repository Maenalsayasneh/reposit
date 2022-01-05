package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import s0.a.b.h;
import s0.a.b.j;
import s0.a.b.q;

public class BaseKeyGenerator extends KeyGeneratorSpi {
    public String algName;
    public int defaultKeySize;
    public h engine;
    public int keySize;
    public boolean uninitialised = true;

    public BaseKeyGenerator(String str, int i, h hVar) {
        this.algName = str;
        this.defaultKeySize = i;
        this.keySize = i;
        this.engine = hVar;
    }

    public SecretKey engineGenerateKey() {
        if (this.uninitialised) {
            this.engine.b(new q(j.a(), this.defaultKeySize));
            this.uninitialised = false;
        }
        return new SecretKeySpec(this.engine.a(), this.algName);
    }

    public void engineInit(int i, SecureRandom secureRandom) {
        if (secureRandom == null) {
            try {
                secureRandom = j.a();
            } catch (IllegalArgumentException e) {
                throw new InvalidParameterException(e.getMessage());
            }
        }
        this.engine.b(new q(secureRandom, i));
        this.uninitialised = false;
    }

    public void engineInit(SecureRandom secureRandom) {
        if (secureRandom != null) {
            this.engine.b(new q(secureRandom, this.defaultKeySize));
            this.uninitialised = false;
        }
    }

    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("Not Implemented");
    }
}
