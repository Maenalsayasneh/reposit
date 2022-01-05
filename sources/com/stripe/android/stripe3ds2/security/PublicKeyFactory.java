package com.stripe.android.stripe3ds2.security;

import android.content.Context;
import android.util.Base64;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import i0.j.f.p.h;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.spec.X509EncodedKeySpec;
import java.util.Scanner;
import kotlin.Metadata;
import kotlin.Result;
import m0.n.b.i;
import m0.t.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/PublicKeyFactory;", "", "", "fileName", "Ljava/security/cert/Certificate;", "generateCertificate", "(Ljava/lang/String;)Ljava/security/cert/Certificate;", "Lcom/stripe/android/stripe3ds2/security/Algorithm;", "algorithm", "Ljava/security/PublicKey;", "generatePublicKey", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/security/Algorithm;)Ljava/security/PublicKey;", "keyFile", "", "readPublicKeyBytes", "(Ljava/lang/String;)[B", "Ljava/io/InputStream;", "readFile", "(Ljava/lang/String;)Ljava/io/InputStream;", "directoryServerId", "create", "(Ljava/lang/String;)Ljava/security/PublicKey;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PublicKeyFactory.kt */
public final class PublicKeyFactory {
    private final Context context;
    private final ErrorReporter errorReporter;

    public PublicKeyFactory(Context context2, ErrorReporter errorReporter2) {
        i.e(context2, "context");
        i.e(errorReporter2, "errorReporter");
        this.errorReporter = errorReporter2;
        Context applicationContext = context2.getApplicationContext();
        i.d(applicationContext, "context.applicationContext");
        this.context = applicationContext;
    }

    private final Certificate generateCertificate(String str) {
        Object obj;
        try {
            obj = CertificateFactory.getInstance("X.509").generateCertificate(readFile(str));
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
            return (Certificate) obj;
        }
        throw new SDKRuntimeException(a2);
    }

    private final PublicKey generatePublicKey(String str, Algorithm algorithm) {
        Object obj;
        try {
            obj = KeyFactory.getInstance(algorithm.toString()).generatePublic(new X509EncodedKeySpec(readPublicKeyBytes(str)));
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
            return (PublicKey) obj;
        }
        throw new SDKRuntimeException(a2);
    }

    private final InputStream readFile(String str) throws IOException {
        InputStream open = this.context.getAssets().open(str);
        i.d(open, "context.assets.open(fileName)");
        return open;
    }

    private final byte[] readPublicKeyBytes(String str) {
        Object obj;
        try {
            String next = new Scanner(readFile(str)).useDelimiter("\\A").next();
            i.d(next, "publicKey");
            byte[] bytes = next.getBytes(a.a);
            i.d(bytes, "(this as java.lang.String).getBytes(charset)");
            obj = Base64.decode(bytes, 0);
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
            return (byte[]) obj;
        }
        throw new SDKRuntimeException(a2);
    }

    public final PublicKey create(String str) {
        i.e(str, "directoryServerId");
        DirectoryServer lookup = DirectoryServer.Companion.lookup(str);
        if (!lookup.isCertificate()) {
            return generatePublicKey(lookup.getFileName(), lookup.getAlgorithm());
        }
        PublicKey publicKey = generateCertificate(lookup.getFileName()).getPublicKey();
        i.d(publicKey, "generateCertificate(dire…erver.fileName).publicKey");
        return publicKey;
    }
}
