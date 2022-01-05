package h0.g0.r.s;

import androidx.room.RoomDatabase;
import h0.w.i;
import h0.y.a.f.f;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WorkProgressDao_Impl */
public final class n implements m {
    public final RoomDatabase a;
    public final i b;
    public final i c;

    /* compiled from: WorkProgressDao_Impl */
    public class a extends i {
        public a(n nVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String b() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* compiled from: WorkProgressDao_Impl */
    public class b extends i {
        public b(n nVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String b() {
            return "DELETE FROM WorkProgress";
        }
    }

    public n(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        new AtomicBoolean(false);
        this.b = new a(this, roomDatabase);
        this.c = new b(this, roomDatabase);
    }

    public void a(String str) {
        this.a.b();
        f a2 = this.b.a();
        if (str == null) {
            a2.c.bindNull(1);
        } else {
            a2.c.bindString(1, str);
        }
        this.a.c();
        try {
            a2.a();
            this.a.k();
            this.a.g();
            i iVar = this.b;
            if (a2 == iVar.c) {
                iVar.a.set(false);
            }
        } catch (Throwable th) {
            this.a.g();
            this.b.c(a2);
            throw th;
        }
    }

    public void b() {
        this.a.b();
        f a2 = this.c.a();
        this.a.c();
        try {
            a2.a();
            this.a.k();
            this.a.g();
            i iVar = this.c;
            if (a2 == iVar.c) {
                iVar.a.set(false);
            }
        } catch (Throwable th) {
            this.a.g();
            this.c.c(a2);
            throw th;
        }
    }
}
