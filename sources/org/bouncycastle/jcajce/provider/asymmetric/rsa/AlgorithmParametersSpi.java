package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import i0.d.a.a.a;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.Objects;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import s0.a.a.c3.b;
import s0.a.a.k;
import s0.a.a.n;
import s0.a.a.o;
import s0.a.a.s;
import s0.a.a.v0;
import s0.a.a.w2.r;
import s0.a.a.w2.u;
import s0.a.a.x0;
import s0.a.c.o.d;

public abstract class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {

    public static class OAEP extends AlgorithmParametersSpi {
        public OAEPParameterSpec currentSpec;

        public byte[] engineGetEncoded() {
            n oid = DigestFactory.getOID(this.currentSpec.getDigestAlgorithm());
            v0 v0Var = v0.c;
            try {
                return new r(new b(oid, v0Var), new b(s0.a.a.w2.n.u, new b(DigestFactory.getOID(((MGF1ParameterSpec) this.currentSpec.getMGFParameters()).getDigestAlgorithm()), v0Var)), new b(s0.a.a.w2.n.v, new x0(((PSource.PSpecified) this.currentSpec.getPSource()).getValue()))).r("DER");
            } catch (IOException unused) {
                throw new RuntimeException("Error encoding OAEPParameters");
            }
        }

        public byte[] engineGetEncoded(String str) {
            if (isASN1FormatString(str) || str.equalsIgnoreCase("X.509")) {
                return engineGetEncoded();
            }
            return null;
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof OAEPParameterSpec) {
                this.currentSpec = (OAEPParameterSpec) algorithmParameterSpec;
                return;
            }
            throw new InvalidParameterSpecException("OAEPParameterSpec required to initialise an OAEP algorithm parameters object");
        }

        public void engineInit(byte[] bArr) throws IOException {
            try {
                b bVar = r.c;
                r rVar = bArr instanceof r ? (r) bArr : bArr != null ? new r(s.B(bArr)) : null;
                if (rVar.y.c.w(s0.a.a.w2.n.u)) {
                    this.currentSpec = new OAEPParameterSpec(d.a(rVar.x.c), OAEPParameterSpec.DEFAULT.getMGFAlgorithm(), new MGF1ParameterSpec(d.a(b.s(rVar.y.d).c)), new PSource.PSpecified(o.B(rVar.Y1.d).c));
                    return;
                }
                throw new IOException("unknown mask generation function: " + rVar.y.c);
            } catch (ClassCastException unused) {
                throw new IOException("Not a valid OAEP Parameter encoding.");
            } catch (ArrayIndexOutOfBoundsException unused2) {
                throw new IOException("Not a valid OAEP Parameter encoding.");
            }
        }

        public void engineInit(byte[] bArr, String str) throws IOException {
            if (str.equalsIgnoreCase("X.509") || str.equalsIgnoreCase("ASN.1")) {
                engineInit(bArr);
                return;
            }
            throw new IOException(a.n0("Unknown parameter format ", str));
        }

        public String engineToString() {
            return "OAEP Parameters";
        }

        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == OAEPParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return this.currentSpec;
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to OAEP parameters object.");
        }
    }

    public static class PSS extends AlgorithmParametersSpi {
        public PSSParameterSpec currentSpec;

        public byte[] engineGetEncoded() throws IOException {
            PSSParameterSpec pSSParameterSpec = this.currentSpec;
            n oid = DigestFactory.getOID(pSSParameterSpec.getDigestAlgorithm());
            v0 v0Var = v0.c;
            return new u(new b(oid, v0Var), new b(s0.a.a.w2.n.u, new b(DigestFactory.getOID(((MGF1ParameterSpec) pSSParameterSpec.getMGFParameters()).getDigestAlgorithm()), v0Var)), new k((long) pSSParameterSpec.getSaltLength()), new k((long) pSSParameterSpec.getTrailerField())).r("DER");
        }

        public byte[] engineGetEncoded(String str) throws IOException {
            if (str.equalsIgnoreCase("X.509") || str.equalsIgnoreCase("ASN.1")) {
                return engineGetEncoded();
            }
            return null;
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof PSSParameterSpec) {
                this.currentSpec = (PSSParameterSpec) algorithmParameterSpec;
                return;
            }
            throw new InvalidParameterSpecException("PSSParameterSpec required to initialise an PSS algorithm parameters object");
        }

        public void engineInit(byte[] bArr) throws IOException {
            try {
                u s = u.s(bArr);
                if (s.Y1.c.w(s0.a.a.w2.n.u)) {
                    this.currentSpec = new PSSParameterSpec(d.a(s.y.c), PSSParameterSpec.DEFAULT.getMGFAlgorithm(), new MGF1ParameterSpec(d.a(b.s(s.Y1.d).c)), s.Z1.E().intValue(), s.a2.E().intValue());
                    return;
                }
                throw new IOException("unknown mask generation function: " + s.Y1.c);
            } catch (ClassCastException unused) {
                throw new IOException("Not a valid PSS Parameter encoding.");
            } catch (ArrayIndexOutOfBoundsException unused2) {
                throw new IOException("Not a valid PSS Parameter encoding.");
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
            return "PSS Parameters";
        }

        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == PSSParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return this.currentSpec;
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to PSS parameters object.");
        }
    }

    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        Objects.requireNonNull(cls, "argument to getParameterSpec must not be null");
        return localEngineGetParameterSpec(cls);
    }

    public boolean isASN1FormatString(String str) {
        return str == null || str.equals("ASN.1");
    }

    public abstract AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException;
}
