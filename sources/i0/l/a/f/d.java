package i0.l.a.f;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.util.Base64URL;
import i0.j.f.p.h;
import i0.l.a.e;
import i0.l.a.f.h.g;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: MACVerifier */
public class d extends i0.l.a.f.h.d implements e {
    public static final Set<JWSAlgorithm> c;
    public final byte[] d;
    public final g e;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(JWSAlgorithm.q);
        linkedHashSet.add(JWSAlgorithm.x);
        linkedHashSet.add(JWSAlgorithm.y);
        c = Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(SecretKey secretKey) throws JOSEException {
        super(c);
        byte[] encoded = secretKey.getEncoded();
        if (encoded.length >= 32) {
            this.d = encoded;
            g gVar = new g();
            this.e = gVar;
            gVar.b((Set<String>) null);
            return;
        }
        throw new KeyLengthException("The secret length must be at least 256 bits");
    }

    public boolean a(JWSHeader jWSHeader, byte[] bArr, Base64URL base64URL) throws JOSEException {
        String str;
        if (!this.e.a(jWSHeader)) {
            return false;
        }
        JWSAlgorithm jWSAlgorithm = (JWSAlgorithm) jWSHeader.d;
        if (jWSAlgorithm.equals(JWSAlgorithm.q)) {
            str = "HMACSHA256";
        } else if (jWSAlgorithm.equals(JWSAlgorithm.x)) {
            str = "HMACSHA384";
        } else if (jWSAlgorithm.equals(JWSAlgorithm.y)) {
            str = "HMACSHA512";
        } else {
            throw new JOSEException(h.y4(jWSAlgorithm, c));
        }
        byte[] bArr2 = this.d;
        return h.o(h.N(new SecretKeySpec(bArr2, str), bArr, this.b.a), base64URL.a());
    }
}
