package q0.h0.n;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.EmptyList;
import m0.n.b.i;

/* compiled from: OkHostnameVerifier.kt */
public final class d implements HostnameVerifier {
    public static final d a = new d();

    public final List<String> a(X509Certificate x509Certificate, int i) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return EmptyList.c;
            }
            ArrayList arrayList = new ArrayList();
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        if (!(!i.a(next.get(0), Integer.valueOf(i)))) {
                            Object obj = next.get(1);
                            if (obj != null) {
                                arrayList.add((String) obj);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return EmptyList.c;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x013a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(java.lang.String r13, java.security.cert.X509Certificate r14) {
        /*
            r12 = this;
            java.lang.String r0 = "host"
            m0.n.b.i.e(r13, r0)
            java.lang.String r0 = "certificate"
            m0.n.b.i.e(r14, r0)
            byte[] r0 = q0.h0.c.a
            java.lang.String r0 = "$this$canParseAsIpAddress"
            m0.n.b.i.e(r13, r0)
            kotlin.text.Regex r0 = q0.h0.c.f
            boolean r0 = r0.a(r13)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x004c
            java.lang.String r13 = m0.r.t.a.r.m.a1.a.Y3(r13)
            r0 = 7
            java.util.List r14 = r12.a(r14, r0)
            boolean r0 = r14 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0030
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x0030
            goto L_0x013b
        L_0x0030:
            java.util.Iterator r14 = r14.iterator()
        L_0x0034:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x013b
            java.lang.Object r0 = r14.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = m0.r.t.a.r.m.a1.a.Y3(r0)
            boolean r0 = m0.n.b.i.a(r13, r0)
            if (r0 == 0) goto L_0x0034
            goto L_0x013a
        L_0x004c:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = "Locale.US"
            m0.n.b.i.d(r0, r3)
            java.lang.String r13 = r13.toLowerCase(r0)
            java.lang.String r0 = "(this as java.lang.String).toLowerCase(locale)"
            m0.n.b.i.d(r13, r0)
            r4 = 2
            java.util.List r14 = r12.a(r14, r4)
            boolean r5 = r14 instanceof java.util.Collection
            if (r5 == 0) goto L_0x006d
            boolean r5 = r14.isEmpty()
            if (r5 == 0) goto L_0x006d
            goto L_0x013b
        L_0x006d:
            java.util.Iterator r14 = r14.iterator()
        L_0x0071:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L_0x013b
            java.lang.Object r5 = r14.next()
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r13.length()
            if (r6 != 0) goto L_0x0085
            r6 = r2
            goto L_0x0086
        L_0x0085:
            r6 = r1
        L_0x0086:
            if (r6 != 0) goto L_0x0137
            java.lang.String r6 = "."
            boolean r7 = kotlin.text.StringsKt__IndentKt.J(r13, r6, r1, r4)
            if (r7 != 0) goto L_0x0137
            java.lang.String r7 = ".."
            boolean r8 = kotlin.text.StringsKt__IndentKt.e(r13, r7, r1, r4)
            if (r8 == 0) goto L_0x009a
            goto L_0x0137
        L_0x009a:
            if (r5 == 0) goto L_0x00a5
            int r8 = r5.length()
            if (r8 != 0) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            r8 = r1
            goto L_0x00a6
        L_0x00a5:
            r8 = r2
        L_0x00a6:
            if (r8 != 0) goto L_0x0137
            boolean r8 = kotlin.text.StringsKt__IndentKt.J(r5, r6, r1, r4)
            if (r8 != 0) goto L_0x0137
            boolean r7 = kotlin.text.StringsKt__IndentKt.e(r5, r7, r1, r4)
            if (r7 == 0) goto L_0x00b6
            goto L_0x0137
        L_0x00b6:
            boolean r7 = kotlin.text.StringsKt__IndentKt.e(r13, r6, r1, r4)
            if (r7 != 0) goto L_0x00c1
            java.lang.String r7 = i0.d.a.a.a.n0(r13, r6)
            goto L_0x00c2
        L_0x00c1:
            r7 = r13
        L_0x00c2:
            boolean r8 = kotlin.text.StringsKt__IndentKt.e(r5, r6, r1, r4)
            if (r8 != 0) goto L_0x00cc
            java.lang.String r5 = i0.d.a.a.a.n0(r5, r6)
        L_0x00cc:
            java.util.Locale r6 = java.util.Locale.US
            m0.n.b.i.d(r6, r3)
            java.lang.String r8 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r5, r8)
            java.lang.String r5 = r5.toLowerCase(r6)
            m0.n.b.i.d(r5, r0)
            java.lang.String r6 = "*"
            boolean r6 = kotlin.text.StringsKt__IndentKt.d(r5, r6, r1, r4)
            if (r6 != 0) goto L_0x00ea
            boolean r5 = m0.n.b.i.a(r7, r5)
            goto L_0x0138
        L_0x00ea:
            java.lang.String r6 = "*."
            boolean r8 = kotlin.text.StringsKt__IndentKt.J(r5, r6, r1, r4)
            if (r8 == 0) goto L_0x0137
            r8 = 42
            r9 = 4
            int r8 = kotlin.text.StringsKt__IndentKt.l(r5, r8, r2, r1, r9)
            r10 = -1
            if (r8 == r10) goto L_0x00fd
            goto L_0x0137
        L_0x00fd:
            int r8 = r7.length()
            int r11 = r5.length()
            if (r8 >= r11) goto L_0x0108
            goto L_0x0137
        L_0x0108:
            boolean r6 = m0.n.b.i.a(r6, r5)
            if (r6 == 0) goto L_0x010f
            goto L_0x0137
        L_0x010f:
            java.lang.String r5 = r5.substring(r2)
            java.lang.String r6 = "(this as java.lang.String).substring(startIndex)"
            m0.n.b.i.d(r5, r6)
            boolean r6 = kotlin.text.StringsKt__IndentKt.e(r7, r5, r1, r4)
            if (r6 != 0) goto L_0x011f
            goto L_0x0137
        L_0x011f:
            int r6 = r7.length()
            int r5 = r5.length()
            int r6 = r6 - r5
            if (r6 <= 0) goto L_0x0135
            r5 = 46
            int r6 = r6 + -1
            int r5 = kotlin.text.StringsKt__IndentKt.p(r7, r5, r6, r1, r9)
            if (r5 == r10) goto L_0x0135
            goto L_0x0137
        L_0x0135:
            r5 = r2
            goto L_0x0138
        L_0x0137:
            r5 = r1
        L_0x0138:
            if (r5 == 0) goto L_0x0071
        L_0x013a:
            r1 = r2
        L_0x013b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.n.d.b(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    public boolean verify(String str, SSLSession sSLSession) {
        i.e(str, "host");
        i.e(sSLSession, "session");
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return b(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
