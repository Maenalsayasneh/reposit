package q0.h0.h;

import com.stripe.android.model.PaymentMethodOptionsParams;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import q0.a0;
import q0.b0;
import q0.e0;
import q0.g0;
import q0.h0.c;
import q0.h0.g.d;
import q0.h0.g.e;
import q0.h0.g.g;
import q0.h0.g.j;
import q0.x;

/* compiled from: RetryAndFollowUpInterceptor.kt */
public final class i implements x {
    public final a0 a;

    public i(a0 a0Var) {
        m0.n.b.i.e(a0Var, PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT);
        this.a = a0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r13.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final q0.b0 a(q0.e0 r12, q0.h0.g.c r13) throws java.io.IOException {
        /*
            r11 = this;
            r0 = 0
            if (r13 == 0) goto L_0x000a
            q0.h0.g.g r1 = r13.b
            if (r1 == 0) goto L_0x000a
            q0.g0 r1 = r1.q
            goto L_0x000b
        L_0x000a:
            r1 = r0
        L_0x000b:
            int r2 = r12.y
            q0.b0 r3 = r12.d
            java.lang.String r3 = r3.c
            r4 = 0
            r5 = 308(0x134, float:4.32E-43)
            r6 = 307(0x133, float:4.3E-43)
            r7 = 1
            if (r2 == r6) goto L_0x00b3
            if (r2 == r5) goto L_0x00b3
            r8 = 401(0x191, float:5.62E-43)
            if (r2 == r8) goto L_0x00aa
            r8 = 421(0x1a5, float:5.9E-43)
            if (r2 == r8) goto L_0x0081
            r13 = 503(0x1f7, float:7.05E-43)
            if (r2 == r13) goto L_0x006b
            r13 = 407(0x197, float:5.7E-43)
            if (r2 == r13) goto L_0x004d
            r13 = 408(0x198, float:5.72E-43)
            if (r2 == r13) goto L_0x0033
            switch(r2) {
                case 300: goto L_0x00b3;
                case 301: goto L_0x00b3;
                case 302: goto L_0x00b3;
                case 303: goto L_0x00b3;
                default: goto L_0x0032;
            }
        L_0x0032:
            return r0
        L_0x0033:
            q0.a0 r1 = r11.a
            boolean r1 = r1.b2
            if (r1 != 0) goto L_0x003a
            return r0
        L_0x003a:
            q0.e0 r1 = r12.d2
            if (r1 == 0) goto L_0x0043
            int r1 = r1.y
            if (r1 != r13) goto L_0x0043
            return r0
        L_0x0043:
            int r13 = r11.c(r12, r4)
            if (r13 <= 0) goto L_0x004a
            return r0
        L_0x004a:
            q0.b0 r12 = r12.d
            return r12
        L_0x004d:
            m0.n.b.i.c(r1)
            java.net.Proxy r13 = r1.b
            java.net.Proxy$Type r13 = r13.type()
            java.net.Proxy$Type r0 = java.net.Proxy.Type.HTTP
            if (r13 != r0) goto L_0x0063
            q0.a0 r13 = r11.a
            q0.c r13 = r13.k2
            q0.b0 r12 = r13.a(r1, r12)
            return r12
        L_0x0063:
            java.net.ProtocolException r12 = new java.net.ProtocolException
            java.lang.String r13 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r12.<init>(r13)
            throw r12
        L_0x006b:
            q0.e0 r1 = r12.d2
            if (r1 == 0) goto L_0x0074
            int r1 = r1.y
            if (r1 != r13) goto L_0x0074
            return r0
        L_0x0074:
            r13 = 2147483647(0x7fffffff, float:NaN)
            int r13 = r11.c(r12, r13)
            if (r13 != 0) goto L_0x0080
            q0.b0 r12 = r12.d
            return r12
        L_0x0080:
            return r0
        L_0x0081:
            if (r13 == 0) goto L_0x00a9
            q0.h0.g.d r1 = r13.e
            q0.a r1 = r1.h
            q0.w r1 = r1.a
            java.lang.String r1 = r1.g
            q0.h0.g.g r2 = r13.b
            q0.g0 r2 = r2.q
            q0.a r2 = r2.a
            q0.w r2 = r2.a
            java.lang.String r2 = r2.g
            boolean r1 = m0.n.b.i.a(r1, r2)
            r1 = r1 ^ r7
            if (r1 != 0) goto L_0x009d
            goto L_0x00a9
        L_0x009d:
            q0.h0.g.g r13 = r13.b
            monitor-enter(r13)
            r13.j = r7     // Catch:{ all -> 0x00a6 }
            monitor-exit(r13)
            q0.b0 r12 = r12.d
            return r12
        L_0x00a6:
            r12 = move-exception
            monitor-exit(r13)
            throw r12
        L_0x00a9:
            return r0
        L_0x00aa:
            q0.a0 r13 = r11.a
            q0.c r13 = r13.c2
            q0.b0 r12 = r13.a(r1, r12)
            return r12
        L_0x00b3:
            q0.a0 r13 = r11.a
            boolean r13 = r13.d2
            if (r13 != 0) goto L_0x00bb
            goto L_0x015b
        L_0x00bb:
            r13 = 2
            java.lang.String r1 = "Location"
            java.lang.String r13 = q0.e0.b(r12, r1, r0, r13)
            if (r13 == 0) goto L_0x015b
            q0.b0 r1 = r12.d
            q0.w r1 = r1.b
            java.util.Objects.requireNonNull(r1)
            java.lang.String r2 = "link"
            m0.n.b.i.e(r13, r2)
            q0.w$a r13 = r1.g(r13)
            if (r13 == 0) goto L_0x00db
            q0.w r13 = r13.b()
            goto L_0x00dc
        L_0x00db:
            r13 = r0
        L_0x00dc:
            if (r13 == 0) goto L_0x015b
            java.lang.String r1 = r13.d
            q0.b0 r2 = r12.d
            q0.w r2 = r2.b
            java.lang.String r2 = r2.d
            boolean r1 = m0.n.b.i.a(r1, r2)
            if (r1 != 0) goto L_0x00f3
            q0.a0 r1 = r11.a
            boolean r1 = r1.e2
            if (r1 != 0) goto L_0x00f3
            goto L_0x015b
        L_0x00f3:
            q0.b0 r1 = r12.d
            java.util.Objects.requireNonNull(r1)
            q0.b0$a r2 = new q0.b0$a
            r2.<init>(r1)
            boolean r1 = q0.h0.h.f.a(r3)
            if (r1 == 0) goto L_0x0145
            int r1 = r12.y
            java.lang.String r8 = "method"
            m0.n.b.i.e(r3, r8)
            java.lang.String r9 = "PROPFIND"
            boolean r10 = m0.n.b.i.a(r3, r9)
            if (r10 != 0) goto L_0x0116
            if (r1 == r5) goto L_0x0116
            if (r1 != r6) goto L_0x0117
        L_0x0116:
            r4 = r7
        L_0x0117:
            m0.n.b.i.e(r3, r8)
            boolean r8 = m0.n.b.i.a(r3, r9)
            r7 = r7 ^ r8
            if (r7 == 0) goto L_0x012b
            if (r1 == r5) goto L_0x012b
            if (r1 == r6) goto L_0x012b
            java.lang.String r1 = "GET"
            r2.e(r1, r0)
            goto L_0x0134
        L_0x012b:
            if (r4 == 0) goto L_0x0131
            q0.b0 r0 = r12.d
            q0.d0 r0 = r0.e
        L_0x0131:
            r2.e(r3, r0)
        L_0x0134:
            if (r4 != 0) goto L_0x0145
            java.lang.String r0 = "Transfer-Encoding"
            r2.f(r0)
            java.lang.String r0 = "Content-Length"
            r2.f(r0)
            java.lang.String r0 = "Content-Type"
            r2.f(r0)
        L_0x0145:
            q0.b0 r12 = r12.d
            q0.w r12 = r12.b
            boolean r12 = q0.h0.c.a(r12, r13)
            if (r12 != 0) goto L_0x0154
            java.lang.String r12 = "Authorization"
            r2.f(r12)
        L_0x0154:
            r2.i(r13)
            q0.b0 r0 = r2.b()
        L_0x015b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.h.i.a(q0.e0, q0.h0.g.c):q0.b0");
    }

    public final boolean b(IOException iOException, e eVar, b0 b0Var, boolean z) {
        boolean z2;
        j jVar;
        g gVar;
        if (!this.a.b2) {
            return false;
        }
        if (z && (iOException instanceof FileNotFoundException)) {
            return false;
        }
        if (!(!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z))) {
            return false;
        }
        d dVar = eVar.Y1;
        m0.n.b.i.c(dVar);
        int i = dVar.c;
        if (i == 0 && dVar.d == 0 && dVar.e == 0) {
            z2 = false;
        } else {
            if (dVar.f == null) {
                g0 g0Var = null;
                if (i <= 1 && dVar.d <= 1 && dVar.e <= 0 && (gVar = dVar.i.Z1) != null) {
                    synchronized (gVar) {
                        if (gVar.k == 0) {
                            if (c.a(gVar.q.a.a, dVar.h.a)) {
                                g0Var = gVar.q;
                            }
                        }
                    }
                }
                if (g0Var != null) {
                    dVar.f = g0Var;
                } else {
                    j.a aVar = dVar.a;
                    if ((aVar == null || !aVar.a()) && (jVar = dVar.b) != null) {
                        z2 = jVar.a();
                    }
                }
            }
            z2 = true;
        }
        if (!z2) {
            return false;
        }
        return true;
    }

    public final int c(e0 e0Var, int i) {
        String b = e0.b(e0Var, "Retry-After", (String) null, 2);
        if (b == null) {
            return i;
        }
        m0.n.b.i.e("\\d+", "pattern");
        Pattern compile = Pattern.compile("\\d+");
        m0.n.b.i.d(compile, "Pattern.compile(pattern)");
        m0.n.b.i.e(compile, "nativePattern");
        m0.n.b.i.e(b, "input");
        if (!compile.matcher(b).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(b);
        m0.n.b.i.d(valueOf, "Integer.valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: q0.h0.h.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: q0.h0.g.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: q0.h0.g.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: q0.h0.g.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: q0.h0.g.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: q0.h0.g.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: q0.h0.g.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: q0.h0.g.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: q0.h0.g.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v44, resolved type: q0.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v45, resolved type: q0.h0.h.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v46, resolved type: q0.h0.g.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v49, resolved type: q0.h0.h.i} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q0.e0 intercept(q0.x.a r49) throws java.io.IOException {
        /*
            r48 = this;
            r1 = r48
            r0 = r49
            java.lang.String r2 = "chain"
            m0.n.b.i.e(r0, r2)
            r2 = r0
            q0.h0.h.g r2 = (q0.h0.h.g) r2
            q0.b0 r0 = r2.f
            q0.h0.g.e r3 = r2.b
            kotlin.collections.EmptyList r4 = kotlin.collections.EmptyList.c
            r7 = 1
            r8 = r4
            r9 = 0
            r10 = 0
            r4 = r0
            r0 = r7
        L_0x0018:
            java.util.Objects.requireNonNull(r3)
            java.lang.String r11 = "request"
            m0.n.b.i.e(r4, r11)
            q0.h0.g.c r11 = r3.b2
            if (r11 != 0) goto L_0x0026
            r11 = r7
            goto L_0x0027
        L_0x0026:
            r11 = 0
        L_0x0027:
            if (r11 == 0) goto L_0x0300
            monitor-enter(r3)
            boolean r11 = r3.d2     // Catch:{ all -> 0x02fb }
            r11 = r11 ^ r7
            if (r11 == 0) goto L_0x02eb
            boolean r11 = r3.c2     // Catch:{ all -> 0x02fb }
            r11 = r11 ^ r7
            if (r11 == 0) goto L_0x02dd
            monitor-exit(r3)
            if (r0 == 0) goto L_0x0096
            q0.h0.g.d r0 = new q0.h0.g.d
            q0.h0.g.h r11 = r3.c
            q0.w r12 = r4.b
            boolean r13 = r12.c
            if (r13 == 0) goto L_0x005a
            q0.a0 r13 = r3.i2
            javax.net.ssl.SSLSocketFactory r14 = r13.m2
            if (r14 == 0) goto L_0x0052
            javax.net.ssl.HostnameVerifier r15 = r13.q2
            q0.h r13 = r13.r2
            r19 = r13
            r17 = r14
            r18 = r15
            goto L_0x0060
        L_0x0052:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "CLEARTEXT-only client"
            r0.<init>(r2)
            throw r0
        L_0x005a:
            r17 = 0
            r18 = 0
            r19 = 0
        L_0x0060:
            q0.a r15 = new q0.a
            java.lang.String r13 = r12.g
            int r14 = r12.h
            q0.a0 r12 = r3.i2
            q0.s r5 = r12.h2
            javax.net.SocketFactory r6 = r12.l2
            q0.c r7 = r12.k2
            r25 = r8
            java.net.Proxy r8 = r12.i2
            r26 = r10
            java.util.List<okhttp3.Protocol> r10 = r12.p2
            java.util.List<q0.m> r1 = r12.o2
            java.net.ProxySelector r12 = r12.j2
            r24 = r12
            r12 = r15
            r27 = r9
            r9 = r15
            r15 = r5
            r16 = r6
            r20 = r7
            r21 = r8
            r22 = r10
            r23 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            q0.t r1 = r3.d
            r0.<init>(r11, r9, r3, r1)
            r3.Y1 = r0
            goto L_0x009c
        L_0x0096:
            r25 = r8
            r27 = r9
            r26 = r10
        L_0x009c:
            boolean r0 = r3.f2     // Catch:{ all -> 0x02d4 }
            if (r0 != 0) goto L_0x02c7
            q0.e0 r0 = r2.a(r4)     // Catch:{ RouteException -> 0x0297, IOException -> 0x026d }
            if (r27 == 0) goto L_0x0201
            java.lang.String r1 = "response"
            m0.n.b.i.e(r0, r1)     // Catch:{ all -> 0x01f8 }
            q0.b0 r5 = r0.d     // Catch:{ all -> 0x01f8 }
            okhttp3.Protocol r6 = r0.q     // Catch:{ all -> 0x01f8 }
            int r8 = r0.y     // Catch:{ all -> 0x01f8 }
            java.lang.String r7 = r0.x     // Catch:{ all -> 0x01f8 }
            okhttp3.Handshake r9 = r0.Y1     // Catch:{ all -> 0x01f8 }
            q0.v r1 = r0.Z1     // Catch:{ all -> 0x01f8 }
            q0.v$a r1 = r1.j()     // Catch:{ all -> 0x01f8 }
            q0.f0 r11 = r0.a2     // Catch:{ all -> 0x01f8 }
            q0.e0 r12 = r0.b2     // Catch:{ all -> 0x01f8 }
            q0.e0 r13 = r0.c2     // Catch:{ all -> 0x01f8 }
            long r14 = r0.e2     // Catch:{ all -> 0x01f8 }
            r20 = r2
            r21 = r3
            long r2 = r0.f2     // Catch:{ all -> 0x01f6 }
            q0.h0.g.c r0 = r0.g2     // Catch:{ all -> 0x01f6 }
            java.lang.String r4 = "response"
            r10 = r27
            m0.n.b.i.e(r10, r4)     // Catch:{ all -> 0x01f6 }
            q0.b0 r4 = r10.d     // Catch:{ all -> 0x01f6 }
            r16 = r14
            okhttp3.Protocol r14 = r10.q     // Catch:{ all -> 0x01f6 }
            int r15 = r10.y     // Catch:{ all -> 0x01f6 }
            r19 = r0
            java.lang.String r0 = r10.x     // Catch:{ all -> 0x01f6 }
            r22 = r2
            okhttp3.Handshake r2 = r10.Y1     // Catch:{ all -> 0x01f6 }
            q0.v r3 = r10.Z1     // Catch:{ all -> 0x01f6 }
            q0.v$a r3 = r3.j()     // Catch:{ all -> 0x01f6 }
            r18 = r13
            q0.e0 r13 = r10.b2     // Catch:{ all -> 0x01f6 }
            r24 = r12
            q0.e0 r12 = r10.c2     // Catch:{ all -> 0x01f6 }
            r43 = r11
            q0.e0 r11 = r10.d2     // Catch:{ all -> 0x01f6 }
            r44 = r6
            r45 = r7
            long r6 = r10.e2     // Catch:{ all -> 0x01f6 }
            r46 = r8
            r47 = r9
            long r8 = r10.f2     // Catch:{ all -> 0x01f6 }
            q0.h0.g.c r10 = r10.g2     // Catch:{ all -> 0x01f6 }
            r34 = 0
            if (r15 < 0) goto L_0x0109
            r27 = 1
            goto L_0x010b
        L_0x0109:
            r27 = 0
        L_0x010b:
            if (r27 == 0) goto L_0x01db
            if (r4 == 0) goto L_0x01cf
            if (r14 == 0) goto L_0x01c3
            if (r0 == 0) goto L_0x01b7
            q0.v r33 = r3.d()     // Catch:{ all -> 0x01f6 }
            q0.e0 r3 = new q0.e0     // Catch:{ all -> 0x01f6 }
            r27 = r3
            r28 = r4
            r29 = r14
            r30 = r0
            r31 = r15
            r32 = r2
            r35 = r13
            r36 = r12
            r37 = r11
            r38 = r6
            r40 = r8
            r42 = r10
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r42)     // Catch:{ all -> 0x01f6 }
            q0.f0 r0 = r3.a2     // Catch:{ all -> 0x01f6 }
            if (r0 != 0) goto L_0x013a
            r0 = 1
            goto L_0x013b
        L_0x013a:
            r0 = 0
        L_0x013b:
            if (r0 == 0) goto L_0x01ab
            if (r46 < 0) goto L_0x0141
            r0 = 1
            goto L_0x0142
        L_0x0141:
            r0 = 0
        L_0x0142:
            if (r0 == 0) goto L_0x018e
            if (r5 == 0) goto L_0x0182
            if (r44 == 0) goto L_0x0176
            if (r45 == 0) goto L_0x016a
            q0.v r10 = r1.d()     // Catch:{ all -> 0x01f6 }
            q0.e0 r0 = new q0.e0     // Catch:{ all -> 0x01f6 }
            r4 = r0
            r6 = r44
            r7 = r45
            r8 = r46
            r9 = r47
            r11 = r43
            r12 = r24
            r13 = r18
            r1 = r16
            r14 = r3
            r15 = r1
            r17 = r22
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r19)     // Catch:{ all -> 0x01f6 }
            goto L_0x0205
        L_0x016a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01f6 }
            java.lang.String r1 = "message == null"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01f6 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f6 }
            throw r0     // Catch:{ all -> 0x01f6 }
        L_0x0176:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01f6 }
            java.lang.String r1 = "protocol == null"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01f6 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f6 }
            throw r0     // Catch:{ all -> 0x01f6 }
        L_0x0182:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01f6 }
            java.lang.String r1 = "request == null"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01f6 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f6 }
            throw r0     // Catch:{ all -> 0x01f6 }
        L_0x018e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f6 }
            r0.<init>()     // Catch:{ all -> 0x01f6 }
            java.lang.String r1 = "code < 0: "
            r0.append(r1)     // Catch:{ all -> 0x01f6 }
            r1 = r46
            r0.append(r1)     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01f6 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01f6 }
            r1.<init>(r0)     // Catch:{ all -> 0x01f6 }
            throw r1     // Catch:{ all -> 0x01f6 }
        L_0x01ab:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x01f6 }
            java.lang.String r1 = "priorResponse.body != null"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01f6 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f6 }
            throw r0     // Catch:{ all -> 0x01f6 }
        L_0x01b7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01f6 }
            java.lang.String r1 = "message == null"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01f6 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f6 }
            throw r0     // Catch:{ all -> 0x01f6 }
        L_0x01c3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01f6 }
            java.lang.String r1 = "protocol == null"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01f6 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f6 }
            throw r0     // Catch:{ all -> 0x01f6 }
        L_0x01cf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01f6 }
            java.lang.String r1 = "request == null"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01f6 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f6 }
            throw r0     // Catch:{ all -> 0x01f6 }
        L_0x01db:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f6 }
            r0.<init>()     // Catch:{ all -> 0x01f6 }
            java.lang.String r1 = "code < 0: "
            r0.append(r1)     // Catch:{ all -> 0x01f6 }
            r0.append(r15)     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01f6 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01f6 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01f6 }
            r1.<init>(r0)     // Catch:{ all -> 0x01f6 }
            throw r1     // Catch:{ all -> 0x01f6 }
        L_0x01f6:
            r0 = move-exception
            goto L_0x01fb
        L_0x01f8:
            r0 = move-exception
            r21 = r3
        L_0x01fb:
            r2 = r48
            r1 = r21
            goto L_0x02d8
        L_0x0201:
            r20 = r2
            r21 = r3
        L_0x0205:
            r9 = r0
            r1 = r21
            q0.h0.g.c r0 = r1.b2     // Catch:{ all -> 0x0268 }
            r2 = r48
            q0.b0 r4 = r2.a(r9, r0)     // Catch:{ all -> 0x02d2 }
            if (r4 != 0) goto L_0x0237
            if (r0 == 0) goto L_0x0232
            boolean r0 = r0.a     // Catch:{ all -> 0x02d2 }
            if (r0 == 0) goto L_0x0232
            boolean r0 = r1.a2     // Catch:{ all -> 0x02d2 }
            r3 = 1
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x0226
            r1.a2 = r3     // Catch:{ all -> 0x02d2 }
            q0.h0.g.e$c r0 = r1.q     // Catch:{ all -> 0x02d2 }
            r0.i()     // Catch:{ all -> 0x02d2 }
            goto L_0x0232
        L_0x0226:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x02d2 }
            java.lang.String r3 = "Check failed."
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x02d2 }
            r0.<init>(r3)     // Catch:{ all -> 0x02d2 }
            throw r0     // Catch:{ all -> 0x02d2 }
        L_0x0232:
            r3 = 0
            r1.f(r3)
            return r9
        L_0x0237:
            q0.f0 r0 = r9.a2     // Catch:{ all -> 0x02d2 }
            if (r0 == 0) goto L_0x023e
            q0.h0.c.d(r0)     // Catch:{ all -> 0x02d2 }
        L_0x023e:
            int r10 = r26 + 1
            r0 = 20
            if (r10 > r0) goto L_0x0251
            r3 = 1
            r1.f(r3)
            r3 = r1
            r1 = r2
            r2 = r20
            r8 = r25
            r0 = 1
            goto L_0x02be
        L_0x0251:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ all -> 0x02d2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02d2 }
            r3.<init>()     // Catch:{ all -> 0x02d2 }
            java.lang.String r4 = "Too many follow-up requests: "
            r3.append(r4)     // Catch:{ all -> 0x02d2 }
            r3.append(r10)     // Catch:{ all -> 0x02d2 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x02d2 }
            r0.<init>(r3)     // Catch:{ all -> 0x02d2 }
            throw r0     // Catch:{ all -> 0x02d2 }
        L_0x0268:
            r0 = move-exception
            r2 = r48
            goto L_0x02d8
        L_0x026d:
            r0 = move-exception
            r20 = r2
            r1 = r3
            r10 = r27
            r2 = r48
            r3 = r0
            boolean r0 = r3 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x02d2 }
            if (r0 != 0) goto L_0x027d
            r0 = 1
            goto L_0x027e
        L_0x027d:
            r0 = 0
        L_0x027e:
            boolean r0 = r2.b(r3, r1, r4, r0)     // Catch:{ all -> 0x02d2 }
            if (r0 == 0) goto L_0x0291
            r5 = r25
            java.util.List r0 = m0.j.g.a0(r5, r3)     // Catch:{ all -> 0x02d2 }
            r3 = 1
            r1.f(r3)
            r8 = r0
            r6 = 0
            goto L_0x02b6
        L_0x0291:
            r5 = r25
            q0.h0.c.A(r3, r5)     // Catch:{ all -> 0x02d2 }
            throw r3     // Catch:{ all -> 0x02d2 }
        L_0x0297:
            r0 = move-exception
            r20 = r2
            r1 = r3
            r5 = r25
            r10 = r27
            r2 = r48
            r3 = r0
            java.io.IOException r0 = r3.c     // Catch:{ all -> 0x02d2 }
            r6 = 0
            boolean r0 = r2.b(r0, r1, r4, r6)     // Catch:{ all -> 0x02d2 }
            if (r0 == 0) goto L_0x02c1
            java.io.IOException r0 = r3.d     // Catch:{ all -> 0x02d2 }
            java.util.List r0 = m0.j.g.a0(r5, r0)     // Catch:{ all -> 0x02d2 }
            r3 = 1
            r1.f(r3)
            r8 = r0
        L_0x02b6:
            r3 = r1
            r1 = r2
            r0 = r6
            r9 = r10
            r2 = r20
            r10 = r26
        L_0x02be:
            r7 = 1
            goto L_0x0018
        L_0x02c1:
            java.io.IOException r0 = r3.d     // Catch:{ all -> 0x02d2 }
            q0.h0.c.A(r0, r5)     // Catch:{ all -> 0x02d2 }
            throw r0     // Catch:{ all -> 0x02d2 }
        L_0x02c7:
            r2 = r48
            r1 = r3
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x02d2 }
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch:{ all -> 0x02d2 }
            throw r0     // Catch:{ all -> 0x02d2 }
        L_0x02d2:
            r0 = move-exception
            goto L_0x02d8
        L_0x02d4:
            r0 = move-exception
            r2 = r48
            r1 = r3
        L_0x02d8:
            r3 = 1
            r1.f(r3)
            throw r0
        L_0x02dd:
            r2 = r1
            r1 = r3
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x02f9 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02f9 }
            r3.<init>(r0)     // Catch:{ all -> 0x02f9 }
            throw r3     // Catch:{ all -> 0x02f9 }
        L_0x02eb:
            r2 = r1
            r1 = r3
            java.lang.String r0 = "cannot make a new request because the previous response is still open: please call response.close()"
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x02f9 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02f9 }
            r3.<init>(r0)     // Catch:{ all -> 0x02f9 }
            throw r3     // Catch:{ all -> 0x02f9 }
        L_0x02f9:
            r0 = move-exception
            goto L_0x02fe
        L_0x02fb:
            r0 = move-exception
            r2 = r1
            r1 = r3
        L_0x02fe:
            monitor-exit(r1)
            throw r0
        L_0x0300:
            r2 = r1
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.h.i.intercept(q0.x$a):q0.e0");
    }
}
