package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import s0.a.a.r;
import s0.a.a.v2.a;
import s0.a.d.e.i;

public class AlgorithmParametersSpi extends BaseAlgorithmParameters {
    public i currentSpec;

    public byte[] engineGetEncoded() {
        i iVar = this.currentSpec;
        try {
            return new a(iVar.a, iVar.b).r("DER");
        } catch (IOException unused) {
            throw new RuntimeException("Error encoding ElGamalParameters");
        }
    }

    public byte[] engineGetEncoded(String str) {
        if (isASN1FormatString(str) || str.equalsIgnoreCase("X.509")) {
            return engineGetEncoded();
        }
        return null;
    }

    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        boolean z = algorithmParameterSpec instanceof i;
        if (!z && !(algorithmParameterSpec instanceof DHParameterSpec)) {
            throw new InvalidParameterSpecException("DHParameterSpec required to initialise a ElGamal algorithm parameters object");
        } else if (z) {
            this.currentSpec = (i) algorithmParameterSpec;
        } else {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
            this.currentSpec = new i(dHParameterSpec.getP(), dHParameterSpec.getG());
        }
    }

    public void engineInit(byte[] bArr) throws IOException {
        try {
            a t = a.t(r.x(bArr));
            this.currentSpec = new i(t.u(), t.s());
        } catch (ClassCastException unused) {
            throw new IOException("Not a valid ElGamal Parameter encoding.");
        } catch (ArrayIndexOutOfBoundsException unused2) {
            throw new IOException("Not a valid ElGamal Parameter encoding.");
        }
    }

    public void engineInit(byte[] bArr, String str) throws IOException {
        if (isASN1FormatString(str) || str.equalsIgnoreCase("X.509")) {
            engineInit(bArr);
            return;
        }
        throw new IOException(i0.d.a.a.a.n0("Unknown parameter format ", str));
    }

    public String engineToString() {
        return "ElGamal Parameters";
    }

    public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == i.class || cls == AlgorithmParameterSpec.class) {
            return this.currentSpec;
        }
        if (cls == DHParameterSpec.class) {
            i iVar = this.currentSpec;
            return new DHParameterSpec(iVar.a, iVar.b);
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to ElGamal parameters object.");
    }
}
