package h0.g0.r;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.work.ExistingWorkPolicy;
import androidx.work.R;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.ForceStopRunnable;
import h0.g0.a;
import h0.g0.i;
import h0.g0.k;
import h0.g0.n;
import h0.g0.o;
import h0.g0.r.j;
import h0.g0.r.s.q;
import h0.g0.r.t.f;
import h0.g0.r.t.g;
import h0.g0.r.t.q.b;
import h0.w.h;
import h0.y.a.c;
import h0.y.a.f.d;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: WorkManagerImpl */
public class l extends n {
    public static final String a = i.e("WorkManagerImpl");
    public static l b = null;
    public static l c = null;
    public static final Object d = new Object();
    public Context e;
    public a f;
    public WorkDatabase g;
    public h0.g0.r.t.q.a h;
    public List<e> i;
    public d j;
    public g k;
    public boolean l;
    public BroadcastReceiver.PendingResult m;
    public volatile h0.g0.s.a n;

    /* JADX INFO: finally extract failed */
    public l(Context context, a aVar, h0.g0.r.t.q.a aVar2) {
        RoomDatabase.a aVar3;
        String str;
        Executor executor;
        a aVar4 = aVar;
        h0.g0.r.t.q.a aVar5 = aVar2;
        boolean z = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        h0.g0.r.t.i iVar = ((b) aVar5).a;
        int i2 = WorkDatabase.k;
        Class<WorkDatabase> cls = WorkDatabase.class;
        if (z) {
            aVar3 = new RoomDatabase.a(applicationContext, cls, (String) null);
            aVar3.h = true;
        } else {
            String str2 = k.a;
            aVar3 = new RoomDatabase.a(applicationContext, cls, "androidx.work.workdb");
            aVar3.g = new h(applicationContext);
        }
        aVar3.e = iVar;
        i iVar2 = new i();
        if (aVar3.d == null) {
            aVar3.d = new ArrayList<>();
        }
        aVar3.d.add(iVar2);
        aVar3.a(j.a);
        aVar3.a(new j.g(applicationContext, 2, 3));
        aVar3.a(j.b);
        aVar3.a(j.c);
        aVar3.a(new j.g(applicationContext, 5, 6));
        aVar3.a(j.d);
        aVar3.a(j.e);
        aVar3.a(j.f);
        aVar3.a(new j.h(applicationContext));
        aVar3.a(new j.g(applicationContext, 10, 11));
        aVar3.j = false;
        aVar3.k = true;
        Context context2 = aVar3.c;
        if (context2 == null) {
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        } else if (aVar3.a != null) {
            Executor executor2 = aVar3.e;
            if (executor2 == null && aVar3.f == null) {
                Executor executor3 = h0.c.a.a.a.c;
                aVar3.f = executor3;
                aVar3.e = executor3;
            } else if (executor2 != null && aVar3.f == null) {
                aVar3.f = executor2;
            } else if (executor2 == null && (executor = aVar3.f) != null) {
                aVar3.e = executor;
            }
            if (aVar3.g == null) {
                aVar3.g = new d();
            }
            String str3 = aVar3.b;
            c.C0076c cVar = aVar3.g;
            RoomDatabase.c cVar2 = aVar3.l;
            ArrayList<RoomDatabase.b> arrayList = aVar3.d;
            boolean z2 = aVar3.h;
            RoomDatabase.JournalMode resolve = aVar3.i.resolve(context2);
            Executor executor4 = aVar3.e;
            h0.w.a aVar6 = new h0.w.a(context2, str3, cVar, cVar2, arrayList, z2, resolve, executor4, aVar3.f, false, aVar3.j, aVar3.k, (Set<Integer>) null, (String) null, (File) null);
            Class<T> cls2 = aVar3.a;
            String name = cls2.getPackage().getName();
            String canonicalName = cls2.getCanonicalName();
            canonicalName = !name.isEmpty() ? canonicalName.substring(name.length() + 1) : canonicalName;
            String str4 = canonicalName.replace('.', '_') + "_Impl";
            try {
                if (name.isEmpty()) {
                    str = str4;
                } else {
                    str = name + "." + str4;
                }
                RoomDatabase roomDatabase = (RoomDatabase) Class.forName(str).newInstance();
                c f2 = roomDatabase.f(aVar6);
                roomDatabase.c = f2;
                if (f2 instanceof h) {
                    ((h) f2).Y1 = aVar6;
                }
                boolean z3 = resolve == RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING;
                f2.setWriteAheadLoggingEnabled(z3);
                roomDatabase.g = arrayList;
                roomDatabase.b = executor4;
                new ArrayDeque();
                roomDatabase.e = z2;
                roomDatabase.f = z3;
                WorkDatabase workDatabase = (WorkDatabase) roomDatabase;
                Context applicationContext2 = context.getApplicationContext();
                i.a aVar7 = new i.a(aVar4.f);
                synchronized (i.class) {
                    try {
                        i.a = aVar7;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                String str5 = f.a;
                h0.g0.r.p.c.b bVar = new h0.g0.r.p.c.b(applicationContext2, this);
                f.a(applicationContext2, SystemJobService.class, true);
                i.c().a(f.a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
                List<e> asList = Arrays.asList(new e[]{bVar, new h0.g0.r.p.a.c(applicationContext2, aVar4, aVar5, this)});
                d dVar = new d(context, aVar, aVar2, workDatabase, asList);
                Context applicationContext3 = context.getApplicationContext();
                this.e = applicationContext3;
                this.f = aVar4;
                this.h = aVar5;
                this.g = workDatabase;
                this.i = asList;
                this.j = dVar;
                this.k = new g(workDatabase);
                this.l = false;
                if (!applicationContext3.isDeviceProtectedStorage()) {
                    ((b) this.h).a.execute(new ForceStopRunnable(applicationContext3, this));
                    return;
                }
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            } catch (ClassNotFoundException unused) {
                StringBuilder P0 = i0.d.a.a.a.P0("cannot find implementation for ");
                P0.append(cls2.getCanonicalName());
                P0.append(". ");
                P0.append(str4);
                P0.append(" does not exist");
                throw new RuntimeException(P0.toString());
            } catch (IllegalAccessException unused2) {
                StringBuilder P02 = i0.d.a.a.a.P0("Cannot access the constructor");
                P02.append(cls2.getCanonicalName());
                throw new RuntimeException(P02.toString());
            } catch (InstantiationException unused3) {
                StringBuilder P03 = i0.d.a.a.a.P0("Failed to create an instance of ");
                P03.append(cls2.getCanonicalName());
                throw new RuntimeException(P03.toString());
            }
        } else {
            throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static h0.g0.r.l c(android.content.Context r2) {
        /*
            java.lang.Object r0 = d
            monitor-enter(r0)
            monitor-enter(r0)     // Catch:{ all -> 0x0035 }
            h0.g0.r.l r1 = b     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            goto L_0x000d
        L_0x000a:
            h0.g0.r.l r1 = c     // Catch:{ all -> 0x0030 }
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
        L_0x000d:
            if (r1 != 0) goto L_0x002e
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0035 }
            boolean r1 = r2 instanceof h0.g0.a.b     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0026
            r1 = r2
            h0.g0.a$b r1 = (h0.g0.a.b) r1     // Catch:{ all -> 0x0035 }
            h0.g0.a r1 = r1.a()     // Catch:{ all -> 0x0035 }
            d(r2, r1)     // Catch:{ all -> 0x0035 }
            h0.g0.r.l r1 = c(r2)     // Catch:{ all -> 0x0035 }
            goto L_0x002e
        L_0x0026:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."
            r2.<init>(r1)     // Catch:{ all -> 0x0035 }
            throw r2     // Catch:{ all -> 0x0035 }
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r1
        L_0x0030:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r2     // Catch:{ all -> 0x0035 }
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r2
        L_0x0035:
            r2 = move-exception
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g0.r.l.c(android.content.Context):h0.g0.r.l");
    }

    public static void d(Context context, a aVar) {
        synchronized (d) {
            l lVar = b;
            if (lVar != null) {
                if (c != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            }
            if (lVar == null) {
                Context applicationContext = context.getApplicationContext();
                if (c == null) {
                    c = new l(applicationContext, aVar, new b(aVar.b));
                }
                b = c;
            }
        }
    }

    public k a(String str, ExistingWorkPolicy existingWorkPolicy, List<h0.g0.j> list) {
        return new g(this, str, existingWorkPolicy, list, (List<g>) null).a();
    }

    public k b(List<? extends o> list) {
        if (!list.isEmpty()) {
            return new g(this, (String) null, ExistingWorkPolicy.KEEP, list, (List<g>) null).a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public void e() {
        List<JobInfo> f2;
        Context context = this.e;
        String str = h0.g0.r.p.c.b.c;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (!(jobScheduler == null || (f2 = h0.g0.r.p.c.b.f(context, jobScheduler)) == null || f2.isEmpty())) {
            for (JobInfo id : f2) {
                h0.g0.r.p.c.b.b(jobScheduler, id.getId());
            }
        }
        q qVar = (q) this.g.q();
        qVar.a.b();
        h0.y.a.f.f a2 = qVar.i.a();
        qVar.a.c();
        try {
            a2.a();
            qVar.a.k();
            qVar.a.g();
            h0.w.i iVar = qVar.i;
            if (a2 == iVar.c) {
                iVar.a.set(false);
            }
            f.a(this.f, this.g, this.i);
        } catch (Throwable th) {
            qVar.a.g();
            qVar.i.c(a2);
            throw th;
        }
    }

    public void f(String str) {
        h0.g0.r.t.q.a aVar = this.h;
        ((b) aVar).a.execute(new h0.g0.r.t.k(this, str, false));
    }

    public final void g() {
        try {
            this.n = (h0.g0.s.a) Class.forName("androidx.work.multiprocess.RemoteWorkManagerClient").getConstructor(new Class[]{Context.class, l.class}).newInstance(new Object[]{this.e, this});
        } catch (Throwable th) {
            i.c().a(a, "Unable to initialize multi-process support", th);
        }
    }
}
