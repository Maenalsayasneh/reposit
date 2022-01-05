package org.bouncycastle.jcajce.provider.symmetric.util;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.x0;
import s0.a.e.b.b0.c.h3;

public class IvAlgorithmParameters extends BaseAlgorithmParameters {
    private byte[] iv;

    public byte[] engineGetEncoded() throws IOException {
        return engineGetEncoded("ASN.1");
    }

    public byte[] engineGetEncoded(String str) throws IOException {
        if (isASN1FormatString(str)) {
            return new x0(engineGetEncoded("RAW")).getEncoded();
        }
        if (str.equals("RAW")) {
            return h3.I(this.iv);
        }
        return null;
    }

    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            this.iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
            return;
        }
        throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
    }

    public void engineInit(byte[] bArr) throws IOException {
        if (bArr.length % 8 != 0 && bArr[0] == 4 && bArr[1] == bArr.length - 2) {
            bArr = ((o) r.x(bArr)).c;
        }
        this.iv = h3.I(bArr);
    }

    public String engineToString() {
        return "IV Parameters";
    }

    public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == IvParameterSpec.class || cls == AlgorithmParameterSpec.class) {
            return new IvParameterSpec(this.iv);
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to IV parameters object.");
    }

    public void engineInit(byte[] bArr, String str) throws IOException {
        if (isASN1FormatString(str)) {
            try {
                engineInit(((o) r.x(bArr)).c);
            } catch (Exception e) {
                throw new IOException("Exception decoding: " + e);
            }
        } else if (str.equals("RAW")) {
            engineInit(bArr);
        } else {
            throw new IOException("Unknown parameters format in IV parameters object");
        }
    }
}
