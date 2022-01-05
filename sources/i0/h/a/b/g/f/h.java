package i0.h.a.b.g.f;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public final class h extends e {
    public final g a = new g();

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        r1 = new java.util.Vector(2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Throwable r5, java.lang.Throwable r6) {
        /*
            r4 = this;
            if (r6 == r5) goto L_0x0042
            i0.h.a.b.g.f.g r0 = r4.a
            java.lang.ref.ReferenceQueue<java.lang.Throwable> r1 = r0.b
        L_0x0006:
            java.lang.ref.Reference r1 = r1.poll()
            if (r1 == 0) goto L_0x0014
            java.util.concurrent.ConcurrentHashMap<i0.h.a.b.g.f.f, java.util.List<java.lang.Throwable>> r2 = r0.a
            r2.remove(r1)
            java.lang.ref.ReferenceQueue<java.lang.Throwable> r1 = r0.b
            goto L_0x0006
        L_0x0014:
            i0.h.a.b.g.f.f r1 = new i0.h.a.b.g.f.f
            r2 = 0
            r1.<init>(r5, r2)
            java.util.concurrent.ConcurrentHashMap<i0.h.a.b.g.f.f, java.util.List<java.lang.Throwable>> r2 = r0.a
            java.lang.Object r1 = r2.get(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0025
            goto L_0x003e
        L_0x0025:
            java.util.Vector r1 = new java.util.Vector
            r2 = 2
            r1.<init>(r2)
            java.util.concurrent.ConcurrentHashMap<i0.h.a.b.g.f.f, java.util.List<java.lang.Throwable>> r2 = r0.a
            i0.h.a.b.g.f.f r3 = new i0.h.a.b.g.f.f
            java.lang.ref.ReferenceQueue<java.lang.Throwable> r0 = r0.b
            r3.<init>(r5, r0)
            java.lang.Object r5 = r2.putIfAbsent(r3, r1)
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r1 = r5
        L_0x003e:
            r1.add(r6)
            return
        L_0x0042:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Self suppression is not allowed."
            r5.<init>(r0, r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.g.f.h.a(java.lang.Throwable, java.lang.Throwable):void");
    }
}
