package h0.g0.r.s;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import h0.w.b;
import h0.w.g;

/* compiled from: PreferenceDao_Impl */
public final class f implements e {
    public final RoomDatabase a;
    public final b<d> b;

    /* compiled from: PreferenceDao_Impl */
    public class a extends b<d> {
        public a(f fVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String b() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        public void d(h0.y.a.f.f fVar, Object obj) {
            d dVar = (d) obj;
            String str = dVar.a;
            if (str == null) {
                fVar.c.bindNull(1);
            } else {
                fVar.c.bindString(1, str);
            }
            Long l = dVar.b;
            if (l == null) {
                fVar.c.bindNull(2);
                return;
            }
            fVar.c.bindLong(2, l.longValue());
        }
    }

    public f(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
    }

    public Long a(String str) {
        g e = g.e("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            e.i(1);
        } else {
            e.k(1, str);
        }
        this.a.b();
        Long l = null;
        Cursor a2 = h0.w.k.b.a(this.a, e, false, (CancellationSignal) null);
        try {
            if (a2.moveToFirst()) {
                if (!a2.isNull(0)) {
                    l = Long.valueOf(a2.getLong(0));
                }
            }
            return l;
        } finally {
            a2.close();
            e.l();
        }
    }

    public void b(d dVar) {
        this.a.b();
        this.a.c();
        try {
            this.b.e(dVar);
            this.a.k();
        } finally {
            this.a.g();
        }
    }
}
