package h0.g0.r.s;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import h0.w.b;
import h0.w.g;
import h0.y.a.f.f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DependencyDao_Impl */
public final class c implements b {
    public final RoomDatabase a;
    public final b<a> b;

    /* compiled from: DependencyDao_Impl */
    public class a extends b<a> {
        public a(c cVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String b() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        public void d(f fVar, Object obj) {
            a aVar = (a) obj;
            String str = aVar.a;
            if (str == null) {
                fVar.c.bindNull(1);
            } else {
                fVar.c.bindString(1, str);
            }
            String str2 = aVar.b;
            if (str2 == null) {
                fVar.c.bindNull(2);
            } else {
                fVar.c.bindString(2, str2);
            }
        }
    }

    public c(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
    }

    public List<String> a(String str) {
        g e = g.e("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            e.i(1);
        } else {
            e.k(1, str);
        }
        this.a.b();
        Cursor a2 = h0.w.k.b.a(this.a, e, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(a2.getString(0));
            }
            return arrayList;
        } finally {
            a2.close();
            e.l();
        }
    }

    public boolean b(String str) {
        boolean z = true;
        g e = g.e("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            e.i(1);
        } else {
            e.k(1, str);
        }
        this.a.b();
        boolean z2 = false;
        Cursor a2 = h0.w.k.b.a(this.a, e, false, (CancellationSignal) null);
        try {
            if (a2.moveToFirst()) {
                if (a2.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            a2.close();
            e.l();
        }
    }
}
