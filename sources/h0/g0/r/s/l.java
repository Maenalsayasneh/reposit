package h0.g0.r.s;

import androidx.room.RoomDatabase;
import h0.w.b;
import h0.y.a.f.f;

/* compiled from: WorkNameDao_Impl */
public final class l implements k {
    public final RoomDatabase a;
    public final b<j> b;

    /* compiled from: WorkNameDao_Impl */
    public class a extends b<j> {
        public a(l lVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String b() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        public void d(f fVar, Object obj) {
            j jVar = (j) obj;
            String str = jVar.a;
            if (str == null) {
                fVar.c.bindNull(1);
            } else {
                fVar.c.bindString(1, str);
            }
            String str2 = jVar.b;
            if (str2 == null) {
                fVar.c.bindNull(2);
            } else {
                fVar.c.bindString(2, str2);
            }
        }
    }

    public l(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
    }
}
