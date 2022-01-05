package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import s0.a.a.d3.m;
import s0.a.a.e;
import s0.a.a.i2.a;
import s0.a.a.l;
import s0.a.a.n;
import s0.a.a.q2.c;
import s0.a.a.s;
import s0.a.a.v0;
import s0.a.a.v2.b;
import s0.a.a.w2.u;
import s0.a.c.o.d;

public class X509SignatureUtil {
    private static final Map<n, String> algNames;
    private static final l derNull = v0.c;

    static {
        HashMap hashMap = new HashMap();
        algNames = hashMap;
        hashMap.put(a.d, "Ed25519");
        hashMap.put(a.e, "Ed448");
        hashMap.put(b.g, "SHA1withDSA");
        hashMap.put(m.O1, "SHA1withDSA");
    }

    private static String findAlgName(n nVar) {
        String lookupAlg;
        String lookupAlg2;
        Provider provider = Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);
        if (provider != null && (lookupAlg2 = lookupAlg(provider, nVar)) != null) {
            return lookupAlg2;
        }
        Provider[] providers = Security.getProviders();
        for (int i = 0; i != providers.length; i++) {
            if (provider != providers[i] && (lookupAlg = lookupAlg(providers[i], nVar)) != null) {
                return lookupAlg;
            }
        }
        return nVar.d;
    }

    private static String getDigestAlgName(n nVar) {
        String a = d.a(nVar);
        int indexOf = a.indexOf(45);
        if (indexOf <= 0 || a.startsWith("SHA3")) {
            return a;
        }
        return a.substring(0, indexOf) + a.substring(indexOf + 1);
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
                sb.append(getDigestAlgName((n) B.D(0)));
                str = "withECDSA";
            }
            sb.append(str);
            return sb.toString();
        }
        String str2 = algNames.get(bVar.c);
        if (str2 != null) {
            return str2;
        }
        return findAlgName(bVar.c);
    }

    public static boolean isCompositeAlgorithm(s0.a.a.c3.b bVar) {
        return c.z.w(bVar.c);
    }

    private static String lookupAlg(Provider provider, n nVar) {
        String property = provider.getProperty("Alg.Alias.Signature." + nVar);
        if (property != null) {
            return property;
        }
        String property2 = provider.getProperty("Alg.Alias.Signature.OID." + nVar);
        if (property2 != null) {
            return property2;
        }
        return null;
    }

    public static void prettyPrintSignature(byte[] bArr, StringBuffer stringBuffer, String str) {
        int length = bArr.length;
        stringBuffer.append("            Signature: ");
        if (length > 20) {
            stringBuffer.append(s0.a.g.k.d.g(bArr, 0, 20));
            stringBuffer.append(str);
            int i = 20;
            while (i < bArr.length) {
                int length2 = bArr.length - 20;
                stringBuffer.append("                       ");
                stringBuffer.append(i < length2 ? s0.a.g.k.d.g(bArr, i, 20) : s0.a.g.k.d.g(bArr, i, bArr.length - i));
                stringBuffer.append(str);
                i += 20;
            }
            return;
        }
        s0.a.g.k.e eVar = s0.a.g.k.d.a;
        stringBuffer.append(s0.a.g.k.d.g(bArr, 0, bArr.length));
        stringBuffer.append(str);
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
