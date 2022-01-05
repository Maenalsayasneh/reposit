package i0.j.a.i;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.instabug.library._InstabugActivity;
import com.instabug.library.model.common.Session;
import com.instabug.library.settings.SettingsManager;
import i0.j.a.h.e.c;
import i0.j.a.h.e.d.b;
import i0.j.a.h.e.d.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: ActivityCallbacks */
public class a implements Application.ActivityLifecycleCallbacks, i0.j.a.h.d.a {
    public static boolean c = false;
    public boolean Y1;
    public boolean Z1;
    public long a2;
    public long b2;
    public long c2;
    public Executor d = i0.j.a.g.a.f("app_launch_thread_executor");
    public long d2;
    public long e2;
    public long f2;
    public int g2;
    public c h2;
    public Map<String, b> i2;
    public i0.j.a.d.b.b j2;
    public i0.j.a.n.a.a q = i0.j.a.g.a.i();
    public Context x;
    public boolean y;

    /* renamed from: i0.j.a.i.a$a  reason: collision with other inner class name */
    /* compiled from: ActivityCallbacks */
    public class C0155a implements Runnable {
        public final /* synthetic */ Session c;

        public C0155a(Session session) {
            this.c = session;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0174, code lost:
            if (r3 == null) goto L_0x0180;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r14 = this;
                i0.j.a.i.a r0 = i0.j.a.i.a.this
                i0.j.a.d.b.b r0 = r0.j2
                if (r0 == 0) goto L_0x0184
                i0.j.a.h.a.a r0 = i0.j.a.g.a.k()
                com.instabug.library.model.common.Session r1 = r14.c
                java.lang.String r1 = r1.getId()
                i0.j.a.i.a r2 = i0.j.a.i.a.this
                i0.j.a.d.b.b r2 = r2.j2
                i0.j.a.d.a.a.a r3 = r0.a
                i0.j.a.d.a.a.b r3 = (i0.j.a.d.a.a.b) r3
                com.instabug.library.internal.storage.cache.db.DatabaseManager r4 = r3.a
                java.lang.String r5 = "app_launch"
                r6 = 0
                if (r4 == 0) goto L_0x00ca
                if (r2 == 0) goto L_0x00ca
                i0.j.a.n.a.a r4 = r3.b
                java.util.Objects.requireNonNull(r4)
                java.lang.String r4 = "Instabug - APM"
                java.lang.String r7 = "inserting app launch"
                com.instabug.library.util.InstabugSDKLogger.p(r4, r7)
                com.instabug.library.internal.storage.cache.db.DatabaseManager r7 = r3.a
                com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r7 = r7.openDatabase()
                android.content.ContentValues r8 = new android.content.ContentValues
                r8.<init>()
                java.lang.String r9 = "session_id"
                r8.put(r9, r1)
                java.lang.String r9 = r2.b
                if (r9 == 0) goto L_0x0046
                java.lang.String r10 = "name"
                r8.put(r10, r9)
            L_0x0046:
                java.lang.String r9 = r2.c
                if (r9 == 0) goto L_0x004f
                java.lang.String r10 = "screen_name"
                r8.put(r10, r9)
            L_0x004f:
                long r9 = r2.d
                java.lang.Long r9 = java.lang.Long.valueOf(r9)
                java.lang.String r10 = "start_time"
                r8.put(r10, r9)
                long r9 = r2.e
                java.lang.Long r9 = java.lang.Long.valueOf(r9)
                java.lang.String r10 = "duration"
                r8.put(r10, r9)
                long r8 = r7.insert(r5, r6, r8)
                java.util.Map<java.lang.String, java.lang.String> r2 = r2.f
                if (r2 == 0) goto L_0x00ab
                java.util.Set r2 = r2.entrySet()
                java.util.Iterator r2 = r2.iterator()
            L_0x0075:
                boolean r10 = r2.hasNext()
                if (r10 == 0) goto L_0x00ab
                java.lang.Object r10 = r2.next()
                java.util.Map$Entry r10 = (java.util.Map.Entry) r10
                android.content.ContentValues r11 = new android.content.ContentValues
                r11.<init>()
                java.lang.Long r12 = java.lang.Long.valueOf(r8)
                java.lang.String r13 = "app_launch_id"
                r11.put(r13, r12)
                java.lang.Object r12 = r10.getKey()
                java.lang.String r12 = (java.lang.String) r12
                java.lang.String r13 = "attribute_key"
                r11.put(r13, r12)
                java.lang.Object r10 = r10.getValue()
                java.lang.String r10 = (java.lang.String) r10
                java.lang.String r12 = "attribute_value"
                r11.put(r12, r10)
                java.lang.String r10 = "app_launch_attributes"
                r7.insert(r10, r6, r11)
                goto L_0x0075
            L_0x00ab:
                r7.close()
                i0.j.a.n.a.a r2 = r3.b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r7 = "inserting app launch done with id "
                r3.append(r7)
                r3.append(r8)
                java.lang.String r3 = r3.toString()
                java.util.Objects.requireNonNull(r2)
                com.instabug.library.util.InstabugSDKLogger.p(r4, r3)
                r2 = -1
                goto L_0x00ce
            L_0x00ca:
                r2 = -1
                r8 = -1
            L_0x00ce:
                int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r2 == 0) goto L_0x0180
                i0.j.a.d.a.d.f r2 = r0.b
                r3 = 0
                r4 = 2
                java.lang.String r7 = ")"
                r8 = 1
                if (r2 == 0) goto L_0x0121
                r2.m(r1, r8)
                i0.j.a.e.b r2 = r0.c
                i0.j.a.e.c r2 = (i0.j.a.e.c) r2
                android.content.SharedPreferences r2 = r2.a
                r9 = 500(0x1f4, double:2.47E-321)
                if (r2 == 0) goto L_0x00ee
                java.lang.String r11 = "LAUNCHES_PER_REQUEST_LIMIT"
                long r9 = r2.getLong(r11, r9)
            L_0x00ee:
                i0.j.a.d.a.a.a r2 = r0.a
                i0.j.a.d.a.a.b r2 = (i0.j.a.d.a.a.b) r2
                com.instabug.library.internal.storage.cache.db.DatabaseManager r11 = r2.a
                if (r11 == 0) goto L_0x0119
                java.lang.String r11 = "session_id = ? AND app_launch_id NOT IN ("
                java.lang.String r12 = "SELECT app_launch_id FROM app_launch where session_id = ? ORDER BY app_launch_id DESC LIMIT ?"
                java.lang.String r11 = i0.d.a.a.a.o0(r11, r12, r7)
                r12 = 3
                java.lang.String[] r12 = new java.lang.String[r12]
                r12[r3] = r1
                r12[r8] = r1
                java.lang.String r9 = java.lang.String.valueOf(r9)
                r12[r4] = r9
                com.instabug.library.internal.storage.cache.db.DatabaseManager r2 = r2.a
                com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r2 = r2.openDatabase()
                int r9 = r2.delete(r5, r11, r12)
                r2.close()
                goto L_0x011a
            L_0x0119:
                r9 = -1
            L_0x011a:
                if (r9 <= 0) goto L_0x0121
                i0.j.a.d.a.d.f r2 = r0.b
                r2.h(r1, r9)
            L_0x0121:
                i0.j.a.e.b r1 = r0.c
                i0.j.a.e.c r1 = (i0.j.a.e.c) r1
                android.content.SharedPreferences r1 = r1.a
                r9 = 2500(0x9c4, double:1.235E-320)
                if (r1 == 0) goto L_0x0131
                java.lang.String r2 = "LAUNCHES_STORE_LIMIT"
                long r9 = r1.getLong(r2, r9)
            L_0x0131:
                i0.j.a.d.a.a.a r0 = r0.a
                i0.j.a.d.a.a.b r0 = (i0.j.a.d.a.a.b) r0
                com.instabug.library.internal.storage.cache.db.DatabaseManager r1 = r0.a
                if (r1 == 0) goto L_0x0180
                java.lang.String r1 = "app_launch_id IN ("
                java.lang.String r2 = "SELECT app_launch_id FROM app_launch ORDER BY app_launch_id DESC LIMIT ? OFFSET ?"
                java.lang.String r1 = i0.d.a.a.a.o0(r1, r2, r7)
                java.lang.String[] r2 = new java.lang.String[r4]
                java.lang.String r4 = "-1"
                r2[r3] = r4
                java.lang.String r3 = java.lang.String.valueOf(r9)
                r2[r8] = r3
                com.instabug.library.internal.storage.cache.db.DatabaseManager r3 = r0.a
                com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r3 = r3.openDatabase()
                r3.delete(r5, r1, r2)     // Catch:{ Exception -> 0x0159 }
                goto L_0x0176
            L_0x0157:
                r0 = move-exception
                goto L_0x017a
            L_0x0159:
                r1 = move-exception
                i0.j.a.n.a.a r0 = r0.b     // Catch:{ all -> 0x0157 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0157 }
                r2.<init>()     // Catch:{ all -> 0x0157 }
                java.lang.String r4 = "DB execution a sql failed: "
                r2.append(r4)     // Catch:{ all -> 0x0157 }
                java.lang.String r4 = r1.getMessage()     // Catch:{ all -> 0x0157 }
                r2.append(r4)     // Catch:{ all -> 0x0157 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0157 }
                r0.b(r2, r1)     // Catch:{ all -> 0x0157 }
                if (r3 == 0) goto L_0x0180
            L_0x0176:
                r3.close()
                goto L_0x0180
            L_0x017a:
                if (r3 == 0) goto L_0x017f
                r3.close()
            L_0x017f:
                throw r0
            L_0x0180:
                i0.j.a.i.a r0 = i0.j.a.i.a.this
                r0.j2 = r6
            L_0x0184:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.j.a.i.a.C0155a.run():void");
        }
    }

    public a(Context context, Boolean bool) {
        boolean z = true;
        this.Y1 = true;
        this.Z1 = false;
        this.g2 = 0;
        this.i2 = new HashMap();
        c = true;
        i0.h.a.b.c.m.b.g(this);
        this.a2 = System.currentTimeMillis() * 1000;
        this.b2 = System.nanoTime() / 1000;
        this.x = context;
        this.y = bool.booleanValue();
        Context context2 = this.x;
        if (context2 != null) {
            ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
            if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                String packageName = this.x.getPackageName();
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.importance == 100 && next.processName.equals(packageName)) {
                        z = false;
                        break;
                    }
                }
            }
        }
        if (z) {
            this.Y1 = false;
        }
        this.h2 = i0.j.a.g.a.e();
    }

    public final long a(long j) {
        return TimeUnit.MICROSECONDS.toMillis(j);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        long nanoTime = System.nanoTime() / 1000;
        this.d2 = nanoTime;
        this.c2 = nanoTime;
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        long nanoTime = System.nanoTime();
        if (!(activity instanceof _InstabugActivity) && ((i0.j.a.e.c) i0.j.a.g.a.g()).g() && this.h2 != null) {
            if (SettingsManager.getInstance().getCurrentPlatform() == 2) {
                c cVar = this.h2;
                Map<String, b> map = this.i2;
                Objects.requireNonNull(cVar);
                b bVar = map.get(activity.getClass().getSimpleName());
                if (bVar != null) {
                    bVar.b(activity, nanoTime);
                }
                map.remove(activity.getClass().getSimpleName());
                return;
            }
            i0.j.a.h.e.d.a l = i0.j.a.g.a.l();
            String str = l.b;
            if (str != null && !str.isEmpty()) {
                c cVar2 = l.d;
                long nanoTime2 = System.nanoTime();
                String str2 = l.b;
                Map<String, b> map2 = l.c;
                Objects.requireNonNull(cVar2);
                b bVar2 = map2.get(str2);
                if (bVar2 != null) {
                    bVar2.b(activity, nanoTime2);
                }
                map2.remove(str2);
            }
        }
    }

    public void onActivityResumed(Activity activity) {
        long nanoTime = System.nanoTime() / 1000;
        long currentTimeMillis = System.currentTimeMillis();
        long nanoTime2 = System.nanoTime();
        if (!(activity instanceof _InstabugActivity) && ((i0.j.a.e.c) i0.j.a.g.a.g()).g() && this.h2 != null && SettingsManager.getInstance().getCurrentPlatform() == 2) {
            c cVar = this.h2;
            Map<String, b> map = this.i2;
            Objects.requireNonNull(cVar);
            d dVar = new d();
            dVar.c(activity, activity.getClass().getSimpleName(), activity.getTitle() != null ? activity.getTitle().toString() : "", currentTimeMillis, nanoTime2);
            map.put(activity.getClass().getSimpleName(), dVar);
        }
        if (((i0.j.a.e.c) i0.j.a.g.a.g()).l() && this.Z1 && this.y) {
            String name = activity.getClass().getName();
            if (this.Y1) {
                i0.j.a.d.b.b bVar = new i0.j.a.d.b.b();
                this.j2 = bVar;
                bVar.b = "cold";
                bVar.c = name;
                bVar.d = this.a2;
                bVar.e = nanoTime - this.b2;
                HashMap hashMap = new HashMap();
                hashMap.put("ap_on_c_mus", String.valueOf(this.c2 - this.b2));
                hashMap.put("ac_on_c_mus", String.valueOf(this.e2 - this.d2));
                hashMap.put("ac_on_st_mus", String.valueOf(nanoTime - this.f2));
                this.j2.f = hashMap;
                i0.j.a.n.a.a aVar = this.q;
                StringBuilder P0 = i0.d.a.a.a.P0("App took ");
                P0.append(a(nanoTime - this.b2));
                P0.append(" ms to launch.\nApp onCreate(): ");
                P0.append(a(this.d2 - this.b2));
                P0.append("  ms\nActivity onCreate(): ");
                P0.append(a(this.e2 - this.d2));
                P0.append(" ms\nActivity onStart(): ");
                P0.append(a(nanoTime - this.f2));
                P0.append(" ms");
                aVar.e(P0.toString());
            }
            this.Y1 = false;
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        long nanoTime = System.nanoTime() / 1000;
        this.f2 = nanoTime;
        this.e2 = nanoTime;
        int i = this.g2;
        this.Z1 = i == 0;
        this.g2 = i + 1;
        if (this.h2 != null && SettingsManager.getInstance().getCurrentPlatform() == 2) {
            Objects.requireNonNull(this.h2);
            ((i0.j.a.h.e.b) i0.j.a.g.a.n()).onActivityStarted(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        boolean z = true;
        int i = this.g2 - 1;
        this.g2 = i;
        this.Y1 = i != 0;
        if (!(activity instanceof _InstabugActivity)) {
            if (i != 0) {
                z = false;
            }
            if (this.h2 != null && SettingsManager.getInstance().getCurrentPlatform() == 2) {
                Objects.requireNonNull(this.h2);
                ((i0.j.a.h.e.b) i0.j.a.g.a.n()).b(activity, z);
            }
        }
    }

    public void onNewSessionStarted(Session session, Session session2) {
        if (this.j2 != null) {
            this.d.execute(new C0155a(session));
        }
    }
}
