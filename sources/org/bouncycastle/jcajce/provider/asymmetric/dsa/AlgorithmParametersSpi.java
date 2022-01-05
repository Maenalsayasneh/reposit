package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import i0.d.a.a.a;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.Objects;
import s0.a.a.c3.q;
import s0.a.a.r;

public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    public DSAParameterSpec currentSpec;

    public byte[] engineGetEncoded() {
        try {
            return new q(this.currentSpec.getP(), this.currentSpec.getQ(), this.currentSpec.getG()).r("DER");
        } catch (IOException unused) {
            throw new RuntimeException("Error encoding DSAParameters");
        }
    }

    public byte[] engineGetEncoded(String str) {
        if (isASN1FormatString(str)) {
            return engineGetEncoded();
        }
        return null;
    }

    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        Objects.requireNonNull(cls, "argument to getParameterSpec must not be null");
        return localEngineGetParameterSpec(cls);
    }

    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (algorithmParameterSpec instanceof DSAParameterSpec) {
            this.currentSpec = (DSAParameterSpec) algorithmParameterSpec;
            return;
        }
        throw new InvalidParameterSpecException("DSAParameterSpec required to initialise a DSA algorithm parameters object");
    }

    public void engineInit(byte[] bArr) throws IOException {
        try {
            q t = q.t(r.x(bArr));
            this.currentSpec = new DSAParameterSpec(t.u(), t.v(), t.s());
        } catch (ClassCastException unused) {
            throw new IOException("Not a valid DSA Parameter encoding.");
        } catch (ArrayIndexOutOfBoundsException unused2) {
            throw new IOException("Not a valid DSA Parameter encoding.");
        }
    }

    public void engineInit(byte[] bArr, String str) throws IOException {
        if (isASN1FormatString(str) || str.equalsIgnoreCase("X.509")) {
            engineInit(bArr);
            return;
        }
        throw new IOException(a.n0("Unknown parameter format ", str));
    }

    public String engineToString() {
        return "DSA Parameters";
    }

    public boolean isASN1FormatString(String str) {
        return str == null || str.equals("ASN.1");
    }

    public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == DSAParameterSpec.class || cls == AlgorithmParameterSpec.class) {
            return this.currentSpec;
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to DSA parameters object.");
    }
}
