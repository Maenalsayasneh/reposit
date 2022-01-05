package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
public abstract class JobIntentService extends Service {
    public static final boolean DEBUG = false;
    public static final String TAG = "JobIntentService";
    public static final HashMap<ComponentName, h> sClassWorkEnqueuer = new HashMap<>();
    public static final Object sLock = new Object();
    public final ArrayList<d> mCompatQueue;
    public h mCompatWorkEnqueuer;
    public a mCurProcessor;
    public boolean mDestroyed = false;
    public boolean mInterruptIfStopped = false;
    public b mJobImpl;
    public boolean mStopped = false;

    public final class a extends AsyncTask<Void, Void, Void> {
        public a() {
        }

        public Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            while (true) {
                e dequeueWork = JobIntentService.this.dequeueWork();
                if (dequeueWork == null) {
                    return null;
                }
                JobIntentService.this.onHandleWork(dequeueWork.getIntent());
                dequeueWork.a();
            }
        }

        public void onCancelled(Object obj) {
            Void voidR = (Void) obj;
            JobIntentService.this.processorFinished();
        }

        public void onPostExecute(Object obj) {
            Void voidR = (Void) obj;
            JobIntentService.this.processorFinished();
        }
    }

    public interface b {
        IBinder compatGetBinder();

        e dequeueWork();
    }

    public static final class c extends h {
        public final Context d;
        public final PowerManager.WakeLock e;
        public final PowerManager.WakeLock f;
        public boolean g;
        public boolean h;

        public c(Context context, ComponentName componentName) {
            super(componentName);
            this.d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        public void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.a);
            if (this.d.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.g) {
                        this.g = true;
                        if (!this.h) {
                            this.e.acquire(60000);
                        }
                    }
                }
            }
        }

        public void c() {
            synchronized (this) {
                if (this.h) {
                    if (this.g) {
                        this.e.acquire(60000);
                    }
                    this.h = false;
                    this.f.release();
                }
            }
        }

        public void d() {
            synchronized (this) {
                if (!this.h) {
                    this.h = true;
                    this.f.acquire(600000);
                    this.e.release();
                }
            }
        }

        public void e() {
            synchronized (this) {
                this.g = false;
            }
        }
    }

    public final class d implements e {
        public final Intent a;
        public final int b;

        public d(Intent intent, int i) {
            this.a = intent;
            this.b = i;
        }

        public void a() {
            JobIntentService.this.stopSelf(this.b);
        }

        public Intent getIntent() {
            return this.a;
        }
    }

    public interface e {
        void a();

        Intent getIntent();
    }

    public static final class f extends JobServiceEngine implements b {
        public final JobIntentService a;
        public final Object b = new Object();
        public JobParameters c;

        public final class a implements e {
            public final JobWorkItem a;

            public a(JobWorkItem jobWorkItem) {
                this.a = jobWorkItem;
            }

            public void a() {
                synchronized (f.this.b) {
                    JobParameters jobParameters = f.this.c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.a);
                    }
                }
            }

            public Intent getIntent() {
                return this.a.getIntent();
            }
        }

        public f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.a = jobIntentService;
        }

        public IBinder compatGetBinder() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            r1.getIntent().setExtrasClassLoader(r3.a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
            return new androidx.core.app.JobIntentService.f.a(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
            if (r1 == null) goto L_0x0024;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.core.app.JobIntentService.e dequeueWork() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.c     // Catch:{ all -> 0x0025 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                return r2
            L_0x000a:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x0025 }
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                if (r1 == 0) goto L_0x0024
                android.content.Intent r0 = r1.getIntent()
                androidx.core.app.JobIntentService r2 = r3.a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                androidx.core.app.JobIntentService$f$a r0 = new androidx.core.app.JobIntentService$f$a
                r0.<init>(r1)
                return r0
            L_0x0024:
                return r2
            L_0x0025:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.JobIntentService.f.dequeueWork():androidx.core.app.JobIntentService$e");
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.c = jobParameters;
            this.a.ensureProcessorRunningLocked(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean doStopCurrentWork = this.a.doStopCurrentWork();
            synchronized (this.b) {
                this.c = null;
            }
            return doStopCurrentWork;
        }
    }

    public static final class g extends h {
        public final JobInfo d;
        public final JobScheduler e;

        public g(Context context, ComponentName componentName, int i) {
            super(componentName);
            b(i);
            this.d = new JobInfo.Builder(i, componentName).setOverrideDeadline(0).build();
            this.e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        public void a(Intent intent) {
            this.e.enqueue(this.d, new JobWorkItem(intent));
        }
    }

    public static abstract class h {
        public final ComponentName a;
        public boolean b;
        public int c;

        public h(ComponentName componentName) {
            this.a = componentName;
        }

        public abstract void a(Intent intent);

        public void b(int i) {
            if (!this.b) {
                this.b = true;
                this.c = i;
            } else if (this.c != i) {
                StringBuilder Q0 = i0.d.a.a.a.Q0("Given job ID ", i, " is different than previous ");
                Q0.append(this.c);
                throw new IllegalArgumentException(Q0.toString());
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mCompatQueue = null;
        } else {
            this.mCompatQueue = new ArrayList<>();
        }
    }

    public static void enqueueWork(Context context, Class<?> cls, int i, Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i, intent);
    }

    public static h getWorkEnqueuer(Context context, ComponentName componentName, boolean z, int i) {
        h hVar;
        HashMap<ComponentName, h> hashMap = sClassWorkEnqueuer;
        h hVar2 = hashMap.get(componentName);
        if (hVar2 != null) {
            return hVar2;
        }
        if (Build.VERSION.SDK_INT < 26) {
            hVar = new c(context, componentName);
        } else if (z) {
            hVar = new g(context, componentName, i);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        h hVar3 = hVar;
        hashMap.put(componentName, hVar3);
        return hVar3;
    }

    public e dequeueWork() {
        b bVar = this.mJobImpl;
        if (bVar != null) {
            return bVar.dequeueWork();
        }
        synchronized (this.mCompatQueue) {
            if (this.mCompatQueue.size() <= 0) {
                return null;
            }
            e remove = this.mCompatQueue.remove(0);
            return remove;
        }
    }

    public boolean doStopCurrentWork() {
        a aVar = this.mCurProcessor;
        if (aVar != null) {
            aVar.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    public void ensureProcessorRunningLocked(boolean z) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new a();
            h hVar = this.mCompatWorkEnqueuer;
            if (hVar != null && z) {
                hVar.d();
            }
            this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    public IBinder onBind(Intent intent) {
        b bVar = this.mJobImpl;
        if (bVar != null) {
            return bVar.compatGetBinder();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.mJobImpl = new f(this);
            this.mCompatWorkEnqueuer = null;
            return;
        }
        this.mJobImpl = null;
        this.mCompatWorkEnqueuer = getWorkEnqueuer(this, new ComponentName(this, getClass()), false, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.c();
            }
        }
    }

    public abstract void onHandleWork(Intent intent);

    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.mCompatQueue == null) {
            return 2;
        }
        this.mCompatWorkEnqueuer.e();
        synchronized (this.mCompatQueue) {
            ArrayList<d> arrayList = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i2));
            ensureProcessorRunningLocked(true);
        }
        return 3;
    }

    public boolean onStopCurrentWork() {
        return true;
    }

    public void processorFinished() {
        ArrayList<d> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mCurProcessor = null;
                ArrayList<d> arrayList2 = this.mCompatQueue;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ensureProcessorRunningLocked(false);
                } else if (!this.mDestroyed) {
                    this.mCompatWorkEnqueuer.c();
                }
            }
        }
    }

    public void setInterruptIfStopped(boolean z) {
        this.mInterruptIfStopped = z;
    }

    public static void enqueueWork(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent != null) {
            synchronized (sLock) {
                h workEnqueuer = getWorkEnqueuer(context, componentName, true, i);
                workEnqueuer.b(i);
                workEnqueuer.a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }
}
