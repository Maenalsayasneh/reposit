package i0.j.b.s;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: PersistableSettings */
public class c {
    public static c a;
    public SharedPreferences b;
    public SharedPreferences.Editor c;

    public c(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("instabug_bug_reporting", 0);
        this.b = sharedPreferences;
        this.c = sharedPreferences.edit();
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    @android.annotation.SuppressLint({"ERADICATE_RETURN_NOT_NULLABLE"})
    public static synchronized i0.j.b.s.c a() {
        /*
            java.lang.Class<i0.j.b.s.c> r0 = i0.j.b.s.c.class
            monitor-enter(r0)
            i0.j.b.s.c r1 = a     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x0018
            android.content.Context r1 = com.instabug.library.Instabug.getApplicationContext()     // Catch:{ all -> 0x001c }
            monitor-enter(r0)     // Catch:{ all -> 0x001c }
            i0.j.b.s.c r2 = new i0.j.b.s.c     // Catch:{ all -> 0x0015 }
            r2.<init>(r1)     // Catch:{ all -> 0x0015 }
            a = r2     // Catch:{ all -> 0x0015 }
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            goto L_0x0018
        L_0x0015:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r1     // Catch:{ all -> 0x001c }
        L_0x0018:
            i0.j.b.s.c r1 = a     // Catch:{ all -> 0x001c }
            monitor-exit(r0)
            return r1
        L_0x001c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.b.s.c.a():i0.j.b.s.c");
    }
}
