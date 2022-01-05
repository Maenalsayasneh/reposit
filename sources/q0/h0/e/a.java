package q0.h0.e;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.networkv2.request.Header;
import java.util.Objects;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.f;
import m0.n.b.i;
import okhttp3.Handshake;
import okhttp3.Protocol;
import q0.b0;
import q0.d;
import q0.e0;
import q0.f0;
import q0.h0.g.c;
import q0.v;
import q0.x;

/* compiled from: CacheInterceptor.kt */
public final class a implements x {
    public static final C0286a a = new C0286a((f) null);
    public final d b;

    /* renamed from: q0.h0.e.a$a  reason: collision with other inner class name */
    /* compiled from: CacheInterceptor.kt */
    public static final class C0286a {
        public C0286a(f fVar) {
        }

        public static final e0 a(C0286a aVar, e0 e0Var) {
            e0 e0Var2 = e0Var;
            if ((e0Var2 != null ? e0Var2.a2 : null) == null) {
                return e0Var2;
            }
            Objects.requireNonNull(e0Var);
            i.e(e0Var2, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
            b0 b0Var = e0Var2.d;
            Protocol protocol = e0Var2.q;
            int i = e0Var2.y;
            String str = e0Var2.x;
            Handshake handshake = e0Var2.Y1;
            v.a j = e0Var2.Z1.j();
            e0 e0Var3 = e0Var2.b2;
            e0 e0Var4 = e0Var2.c2;
            e0 e0Var5 = e0Var2.d2;
            long j2 = e0Var2.e2;
            long j3 = e0Var2.f2;
            c cVar = e0Var2.g2;
            if (!(i >= 0)) {
                throw new IllegalStateException(i0.d.a.a.a.e0("code < 0: ", i).toString());
            } else if (b0Var == null) {
                throw new IllegalStateException("request == null".toString());
            } else if (protocol == null) {
                throw new IllegalStateException("protocol == null".toString());
            } else if (str != null) {
                return new e0(b0Var, protocol, str, i, handshake, j.d(), (f0) null, e0Var3, e0Var4, e0Var5, j2, j3, cVar);
            } else {
                throw new IllegalStateException("message == null".toString());
            }
        }

        public final boolean b(String str) {
            if (StringsKt__IndentKt.f("Content-Length", str, true) || StringsKt__IndentKt.f(Header.CONTENT_ENCODING, str, true) || StringsKt__IndentKt.f(Header.CONTENT_TYPE, str, true)) {
                return true;
            }
            return false;
        }

        public final boolean c(String str) {
            if (StringsKt__IndentKt.f(Header.CONNECTION, str, true) || StringsKt__IndentKt.f("Keep-Alive", str, true) || StringsKt__IndentKt.f("Proxy-Authenticate", str, true) || StringsKt__IndentKt.f("Proxy-Authorization", str, true) || StringsKt__IndentKt.f("TE", str, true) || StringsKt__IndentKt.f("Trailers", str, true) || StringsKt__IndentKt.f("Transfer-Encoding", str, true) || StringsKt__IndentKt.f("Upgrade", str, true)) {
                return false;
            }
            return true;
        }
    }

