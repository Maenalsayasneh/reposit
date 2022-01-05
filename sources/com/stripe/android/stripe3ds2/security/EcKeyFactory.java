package com.stripe.android.stripe3ds2.security;

import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import i0.j.f.p.h;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import kotlin.Metadata;
import kotlin.Result;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/EcKeyFactory;", "", "", "publicKeyEncoded", "Ljava/security/interfaces/ECPublicKey;", "createPublic", "([B)Ljava/security/interfaces/ECPublicKey;", "privateKeyEncoded", "Ljava/security/interfaces/ECPrivateKey;", "createPrivate", "([B)Ljava/security/interfaces/ECPrivateKey;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "Ljava/security/KeyFactory;", "keyFactory", "Ljava/security/KeyFactory;", "<init>", "(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: EcKeyFactory.kt */
public final class EcKeyFactory {
    private final ErrorReporter errorReporter;
    private final KeyFactory keyFactory;

    public EcKeyFactory(ErrorReporter errorReporter2) {
        Object obj;
        i.e(errorReporter2, "errorReporter");
        this.errorReporter = errorReporter2;
        try {
            obj = KeyFactory.getInstance("EC");
        } catch (Throwable th) {
            obj = h.l0(th);
        }
        Throwable a = Result.a(obj);
        if (a != null) {
            this.errorReporter.reportError(a);
        }
        Throwable a2 = Result.a(obj);
        if (a2 == null) {
            i.d(obj, "runCatching {\n          …xception(error)\n        }");
            this.keyFactory = (KeyFactory) obj;
            return;
        }
        throw new SDKRuntimeException(a2);
    }

    public final ECPrivateKey createPrivate(byte[] bArr) {
        Object obj;
        i.e(bArr, "privateKeyEncoded");
        try {
            PrivateKey generatePrivate = this.keyFactory.generatePrivate(new PKCS8EncodedKeySpec(bArr));
            if (generatePrivate != null) {
                obj = (ECPrivateKey) generatePrivate;
                Throwable a = Result.a(obj);
                if (a == null) {
                    return (ECPrivateKey) obj;
                }
                throw new SDKRuntimeException(a);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.interfaces.ECPrivateKey");
        } catch (Throwable th) {
            obj = h.l0(th);
        }
    }

    public final ECPublicKey createPublic(byte[] bArr) {
        Object obj;
        i.e(bArr, "publicKeyEncoded");
        try {
            PublicKey generatePublic = this.keyFactory.generatePublic(new X509EncodedKeySpec(bArr));
            if (generatePublic != null) {
                obj = (ECPublicKey) generatePublic;
                Throwable a = Result.a(obj);
                if (a != null) {
                    this.errorReporter.reportError(a);
                }
                Throwable a2 = Result.a(obj);
                if (a2 == null) {
                    return (ECPublicKey) obj;
                }
                throw new SDKRuntimeException(a2);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.interfaces.ECPublicKey");
        } catch (Throwable th) {
            obj = h.l0(th);
        }
    }
}
