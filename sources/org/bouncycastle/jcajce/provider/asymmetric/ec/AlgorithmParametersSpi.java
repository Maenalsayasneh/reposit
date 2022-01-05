package org.bouncycastle.jcajce.provider.asymmetric.ec;

import i0.d.a.a.a;
import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import s0.a.a.d3.f;
import s0.a.a.d3.h;
import s0.a.a.d3.j;
import s0.a.a.l;
import s0.a.a.n;
import s0.a.a.r;
import s0.a.a.v0;
import s0.a.d.e.d;
import s0.a.d.e.e;

public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    private String curveName;
    private ECParameterSpec ecParameterSpec;

    public byte[] engineGetEncoded() throws IOException {
        return engineGetEncoded("ASN.1");
    }

    public byte[] engineGetEncoded(String str) throws IOException {
        f fVar;
        if (isASN1FormatString(str)) {
            ECParameterSpec eCParameterSpec = this.ecParameterSpec;
            if (eCParameterSpec == null) {
                fVar = new f((l) v0.c);
            } else {
                String str2 = this.curveName;
                if (str2 != null) {
                    fVar = new f(ECUtil.getNamedCurveOid(str2));
                } else {
                    e convertSpec = EC5Util.convertSpec(eCParameterSpec);
                    fVar = new f(new h(convertSpec.a, new j(convertSpec.c, false), convertSpec.d, convertSpec.e, convertSpec.b));
                }
            }
            return fVar.getEncoded();
        }
        throw new IOException(a.n0("Unknown parameters format in AlgorithmParameters object: ", str));
    }

    public <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) throws InvalidParameterSpecException {
        if (ECParameterSpec.class.isAssignableFrom(cls) || cls == AlgorithmParameterSpec.class) {
            return this.ecParameterSpec;
        }
        if (ECGenParameterSpec.class.isAssignableFrom(cls)) {
            String str = this.curveName;
            if (str != null) {
                n namedCurveOid = ECUtil.getNamedCurveOid(str);
                return namedCurveOid != null ? new ECGenParameterSpec(namedCurveOid.d) : new ECGenParameterSpec(this.curveName);
            }
            n namedCurveOid2 = ECUtil.getNamedCurveOid(EC5Util.convertSpec(this.ecParameterSpec));
            if (namedCurveOid2 != null) {
                return new ECGenParameterSpec(namedCurveOid2.d);
            }
        }
        throw new InvalidParameterSpecException(a.W(cls, a.P0("EC AlgorithmParameters cannot convert to ")));
    }

    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (algorithmParameterSpec instanceof ECGenParameterSpec) {
            ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) algorithmParameterSpec;
            h domainParametersFromGenSpec = ECUtils.getDomainParametersFromGenSpec(eCGenParameterSpec);
            if (domainParametersFromGenSpec != null) {
                this.curveName = eCGenParameterSpec.getName();
                ECParameterSpec convertToSpec = EC5Util.convertToSpec(domainParametersFromGenSpec);
                this.ecParameterSpec = new d(this.curveName, convertToSpec.getCurve(), convertToSpec.getGenerator(), convertToSpec.getOrder(), BigInteger.valueOf((long) convertToSpec.getCofactor()));
                return;
            }
            StringBuilder P0 = a.P0("EC curve name not recognized: ");
            P0.append(eCGenParameterSpec.getName());
            throw new InvalidParameterSpecException(P0.toString());
        } else if (algorithmParameterSpec instanceof ECParameterSpec) {
            this.curveName = algorithmParameterSpec instanceof d ? ((d) algorithmParameterSpec).a : null;
            this.ecParameterSpec = (ECParameterSpec) algorithmParameterSpec;
        } else {
            StringBuilder P02 = a.P0("AlgorithmParameterSpec class not recognized: ");
            P02.append(algorithmParameterSpec.getClass().getName());
            throw new InvalidParameterSpecException(P02.toString());
        }
    }

    public void engineInit(byte[] bArr) throws IOException {
        engineInit(bArr, "ASN.1");
    }

    public String engineToString() {
        return "EC Parameters";
    }

    public boolean isASN1FormatString(String str) {
        return str == null || str.equals("ASN.1");
    }

    public void engineInit(byte[] bArr, String str) throws IOException {
        if (isASN1FormatString(str)) {
            f s = f.s(bArr);
            s0.a.e.b.e curve = EC5Util.getCurve(BouncyCastleProvider.CONFIGURATION, s);
            r rVar = s.c;
            if (rVar instanceof n) {
                n D = n.D(rVar);
                String Q1 = m0.r.t.a.r.m.a1.a.Q1(D);
                this.curveName = Q1;
                if (Q1 == null) {
                    this.curveName = D.d;
                }
            }
            this.ecParameterSpec = EC5Util.convertToSpec(s, curve);
            return;
        }
        throw new IOException(a.n0("Unknown encoded parameters format in AlgorithmParameters object: ", str));
    }
}
