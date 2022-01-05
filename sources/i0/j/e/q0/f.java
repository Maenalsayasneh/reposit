package i0.j.e.q0;

import i0.j.e.t0.b;
import java.util.List;
import k0.b.y.d;

/* compiled from: LoggingFileResolver */
public class f implements d<List<b>> {
    public final /* synthetic */ j c;

    public f(j jVar) {
        this.c = jVar;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void b(java.lang.Object r4) throws java.lang.Exception {
        /*
            r3 = this;
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x0063
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0063
            i0.j.e.q0.j r0 = r3.c
            java.util.Objects.requireNonNull(r0)
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x0063
            i0.j.e.q0.e r1 = r0.b
            monitor-enter(r1)
            java.io.File r2 = r1.a     // Catch:{ all -> 0x0060 }
            if (r2 == 0) goto L_0x003d
            boolean r2 = i0.j.e.q0.e.d(r2)     // Catch:{ all -> 0x0060 }
            if (r2 == 0) goto L_0x0026
            java.io.File r2 = r1.a     // Catch:{ all -> 0x0060 }
            monitor-exit(r1)
            goto L_0x0043
        L_0x0026:
            monitor-enter(r1)     // Catch:{ all -> 0x0060 }
            java.io.File r2 = r1.b     // Catch:{ all -> 0x003a }
            if (r2 != 0) goto L_0x002e
            r1.c()     // Catch:{ all -> 0x003a }
        L_0x002e:
            java.io.File r2 = r1.b     // Catch:{ all -> 0x003a }
            monitor-exit(r1)     // Catch:{ all -> 0x0060 }
            if (r2 == 0) goto L_0x0040
            java.io.File r2 = r1.a(r2)     // Catch:{ all -> 0x0060 }
            r1.a = r2     // Catch:{ all -> 0x0060 }
            goto L_0x0040
        L_0x003a:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0060 }
            throw r4     // Catch:{ all -> 0x0060 }
        L_0x003d:
            r1.c()     // Catch:{ all -> 0x0060 }
        L_0x0040:
            java.io.File r2 = r1.a     // Catch:{ all -> 0x0060 }
            monitor-exit(r1)
        L_0x0043:
            java.lang.ref.WeakReference<android.content.Context> r0 = r0.e
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r2 == 0) goto L_0x0063
            if (r0 == 0) goto L_0x0063
            com.instabug.library.internal.storage.DiskUtils r0 = com.instabug.library.internal.storage.DiskUtils.with(r0)
            i0.j.e.q0.l r1 = new i0.j.e.q0.l
            r1.<init>(r2, r4)
            com.instabug.library.internal.storage.executor.WriteOperationExecutor r4 = r0.writeOperation(r1)
            r4.execute()
            goto L_0x0063
        L_0x0060:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.e.q0.f.b(java.lang.Object):void");
    }
}
