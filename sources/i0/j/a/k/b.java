package i0.j.a.k;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.util.Log;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.networkv2.request.Request;
import i0.j.a.d.a.d.e;
import i0.j.a.d.a.d.f;
import i0.j.a.h.d.c;
import i0.j.a.h.d.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: APMSyncManagerImpl */
public class b implements a {
    public i0.j.a.n.a.a a = i0.j.a.g.a.i();
    public i0.j.a.e.b b = i0.j.a.g.a.g();
    public c c = i0.j.a.g.a.a();
    public f d = i0.j.a.g.a.b();
    public i0.j.a.h.a.a e = i0.j.a.g.a.k();
    public i0.j.a.h.c.a f = new i0.j.a.h.c.c();
    public i0.j.a.h.b.a g = i0.j.a.g.a.r();
    public i0.j.a.d.a.e.a h = i0.j.a.g.a.d();
    public i0.j.a.j.a.a i;
    public boolean j = false;
    public Request.Callbacks<RequestResponse, Throwable> k = new a();

    /* compiled from: APMSyncManagerImpl */
    public class a implements Request.Callbacks<RequestResponse, Throwable> {
        public a() {
        }

        public void onFailed(Throwable th) {
            if (th != null) {
                b.this.a.d(th.getMessage());
            }
        }

        public void onSucceeded(Object obj) {
            RequestResponse requestResponse = (RequestResponse) obj;
            if (requestResponse.getResponseCode() < 400) {
                SQLiteDatabaseWrapper openDatabase = ((e) ((d) b.this.c).b).a.openDatabase();
                openDatabase.delete(InstabugDbContract.APMSessionEntry.TABLE_NAME, "sync_status = ?", new String[]{String.valueOf(0)});
                openDatabase.close();
                b.this.e();
            } else if (requestResponse.getResponseCode() == 429 && b.this.a.c(1)) {
                Log.e("Instabug - APM", "You’ve reached the maximum number of requests in Debug Mode. You can read more about our rate limiting policy at this link: https://docs.instabug.com/docs/android-apm-sdk-debugging");
            }
        }
    }

    public b() {
        i0.j.a.j.a.a aVar;
        synchronized (i0.j.a.g.a.class) {
            WeakReference<i0.j.a.j.a.a> weakReference = i0.j.a.g.a.m;
            if (weakReference == null || weakReference.get() == null) {
                i0.j.a.g.a.m = new WeakReference<>(new i0.j.a.j.a.b());
            }
            aVar = (i0.j.a.j.a.a) i0.j.a.g.a.m.get();
        }
        this.i = aVar;
    }

