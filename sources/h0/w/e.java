package h0.w;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.room.RoomDatabase;
import com.instabug.library.networkv2.request.RequestMethod;
import h0.y.a.f.f;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: InvalidationTracker */
public class e {
    public static final String[] a = {"UPDATE", RequestMethod.DELETE, "INSERT"};
    public final HashMap<String, Integer> b;
    public final String[] c;
    public Map<String, Set<String>> d;
    public final RoomDatabase e;
    public AtomicBoolean f = new AtomicBoolean(false);
    public volatile boolean g = false;
    public volatile f h;
    public b i;
    @SuppressLint({"RestrictedApi"})
    public final h0.c.a.b.b<c, d> j = new h0.c.a.b.b<>();
    public Runnable k = new a();

    /* compiled from: InvalidationTracker */
    public class a implements Runnable {
        public a() {
        }

        /* JADX INFO: finally extract failed */
        public final Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor j = e.this.e.j(new h0.y.a.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), (CancellationSignal) null);
            while (j.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(j.getInt(0)));
                } catch (Throwable th) {
                    j.close();
                    throw th;
                }
            }
            j.close();
            if (!hashSet.isEmpty()) {
                e.this.h.a();
            }
            return hashSet;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: android.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.util.Set<java.lang.Integer>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.util.Set<java.lang.Integer>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.util.Set<java.lang.Integer>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.util.Set<java.lang.Integer>} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0090  */
        /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r11 = this;
                h0.w.e r0 = h0.w.e.this
                androidx.room.RoomDatabase r0 = r0.e
                java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.h
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
                r1 = 1
                r2 = 0
                r3 = 0
                r0.lock()     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
                h0.w.e r4 = h0.w.e.this     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
                boolean r4 = r4.a()     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
                if (r4 != 0) goto L_0x001c
                r0.unlock()
                return
            L_0x001c:
                h0.w.e r4 = h0.w.e.this     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
                java.util.concurrent.atomic.AtomicBoolean r4 = r4.f     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
                boolean r4 = r4.compareAndSet(r1, r2)     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
                if (r4 != 0) goto L_0x002a
                r0.unlock()
                return
            L_0x002a:
                h0.w.e r4 = h0.w.e.this     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
                androidx.room.RoomDatabase r4 = r4.e     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
                boolean r4 = r4.h()     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
                if (r4 == 0) goto L_0x0038
                r0.unlock()
                return
            L_0x0038:
                h0.w.e r4 = h0.w.e.this     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
                androidx.room.RoomDatabase r4 = r4.e     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
                boolean r5 = r4.f     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
                if (r5 == 0) goto L_0x0072
                h0.y.a.c r4 = r4.c     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
                h0.y.a.b r4 = r4.L()     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
                r5 = r4
                h0.y.a.f.a r5 = (h0.y.a.f.a) r5     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
                android.database.sqlite.SQLiteDatabase r5 = r5.d     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
                r5.beginTransaction()     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
                java.util.Set r5 = r11.a()     // Catch:{ all -> 0x0064 }
                r6 = r4
                h0.y.a.f.a r6 = (h0.y.a.f.a) r6     // Catch:{ all -> 0x0062 }
                android.database.sqlite.SQLiteDatabase r6 = r6.d     // Catch:{ all -> 0x0062 }
                r6.setTransactionSuccessful()     // Catch:{ all -> 0x0062 }
                h0.y.a.f.a r4 = (h0.y.a.f.a) r4     // Catch:{ IllegalStateException -> 0x0070, SQLiteException -> 0x006e }
                android.database.sqlite.SQLiteDatabase r4 = r4.d     // Catch:{ IllegalStateException -> 0x0070, SQLiteException -> 0x006e }
                r4.endTransaction()     // Catch:{ IllegalStateException -> 0x0070, SQLiteException -> 0x006e }
                goto L_0x0085
            L_0x0062:
                r6 = move-exception
                goto L_0x0066
            L_0x0064:
                r6 = move-exception
                r5 = r3
            L_0x0066:
                h0.y.a.f.a r4 = (h0.y.a.f.a) r4     // Catch:{ IllegalStateException -> 0x0070, SQLiteException -> 0x006e }
                android.database.sqlite.SQLiteDatabase r4 = r4.d     // Catch:{ IllegalStateException -> 0x0070, SQLiteException -> 0x006e }
                r4.endTransaction()     // Catch:{ IllegalStateException -> 0x0070, SQLiteException -> 0x006e }
                throw r6     // Catch:{ IllegalStateException -> 0x0070, SQLiteException -> 0x006e }
            L_0x006e:
                r4 = move-exception
                goto L_0x007e
            L_0x0070:
                r4 = move-exception
                goto L_0x007e
            L_0x0072:
                java.util.Set r5 = r11.a()     // Catch:{ IllegalStateException -> 0x007c, SQLiteException -> 0x007a }
                goto L_0x0085
            L_0x0077:
                r1 = move-exception
                goto L_0x00eb
            L_0x007a:
                r4 = move-exception
                goto L_0x007d
            L_0x007c:
                r4 = move-exception
            L_0x007d:
                r5 = r3
            L_0x007e:
                java.lang.String r6 = "ROOM"
                java.lang.String r7 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r6, r7, r4)     // Catch:{ all -> 0x0077 }
            L_0x0085:
                r0.unlock()
                if (r5 == 0) goto L_0x00ea
                boolean r0 = r5.isEmpty()
                if (r0 != 0) goto L_0x00ea
                h0.w.e r0 = h0.w.e.this
                h0.c.a.b.b<h0.w.e$c, h0.w.e$d> r0 = r0.j
                monitor-enter(r0)
                h0.w.e r4 = h0.w.e.this     // Catch:{ all -> 0x00e7 }
                h0.c.a.b.b<h0.w.e$c, h0.w.e$d> r4 = r4.j     // Catch:{ all -> 0x00e7 }
                java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00e7 }
            L_0x009d:
                r6 = r4
                h0.c.a.b.b$e r6 = (h0.c.a.b.b.e) r6     // Catch:{ all -> 0x00e7 }
                boolean r7 = r6.hasNext()     // Catch:{ all -> 0x00e7 }
                if (r7 == 0) goto L_0x00e5
                java.lang.Object r6 = r6.next()     // Catch:{ all -> 0x00e7 }
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ all -> 0x00e7 }
                java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x00e7 }
                h0.w.e$d r6 = (h0.w.e.d) r6     // Catch:{ all -> 0x00e7 }
                int[] r7 = r6.a     // Catch:{ all -> 0x00e7 }
                int r7 = r7.length     // Catch:{ all -> 0x00e7 }
                r8 = r2
                r9 = r3
            L_0x00b7:
                if (r8 >= r7) goto L_0x00dd
                int[] r10 = r6.a     // Catch:{ all -> 0x00e7 }
                r10 = r10[r8]     // Catch:{ all -> 0x00e7 }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x00e7 }
                boolean r10 = r5.contains(r10)     // Catch:{ all -> 0x00e7 }
                if (r10 == 0) goto L_0x00da
                if (r7 != r1) goto L_0x00cc
                java.util.Set<java.lang.String> r9 = r6.d     // Catch:{ all -> 0x00e7 }
                goto L_0x00da
            L_0x00cc:
                if (r9 != 0) goto L_0x00d3
                java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x00e7 }
                r9.<init>(r7)     // Catch:{ all -> 0x00e7 }
            L_0x00d3:
                java.lang.String[] r10 = r6.b     // Catch:{ all -> 0x00e7 }
                r10 = r10[r8]     // Catch:{ all -> 0x00e7 }
                r9.add(r10)     // Catch:{ all -> 0x00e7 }
            L_0x00da:
                int r8 = r8 + 1
                goto L_0x00b7
            L_0x00dd:
                if (r9 == 0) goto L_0x009d
                h0.w.e$c r6 = r6.c     // Catch:{ all -> 0x00e7 }
                r6.a(r9)     // Catch:{ all -> 0x00e7 }
                goto L_0x009d
            L_0x00e5:
                monitor-exit(r0)     // Catch:{ all -> 0x00e7 }
                goto L_0x00ea
            L_0x00e7:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00e7 }
                throw r1
            L_0x00ea:
                return
            L_0x00eb:
                r0.unlock()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: h0.w.e.a.run():void");
        }
    }

    /* compiled from: InvalidationTracker */
    public static class b {
        public final long[] a;
        public final boolean[] b;
        public final int[] c;
        public boolean d;
        public boolean e;

        public b(int i) {
            long[] jArr = new long[i];
            this.a = jArr;
            boolean[] zArr = new boolean[i];
            this.b = zArr;
            this.c = new int[i];
            Arrays.fill(jArr, 0);
            Arrays.fill(zArr, false);
        }

        public int[] a() {
            synchronized (this) {
                if (this.d) {
                    if (!this.e) {
                        int length = this.a.length;
                        int i = 0;
                        while (true) {
                            int i2 = 1;
                            if (i < length) {
                                boolean z = this.a[i] > 0;
                                boolean[] zArr = this.b;
                                if (z != zArr[i]) {
                                    int[] iArr = this.c;
                                    if (!z) {
                                        i2 = 2;
                                    }
                                    iArr[i] = i2;
                                } else {
                                    this.c[i] = 0;
                                }
                                zArr[i] = z;
                                i++;
                            } else {
                                this.e = true;
                                this.d = false;
                                int[] iArr2 = this.c;
                                return iArr2;
                            }
                        }
                    }
                }
                return null;
            }
        }
    }

    /* compiled from: InvalidationTracker */
    public static abstract class c {
        public abstract void a(Set<String> set);
    }

    /* compiled from: InvalidationTracker */
    public static class d {
        public final int[] a;
        public final String[] b;
        public final c c;
        public final Set<String> d;
    }

    public e(RoomDatabase roomDatabase, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.e = roomDatabase;
        this.i = new b(strArr.length);
        this.b = new HashMap<>();
        this.d = map2;
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.c = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr[i2];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.b.put(lowerCase, Integer.valueOf(i2));
            String str2 = map.get(strArr[i2]);
            if (str2 != null) {
                this.c[i2] = str2.toLowerCase(locale);
            } else {
                this.c[i2] = lowerCase;
            }
        }
        for (Map.Entry next : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = ((String) next.getValue()).toLowerCase(locale2);
            if (this.b.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) next.getKey()).toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.b;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    public boolean a() {
        if (!this.e.i()) {
            return false;
        }
        if (!this.g) {
            this.e.c.L();
        }
        if (this.g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(h0.y.a.b bVar, int i2) {
        h0.y.a.f.a aVar = (h0.y.a.f.a) bVar;
        aVar.d.execSQL(i0.d.a.a.a.g0("INSERT OR IGNORE INTO room_table_modification_log VALUES(", i2, ", 0)"));
        String str = this.c[i2];
        StringBuilder sb = new StringBuilder();
        for (String str2 : a) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            i0.d.a.a.a.s(sb, str, "_", str2, "`");
            i0.d.a.a.a.s(sb, " AFTER ", str2, " ON `", str);
            i0.d.a.a.a.s(sb, "` BEGIN UPDATE ", "room_table_modification_log", " SET ", "invalidated");
            i0.d.a.a.a.s(sb, " = 1", " WHERE ", "table_id", " = ");
            sb.append(i2);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            aVar.d.execSQL(sb.toString());
        }
    }

    public final void c(h0.y.a.b bVar, int i2) {
        String str = this.c[i2];
        StringBuilder sb = new StringBuilder();
        for (String append : a) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            sb.append(str);
            sb.append("_");
            sb.append(append);
            sb.append("`");
            ((h0.y.a.f.a) bVar).d.execSQL(sb.toString());
        }
    }

    public void d(h0.y.a.b bVar) {
        if (!((h0.y.a.f.a) bVar).d.inTransaction()) {
            while (true) {
                try {
                    ReentrantReadWriteLock.ReadLock readLock = this.e.h.readLock();
                    readLock.lock();
                    try {
                        int[] a2 = this.i.a();
                        if (a2 == null) {
                            readLock.unlock();
                            return;
                        }
                        int length = a2.length;
                        ((h0.y.a.f.a) bVar).d.beginTransaction();
                        for (int i2 = 0; i2 < length; i2++) {
                            int i3 = a2[i2];
                            if (i3 == 1) {
                                b(bVar, i2);
                            } else if (i3 == 2) {
                                c(bVar, i2);
                            }
                        }
                        ((h0.y.a.f.a) bVar).d.setTransactionSuccessful();
                        ((h0.y.a.f.a) bVar).d.endTransaction();
                        b bVar2 = this.i;
                        synchronized (bVar2) {
                            bVar2.e = false;
                        }
                        readLock.unlock();
                    } catch (Throwable th) {
                        readLock.unlock();
                        throw th;
                    }
                } catch (SQLiteException | IllegalStateException e2) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                    return;
                }
            }
            while (true) {
            }
        }
    }
}
