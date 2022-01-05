package com.stripe.android.stripe3ds2.security;

import com.nimbusds.jose.util.Base64URL;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import i0.j.f.p.h;
import i0.l.a.f.h.e;
import i0.l.a.j.c;
import java.security.Provider;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.Result;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/StripeDiffieHellmanKeyGenerator;", "Lcom/stripe/android/stripe3ds2/security/DiffieHellmanKeyGenerator;", "Ljava/security/interfaces/ECPublicKey;", "acsPublicKey", "Ljava/security/interfaces/ECPrivateKey;", "sdkPrivateKey", "", "agreementInfo", "Ljavax/crypto/SecretKey;", "generate", "(Ljava/security/interfaces/ECPublicKey;Ljava/security/interfaces/ECPrivateKey;Ljava/lang/String;)Ljavax/crypto/SecretKey;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "<init>", "(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "Companion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeDiffieHellmanKeyGenerator.kt */
public final class StripeDiffieHellmanKeyGenerator implements DiffieHellmanKeyGenerator {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String HASH_ALGO = "SHA-256";
    @Deprecated
    private static final int KEY_LENGTH = 256;
    private final ErrorReporter errorReporter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/StripeDiffieHellmanKeyGenerator$Companion;", "", "", "HASH_ALGO", "Ljava/lang/String;", "", "KEY_LENGTH", "I", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeDiffieHellmanKeyGenerator.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public StripeDiffieHellmanKeyGenerator(ErrorReporter errorReporter2) {
        i.e(errorReporter2, "errorReporter");
        this.errorReporter = errorReporter2;
    }

    public SecretKey generate(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey, String str) {
        Object obj;
        i.e(eCPublicKey, "acsPublicKey");
        i.e(eCPrivateKey, "sdkPrivateKey");
        i.e(str, "agreementInfo");
        try {
            obj = new e(HASH_ALGO).a(h.w0(eCPublicKey, eCPrivateKey, (Provider) null), 256, e.b((byte[]) null), e.b((byte[]) null), e.b(Base64URL.d(str.getBytes(c.a)).a()), h.f4(256), new byte[0]);
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
            return (SecretKey) obj;
        }
        throw new SDKRuntimeException(a2);
    }
}
