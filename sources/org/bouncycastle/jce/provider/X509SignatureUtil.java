package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;
import s0.a.a.d3.m;
import s0.a.a.e;
import s0.a.a.g2.a;
import s0.a.a.l;
import s0.a.a.n;
import s0.a.a.s;
import s0.a.a.v0;
import s0.a.a.v2.b;
import s0.a.a.w2.u;

public class X509SignatureUtil {
    private static final l derNull = v0.c;

    private static String getDigestAlgName(n nVar) {
        if (s0.a.a.w2.n.X.w(nVar)) {
            return "MD5";
        }
        if (b.f.w(nVar)) {
            return "SHA1";
        }
        if (s0.a.a.r2.b.f.w(nVar)) {
            return "SHA224";
        }
        if (s0.a.a.r2.b.c.w(nVar)) {
            return "SHA256";
        }
        if (s0.a.a.r2.b.d.w(nVar)) {
            return "SHA384";
        }
        if (s0.a.a.r2.b.e.w(nVar)) {
            return "SHA512";
        }
        if (s0.a.a.z2.b.c.w(nVar)) {
            return "RIPEMD128";
        }
        if (s0.a.a.z2.b.b.w(nVar)) {
            return "RIPEMD160";
        }
        if (s0.a.a.z2.b.d.w(nVar)) {
            return "RIPEMD256";
        }
        return a.b.w(nVar) ? "GOST3411" : nVar.d;
    }

    public static String getSignatureName(s0.a.a.c3.b bVar) {
        String str;
        StringBuilder sb;
        e eVar = bVar.d;
        if (eVar != null && !derNull.v(eVar)) {
            if (bVar.c.w(s0.a.a.w2.n.w)) {
                u s = u.s(eVar);
                sb = new StringBuilder();
                sb.append(getDigestAlgName(s.y.c));
                str = "withRSAandMGF1";
            } else if (bVar.c.w(m.i1)) {
                s B = s.B(eVar);
                sb = new StringBuilder();
                sb.append(getDigestAlgName(n.D(B.D(0))));
                str = "withECDSA";
            }
            sb.append(str);
            return sb.toString();
        }
        return bVar.c.d;
    }

    public static void setSignatureParameters(Signature signature, e eVar) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        if (eVar != null && !derNull.v(eVar)) {
            AlgorithmParameters instance = AlgorithmParameters.getInstance(signature.getAlgorithm(), signature.getProvider());
            try {
                instance.init(eVar.c().getEncoded());
                if (signature.getAlgorithm().endsWith("MGF1")) {
                    try {
                        signature.setParameter(instance.getParameterSpec(PSSParameterSpec.class));
                    } catch (GeneralSecurityException e) {
                        StringBuilder P0 = i0.d.a.a.a.P0("Exception extracting parameters: ");
                        P0.append(e.getMessage());
                        throw new SignatureException(P0.toString());
                    }
                }
            } catch (IOException e2) {
                throw new SignatureException(i0.d.a.a.a.V(e2, i0.d.a.a.a.P0("IOException decoding parameters: ")));
            }
        }
    }
}
