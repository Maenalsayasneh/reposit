package okhttp3;

import m0.n.b.f;
import m0.n.b.i;

/* compiled from: TlsVersion.kt */
public enum TlsVersion {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    public static final a Companion = null;
    private final String javaName;

    /* compiled from: TlsVersion.kt */
    public static final class a {
        public a(f fVar) {
        }

        public final TlsVersion a(String str) {
            i.e(str, "javaName");
            int hashCode = str.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return TlsVersion.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return TlsVersion.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return TlsVersion.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return TlsVersion.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return TlsVersion.SSL_3_0;
            }
            throw new IllegalArgumentException(i0.d.a.a.a.n0("Unexpected TLS version: ", str));
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new a((f) null);
    }

    private TlsVersion(String str) {
        this.javaName = str;
    }

    public static final TlsVersion forJavaName(String str) {
        return Companion.a(str);
    }

    /* renamed from: -deprecated_javaName  reason: not valid java name */
    public final String m58deprecated_javaName() {
        return this.javaName;
    }

    public final String javaName() {
        return this.javaName;
    }
}
