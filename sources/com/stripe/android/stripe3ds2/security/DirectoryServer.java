package com.stripe.android.stripe3ds2.security;

import com.nimbusds.jose.jwk.KeyUse;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0001\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bB3\b\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0012\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0017\u001a\u00020\u00168F@\u0006¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018j\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006#"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/DirectoryServer;", "", "Lcom/nimbusds/jose/jwk/KeyUse;", "keyUse", "Lcom/nimbusds/jose/jwk/KeyUse;", "getKeyUse", "()Lcom/nimbusds/jose/jwk/KeyUse;", "", "fileName", "Ljava/lang/String;", "getFileName", "()Ljava/lang/String;", "", "ids", "Ljava/util/List;", "getIds", "()Ljava/util/List;", "Lcom/stripe/android/stripe3ds2/security/Algorithm;", "algorithm", "Lcom/stripe/android/stripe3ds2/security/Algorithm;", "getAlgorithm", "()Lcom/stripe/android/stripe3ds2/security/Algorithm;", "", "isCertificate", "()Z", "<init>", "(Ljava/lang/String;ILjava/util/List;Lcom/stripe/android/stripe3ds2/security/Algorithm;Ljava/lang/String;Lcom/nimbusds/jose/jwk/KeyUse;)V", "Companion", "TestRsa", "TestEc", "Visa", "Mastercard", "Amex", "Discover", "CartesBancaires", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: DirectoryServer.kt */
public enum DirectoryServer {
    TestRsa(r4, r20, "ds-test-rsa.txt", (Algorithm) null, 8, (KeyUse) null),
    TestEc(h.L2("F000000001"), Algorithm.EC, "ds-test-ec.txt", (Algorithm) null, 8, (KeyUse) null),
    Visa(h.L2("A000000003"), r15, "ds-visa.crt", (Algorithm) null, 8, (KeyUse) null),
    Mastercard(h.L2("A000000004"), r15, "ds-mastercard.crt", (Algorithm) null, 8, (KeyUse) null),
    Amex(h.L2("A000000025"), r15, "ds-amex.pem", (Algorithm) null, 8, (KeyUse) null),
    Discover(g.K("A000000152", "A000000324"), r15, "ds-discover.cer", (Algorithm) null),
    CartesBancaires(h.L2("A000000042"), r15, "ds-cartesbancaires.pem", (Algorithm) null, 8, (KeyUse) null);
    
    private static final Set<String> CERTIFICATE_EXTENSIONS = null;
    public static final Companion Companion = null;
    private final Algorithm algorithm;
    private final String fileName;
    private final List<String> ids;
    private final KeyUse keyUse;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/DirectoryServer$Companion;", "", "", "directoryServerId", "Lcom/stripe/android/stripe3ds2/security/DirectoryServer;", "lookup", "(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/security/DirectoryServer;", "", "CERTIFICATE_EXTENSIONS", "Ljava/util/Set;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: DirectoryServer.kt */
    public static final class Companion {
        private Companion() {
        }

        public final DirectoryServer lookup(String str) {
            DirectoryServer directoryServer;
            i.e(str, "directoryServerId");
            DirectoryServer[] values = DirectoryServer.values();
            int i = 0;
            while (true) {
                if (i >= 7) {
                    directoryServer = null;
                    break;
                }
                directoryServer = values[i];
                if (directoryServer.getIds().contains(str)) {
                    break;
                }
                i++;
            }
            if (directoryServer != null) {
                return directoryServer;
            }
            throw new SDKRuntimeException(new IllegalArgumentException(a.n0("Unknown directory server id: ", str)));
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((f) null);
        CERTIFICATE_EXTENSIONS = g.h0(".crt", ".cer", ".pem");
    }

    private DirectoryServer(List<String> list, Algorithm algorithm2, String str, KeyUse keyUse2) {
        this.ids = list;
        this.algorithm = algorithm2;
        this.fileName = str;
        this.keyUse = keyUse2;
    }

    public final Algorithm getAlgorithm() {
        return this.algorithm;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final List<String> getIds() {
        return this.ids;
    }

    public final KeyUse getKeyUse() {
        return this.keyUse;
    }

    public final boolean isCertificate() {
        Set<String> set = CERTIFICATE_EXTENSIONS;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (String e : set) {
            if (StringsKt__IndentKt.e(this.fileName, e, false, 2)) {
                return true;
            }
        }
        return false;
    }
}
