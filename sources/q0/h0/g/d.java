package q0.h0.g;

import androidx.core.app.NotificationCompat;
import com.stripe.android.model.PaymentMethod;
import java.io.IOException;
import m0.n.b.i;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import q0.a;
import q0.g0;
import q0.h0.g.j;
import q0.t;
import q0.w;

/* compiled from: ExchangeFinder.kt */
public final class d {
    public j.a a;
    public j b;
    public int c;
    public int d;
    public int e;
    public g0 f;
    public final h g;
    public final a h;
    public final e i;
    public final t j;

    public d(h hVar, a aVar, e eVar, t tVar) {
        i.e(hVar, "connectionPool");
        i.e(aVar, PaymentMethod.BillingDetails.PARAM_ADDRESS);
        i.e(eVar, NotificationCompat.CATEGORY_CALL);
        i.e(tVar, "eventListener");
        this.g = hVar;
        this.h = aVar;
        this.i = eVar;
        this.j = tVar;
    }

    /* JADX INFO: finally extract failed */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0316 A[SYNTHETIC] */
    public final q0.h0.g.g a(int r16, int r17, int r18, int r19, boolean r20, boolean r21) throws java.io.IOException {
        /*
            r15 = this;
            r1 = r15
        L_0x0001:
            q0.h0.g.e r0 = r1.i
            boolean r0 = r0.f2
            if (r0 != 0) goto L_0x035c
            q0.h0.g.e r0 = r1.i
            q0.h0.g.g r2 = r0.Z1
            r0 = 0
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x005d
            monitor-enter(r2)
            boolean r5 = r2.i     // Catch:{ all -> 0x005a }
            if (r5 != 0) goto L_0x0024
            q0.g0 r5 = r2.q     // Catch:{ all -> 0x005a }
            q0.a r5 = r5.a     // Catch:{ all -> 0x005a }
            q0.w r5 = r5.a     // Catch:{ all -> 0x005a }
            boolean r5 = r15.b(r5)     // Catch:{ all -> 0x005a }
            if (r5 != 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r5 = r3
            goto L_0x002a
        L_0x0024:
            q0.h0.g.e r5 = r1.i     // Catch:{ all -> 0x005a }
            java.net.Socket r5 = r5.j()     // Catch:{ all -> 0x005a }
        L_0x002a:
            monitor-exit(r2)
            q0.h0.g.e r6 = r1.i
            q0.h0.g.g r6 = r6.Z1
            if (r6 == 0) goto L_0x0043
            if (r5 != 0) goto L_0x0034
            r0 = r4
        L_0x0034:
            if (r0 == 0) goto L_0x0037
            goto L_0x007d
        L_0x0037:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0043:
            if (r5 == 0) goto L_0x0048
            q0.h0.c.e(r5)
        L_0x0048:
            q0.t r5 = r1.j
            q0.h0.g.e r6 = r1.i
            java.util.Objects.requireNonNull(r5)
            java.lang.String r5 = "call"
            m0.n.b.i.e(r6, r5)
            java.lang.String r5 = "connection"
            m0.n.b.i.e(r2, r5)
            goto L_0x005d
        L_0x005a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x005d:
            r1.c = r0
            r1.d = r0
            r1.e = r0
            q0.h0.g.h r2 = r1.g
            q0.a r5 = r1.h
            q0.h0.g.e r6 = r1.i
            boolean r2 = r2.a(r5, r6, r3, r0)
            if (r2 == 0) goto L_0x0081
            q0.h0.g.e r0 = r1.i
            q0.h0.g.g r2 = r0.Z1
            m0.n.b.i.c(r2)
            q0.t r0 = r1.j
            q0.h0.g.e r3 = r1.i
            r0.a(r3, r2)
        L_0x007d:
            r0 = r21
            goto L_0x0310
        L_0x0081:
            q0.g0 r2 = r1.f
            if (r2 == 0) goto L_0x008b
            m0.n.b.i.c(r2)
            r1.f = r3
            goto L_0x00a1
        L_0x008b:
            q0.h0.g.j$a r2 = r1.a
            if (r2 == 0) goto L_0x00a4
            m0.n.b.i.c(r2)
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x00a4
            q0.h0.g.j$a r0 = r1.a
            m0.n.b.i.c(r0)
            q0.g0 r2 = r0.b()
        L_0x00a1:
            r5 = r3
            goto L_0x0288
        L_0x00a4:
            q0.h0.g.j r2 = r1.b
            if (r2 != 0) goto L_0x00b9
            q0.h0.g.j r2 = new q0.h0.g.j
            q0.a r5 = r1.h
            q0.h0.g.e r6 = r1.i
            q0.a0 r7 = r6.i2
            q0.h0.g.i r7 = r7.z2
            q0.t r8 = r1.j
            r2.<init>(r5, r7, r6, r8)
            r1.b = r2
        L_0x00b9:
            boolean r5 = r2.a()
            if (r5 == 0) goto L_0x0356
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x00c4:
            boolean r6 = r2.b()
            if (r6 == 0) goto L_0x0249
            boolean r6 = r2.b()
            java.lang.String r7 = "No route to "
            if (r6 == 0) goto L_0x0228
            java.util.List<? extends java.net.Proxy> r6 = r2.a
            int r8 = r2.b
            int r9 = r8 + 1
            r2.b = r9
            java.lang.Object r6 = r6.get(r8)
            java.net.Proxy r6 = (java.net.Proxy) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r2.c = r8
            java.net.Proxy$Type r9 = r6.type()
            java.net.Proxy$Type r10 = java.net.Proxy.Type.DIRECT
            if (r9 == r10) goto L_0x0140
            java.net.Proxy$Type r9 = r6.type()
            java.net.Proxy$Type r10 = java.net.Proxy.Type.SOCKS
            if (r9 != r10) goto L_0x00f8
            goto L_0x0140
        L_0x00f8:
            java.net.SocketAddress r9 = r6.address()
            boolean r10 = r9 instanceof java.net.InetSocketAddress
            if (r10 == 0) goto L_0x0125
            java.net.InetSocketAddress r9 = (java.net.InetSocketAddress) r9
            java.lang.String r10 = "$this$socketHost"
            m0.n.b.i.e(r9, r10)
            java.net.InetAddress r10 = r9.getAddress()
            if (r10 == 0) goto L_0x0117
            java.lang.String r10 = r10.getHostAddress()
            java.lang.String r11 = "address.hostAddress"
            m0.n.b.i.d(r10, r11)
            goto L_0x0120
        L_0x0117:
            java.lang.String r10 = r9.getHostName()
            java.lang.String r11 = "hostName"
            m0.n.b.i.d(r10, r11)
        L_0x0120:
            int r9 = r9.getPort()
            goto L_0x0148
        L_0x0125:
            java.lang.String r0 = "Proxy.address() is not an InetSocketAddress: "
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            java.lang.Class r2 = r9.getClass()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0140:
            q0.a r9 = r2.e
            q0.w r9 = r9.a
            java.lang.String r10 = r9.g
            int r9 = r9.h
        L_0x0148:
            r11 = 65535(0xffff, float:9.1834E-41)
            if (r4 > r9) goto L_0x0206
            if (r11 < r9) goto L_0x0206
            java.net.Proxy$Type r7 = r6.type()
            java.net.Proxy$Type r11 = java.net.Proxy.Type.SOCKS
            if (r7 != r11) goto L_0x015f
            java.net.InetSocketAddress r7 = java.net.InetSocketAddress.createUnresolved(r10, r9)
            r8.add(r7)
            goto L_0x01a9
        L_0x015f:
            q0.t r7 = r2.h
            q0.f r11 = r2.g
            java.util.Objects.requireNonNull(r7)
            java.lang.String r7 = "call"
            m0.n.b.i.e(r11, r7)
            java.lang.String r11 = "domainName"
            m0.n.b.i.e(r10, r11)
            q0.a r12 = r2.e
            q0.s r12 = r12.d
            java.util.List r12 = r12.a(r10)
            boolean r13 = r12.isEmpty()
            if (r13 != 0) goto L_0x01e8
            q0.t r13 = r2.h
            q0.f r14 = r2.g
            java.util.Objects.requireNonNull(r13)
            m0.n.b.i.e(r14, r7)
            m0.n.b.i.e(r10, r11)
            java.lang.String r7 = "inetAddressList"
            m0.n.b.i.e(r12, r7)
            java.util.Iterator r7 = r12.iterator()
        L_0x0194:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x01a9
            java.lang.Object r10 = r7.next()
            java.net.InetAddress r10 = (java.net.InetAddress) r10
            java.net.InetSocketAddress r11 = new java.net.InetSocketAddress
            r11.<init>(r10, r9)
            r8.add(r11)
            goto L_0x0194
        L_0x01a9:
            java.util.List<? extends java.net.InetSocketAddress> r7 = r2.c
            java.util.Iterator r7 = r7.iterator()
        L_0x01af:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x01e0
            java.lang.Object r8 = r7.next()
            java.net.InetSocketAddress r8 = (java.net.InetSocketAddress) r8
            q0.g0 r9 = new q0.g0
            q0.a r10 = r2.e
            r9.<init>(r10, r6, r8)
            q0.h0.g.i r8 = r2.f
            monitor-enter(r8)
            java.lang.String r10 = "route"
            m0.n.b.i.e(r9, r10)     // Catch:{ all -> 0x01dd }
            java.util.Set<q0.g0> r10 = r8.a     // Catch:{ all -> 0x01dd }
            boolean r10 = r10.contains(r9)     // Catch:{ all -> 0x01dd }
            monitor-exit(r8)
            if (r10 == 0) goto L_0x01d9
            java.util.List<q0.g0> r8 = r2.d
            r8.add(r9)
            goto L_0x01af
        L_0x01d9:
            r5.add(r9)
            goto L_0x01af
        L_0x01dd:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x01e0:
            boolean r6 = r5.isEmpty()
            r6 = r6 ^ r4
            if (r6 == 0) goto L_0x00c4
            goto L_0x0249
        L_0x01e8:
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            q0.a r2 = r2.e
            q0.s r2 = r2.d
            r3.append(r2)
            java.lang.String r2 = " returned no addresses for "
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x0206:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            r2.append(r10)
            r3 = 58
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = "; port is out of range"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0228:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r3 = i0.d.a.a.a.P0(r7)
            q0.a r4 = r2.e
            q0.w r4 = r4.a
            java.lang.String r4 = r4.g
            r3.append(r4)
            java.lang.String r4 = "; exhausted proxy configurations: "
            r3.append(r4)
            java.util.List<? extends java.net.Proxy> r2 = r2.a
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x0249:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0259
            java.util.List<q0.g0> r6 = r2.d
            m0.j.g.b(r5, r6)
            java.util.List<q0.g0> r2 = r2.d
            r2.clear()
        L_0x0259:
            q0.h0.g.j$a r2 = new q0.h0.g.j$a
            r2.<init>(r5)
            r1.a = r2
            java.util.List<q0.g0> r5 = r2.b
            q0.h0.g.e r6 = r1.i
            boolean r6 = r6.f2
            if (r6 != 0) goto L_0x034e
            q0.h0.g.h r6 = r1.g
            q0.a r7 = r1.h
            q0.h0.g.e r8 = r1.i
            boolean r0 = r6.a(r7, r8, r5, r0)
            if (r0 == 0) goto L_0x0284
            q0.h0.g.e r0 = r1.i
            q0.h0.g.g r2 = r0.Z1
            m0.n.b.i.c(r2)
            q0.t r0 = r1.j
            q0.h0.g.e r3 = r1.i
            r0.a(r3, r2)
            goto L_0x007d
        L_0x0284:
            q0.g0 r2 = r2.b()
        L_0x0288:
            q0.h0.g.g r14 = new q0.h0.g.g
            q0.h0.g.h r0 = r1.g
            r14.<init>(r0, r2)
            q0.h0.g.e r0 = r1.i
            r0.h2 = r14
            q0.h0.g.e r12 = r1.i     // Catch:{ all -> 0x0348 }
            q0.t r13 = r1.j     // Catch:{ all -> 0x0348 }
            r6 = r14
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r6.c(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0348 }
            q0.h0.g.e r0 = r1.i
            r0.h2 = r3
            q0.h0.g.e r0 = r1.i
            q0.a0 r0 = r0.i2
            q0.h0.g.i r3 = r0.z2
            q0.g0 r0 = r14.q
            monitor-enter(r3)
            java.lang.String r6 = "route"
            m0.n.b.i.e(r0, r6)     // Catch:{ all -> 0x0345 }
            java.util.Set<q0.g0> r6 = r3.a     // Catch:{ all -> 0x0345 }
            r6.remove(r0)     // Catch:{ all -> 0x0345 }
            monitor-exit(r3)
            q0.h0.g.h r0 = r1.g
            q0.a r3 = r1.h
            q0.h0.g.e r6 = r1.i
            boolean r0 = r0.a(r3, r6, r5, r4)
            if (r0 == 0) goto L_0x02e4
            q0.h0.g.e r0 = r1.i
            q0.h0.g.g r0 = r0.Z1
            m0.n.b.i.c(r0)
            r1.f = r2
            java.net.Socket r2 = r14.c
            m0.n.b.i.c(r2)
            q0.h0.c.e(r2)
            q0.t r2 = r1.j
            q0.h0.g.e r3 = r1.i
            r2.a(r3, r0)
            r2 = r0
            goto L_0x007d
        L_0x02e4:
            monitor-enter(r14)
            q0.h0.g.h r0 = r1.g     // Catch:{ all -> 0x0342 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x0342 }
            java.lang.String r2 = "connection"
            m0.n.b.i.e(r14, r2)     // Catch:{ all -> 0x0342 }
            byte[] r2 = q0.h0.c.a     // Catch:{ all -> 0x0342 }
            java.util.concurrent.ConcurrentLinkedQueue<q0.h0.g.g> r2 = r0.d     // Catch:{ all -> 0x0342 }
            r2.add(r14)     // Catch:{ all -> 0x0342 }
            q0.h0.f.c r2 = r0.b     // Catch:{ all -> 0x0342 }
            q0.h0.g.h$a r0 = r0.c     // Catch:{ all -> 0x0342 }
            r5 = 0
            r3 = 2
            q0.h0.f.c.d(r2, r0, r5, r3)     // Catch:{ all -> 0x0342 }
            q0.h0.g.e r0 = r1.i     // Catch:{ all -> 0x0342 }
            r0.c(r14)     // Catch:{ all -> 0x0342 }
            monitor-exit(r14)
            q0.t r0 = r1.j
            q0.h0.g.e r2 = r1.i
            r0.a(r2, r14)
            r0 = r21
            r2 = r14
        L_0x0310:
            boolean r3 = r2.i(r0)
            if (r3 == 0) goto L_0x0317
            return r2
        L_0x0317:
            r2.l()
            q0.g0 r2 = r1.f
            if (r2 == 0) goto L_0x0320
            goto L_0x0001
        L_0x0320:
            q0.h0.g.j$a r2 = r1.a
            if (r2 == 0) goto L_0x0329
            boolean r2 = r2.a()
            goto L_0x032a
        L_0x0329:
            r2 = r4
        L_0x032a:
            if (r2 == 0) goto L_0x032e
            goto L_0x0001
        L_0x032e:
            q0.h0.g.j r2 = r1.b
            if (r2 == 0) goto L_0x0336
            boolean r4 = r2.a()
        L_0x0336:
            if (r4 == 0) goto L_0x033a
            goto L_0x0001
        L_0x033a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "exhausted all routes"
            r0.<init>(r2)
            throw r0
        L_0x0342:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x0345:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0348:
            r0 = move-exception
            q0.h0.g.e r2 = r1.i
            r2.h2 = r3
            throw r0
        L_0x034e:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x0356:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x035c:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.g.d.a(int, int, int, int, boolean, boolean):q0.h0.g.g");
    }

    public final boolean b(w wVar) {
        i.e(wVar, "url");
        w wVar2 = this.h.a;
        return wVar.h == wVar2.h && i.a(wVar.g, wVar2.g);
    }

    public final void c(IOException iOException) {
        i.e(iOException, "e");
        this.f = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).c == ErrorCode.REFUSED_STREAM) {
            this.c++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.d++;
        } else {
            this.e++;
        }
    }
}
