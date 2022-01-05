package q0.h0.d;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.Objects;
import m0.j.g;
import m0.n.b.i;
import q0.c;
import q0.s;
import q0.w;

/* compiled from: JavaNetAuthenticator.kt */
public final class b implements c {
    public final s b;

    public b(s sVar, int i) {
        s sVar2 = (i & 1) != 0 ? s.a : null;
        i.e(sVar2, "defaultDns");
        this.b = sVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0200  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q0.b0 a(q0.g0 r22, q0.e0 r23) throws java.io.IOException {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            r3 = r23
            java.lang.String r0 = "response"
            m0.n.b.i.e(r3, r0)
            q0.v r4 = r3.Z1
            int r0 = r3.y
            r5 = 1
            r6 = 401(0x191, float:5.62E-43)
            r7 = 0
            r8 = 407(0x197, float:5.7E-43)
            if (r0 == r6) goto L_0x001f
            if (r0 == r8) goto L_0x001c
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.c
            goto L_0x0064
        L_0x001c:
            java.lang.String r0 = "Proxy-Authenticate"
            goto L_0x0021
        L_0x001f:
            java.lang.String r0 = "WWW-Authenticate"
        L_0x0021:
            r6 = r0
            okio.ByteString r0 = q0.h0.h.e.a
            java.lang.String r0 = "$this$parseChallenges"
            m0.n.b.i.e(r4, r0)
            java.lang.String r0 = "headerName"
            m0.n.b.i.e(r6, r0)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r10 = r4.size()
            r11 = r7
        L_0x0038:
            if (r11 >= r10) goto L_0x0063
            java.lang.String r0 = r4.c(r11)
            boolean r0 = kotlin.text.StringsKt__IndentKt.f(r6, r0, r5)
            if (r0 == 0) goto L_0x0060
            r0.f r0 = new r0.f
            r0.<init>()
            java.lang.String r12 = r4.k(r11)
            r0.U(r12)
            q0.h0.h.e.b(r0, r9)     // Catch:{ EOFException -> 0x0054 }
            goto L_0x0060
        L_0x0054:
            r0 = move-exception
            r12 = r0
            q0.h0.l.h$a r0 = q0.h0.l.h.c
            q0.h0.l.h r0 = q0.h0.l.h.a
            r13 = 5
            java.lang.String r14 = "Unable to parse challenge"
            r0.i(r14, r13, r12)
        L_0x0060:
            int r11 = r11 + 1
            goto L_0x0038
        L_0x0063:
            r0 = r9
        L_0x0064:
            q0.b0 r4 = r3.d
            q0.w r6 = r4.b
            int r3 = r3.y
            if (r3 != r8) goto L_0x006d
            r7 = r5
        L_0x006d:
            if (r2 == 0) goto L_0x0074
            java.net.Proxy r3 = r2.b
            if (r3 == 0) goto L_0x0074
            goto L_0x0076
        L_0x0074:
            java.net.Proxy r3 = java.net.Proxy.NO_PROXY
        L_0x0076:
            java.util.Iterator r0 = r0.iterator()
        L_0x007a:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x020c
            java.lang.Object r8 = r0.next()
            q0.i r8 = (q0.i) r8
            java.lang.String r9 = r8.b
            java.lang.String r10 = "Basic"
            boolean r9 = kotlin.text.StringsKt__IndentKt.f(r10, r9, r5)
            if (r9 != 0) goto L_0x0091
            goto L_0x007a
        L_0x0091:
            if (r2 == 0) goto L_0x009c
            q0.a r9 = r2.a
            if (r9 == 0) goto L_0x009c
            q0.s r9 = r9.d
            if (r9 == 0) goto L_0x009c
            goto L_0x009e
        L_0x009c:
            q0.s r9 = r1.b
        L_0x009e:
            java.lang.String r10 = "realm"
            java.lang.String r11 = "proxy"
            if (r7 == 0) goto L_0x00db
            java.net.SocketAddress r12 = r3.address()
            java.lang.String r13 = "null cannot be cast to non-null type java.net.InetSocketAddress"
            java.util.Objects.requireNonNull(r12, r13)
            java.net.InetSocketAddress r12 = (java.net.InetSocketAddress) r12
            java.lang.String r13 = r12.getHostName()
            m0.n.b.i.d(r3, r11)
            java.net.InetAddress r14 = r1.b(r3, r6, r9)
            int r15 = r12.getPort()
            java.lang.String r9 = r6.d
            java.util.Map<java.lang.String, java.lang.String> r11 = r8.a
            java.lang.Object r10 = r11.get(r10)
            r17 = r10
            java.lang.String r17 = (java.lang.String) r17
            java.lang.String r10 = r8.b
            java.net.URL r19 = r6.k()
            java.net.Authenticator$RequestorType r20 = java.net.Authenticator.RequestorType.PROXY
            r16 = r9
            r18 = r10
            java.net.PasswordAuthentication r9 = java.net.Authenticator.requestPasswordAuthentication(r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x00ff
        L_0x00db:
            java.lang.String r12 = r6.g
            m0.n.b.i.d(r3, r11)
            java.net.InetAddress r11 = r1.b(r3, r6, r9)
            int r9 = r6.h
            java.lang.String r13 = r6.d
            java.util.Map<java.lang.String, java.lang.String> r14 = r8.a
            java.lang.Object r10 = r14.get(r10)
            r14 = r10
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r15 = r8.b
            java.net.URL r16 = r6.k()
            java.net.Authenticator$RequestorType r17 = java.net.Authenticator.RequestorType.SERVER
            r10 = r12
            r12 = r9
            java.net.PasswordAuthentication r9 = java.net.Authenticator.requestPasswordAuthentication(r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x00ff:
            if (r9 == 0) goto L_0x007a
            if (r7 == 0) goto L_0x0106
            java.lang.String r0 = "Proxy-Authorization"
            goto L_0x0108
        L_0x0106:
            java.lang.String r0 = "Authorization"
        L_0x0108:
            java.lang.String r2 = r9.getUserName()
            java.lang.String r3 = "auth.userName"
            m0.n.b.i.d(r2, r3)
            char[] r3 = r9.getPassword()
            java.lang.String r5 = "auth.password"
            m0.n.b.i.d(r3, r5)
            java.lang.String r5 = new java.lang.String
            r5.<init>(r3)
            java.util.Map<java.lang.String, java.lang.String> r3 = r8.a
            java.lang.String r6 = "charset"
            java.lang.Object r3 = r3.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0135
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)     // Catch:{ Exception -> 0x0135 }
            java.lang.String r7 = "Charset.forName(charset)"
            m0.n.b.i.d(r3, r7)     // Catch:{ Exception -> 0x0135 }
            goto L_0x013c
        L_0x0135:
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.ISO_8859_1
            java.lang.String r7 = "ISO_8859_1"
            m0.n.b.i.d(r3, r7)
        L_0x013c:
            java.lang.String r7 = "username"
            m0.n.b.i.e(r2, r7)
            java.lang.String r7 = "password"
            m0.n.b.i.e(r5, r7)
            m0.n.b.i.e(r3, r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            r2 = 58
            r7.append(r2)
            r7.append(r5)
            java.lang.String r2 = r7.toString()
            okio.ByteString$a r5 = okio.ByteString.d
            java.lang.String r5 = "$this$encode"
            m0.n.b.i.e(r2, r5)
            m0.n.b.i.e(r3, r6)
            okio.ByteString r5 = new okio.ByteString
            byte[] r2 = r2.getBytes(r3)
            java.lang.String r3 = "(this as java.lang.String).getBytes(charset)"
            m0.n.b.i.d(r2, r3)
            r5.<init>(r2)
            java.lang.String r2 = r5.a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Basic "
            r3.append(r5)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "request"
            m0.n.b.i.e(r4, r3)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            q0.w r6 = r4.b
            java.lang.String r7 = r4.c
            q0.d0 r9 = r4.e
            java.util.Map<java.lang.Class<?>, java.lang.Object> r3 = r4.f
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x01a8
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            goto L_0x01ae
        L_0x01a8:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r3 = r4.f
            java.util.Map r3 = m0.j.g.B0(r3)
        L_0x01ae:
            q0.v r4 = r4.d
            q0.v$a r4 = r4.j()
            java.lang.String r5 = "name"
            m0.n.b.i.e(r0, r5)
            java.lang.String r8 = "value"
            m0.n.b.i.e(r2, r8)
            m0.n.b.i.e(r0, r5)
            m0.n.b.i.e(r2, r8)
            q0.v$b r5 = q0.v.c
            r5.a(r0)
            r5.b(r2, r0)
            r4.f(r0)
            r4.c(r0, r2)
            if (r6 == 0) goto L_0x0200
            q0.v r8 = r4.d()
            byte[] r0 = q0.h0.c.a
            java.lang.String r0 = "$this$toImmutableMap"
            m0.n.b.i.e(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x01ea
            java.util.Map r0 = m0.j.g.o()
            goto L_0x01f8
        L_0x01ea:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r3)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            java.lang.String r2 = "Collections.unmodifiableMap(LinkedHashMap(this))"
            m0.n.b.i.d(r0, r2)
        L_0x01f8:
            r10 = r0
            q0.b0 r0 = new q0.b0
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            return r0
        L_0x0200:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "url == null"
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x020c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.d.b.a(q0.g0, q0.e0):q0.b0");
    }

    public final InetAddress b(Proxy proxy, w wVar, s sVar) throws IOException {
        Proxy.Type type = proxy.type();
        if (type != null && a.a[type.ordinal()] == 1) {
            return (InetAddress) g.u(sVar.a(wVar.g));
        }
        SocketAddress address = proxy.address();
        Objects.requireNonNull(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address2 = ((InetSocketAddress) address).getAddress();
        i.d(address2, "(address() as InetSocketAddress).address");
        return address2;
    }
}