    public a(d dVar) {
        this.b = dVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r0v1, types: [q0.b0, q0.e0] */
    /* JADX WARNING: type inference failed for: r0v28 */
    /* JADX WARNING: type inference failed for: r0v29 */
    /* JADX WARNING: type inference failed for: r0v49 */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0162, code lost:
        if (r5 > 0) goto L_0x0164;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03b3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x040c  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0628  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x062e  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x06a9  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q0.e0 intercept(q0.x.a r46) throws java.io.IOException {
        /*
            r45 = this;
            r1 = r45
            r0 = r46
            java.lang.String r2 = "chain"
            m0.n.b.i.e(r0, r2)
            r2 = r0
            q0.h0.h.g r2 = (q0.h0.h.g) r2
            q0.h0.g.e r3 = r2.b
            q0.d r4 = r1.b
            if (r4 == 0) goto L_0x0019
            q0.b0 r5 = r2.f
            q0.e0 r4 = r4.a(r5)
            goto L_0x001a
        L_0x0019:
            r4 = 0
        L_0x001a:
            long r5 = java.lang.System.currentTimeMillis()
            q0.b0 r7 = r2.f
            java.lang.String r8 = "request"
            m0.n.b.i.e(r7, r8)
            if (r4 == 0) goto L_0x00a4
            long r8 = r4.e2
            long r10 = r4.f2
            q0.v r12 = r4.Z1
            int r13 = r12.size()
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = -1
        L_0x003f:
            if (r14 >= r13) goto L_0x009f
            r22 = r8
            java.lang.String r8 = r12.c(r14)
            java.lang.String r9 = r12.k(r14)
            r24 = r10
            java.lang.String r10 = "Date"
            r11 = 1
            boolean r10 = kotlin.text.StringsKt__IndentKt.f(r8, r10, r11)
            if (r10 == 0) goto L_0x005e
            java.util.Date r8 = q0.h0.h.c.a(r9)
            r15 = r8
            r20 = r9
            goto L_0x0098
        L_0x005e:
            java.lang.String r10 = "Expires"
            boolean r10 = kotlin.text.StringsKt__IndentKt.f(r8, r10, r11)
            if (r10 == 0) goto L_0x006d
            java.util.Date r8 = q0.h0.h.c.a(r9)
            r16 = r8
            goto L_0x0098
        L_0x006d:
            java.lang.String r10 = "Last-Modified"
            boolean r10 = kotlin.text.StringsKt__IndentKt.f(r8, r10, r11)
            if (r10 == 0) goto L_0x007e
            java.util.Date r8 = q0.h0.h.c.a(r9)
            r17 = r8
            r19 = r9
            goto L_0x0098
        L_0x007e:
            java.lang.String r10 = "ETag"
            boolean r10 = kotlin.text.StringsKt__IndentKt.f(r8, r10, r11)
            if (r10 == 0) goto L_0x0089
            r18 = r9
            goto L_0x0098
        L_0x0089:
            java.lang.String r10 = "Age"
            boolean r8 = kotlin.text.StringsKt__IndentKt.f(r8, r10, r11)
            if (r8 == 0) goto L_0x0098
            r8 = -1
            int r8 = q0.h0.c.y(r9, r8)
            r21 = r8
        L_0x0098:
            int r14 = r14 + 1
            r8 = r22
            r10 = r24
            goto L_0x003f
        L_0x009f:
            r22 = r8
            r24 = r10
            goto L_0x00b5
        L_0x00a4:
            r21 = -1
            r8 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r10 = 0
        L_0x00b5:
            r12 = r21
            if (r4 != 0) goto L_0x00c0
            q0.h0.e.d r5 = new q0.h0.e.d
            r6 = 0
            r5.<init>(r7, r6)
            goto L_0x00dc
        L_0x00c0:
            r13 = 0
            q0.w r14 = r7.b
            boolean r14 = r14.c
            if (r14 == 0) goto L_0x00d1
            okhttp3.Handshake r14 = r4.Y1
            if (r14 != 0) goto L_0x00d1
            q0.h0.e.d r5 = new q0.h0.e.d
            r5.<init>(r7, r13)
            goto L_0x00dc
        L_0x00d1:
            boolean r14 = q0.h0.e.d.a(r4, r7)
            if (r14 != 0) goto L_0x00e3
            q0.h0.e.d r5 = new q0.h0.e.d
            r5.<init>(r7, r13)
        L_0x00dc:
            r25 = r2
            r26 = r3
            r1 = r7
            goto L_0x033d
        L_0x00e3:
            q0.e r13 = r7.a()
            boolean r14 = r13.c
            if (r14 != 0) goto L_0x0354
            java.lang.String r14 = "If-Modified-Since"
            java.lang.String r21 = r7.b(r14)
            r22 = r14
            java.lang.String r14 = "If-None-Match"
            if (r21 != 0) goto L_0x0101
            java.lang.String r21 = r7.b(r14)
            if (r21 == 0) goto L_0x00fe
            goto L_0x0101
        L_0x00fe:
            r21 = 0
            goto L_0x0103
        L_0x0101:
            r21 = 1
        L_0x0103:
            if (r21 == 0) goto L_0x0107
            goto L_0x0354
        L_0x0107:
            r21 = r14
            q0.e r14 = r4.a()
            if (r15 == 0) goto L_0x0121
            long r23 = r15.getTime()
            r25 = r2
            r26 = r3
            long r2 = r10 - r23
            r0 = 0
            long r0 = java.lang.Math.max(r0, r2)
            r2 = -1
            goto L_0x0128
        L_0x0121:
            r25 = r2
            r26 = r3
            r2 = -1
            r0 = 0
        L_0x0128:
            if (r12 == r2) goto L_0x0137
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r3 = r13
            long r12 = (long) r12
            long r12 = r2.toMillis(r12)
            long r0 = java.lang.Math.max(r0, r12)
            goto L_0x0138
        L_0x0137:
            r3 = r13
        L_0x0138:
            long r12 = r10 - r8
            long r5 = r5 - r10
            long r0 = r0 + r12
            long r0 = r0 + r5
            m0.n.b.i.c(r4)
            q0.e r2 = r4.a()
            int r2 = r2.e
            r5 = -1
            if (r2 == r5) goto L_0x0151
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            long r8 = (long) r2
            long r5 = r5.toMillis(r8)
            goto L_0x0164
        L_0x0151:
            if (r16 == 0) goto L_0x0167
            if (r15 == 0) goto L_0x0159
            long r10 = r15.getTime()
        L_0x0159:
            long r5 = r16.getTime()
            long r5 = r5 - r10
            r8 = 0
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x01a3
        L_0x0164:
            r8 = 0
            goto L_0x01a6
        L_0x0167:
            if (r17 == 0) goto L_0x01a3
            q0.b0 r2 = r4.d
            q0.w r2 = r2.b
            java.util.List<java.lang.String> r5 = r2.j
            if (r5 != 0) goto L_0x0173
            r2 = 0
            goto L_0x0183
        L_0x0173:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            q0.w$b r6 = q0.w.b
            java.util.List<java.lang.String> r2 = r2.j
            r6.f(r2, r5)
            java.lang.String r2 = r5.toString()
        L_0x0183:
            if (r2 != 0) goto L_0x01a3
            if (r15 == 0) goto L_0x018b
            long r8 = r15.getTime()
        L_0x018b:
            m0.n.b.i.c(r17)
            long r5 = r17.getTime()
            long r8 = r8 - r5
            r5 = 0
            int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x01a5
            r2 = 10
            long r10 = (long) r2
            long r8 = r8 / r10
            r43 = r5
            r5 = r8
            r8 = r43
            goto L_0x01a6
        L_0x01a3:
            r5 = 0
        L_0x01a5:
            r8 = r5
        L_0x01a6:
            int r2 = r3.e
            r10 = -1
            if (r2 == r10) goto L_0x01b6
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            long r12 = (long) r2
            long r11 = r11.toMillis(r12)
            long r5 = java.lang.Math.min(r5, r11)
        L_0x01b6:
            int r2 = r3.k
            if (r2 == r10) goto L_0x01c2
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            long r12 = (long) r2
            long r11 = r11.toMillis(r12)
            goto L_0x01c3
        L_0x01c2:
            r11 = r8
        L_0x01c3:
            boolean r2 = r14.i
            if (r2 != 0) goto L_0x01d2
            int r2 = r3.j
            if (r2 == r10) goto L_0x01d2
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r8 = (long) r2
            long r8 = r3.toMillis(r8)
        L_0x01d2:
            boolean r2 = r14.c
            if (r2 != 0) goto L_0x02b1
            long r11 = r11 + r0
            long r8 = r8 + r5
            int r2 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x02b1
            java.lang.String r2 = "response"
            m0.n.b.i.e(r4, r2)
            q0.b0 r2 = r4.d
            okhttp3.Protocol r3 = r4.q
            int r8 = r4.y
            java.lang.String r9 = r4.x
            okhttp3.Handshake r10 = r4.Y1
            q0.v r13 = r4.Z1
            q0.v$a r13 = r13.j()
            q0.f0 r14 = r4.a2
            q0.e0 r15 = r4.b2
            r23 = r7
            q0.e0 r7 = r4.c2
            r17 = r7
            q0.e0 r7 = r4.d2
            r18 = r14
            r19 = r15
            long r14 = r4.e2
            r20 = r14
            long r14 = r4.f2
            r40 = r14
            q0.h0.g.c r14 = r4.g2
            int r5 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            java.lang.String r6 = "value"
            java.lang.String r11 = "name"
            java.lang.String r12 = "Warning"
            if (r5 < 0) goto L_0x0220
            java.lang.String r5 = "110 HttpURLConnection \"Response is stale\""
            m0.n.b.i.e(r12, r11)
            m0.n.b.i.e(r5, r6)
            r13.a(r12, r5)
        L_0x0220:
            r27 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r0 > r27 ? 1 : (r0 == r27 ? 0 : -1))
            if (r0 <= 0) goto L_0x0245
            m0.n.b.i.c(r4)
            q0.e r0 = r4.a()
            int r0 = r0.e
            r1 = -1
            if (r0 != r1) goto L_0x0237
            if (r16 != 0) goto L_0x0237
            r0 = 1
            goto L_0x0238
        L_0x0237:
            r0 = 0
        L_0x0238:
            if (r0 == 0) goto L_0x0245
            java.lang.String r0 = "113 HttpURLConnection \"Heuristic expiration\""
            m0.n.b.i.e(r12, r11)
            m0.n.b.i.e(r0, r6)
            r13.a(r12, r0)
        L_0x0245:
            q0.h0.e.d r5 = new q0.h0.e.d
            if (r8 < 0) goto L_0x024b
            r0 = 1
            goto L_0x024c
        L_0x024b:
            r0 = 0
        L_0x024c:
            if (r0 == 0) goto L_0x02a1
            if (r2 == 0) goto L_0x0295
            if (r3 == 0) goto L_0x0289
            if (r9 == 0) goto L_0x027d
            q0.v r33 = r13.d()
            q0.e0 r0 = new q0.e0
            r27 = r0
            r28 = r2
            r29 = r3
            r30 = r9
            r31 = r8
            r32 = r10
            r34 = r18
            r35 = r19
            r36 = r17
            r37 = r7
            r38 = r20
            r42 = r14
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r42)
            r1 = 0
            r5.<init>(r1, r0)
            r1 = r23
            goto L_0x033d
        L_0x027d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "message == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0289:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "protocol == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0295:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "request == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x02a1:
            java.lang.String r0 = "code < 0: "
            java.lang.String r0 = i0.d.a.a.a.e0(r0, r8)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x02b1:
            r23 = r7
            if (r18 == 0) goto L_0x02ba
            r0 = r18
            r14 = r21
            goto L_0x02c7
        L_0x02ba:
            if (r17 == 0) goto L_0x02bf
            r18 = r19
            goto L_0x02c3
        L_0x02bf:
            if (r15 == 0) goto L_0x034b
            r18 = r20
        L_0x02c3:
            r0 = r18
            r14 = r22
        L_0x02c7:
            r1 = r23
            q0.v r2 = r1.d
            q0.v$a r2 = r2.j()
            m0.n.b.i.c(r0)
            r2.c(r14, r0)
            java.lang.String r0 = "request"
            m0.n.b.i.e(r1, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            q0.w r6 = r1.b
            java.lang.String r7 = r1.c
            q0.d0 r9 = r1.e
            java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r1.f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x02f3
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            goto L_0x02f9
        L_0x02f3:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r1.f
            java.util.Map r0 = m0.j.g.B0(r0)
        L_0x02f9:
            q0.v r3 = r1.d
            r3.j()
            q0.v r2 = r2.d()
            java.lang.String r3 = "headers"
            m0.n.b.i.e(r2, r3)
            q0.v$a r2 = r2.j()
            if (r6 == 0) goto L_0x033f
            q0.v r8 = r2.d()
            byte[] r2 = q0.h0.c.a
            java.lang.String r2 = "$this$toImmutableMap"
            m0.n.b.i.e(r0, r2)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0323
            java.util.Map r0 = m0.j.g.o()
            goto L_0x0331
        L_0x0323:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r0)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r2)
            java.lang.String r2 = "Collections.unmodifiableMap(LinkedHashMap(this))"
            m0.n.b.i.d(r0, r2)
        L_0x0331:
            r10 = r0
            q0.b0 r0 = new q0.b0
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            q0.h0.e.d r5 = new q0.h0.e.d
            r5.<init>(r0, r4)
        L_0x033d:
            r0 = 0
            goto L_0x035f
        L_0x033f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "url == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x034b:
            r1 = r23
            q0.h0.e.d r5 = new q0.h0.e.d
            r0 = 0
            r5.<init>(r1, r0)
            goto L_0x035f
        L_0x0354:
            r25 = r2
            r26 = r3
            r1 = r7
            r0 = 0
            q0.h0.e.d r5 = new q0.h0.e.d
            r5.<init>(r1, r0)
        L_0x035f:
            q0.b0 r2 = r5.a
            if (r2 == 0) goto L_0x0370
            q0.e r1 = r1.a()
            boolean r1 = r1.l
            if (r1 == 0) goto L_0x0370
            q0.h0.e.d r5 = new q0.h0.e.d
            r5.<init>(r0, r0)
        L_0x0370:
            q0.b0 r0 = r5.a
            q0.e0 r1 = r5.b
            r2 = r45
            q0.d r3 = r2.b
            if (r3 == 0) goto L_0x03a0
            monitor-enter(r3)
            java.lang.String r6 = "cacheStrategy"
            m0.n.b.i.e(r5, r6)     // Catch:{ all -> 0x039d }
            int r6 = r3.Y1     // Catch:{ all -> 0x039d }
            int r6 = r6 + 1
            r3.Y1 = r6     // Catch:{ all -> 0x039d }
            q0.b0 r6 = r5.a     // Catch:{ all -> 0x039d }
            if (r6 == 0) goto L_0x0391
            int r5 = r3.x     // Catch:{ all -> 0x039d }
            int r5 = r5 + 1
            r3.x = r5     // Catch:{ all -> 0x039d }
            goto L_0x039b
        L_0x0391:
            q0.e0 r5 = r5.b     // Catch:{ all -> 0x039d }
            if (r5 == 0) goto L_0x039b
            int r5 = r3.y     // Catch:{ all -> 0x039d }
            int r5 = r5 + 1
            r3.y = r5     // Catch:{ all -> 0x039d }
        L_0x039b:
            monitor-exit(r3)
            goto L_0x03a0
        L_0x039d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x03a0:
            r3 = r26
            boolean r5 = r3 instanceof q0.h0.g.e
            if (r4 == 0) goto L_0x03af
            if (r1 != 0) goto L_0x03af
            q0.f0 r5 = r4.a2
            if (r5 == 0) goto L_0x03af
            q0.h0.c.d(r5)
        L_0x03af:
            r5 = -1
            if (r0 != 0) goto L_0x03ea
            if (r1 != 0) goto L_0x03ea
            q0.e0$a r0 = new q0.e0$a
            r0.<init>()
            r1 = r25
            q0.b0 r1 = r1.f
            r0.g(r1)
            okhttp3.Protocol r1 = okhttp3.Protocol.HTTP_1_1
            r0.f(r1)
            r1 = 504(0x1f8, float:7.06E-43)
            r0.c = r1
            java.lang.String r1 = "Unsatisfiable Request (only-if-cached)"
            r0.e(r1)
            q0.f0 r1 = q0.h0.c.c
            r0.g = r1
            r0.k = r5
            long r4 = java.lang.System.currentTimeMillis()
            r0.l = r4
            q0.e0 r0 = r0.a()
            java.lang.String r1 = "call"
            m0.n.b.i.e(r3, r1)
            java.lang.String r1 = "response"
            m0.n.b.i.e(r0, r1)
            return r0
        L_0x03ea:
            if (r0 != 0) goto L_0x040c
            m0.n.b.i.c(r1)
            q0.e0$a r0 = new q0.e0$a
            r0.<init>(r1)
            q0.h0.e.a$a r4 = a
            q0.e0 r1 = q0.h0.e.a.C0286a.a(r4, r1)
            r0.b(r1)
            q0.e0 r0 = r0.a()
            java.lang.String r1 = "call"
            m0.n.b.i.e(r3, r1)
            java.lang.String r1 = "response"
            m0.n.b.i.e(r0, r1)
            return r0
        L_0x040c:
            if (r1 == 0) goto L_0x0419
            java.lang.String r7 = "call"
            m0.n.b.i.e(r3, r7)
            java.lang.String r7 = "cachedResponse"
            m0.n.b.i.e(r1, r7)
            goto L_0x0422
        L_0x0419:
            q0.d r7 = r2.b
            if (r7 == 0) goto L_0x0422
            java.lang.String r7 = "call"
            m0.n.b.i.e(r3, r7)
        L_0x0422:
            r7 = r46
            q0.h0.h.g r7 = (q0.h0.h.g) r7     // Catch:{ all -> 0x0727 }
            q0.e0 r4 = r7.a(r0)     // Catch:{ all -> 0x0727 }
            if (r1 == 0) goto L_0x056b
            int r7 = r4.y
            r8 = 304(0x130, float:4.26E-43)
            if (r7 != r8) goto L_0x0562
            q0.e0$a r0 = new q0.e0$a
            r0.<init>(r1)
            q0.h0.e.a$a r5 = a
            q0.v r6 = r1.Z1
            q0.v r7 = r4.Z1
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 20
            r8.<init>(r9)
            int r9 = r6.size()
            r10 = 0
        L_0x0449:
            java.lang.String r11 = "value"
            java.lang.String r12 = "name"
            if (r10 >= r9) goto L_0x049e
            java.lang.String r13 = r6.c(r10)
            java.lang.String r14 = r6.k(r10)
            java.lang.String r15 = "Warning"
            r16 = r6
            r6 = 1
            boolean r6 = kotlin.text.StringsKt__IndentKt.f(r15, r13, r6)
            if (r6 == 0) goto L_0x046f
            java.lang.String r6 = "1"
            r15 = 2
            r46 = r9
            r9 = 0
            boolean r6 = kotlin.text.StringsKt__IndentKt.J(r14, r6, r9, r15)
            if (r6 == 0) goto L_0x0471
            goto L_0x0497
        L_0x046f:
            r46 = r9
        L_0x0471:
            boolean r6 = r5.b(r13)
            if (r6 != 0) goto L_0x0483
            boolean r6 = r5.c(r13)
            if (r6 == 0) goto L_0x0483
            java.lang.String r6 = r7.b(r13)
            if (r6 != 0) goto L_0x0497
        L_0x0483:
            m0.n.b.i.e(r13, r12)
            m0.n.b.i.e(r14, r11)
            r8.add(r13)
            java.lang.CharSequence r6 = kotlin.text.StringsKt__IndentKt.X(r14)
            java.lang.String r6 = r6.toString()
            r8.add(r6)
        L_0x0497:
            int r10 = r10 + 1
            r9 = r46
            r6 = r16
            goto L_0x0449
        L_0x049e:
            int r6 = r7.size()
            r9 = 0
        L_0x04a3:
            if (r9 >= r6) goto L_0x04d0
            java.lang.String r10 = r7.c(r9)
            boolean r13 = r5.b(r10)
            if (r13 != 0) goto L_0x04cd
            boolean r13 = r5.c(r10)
            if (r13 == 0) goto L_0x04cd
            java.lang.String r13 = r7.k(r9)
            m0.n.b.i.e(r10, r12)
            m0.n.b.i.e(r13, r11)
            r8.add(r10)
            java.lang.CharSequence r10 = kotlin.text.StringsKt__IndentKt.X(r13)
            java.lang.String r10 = r10.toString()
            r8.add(r10)
        L_0x04cd:
            int r9 = r9 + 1
            goto L_0x04a3
        L_0x04d0:
            q0.v r5 = new q0.v
            r6 = 0
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.Object[] r6 = r8.toArray(r6)
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r6, r7)
            java.lang.String[] r6 = (java.lang.String[]) r6
            r7 = 0
            r5.<init>(r6, r7)
            r0.d(r5)
            long r5 = r4.e2
            r0.k = r5
            long r5 = r4.f2
            r0.l = r5
            q0.h0.e.a$a r5 = a
            q0.e0 r6 = q0.h0.e.a.C0286a.a(r5, r1)
            r0.b(r6)
            q0.e0 r5 = q0.h0.e.a.C0286a.a(r5, r4)
            java.lang.String r6 = "networkResponse"
            r0.c(r6, r5)
            r0.h = r5
            q0.e0 r0 = r0.a()
            q0.f0 r4 = r4.a2
            m0.n.b.i.c(r4)
            r4.close()
            q0.d r4 = r2.b
            m0.n.b.i.c(r4)
            monitor-enter(r4)
            int r5 = r4.y     // Catch:{ all -> 0x055f }
            int r5 = r5 + 1
            r4.y = r5     // Catch:{ all -> 0x055f }
            monitor-exit(r4)
            q0.d r4 = r2.b
            java.util.Objects.requireNonNull(r4)
            java.lang.String r4 = "cached"
            m0.n.b.i.e(r1, r4)
            java.lang.String r4 = "network"
            m0.n.b.i.e(r0, r4)
            q0.d$b r4 = new q0.d$b
            r4.<init>((q0.e0) r0)
            q0.f0 r1 = r1.a2
            java.lang.String r5 = "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody"
            java.util.Objects.requireNonNull(r1, r5)
            q0.d$a r1 = (q0.d.a) r1
            okhttp3.internal.cache.DiskLruCache$b r1 = r1.d
            okhttp3.internal.cache.DiskLruCache r5 = r1.x     // Catch:{ IOException -> 0x054e }
            java.lang.String r6 = r1.c     // Catch:{ IOException -> 0x054e }
            long r7 = r1.d     // Catch:{ IOException -> 0x054e }
            okhttp3.internal.cache.DiskLruCache$Editor r1 = r5.e(r6, r7)     // Catch:{ IOException -> 0x054e }
            if (r1 == 0) goto L_0x0554
            r4.c(r1)     // Catch:{ IOException -> 0x054f }
            r1.b()     // Catch:{ IOException -> 0x054f }
            goto L_0x0554
        L_0x054e:
            r1 = 0
        L_0x054f:
            if (r1 == 0) goto L_0x0554
            r1.a()     // Catch:{ IOException -> 0x0554 }
        L_0x0554:
            java.lang.String r1 = "call"
            m0.n.b.i.e(r3, r1)
            java.lang.String r1 = "response"
            m0.n.b.i.e(r0, r1)
            return r0
        L_0x055f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0562:
            r7 = 0
            q0.f0 r8 = r1.a2
            if (r8 == 0) goto L_0x056c
            q0.h0.c.d(r8)
            goto L_0x056c
        L_0x056b:
            r7 = 0
        L_0x056c:
            m0.n.b.i.c(r4)
            q0.e0$a r8 = new q0.e0$a
            r8.<init>(r4)
            q0.h0.e.a$a r9 = a
            q0.e0 r10 = q0.h0.e.a.C0286a.a(r9, r1)
            r8.b(r10)
            q0.e0 r4 = q0.h0.e.a.C0286a.a(r9, r4)
            java.lang.String r9 = "networkResponse"
            r8.c(r9, r4)
            r8.h = r4
            q0.e0 r4 = r8.a()
            q0.d r8 = r2.b
            if (r8 == 0) goto L_0x0725
            boolean r8 = q0.h0.h.e.a(r4)
            if (r8 == 0) goto L_0x06e5
            boolean r8 = q0.h0.e.d.a(r4, r0)
            if (r8 == 0) goto L_0x06e5
            q0.d r0 = r2.b
            java.util.Objects.requireNonNull(r0)
            java.lang.String r8 = "response"
            m0.n.b.i.e(r4, r8)
            q0.b0 r8 = r4.d
            java.lang.String r8 = r8.c
            java.lang.String r9 = "method"
            m0.n.b.i.e(r8, r9)
            java.lang.String r9 = "POST"
            boolean r9 = m0.n.b.i.a(r8, r9)
            if (r9 != 0) goto L_0x05d7
            java.lang.String r9 = "PATCH"
            boolean r9 = m0.n.b.i.a(r8, r9)
            if (r9 != 0) goto L_0x05d7
            java.lang.String r9 = "PUT"
            boolean r9 = m0.n.b.i.a(r8, r9)
            if (r9 != 0) goto L_0x05d7
            java.lang.String r9 = "DELETE"
            boolean r9 = m0.n.b.i.a(r8, r9)
            if (r9 != 0) goto L_0x05d7
            java.lang.String r9 = "MOVE"
            boolean r9 = m0.n.b.i.a(r8, r9)
            if (r9 == 0) goto L_0x05d8
        L_0x05d7:
            r7 = 1
        L_0x05d8:
            if (r7 == 0) goto L_0x05e0
            q0.b0 r5 = r4.d     // Catch:{ IOException -> 0x0625 }
            r0.f(r5)     // Catch:{ IOException -> 0x0625 }
            goto L_0x0625
        L_0x05e0:
            java.lang.String r7 = "GET"
            boolean r7 = m0.n.b.i.a(r8, r7)
            r7 = r7 ^ 1
            if (r7 == 0) goto L_0x05eb
            goto L_0x0625
        L_0x05eb:
            java.lang.String r7 = "$this$hasVaryAll"
            m0.n.b.i.e(r4, r7)
            q0.v r7 = r4.Z1
            java.util.Set r7 = q0.d.i(r7)
            java.lang.String r8 = "*"
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L_0x05ff
            goto L_0x0625
        L_0x05ff:
            q0.d$b r7 = new q0.d$b
            r7.<init>((q0.e0) r4)
            okhttp3.internal.cache.DiskLruCache r8 = r0.c     // Catch:{ IOException -> 0x061f }
            q0.b0 r9 = r4.d     // Catch:{ IOException -> 0x061f }
            q0.w r9 = r9.b     // Catch:{ IOException -> 0x061f }
            java.lang.String r9 = q0.d.b(r9)     // Catch:{ IOException -> 0x061f }
            kotlin.text.Regex r10 = okhttp3.internal.cache.DiskLruCache.c     // Catch:{ IOException -> 0x061f }
            okhttp3.internal.cache.DiskLruCache$Editor r5 = r8.e(r9, r5)     // Catch:{ IOException -> 0x061f }
            if (r5 == 0) goto L_0x0625
            r7.c(r5)     // Catch:{ IOException -> 0x0620 }
            q0.d$c r6 = new q0.d$c     // Catch:{ IOException -> 0x0620 }
            r6.<init>(r0, r5)     // Catch:{ IOException -> 0x0620 }
            goto L_0x0626
        L_0x061f:
            r5 = 0
        L_0x0620:
            if (r5 == 0) goto L_0x0625
            r5.a()     // Catch:{ IOException -> 0x0625 }
        L_0x0625:
            r6 = 0
        L_0x0626:
            if (r6 != 0) goto L_0x062e
            r25 = r1
            r26 = r3
            goto L_0x06a7
        L_0x062e:
            r0.w r0 = r6.b
            q0.f0 r5 = r4.a2
            m0.n.b.i.c(r5)
            r0.i r5 = r5.source()
            r0.h r0 = m0.r.t.a.r.m.a1.a.b0(r0)
            q0.h0.e.b r7 = new q0.h0.e.b
            r7.<init>(r5, r6, r0)
            java.lang.String r0 = "Content-Type"
            r5 = 2
            r6 = 0
            java.lang.String r0 = q0.e0.b(r4, r0, r6, r5)
            q0.f0 r5 = r4.a2
            long r5 = r5.contentLength()
            java.lang.String r8 = "response"
            m0.n.b.i.e(r4, r8)
            q0.b0 r10 = r4.d
            okhttp3.Protocol r11 = r4.q
            int r13 = r4.y
            java.lang.String r12 = r4.x
            okhttp3.Handshake r14 = r4.Y1
            q0.v r8 = r4.Z1
            q0.v$a r8 = r8.j()
            q0.e0 r15 = r4.b2
            q0.e0 r9 = r4.c2
            q0.e0 r2 = r4.d2
            r25 = r1
            r19 = r2
            long r1 = r4.e2
            r20 = r1
            long r1 = r4.f2
            q0.h0.g.c r4 = r4.g2
            r26 = r3
            q0.h0.h.h r3 = new q0.h0.h.h
            r0.i r7 = m0.r.t.a.r.m.a1.a.c0(r7)
            r3.<init>(r0, r5, r7)
            if (r13 < 0) goto L_0x0686
            r0 = 1
            goto L_0x0687
        L_0x0686:
            r0 = 0
        L_0x0687:
            if (r0 == 0) goto L_0x06d5
            if (r10 == 0) goto L_0x06c9
            if (r11 == 0) goto L_0x06bd
            if (r12 == 0) goto L_0x06b1
            q0.v r0 = r8.d()
            q0.e0 r5 = new q0.e0
            r6 = r9
            r9 = r5
            r7 = r15
            r15 = r0
            r16 = r3
            r17 = r7
            r18 = r6
            r22 = r1
            r24 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r24)
            r4 = r5
        L_0x06a7:
            if (r25 == 0) goto L_0x06b0
            java.lang.String r0 = "call"
            r1 = r26
            m0.n.b.i.e(r1, r0)
        L_0x06b0:
            return r4
        L_0x06b1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "message == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x06bd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "protocol == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x06c9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "request == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x06d5:
            java.lang.String r0 = "code < 0: "
            java.lang.String r0 = i0.d.a.a.a.e0(r0, r13)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x06e5:
            java.lang.String r1 = r0.c
            java.lang.String r2 = "method"
            m0.n.b.i.e(r1, r2)
            java.lang.String r2 = "POST"
            boolean r2 = m0.n.b.i.a(r1, r2)
            if (r2 != 0) goto L_0x0717
            java.lang.String r2 = "PATCH"
            boolean r2 = m0.n.b.i.a(r1, r2)
            if (r2 != 0) goto L_0x0717
            java.lang.String r2 = "PUT"
            boolean r2 = m0.n.b.i.a(r1, r2)
            if (r2 != 0) goto L_0x0717
            java.lang.String r2 = "DELETE"
            boolean r2 = m0.n.b.i.a(r1, r2)
            if (r2 != 0) goto L_0x0717
            java.lang.String r2 = "MOVE"
            boolean r1 = m0.n.b.i.a(r1, r2)
            if (r1 == 0) goto L_0x0715
            goto L_0x0717
        L_0x0715:
            r1 = 0
            goto L_0x0718
        L_0x0717:
            r1 = 1
        L_0x0718:
            if (r1 == 0) goto L_0x0722
            r1 = r45
            q0.d r2 = r1.b     // Catch:{ IOException -> 0x0726 }
            r2.f(r0)     // Catch:{ IOException -> 0x0726 }
            goto L_0x0726
        L_0x0722:
            r1 = r45
            goto L_0x0726
        L_0x0725:
            r1 = r2
        L_0x0726:
            return r4
        L_0x0727:
            r0 = move-exception
            r1 = r2
            if (r4 == 0) goto L_0x0732
            q0.f0 r2 = r4.a2
            if (r2 == 0) goto L_0x0732
            q0.h0.c.d(r2)
        L_0x0732:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.e.a.intercept(q0.x$a):q0.e0");
    }
}
