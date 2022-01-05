package i0.h.a.b.a.a.d.b;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-auth@@18.0.0 */
public final class l {
    public static l a;
    public a b;

    public l(Context context) {
        a a2 = a.a(context);
        this.b = a2;
        a2.b();
        this.b.c();
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static synchronized i0.h.a.b.a.a.d.b.l b(android.content.Context r2) {
        /*
            java.lang.Class<i0.h.a.b.a.a.d.b.l> r0 = i0.h.a.b.a.a.d.b.l.class
            monitor-enter(r0)
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x001b }
            monitor-enter(r0)     // Catch:{ all -> 0x001b }
            i0.h.a.b.a.a.d.b.l r1 = a     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x000e
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            goto L_0x0016
        L_0x000e:
            i0.h.a.b.a.a.d.b.l r1 = new i0.h.a.b.a.a.d.b.l     // Catch:{ all -> 0x0018 }
            r1.<init>(r2)     // Catch:{ all -> 0x0018 }
            a = r1     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
        L_0x0016:
            monitor-exit(r0)
            return r1
        L_0x0018:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r2     // Catch:{ all -> 0x001b }
        L_0x001b:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.a.a.d.b.l.b(android.content.Context):i0.h.a.b.a.a.d.b.l");
    }

    public final synchronized void a() {
        a aVar = this.b;
        aVar.c.lock();
        try {
            aVar.d.edit().clear().apply();
        } finally {
            aVar.c.unlock();
        }
    }
}
