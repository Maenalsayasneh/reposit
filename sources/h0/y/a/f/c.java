package h0.y.a.f;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.room.RoomDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import h0.w.e;
import h0.w.f;
import h0.y.a.b;
import h0.y.a.c;
import java.io.File;
import java.util.List;
import java.util.Objects;

/* compiled from: FrameworkSQLiteOpenHelper */
public class c implements h0.y.a.c {
    public a Y1;
    public boolean Z1;
    public final Context c;
    public final String d;
    public final c.a q;
    public final boolean x;
    public final Object y = new Object();

    /* compiled from: FrameworkSQLiteOpenHelper */
    public static class a extends SQLiteOpenHelper {
        public final a[] c;
        public final c.a d;
        public boolean q;

        /* renamed from: h0.y.a.f.c$a$a  reason: collision with other inner class name */
        /* compiled from: FrameworkSQLiteOpenHelper */
        public class C0078a implements DatabaseErrorHandler {
            public final /* synthetic */ c.a a;
            public final /* synthetic */ a[] b;

            public C0078a(c.a aVar, a[] aVarArr) {
                this.a = aVar;
                this.b = aVarArr;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0047, code lost:
                r4 = r1.iterator();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x004f, code lost:
                if (r4.hasNext() != false) goto L_0x0051;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
                r0.a((java.lang.String) r4.next().second);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
                r0.a(r4.a());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x0066, code lost:
                throw r2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:6:0x003d, code lost:
                r2 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:0x0045, code lost:
                if (r1 != null) goto L_0x0047;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x003f */
            /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
            /* JADX WARNING: Removed duplicated region for block: B:22:0x0081  */
            /* JADX WARNING: Removed duplicated region for block: B:6:0x003d A[ExcHandler: all (r2v4 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r1 
              PHI: (r1v12 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r1v5 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r1v6 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r1v6 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:4:0x0036, B:7:0x003f, B:8:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:4:0x0036] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onCorruption(android.database.sqlite.SQLiteDatabase r4) {
                /*
                    r3 = this;
                    h0.y.a.c$a r0 = r3.a
                    h0.y.a.f.a[] r1 = r3.b
                    h0.y.a.f.a r4 = h0.y.a.f.c.a.b(r1, r4)
                    java.util.Objects.requireNonNull(r0)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Corruption reported by sqlite on database: "
                    r1.append(r2)
                    java.lang.String r2 = r4.a()
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    java.lang.String r2 = "SupportSQLite"
                    android.util.Log.e(r2, r1)
                    android.database.sqlite.SQLiteDatabase r1 = r4.d
                    boolean r1 = r1.isOpen()
                    if (r1 != 0) goto L_0x0035
                    java.lang.String r4 = r4.a()
                    r0.a(r4)
                    goto L_0x0088
                L_0x0035:
                    r1 = 0
                    android.database.sqlite.SQLiteDatabase r2 = r4.d     // Catch:{ SQLiteException -> 0x003f, all -> 0x003d }
                    java.util.List r1 = r2.getAttachedDbs()     // Catch:{ SQLiteException -> 0x003f, all -> 0x003d }
                    goto L_0x003f
                L_0x003d:
                    r2 = move-exception
                    goto L_0x0045
                L_0x003f:
                    android.database.sqlite.SQLiteDatabase r2 = r4.d     // Catch:{ IOException -> 0x0067, all -> 0x003d }
                    r2.close()     // Catch:{ IOException -> 0x0067, all -> 0x003d }
                    goto L_0x0067
                L_0x0045:
                    if (r1 == 0) goto L_0x005f
                    java.util.Iterator r4 = r1.iterator()
                L_0x004b:
                    boolean r1 = r4.hasNext()
                    if (r1 == 0) goto L_0x0066
                    java.lang.Object r1 = r4.next()
                    android.util.Pair r1 = (android.util.Pair) r1
                    java.lang.Object r1 = r1.second
                    java.lang.String r1 = (java.lang.String) r1
                    r0.a(r1)
                    goto L_0x004b
                L_0x005f:
                    java.lang.String r4 = r4.a()
                    r0.a(r4)
                L_0x0066:
                    throw r2
                L_0x0067:
                    if (r1 == 0) goto L_0x0081
                    java.util.Iterator r4 = r1.iterator()
                L_0x006d:
                    boolean r1 = r4.hasNext()
                    if (r1 == 0) goto L_0x0088
                    java.lang.Object r1 = r4.next()
                    android.util.Pair r1 = (android.util.Pair) r1
                    java.lang.Object r1 = r1.second
                    java.lang.String r1 = (java.lang.String) r1
                    r0.a(r1)
                    goto L_0x006d
                L_0x0081:
                    java.lang.String r4 = r4.a()
                    r0.a(r4)
                L_0x0088:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: h0.y.a.f.c.a.C0078a.onCorruption(android.database.sqlite.SQLiteDatabase):void");
            }
        }

        public a(Context context, String str, a[] aVarArr, c.a aVar) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.a, new C0078a(aVar, aVarArr));
            this.d = aVar;
            this.c = aVarArr;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
            if ((r1.d == r3) == false) goto L_0x000e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static h0.y.a.f.a b(h0.y.a.f.a[] r2, android.database.sqlite.SQLiteDatabase r3) {
            /*
                r0 = 0
                r1 = r2[r0]
                if (r1 == 0) goto L_0x000e
                android.database.sqlite.SQLiteDatabase r1 = r1.d
                if (r1 != r3) goto L_0x000b
                r1 = 1
                goto L_0x000c
            L_0x000b:
                r1 = r0
            L_0x000c:
                if (r1 != 0) goto L_0x0015
            L_0x000e:
                h0.y.a.f.a r1 = new h0.y.a.f.a
                r1.<init>(r3)
                r2[r0] = r1
            L_0x0015:
                r2 = r2[r0]
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: h0.y.a.f.c.a.b(h0.y.a.f.a[], android.database.sqlite.SQLiteDatabase):h0.y.a.f.a");
        }

        public a a(SQLiteDatabase sQLiteDatabase) {
            return b(this.c, sQLiteDatabase);
        }

        public synchronized void close() {
            super.close();
            this.c[0] = null;
        }

        public synchronized b e() {
            this.q = false;
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (this.q) {
                close();
                return e();
            }
            return a(writableDatabase);
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            c.a aVar = this.d;
            b(this.c, sQLiteDatabase);
            Objects.requireNonNull((f) aVar);
        }

        /* JADX INFO: finally extract failed */
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            c.a aVar = this.d;
            a b = b(this.c, sQLiteDatabase);
            f fVar = (f) aVar;
            Objects.requireNonNull(fVar);
            Cursor b2 = b.b(new h0.y.a.a("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"));
            try {
                boolean z = b2.moveToFirst() && b2.getInt(0) == 0;
                b2.close();
                fVar.c.a(b);
                if (!z) {
                    f.b b3 = fVar.c.b(b);
                    if (!b3.a) {
                        StringBuilder P0 = i0.d.a.a.a.P0("Pre-packaged database has an invalid schema: ");
                        P0.append(b3.b);
                        throw new IllegalStateException(P0.toString());
                    }
                }
                fVar.c(b);
                WorkDatabase_Impl.a aVar2 = (WorkDatabase_Impl.a) fVar.c;
                WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
                int i = WorkDatabase_Impl.l;
                List<RoomDatabase.b> list = workDatabase_Impl.g;
                if (list != null) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Objects.requireNonNull(WorkDatabase_Impl.this.g.get(i2));
                    }
                }
            } catch (Throwable th) {
                b2.close();
                throw th;
            }
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.q = true;
            ((f) this.d).b(b(this.c, sQLiteDatabase), i, i2);
        }

