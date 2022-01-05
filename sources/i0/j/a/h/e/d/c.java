package i0.j.a.h.e.d;

import android.content.SharedPreferences;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.a.d.a.e.a;
import i0.j.a.d.a.e.b;
import i0.j.a.d.b.d;
import i0.j.a.d.b.f;
import java.util.Objects;

/* compiled from: AutomaticUiTraceHandlerImpl */
public class c implements Runnable {
    public final /* synthetic */ f c;
    public final /* synthetic */ d d;

    public c(d dVar, f fVar) {
        this.d = dVar;
        this.c = fVar;
    }

    public void run() {
        int i;
        a d2 = i0.j.a.g.a.d();
        d dVar = this.d;
        d dVar2 = ((i0.j.a.h.d.d) dVar.h).f;
        String str = dVar2 != null ? dVar2.a : null;
        if (str != null) {
            f fVar = this.c;
            fVar.n = str;
            b bVar = (b) d2;
            if (bVar.a(fVar) != -1) {
                i0.j.a.d.a.d.f fVar2 = this.d.i;
                if (fVar2 != null) {
                    fVar2.j(str, 1);
                    SharedPreferences sharedPreferences = ((i0.j.a.e.c) this.d.b).a;
                    long j = 500;
                    if (sharedPreferences != null) {
                        j = sharedPreferences.getLong("KEY_UI_TRACE_LIMIT_PER_REQUEST", 500);
                    }
                    if (bVar.a != null) {
                        String o02 = i0.d.a.a.a.o0("session_id = ? AND id NOT IN (", "SELECT id FROM apm_ui_traces where session_id = ? ORDER BY id DESC LIMIT ?", ")");
                        String[] strArr = {str, str, String.valueOf(j)};
                        SQLiteDatabaseWrapper openDatabase = bVar.a.openDatabase();
                        i = openDatabase.delete(InstabugDbContract.APMUiTraceEntry.TABLE_NAME, o02, strArr);
                        openDatabase.close();
                    } else {
                        i = -1;
                    }
                    if (i > 0) {
                        this.d.i.k(str, i);
                    }
                }
                SharedPreferences sharedPreferences2 = ((i0.j.a.e.c) this.d.b).a;
                long j2 = 2500;
                if (sharedPreferences2 != null) {
                    j2 = sharedPreferences2.getLong("KEY_UI_TRACE_STORE_LIMIT", 2500);
                }
                if (bVar.a != null) {
                    String o03 = i0.d.a.a.a.o0("id NOT IN (", " SELECT id FROM apm_ui_traces ORDER BY id DESC LIMIT ?", ")");
                    String[] strArr2 = {String.valueOf(j2)};
                    SQLiteDatabaseWrapper openDatabase2 = bVar.a.openDatabase();
                    try {
                        openDatabase2.delete(InstabugDbContract.APMUiTraceEntry.TABLE_NAME, o03, strArr2);
                    } catch (Exception e) {
                        i0.j.a.n.a.a aVar = bVar.b;
                        aVar.b("DB execution a sql failed: " + e.getMessage(), e);
                        if (openDatabase2 == null) {
                            return;
                        }
                    } catch (Throwable th) {
                        if (openDatabase2 != null) {
                            openDatabase2.close();
                        }
                        throw th;
                    }
                    openDatabase2.close();
                    return;
                }
                return;
            }
            Objects.requireNonNull(this.d.d);
            InstabugSDKLogger.p("Instabug - APM", "Session meta data was not updated. Failed to save UITrace");
            return;
        }
        Objects.requireNonNull(dVar.d);
        InstabugSDKLogger.p("Instabug - APM", "UITrace was not inserted. APM session is null");
    }
}
