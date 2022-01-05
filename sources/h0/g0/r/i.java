package h0.g0.r;

import androidx.room.RoomDatabase;
import androidx.work.impl.WorkDatabase;
import h0.y.a.b;
import h0.y.a.f.a;

/* compiled from: WorkDatabase */
public class i extends RoomDatabase.b {
    public void a(b bVar) {
        ((a) bVar).d.beginTransaction();
        try {
            int i = WorkDatabase.k;
            ((a) bVar).d.execSQL("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.j) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            ((a) bVar).d.setTransactionSuccessful();
        } finally {
            ((a) bVar).d.endTransaction();
        }
    }
}
