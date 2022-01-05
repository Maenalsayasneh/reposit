package org.bouncycastle.jcajce.provider.asymmetric.gost;

import i0.d.a.a.a;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.Objects;
import s0.a.a.g2.f;
import s0.a.a.n;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.d.e.l;

public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    public l currentSpec;

    public byte[] engineGetEncoded() {
        try {
            return new f(new n(this.currentSpec.b), new n(this.currentSpec.c), new n(this.currentSpec.d)).r("DER");
        } catch (IOException unused) {
            throw new RuntimeException("Error encoding GOST3410Parameters");
        }
    }

    public byte[] engineGetEncoded(String str) {
        if (isASN1FormatString(str) || str.equalsIgnoreCase("X.509")) {
            return engineGetEncoded();
        }
        return null;
    }

    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        Objects.requireNonNull(cls, "argument to getParameterSpec must not be null");
        return localEngineGetParameterSpec(cls);
    }

    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (algorithmParameterSpec instanceof l) {
            this.currentSpec = (l) algorithmParameterSpec;
            return;
        }
        throw new InvalidParameterSpecException("GOST3410ParameterSpec required to initialise a GOST3410 algorithm parameters object");
    }

    public void engineInit(byte[] bArr) throws IOException {
        try {
            this.currentSpec = l.a(f.s((s) r.x(bArr)));
        } catch (ClassCastException unused) {
            throw new IOException("Not a valid GOST3410 Parameter encoding.");
        } catch (ArrayIndexOutOfBoundsException unused2) {
            throw new IOException("Not a valid GOST3410 Parameter encoding.");
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
        return "GOST3410 Parameters";
    }

    public boolean isASN1FormatString(String str) {
        return str == null || str.equals("ASN.1");
    }

    public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == s0.a.d.e.n.class || cls == AlgorithmParameterSpec.class) {
            return this.currentSpec;
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to GOST3410 parameters object.");
    }
}
