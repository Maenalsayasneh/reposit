package h0.g0.r.p.c;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import h0.g0.c;
import h0.g0.i;
import h0.g0.r.e;
import h0.g0.r.l;
import h0.g0.r.s.g;
import h0.g0.r.s.o;
import h0.g0.r.s.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: SystemJobScheduler */
public class b implements e {
    public static final String c = i.e("SystemJobScheduler");
    public final Context d;
    public final JobScheduler q;
    public final l x;
    public final a y;

    public b(Context context, l lVar) {
        a aVar = new a(context);
        this.d = context;
        this.x = lVar;
        this.q = (JobScheduler) context.getSystemService("jobscheduler");
        this.y = aVar;
    }

    public static void b(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            i.c().b(c, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i)}), th);
        }
    }

    public static List<Integer> d(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> f = f(context, jobScheduler);
        if (f == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo next : f) {
            if (str.equals(g(next))) {
                arrayList.add(Integer.valueOf(next.getId()));
            }
        }
        return arrayList;
    }

    public static List<JobInfo> f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            i.c().b(c, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static String g(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void a(o... oVarArr) {
        int i;
        WorkDatabase workDatabase = this.x.g;
        h0.g0.r.t.e eVar = new h0.g0.r.t.e(workDatabase);
        int length = oVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            o oVar = oVarArr[i2];
            workDatabase.c();
            try {
                o i3 = ((q) workDatabase.q()).i(oVar.a);
                if (i3 == null) {
                    i.c().f(c, "Skipping scheduling " + oVar.a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.k();
                } else if (i3.b != WorkInfo$State.ENQUEUED) {
                    i.c().f(c, "Skipping scheduling " + oVar.a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.k();
                } else {
                    g a = ((h0.g0.r.s.i) workDatabase.n()).a(oVar.a);
                    if (a != null) {
                        i = a.b;
                    } else {
                        Objects.requireNonNull(this.x.f);
                        i = eVar.b(0, this.x.f.g);
                    }
                    if (a == null) {
                        ((h0.g0.r.s.i) this.x.g.n()).b(new g(oVar.a, i));
                    }
                    h(oVar, i);
                    workDatabase.k();
                }
                workDatabase.g();
                i2++;
            } catch (Throwable th) {
                workDatabase.g();
                throw th;
            }
        }
    }

    public boolean c() {
        return true;
    }

    public void e(String str) {
        List<Integer> d2 = d(this.d, this.q, str);
        if (d2 != null && !d2.isEmpty()) {
            for (Integer intValue : d2) {
                b(this.q, intValue.intValue());
            }
            ((h0.g0.r.s.i) this.x.g.n()).c(str);
        }
    }

    public void h(o oVar, int i) {
        int i2;
        a aVar = this.y;
        Objects.requireNonNull(aVar);
        h0.g0.b bVar = oVar.j;
        NetworkType networkType = bVar.b;
        int ordinal = networkType.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i2 = 2;
                } else if (ordinal != 3) {
                    i2 = 4;
                    if (ordinal != 4 || Build.VERSION.SDK_INT < 26) {
                        i.c().a(a.a, String.format("API version too low. Cannot convert network type value %s", new Object[]{networkType}), new Throwable[0]);
                    }
                } else {
                    i2 = 3;
                }
            }
            i2 = 1;
        } else {
            i2 = 0;
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", oVar.a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", oVar.c());
        JobInfo.Builder extras = new JobInfo.Builder(i, aVar.b).setRequiredNetworkType(i2).setRequiresCharging(bVar.c).setRequiresDeviceIdle(bVar.d).setExtras(persistableBundle);
        if (!bVar.d) {
            extras.setBackoffCriteria(oVar.m, oVar.l == BackoffPolicy.LINEAR ? 0 : 1);
        }
        long max = Math.max(oVar.a() - System.currentTimeMillis(), 0);
        if (Build.VERSION.SDK_INT <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else {
            extras.setImportantWhileForeground(true);
        }
        if (bVar.i.a() > 0) {
            for (c.a next : bVar.i.a) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(next.a, next.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(bVar.g);
            extras.setTriggerContentMaxDelay(bVar.h);
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(bVar.e);
            extras.setRequiresStorageNotLow(bVar.f);
        }
        JobInfo build = extras.build();
        i.c().a(c, String.format("Scheduling work ID %s Job ID %s", new Object[]{oVar.a, Integer.valueOf(i)}), new Throwable[0]);
        try {
            this.q.schedule(build);
        } catch (IllegalStateException e) {
            List<JobInfo> f = f(this.d, this.q);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{Integer.valueOf(f != null ? f.size() : 0), Integer.valueOf(((ArrayList) ((q) this.x.g.q()).f()).size()), Integer.valueOf(this.x.f.h)});
            i.c().b(c, format, new Throwable[0]);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            i.c().b(c, String.format("Unable to schedule %s", new Object[]{oVar}), th);
        }
    }
}
