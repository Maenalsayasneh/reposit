package i0.c.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.amplitude.api.CursorWindowAllocationException;
import i0.d.a.a.a;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DatabaseHelper */
public class m extends SQLiteOpenHelper {
    public static final String c = m.class.getName();
    public static final Map<String, m> d = new HashMap();
    public static final k q = k.a;
    public n Y1;
    public File x;
    public boolean y = true;

    public m(Context context, String str) {
        super(context, k(str), (SQLiteDatabase.CursorFactory) null, 3);
        this.x = context.getDatabasePath(k(str));
        r.e(str);
    }

    public static void b(RuntimeException runtimeException) {
        String message = runtimeException.getMessage();
        if (r.d(message) || !message.startsWith("Cursor window allocation of")) {
            throw runtimeException;
        }
        throw new CursorWindowAllocationException(message);
    }

    public static synchronized m i(Context context, String str) {
        m mVar;
        synchronized (m.class) {
            String e = r.e(str);
            Map<String, m> map = d;
            mVar = map.get(e);
            if (mVar == null) {
                mVar = new m(context.getApplicationContext(), e);
                map.put(e, mVar);
            }
        }
        return mVar;
    }

    public static String k(String str) {
        return (r.d(str) || str.equals("$default_instance")) ? "com.amplitude.api" : a.n0("com.amplitude.api_", str);
    }

