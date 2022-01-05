package com.instabug.apm;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.instabug.library.InstabugState;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.InstabugStateEventBus;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventSubscriber;
import com.instabug.library.core.plugin.Plugin;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.model.common.Session;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.threading.PoolProvider;
import io.reactivex.disposables.CompositeDisposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class APMPlugin extends Plugin implements i0.j.a.h.d.a {
    /* access modifiers changed from: private */
    public final i0.j.a.n.a.a apmLogger = i0.j.a.g.a.i();
    private boolean isFirstLaunch = false;
    private CompositeDisposable sdkCoreEventsSubscriberDisposable;
    /* access modifiers changed from: private */
    public final i0.j.a.h.d.c sessionHandler = i0.j.a.g.a.a();

    public class a implements k0.b.y.d<InstabugState> {
        public a() {
        }

        public void b(Object obj) throws Exception {
            if (((InstabugState) obj) == InstabugState.DISABLED) {
                APMPlugin.this.apmLogger.e("Instabug is disabled, purging APM data…");
                APMPlugin.this.stopRunningMetrics();
                APMPlugin.this.endSession();
                APMPlugin.this.purgeData();
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ i0.j.a.k.a c;
        public final /* synthetic */ boolean d;

        public b(i0.j.a.k.a aVar, boolean z) {
            this.c = aVar;
            this.d = z;
        }

        public void run() {
            i0.j.a.k.b bVar = (i0.j.a.k.b) this.c;
            if (this.d || bVar.c()) {
                bVar.d();
            }
        }
    }

    public class c implements Runnable {
        public void run() {
            i0.j.a.h.e.d.d dVar = new i0.j.a.h.e.d.d();
            i0.j.a.h.e.e.a n = i0.j.a.g.a.n();
            if (InstabugInternalTrackingDelegate.getInstance().getCurrentActivity() != null) {
                dVar.b(InstabugInternalTrackingDelegate.getInstance().getCurrentActivity(), System.nanoTime());
            }
            i0.j.a.h.e.e.b bVar = (i0.j.a.h.e.e.b) n;
            Objects.requireNonNull(bVar);
            if (InstabugInternalTrackingDelegate.getInstance().getCurrentActivity() != null) {
                bVar.d(InstabugInternalTrackingDelegate.getInstance().getCurrentActivity());
            }
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ i0.j.a.h.b.a c;

        public d(i0.j.a.h.b.a aVar) {
            this.c = aVar;
        }

        public void run() {
            i0.j.a.h.b.c cVar = (i0.j.a.h.b.c) this.c;
            i0.j.a.d.a.b.d dVar = (i0.j.a.d.a.b.d) cVar.a;
            DatabaseManager databaseManager = dVar.b;
            if (databaseManager != null) {
                SQLiteDatabaseWrapper openDatabase = databaseManager.openDatabase();
                ArrayList<i0.j.a.d.b.c> b = dVar.b(openDatabase, openDatabase.rawQuery("select * from execution_traces where duration = -1", (String[]) null));
                openDatabase.close();
                Iterator<i0.j.a.d.b.c> it = b.iterator();
                while (it.hasNext()) {
                    String str = it.next().b;
                    if (str != null) {
                        dVar.c.f("Execution trace \"$s\" wasn't saved because it didn't end last session.".replace("$s", str));
                    }
                }
                i0.d.a.a.a.o(dVar.b, "delete from execution_traces where duration = -1");
            }
            i0.j.a.d.a.b.b bVar = (i0.j.a.d.a.b.b) cVar.b;
            if (bVar.a != null) {
                List<i0.j.a.d.b.c> b2 = bVar.b("select * from dangling_execution_traces where duration = -1");
                if (b2 != null) {
                    for (i0.j.a.d.b.c cVar2 : b2) {
                        String str2 = cVar2.b;
                        if (str2 != null) {
                            bVar.b.f("Execution trace \"$s\" wasn't saved because it didn't end last session.".replace("$s", str2));
                        }
                    }
                }
                i0.d.a.a.a.o(bVar.a, "delete from dangling_execution_traces where duration = -1");
            }
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ i0.j.a.h.c.a c;

        public e(i0.j.a.h.c.a aVar) {
            this.c = aVar;
        }

        public void run() {
            if (((i0.j.a.e.c) i0.j.a.g.a.g()).h()) {
                i0.j.a.h.c.c cVar = (i0.j.a.h.c.c) this.c;
                Objects.requireNonNull(cVar);
                i0.j.a.g.a.f("network_log_stop_thread_executor").execute(new i0.j.a.h.c.b(cVar));
            }
        }
    }

    public class f implements k0.b.y.d<SDKCoreEvent> {
        public f() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0106  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x016a  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x01c6  */
        @android.annotation.SuppressLint({"NULL_DEREFERENCE"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(java.lang.Object r14) throws java.lang.Exception {
            /*
                r13 = this;
                com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent r14 = (com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent) r14
                java.lang.String r0 = r14.getType()
                java.lang.String r1 = "featuresFetched"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x01ea
                java.lang.Class<i0.j.a.g.a> r0 = i0.j.a.g.a.class
                monitor-enter(r0)
                i0.j.a.e.a r1 = i0.j.a.g.a.c     // Catch:{ all -> 0x01e7 }
                if (r1 != 0) goto L_0x0020
                i0.j.a.e.a r1 = new i0.j.a.e.a     // Catch:{ all -> 0x01e7 }
                i0.j.a.e.b r2 = i0.j.a.g.a.g()     // Catch:{ all -> 0x01e7 }
                r1.<init>(r2)     // Catch:{ all -> 0x01e7 }
                i0.j.a.g.a.c = r1     // Catch:{ all -> 0x01e7 }
            L_0x0020:
                i0.j.a.e.a r1 = i0.j.a.g.a.c     // Catch:{ all -> 0x01e7 }
                monitor-exit(r0)
                java.lang.String r14 = r14.getValue()
                java.util.Objects.requireNonNull(r1)
                java.lang.String r0 = "SYNC_INTERVAL"
                java.lang.String r2 = "DEBUG_MODE_ENABLED"
                r3 = 21600(0x5460, double:1.0672E-319)
                java.lang.String r5 = "CRASH_DETECTION_ENABLED"
                java.lang.String r6 = "IS_APM_FEATURE_AVAILABLE"
                java.lang.String r7 = "Instabug - APM"
                r8 = 0
                if (r14 == 0) goto L_0x00fb
                org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00e8 }
                r9.<init>((java.lang.String) r14)     // Catch:{ JSONException -> 0x00e8 }
                java.lang.String r14 = "apm"
                org.json.JSONObject r14 = r9.optJSONObject(r14)     // Catch:{ JSONException -> 0x00e8 }
                if (r14 == 0) goto L_0x00dc
                java.lang.String r9 = "enabled"
                boolean r9 = r14.optBoolean(r9, r8)     // Catch:{ JSONException -> 0x00e8 }
                i0.j.a.e.b r10 = r1.a     // Catch:{ JSONException -> 0x00e8 }
                i0.j.a.e.c r10 = (i0.j.a.e.c) r10     // Catch:{ JSONException -> 0x00e8 }
                android.content.SharedPreferences$Editor r10 = r10.b     // Catch:{ JSONException -> 0x00e8 }
                if (r10 == 0) goto L_0x005b
                android.content.SharedPreferences$Editor r9 = r10.putBoolean(r6, r9)     // Catch:{ JSONException -> 0x00e8 }
                r9.apply()     // Catch:{ JSONException -> 0x00e8 }
            L_0x005b:
                java.lang.String r9 = "crash_detection_enabled"
                boolean r9 = r14.optBoolean(r9, r8)     // Catch:{ JSONException -> 0x00e8 }
                i0.j.a.e.b r10 = r1.a     // Catch:{ JSONException -> 0x00e8 }
                i0.j.a.e.c r10 = (i0.j.a.e.c) r10     // Catch:{ JSONException -> 0x00e8 }
                android.content.SharedPreferences$Editor r10 = r10.b     // Catch:{ JSONException -> 0x00e8 }
                if (r10 == 0) goto L_0x0070
                android.content.SharedPreferences$Editor r9 = r10.putBoolean(r5, r9)     // Catch:{ JSONException -> 0x00e8 }
                r9.apply()     // Catch:{ JSONException -> 0x00e8 }
            L_0x0070:
                java.lang.String r9 = "debug_mode_enabled"
                boolean r9 = r14.optBoolean(r9, r8)     // Catch:{ JSONException -> 0x00e8 }
                i0.j.a.e.b r10 = r1.a     // Catch:{ JSONException -> 0x00e8 }
                i0.j.a.e.c r10 = (i0.j.a.e.c) r10     // Catch:{ JSONException -> 0x00e8 }
                android.content.SharedPreferences$Editor r10 = r10.b     // Catch:{ JSONException -> 0x00e8 }
                if (r10 == 0) goto L_0x0081
                r10.putBoolean(r2, r9)     // Catch:{ JSONException -> 0x00e8 }
            L_0x0081:
                java.lang.String r9 = "sync_interval"
                long r9 = r14.optLong(r9, r3)     // Catch:{ JSONException -> 0x00e8 }
                i0.j.a.e.b r11 = r1.a     // Catch:{ JSONException -> 0x00e8 }
                i0.j.a.e.c r11 = (i0.j.a.e.c) r11     // Catch:{ JSONException -> 0x00e8 }
                android.content.SharedPreferences$Editor r11 = r11.b     // Catch:{ JSONException -> 0x00e8 }
                if (r11 == 0) goto L_0x0096
                android.content.SharedPreferences$Editor r9 = r11.putLong(r0, r9)     // Catch:{ JSONException -> 0x00e8 }
                r9.apply()     // Catch:{ JSONException -> 0x00e8 }
            L_0x0096:
                java.lang.String r9 = "disabled_android_sdk_versions"
                org.json.JSONArray r9 = r14.optJSONArray(r9)     // Catch:{ JSONException -> 0x00e8 }
                if (r9 == 0) goto L_0x00cf
                int r10 = r9.length()     // Catch:{ JSONException -> 0x00e8 }
                if (r10 <= 0) goto L_0x00cf
                java.util.HashSet r10 = new java.util.HashSet     // Catch:{ JSONException -> 0x00e8 }
                int r11 = r9.length()     // Catch:{ JSONException -> 0x00e8 }
                r10.<init>(r11)     // Catch:{ JSONException -> 0x00e8 }
                r11 = r8
            L_0x00ae:
                int r12 = r9.length()     // Catch:{ JSONException -> 0x00e8 }
                if (r11 >= r12) goto L_0x00c2
                java.lang.Object r12 = r9.get(r11)     // Catch:{ JSONException -> 0x00e8 }
                java.lang.String r12 = r12.toString()     // Catch:{ JSONException -> 0x00e8 }
                r10.add(r12)     // Catch:{ JSONException -> 0x00e8 }
                int r11 = r11 + 1
                goto L_0x00ae
            L_0x00c2:
                i0.j.a.e.b r9 = r1.a     // Catch:{ JSONException -> 0x00e8 }
                i0.j.a.e.c r9 = (i0.j.a.e.c) r9     // Catch:{ JSONException -> 0x00e8 }
                android.content.SharedPreferences$Editor r9 = r9.b     // Catch:{ JSONException -> 0x00e8 }
                if (r9 == 0) goto L_0x00cf
                java.lang.String r11 = "KEY_DISABLED_SDK_VERSIONS"
                r9.putStringSet(r11, r10)     // Catch:{ JSONException -> 0x00e8 }
            L_0x00cf:
                r1.d(r14)     // Catch:{ JSONException -> 0x00e8 }
                r1.f(r14)     // Catch:{ JSONException -> 0x00e8 }
                r1.h(r14)     // Catch:{ JSONException -> 0x00e8 }
                r1.b(r14)     // Catch:{ JSONException -> 0x00e8 }
                goto L_0x00e6
            L_0x00dc:
                i0.j.a.n.a.a r14 = r1.b     // Catch:{ JSONException -> 0x00e8 }
                java.lang.String r9 = "Can't parse APM configurations, object is null."
                java.util.Objects.requireNonNull(r14)     // Catch:{ JSONException -> 0x00e8 }
                com.instabug.library.util.InstabugSDKLogger.p(r7, r9)     // Catch:{ JSONException -> 0x00e8 }
            L_0x00e6:
                r14 = 1
                goto L_0x00fc
            L_0x00e8:
                r14 = move-exception
                i0.j.a.n.a.a r9 = r1.b
                java.lang.String r10 = r14.getMessage()
                if (r10 == 0) goto L_0x00f6
                java.lang.String r10 = r14.getMessage()
                goto L_0x00f8
            L_0x00f6:
                java.lang.String r10 = ""
            L_0x00f8:
                r9.b(r10, r14)
            L_0x00fb:
                r14 = r8
            L_0x00fc:
                i0.j.a.e.b r9 = r1.a
                i0.j.a.e.c r9 = (i0.j.a.e.c) r9
                boolean r9 = r9.m()
                if (r9 == 0) goto L_0x016a
                i0.j.a.n.a.a r0 = r1.b
                java.lang.String r2 = "APM feature configs: \nEnabled: "
                java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
                i0.j.a.e.b r3 = r1.a
                i0.j.a.e.c r3 = (i0.j.a.e.c) r3
                boolean r3 = r3.m()
                r2.append(r3)
                java.lang.String r3 = "\nTraces Enabled: "
                r2.append(r3)
                i0.j.a.e.b r3 = r1.a
                i0.j.a.e.c r3 = (i0.j.a.e.c) r3
                boolean r3 = r3.k()
                r2.append(r3)
                java.lang.String r3 = "\nApp Launches Enabled: "
                r2.append(r3)
                i0.j.a.e.b r3 = r1.a
                i0.j.a.e.c r3 = (i0.j.a.e.c) r3
                boolean r3 = r3.b()
                r2.append(r3)
                java.lang.String r3 = "\nNetwork Logs Enabled: "
                r2.append(r3)
                i0.j.a.e.b r3 = r1.a
                i0.j.a.e.c r3 = (i0.j.a.e.c) r3
                android.content.SharedPreferences r3 = r3.a
                if (r3 == 0) goto L_0x014c
                java.lang.String r4 = "NETWORK_ENABLED"
                boolean r8 = r3.getBoolean(r4, r8)
            L_0x014c:
                r2.append(r8)
                java.lang.String r3 = "\nUI Traces Enabled: "
                r2.append(r3)
                i0.j.a.e.b r1 = r1.a
                i0.j.a.e.c r1 = (i0.j.a.e.c) r1
                boolean r1 = r1.f()
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.util.Objects.requireNonNull(r0)
                com.instabug.library.util.InstabugSDKLogger.p(r7, r1)
                goto L_0x01c4
            L_0x016a:
                i0.j.a.n.a.a r9 = r1.b
                java.util.Objects.requireNonNull(r9)
                java.lang.String r9 = "APM feature configs: \nEnabled: false"
                com.instabug.library.util.InstabugSDKLogger.p(r7, r9)
                i0.j.a.e.b r7 = r1.a
                i0.j.a.e.c r7 = (i0.j.a.e.c) r7
                android.content.SharedPreferences$Editor r7 = r7.b
                if (r7 == 0) goto L_0x0183
                android.content.SharedPreferences$Editor r6 = r7.putBoolean(r6, r8)
                r6.apply()
            L_0x0183:
                i0.j.a.e.b r6 = r1.a
                i0.j.a.e.c r6 = (i0.j.a.e.c) r6
                android.content.SharedPreferences$Editor r6 = r6.b
                if (r6 == 0) goto L_0x0192
                android.content.SharedPreferences$Editor r5 = r6.putBoolean(r5, r8)
                r5.apply()
            L_0x0192:
                i0.j.a.e.b r5 = r1.a
                i0.j.a.e.c r5 = (i0.j.a.e.c) r5
                android.content.SharedPreferences$Editor r5 = r5.b
                if (r5 == 0) goto L_0x019d
                r5.putBoolean(r2, r8)
            L_0x019d:
                i0.j.a.e.b r2 = r1.a
                i0.j.a.e.c r2 = (i0.j.a.e.c) r2
                android.content.SharedPreferences$Editor r2 = r2.b
                if (r2 == 0) goto L_0x01ac
                android.content.SharedPreferences$Editor r0 = r2.putLong(r0, r3)
                r0.apply()
            L_0x01ac:
                r1.k()
                r1.g()
                r1.l()
                r1.i()
                r1.e()
                r1.c()
                r1.j()
                r1.a()
            L_0x01c4:
                if (r14 == 0) goto L_0x0292
                com.instabug.library.model.common.Session r14 = com.instabug.library.core.InstabugCore.getRunningSession()
                if (r14 == 0) goto L_0x01db
                com.instabug.apm.APMPlugin r0 = com.instabug.apm.APMPlugin.this
                i0.h.a.b.c.m.b.g(r0)
                com.instabug.apm.APMPlugin r0 = com.instabug.apm.APMPlugin.this
                r0.startSession(r14)
                com.instabug.apm.APMPlugin r14 = com.instabug.apm.APMPlugin.this
                r14.registerSessionCrashHandler()
            L_0x01db:
                com.instabug.apm.APMPlugin r14 = com.instabug.apm.APMPlugin.this
                r14.registerActivityLifeCycleCallbacks()
                com.instabug.apm.APMPlugin r14 = com.instabug.apm.APMPlugin.this
                r14.registerSessionCrashHandler()
                goto L_0x0292
            L_0x01e7:
                r14 = move-exception
                monitor-exit(r0)
                throw r14
            L_0x01ea:
                java.lang.String r0 = r14.getType()
                java.lang.String r1 = "cross_platform_state_screen_changed"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0281
                java.lang.String r14 = r14.getValue()
                i0.j.a.h.e.d.a r0 = i0.j.a.g.a.l()
                java.lang.String r1 = r0.a
                java.lang.String r2 = ""
                boolean r1 = r1.equals(r2)
                java.lang.String r3 = "Can not trace the current screen because Activity is null"
                if (r1 == 0) goto L_0x0231
                java.lang.String r1 = r0.b
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0231
                long r4 = java.lang.System.currentTimeMillis()
                long r6 = java.lang.System.nanoTime()
                com.instabug.library.tracking.InstabugInternalTrackingDelegate r1 = com.instabug.library.tracking.InstabugInternalTrackingDelegate.getInstance()
                android.app.Activity r2 = r1.getCurrentActivity()
                if (r2 == 0) goto L_0x022d
                i0.j.a.h.e.c r1 = r0.d
                java.util.Map<java.lang.String, i0.j.a.h.e.d.b> r8 = r0.c
                r3 = r14
                r1.a(r2, r3, r4, r6, r8)
                goto L_0x027e
            L_0x022d:
                com.instabug.apm.logger.APMLogger.d(r3)
                goto L_0x027e
            L_0x0231:
                com.instabug.library.tracking.InstabugInternalTrackingDelegate r1 = com.instabug.library.tracking.InstabugInternalTrackingDelegate.getInstance()
                android.app.Activity r1 = r1.getCurrentActivity()
                long r4 = java.lang.System.nanoTime()
                if (r1 == 0) goto L_0x0257
                i0.j.a.h.e.c r2 = r0.d
                java.lang.String r6 = r0.b
                java.util.Map<java.lang.String, i0.j.a.h.e.d.b> r7 = r0.c
                java.util.Objects.requireNonNull(r2)
                java.lang.Object r2 = r7.get(r6)
                i0.j.a.h.e.d.b r2 = (i0.j.a.h.e.d.b) r2
                if (r2 == 0) goto L_0x0253
                r2.b(r1, r4)
            L_0x0253:
                r7.remove(r6)
                goto L_0x025c
            L_0x0257:
                java.lang.String r1 = "Can not stop tracing the current screen because Activity is null"
                com.instabug.apm.logger.APMLogger.d(r1)
            L_0x025c:
                java.lang.String r1 = r0.b
                r0.a = r1
                long r4 = java.lang.System.currentTimeMillis()
                long r6 = java.lang.System.nanoTime()
                com.instabug.library.tracking.InstabugInternalTrackingDelegate r1 = com.instabug.library.tracking.InstabugInternalTrackingDelegate.getInstance()
                android.app.Activity r2 = r1.getCurrentActivity()
                if (r2 == 0) goto L_0x027b
                i0.j.a.h.e.c r1 = r0.d
                java.util.Map<java.lang.String, i0.j.a.h.e.d.b> r8 = r0.c
                r3 = r14
                r1.a(r2, r3, r4, r6, r8)
                goto L_0x027e
            L_0x027b:
                com.instabug.apm.logger.APMLogger.d(r3)
            L_0x027e:
                r0.b = r14
                goto L_0x0292
            L_0x0281:
                java.lang.String r14 = r14.getType()
                java.lang.String r0 = "cross_platform_crashed"
                boolean r14 = r14.equals(r0)
                if (r14 == 0) goto L_0x0292
                com.instabug.apm.APMPlugin r14 = com.instabug.apm.APMPlugin.this
                r14.updateCurrentSession()
            L_0x0292:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.apm.APMPlugin.f.b(java.lang.Object):void");
        }
    }

    public class g implements Runnable {
        public g() {
        }

        public void run() {
            if (InstabugCore.getRunningSession() != null) {
                ((i0.j.a.h.d.d) APMPlugin.this.sessionHandler).a(1);
            }
        }
    }

    public class h implements Runnable {
        public final /* synthetic */ Session c;
        public final /* synthetic */ Session d;

        public h(Session session, Session session2) {
            this.c = session;
            this.d = session2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0145  */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x0036  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r13 = this;
                com.instabug.library.model.common.Session r0 = r13.c
                if (r0 == 0) goto L_0x0210
                i0.j.a.d.a.c.e r0 = new i0.j.a.d.a.c.e
                i0.j.a.d.a.c.d r1 = new i0.j.a.d.a.c.d
                r1.<init>()
                i0.j.a.d.a.c.b r2 = new i0.j.a.d.a.c.b
                com.instabug.library.internal.storage.cache.db.DatabaseManager r3 = i0.j.a.g.a.p()
                r2.<init>(r3)
                i0.j.a.e.b r3 = i0.j.a.g.a.g()
                i0.j.a.d.a.d.f r4 = i0.j.a.g.a.b()
                r0.<init>(r1, r2, r3, r4)
                com.instabug.library.model.common.Session r1 = r13.d
                com.instabug.library.model.common.Session r2 = r13.c
                i0.j.a.e.b r3 = r0.c
                i0.j.a.e.c r3 = (i0.j.a.e.c) r3
                long r3 = r3.d()
            L_0x002b:
                i0.j.a.d.a.c.a r5 = r0.b
                i0.j.a.d.a.c.b r5 = (i0.j.a.d.a.c.b) r5
                com.instabug.library.internal.storage.cache.db.DatabaseManager r6 = r5.a
                r7 = 0
                r8 = 0
                r9 = 1
                if (r6 == 0) goto L_0x0141
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.lang.String r10 = "select * from dangling_apm_network_log limit "
                java.lang.String r10 = i0.d.a.a.a.k0(r10, r3)
                com.instabug.library.internal.storage.cache.db.DatabaseManager r5 = r5.a
                com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r5 = r5.openDatabase()
                android.database.Cursor r7 = r5.rawQuery(r10, r7)
                if (r7 == 0) goto L_0x013d
            L_0x004d:
                boolean r10 = r7.moveToNext()
                if (r10 == 0) goto L_0x013a
                com.instabug.apm.model.APMNetworkLog r10 = new com.instabug.apm.model.APMNetworkLog
                r10.<init>()
                java.lang.String r11 = "log_id"
                int r11 = r7.getColumnIndex(r11)
                int r11 = r7.getInt(r11)
                long r11 = (long) r11
                r10.setId(r11)
                java.lang.String r11 = "method"
                int r11 = r7.getColumnIndex(r11)
                java.lang.String r11 = r7.getString(r11)
                r10.setMethod(r11)
                java.lang.String r11 = "carrier"
                int r11 = r7.getColumnIndex(r11)
                java.lang.String r11 = r7.getString(r11)
                r10.setCarrier(r11)
                java.lang.String r11 = "error_message"
                int r11 = r7.getColumnIndex(r11)
                java.lang.String r11 = r7.getString(r11)
                r10.setErrorMessage(r11)
                java.lang.String r11 = "radio"
                int r11 = r7.getColumnIndex(r11)
                java.lang.String r11 = r7.getString(r11)
                r10.setRadio(r11)
                java.lang.String r11 = "request_body_size"
                int r11 = r7.getColumnIndex(r11)
                int r11 = r7.getInt(r11)
                long r11 = (long) r11
                r10.setRequestBodySize(r11)
                java.lang.String r11 = "request_content_type"
                int r11 = r7.getColumnIndex(r11)
                java.lang.String r11 = r7.getString(r11)
                r10.setRequestContentType(r11)
                java.lang.String r11 = "request_headers"
                int r11 = r7.getColumnIndex(r11)
                java.lang.String r11 = r7.getString(r11)
                r10.setRequestHeaders(r11)
                java.lang.String r11 = "response_body_size"
                int r11 = r7.getColumnIndex(r11)
                int r11 = r7.getInt(r11)
                long r11 = (long) r11
                r10.setResponseBodySize(r11)
                java.lang.String r11 = "response_code"
                int r11 = r7.getColumnIndex(r11)
                int r11 = r7.getInt(r11)
                r10.setResponseCode(r11)
                java.lang.String r11 = "response_content_type"
                int r11 = r7.getColumnIndex(r11)
                java.lang.String r11 = r7.getString(r11)
                r10.setResponseContentType(r11)
                java.lang.String r11 = "response_headers"
                int r11 = r7.getColumnIndex(r11)
                java.lang.String r11 = r7.getString(r11)
                r10.setResponseHeaders(r11)
                java.lang.String r11 = "start_time"
                int r11 = r7.getColumnIndex(r11)
                long r11 = r7.getLong(r11)
                java.lang.Long r11 = java.lang.Long.valueOf(r11)
                r10.setStartTime(r11)
                java.lang.String r11 = "duration"
                int r11 = r7.getColumnIndex(r11)
                int r11 = r7.getInt(r11)
                long r11 = (long) r11
                r10.setTotalDuration(r11)
                java.lang.String r11 = "url"
                int r11 = r7.getColumnIndex(r11)
                java.lang.String r11 = r7.getString(r11)
                r10.setUrl(r11)
                java.lang.String r11 = "executed_on_background"
                int r11 = r7.getColumnIndex(r11)
                int r11 = r7.getInt(r11)
                if (r11 != r9) goto L_0x0131
                r11 = r9
                goto L_0x0132
            L_0x0131:
                r11 = r8
            L_0x0132:
                r10.setExecutedInBackground(r11)
                r6.add(r10)
                goto L_0x004d
            L_0x013a:
                r7.close()
            L_0x013d:
                r5.close()
                r7 = r6
            L_0x0141:
                java.lang.String r5 = ")"
                if (r7 == 0) goto L_0x017b
                java.util.Iterator r6 = r7.iterator()
            L_0x0149:
                boolean r10 = r6.hasNext()
                if (r10 == 0) goto L_0x0164
                java.lang.Object r10 = r6.next()
                com.instabug.apm.model.APMNetworkLog r10 = (com.instabug.apm.model.APMNetworkLog) r10
                boolean r11 = r10.executedInBackground()
                r11 = r11 ^ r9
                if (r11 == 0) goto L_0x0160
                r0.a(r10, r2)
                goto L_0x0149
            L_0x0160:
                r0.a(r10, r1)
                goto L_0x0149
            L_0x0164:
                i0.j.a.d.a.c.a r6 = r0.b
                int r10 = r7.size()
                i0.j.a.d.a.c.b r6 = (i0.j.a.d.a.c.b) r6
                com.instabug.library.internal.storage.cache.db.DatabaseManager r11 = r6.a
                if (r11 == 0) goto L_0x017b
                java.lang.String r11 = "delete from dangling_apm_network_log where log_id in (select log_id from dangling_apm_network_log limit "
                java.lang.String r10 = i0.d.a.a.a.g0(r11, r10, r5)
                com.instabug.library.internal.storage.cache.db.DatabaseManager r6 = r6.a
                i0.d.a.a.a.o(r6, r10)
            L_0x017b:
                if (r7 == 0) goto L_0x0183
                int r6 = r7.size()
                if (r6 > 0) goto L_0x002b
            L_0x0183:
                i0.j.a.d.a.b.e r0 = new i0.j.a.d.a.b.e
                i0.j.a.d.a.b.c r1 = i0.j.a.g.a.q()
                i0.j.a.d.a.b.a r2 = i0.j.a.g.a.o()
                i0.j.a.e.b r3 = i0.j.a.g.a.g()
                java.lang.String r4 = "session_thread_executor"
                i0.j.a.g.a.f(r4)
                i0.j.a.d.a.d.f r4 = i0.j.a.g.a.b()
                r0.<init>(r1, r2, r3, r4)
                com.instabug.library.model.common.Session r1 = r13.d
                com.instabug.library.model.common.Session r2 = r13.c
                i0.j.a.e.c r3 = (i0.j.a.e.c) r3
                long r3 = r3.e()
            L_0x01a7:
                i0.j.a.d.a.b.a r6 = r0.b
                i0.j.a.d.a.b.b r6 = (i0.j.a.d.a.b.b) r6
                java.util.Objects.requireNonNull(r6)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r10 = "Select * from dangling_execution_traces where duration != -1 limit "
                r7.append(r10)
                r7.append(r3)
                java.lang.String r7 = r7.toString()
                java.util.List r6 = r6.b(r7)
                if (r6 == 0) goto L_0x0208
                java.util.Iterator r7 = r6.iterator()
            L_0x01c9:
                boolean r10 = r7.hasNext()
                if (r10 == 0) goto L_0x01f0
                java.lang.Object r10 = r7.next()
                i0.j.a.d.b.c r10 = (i0.j.a.d.b.c) r10
                boolean r11 = r10.f
                if (r11 != 0) goto L_0x01dd
                boolean r12 = r10.g
                if (r12 != 0) goto L_0x01e3
            L_0x01dd:
                if (r11 != 0) goto L_0x01e5
                boolean r11 = r10.g
                if (r11 != 0) goto L_0x01e5
            L_0x01e3:
                r11 = r9
                goto L_0x01e6
            L_0x01e5:
                r11 = r8
            L_0x01e6:
                if (r11 == 0) goto L_0x01ec
                r0.a(r10, r2)
                goto L_0x01c9
            L_0x01ec:
                r0.a(r10, r1)
                goto L_0x01c9
            L_0x01f0:
                i0.j.a.d.a.b.a r7 = r0.b
                int r10 = r6.size()
                long r10 = (long) r10
                i0.j.a.d.a.b.b r7 = (i0.j.a.d.a.b.b) r7
                com.instabug.library.internal.storage.cache.db.DatabaseManager r12 = r7.a
                if (r12 == 0) goto L_0x0208
                java.lang.String r12 = "delete from dangling_execution_traces where trace_id in (select trace_id from dangling_execution_traces where duration != -1 limit "
                java.lang.String r10 = i0.d.a.a.a.l0(r12, r10, r5)
                com.instabug.library.internal.storage.cache.db.DatabaseManager r7 = r7.a
                i0.d.a.a.a.o(r7, r10)
            L_0x0208:
                if (r6 == 0) goto L_0x0210
                int r6 = r6.size()
                if (r6 > 0) goto L_0x01a7
            L_0x0210:
                i0.j.a.k.a r0 = i0.j.a.g.a.j()
                i0.j.a.k.b r0 = (i0.j.a.k.b) r0
                boolean r1 = r0.c()
                if (r1 == 0) goto L_0x021f
                r0.d()
            L_0x021f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.apm.APMPlugin.h.run():void");
        }
    }

    private void clearInvalidCache() {
        i0.j.a.h.b.a r = i0.j.a.g.a.r();
        i0.j.a.h.c.c cVar = new i0.j.a.h.c.c();
        i0.j.a.g.a.f("execution_traces_thread_executor").execute(new d(r));
        i0.j.a.g.a.f("network_log_thread_executor").execute(new e(cVar));
    }

    /* access modifiers changed from: private */
    public void endSession() {
        ((i0.j.a.h.d.d) this.sessionHandler).a(0);
    }

    /* access modifiers changed from: private */
    public void purgeData() {
        SharedPreferences.Editor editor = ((i0.j.a.e.c) i0.j.a.g.a.g()).b;
        if (editor != null) {
            editor.putLong("LAST_SYNC_TIME", -1).apply();
        }
        i0.j.a.k.b bVar = (i0.j.a.k.b) i0.j.a.g.a.j();
        i0.j.a.g.a.f("session_purging_thread_executor").execute(new b(bVar, bVar.c()));
    }

    /* access modifiers changed from: private */
    public void registerActivityLifeCycleCallbacks() {
        Context m;
        if (((i0.j.a.e.c) i0.j.a.g.a.g()).a() && (m = i0.j.a.g.a.m()) != null && !i0.j.a.i.a.c) {
            ((Application) m.getApplicationContext()).registerActivityLifecycleCallbacks(new i0.j.a.i.a(m, Boolean.FALSE));
        }
    }

    private void registerConfigurationChange() {
        CompositeDisposable compositeDisposable = this.sdkCoreEventsSubscriberDisposable;
        if (compositeDisposable == null || compositeDisposable.isDisposed()) {
            this.sdkCoreEventsSubscriberDisposable = new CompositeDisposable();
        }
        this.sdkCoreEventsSubscriberDisposable.add(SDKCoreEventSubscriber.subscribe(new f()));
    }

    /* access modifiers changed from: private */
    public void registerSessionCrashHandler() {
        if (((i0.j.a.e.c) i0.j.a.g.a.g()).j() && !(Thread.getDefaultUncaughtExceptionHandler() instanceof i0.j.a.h.d.b)) {
            Thread.setDefaultUncaughtExceptionHandler(new i0.j.a.h.d.b());
        }
    }

    /* access modifiers changed from: private */
    public void startSession(Session session) {
        i0.j.a.h.d.d dVar = (i0.j.a.h.d.d) this.sessionHandler;
        if (((i0.j.a.e.c) dVar.a).a() && dVar.f == null && dVar.e == null) {
            dVar.e = new i0.j.a.h.d.e(dVar, session);
            if (((i0.j.a.e.c) dVar.a).a()) {
                dVar.e.run();
            }
        }
    }

    /* access modifiers changed from: private */
    public void stopRunningMetrics() {
        i0.j.a.h.b.a r = i0.j.a.g.a.r();
        i0.j.a.h.c.c cVar = new i0.j.a.h.c.c();
        i0.j.a.h.b.c cVar2 = (i0.j.a.h.b.c) r;
        Objects.requireNonNull(cVar2);
        i0.j.a.g.a.f("execution_traces_stop_thread_executor").execute(new i0.j.a.h.b.b(cVar2));
        i0.j.a.g.a.f("network_log_stop_thread_executor").execute(new i0.j.a.h.c.b(cVar));
        PoolProvider.postMainThreadTask(new c());
    }

    private void subscribeToSDKState() {
        CompositeDisposable compositeDisposable = this.sdkCoreEventsSubscriberDisposable;
        if (compositeDisposable == null || compositeDisposable.isDisposed()) {
            this.sdkCoreEventsSubscriberDisposable = new CompositeDisposable();
        }
        this.sdkCoreEventsSubscriberDisposable.add(InstabugStateEventBus.getInstance().getEventObservable().t(new a(), k0.b.z.b.a.e, k0.b.z.b.a.c, k0.b.z.b.a.d));
    }

    /* access modifiers changed from: private */
    public void updateCurrentSession() {
        i0.j.a.g.a.f("session_thread_executor").execute(new g());
    }

    public long getLastActivityTime() {
        return 0;
    }

    public void onNewSessionStarted(Session session, Session session2) {
        i0.j.a.g.a.f("session_thread_executor").execute(new h(session2, session));
    }

    public void sleep() {
        endSession();
    }

    public void start(Context context) {
        this.isFirstLaunch = true;
        registerConfigurationChange();
        subscribeToSDKState();
    }

    public void stop() {
        CompositeDisposable compositeDisposable = this.sdkCoreEventsSubscriberDisposable;
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            this.sdkCoreEventsSubscriberDisposable.dispose();
        }
    }

    public void wake() {
        Session runningSession = InstabugCore.getRunningSession();
        if (runningSession != null) {
            i0.h.a.b.c.m.b.g(this);
            startSession(runningSession);
            registerSessionCrashHandler();
        } else {
            this.apmLogger.f("APM session not created. Core session is null");
        }
        if (((i0.j.a.e.c) i0.j.a.g.a.g()).a() && this.isFirstLaunch) {
            clearInvalidCache();
            this.isFirstLaunch = false;
        }
    }
}
