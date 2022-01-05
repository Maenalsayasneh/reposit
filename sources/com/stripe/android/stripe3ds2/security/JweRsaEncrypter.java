package com.stripe.android.stripe3ds2.security;

import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.CompressionAlgorithm;
import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JOSEObjectType;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.JWEObject;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import i0.l.a.f.e;
import java.net.URI;
import java.security.interfaces.RSAPublicKey;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/JweRsaEncrypter;", "", "", "payload", "Ljava/security/interfaces/RSAPublicKey;", "publicKey", "keyId", "encrypt", "(Ljava/lang/String;Ljava/security/interfaces/RSAPublicKey;Ljava/lang/String;)Ljava/lang/String;", "Lcom/nimbusds/jose/JWEObject;", "createJweObject", "(Ljava/lang/String;Ljava/lang/String;)Lcom/nimbusds/jose/JWEObject;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: JweRsaEncrypter.kt */
public final class JweRsaEncrypter {
    public final JWEObject createJweObject(String str, String str2) {
        String str3 = str;
        i.e(str3, "payload");
        JWEAlgorithm jWEAlgorithm = JWEAlgorithm.y;
        EncryptionMethod encryptionMethod = EncryptionMethod.q;
        if (jWEAlgorithm.d.equals(Algorithm.c.d)) {
            throw new IllegalArgumentException("The JWE algorithm \"alg\" cannot be \"none\"");
        } else if (encryptionMethod != null) {
            JWEHeader jWEHeader = r2;
            JWEHeader jWEHeader2 = new JWEHeader(jWEAlgorithm, encryptionMethod, (JOSEObjectType) null, (String) null, (Set<String>) null, (URI) null, (JWK) null, (URI) null, (Base64URL) null, (Base64URL) null, (List<Base64>) null, str2, (JWK) null, (CompressionAlgorithm) null, (Base64URL) null, (Base64URL) null, (Base64URL) null, 0, (Base64URL) null, (Base64URL) null, (Map<String, Object>) null, (Base64URL) null);
            return new JWEObject(jWEHeader, new Payload(str3));
        } else {
            throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
        }
    }

    public final String encrypt(String str, RSAPublicKey rSAPublicKey, String str2) throws JOSEException {
        i.e(str, "payload");
        i.e(rSAPublicKey, "publicKey");
        JWEObject createJweObject = createJweObject(str, str2);
        createJweObject.b(new e(rSAPublicKey));
        String d = createJweObject.d();
        i.d(d, "jwe.serialize()");
        return d;
    }
}
