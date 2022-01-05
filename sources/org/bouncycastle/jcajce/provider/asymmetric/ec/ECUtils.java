package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import s0.a.a.d3.f;
import s0.a.a.d3.h;
import s0.a.a.d3.j;
import s0.a.a.l;
import s0.a.a.n;
import s0.a.a.v0;
import s0.a.b.k0.b;
import s0.a.d.e.d;
import s0.a.e.b.e;

public class ECUtils {
    public static b generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        return publicKey instanceof BCECPublicKey ? ((BCECPublicKey) publicKey).engineGetKeyParameters() : ECUtil.generatePublicKeyParameter(publicKey);
    }

    public static h getDomainParametersFromGenSpec(ECGenParameterSpec eCGenParameterSpec) {
        return getDomainParametersFromName(eCGenParameterSpec.getName());
    }

    public static f getDomainParametersFromName(ECParameterSpec eCParameterSpec, boolean z) {
        if (eCParameterSpec instanceof d) {
            d dVar = (d) eCParameterSpec;
            n namedCurveOid = ECUtil.getNamedCurveOid(dVar.a);
            if (namedCurveOid == null) {
                namedCurveOid = new n(dVar.a);
            }
            return new f(namedCurveOid);
        } else if (eCParameterSpec == null) {
            return new f((l) v0.c);
        } else {
            e convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
            return new f(new h(convertCurve, new j(EC5Util.convertPoint(convertCurve, eCParameterSpec.getGenerator()), z), eCParameterSpec.getOrder(), BigInteger.valueOf((long) eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed()));
        }
    }

    public static h getDomainParametersFromName(String str) {
        try {
            if (str.charAt(0) >= '0' && str.charAt(0) <= '2') {
                return ECUtil.getNamedCurveByOid(new n(str));
            }
            if (str.indexOf(32) > 0) {
                str = str.substring(str.indexOf(32) + 1);
            }
            return ECUtil.getNamedCurveByName(str);
        } catch (IllegalArgumentException unused) {
            return ECUtil.getNamedCurveByName(str);
        }
    }
}
