package org.bouncycastle.jcajce.provider.asymmetric.ies;

import i0.d.a.a.a;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.Objects;
import s0.a.a.b1;
import s0.a.a.e1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.x0;
import s0.a.a.z;
import s0.a.d.e.p;

public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    public p currentSpec;

    public byte[] engineGetEncoded() {
        try {
            f fVar = new f(10);
            if (this.currentSpec.a() != null) {
                fVar.a(new e1(false, 0, new x0(this.currentSpec.a())));
            }
            if (this.currentSpec.b() != null) {
                fVar.a(new e1(false, 1, new x0(this.currentSpec.b())));
            }
            fVar.a(new k((long) this.currentSpec.c));
            if (this.currentSpec.c() != null) {
                f fVar2 = new f(10);
                fVar2.a(new k((long) this.currentSpec.d));
                fVar2.a(new k(this.currentSpec.c(), true));
                fVar.a(new b1(fVar2));
            }
            return new b1(fVar).r("DER");
        } catch (IOException unused) {
            throw new RuntimeException("Error encoding IESParameters");
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
        if (algorithmParameterSpec instanceof p) {
            this.currentSpec = (p) algorithmParameterSpec;
            return;
        }
        throw new InvalidParameterSpecException("IESParameterSpec required to initialise a IES algorithm parameters object");
    }

    public void engineInit(byte[] bArr) throws IOException {
        p pVar;
        try {
            s sVar = (s) r.x(bArr);
            if (sVar.size() == 1) {
                this.currentSpec = new p((byte[]) null, (byte[]) null, k.B(sVar.D(0)).I());
            } else if (sVar.size() == 2) {
                z B = z.B(sVar.D(0));
                if (B.c == 0) {
                    pVar = new p(o.C(B, false).c, (byte[]) null, k.B(sVar.D(1)).I());
                } else {
                    pVar = new p((byte[]) null, o.C(B, false).c, k.B(sVar.D(1)).I());
                }
                this.currentSpec = pVar;
            } else if (sVar.size() == 3) {
                this.currentSpec = new p(o.C(z.B(sVar.D(0)), false).c, o.C(z.B(sVar.D(1)), false).c, k.B(sVar.D(2)).I());
            } else if (sVar.size() == 4) {
                z B2 = z.B(sVar.D(0));
                z B3 = z.B(sVar.D(1));
                s B4 = s.B(sVar.D(3));
                this.currentSpec = new p(o.C(B2, false).c, o.C(B3, false).c, k.B(sVar.D(2)).I(), k.B(B4.D(0)).I(), o.B(B4.D(1)).c);
            }
        } catch (ClassCastException unused) {
            throw new IOException("Not a valid IES Parameter encoding.");
        } catch (ArrayIndexOutOfBoundsException unused2) {
            throw new IOException("Not a valid IES Parameter encoding.");
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
        return "IES Parameters";
    }

    public boolean isASN1FormatString(String str) {
        return str == null || str.equals("ASN.1");
    }

    public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == p.class || cls == AlgorithmParameterSpec.class) {
            return this.currentSpec;
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to ElGamal parameters object.");
    }
}
