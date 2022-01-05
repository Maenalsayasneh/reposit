package i0.j.a.d.a.d;

import com.instabug.library.internal.utils.stability.execution.ReturnableExecutable;

/* compiled from: SessionCacheHandlerImpl */
public class d implements ReturnableExecutable<i0.j.a.d.b.d> {
    public final /* synthetic */ String a;
    public final /* synthetic */ e b;

    public d(e eVar, String str) {
        this.b = eVar;
        this.a = str;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [i0.j.a.d.b.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object execute() throws java.lang.Exception {
        /*
            r5 = this;
            i0.j.a.d.a.d.e r0 = r5.b
            com.instabug.library.internal.storage.cache.db.DatabaseManager r0 = r0.a
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r0 = r0.openDatabase()
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0052 }
            r2.<init>()     // Catch:{ all -> 0x0052 }
            java.lang.String r3 = "SELECT * FROM apm_session_table where session_id < "
            r2.append(r3)     // Catch:{ all -> 0x0052 }
            java.lang.String r3 = r5.a     // Catch:{ all -> 0x0052 }
            r2.append(r3)     // Catch:{ all -> 0x0052 }
            java.lang.String r3 = " ORDER BY "
            r2.append(r3)     // Catch:{ all -> 0x0052 }
            java.lang.String r3 = "started_at"
            r2.append(r3)     // Catch:{ all -> 0x0052 }
            java.lang.String r3 = " DESC LIMIT 1"
            r2.append(r3)     // Catch:{ all -> 0x0052 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0052 }
            android.database.Cursor r2 = r0.rawQuery(r2, r1)     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x0049
            boolean r3 = r2.moveToFirst()     // Catch:{ all -> 0x0044 }
            if (r3 == 0) goto L_0x0049
            i0.j.a.d.a.d.e r1 = r5.b     // Catch:{ all -> 0x0044 }
            i0.j.a.d.b.d r1 = r1.a(r2)     // Catch:{ all -> 0x0044 }
            r2.close()
            r0.close()
            goto L_0x0051
        L_0x0044:
            r1 = move-exception
            r4 = r2
            r2 = r1
            r1 = r4
            goto L_0x0053
        L_0x0049:
            if (r2 == 0) goto L_0x004e
            r2.close()
        L_0x004e:
            r0.close()
        L_0x0051:
            return r1
        L_0x0052:
            r2 = move-exception
        L_0x0053:
            if (r1 == 0) goto L_0x0058
            r1.close()
        L_0x0058:
            r0.close()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.a.d.a.d.d.execute():java.lang.Object");
    }
}
