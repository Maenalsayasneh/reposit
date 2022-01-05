package i0.h.c.r;

/* compiled from: FirebaseInstallations */
public final /* synthetic */ class e implements Runnable {
    public final f c;
    public final boolean d;

    public e(f fVar, boolean z) {
        this.c = fVar;
        this.d = z;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void run() {
        /*
            r6 = this;
            i0.h.c.r.f r0 = r6.c
            boolean r1 = r6.d
            java.lang.Object r2 = i0.h.c.r.f.a
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r2 = i0.h.c.r.f.a
            monitor-enter(r2)
            i0.h.c.c r3 = r0.c     // Catch:{ all -> 0x00e9 }
            r3.a()     // Catch:{ all -> 0x00e9 }
            android.content.Context r3 = r3.d     // Catch:{ all -> 0x00e9 }
            java.lang.String r4 = "generatefid.lock"
            i0.h.c.r.b r3 = i0.h.c.r.b.a(r3, r4)     // Catch:{ all -> 0x00e9 }
            com.google.firebase.installations.local.PersistedInstallation r4 = r0.e     // Catch:{ all -> 0x00e2 }
            i0.h.c.r.p.c r4 = r4.b()     // Catch:{ all -> 0x00e2 }
            if (r3 == 0) goto L_0x0024
            r3.b()     // Catch:{ all -> 0x00e9 }
        L_0x0024:
            monitor-exit(r2)     // Catch:{ all -> 0x00e9 }
            boolean r3 = r4.h()     // Catch:{ FirebaseInstallationsException -> 0x00dd }
            if (r3 != 0) goto L_0x0048
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r3 = r4.f()     // Catch:{ FirebaseInstallationsException -> 0x00dd }
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r5 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.UNREGISTERED     // Catch:{ FirebaseInstallationsException -> 0x00dd }
            if (r3 != r5) goto L_0x0035
            r3 = 1
            goto L_0x0036
        L_0x0035:
            r3 = 0
        L_0x0036:
            if (r3 == 0) goto L_0x0039
            goto L_0x0048
        L_0x0039:
            if (r1 != 0) goto L_0x0043
            i0.h.c.r.n r1 = r0.f     // Catch:{ FirebaseInstallationsException -> 0x00dd }
            boolean r1 = r1.d(r4)     // Catch:{ FirebaseInstallationsException -> 0x00dd }
            if (r1 == 0) goto L_0x00e1
        L_0x0043:
            i0.h.c.r.p.c r1 = r0.c(r4)     // Catch:{ FirebaseInstallationsException -> 0x00dd }
            goto L_0x004c
        L_0x0048:
            i0.h.c.r.p.c r1 = r0.j(r4)     // Catch:{ FirebaseInstallationsException -> 0x00dd }
        L_0x004c:
            monitor-enter(r2)
            i0.h.c.c r3 = r0.c     // Catch:{ all -> 0x00da }
            r3.a()     // Catch:{ all -> 0x00da }
            android.content.Context r3 = r3.d     // Catch:{ all -> 0x00da }
            java.lang.String r5 = "generatefid.lock"
            i0.h.c.r.b r3 = i0.h.c.r.b.a(r3, r5)     // Catch:{ all -> 0x00da }
            com.google.firebase.installations.local.PersistedInstallation r5 = r0.e     // Catch:{ all -> 0x00d3 }
            r5.a(r1)     // Catch:{ all -> 0x00d3 }
            if (r3 == 0) goto L_0x0064
            r3.b()     // Catch:{ all -> 0x00da }
        L_0x0064:
            monitor-exit(r2)     // Catch:{ all -> 0x00da }
            monitor-enter(r0)
            java.util.Set<i0.h.c.r.o.a> r2 = r0.m     // Catch:{ all -> 0x00d0 }
            int r2 = r2.size()     // Catch:{ all -> 0x00d0 }
            if (r2 == 0) goto L_0x0096
            java.lang.String r2 = r4.c()     // Catch:{ all -> 0x00d0 }
            java.lang.String r3 = r1.c()     // Catch:{ all -> 0x00d0 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x00d0 }
            if (r2 != 0) goto L_0x0096
            java.util.Set<i0.h.c.r.o.a> r2 = r0.m     // Catch:{ all -> 0x00d0 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00d0 }
        L_0x0082:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00d0 }
            if (r3 == 0) goto L_0x0096
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00d0 }
            i0.h.c.r.o.a r3 = (i0.h.c.r.o.a) r3     // Catch:{ all -> 0x00d0 }
            java.lang.String r4 = r1.c()     // Catch:{ all -> 0x00d0 }
            r3.a(r4)     // Catch:{ all -> 0x00d0 }
            goto L_0x0082
        L_0x0096:
            monitor-exit(r0)
            boolean r2 = r1.j()
            if (r2 == 0) goto L_0x00aa
            r2 = r1
            i0.h.c.r.p.a r2 = (i0.h.c.r.p.a) r2
            java.lang.String r2 = r2.b
            monitor-enter(r0)
            r0.l = r2     // Catch:{ all -> 0x00a7 }
            monitor-exit(r0)
            goto L_0x00aa
        L_0x00a7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00aa:
            boolean r2 = r1.h()
            if (r2 == 0) goto L_0x00bb
            com.google.firebase.installations.FirebaseInstallationsException r1 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r2 = com.google.firebase.installations.FirebaseInstallationsException.Status.BAD_CONFIG
            r1.<init>(r2)
            r0.k(r1)
            goto L_0x00e1
        L_0x00bb:
            boolean r2 = r1.i()
            if (r2 == 0) goto L_0x00cc
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r1.<init>(r2)
            r0.k(r1)
            goto L_0x00e1
        L_0x00cc:
            r0.l(r1)
            goto L_0x00e1
        L_0x00d0:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00d3:
            r0 = move-exception
            if (r3 == 0) goto L_0x00d9
            r3.b()     // Catch:{ all -> 0x00da }
        L_0x00d9:
            throw r0     // Catch:{ all -> 0x00da }
        L_0x00da:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00da }
            throw r0
        L_0x00dd:
            r1 = move-exception
            r0.k(r1)
        L_0x00e1:
            return
        L_0x00e2:
            r0 = move-exception
            if (r3 == 0) goto L_0x00e8
            r3.b()     // Catch:{ all -> 0x00e9 }
        L_0x00e8:
            throw r0     // Catch:{ all -> 0x00e9 }
        L_0x00e9:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00e9 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.c.r.e.run():void");
    }
}
