package h0.g0.r.s;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import h0.w.b;
import h0.w.g;
import h0.y.a.f.f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WorkTagDao_Impl */
public final class t implements s {
    public final RoomDatabase a;
    public final b<r> b;

    /* compiled from: WorkTagDao_Impl */
    public class a extends b<r> {
        public a(t tVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String b() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        public void d(f fVar, Object obj) {
            r rVar = (r) obj;
            String str = rVar.a;
            if (str == null) {
                fVar.c.bindNull(1);
            } else {
                fVar.c.bindString(1, str);
            }
            String str2 = rVar.b;
            if (str2 == null) {
                fVar.c.bindNull(2);
            } else {
                fVar.c.bindString(2, str2);
            }
        }
    }

    public t(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
    }

    public List<String> a(String str) {
        g e = g.e("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
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
}
