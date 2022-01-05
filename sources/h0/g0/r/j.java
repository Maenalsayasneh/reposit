package h0.g0.r;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: WorkDatabaseMigrations */
public class j {
    public static h0.w.j.a a = new a(1, 2);
    public static h0.w.j.a b = new b(3, 4);
    public static h0.w.j.a c = new c(4, 5);
    public static h0.w.j.a d = new d(6, 7);
    public static h0.w.j.a e = new e(7, 8);
    public static h0.w.j.a f = new f(8, 9);

    /* compiled from: WorkDatabaseMigrations */
    public class a extends h0.w.j.a {
        public a(int i, int i2) {
            super(i, i2);
        }

        public void a(h0.y.a.b bVar) {
            ((h0.y.a.f.a) bVar).d.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            h0.y.a.f.a aVar = (h0.y.a.f.a) bVar;
            aVar.d.execSQL("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            aVar.d.execSQL("DROP TABLE IF EXISTS alarmInfo");
            aVar.d.execSQL("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    public class b extends h0.w.j.a {
        public b(int i, int i2) {
            super(i, i2);
        }

        public void a(h0.y.a.b bVar) {
            ((h0.y.a.f.a) bVar).d.execSQL("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    public class c extends h0.w.j.a {
        public c(int i, int i2) {
            super(i, i2);
        }

        public void a(h0.y.a.b bVar) {
            ((h0.y.a.f.a) bVar).d.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            ((h0.y.a.f.a) bVar).d.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    public class d extends h0.w.j.a {
        public d(int i, int i2) {
            super(i, i2);
        }

        public void a(h0.y.a.b bVar) {
            ((h0.y.a.f.a) bVar).d.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    public class e extends h0.w.j.a {
        public e(int i, int i2) {
            super(i, i2);
        }

        public void a(h0.y.a.b bVar) {
            ((h0.y.a.f.a) bVar).d.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    public class f extends h0.w.j.a {
        public f(int i, int i2) {
            super(i, i2);
        }

        public void a(h0.y.a.b bVar) {
            ((h0.y.a.f.a) bVar).d.execSQL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    public static class g extends h0.w.j.a {
        public final Context c;

        public g(Context context, int i, int i2) {
            super(i, i2);
            this.c = context;
        }

        public void a(h0.y.a.b bVar) {
            if (this.b >= 10) {
                ((h0.y.a.f.a) bVar).d.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                return;
            }
            this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    public static class h extends h0.w.j.a {
        public final Context c;

        public h(Context context) {
            super(9, 10);
            this.c = context;
        }

        public void a(h0.y.a.b bVar) {
            ((h0.y.a.f.a) bVar).d.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            SharedPreferences sharedPreferences = this.c.getSharedPreferences("androidx.work.util.preferences", 0);
            if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                long j = 0;
                long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0);
                if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                    j = 1;
                }
                h0.y.a.f.a aVar = (h0.y.a.f.a) bVar;
                aVar.d.beginTransaction();
                try {
                    ((h0.y.a.f.a) bVar).d.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                    ((h0.y.a.f.a) bVar).d.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j)});
                    sharedPreferences.edit().clear().apply();
                    ((h0.y.a.f.a) bVar).d.setTransactionSuccessful();
                } finally {
                    aVar.d.endTransaction();
                }
            }
            SharedPreferences sharedPreferences2 = this.c.getSharedPreferences("androidx.work.util.id", 0);
            if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                h0.y.a.f.a aVar2 = (h0.y.a.f.a) bVar;
                aVar2.d.beginTransaction();
                try {
                    ((h0.y.a.f.a) bVar).d.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                    ((h0.y.a.f.a) bVar).d.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                    sharedPreferences2.edit().clear().apply();
                    ((h0.y.a.f.a) bVar).d.setTransactionSuccessful();
                } finally {
                    aVar2.d.endTransaction();
                }
            }
        }
    }
}
