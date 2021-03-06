package org.bouncycastle.jcajce.provider.asymmetric.dh;

import i0.d.a.a.a;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.Objects;
import javax.crypto.spec.DHParameterSpec;
import s0.a.a.w2.d;

public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    public DHParameterSpec currentSpec;

    public byte[] engineGetEncoded() {
        try {
            return new d(this.currentSpec.getP(), this.currentSpec.getG(), this.currentSpec.getL()).r("DER");
        } catch (IOException unused) {
            throw new RuntimeException("Error encoding DHParameters");
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
        if (algorithmParameterSpec instanceof DHParameterSpec) {
            this.currentSpec = (DHParameterSpec) algorithmParameterSpec;
            return;
        }
        throw new InvalidParameterSpecException("DHParameterSpec required to initialise a Diffie-Hellman algorithm parameters object");
    }

    public void engineInit(byte[] bArr) throws IOException {
        try {
            d t = d.t(bArr);
            this.currentSpec = t.u() != null ? new DHParameterSpec(t.v(), t.s(), t.u().intValue()) : new DHParameterSpec(t.v(), t.s());
        } catch (ClassCastException unused) {
            throw new IOException("Not a valid DH Parameter encoding.");
        } catch (ArrayIndexOutOfBoundsException unused2) {
            throw new IOException("Not a valid DH Parameter encoding.");
        }
    }

    public void engineInit(byte[] bArr, String str) throws IOException {
        if (isASN1FormatString(str)) {
            engineInit(bArr);
            return;
        }
        throw new IOException(a.n0("Unknown parameter format ", str));
    }

    public String engineToString() {
        return "Diffie-Hellman Parameters";
    }

    public boolean isASN1FormatString(String str) {
        return str == null || str.equals("ASN.1");
    }

    public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == DHParameterSpec.class || cls == AlgorithmParameterSpec.class) {
            return this.currentSpec;
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to DH parameters object.");
    }
}
