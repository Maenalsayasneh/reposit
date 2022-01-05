package i0.e.a.c;

/* compiled from: CacheUtil.kt */
public final class a {
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0039 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Set<java.lang.String> a(i0.k.a.a r10) {
        /*
            java.lang.String r0 = "<this>"
            m0.n.b.i.e(r10, r0)
            monitor-enter(r10)
            java.io.File r0 = r10.q     // Catch:{ all -> 0x009a }
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x009a }
            r1 = 0
            if (r0 != 0) goto L_0x0011
            goto L_0x0094
        L_0x0011:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x009a }
            r2.<init>()     // Catch:{ all -> 0x009a }
            int r3 = r0.length     // Catch:{ all -> 0x009a }
            r4 = 0
            r5 = r4
        L_0x0019:
            r6 = 1
            if (r5 >= r3) goto L_0x003c
            r7 = r0[r5]     // Catch:{ all -> 0x009a }
            boolean r8 = r7.isFile()     // Catch:{ all -> 0x009a }
            if (r8 == 0) goto L_0x0033
            java.lang.String r8 = r7.getName()     // Catch:{ all -> 0x009a }
            kotlin.text.Regex r9 = okhttp3.internal.cache.DiskLruCache.c     // Catch:{ all -> 0x009a }
            java.lang.String r9 = "journal"
            boolean r8 = m0.n.b.i.a(r8, r9)     // Catch:{ all -> 0x009a }
            if (r8 != 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r6 = r4
        L_0x0034:
            if (r6 == 0) goto L_0x0039
            r2.add(r7)     // Catch:{ all -> 0x009a }
        L_0x0039:
            int r5 = r5 + 1
            goto L_0x0019
        L_0x003c:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x009a }
            r3 = 10
            int r3 = i0.j.f.p.h.K(r2, r3)     // Catch:{ all -> 0x009a }
            r0.<init>(r3)     // Catch:{ all -> 0x009a }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x009a }
        L_0x004b:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x009a }
            if (r3 == 0) goto L_0x006b
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x009a }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x009a }
            java.lang.String r3 = r3.getName()     // Catch:{ all -> 0x009a }
            java.lang.String r5 = "it.name"
            m0.n.b.i.d(r3, r5)     // Catch:{ all -> 0x009a }
            java.lang.String r5 = "."
            r7 = 2
            java.lang.String r3 = kotlin.text.StringsKt__IndentKt.R(r3, r5, r1, r7)     // Catch:{ all -> 0x009a }
            r0.add(r3)     // Catch:{ all -> 0x009a }
            goto L_0x004b
        L_0x006b:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x009a }
            r1.<init>()     // Catch:{ all -> 0x009a }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x009a }
        L_0x0074:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x009a }
            if (r2 == 0) goto L_0x0090
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x009a }
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x009a }
            i0.k.a.a$e r3 = r10.f(r3)     // Catch:{ all -> 0x009a }
            if (r3 == 0) goto L_0x0089
            r3 = r6
            goto L_0x008a
        L_0x0089:
            r3 = r4
        L_0x008a:
            if (r3 == 0) goto L_0x0074
            r1.add(r2)     // Catch:{ all -> 0x009a }
            goto L_0x0074
        L_0x0090:
            java.util.Set r1 = m0.j.g.D0(r1)     // Catch:{ all -> 0x009a }
        L_0x0094:
            if (r1 != 0) goto L_0x0098
            kotlin.collections.EmptySet r1 = kotlin.collections.EmptySet.c     // Catch:{ all -> 0x009a }
        L_0x0098:
            monitor-exit(r10)
            return r1
        L_0x009a:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.a.c.a.a(i0.k.a.a):java.util.Set");
    }
}
