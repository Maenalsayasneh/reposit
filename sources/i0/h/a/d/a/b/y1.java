package i0.h.a.d.a.b;

import i0.h.a.d.a.c.b;
import i0.h.a.d.a.e.a0;
import java.util.concurrent.Executor;

public final class y1 {
    public final y a;
    public final a0<e3> b;
    public final f1 c;
    public final a0<Executor> d;
    public final r0 e;
    public final b f;

    public y1(y yVar, a0<e3> a0Var, f1 f1Var, a0<Executor> a0Var2, r0 r0Var, b bVar) {
        this.a = yVar;
        this.b = a0Var;
        this.c = f1Var;
        this.d = a0Var2;
        this.e = r0Var;
        this.f = bVar;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void a(i0.h.a.d.a.b.v1 r10) {
        /*
            r9 = this;
            i0.h.a.d.a.b.y r0 = r9.a
            java.lang.String r1 = r10.b
            int r2 = r10.c
            long r3 = r10.d
            java.io.File r0 = r0.l(r1, r2, r3)
            i0.h.a.d.a.b.y r1 = r9.a
            java.lang.String r2 = r10.b
            int r3 = r10.c
            long r4 = r10.d
            java.util.Objects.requireNonNull(r1)
            java.io.File r6 = new java.io.File
            java.io.File r7 = new java.io.File
            java.io.File r1 = r1.e(r2, r3, r4)
            java.lang.String r2 = "_slices"
            r7.<init>(r1, r2)
            java.lang.String r1 = "_metadata"
            r6.<init>(r7, r1)
            boolean r1 = r0.exists()
            r2 = 0
            if (r1 == 0) goto L_0x010e
            boolean r1 = r6.exists()
            if (r1 == 0) goto L_0x010e
            i0.h.a.d.a.b.y r1 = r9.a
            java.lang.String r3 = r10.b
            int r4 = r10.c
            long r7 = r10.d
            java.io.File r1 = r1.i(r3, r4, r7)
            r1.mkdirs()
            boolean r0 = r0.renameTo(r1)
            if (r0 == 0) goto L_0x0104
            i0.h.a.d.a.b.y r0 = r9.a
            java.lang.String r1 = r10.b
            int r3 = r10.c
            long r4 = r10.d
            java.io.File r7 = new java.io.File
            java.io.File r0 = r0.i(r1, r3, r4)
            java.lang.String r1 = "merge.tmp"
            r7.<init>(r0, r1)
            r7.delete()
            i0.h.a.d.a.b.y r0 = r9.a
            java.lang.String r1 = r10.b
            int r3 = r10.c
            long r4 = r10.d
            java.util.Objects.requireNonNull(r0)
            java.io.File r7 = new java.io.File
            java.io.File r0 = r0.i(r1, r3, r4)
            java.lang.String r1 = "_metadata"
            r7.<init>(r0, r1)
            r7.mkdirs()
            boolean r0 = r6.renameTo(r7)
            if (r0 == 0) goto L_0x00fa
            i0.h.a.d.a.c.b r0 = r9.f
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.b     // Catch:{ all -> 0x00f7 }
            boolean r1 = r1.get()     // Catch:{ all -> 0x00f7 }
            if (r1 != 0) goto L_0x009a
            monitor-enter(r0)     // Catch:{ all -> 0x00f7 }
            java.util.Map<java.lang.String, java.lang.Object> r1 = r0.a     // Catch:{ all -> 0x0097 }
            java.lang.String r3 = "assetOnlyUpdates"
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0097 }
            r1.put(r3, r4)     // Catch:{ all -> 0x0097 }
            monitor-exit(r0)     // Catch:{ all -> 0x00f7 }
            goto L_0x009a
        L_0x0097:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00f7 }
            throw r10     // Catch:{ all -> 0x00f7 }
        L_0x009a:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r0.a     // Catch:{ all -> 0x00f7 }
            java.lang.String r3 = "assetOnlyUpdates"
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x00f7 }
            boolean r3 = r1 instanceof java.lang.Boolean     // Catch:{ all -> 0x00f7 }
            if (r3 != 0) goto L_0x00a7
            goto L_0x00ad
        L_0x00a7:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x00f7 }
            boolean r2 = r1.booleanValue()     // Catch:{ all -> 0x00f7 }
        L_0x00ad:
            monitor-exit(r0)
            i0.h.a.d.a.e.a0<java.util.concurrent.Executor> r0 = r9.d
            java.lang.Object r0 = r0.a()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            if (r2 == 0) goto L_0x00c1
            i0.h.a.d.a.b.w1 r1 = new i0.h.a.d.a.b.w1
            r1.<init>(r9, r10)
            r0.execute(r1)
            goto L_0x00ce
        L_0x00c1:
            i0.h.a.d.a.b.y r1 = r9.a
            r1.getClass()
            i0.h.a.d.a.b.x1 r2 = new i0.h.a.d.a.b.x1
            r2.<init>(r1)
            r0.execute(r2)
        L_0x00ce:
            i0.h.a.d.a.b.f1 r0 = r9.c
            java.lang.String r5 = r10.b
            int r6 = r10.c
            long r7 = r10.d
            i0.h.a.d.a.b.w0 r1 = new i0.h.a.d.a.b.w0
            r3 = r1
            r4 = r0
            r3.<init>(r4, r5, r6, r7)
            r0.a(r1)
            i0.h.a.d.a.b.r0 r0 = r9.e
            java.lang.String r1 = r10.b
            r0.a(r1)
            i0.h.a.d.a.e.a0<i0.h.a.d.a.b.e3> r0 = r9.b
            java.lang.Object r0 = r0.a()
            i0.h.a.d.a.b.e3 r0 = (i0.h.a.d.a.b.e3) r0
            int r1 = r10.a
            java.lang.String r10 = r10.b
            r0.l(r1, r10)
            return
        L_0x00f7:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        L_0x00fa:
            com.google.android.play.core.assetpacks.bv r0 = new com.google.android.play.core.assetpacks.bv
            java.lang.String r1 = "Cannot move metadata files to final location."
            int r10 = r10.a
            r0.<init>((java.lang.String) r1, (int) r10)
            throw r0
        L_0x0104:
            com.google.android.play.core.assetpacks.bv r0 = new com.google.android.play.core.assetpacks.bv
            java.lang.String r1 = "Cannot move merged pack files to final location."
            int r10 = r10.a
            r0.<init>((java.lang.String) r1, (int) r10)
            throw r0
        L_0x010e:
            com.google.android.play.core.assetpacks.bv r0 = new com.google.android.play.core.assetpacks.bv
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = r10.b
            r1[r2] = r3
            java.lang.String r2 = "Cannot find pack files to move for pack %s."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            int r10 = r10.a
            r0.<init>((java.lang.String) r1, (int) r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.d.a.b.y1.a(i0.h.a.d.a.b.v1):void");
    }
}
