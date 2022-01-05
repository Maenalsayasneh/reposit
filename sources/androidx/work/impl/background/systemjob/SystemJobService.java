package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import android.text.TextUtils;
import h0.g0.i;
import h0.g0.r.b;
import h0.g0.r.d;
import h0.g0.r.l;
import java.util.HashMap;
import java.util.Map;

public class SystemJobService extends JobService implements b {
    public static final String c = i.e("SystemJobService");
    public l d;
    public final Map<String, JobParameters> q = new HashMap();

    public static String a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public void d(String str, boolean z) {
        JobParameters remove;
        i.c().a(c, String.format("%s executed on JobScheduler", new Object[]{str}), new Throwable[0]);
        synchronized (this.q) {
            remove = this.q.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z);
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            l c2 = l.c(getApplicationContext());
            this.d = c2;
            c2.j.a(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                i.c().f(c, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        l lVar = this.d;
        if (lVar != null) {
            lVar.j.e(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = new androidx.work.WorkerParameters.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0077, code lost:
        if (r9.getTriggeredContentUris() == null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0079, code lost:
        r3.b = java.util.Arrays.asList(r9.getTriggeredContentUris());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0087, code lost:
        if (r9.getTriggeredContentAuthorities() == null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
        r3.a = java.util.Arrays.asList(r9.getTriggeredContentAuthorities());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0095, code lost:
        if (r2 < 28) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0097, code lost:
        r9.getNetwork();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009a, code lost:
        r9 = r8.d;
        r2 = r9.h;
        ((h0.g0.r.t.q.b) r2).a.execute(new h0.g0.r.t.j(r9, r0, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00aa, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            h0.g0.r.l r0 = r8.d
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0017
            h0.g0.i r0 = h0.g0.i.c()
            java.lang.String r3 = c
            java.lang.String r4 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r5 = new java.lang.Throwable[r2]
            r0.a(r3, r4, r5)
            r8.jobFinished(r9, r1)
            return r2
        L_0x0017:
            java.lang.String r0 = a(r9)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x002f
            h0.g0.i r9 = h0.g0.i.c()
            java.lang.String r0 = c
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r9.b(r0, r1, r3)
            return r2
        L_0x002f:
            java.util.Map<java.lang.String, android.app.job.JobParameters> r3 = r8.q
            monitor-enter(r3)
            java.util.Map<java.lang.String, android.app.job.JobParameters> r4 = r8.q     // Catch:{ all -> 0x00ab }
            boolean r4 = r4.containsKey(r0)     // Catch:{ all -> 0x00ab }
            if (r4 == 0) goto L_0x0051
            h0.g0.i r9 = h0.g0.i.c()     // Catch:{ all -> 0x00ab }
            java.lang.String r4 = c     // Catch:{ all -> 0x00ab }
            java.lang.String r5 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00ab }
            r1[r2] = r0     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = java.lang.String.format(r5, r1)     // Catch:{ all -> 0x00ab }
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00ab }
            r9.a(r4, r0, r1)     // Catch:{ all -> 0x00ab }
            monitor-exit(r3)     // Catch:{ all -> 0x00ab }
            return r2
        L_0x0051:
            h0.g0.i r4 = h0.g0.i.c()     // Catch:{ all -> 0x00ab }
            java.lang.String r5 = c     // Catch:{ all -> 0x00ab }
            java.lang.String r6 = "onStartJob for %s"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ all -> 0x00ab }
            r7[r2] = r0     // Catch:{ all -> 0x00ab }
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch:{ all -> 0x00ab }
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00ab }
            r4.a(r5, r6, r2)     // Catch:{ all -> 0x00ab }
            java.util.Map<java.lang.String, android.app.job.JobParameters> r2 = r8.q     // Catch:{ all -> 0x00ab }
            r2.put(r0, r9)     // Catch:{ all -> 0x00ab }
            monitor-exit(r3)     // Catch:{ all -> 0x00ab }
            int r2 = android.os.Build.VERSION.SDK_INT
            androidx.work.WorkerParameters$a r3 = new androidx.work.WorkerParameters$a
            r3.<init>()
            android.net.Uri[] r4 = r9.getTriggeredContentUris()
            if (r4 == 0) goto L_0x0083
            android.net.Uri[] r4 = r9.getTriggeredContentUris()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.b = r4
        L_0x0083:
            java.lang.String[] r4 = r9.getTriggeredContentAuthorities()
            if (r4 == 0) goto L_0x0093
            java.lang.String[] r4 = r9.getTriggeredContentAuthorities()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.a = r4
        L_0x0093:
            r4 = 28
            if (r2 < r4) goto L_0x009a
            r9.getNetwork()
        L_0x009a:
            h0.g0.r.l r9 = r8.d
            h0.g0.r.t.q.a r2 = r9.h
            h0.g0.r.t.j r4 = new h0.g0.r.t.j
            r4.<init>(r9, r0, r3)
            h0.g0.r.t.q.b r2 = (h0.g0.r.t.q.b) r2
            h0.g0.r.t.i r9 = r2.a
            r9.execute(r4)
            return r1
        L_0x00ab:
            r9 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00ab }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.d == null) {
            i.c().a(c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String a = a(jobParameters);
        if (TextUtils.isEmpty(a)) {
            i.c().b(c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        i.c().a(c, String.format("onStopJob for %s", new Object[]{a}), new Throwable[0]);
        synchronized (this.q) {
            this.q.remove(a);
        }
        this.d.f(a);
        d dVar = this.d.j;
        synchronized (dVar.d2) {
            contains = dVar.b2.contains(a);
        }
        return !contains;
    }
}
