package q0.h0.j;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import m0.n.b.i;
import okhttp3.Protocol;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import q0.a0;
import q0.b0;
import q0.e0;
import q0.h0.c;
import q0.h0.g.g;
import q0.h0.h.d;
import q0.h0.h.e;
import q0.h0.j.m;
import q0.v;
import q0.w;
import r0.y;

/* compiled from: Http2ExchangeCodec.kt */
public final class k implements d {
    public static final List<String> a = c.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List<String> b = c.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public volatile m c;
    public final Protocol d;
    public volatile boolean e;
    public final g f;
    public final q0.h0.h.g g;
    public final d h;

    public k(a0 a0Var, g gVar, q0.h0.h.g gVar2, d dVar) {
        i.e(a0Var, PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT);
        i.e(gVar, "connection");
        i.e(gVar2, "chain");
        i.e(dVar, "http2Connection");
        this.f = gVar;
        this.g = gVar2;
        this.h = dVar;
        List<Protocol> list = a0Var.p2;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.d = !list.contains(protocol) ? Protocol.HTTP_2 : protocol;
    }

    public void a() {
        m mVar = this.c;
        i.c(mVar);
        ((m.a) mVar.g()).close();
    }

    public void b(b0 b0Var) {
        int i;
        m mVar;
        i.e(b0Var, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        if (this.c == null) {
            boolean z = false;
            boolean z2 = b0Var.e != null;
            i.e(b0Var, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
            v vVar = b0Var.d;
            ArrayList arrayList = new ArrayList(vVar.size() + 4);
            arrayList.add(new a(a.c, b0Var.c));
            ByteString byteString = a.d;
            w wVar = b0Var.b;
            i.e(wVar, "url");
            String b2 = wVar.b();
            String d2 = wVar.d();
            if (d2 != null) {
                b2 = b2 + '?' + d2;
            }
            arrayList.add(new a(byteString, b2));
            String b3 = b0Var.b("Host");
            if (b3 != null) {
                arrayList.add(new a(a.f, b3));
            }
            arrayList.add(new a(a.e, b0Var.b.d));
            int size = vVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                String c2 = vVar.c(i2);
                Locale locale = Locale.US;
                i.d(locale, "Locale.US");
                Objects.requireNonNull(c2, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = c2.toLowerCase(locale);
                i.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!a.contains(lowerCase) || (i.a(lowerCase, "te") && i.a(vVar.k(i2), "trailers"))) {
                    arrayList.add(new a(lowerCase, vVar.k(i2)));
                }
            }
            d dVar = this.h;
            Objects.requireNonNull(dVar);
            i.e(arrayList, "requestHeaders");
            boolean z3 = !z2;
            synchronized (dVar.u2) {
                synchronized (dVar) {
                    if (dVar.a2 > 1073741823) {
                        dVar.k(ErrorCode.REFUSED_STREAM);
                    }
                    if (!dVar.b2) {
                        i = dVar.a2;
                        dVar.a2 = i + 2;
                        mVar = new m(i, dVar, z3, false, (v) null);
                        if (!z2 || dVar.r2 >= dVar.s2 || mVar.c >= mVar.d) {
                            z = true;
                        }
                        if (mVar.i()) {
                            dVar.y.put(Integer.valueOf(i), mVar);
                        }
                    } else {
                        throw new ConnectionShutdownException();
                    }
                }
                dVar.u2.i(z3, i, arrayList);
            }
            if (z) {
                dVar.u2.flush();
            }
            this.c = mVar;
            if (!this.e) {
                m mVar2 = this.c;
                i.c(mVar2);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                mVar2.i.g((long) this.g.h, timeUnit);
                m mVar3 = this.c;
                i.c(mVar3);
                mVar3.j.g((long) this.g.i, timeUnit);
                return;
            }
            m mVar4 = this.c;
            i.c(mVar4);
            mVar4.e(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
    }

    public y c(e0 e0Var) {
        i.e(e0Var, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        m mVar = this.c;
        i.c(mVar);
        return mVar.g;
    }

    public void cancel() {
        this.e = true;
        m mVar = this.c;
        if (mVar != null) {
            mVar.e(ErrorCode.CANCEL);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e9, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ea, code lost:
        r0.i.l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ef, code lost:
        throw r12;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q0.e0.a d(boolean r12) {
        /*
            r11 = this;
            q0.h0.j.m r0 = r11.c
            m0.n.b.i.c(r0)
            monitor-enter(r0)
            q0.h0.j.m$c r1 = r0.i     // Catch:{ all -> 0x00f0 }
            r1.h()     // Catch:{ all -> 0x00f0 }
        L_0x000b:
            java.util.ArrayDeque<q0.v> r1 = r0.e     // Catch:{ all -> 0x00e9 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00e9 }
            if (r1 == 0) goto L_0x001b
            okhttp3.internal.http2.ErrorCode r1 = r0.k     // Catch:{ all -> 0x00e9 }
            if (r1 != 0) goto L_0x001b
            r0.l()     // Catch:{ all -> 0x00e9 }
            goto L_0x000b
        L_0x001b:
            q0.h0.j.m$c r1 = r0.i     // Catch:{ all -> 0x00f0 }
            r1.l()     // Catch:{ all -> 0x00f0 }
            java.util.ArrayDeque<q0.v> r1 = r0.e     // Catch:{ all -> 0x00f0 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00f0 }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x00d9
            java.util.ArrayDeque<q0.v> r1 = r0.e     // Catch:{ all -> 0x00f0 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x00f0 }
            java.lang.String r2 = "headersQueue.removeFirst()"
            m0.n.b.i.d(r1, r2)     // Catch:{ all -> 0x00f0 }
            q0.v r1 = (q0.v) r1     // Catch:{ all -> 0x00f0 }
            monitor-exit(r0)
            okhttp3.Protocol r0 = r11.d
            java.lang.String r2 = "headerBlock"
            m0.n.b.i.e(r1, r2)
            java.lang.String r2 = "protocol"
            m0.n.b.i.e(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            int r3 = r1.size()
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r5
        L_0x0053:
            if (r6 >= r3) goto L_0x009e
            java.lang.String r8 = r1.c(r6)
            java.lang.String r9 = r1.k(r6)
            java.lang.String r10 = ":status"
            boolean r10 = m0.n.b.i.a(r8, r10)
            if (r10 == 0) goto L_0x007b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "HTTP/1.1 "
            r7.append(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            q0.h0.h.j r7 = q0.h0.h.j.a(r7)
            goto L_0x009b
        L_0x007b:
            java.util.List<java.lang.String> r10 = b
            boolean r10 = r10.contains(r8)
            if (r10 != 0) goto L_0x009b
            java.lang.String r10 = "name"
            m0.n.b.i.e(r8, r10)
            java.lang.String r10 = "value"
            m0.n.b.i.e(r9, r10)
            r2.add(r8)
            java.lang.CharSequence r8 = kotlin.text.StringsKt__IndentKt.X(r9)
            java.lang.String r8 = r8.toString()
            r2.add(r8)
        L_0x009b:
            int r6 = r6 + 1
            goto L_0x0053
        L_0x009e:
            if (r7 == 0) goto L_0x00d1
            q0.e0$a r1 = new q0.e0$a
            r1.<init>()
            r1.f(r0)
            int r0 = r7.b
            r1.c = r0
            java.lang.String r0 = r7.c
            r1.e(r0)
            q0.v r0 = new q0.v
            java.lang.String[] r3 = new java.lang.String[r4]
            java.lang.Object[] r2 = r2.toArray(r3)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r2, r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0.<init>(r2, r5)
            r1.d(r0)
            if (r12 == 0) goto L_0x00cf
            int r12 = r1.c
            r0 = 100
            if (r12 != r0) goto L_0x00cf
            goto L_0x00d0
        L_0x00cf:
            r5 = r1
        L_0x00d0:
            return r5
        L_0x00d1:
            java.net.ProtocolException r12 = new java.net.ProtocolException
            java.lang.String r0 = "Expected ':status' header not present"
            r12.<init>(r0)
            throw r12
        L_0x00d9:
            java.io.IOException r12 = r0.l     // Catch:{ all -> 0x00f0 }
            if (r12 == 0) goto L_0x00de
            goto L_0x00e8
        L_0x00de:
            okhttp3.internal.http2.StreamResetException r12 = new okhttp3.internal.http2.StreamResetException     // Catch:{ all -> 0x00f0 }
            okhttp3.internal.http2.ErrorCode r1 = r0.k     // Catch:{ all -> 0x00f0 }
            m0.n.b.i.c(r1)     // Catch:{ all -> 0x00f0 }
            r12.<init>(r1)     // Catch:{ all -> 0x00f0 }
        L_0x00e8:
            throw r12     // Catch:{ all -> 0x00f0 }
        L_0x00e9:
            r12 = move-exception
            q0.h0.j.m$c r1 = r0.i     // Catch:{ all -> 0x00f0 }
            r1.l()     // Catch:{ all -> 0x00f0 }
            throw r12     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.j.k.d(boolean):q0.e0$a");
    }

    public g e() {
        return this.f;
    }

    public void f() {
        this.h.u2.flush();
    }

    public long g(e0 e0Var) {
        i.e(e0Var, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (!e.a(e0Var)) {
            return 0;
        }
        return c.k(e0Var);
    }

    public r0.w h(b0 b0Var, long j) {
        i.e(b0Var, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        m mVar = this.c;
        i.c(mVar);
        return mVar.g();
    }
}
