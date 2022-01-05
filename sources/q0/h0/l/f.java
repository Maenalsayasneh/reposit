package q0.h0.l;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import m0.n.b.i;
import okhttp3.Protocol;

/* compiled from: Jdk9Platform.kt */
public class f extends h {
    public static final boolean d;
    public static final a e = new a((m0.n.b.f) null);

    /* compiled from: Jdk9Platform.kt */
    public static final class a {
        public a(m0.n.b.f fVar) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r1.intValue() >= 9) goto L_0x002c;
     */
    static {
        /*
            q0.h0.l.f$a r0 = new q0.h0.l.f$a
            r1 = 0
            r0.<init>(r1)
            e = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.Integer r1 = kotlin.text.StringsKt__IndentKt.S(r0)
        L_0x0014:
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L_0x0023
            int r1 = r1.intValue()
            r3 = 9
            if (r1 < r3) goto L_0x0021
            goto L_0x002c
        L_0x0021:
            r0 = r2
            goto L_0x002c
        L_0x0023:
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0021 }
            r1.getMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0021 }
        L_0x002c:
            d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.l.f.<clinit>():void");
    }

    public void d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        i.e(sSLSocket, "sslSocket");
        i.e(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        List<String> a2 = h.c.a(list);
        i.d(sSLParameters, "sslParameters");
        Object[] array = ((ArrayList) a2).toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    public String f(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol != null) {
                if (applicationProtocol.hashCode() != 0) {
                    return applicationProtocol;
                }
                if (applicationProtocol.equals("")) {
                    return null;
                }
                return applicationProtocol;
            }
        } catch (UnsupportedOperationException unused) {
        }
        return null;
    }
}
