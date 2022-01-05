package h0.w;

import h0.y.a.c;

/* compiled from: RoomOpenHelper */
public class f extends c.a {
    public a b;
    public final a c;

    /* compiled from: RoomOpenHelper */
    public static abstract class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public abstract void a(h0.y.a.b bVar);

        public abstract b b(h0.y.a.b bVar);
    }

    /* compiled from: RoomOpenHelper */
    public static class b {
        public final boolean a;
        public final String b;

        public b(boolean z, String str) {
            this.a = z;
            this.b = str;
        }
    }

    public f(a aVar, a aVar2, String str, String str2) {
        super(aVar2.a);
        this.b = aVar;
        this.c = aVar2;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
        r0 = r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(h0.y.a.b r12, int r13, int r14) {
        /*
            r11 = this;
            h0.w.a r0 = r11.b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x010c
            androidx.room.RoomDatabase$c r0 = r0.d
            java.util.Objects.requireNonNull(r0)
            if (r13 != r14) goto L_0x0013
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x0078
        L_0x0013:
            if (r14 <= r13) goto L_0x0017
            r3 = r1
            goto L_0x0018
        L_0x0017:
            r3 = r2
        L_0x0018:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = r13
        L_0x001e:
            if (r3 == 0) goto L_0x0023
            if (r5 >= r14) goto L_0x0077
            goto L_0x0025
        L_0x0023:
            if (r5 <= r14) goto L_0x0077
        L_0x0025:
            java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, h0.w.j.a>> r6 = r0.a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r6.get(r7)
            java.util.TreeMap r6 = (java.util.TreeMap) r6
            r7 = 0
            if (r6 != 0) goto L_0x0035
            goto L_0x0075
        L_0x0035:
            if (r3 == 0) goto L_0x003c
            java.util.NavigableSet r8 = r6.descendingKeySet()
            goto L_0x0040
        L_0x003c:
            java.util.Set r8 = r6.keySet()
        L_0x0040:
            java.util.Iterator r8 = r8.iterator()
        L_0x0044:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0072
            java.lang.Object r9 = r8.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r3 == 0) goto L_0x005b
            if (r9 > r14) goto L_0x0061
            if (r9 <= r5) goto L_0x0061
            goto L_0x005f
        L_0x005b:
            if (r9 < r14) goto L_0x0061
            if (r9 >= r5) goto L_0x0061
        L_0x005f:
            r10 = r1
            goto L_0x0062
        L_0x0061:
            r10 = r2
        L_0x0062:
            if (r10 == 0) goto L_0x0044
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            java.lang.Object r5 = r6.get(r5)
            r4.add(r5)
            r6 = r1
            r5 = r9
            goto L_0x0073
        L_0x0072:
            r6 = r2
        L_0x0073:
            if (r6 != 0) goto L_0x001e
        L_0x0075:
            r0 = r7
            goto L_0x0078
        L_0x0077:
            r0 = r4
        L_0x0078:
            if (r0 == 0) goto L_0x010c
            h0.w.f$a r3 = r11.c
            androidx.work.impl.WorkDatabase_Impl$a r3 = (androidx.work.impl.WorkDatabase_Impl.a) r3
            java.util.Objects.requireNonNull(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = r12
            h0.y.a.f.a r4 = (h0.y.a.f.a) r4
            h0.y.a.a r5 = new h0.y.a.a
            java.lang.String r6 = "SELECT name FROM sqlite_master WHERE type = 'trigger'"
            r5.<init>(r6)
            android.database.Cursor r5 = r4.b(r5)
        L_0x0094:
            boolean r6 = r5.moveToNext()     // Catch:{ all -> 0x0107 }
            if (r6 == 0) goto L_0x00a2
            java.lang.String r6 = r5.getString(r2)     // Catch:{ all -> 0x0107 }
            r3.add(r6)     // Catch:{ all -> 0x0107 }
            goto L_0x0094
        L_0x00a2:
            r5.close()
            java.util.Iterator r3 = r3.iterator()
        L_0x00a9:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00c9
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "room_fts_content_sync_"
            boolean r6 = r5.startsWith(r6)
            if (r6 == 0) goto L_0x00a9
            java.lang.String r6 = "DROP TRIGGER IF EXISTS "
            java.lang.String r5 = i0.d.a.a.a.n0(r6, r5)
            android.database.sqlite.SQLiteDatabase r6 = r4.d
            r6.execSQL(r5)
            goto L_0x00a9
        L_0x00c9:
            java.util.Iterator r0 = r0.iterator()
        L_0x00cd:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00dd
            java.lang.Object r3 = r0.next()
            h0.w.j.a r3 = (h0.w.j.a) r3
            r3.a(r12)
            goto L_0x00cd
        L_0x00dd:
            h0.w.f$a r0 = r11.c
            h0.w.f$b r0 = r0.b(r12)
            boolean r3 = r0.a
            if (r3 == 0) goto L_0x00f2
            h0.w.f$a r0 = r11.c
            androidx.work.impl.WorkDatabase_Impl$a r0 = (androidx.work.impl.WorkDatabase_Impl.a) r0
            java.util.Objects.requireNonNull(r0)
            r11.c(r12)
            goto L_0x010d
        L_0x00f2:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Migration didn't properly handle: "
            java.lang.StringBuilder r13 = i0.d.a.a.a.P0(r13)
            java.lang.String r14 = r0.b
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x0107:
            r12 = move-exception
            r5.close()
            throw r12
        L_0x010c:
            r1 = r2
        L_0x010d:
            if (r1 != 0) goto L_0x0188
            h0.w.a r0 = r11.b
            if (r0 == 0) goto L_0x0178
            boolean r0 = r0.a(r13, r14)
            if (r0 != 0) goto L_0x0178
            h0.w.f$a r13 = r11.c
            androidx.work.impl.WorkDatabase_Impl$a r13 = (androidx.work.impl.WorkDatabase_Impl.a) r13
            java.util.Objects.requireNonNull(r13)
            r14 = r12
            h0.y.a.f.a r14 = (h0.y.a.f.a) r14
            android.database.sqlite.SQLiteDatabase r0 = r14.d
            java.lang.String r1 = "DROP TABLE IF EXISTS `Dependency`"
            r0.execSQL(r1)
            android.database.sqlite.SQLiteDatabase r0 = r14.d
            java.lang.String r1 = "DROP TABLE IF EXISTS `WorkSpec`"
            r0.execSQL(r1)
            android.database.sqlite.SQLiteDatabase r0 = r14.d
            java.lang.String r1 = "DROP TABLE IF EXISTS `WorkTag`"
            r0.execSQL(r1)
            android.database.sqlite.SQLiteDatabase r0 = r14.d
            java.lang.String r1 = "DROP TABLE IF EXISTS `SystemIdInfo`"
            r0.execSQL(r1)
            android.database.sqlite.SQLiteDatabase r0 = r14.d
            java.lang.String r1 = "DROP TABLE IF EXISTS `WorkName`"
            r0.execSQL(r1)
            android.database.sqlite.SQLiteDatabase r0 = r14.d
            java.lang.String r1 = "DROP TABLE IF EXISTS `WorkProgress`"
            r0.execSQL(r1)
            android.database.sqlite.SQLiteDatabase r14 = r14.d
            java.lang.String r0 = "DROP TABLE IF EXISTS `Preference`"
            r14.execSQL(r0)
            androidx.work.impl.WorkDatabase_Impl r14 = androidx.work.impl.WorkDatabase_Impl.this
            int r0 = androidx.work.impl.WorkDatabase_Impl.l
            java.util.List<androidx.room.RoomDatabase$b> r14 = r14.g
            if (r14 == 0) goto L_0x0172
            int r14 = r14.size()
        L_0x0160:
            if (r2 >= r14) goto L_0x0172
            androidx.work.impl.WorkDatabase_Impl r0 = androidx.work.impl.WorkDatabase_Impl.this
            java.util.List<androidx.room.RoomDatabase$b> r0 = r0.g
            java.lang.Object r0 = r0.get(r2)
            androidx.room.RoomDatabase$b r0 = (androidx.room.RoomDatabase.b) r0
            java.util.Objects.requireNonNull(r0)
            int r2 = r2 + 1
            goto L_0x0160
        L_0x0172:
            h0.w.f$a r13 = r11.c
            r13.a(r12)
            goto L_0x0188
        L_0x0178:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "A migration from "
            java.lang.String r1 = " to "
            java.lang.String r2 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            java.lang.String r13 = i0.d.a.a.a.j0(r0, r13, r1, r14, r2)
            r12.<init>(r13)
            throw r12
        L_0x0188:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.w.f.b(h0.y.a.b, int, int):void");
    }

    public final void c(h0.y.a.b bVar) {
        h0.y.a.f.a aVar = (h0.y.a.f.a) bVar;
        aVar.d.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        aVar.d.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + "cf029002fffdcadf079e8d0a1c9a70ac" + "')");
    }
}
