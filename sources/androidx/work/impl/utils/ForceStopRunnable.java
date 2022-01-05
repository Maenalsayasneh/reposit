package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import h0.g0.i;
import h0.g0.r.k;
import h0.g0.r.l;
import h0.g0.r.p.c.b;
import h0.g0.r.s.d;
import h0.g0.r.s.f;
import h0.g0.r.s.m;
import h0.g0.r.s.n;
import h0.g0.r.s.o;
import h0.g0.r.s.p;
import h0.g0.r.s.q;
import h0.g0.r.t.h;
import h0.w.g;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class ForceStopRunnable implements Runnable {
    public static final String c = i.e("ForceStopRunnable");
    public static final long d = TimeUnit.DAYS.toMillis(3650);
    public final Context q;
    public final l x;
    public int y = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        public static final String a = i.e("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                i c = i.c();
                String str = a;
                if (((i.a) c).b <= 2) {
                    Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
                }
                ForceStopRunnable.c(context);
            }
        }
    }

    public ForceStopRunnable(Context context, l lVar) {
        this.q = context.getApplicationContext();
        this.x = lVar;
    }

    public static PendingIntent b(Context context, int i) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, i);
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent b = b(context, 134217728);
        long currentTimeMillis = System.currentTimeMillis() + d;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, b);
        }
    }

    public void a() {
        boolean z;
        boolean z2;
        Context context = this.q;
        l lVar = this.x;
        String str = b.c;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> f = b.f(context, jobScheduler);
        h0.g0.r.s.i iVar = (h0.g0.r.s.i) lVar.g.n();
        Objects.requireNonNull(iVar);
        g e = g.e("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        iVar.a.b();
        Cursor a = h0.w.k.b.a(iVar.a, e, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(a.getCount());
            while (a.moveToNext()) {
                arrayList.add(a.getString(0));
            }
            HashSet hashSet = new HashSet(f != null ? f.size() : 0);
            if (f != null && !f.isEmpty()) {
                for (JobInfo next : f) {
                    String g = b.g(next);
                    if (!TextUtils.isEmpty(g)) {
                        hashSet.add(g);
                    } else {
                        b.b(jobScheduler, next.getId());
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!hashSet.contains((String) it.next())) {
                        i.c().a(b.c, "Reconciling jobs", new Throwable[0]);
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                WorkDatabase workDatabase = lVar.g;
                workDatabase.c();
                try {
                    p q2 = workDatabase.q();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((q) q2).l((String) it2.next(), -1);
                    }
                    workDatabase.k();
                } finally {
                    workDatabase.g();
                }
            }
            WorkDatabase workDatabase2 = this.x.g;
            p q3 = workDatabase2.q();
            m p = workDatabase2.p();
            workDatabase2.c();
            try {
                q qVar = (q) q3;
                List<o> e2 = qVar.e();
                boolean z3 = !((ArrayList) e2).isEmpty();
                if (z3) {
                    Iterator it3 = ((ArrayList) e2).iterator();
                    while (it3.hasNext()) {
                        o oVar = (o) it3.next();
                        qVar.p(WorkInfo$State.ENQUEUED, oVar.a);
                        qVar.l(oVar.a, -1);
                    }
                }
                ((n) p).b();
                workDatabase2.k();
                boolean z4 = z3 || z;
                Long a2 = ((f) this.x.k.a.m()).a("reschedule_needed");
                if (a2 != null && a2.longValue() == 1) {
                    i.c().a(c, "Rescheduling Workers.", new Throwable[0]);
                    this.x.e();
                    h0.g0.r.t.g gVar = this.x.k;
                    Objects.requireNonNull(gVar);
                    ((f) gVar.a.m()).b(new d("reschedule_needed", false));
                } else {
                    if (b(this.q, 536870912) == null) {
                        c(this.q);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        i.c().a(c, "Application was force-stopped, rescheduling.", new Throwable[0]);
                        this.x.e();
                    } else if (z4) {
                        i.c().a(c, "Found unfinished work, scheduling it.", new Throwable[0]);
                        l lVar2 = this.x;
                        h0.g0.r.f.a(lVar2.f, lVar2.g, lVar2.i);
                    }
                }
                l lVar3 = this.x;
                Objects.requireNonNull(lVar3);
                synchronized (l.d) {
                    lVar3.l = true;
                    BroadcastReceiver.PendingResult pendingResult = lVar3.m;
                    if (pendingResult != null) {
                        pendingResult.finish();
                        lVar3.m = null;
                    }
                }
            } finally {
                workDatabase2.g();
            }
        } finally {
            a.close();
            e.l();
        }
    }

    public void run() {
        boolean z;
        String str;
        l lVar = this.x;
        if (lVar.n == null) {
            synchronized (l.d) {
                if (lVar.n == null) {
                    lVar.g();
                    if (lVar.n == null) {
                        Objects.requireNonNull(lVar.f);
                        if (!TextUtils.isEmpty((CharSequence) null)) {
                            throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                        }
                    }
                }
            }
        }
        if (lVar.n == null) {
            z = true;
        } else {
            i c2 = i.c();
            String str2 = c;
            c2.a(str2, "Found a remote implementation for WorkManager", new Throwable[0]);
            z = h.a(this.q, this.x.f);
            i.c().a(str2, String.format("Is default app process = %s", new Object[]{Boolean.valueOf(z)}), new Throwable[0]);
        }
        if (z) {
            while (true) {
                Context context = this.q;
                String str3 = k.a;
                if (context.getDatabasePath("androidx.work.workdb").exists()) {
                    i.c().a(k.a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
                    HashMap hashMap = new HashMap();
                    File databasePath = context.getDatabasePath("androidx.work.workdb");
                    File file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
                    hashMap.put(databasePath, file);
                    for (String str4 : k.b) {
                        hashMap.put(new File(databasePath.getPath() + str4), new File(file.getPath() + str4));
                    }
                    for (File file2 : hashMap.keySet()) {
                        File file3 = (File) hashMap.get(file2);
                        if (file2.exists() && file3 != null) {
                            if (file3.exists()) {
                                i.c().f(k.a, String.format("Over-writing contents of %s", new Object[]{file3}), new Throwable[0]);
                            }
                            if (file2.renameTo(file3)) {
                                str = String.format("Migrated %s to %s", new Object[]{file2, file3});
                            } else {
                                str = String.format("Renaming %s to %s failed", new Object[]{file2, file3});
                            }
                            i.c().a(k.a, str, new Throwable[0]);
                        }
                    }
                }
                i.c().a(c, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
                    int i = this.y + 1;
                    this.y = i;
                    if (i >= 3) {
                        i.c().b(c, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        Objects.requireNonNull(this.x.f);
                        throw illegalStateException;
                    }
                    i.c().a(c, String.format("Retrying after %s", new Object[]{Long.valueOf(((long) i) * 300)}), e);
                    try {
                        Thread.sleep(((long) this.y) * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }
}