        /* JADX INFO: finally extract failed */
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.q) {
                c.a aVar = this.d;
                a b = b(this.c, sQLiteDatabase);
                f fVar = (f) aVar;
                Objects.requireNonNull(fVar);
                Cursor b2 = b.b(new h0.y.a.a("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"));
                try {
                    boolean z = b2.moveToFirst() && b2.getInt(0) != 0;
                    b2.close();
                    if (z) {
                        Cursor b3 = b.b(new h0.y.a.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                        try {
                            String string = b3.moveToFirst() ? b3.getString(0) : null;
                            b3.close();
                            if (!"cf029002fffdcadf079e8d0a1c9a70ac".equals(string) && !"8aff2efc47fafe870c738f727dfcfc6e".equals(string)) {
                                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                            }
                        } catch (Throwable th) {
                            b3.close();
                            throw th;
                        }
                    } else {
                        f.b b4 = fVar.c.b(b);
                        if (b4.a) {
                            Objects.requireNonNull((WorkDatabase_Impl.a) fVar.c);
                            fVar.c(b);
                        } else {
                            StringBuilder P0 = i0.d.a.a.a.P0("Pre-packaged database has an invalid schema: ");
                            P0.append(b4.b);
                            throw new IllegalStateException(P0.toString());
                        }
                    }
                    WorkDatabase_Impl.a aVar2 = (WorkDatabase_Impl.a) fVar.c;
                    WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
                    int i = WorkDatabase_Impl.l;
                    workDatabase_Impl.a = b;
                    b.d.execSQL("PRAGMA foreign_keys = ON");
                    e eVar = WorkDatabase_Impl.this.d;
                    synchronized (eVar) {
                        if (eVar.g) {
                            Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                        } else {
                            b.d.execSQL("PRAGMA temp_store = MEMORY;");
                            b.d.execSQL("PRAGMA recursive_triggers='ON';");
                            b.d.execSQL("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                            eVar.d(b);
                            eVar.h = new f(b.d.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 "));
                            eVar.g = true;
                        }
                    }
                    List<RoomDatabase.b> list = WorkDatabase_Impl.this.g;
                    if (list != null) {
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            WorkDatabase_Impl.this.g.get(i2).a(b);
                        }
                    }
                    fVar.b = null;
                } catch (Throwable th2) {
                    b2.close();
                    throw th2;
                }
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.q = true;
            this.d.b(b(this.c, sQLiteDatabase), i, i2);
        }
    }

    public c(Context context, String str, c.a aVar, boolean z) {
        this.c = context;
        this.d = str;
        this.q = aVar;
        this.x = z;
    }

    public b L() {
        return a().e();
    }

    public final a a() {
        a aVar;
        synchronized (this.y) {
            if (this.Y1 == null) {
                a[] aVarArr = new a[1];
                if (this.d == null || !this.x) {
                    this.Y1 = new a(this.c, this.d, aVarArr, this.q);
                } else {
                    this.Y1 = new a(this.c, new File(this.c.getNoBackupFilesDir(), this.d).getAbsolutePath(), aVarArr, this.q);
                }
                this.Y1.setWriteAheadLoggingEnabled(this.Z1);
            }
            aVar = this.Y1;
        }
        return aVar;
    }

    public void close() {
        a().close();
    }

    public String getDatabaseName() {
        return this.d;
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.y) {
            a aVar = this.Y1;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z);
            }
            this.Z1 = z;
        }
    }
}
