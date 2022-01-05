package i0.j.e.l0.b;

/* compiled from: DisposableData */
public class a implements Runnable {
    public final /* synthetic */ b c;

    public a(b bVar) {
        this.c = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r22 = this;
            r1 = r22
            i0.j.e.l0.b.b r0 = r1.c
            java.util.List<i0.j.e.l0.b.d> r0 = r0.a
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0161
            java.lang.Object r2 = r0.next()
            i0.j.e.l0.b.d r2 = (i0.j.e.l0.b.d) r2
            i0.j.e.l0.b.i r3 = r2.b()
            com.instabug.library.internal.b.f r2 = r2.a()
            long r4 = r2.b()
            java.util.List r2 = java.util.Collections.emptyList()
            i0.j.e.l0.b.h r3 = (i0.j.e.l0.b.h) r3
            java.lang.String r14 = r3.a
            i0.j.e.l0.b.i$a r6 = r3.d
            java.lang.String r15 = r3.b
            java.lang.String r3 = r3.c
            java.util.Objects.requireNonNull(r6)
            com.instabug.library.internal.storage.cache.db.DatabaseManager r6 = com.instabug.library.internal.storage.cache.db.DatabaseManager.getInstance()
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r16 = r6.openDatabase()
            r13 = 2
            java.lang.String[] r8 = new java.lang.String[r13]
            r17 = 0
            r8[r17] = r15
            r18 = 1
            r8[r18] = r3
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r9 = 0
            r10 = 0
            r11 = 0
            r19 = 0
            r20 = 0
            r6 = r16
            r7 = r14
            r21 = r12
            r12 = r19
            r19 = r0
            r0 = r13
            r13 = r20
            android.database.Cursor r6 = r6.query(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0156 }
            if (r6 == 0) goto L_0x009e
            int r7 = r6.getCount()     // Catch:{ all -> 0x009b }
            if (r7 <= 0) goto L_0x009e
            int r7 = r6.getColumnIndex(r15)     // Catch:{ all -> 0x009b }
            int r8 = r6.getColumnIndex(r3)     // Catch:{ all -> 0x009b }
        L_0x0072:
            boolean r9 = r6.moveToNext()     // Catch:{ all -> 0x009b }
            if (r9 == 0) goto L_0x009e
            java.lang.String r9 = r6.getString(r7)     // Catch:{ all -> 0x009b }
            long r10 = r6.getLong(r8)     // Catch:{ all -> 0x009b }
            i0.j.e.l0.b.e r12 = new i0.j.e.l0.b.e     // Catch:{ all -> 0x009b }
            r12.<init>(r15, r9)     // Catch:{ all -> 0x009b }
            i0.j.e.l0.b.e r9 = new i0.j.e.l0.b.e     // Catch:{ all -> 0x009b }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x009b }
            r9.<init>(r3, r10)     // Catch:{ all -> 0x009b }
            i0.j.e.l0.b.f r10 = new i0.j.e.l0.b.f     // Catch:{ all -> 0x009b }
            r10.<init>(r12, r9)     // Catch:{ all -> 0x009b }
            r9 = r21
            r9.add(r10)     // Catch:{ all -> 0x009b }
            r21 = r9
            goto L_0x0072
        L_0x009b:
            r0 = move-exception
            goto L_0x0158
        L_0x009e:
            r9 = r21
            if (r6 == 0) goto L_0x00a5
            r6.close()
        L_0x00a5:
            r16.close()
            java.util.Iterator r3 = r9.iterator()
        L_0x00ac:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0152
            java.lang.Object r6 = r3.next()
            i0.j.e.l0.b.f r6 = (i0.j.e.l0.b.f) r6
            i0.j.e.l0.b.e<java.lang.Long> r7 = r6.b
            T r7 = r7.b
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x00c9
            goto L_0x00df
        L_0x00c9:
            long r7 = java.lang.System.currentTimeMillis()
            i0.j.e.l0.b.e<java.lang.Long> r9 = r6.b
            T r9 = r9.b
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r7 = r7 - r9
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x00df
            r7 = r18
            goto L_0x00e1
        L_0x00df:
            r7 = r17
        L_0x00e1:
            if (r7 == 0) goto L_0x00ac
            java.util.Iterator r7 = r2.iterator()
        L_0x00e7:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00fc
            java.lang.Object r8 = r7.next()
            i0.j.e.l0.b.g r8 = (i0.j.e.l0.b.g) r8
            boolean r8 = r8.a(r6)
            if (r8 == 0) goto L_0x00e7
            r7 = r18
            goto L_0x00fe
        L_0x00fc:
            r7 = r17
        L_0x00fe:
            if (r7 != 0) goto L_0x00ac
            com.instabug.library.internal.storage.cache.db.DatabaseManager r7 = com.instabug.library.internal.storage.cache.db.DatabaseManager.getInstance()
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r7 = r7.openDatabase()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            i0.j.e.l0.b.e<java.lang.String> r9 = r6.a
            java.lang.String r9 = r9.a
            r8.append(r9)
            java.lang.String r9 = " = ? AND "
            r8.append(r9)
            i0.j.e.l0.b.e<java.lang.Long> r9 = r6.b
            java.lang.String r9 = r9.a
            java.lang.String r10 = " = ?"
            java.lang.String r8 = i0.d.a.a.a.y0(r8, r9, r10)
            java.lang.String[] r9 = new java.lang.String[r0]
            i0.j.e.l0.b.e<java.lang.String> r10 = r6.a
            T r10 = r10.b
            java.lang.String r10 = (java.lang.String) r10
            r9[r17] = r10
            i0.j.e.l0.b.e<java.lang.Long> r6 = r6.b
            T r6 = r6.b
            java.lang.Long r6 = (java.lang.Long) r6
            java.lang.String r6 = r6.toString()
            r9[r18] = r6
            r7.beginTransaction()     // Catch:{ all -> 0x014a }
            r7.delete(r14, r8, r9)     // Catch:{ all -> 0x014a }
            r7.setTransactionSuccessful()     // Catch:{ all -> 0x014a }
            r7.endTransaction()
            r7.close()
            goto L_0x00ac
        L_0x014a:
            r0 = move-exception
            r7.endTransaction()
            r7.close()
            throw r0
        L_0x0152:
            r0 = r19
            goto L_0x000a
        L_0x0156:
            r0 = move-exception
            r6 = 0
        L_0x0158:
            if (r6 == 0) goto L_0x015d
            r6.close()
        L_0x015d:
            r16.close()
            throw r0
        L_0x0161:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.e.l0.b.a.run():void");
    }
}