    public synchronized String C(String str) {
        return (String) E("store", str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v18, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: java.lang.Object} */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0088, code lost:
        if (r14 != null) goto L_0x003b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0056 A[Catch:{ SQLiteException -> 0x0071, StackOverflowError -> 0x0057, IllegalStateException -> 0x004f, RuntimeException -> 0x0049, all -> 0x0047, all -> 0x0090 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0070 A[Catch:{ SQLiteException -> 0x0071, StackOverflowError -> 0x0057, IllegalStateException -> 0x004f, RuntimeException -> 0x0049, all -> 0x0047, all -> 0x0090 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0094 A[SYNTHETIC, Splitter:B:45:0x0094] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Object E(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 0
            r1 = 0
            r2 = 1
            android.database.sqlite.SQLiteDatabase r3 = r12.getReadableDatabase()     // Catch:{ SQLiteException -> 0x0071, StackOverflowError -> 0x0057, IllegalStateException -> 0x004f, RuntimeException -> 0x0049, all -> 0x0047 }
            java.lang.String r4 = "key"
            java.lang.String r5 = "value"
            java.lang.String[] r5 = new java.lang.String[]{r4, r5}     // Catch:{ SQLiteException -> 0x0071, StackOverflowError -> 0x0057, IllegalStateException -> 0x004f, RuntimeException -> 0x0049, all -> 0x0047 }
            java.lang.String r6 = "key = ?"
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0071, StackOverflowError -> 0x0057, IllegalStateException -> 0x004f, RuntimeException -> 0x0049, all -> 0x0047 }
            r7[r1] = r14     // Catch:{ SQLiteException -> 0x0071, StackOverflowError -> 0x0057, IllegalStateException -> 0x004f, RuntimeException -> 0x0049, all -> 0x0047 }
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r4 = r13
            android.database.Cursor r14 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x0071, StackOverflowError -> 0x0057, IllegalStateException -> 0x004f, RuntimeException -> 0x0049, all -> 0x0047 }
            boolean r3 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0045, StackOverflowError -> 0x0043, IllegalStateException -> 0x0041, RuntimeException -> 0x003f }
            if (r3 == 0) goto L_0x003b
            java.lang.String r3 = "store"
            boolean r3 = r13.equals(r3)     // Catch:{ SQLiteException -> 0x0045, StackOverflowError -> 0x0043, IllegalStateException -> 0x0041, RuntimeException -> 0x003f }
            if (r3 == 0) goto L_0x0032
            java.lang.String r13 = r14.getString(r2)     // Catch:{ SQLiteException -> 0x0045, StackOverflowError -> 0x0043, IllegalStateException -> 0x0041, RuntimeException -> 0x003f }
            goto L_0x003a
        L_0x0032:
            long r3 = r14.getLong(r2)     // Catch:{ SQLiteException -> 0x0045, StackOverflowError -> 0x0043, IllegalStateException -> 0x0041, RuntimeException -> 0x003f }
            java.lang.Long r13 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x0045, StackOverflowError -> 0x0043, IllegalStateException -> 0x0041, RuntimeException -> 0x003f }
        L_0x003a:
            r0 = r13
        L_0x003b:
            r14.close()     // Catch:{ all -> 0x009b }
            goto L_0x008b
        L_0x003f:
            r13 = move-exception
            goto L_0x004b
        L_0x0041:
            r13 = move-exception
            goto L_0x0051
        L_0x0043:
            r3 = move-exception
            goto L_0x005a
        L_0x0045:
            r3 = move-exception
            goto L_0x0074
        L_0x0047:
            r13 = move-exception
            goto L_0x0092
        L_0x0049:
            r13 = move-exception
            r14 = r0
        L_0x004b:
            b(r13)     // Catch:{ all -> 0x0090 }
            throw r0     // Catch:{ all -> 0x0090 }
        L_0x004f:
            r13 = move-exception
            r14 = r0
        L_0x0051:
            r12.F(r13)     // Catch:{ all -> 0x0090 }
            if (r14 == 0) goto L_0x008b
            goto L_0x003b
        L_0x0057:
            r14 = move-exception
            r3 = r14
            r14 = r0
        L_0x005a:
            i0.c.a.k r4 = q     // Catch:{ all -> 0x0090 }
            java.lang.String r5 = c     // Catch:{ all -> 0x0090 }
            java.lang.String r6 = "getValue from %s failed"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0090 }
            r2[r1] = r13     // Catch:{ all -> 0x0090 }
            java.lang.String r13 = java.lang.String.format(r6, r2)     // Catch:{ all -> 0x0090 }
            r4.b(r5, r13, r3)     // Catch:{ all -> 0x0090 }
            r12.e()     // Catch:{ all -> 0x0090 }
            if (r14 == 0) goto L_0x008b
            goto L_0x003b
        L_0x0071:
            r14 = move-exception
            r3 = r14
            r14 = r0
        L_0x0074:
            i0.c.a.k r4 = q     // Catch:{ all -> 0x0090 }
            java.lang.String r5 = c     // Catch:{ all -> 0x0090 }
            java.lang.String r6 = "getValue from %s failed"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0090 }
            r2[r1] = r13     // Catch:{ all -> 0x0090 }
            java.lang.String r13 = java.lang.String.format(r6, r2)     // Catch:{ all -> 0x0090 }
            r4.b(r5, r13, r3)     // Catch:{ all -> 0x0090 }
            r12.e()     // Catch:{ all -> 0x0090 }
            if (r14 == 0) goto L_0x008b
            goto L_0x003b
        L_0x008b:
            r12.close()     // Catch:{ all -> 0x009b }
            monitor-exit(r12)
            return r0
        L_0x0090:
            r13 = move-exception
            r0 = r14
        L_0x0092:
            if (r0 == 0) goto L_0x0097
            r0.close()     // Catch:{ all -> 0x009b }
        L_0x0097:
            r12.close()     // Catch:{ all -> 0x009b }
            throw r13     // Catch:{ all -> 0x009b }
        L_0x009b:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.c.a.m.E(java.lang.String, java.lang.String):java.lang.Object");
    }

    public final void F(IllegalStateException illegalStateException) {
        String message = illegalStateException.getMessage();
        if (r.d(message) || !message.contains("Couldn't read") || !message.contains("CursorWindow")) {
            throw illegalStateException;
        }
        e();
    }

    public synchronized long G(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) throws SQLiteException, StackOverflowError {
        return sQLiteDatabase.insert(str, (String) null, contentValues);
    }

    public synchronized long H(String str, Long l) {
        long j;
        if (l == null) {
            j = f("long_store", str);
        } else {
            j = M("long_store", str, l);
        }
        return j;
    }

    public synchronized long I(String str, String str2) {
        long j;
        if (str2 == null) {
            j = f("store", str);
        } else {
            j = M("store", str, str2);
        }
        return j;
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
    public synchronized long J(android.database.sqlite.SQLiteDatabase r3, java.lang.String r4, java.lang.String r5, java.lang.Object r6) throws android.database.sqlite.SQLiteException, java.lang.StackOverflowError {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ all -> 0x003a }
            r0.<init>()     // Catch:{ all -> 0x003a }
            java.lang.String r1 = "key"
            r0.put(r1, r5)     // Catch:{ all -> 0x003a }
            boolean r5 = r6 instanceof java.lang.Long     // Catch:{ all -> 0x003a }
            if (r5 == 0) goto L_0x0017
            java.lang.String r5 = "value"
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x003a }
            r0.put(r5, r6)     // Catch:{ all -> 0x003a }
            goto L_0x001e
        L_0x0017:
            java.lang.String r5 = "value"
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x003a }
            r0.put(r5, r6)     // Catch:{ all -> 0x003a }
        L_0x001e:
            monitor-enter(r2)     // Catch:{ all -> 0x003a }
            r5 = 0
            r6 = 5
            long r3 = r3.insertWithOnConflict(r4, r5, r0, r6)     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)     // Catch:{ all -> 0x003a }
            r5 = -1
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0035
            i0.c.a.k r5 = q     // Catch:{ all -> 0x003a }
            java.lang.String r6 = c     // Catch:{ all -> 0x003a }
            java.lang.String r0 = "Insert failed"
            r5.c(r6, r0)     // Catch:{ all -> 0x003a }
        L_0x0035:
            monitor-exit(r2)
            return r3
        L_0x0037:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003a }
            throw r3     // Catch:{ all -> 0x003a }
        L_0x003a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.c.a.m.J(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.Object):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (r2.isOpen() != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
        if (r2.isOpen() != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized long M(java.lang.String r6, java.lang.String r7, java.lang.Object r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r1 = 1
            r2 = 0
            android.database.sqlite.SQLiteDatabase r2 = r5.getWritableDatabase()     // Catch:{ SQLiteException -> 0x003a, StackOverflowError -> 0x001c }
            long r6 = r5.J(r2, r6, r7, r8)     // Catch:{ SQLiteException -> 0x003a, StackOverflowError -> 0x001c }
            if (r2 == 0) goto L_0x005c
            boolean r8 = r2.isOpen()     // Catch:{ all -> 0x0018 }
            if (r8 == 0) goto L_0x005c
            r5.close()     // Catch:{ all -> 0x0018 }
            goto L_0x005c
        L_0x0018:
            r6 = move-exception
            goto L_0x006a
        L_0x001a:
            r6 = move-exception
            goto L_0x005e
        L_0x001c:
            r7 = move-exception
            i0.c.a.k r8 = q     // Catch:{ all -> 0x001a }
            java.lang.String r3 = c     // Catch:{ all -> 0x001a }
            java.lang.String r4 = "insertOrReplaceKeyValue in %s failed"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x001a }
            r1[r0] = r6     // Catch:{ all -> 0x001a }
            java.lang.String r6 = java.lang.String.format(r4, r1)     // Catch:{ all -> 0x001a }
            r8.b(r3, r6, r7)     // Catch:{ all -> 0x001a }
            r5.e()     // Catch:{ all -> 0x001a }
            if (r2 == 0) goto L_0x005a
            boolean r6 = r2.isOpen()     // Catch:{ all -> 0x0018 }
            if (r6 == 0) goto L_0x005a
            goto L_0x0057
        L_0x003a:
            r7 = move-exception
            i0.c.a.k r8 = q     // Catch:{ all -> 0x001a }
            java.lang.String r3 = c     // Catch:{ all -> 0x001a }
            java.lang.String r4 = "insertOrReplaceKeyValue in %s failed"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x001a }
            r1[r0] = r6     // Catch:{ all -> 0x001a }
            java.lang.String r6 = java.lang.String.format(r4, r1)     // Catch:{ all -> 0x001a }
            r8.b(r3, r6, r7)     // Catch:{ all -> 0x001a }
            r5.e()     // Catch:{ all -> 0x001a }
            if (r2 == 0) goto L_0x005a
            boolean r6 = r2.isOpen()     // Catch:{ all -> 0x0018 }
            if (r6 == 0) goto L_0x005a
        L_0x0057:
            r5.close()     // Catch:{ all -> 0x0018 }
        L_0x005a:
            r6 = -1
        L_0x005c:
            monitor-exit(r5)
            return r6
        L_0x005e:
            if (r2 == 0) goto L_0x0069
            boolean r7 = r2.isOpen()     // Catch:{ all -> 0x0018 }
            if (r7 == 0) goto L_0x0069
            r5.close()     // Catch:{ all -> 0x0018 }
        L_0x0069:
            throw r6     // Catch:{ all -> 0x0018 }
        L_0x006a:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.c.a.m.M(java.lang.String, java.lang.String, java.lang.Object):long");
    }

    public synchronized void N(long j) {
        O("events", j);
    }

    public final synchronized void O(String str, long j) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.delete(str, "id = " + j, (String[]) null);
        } catch (SQLiteException e) {
            q.b(c, String.format("removeEvent from %s failed", new Object[]{str}), e);
            e();
        } catch (StackOverflowError e2) {
            try {
                q.b(c, String.format("removeEvent from %s failed", new Object[]{str}), e2);
                e();
            } catch (Throwable th) {
                close();
                throw th;
            }
        }
        close();
    }

    public final synchronized void Q(String str, long j) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.delete(str, "id <= " + j, (String[]) null);
        } catch (SQLiteException e) {
            q.b(c, String.format("removeEvents from %s failed", new Object[]{str}), e);
            e();
        } catch (StackOverflowError e2) {
            try {
                q.b(c, String.format("removeEvents from %s failed", new Object[]{str}), e2);
                e();
            } catch (Throwable th) {
                close();
                throw th;
            }
        }
        close();
    }

    public synchronized void T(long j) {
        O("identifys", j);
    }

    public synchronized void U(long j) {
        Q("identifys", j);
    }

    public final synchronized long a(String str, String str2) {
        long j;
        long j2 = -1;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("event", str2);
            j = G(writableDatabase, str, contentValues);
            if (j == -1) {
                try {
                    q.c(c, String.format("Insert into %s failed", new Object[]{str}));
                } catch (SQLiteException e) {
                    e = e;
                    j2 = j;
                } catch (StackOverflowError e2) {
                    e = e2;
                    j2 = j;
                    try {
                        q.b(c, String.format("addEvent to %s failed", new Object[]{str}), e);
                        e();
                        j = j2;
                        close();
                        return j;
                    } catch (Throwable th) {
                        close();
                        throw th;
                    }
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            q.b(c, String.format("addEvent to %s failed", new Object[]{str}), e);
            e();
            j = j2;
            close();
            return j;
        } catch (StackOverflowError e4) {
            e = e4;
            q.b(c, String.format("addEvent to %s failed", new Object[]{str}), e);
            e();
            j = j2;
            close();
            return j;
        }
        close();
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00cd, code lost:
        if (r1.isOpen() != false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00cf, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00eb, code lost:
        if (r1.isOpen() != false) goto L_0x00cf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r8 = this;
            java.lang.String r0 = "databaseReset callback failed during delete"
            r1 = 0
            r2 = 0
            r3 = 1
            r8.close()     // Catch:{ SecurityException -> 0x005c }
            java.io.File r4 = r8.x     // Catch:{ SecurityException -> 0x005c }
            r4.delete()     // Catch:{ SecurityException -> 0x005c }
            i0.c.a.n r4 = r8.Y1
            if (r4 == 0) goto L_0x00af
            boolean r4 = r8.y
            if (r4 == 0) goto L_0x00af
            r8.y = r2
            android.database.sqlite.SQLiteDatabase r1 = r8.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0033 }
            i0.c.a.n r4 = r8.Y1     // Catch:{ SQLiteException -> 0x0033 }
            i0.c.a.i r4 = (i0.c.a.i) r4     // Catch:{ SQLiteException -> 0x0033 }
            r4.a(r1)     // Catch:{ SQLiteException -> 0x0033 }
            r8.y = r3
            if (r1 == 0) goto L_0x00af
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L_0x00af
        L_0x002c:
            r8.close()
            goto L_0x00af
        L_0x0031:
            r0 = move-exception
            goto L_0x004c
        L_0x0033:
            r4 = move-exception
            i0.c.a.k r5 = q     // Catch:{ all -> 0x0031 }
            java.lang.String r6 = c     // Catch:{ all -> 0x0031 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0031 }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x0031 }
            r5.b(r6, r0, r4)     // Catch:{ all -> 0x0031 }
            r8.y = r3
            if (r1 == 0) goto L_0x00af
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L_0x00af
            goto L_0x002c
        L_0x004c:
            r8.y = r3
            if (r1 == 0) goto L_0x0059
            boolean r1 = r1.isOpen()
            if (r1 == 0) goto L_0x0059
            r8.close()
        L_0x0059:
            throw r0
        L_0x005a:
            r4 = move-exception
            goto L_0x00b0
        L_0x005c:
            r4 = move-exception
            i0.c.a.k r5 = q     // Catch:{ all -> 0x005a }
            java.lang.String r6 = c     // Catch:{ all -> 0x005a }
            java.lang.String r7 = "delete failed"
            r5.b(r6, r7, r4)     // Catch:{ all -> 0x005a }
            i0.c.a.n r4 = r8.Y1
            if (r4 == 0) goto L_0x00af
            boolean r4 = r8.y
            if (r4 == 0) goto L_0x00af
            r8.y = r2
            android.database.sqlite.SQLiteDatabase r1 = r8.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0088 }
            i0.c.a.n r4 = r8.Y1     // Catch:{ SQLiteException -> 0x0088 }
            i0.c.a.i r4 = (i0.c.a.i) r4     // Catch:{ SQLiteException -> 0x0088 }
            r4.a(r1)     // Catch:{ SQLiteException -> 0x0088 }
            r8.y = r3
            if (r1 == 0) goto L_0x00af
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L_0x00af
            goto L_0x002c
        L_0x0086:
            r0 = move-exception
            goto L_0x00a1
        L_0x0088:
            r4 = move-exception
            i0.c.a.k r5 = q     // Catch:{ all -> 0x0086 }
            java.lang.String r6 = c     // Catch:{ all -> 0x0086 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x0086 }
            r5.b(r6, r0, r4)     // Catch:{ all -> 0x0086 }
            r8.y = r3
            if (r1 == 0) goto L_0x00af
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L_0x00af
            goto L_0x002c
        L_0x00a1:
            r8.y = r3
            if (r1 == 0) goto L_0x00ae
            boolean r1 = r1.isOpen()
            if (r1 == 0) goto L_0x00ae
            r8.close()
        L_0x00ae:
            throw r0
        L_0x00af:
            return
        L_0x00b0:
            i0.c.a.n r5 = r8.Y1
            if (r5 == 0) goto L_0x00fc
            boolean r5 = r8.y
            if (r5 == 0) goto L_0x00fc
            r8.y = r2
            android.database.sqlite.SQLiteDatabase r1 = r8.getWritableDatabase()     // Catch:{ SQLiteException -> 0x00d5 }
            i0.c.a.n r5 = r8.Y1     // Catch:{ SQLiteException -> 0x00d5 }
            i0.c.a.i r5 = (i0.c.a.i) r5     // Catch:{ SQLiteException -> 0x00d5 }
            r5.a(r1)     // Catch:{ SQLiteException -> 0x00d5 }
            r8.y = r3
            if (r1 == 0) goto L_0x00fc
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L_0x00fc
        L_0x00cf:
            r8.close()
            goto L_0x00fc
        L_0x00d3:
            r0 = move-exception
            goto L_0x00ee
        L_0x00d5:
            r5 = move-exception
            i0.c.a.k r6 = q     // Catch:{ all -> 0x00d3 }
            java.lang.String r7 = c     // Catch:{ all -> 0x00d3 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x00d3 }
            r6.b(r7, r0, r5)     // Catch:{ all -> 0x00d3 }
            r8.y = r3
            if (r1 == 0) goto L_0x00fc
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L_0x00fc
            goto L_0x00cf
        L_0x00ee:
            r8.y = r3
            if (r1 == 0) goto L_0x00fb
            boolean r1 = r1.isOpen()
            if (r1 == 0) goto L_0x00fb
            r8.close()
        L_0x00fb:
            throw r0
        L_0x00fc:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.c.a.m.e():void");
    }

    public synchronized long f(String str, String str2) {
        long j;
        try {
            j = (long) getWritableDatabase().delete(str, "key=?", new String[]{str2});
            close();
        } catch (SQLiteException e) {
            q.b(c, String.format("deleteKey from %s failed", new Object[]{str}), e);
            e();
            close();
            j = -1;
            return j;
        } catch (StackOverflowError e2) {
            try {
                q.b(c, String.format("deleteKey from %s failed", new Object[]{str}), e2);
                e();
                close();
                j = -1;
                return j;
            } catch (Throwable th) {
                close();
                throw th;
            }
        }
        return j;
    }

    public synchronized long l() {
        return n("events");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (r2 == null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        if (r2 == null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        r0 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long n(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            r1 = 1
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r7.getReadableDatabase()     // Catch:{ SQLiteException -> 0x0045, StackOverflowError -> 0x002a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0045, StackOverflowError -> 0x002a }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0045, StackOverflowError -> 0x002a }
            java.lang.String r5 = "SELECT COUNT(*) FROM "
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0045, StackOverflowError -> 0x002a }
            r4.append(r8)     // Catch:{ SQLiteException -> 0x0045, StackOverflowError -> 0x002a }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x0045, StackOverflowError -> 0x002a }
            android.database.sqlite.SQLiteStatement r2 = r3.compileStatement(r4)     // Catch:{ SQLiteException -> 0x0045, StackOverflowError -> 0x002a }
            long r0 = r2.simpleQueryForLong()     // Catch:{ SQLiteException -> 0x0045, StackOverflowError -> 0x002a }
            r2.close()     // Catch:{ all -> 0x006d }
            r7.close()     // Catch:{ all -> 0x006d }
            goto L_0x0062
        L_0x0028:
            r8 = move-exception
            goto L_0x0064
        L_0x002a:
            r3 = move-exception
            i0.c.a.k r4 = q     // Catch:{ all -> 0x0028 }
            java.lang.String r5 = c     // Catch:{ all -> 0x0028 }
            java.lang.String r6 = "getNumberRows for %s failed"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0028 }
            r1[r0] = r8     // Catch:{ all -> 0x0028 }
            java.lang.String r8 = java.lang.String.format(r6, r1)     // Catch:{ all -> 0x0028 }
            r4.b(r5, r8, r3)     // Catch:{ all -> 0x0028 }
            r7.e()     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x005d
        L_0x0041:
            r2.close()     // Catch:{ all -> 0x006d }
            goto L_0x005d
        L_0x0045:
            r3 = move-exception
            i0.c.a.k r4 = q     // Catch:{ all -> 0x0028 }
            java.lang.String r5 = c     // Catch:{ all -> 0x0028 }
            java.lang.String r6 = "getNumberRows for %s failed"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0028 }
            r1[r0] = r8     // Catch:{ all -> 0x0028 }
            java.lang.String r8 = java.lang.String.format(r6, r1)     // Catch:{ all -> 0x0028 }
            r4.b(r5, r8, r3)     // Catch:{ all -> 0x0028 }
            r7.e()     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x005d
            goto L_0x0041
        L_0x005d:
            r7.close()     // Catch:{ all -> 0x006d }
            r0 = 0
        L_0x0062:
            monitor-exit(r7)
            return r0
        L_0x0064:
            if (r2 == 0) goto L_0x0069
            r2.close()     // Catch:{ all -> 0x006d }
        L_0x0069:
            r7.close()     // Catch:{ all -> 0x006d }
            throw r8     // Catch:{ all -> 0x006d }
        L_0x006d:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.c.a.m.n(java.lang.String):long");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        a.h(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);", "CREATE TABLE IF NOT EXISTS long_store (key TEXT PRIMARY KEY NOT NULL, value INTEGER);", "CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);", "CREATE TABLE IF NOT EXISTS identifys (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
        n nVar = this.Y1;
        if (nVar != null && this.y) {
            try {
                this.y = false;
                ((i) nVar).a(sQLiteDatabase);
            } catch (SQLiteException e) {
                q.b(c, String.format("databaseReset callback failed during onCreate", new Object[0]), e);
            } catch (Throwable th) {
                this.y = true;
                throw th;
            }
            this.y = true;
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i > i2) {
            q.a(c, "onUpgrade() with invalid oldVersion and newVersion");
            a.h(sQLiteDatabase, "DROP TABLE IF EXISTS store", "DROP TABLE IF EXISTS long_store", "DROP TABLE IF EXISTS events", "DROP TABLE IF EXISTS identifys");
            onCreate(sQLiteDatabase);
        } else if (i2 > 1) {
            if (i == 1) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);");
                if (i2 <= 2) {
                    return;
                }
            } else if (i != 2) {
                if (i != 3) {
                    k kVar = q;
                    String str = c;
                    kVar.a(str, "onUpgrade() with unknown oldVersion " + i);
                    a.h(sQLiteDatabase, "DROP TABLE IF EXISTS store", "DROP TABLE IF EXISTS long_store", "DROP TABLE IF EXISTS events", "DROP TABLE IF EXISTS identifys");
                    onCreate(sQLiteDatabase);
                    return;
                }
                return;
            }
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS identifys (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS long_store (key TEXT PRIMARY KEY NOT NULL, value INTEGER);");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a6, code lost:
        if (r14 != null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d9, code lost:
        if (r14 != null) goto L_0x00a8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c3 A[Catch:{ SQLiteException -> 0x00c4, StackOverflowError -> 0x00ac, IllegalStateException -> 0x00a2, RuntimeException -> 0x009a, all -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e4 A[SYNTHETIC, Splitter:B:58:0x00e4] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:39:0x00a3=Splitter:B:39:0x00a3, B:45:0x00ad=Splitter:B:45:0x00ad} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<org.json.JSONObject> q(java.lang.String r20, long r21, long r23) throws org.json.JSONException {
        /*
            r19 = this;
            r1 = r19
            r2 = r21
            r4 = r23
            monitor-enter(r19)
            java.util.LinkedList r11 = new java.util.LinkedList     // Catch:{ all -> 0x00eb }
            r11.<init>()     // Catch:{ all -> 0x00eb }
            r12 = 0
            r13 = 1
            r14 = 0
            android.database.sqlite.SQLiteDatabase r0 = r19.getReadableDatabase()     // Catch:{ SQLiteException -> 0x00c4, StackOverflowError -> 0x00ac, IllegalStateException -> 0x00a2, RuntimeException -> 0x009a }
            java.lang.String r6 = "id"
            java.lang.String r7 = "event"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7}     // Catch:{ SQLiteException -> 0x00c4, StackOverflowError -> 0x00ac, IllegalStateException -> 0x00a2, RuntimeException -> 0x009a }
            r7 = 0
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x0034
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00c4, StackOverflowError -> 0x00ac, IllegalStateException -> 0x00a2, RuntimeException -> 0x009a }
            r9.<init>()     // Catch:{ SQLiteException -> 0x00c4, StackOverflowError -> 0x00ac, IllegalStateException -> 0x00a2, RuntimeException -> 0x009a }
            java.lang.String r10 = "id <= "
            r9.append(r10)     // Catch:{ SQLiteException -> 0x00c4, StackOverflowError -> 0x00ac, IllegalStateException -> 0x00a2, RuntimeException -> 0x009a }
            r9.append(r2)     // Catch:{ SQLiteException -> 0x00c4, StackOverflowError -> 0x00ac, IllegalStateException -> 0x00a2, RuntimeException -> 0x009a }
            java.lang.String r2 = r9.toString()     // Catch:{ SQLiteException -> 0x00c4, StackOverflowError -> 0x00ac, IllegalStateException -> 0x00a2, RuntimeException -> 0x009a }
            r9 = r2
            goto L_0x0035
        L_0x0034:
            r9 = r14
        L_0x0035:
            r10 = 0
            r15 = 0
            r16 = 0
            java.lang.String r17 = "id ASC"
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0053
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00c4, StackOverflowError -> 0x00ac, IllegalStateException -> 0x00a2, RuntimeException -> 0x009a }
            r2.<init>()     // Catch:{ SQLiteException -> 0x00c4, StackOverflowError -> 0x00ac, IllegalStateException -> 0x00a2, RuntimeException -> 0x009a }
            java.lang.String r3 = ""
            r2.append(r3)     // Catch:{ SQLiteException -> 0x00c4, StackOverflowError -> 0x00ac, IllegalStateException -> 0x00a2, RuntimeException -> 0x009a }
            r2.append(r4)     // Catch:{ SQLiteException -> 0x00c4, StackOverflowError -> 0x00ac, IllegalStateException -> 0x00a2, RuntimeException -> 0x009a }
            java.lang.String r2 = r2.toString()     // Catch:{ SQLiteException -> 0x00c4, StackOverflowError -> 0x00ac, IllegalStateException -> 0x00a2, RuntimeException -> 0x009a }
            r18 = r2
            goto L_0x0055
        L_0x0053:
            r18 = r14
        L_0x0055:
            r2 = r0
            r3 = r20
            r4 = r6
            r5 = r9
            r6 = r10
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x00c4, StackOverflowError -> 0x00ac, IllegalStateException -> 0x00a2, RuntimeException -> 0x009a }
        L_0x0066:
            boolean r0 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0095, StackOverflowError -> 0x0092, IllegalStateException -> 0x008f, RuntimeException -> 0x008d }
            if (r0 == 0) goto L_0x0089
            long r3 = r2.getLong(r12)     // Catch:{ SQLiteException -> 0x0095, StackOverflowError -> 0x0092, IllegalStateException -> 0x008f, RuntimeException -> 0x008d }
            java.lang.String r0 = r2.getString(r13)     // Catch:{ SQLiteException -> 0x0095, StackOverflowError -> 0x0092, IllegalStateException -> 0x008f, RuntimeException -> 0x008d }
            boolean r5 = i0.c.a.r.d(r0)     // Catch:{ SQLiteException -> 0x0095, StackOverflowError -> 0x0092, IllegalStateException -> 0x008f, RuntimeException -> 0x008d }
            if (r5 == 0) goto L_0x007b
            goto L_0x0066
        L_0x007b:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ SQLiteException -> 0x0095, StackOverflowError -> 0x0092, IllegalStateException -> 0x008f, RuntimeException -> 0x008d }
            r5.<init>((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x0095, StackOverflowError -> 0x0092, IllegalStateException -> 0x008f, RuntimeException -> 0x008d }
            java.lang.String r0 = "event_id"
            r5.put((java.lang.String) r0, (long) r3)     // Catch:{ SQLiteException -> 0x0095, StackOverflowError -> 0x0092, IllegalStateException -> 0x008f, RuntimeException -> 0x008d }
            r11.add(r5)     // Catch:{ SQLiteException -> 0x0095, StackOverflowError -> 0x0092, IllegalStateException -> 0x008f, RuntimeException -> 0x008d }
            goto L_0x0066
        L_0x0089:
            r2.close()     // Catch:{ all -> 0x00eb }
            goto L_0x00dc
        L_0x008d:
            r0 = move-exception
            goto L_0x009c
        L_0x008f:
            r0 = move-exception
            r14 = r2
            goto L_0x00a3
        L_0x0092:
            r0 = move-exception
            r14 = r2
            goto L_0x00ad
        L_0x0095:
            r0 = move-exception
            r14 = r2
            goto L_0x00c5
        L_0x0098:
            r0 = move-exception
            goto L_0x00e1
        L_0x009a:
            r0 = move-exception
            r2 = r14
        L_0x009c:
            b(r0)     // Catch:{ all -> 0x00a0 }
            throw r14     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            goto L_0x00e2
        L_0x00a2:
            r0 = move-exception
        L_0x00a3:
            r1.F(r0)     // Catch:{ all -> 0x0098 }
            if (r14 == 0) goto L_0x00dc
        L_0x00a8:
            r14.close()     // Catch:{ all -> 0x00eb }
            goto L_0x00dc
        L_0x00ac:
            r0 = move-exception
        L_0x00ad:
            i0.c.a.k r2 = q     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = c     // Catch:{ all -> 0x0098 }
            java.lang.String r4 = "getEvents from %s failed"
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ all -> 0x0098 }
            r5[r12] = r20     // Catch:{ all -> 0x0098 }
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch:{ all -> 0x0098 }
            r2.b(r3, r4, r0)     // Catch:{ all -> 0x0098 }
            r19.e()     // Catch:{ all -> 0x0098 }
            if (r14 == 0) goto L_0x00dc
            goto L_0x00a8
        L_0x00c4:
            r0 = move-exception
        L_0x00c5:
            i0.c.a.k r2 = q     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = c     // Catch:{ all -> 0x0098 }
            java.lang.String r4 = "getEvents from %s failed"
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ all -> 0x0098 }
            r5[r12] = r20     // Catch:{ all -> 0x0098 }
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch:{ all -> 0x0098 }
            r2.b(r3, r4, r0)     // Catch:{ all -> 0x0098 }
            r19.e()     // Catch:{ all -> 0x0098 }
            if (r14 == 0) goto L_0x00dc
            goto L_0x00a8
        L_0x00dc:
            r19.close()     // Catch:{ all -> 0x00eb }
            monitor-exit(r19)
            return r11
        L_0x00e1:
            r2 = r14
        L_0x00e2:
            if (r2 == 0) goto L_0x00e7
            r2.close()     // Catch:{ all -> 0x00eb }
        L_0x00e7:
            r19.close()     // Catch:{ all -> 0x00eb }
            throw r0     // Catch:{ all -> 0x00eb }
        L_0x00eb:
            r0 = move-exception
            monitor-exit(r19)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.c.a.m.q(java.lang.String, long, long):java.util.List");
    }

    public synchronized Long v(String str) {
        return (Long) E("long_store", str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        if (r4 != null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0076, code lost:
        if (r4 == null) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long w(java.lang.String r10, long r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            r1 = 1
            r2 = -1
            r4 = 0
            android.database.sqlite.SQLiteDatabase r5 = r9.getReadableDatabase()     // Catch:{ SQLiteException -> 0x0061, StackOverflowError -> 0x0049 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0061, StackOverflowError -> 0x0049 }
            r6.<init>()     // Catch:{ SQLiteException -> 0x0061, StackOverflowError -> 0x0049 }
            java.lang.String r7 = "SELECT id FROM "
            r6.append(r7)     // Catch:{ SQLiteException -> 0x0061, StackOverflowError -> 0x0049 }
            r6.append(r10)     // Catch:{ SQLiteException -> 0x0061, StackOverflowError -> 0x0049 }
            java.lang.String r7 = " LIMIT 1 OFFSET "
            r6.append(r7)     // Catch:{ SQLiteException -> 0x0061, StackOverflowError -> 0x0049 }
            r7 = 1
            long r11 = r11 - r7
            r6.append(r11)     // Catch:{ SQLiteException -> 0x0061, StackOverflowError -> 0x0049 }
            java.lang.String r11 = r6.toString()     // Catch:{ SQLiteException -> 0x0061, StackOverflowError -> 0x0049 }
            android.database.sqlite.SQLiteStatement r4 = r5.compileStatement(r11)     // Catch:{ SQLiteException -> 0x0061, StackOverflowError -> 0x0049 }
            long r10 = r4.simpleQueryForLong()     // Catch:{ SQLiteDoneException -> 0x0030 }
            r2 = r10
            goto L_0x0041
        L_0x0030:
            r11 = move-exception
            i0.c.a.k r12 = q     // Catch:{ SQLiteException -> 0x0061, StackOverflowError -> 0x0049 }
            java.lang.String r5 = c     // Catch:{ SQLiteException -> 0x0061, StackOverflowError -> 0x0049 }
            boolean r6 = r12.b     // Catch:{ SQLiteException -> 0x0061, StackOverflowError -> 0x0049 }
            if (r6 == 0) goto L_0x0041
            int r12 = r12.c     // Catch:{ SQLiteException -> 0x0061, StackOverflowError -> 0x0049 }
            r6 = 5
            if (r12 > r6) goto L_0x0041
            android.util.Log.w(r5, r11)     // Catch:{ SQLiteException -> 0x0061, StackOverflowError -> 0x0049 }
        L_0x0041:
            if (r4 == 0) goto L_0x0079
        L_0x0043:
            r4.close()     // Catch:{ all -> 0x0087 }
            goto L_0x0079
        L_0x0047:
            r10 = move-exception
            goto L_0x007e
        L_0x0049:
            r11 = move-exception
            i0.c.a.k r12 = q     // Catch:{ all -> 0x0047 }
            java.lang.String r5 = c     // Catch:{ all -> 0x0047 }
            java.lang.String r6 = "getNthEventId from %s failed"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0047 }
            r1[r0] = r10     // Catch:{ all -> 0x0047 }
            java.lang.String r10 = java.lang.String.format(r6, r1)     // Catch:{ all -> 0x0047 }
            r12.b(r5, r10, r11)     // Catch:{ all -> 0x0047 }
            r9.e()     // Catch:{ all -> 0x0047 }
            if (r4 == 0) goto L_0x0079
            goto L_0x0043
        L_0x0061:
            r11 = move-exception
            i0.c.a.k r12 = q     // Catch:{ all -> 0x0047 }
            java.lang.String r5 = c     // Catch:{ all -> 0x0047 }
            java.lang.String r6 = "getNthEventId from %s failed"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0047 }
            r1[r0] = r10     // Catch:{ all -> 0x0047 }
            java.lang.String r10 = java.lang.String.format(r6, r1)     // Catch:{ all -> 0x0047 }
            r12.b(r5, r10, r11)     // Catch:{ all -> 0x0047 }
            r9.e()     // Catch:{ all -> 0x0047 }
            if (r4 == 0) goto L_0x0079
            goto L_0x0043
        L_0x0079:
            r9.close()     // Catch:{ all -> 0x0087 }
            monitor-exit(r9)
            return r2
        L_0x007e:
            if (r4 == 0) goto L_0x0083
            r4.close()     // Catch:{ all -> 0x0087 }
        L_0x0083:
            r9.close()     // Catch:{ all -> 0x0087 }
            throw r10     // Catch:{ all -> 0x0087 }
        L_0x0087:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.c.a.m.w(java.lang.String, long):long");
    }

    public synchronized long y(long j) {
        return w("identifys", j);
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
    public synchronized long z() {
        /*
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.l()     // Catch:{ all -> 0x0013 }
            monitor-enter(r4)     // Catch:{ all -> 0x0013 }
            java.lang.String r2 = "identifys"
            long r2 = r4.n(r2)     // Catch:{ all -> 0x0010 }
            monitor-exit(r4)     // Catch:{ all -> 0x0013 }
            long r0 = r0 + r2
            monitor-exit(r4)
            return r0
        L_0x0010:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0013 }
            throw r0     // Catch:{ all -> 0x0013 }
        L_0x0013:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.c.a.m.z():long");
    }
}