    public final void a(i0.j.a.d.b.d dVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList<i0.j.a.d.b.c> arrayList3;
        h0.f.a aVar;
        i0.j.a.d.b.d dVar2 = dVar;
        if (dVar2 != null) {
            String str = dVar2.a;
            f fVar = this.d;
            if (fVar != null) {
                dVar2.n = fVar.f(str);
            }
            i0.j.a.d.a.a.b bVar = (i0.j.a.d.a.a.b) this.e.a;
            DatabaseManager databaseManager = bVar.a;
            ArrayList arrayList4 = null;
            if (databaseManager != null) {
                SQLiteDatabaseWrapper openDatabase = databaseManager.openDatabase();
                Cursor query = openDatabase.query(InstabugDbContract.AppLaunchEntry.TABLE_NAME, (String[]) null, "session_id = ?", new String[]{str}, (String) null, (String) null, (String) null);
                arrayList = new ArrayList();
                if (query != null) {
                    while (query.moveToNext()) {
                        i0.j.a.d.b.b bVar2 = new i0.j.a.d.b.b();
                        bVar2.a = query.getLong(query.getColumnIndex("app_launch_id"));
                        bVar2.b = query.getString(query.getColumnIndex("name"));
                        bVar2.c = query.getString(query.getColumnIndex(InstabugDbContract.AppLaunchEntry.COLUMN_SCREEN_NAME));
                        bVar2.d = query.getLong(query.getColumnIndex("start_time"));
                        bVar2.e = query.getLong(query.getColumnIndex("duration"));
                        long j2 = bVar2.a;
                        if (bVar.a != null) {
                            aVar = new h0.f.a();
                            Cursor rawQuery = openDatabase.rawQuery("select * from app_launch_attributes where app_launch_id = " + j2, (String[]) null);
                            if (rawQuery != null) {
                                while (rawQuery.moveToNext()) {
                                    aVar.put(rawQuery.getString(rawQuery.getColumnIndex("attribute_key")), rawQuery.getString(rawQuery.getColumnIndex("attribute_value")));
                                }
                                rawQuery.close();
                            }
                        } else {
                            aVar = null;
                        }
                        bVar2.f = aVar;
                        arrayList.add(bVar2);
                    }
                    query.close();
                }
                openDatabase.close();
            } else {
                arrayList = null;
            }
            dVar2.j = arrayList;
            i0.j.a.d.a.c.d dVar3 = (i0.j.a.d.a.c.d) ((i0.j.a.h.c.c) this.f).a;
            if (dVar3.a != null) {
                arrayList2 = new ArrayList();
                SQLiteDatabaseWrapper openDatabase2 = dVar3.a.openDatabase();
                Cursor query2 = openDatabase2.query(InstabugDbContract.APMNetworkLogEntry.TABLE_NAME, (String[]) null, "session_id = ? AND duration > ?", new String[]{str, "0"}, (String) null, (String) null, (String) null);
                if (query2 != null) {
                    while (query2.moveToNext()) {
                        i0.j.a.d.b.a aVar2 = new i0.j.a.d.b.a();
                        query2.getInt(query2.getColumnIndex("log_id"));
                        aVar2.c = query2.getString(query2.getColumnIndex("method"));
                        aVar2.n = query2.getString(query2.getColumnIndex("carrier"));
                        aVar2.j = query2.getString(query2.getColumnIndex("error_message"));
                        aVar2.m = query2.getString(query2.getColumnIndex("radio"));
                        aVar2.k = (long) query2.getInt(query2.getColumnIndex("request_body_size"));
                        aVar2.f = query2.getString(query2.getColumnIndex("request_content_type"));
                        aVar2.d = query2.getString(query2.getColumnIndex("request_headers"));
                        aVar2.l = (long) query2.getInt(query2.getColumnIndex("response_body_size"));
                        aVar2.i = query2.getInt(query2.getColumnIndex("response_code"));
                        aVar2.g = query2.getString(query2.getColumnIndex("response_content_type"));
                        aVar2.e = query2.getString(query2.getColumnIndex("response_headers"));
                        aVar2.a = Long.valueOf(query2.getLong(query2.getColumnIndex("start_time")));
                        aVar2.h = (long) query2.getInt(query2.getColumnIndex("duration"));
                        aVar2.b = query2.getString(query2.getColumnIndex("url"));
                        aVar2.o = query2.getInt(query2.getColumnIndex("executed_on_background")) == 1;
                        arrayList2.add(aVar2);
                    }
                    query2.close();
                }
                openDatabase2.close();
            } else {
                arrayList2 = null;
            }
            dVar2.m = arrayList2;
            i0.j.a.d.a.b.d dVar4 = (i0.j.a.d.a.b.d) ((i0.j.a.h.b.c) this.g).a;
            DatabaseManager databaseManager2 = dVar4.b;
            if (databaseManager2 != null) {
                SQLiteDatabaseWrapper openDatabase3 = databaseManager2.openDatabase();
                arrayList3 = dVar4.b(openDatabase3, openDatabase3.query(InstabugDbContract.ExecutionTracesEntry.TABLE_NAME, (String[]) null, "session_id = ? AND duration > ?", new String[]{str, "0"}, (String) null, (String) null, (String) null));
                openDatabase3.close();
            } else {
                arrayList3 = null;
            }
            dVar2.k = arrayList3;
            i0.j.a.d.a.e.b bVar3 = (i0.j.a.d.a.e.b) this.h;
            if (bVar3.a != null) {
                arrayList4 = new ArrayList();
                SQLiteDatabaseWrapper openDatabase4 = bVar3.a.openDatabase();
                Cursor query3 = openDatabase4.query(InstabugDbContract.APMUiTraceEntry.TABLE_NAME, (String[]) null, "session_id = ?", new String[]{str}, (String) null, (String) null, (String) null);
                if (query3 != null) {
                    while (query3.moveToNext()) {
                        i0.j.a.d.b.f fVar2 = new i0.j.a.d.b.f();
                        fVar2.b = query3.getString(query3.getColumnIndex(InstabugDbContract.APMUiTraceEntry.COLUMN_NAME));
                        fVar2.h = query3.getString(query3.getColumnIndex(InstabugDbContract.APMUiTraceEntry.COLUMN_SCREEN_TITLE));
                        fVar2.c = (long) query3.getInt(query3.getColumnIndex("duration"));
                        fVar2.e = (long) query3.getInt(query3.getColumnIndex(InstabugDbContract.APMUiTraceEntry.COLUMN_SMALL_DROPS_DURATION));
                        fVar2.d = (long) query3.getInt(query3.getColumnIndex(InstabugDbContract.APMUiTraceEntry.COLUMN_LARGE_DROPS_DURATION));
                        fVar2.i = query3.getInt(query3.getColumnIndex(InstabugDbContract.APMUiTraceEntry.COLUMN_BATTERY_LEVEL));
                        fVar2.j = Boolean.valueOf(query3.getInt(query3.getColumnIndex(InstabugDbContract.APMUiTraceEntry.COLUMN_POWER_SAVE_MODE)) == 1);
                        fVar2.g = query3.getInt(query3.getColumnIndex(InstabugDbContract.APMUiTraceEntry.COLUMN_REFRESH_RATE));
                        fVar2.f = query3.getLong(query3.getColumnIndex("start_time"));
                        fVar2.k = query3.getString(query3.getColumnIndex(InstabugDbContract.APMUiTraceEntry.COLUMN_CONTAINER_NAME));
                        fVar2.l = query3.getString(query3.getColumnIndex(InstabugDbContract.APMUiTraceEntry.COLUMN_MODULE_NAME));
                        fVar2.m = query3.getString(query3.getColumnIndex("orientation"));
                        fVar2.a = query3.getInt(query3.getColumnIndex(InstabugDbContract.APMUiTraceEntry.COLUMN_USER_DEFINED)) == 1;
                        arrayList4.add(fVar2);
                    }
                    query3.close();
                }
                openDatabase4.close();
            }
            dVar2.l = arrayList4;
        }
    }

