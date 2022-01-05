package i0.j.a.h.b;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import i0.j.a.d.a.b.d;
import i0.j.a.d.a.d.f;
import i0.j.a.e.b;
import i0.j.a.g.a;

/* compiled from: ExecutionTracesHandlerImpl */
public class c implements a {
    public i0.j.a.d.a.b.c a = a.q();
    public i0.j.a.d.a.b.a b = a.o();
    public i0.j.a.n.a.a c = a.i();
    public i0.j.a.h.d.c d = a.a();
    public f e = a.b();
    public b f = a.g();

    public synchronized int a(long j, long j2) {
        int i;
        if (((d) this.a).d(j)) {
            i = ((d) this.a).a(j, j2, ((i0.j.a.h.d.d) this.d).f == null);
        } else {
            i = ((i0.j.a.d.a.b.b) this.b).a(j, j2, ((i0.j.a.h.d.d) this.d).f == null);
        }
        return i;
    }

    public final int b(String str, long j) {
        d dVar = (d) this.a;
        if (dVar.b == null) {
            return -1;
        }
        String o02 = i0.d.a.a.a.o0("session_id = ? AND trace_id NOT IN (", "SELECT trace_id FROM execution_traces where session_id = ? ORDER BY trace_id DESC LIMIT ?", ")");
        String[] strArr = {str, str, String.valueOf(j)};
        SQLiteDatabaseWrapper openDatabase = dVar.b.openDatabase();
        int delete = openDatabase.delete(InstabugDbContract.ExecutionTracesEntry.TABLE_NAME, o02, strArr);
        openDatabase.close();
        return delete;
    }

    public void c(long j) {
        d dVar = (d) this.a;
        if (dVar.b != null) {
            String o02 = i0.d.a.a.a.o0("trace_id IN (", "SELECT trace_id FROM execution_traces ORDER BY trace_id DESC LIMIT ? OFFSET ?", ")");
            String[] strArr = {"-1", String.valueOf(j)};
            SQLiteDatabaseWrapper openDatabase = dVar.b.openDatabase();
            try {
                openDatabase.delete(InstabugDbContract.ExecutionTracesEntry.TABLE_NAME, o02, strArr);
            } catch (Exception e2) {
                i0.j.a.n.a.a aVar = dVar.c;
                aVar.b("DB execution a sql failed: " + e2.getMessage(), e2);
                if (openDatabase == null) {
                    return;
                }
            } catch (Throwable th) {
                if (openDatabase != null) {
                    openDatabase.close();
                }
                throw th;
            }
            openDatabase.close();
        }
    }
}
