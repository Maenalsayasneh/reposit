package h0.g0.r.s;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import h0.w.g;
import h0.y.a.f.f;

/* compiled from: SystemIdInfoDao_Impl */
public final class i implements h {
    public final RoomDatabase a;
    public final h0.w.b<g> b;
    public final h0.w.i c;

    /* compiled from: SystemIdInfoDao_Impl */
    public class a extends h0.w.b<g> {
        public a(i iVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        public void d(f fVar, Object obj) {
            g gVar = (g) obj;
            String str = gVar.a;
            if (str == null) {
                fVar.c.bindNull(1);
            } else {
                fVar.c.bindString(1, str);
            }
            fVar.c.bindLong(2, (long) gVar.b);
        }
    }

    /* compiled from: SystemIdInfoDao_Impl */
    public class b extends h0.w.i {
        public b(i iVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String b() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
        this.c = new b(this, roomDatabase);
    }

    public g a(String str) {
        g e = g.e("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            e.i(1);
        } else {
            e.k(1, str);
        }
        this.a.b();
        g gVar = null;
        Cursor a2 = h0.w.k.b.a(this.a, e, false, (CancellationSignal) null);
        try {
            int J = g0.a.b.b.a.J(a2, "work_spec_id");
            int J2 = g0.a.b.b.a.J(a2, "system_id");
            if (a2.moveToFirst()) {
                gVar = new g(a2.getString(J), a2.getInt(J2));
            }
            return gVar;
        } finally {
            a2.close();
            e.l();
        }
    }

    public void b(g gVar) {
        this.a.b();
        this.a.c();
        try {
            this.b.e(gVar);
            this.a.k();
        } finally {
            this.a.g();
        }
    }

    public void c(String str) {
        this.a.b();
        f a2 = this.c.a();
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
            h0.w.i iVar = this.c;
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
