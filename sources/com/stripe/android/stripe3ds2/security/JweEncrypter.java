package com.stripe.android.stripe3ds2.security;

import com.nimbusds.jose.JOSEException;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.text.ParseException;
import kotlin.Metadata;
import kotlin.Result;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B!\b\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014B\u0019\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0017J/\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/JweEncrypter;", "", "", "payload", "Ljava/security/PublicKey;", "acsPublicKey", "directoryServerId", "keyId", "encrypt", "(Ljava/lang/String;Ljava/security/PublicKey;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/stripe/android/stripe3ds2/security/JweRsaEncrypter;", "jweRsaEncrypter", "Lcom/stripe/android/stripe3ds2/security/JweRsaEncrypter;", "Lcom/stripe/android/stripe3ds2/security/JweEcEncrypter;", "jweEcEncrypter", "Lcom/stripe/android/stripe3ds2/security/JweEcEncrypter;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "<init>", "(Lcom/stripe/android/stripe3ds2/security/JweRsaEncrypter;Lcom/stripe/android/stripe3ds2/security/JweEcEncrypter;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;", "ephemeralKeyPairGenerator", "(Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: JweEncrypter.kt */
public final class JweEncrypter {
    private final ErrorReporter errorReporter;
    private final JweEcEncrypter jweEcEncrypter;
    private final JweRsaEncrypter jweRsaEncrypter;

    private JweEncrypter(JweRsaEncrypter jweRsaEncrypter2, JweEcEncrypter jweEcEncrypter2, ErrorReporter errorReporter2) {
        this.jweRsaEncrypter = jweRsaEncrypter2;
        this.jweEcEncrypter = jweEcEncrypter2;
        this.errorReporter = errorReporter2;
    }

    public final String encrypt(String str, PublicKey publicKey, String str2, String str3) throws JOSEException, ParseException {
        Object obj;
        i.e(str, "payload");
        i.e(publicKey, "acsPublicKey");
        i.e(str2, "directoryServerId");
        if (publicKey instanceof RSAPublicKey) {
            obj = this.jweRsaEncrypter.encrypt(str, (RSAPublicKey) publicKey, str3);
        } else if (publicKey instanceof ECPublicKey) {
            obj = this.jweEcEncrypter.encrypt(str, (ECPublicKey) publicKey, str2);
        } else {
            StringBuilder P0 = a.P0("Unsupported public key algorithm: ");
            P0.append(publicKey.getAlgorithm());
            obj = h.l0(new SDKRuntimeException(P0.toString(), (Throwable) null, 2, (f) null));
        }
        Throwable a = Result.a(obj);
        if (a != null) {
            this.errorReporter.reportError(a);
        }
        h.d4(obj);
        return (String) obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public JweEncrypter(EphemeralKeyPairGenerator ephemeralKeyPairGenerator, ErrorReporter errorReporter2) {
        this(new JweRsaEncrypter(), new JweEcEncrypter(ephemeralKeyPairGenerator, errorReporter2), errorReporter2);
        i.e(ephemeralKeyPairGenerator, "ephemeralKeyPairGenerator");
        i.e(errorReporter2, "errorReporter");
    }
}
