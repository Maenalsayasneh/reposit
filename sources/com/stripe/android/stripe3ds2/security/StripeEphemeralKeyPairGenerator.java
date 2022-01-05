package com.stripe.android.stripe3ds2.security;

import com.nimbusds.jose.jwk.Curve;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import i0.j.f.p.h;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.ECGenParameterSpec;
import kotlin.Metadata;
import kotlin.Result;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/StripeEphemeralKeyPairGenerator;", "Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;", "Ljava/security/KeyPair;", "generate", "()Ljava/security/KeyPair;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "<init>", "(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "Companion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeEphemeralKeyPairGenerator.kt */
public final class StripeEphemeralKeyPairGenerator implements EphemeralKeyPairGenerator {
    @Deprecated
    private static final String ALGORITHM = Algorithm.EC.toString();
    private static final Companion Companion = new Companion((f) null);
    private final ErrorReporter errorReporter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/StripeEphemeralKeyPairGenerator$Companion;", "", "", "ALGORITHM", "Ljava/lang/String;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeEphemeralKeyPairGenerator.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public StripeEphemeralKeyPairGenerator(ErrorReporter errorReporter2) {
        i.e(errorReporter2, "errorReporter");
        this.errorReporter = errorReporter2;
    }

    public KeyPair generate() {
        Object obj;
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance(ALGORITHM);
            Curve curve = Curve.c;
            i.d(curve, "Curve.P_256");
            instance.initialize(new ECGenParameterSpec(curve.d2));
            obj = instance.generateKeyPair();
        } catch (Throwable th) {
            obj = h.l0(th);
        }
        Throwable a = Result.a(obj);
        if (a != null) {
            this.errorReporter.reportError(a);
        }
        Throwable a2 = Result.a(obj);
        if (a2 == null) {
            i.d(obj, "runCatching {\n          …meException(it)\n        }");
            return (KeyPair) obj;
        }
        throw new SDKRuntimeException(a2);
    }
}
