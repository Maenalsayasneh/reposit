package i0.j.a;

import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import i0.j.a.d.a.d.f;
import java.util.Objects;

/* compiled from: APMImplementation */
public class c {
    public i0.j.a.n.a.a a;

    /* compiled from: APMImplementation */
    public class a implements Runnable {
        public final /* synthetic */ i0.j.a.h.a.a c;

        public a(i0.j.a.h.a.a aVar) {
            this.c = aVar;
        }

        public void run() {
            i0.j.a.h.a.a aVar = this.c;
            DatabaseManager databaseManager = ((i0.j.a.d.a.a.b) aVar.a).a;
            if (databaseManager != null) {
                SQLiteDatabaseWrapper openDatabase = databaseManager.openDatabase();
                openDatabase.execSQL("delete from app_launch_attributes");
                openDatabase.execSQL("delete from app_launch");
                openDatabase.close();
            }
            f fVar = aVar.b;
            if (fVar != null) {
                fVar.b();
            }
        }
    }

    /* compiled from: APMImplementation */
    public class b implements Runnable {
        public final /* synthetic */ i0.j.a.h.e.c c;

        public b(i0.j.a.h.e.c cVar) {
            this.c = cVar;
        }

        public void run() {
            Objects.requireNonNull(this.c);
            i0.j.a.d.a.e.a d = i0.j.a.g.a.d();
            f b = i0.j.a.g.a.b();
            DatabaseManager databaseManager = ((i0.j.a.d.a.e.b) d).a;
            if (databaseManager != null) {
                i0.d.a.a.a.o(databaseManager, InstabugDbContract.APMUiTraceEntry.DELETE_ALL);
            }
            if (b != null) {
                b.a();
            }
        }
    }

    public c(i0.j.a.n.a.a aVar) {
        this.a = aVar;
    }

    public void a() {
        i0.j.a.g.a.f("app_launch_thread_executor").execute(new a(i0.j.a.g.a.k()));
    }

    public void b() {
        i0.j.a.g.a.f("ui_trace_thread_executor").execute(new b(i0.j.a.g.a.e()));
    }
}