    public final void b(List<i0.j.a.d.b.d> list) {
        if (!list.isEmpty()) {
            this.j = true;
            ArrayList arrayList = new ArrayList();
            for (i0.j.a.d.b.d dVar : list) {
                arrayList.add(dVar.a);
            }
            SQLiteDatabaseWrapper openDatabase = ((e) ((d) this.c).b).a.openDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("sync_status", 0);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                openDatabase.update(InstabugDbContract.APMSessionEntry.TABLE_NAME, contentValues, "session_id in (?)", new String[]{(String) it.next()});
            }
            openDatabase.close();
            this.i.a(list, this.k);
        } else if (this.j) {
            i0.j.a.e.b bVar = this.b;
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences.Editor editor = ((i0.j.a.e.c) bVar).b;
            if (editor != null) {
                editor.putLong("LAST_SYNC_TIME", currentTimeMillis).apply();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        if ((r3 >= r5 * 1000) == false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c() {
        /*
            r9 = this;
            i0.j.a.e.b r0 = r9.b
            i0.j.a.e.c r0 = (i0.j.a.e.c) r0
            boolean r0 = r0.a()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003d
            long r3 = java.lang.System.currentTimeMillis()
            i0.j.a.e.b r0 = r9.b
            i0.j.a.e.c r0 = (i0.j.a.e.c) r0
            android.content.SharedPreferences r0 = r0.a
            r5 = 0
            if (r0 == 0) goto L_0x0020
            java.lang.String r7 = "LAST_SYNC_TIME"
            long r5 = r0.getLong(r7, r5)
        L_0x0020:
            long r3 = r3 - r5
            i0.j.a.e.b r0 = r9.b
            i0.j.a.e.c r0 = (i0.j.a.e.c) r0
            android.content.SharedPreferences r0 = r0.a
            r5 = 21600(0x5460, double:1.0672E-319)
            if (r0 == 0) goto L_0x0031
            java.lang.String r7 = "SYNC_INTERVAL"
            long r5 = r0.getLong(r7, r5)
        L_0x0031:
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x003a
            r0 = r2
            goto L_0x003b
        L_0x003a:
            r0 = r1
        L_0x003b:
            if (r0 != 0) goto L_0x0068
        L_0x003d:
            i0.j.a.e.b r0 = r9.b
            i0.j.a.e.c r0 = (i0.j.a.e.c) r0
            android.content.SharedPreferences r3 = r0.a
            if (r3 == 0) goto L_0x0055
            java.lang.String r4 = "DEBUG_MODE_ENABLED"
            boolean r3 = r3.getBoolean(r4, r1)
            if (r3 == 0) goto L_0x0055
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0055
            r0 = r2
            goto L_0x0056
        L_0x0055:
            r0 = r1
        L_0x0056:
            if (r0 == 0) goto L_0x0065
            i0.j.a.m.a.a r0 = new i0.j.a.m.a.a
            r0.<init>()
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0065
            r0 = r2
            goto L_0x0066
        L_0x0065:
            r0 = r1
        L_0x0066:
            if (r0 == 0) goto L_0x0069
        L_0x0068:
            r1 = r2
        L_0x0069:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.a.k.b.c():boolean");
    }

    public void d() {
        e eVar = (e) ((d) this.c).b;
        Objects.requireNonNull(eVar);
        ArrayList arrayList = new ArrayList();
        SQLiteDatabaseWrapper openDatabase = eVar.a.openDatabase();
        Cursor query = openDatabase.query(InstabugDbContract.APMSessionEntry.TABLE_NAME, (String[]) null, "sync_status = ?", new String[]{String.valueOf(0)}, (String) null, (String) null, (String) null);
        if (query != null) {
            if (query.moveToFirst()) {
                do {
                    arrayList.add(eVar.a(query));
                } while (query.moveToNext());
            }
            query.close();
        }
        openDatabase.close();
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a((i0.j.a.d.b.d) it.next());
            }
            b(arrayList);
            return;
        }
        e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d7 A[EDGE_INSN: B:49:0x00d7->B:47:0x00d7 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r21 = this;
            r0 = r21
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            java.lang.String r3 = "-1"
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
        L_0x000e:
            i0.j.a.h.d.c r8 = r0.c
            i0.j.a.h.d.d r8 = (i0.j.a.h.d.d) r8
            i0.j.a.d.a.d.a r8 = r8.b
            i0.j.a.d.a.d.e r8 = (i0.j.a.d.a.d.e) r8
            com.instabug.library.internal.storage.cache.db.DatabaseManager r9 = r8.a
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r9 = r9.openDatabase()
            r15 = 1
            java.lang.String[] r14 = new java.lang.String[r15]
            r14[r2] = r3
            r12 = 0
            r16 = 0
            r17 = 0
            java.lang.String r11 = "apm_session_table"
            java.lang.String r13 = "session_id > ? and (session_id not in (select MAX(session_id) from apm_session_table) or (session_id in(select MAX(session_id) from apm_session_table) and (duration not null)))"
            java.lang.String r18 = "session_id ASC"
            java.lang.String r19 = "1"
            r10 = r9
            r20 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17, r18)
            r11 = 0
            if (r10 == 0) goto L_0x004e
            boolean r12 = r10.moveToFirst()
            if (r12 == 0) goto L_0x004b
            i0.j.a.d.b.d r8 = r8.a(r10)
            r11 = r8
        L_0x004b:
            r10.close()
        L_0x004e:
            r9.close()
            if (r11 == 0) goto L_0x0056
            r0.a(r11)
        L_0x0056:
            if (r11 == 0) goto L_0x00d5
            java.util.List<i0.j.a.d.b.b> r3 = r11.j
            if (r3 == 0) goto L_0x0061
            int r3 = r3.size()
            goto L_0x0062
        L_0x0061:
            r3 = r2
        L_0x0062:
            int r4 = r4 + r3
            java.util.List<i0.j.a.d.b.a> r3 = r11.m
            if (r3 == 0) goto L_0x006c
            int r3 = r3.size()
            goto L_0x006d
        L_0x006c:
            r3 = r2
        L_0x006d:
            int r5 = r5 + r3
            java.util.List<i0.j.a.d.b.f> r3 = r11.l
            if (r3 == 0) goto L_0x0077
            int r3 = r3.size()
            goto L_0x0078
        L_0x0077:
            r3 = r2
        L_0x0078:
            int r6 = r6 + r3
            java.util.List<i0.j.a.d.b.c> r3 = r11.k
            if (r3 == 0) goto L_0x0082
            int r3 = r3.size()
            goto L_0x0083
        L_0x0082:
            r3 = r2
        L_0x0083:
            int r7 = r7 + r3
            long r8 = (long) r4
            i0.j.a.e.b r3 = r0.b
            i0.j.a.e.c r3 = (i0.j.a.e.c) r3
            android.content.SharedPreferences r3 = r3.a
            r12 = 500(0x1f4, double:2.47E-321)
            if (r3 == 0) goto L_0x0096
            java.lang.String r10 = "LAUNCHES_PER_REQUEST_LIMIT"
            long r14 = r3.getLong(r10, r12)
            goto L_0x0097
        L_0x0096:
            r14 = r12
        L_0x0097:
            int r3 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r3 > 0) goto L_0x00cb
            long r8 = (long) r5
            i0.j.a.e.b r3 = r0.b
            i0.j.a.e.c r3 = (i0.j.a.e.c) r3
            long r14 = r3.d()
            int r3 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r3 > 0) goto L_0x00cb
            long r8 = (long) r6
            i0.j.a.e.b r3 = r0.b
            i0.j.a.e.c r3 = (i0.j.a.e.c) r3
            android.content.SharedPreferences r3 = r3.a
            if (r3 == 0) goto L_0x00b7
            java.lang.String r10 = "KEY_UI_TRACE_LIMIT_PER_REQUEST"
            long r12 = r3.getLong(r10, r12)
        L_0x00b7:
            int r3 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r3 > 0) goto L_0x00cb
            long r8 = (long) r7
            i0.j.a.e.b r3 = r0.b
            i0.j.a.e.c r3 = (i0.j.a.e.c) r3
            long r12 = r3.e()
            int r3 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x00c9
            goto L_0x00cb
        L_0x00c9:
            r15 = r2
            goto L_0x00cd
        L_0x00cb:
            r15 = r20
        L_0x00cd:
            if (r15 == 0) goto L_0x00d0
            goto L_0x00d7
        L_0x00d0:
            r1.add(r11)
            java.lang.String r3 = r11.a
        L_0x00d5:
            if (r11 != 0) goto L_0x000e
        L_0x00d7:
            r0.b(r1)
            i0.j.a.n.a.a r2 = r0.a
            java.lang.String r3 = "syncNextSessionsChunk: "
            java.lang.StringBuilder r3 = i0.d.a.a.a.P0(r3)
            int r1 = r1.size()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.e(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.a.k.b.e():void");
    }
}
