package i0.j.e;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugState;
import com.instabug.library.InstabugStateProvider;
import com.instabug.library.PresentationManager;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.InstabugStateEventBus;
import com.instabug.library.core.eventbus.SessionStateEventBus;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventSubscriber;
import com.instabug.library.core.plugin.Plugin;
import com.instabug.library.internal.device.InstabugDeviceProperties;
import com.instabug.library.internal.orchestrator.Action;
import com.instabug.library.internal.orchestrator.ActionsOrchestrator;
import com.instabug.library.internal.storage.cache.UserAttributesCacheManager;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.utils.PreferencesUtils;
import com.instabug.library.internal.video.InternalAutoScreenRecorderHelper;
import com.instabug.library.invocation.InstabugInvocationEvent;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.migration.AbstractMigration;
import com.instabug.library.model.StepType;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request;
import com.instabug.library.networkv2.request.Header;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.ui.onboarding.OnboardingActivity;
import com.instabug.library.ui.onboarding.WelcomeMessage;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.OrientationUtils;
import com.instabug.library.util.TaskDebouncer;
import com.instabug.library.util.TimeUtils;
import com.instabug.library.util.memory.MemoryUtils;
import com.instabug.library.util.threading.PoolProvider;
import i0.j.e.d.a;
import i0.j.e.r0.j;
import i0.j.e.r0.k;
import i0.j.e.r0.l;
import i0.j.e.r0.m;
import i0.j.e.r0.n;
import i0.j.e.r0.o;
import i0.j.e.r0.p;
import i0.j.e.r0.q;
import i0.j.e.v0.e.j.r;
import io.reactivex.internal.observers.CallbackCompletableObserver;
import io.reactivex.internal.operators.completable.CompletableCreate;
import io.reactivex.internal.operators.maybe.MaybeFlatMapCompletable;
import io.reactivex.internal.operators.single.SingleCreate;
import io.reactivex.plugins.RxJavaPlugins;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import k0.b.z.e.c.h;

/* compiled from: InstabugDelegate */
public class i implements a.C0178a {
    public k0.b.w.a Y1;
    public k0.b.w.a Z1;
    public k0.b.w.a a2;
    public k0.b.w.a b2;
    public final i0.j.e.d.a c = new i0.j.e.d.a(this);
    public k0.b.w.a c2;
    public final r d;
    public k0.b.w.a d2;
    public Handler e2;
    public final TaskDebouncer f2 = new TaskDebouncer(30000);
    public final TaskDebouncer g2 = new TaskDebouncer(3000);
    public boolean h2;
    public final i0.j.e.r0.r q;
    public final Application x;
    public WeakReference<Context> y;

    /* compiled from: InstabugDelegate */
    public class a implements k0.b.y.d<SDKCoreEvent> {
        public final /* synthetic */ WelcomeMessage.State c;

        public a(WelcomeMessage.State state) {
            this.c = state;
        }

        public void b(Object obj) throws Exception {
            SDKCoreEvent sDKCoreEvent = (SDKCoreEvent) obj;
            if ("session".equals(sDKCoreEvent.getType()) && sDKCoreEvent.getValue().equalsIgnoreCase(SDKCoreEvent.Session.VALUE_STARTED) && !InstabugCore.isForegroundBusy()) {
                i.this.h(this.c);
                i.this.c();
            }
        }
    }

    /* compiled from: InstabugDelegate */
    public class b implements k0.b.y.d<SDKCoreEvent> {
        public final /* synthetic */ WelcomeMessage.State c;

        public b(WelcomeMessage.State state) {
            this.c = state;
        }

        public void b(Object obj) throws Exception {
            i.this.e2 = new Handler();
            i.this.e2.postDelayed(new j(this, (SDKCoreEvent) obj), 1000);
        }
    }

    /* compiled from: InstabugDelegate */
    public class c implements Runnable {
        public final /* synthetic */ WelcomeMessage.State c;

        public c(WelcomeMessage.State state) {
            this.c = state;
        }

        public void run() {
            Activity targetActivity = InstabugInternalTrackingDelegate.getInstance().getTargetActivity();
            if (targetActivity != null && !targetActivity.isFinishing()) {
                WelcomeMessage.State state = this.c;
                int i = OnboardingActivity.c;
                Intent intent = new Intent(targetActivity, OnboardingActivity.class);
                intent.putExtra("welcome_state", state);
                targetActivity.startActivity(intent);
            }
        }
    }

    /* compiled from: InstabugDelegate */
    public class d implements k0.b.y.d<SDKCoreEvent> {
        public d() {
        }

        public void b(Object obj) throws Exception {
            SDKCoreEvent sDKCoreEvent = (SDKCoreEvent) obj;
            if (sDKCoreEvent.getType().equals("sdk_state") && sDKCoreEvent.getValue().equals("built")) {
                i iVar = i.this;
                Objects.requireNonNull(iVar);
                PoolProvider.postIOTaskWithCheck(new l(iVar));
            }
        }
    }

    /* compiled from: InstabugDelegate */
    public class e implements k0.b.y.d<Throwable> {
        public void b(Object obj) throws Exception {
            Throwable th = (Throwable) obj;
            if (th instanceof com.instabug.library.network.e.e.e) {
                InstabugSDKLogger.w("InstabugDelegate", th.getMessage());
            } else {
                InstabugSDKLogger.e("InstabugDelegate", th.getMessage(), th);
            }
        }
    }

    /* compiled from: InstabugDelegate */
    public class f implements Runnable {
        public final /* synthetic */ boolean c;

        public f(boolean z) {
            this.c = z;
        }

        public void run() {
            k0.b.a aVar;
            k0.b.a aVar2;
            if (this.c) {
                i0.j.e.r0.r rVar = i.this.q;
                Objects.requireNonNull(rVar);
                rVar.c.saveOrUpdateLong("key_last_batch_synced_at", TimeUtils.currentTimeMillis() - TimeUnit.MINUTES.toMillis((long) rVar.a.getSyncIntervalsInMinutes()));
            }
            i iVar = i.this;
            i0.j.e.r0.r rVar2 = iVar.q;
            long b = rVar2.b();
            if (rVar2.a.getSyncMode() == 0) {
                StringBuilder P0 = i0.d.a.a.a.P0("Invalidating cache. Sync mode = ");
                P0.append(rVar2.a.getSyncMode());
                InstabugSDKLogger.w("SessionsSyncManager", P0.toString());
                Objects.requireNonNull(rVar2.d);
                aVar = RxJavaPlugins.onAssembly((k0.b.a) new CompletableCreate(new i0.j.e.r0.i()));
            } else {
                if ((rVar2.b() >= ((long) rVar2.a.getSyncIntervalsInMinutes())) || rVar2.a.getSyncMode() == 1) {
                    InstabugSDKLogger.i("SessionsSyncManager", "Evaluating cached sessions. Elapsed time since last sync = " + b + " mins. Sync configs = " + rVar2.a.toString());
                    aVar = rVar2.d.a().b(RxJavaPlugins.onAssembly((k0.b.a) new CompletableCreate(new o(rVar2))));
                } else if (InstabugDeviceProperties.getVersionCode().intValue() != SettingsManager.getInstance().getLastKnownVersionCode()) {
                    SettingsManager.getInstance().setVersionCode(InstabugDeviceProperties.getVersionCode().intValue());
                    SettingsManager.getInstance().setIsFirstSession(true);
                    InstabugSDKLogger.i("SessionsSyncManager", "App version has changed. Marking cached sessions as ready for sync");
                    aVar = rVar2.d.a();
                } else {
                    InstabugSDKLogger.i("SessionsSyncManager", "Skipping sessions evaluation. Elapsed time since last sync = " + b + " mins. Sync configs = " + rVar2.a.toString());
                    aVar = k0.b.a.c();
                }
            }
            i0.j.e.r0.r rVar3 = i.this.q;
            if (rVar3.a.getSyncMode() == 0) {
                StringBuilder P02 = i0.d.a.a.a.P0("Sessions sync is not allowed. Sync mode = ");
                P02.append(rVar3.a.getSyncMode());
                InstabugSDKLogger.w("SessionsSyncManager", P02.toString());
                aVar2 = k0.b.a.c();
            } else {
                StringBuilder P03 = i0.d.a.a.a.P0("Syncing local with remote. Sync configs = ");
                P03.append(rVar3.a.toString());
                InstabugSDKLogger.i("SessionsSyncManager", P03.toString());
                Objects.requireNonNull(rVar3.d);
                k0.b.r onAssembly = RxJavaPlugins.onAssembly(new SingleCreate(new j()));
                q qVar = new q();
                Objects.requireNonNull(onAssembly);
                k0.b.g onAssembly2 = RxJavaPlugins.onAssembly(new k0.b.z.e.b.b(onAssembly, qVar));
                p pVar = new p(rVar3, "No sessions ready for sync. Skipping...");
                Objects.requireNonNull(onAssembly2);
                k0.b.y.d<Object> dVar = k0.b.z.b.a.d;
                k0.b.y.a aVar3 = k0.b.z.b.a.c;
                k0.b.g b2 = RxJavaPlugins.onAssembly(new k0.b.z.e.b.e(onAssembly2, dVar, dVar, dVar, pVar, aVar3, aVar3)).b(new n(rVar3)).b(new m(rVar3));
                l lVar = new l(rVar3);
                Objects.requireNonNull(b2);
                aVar2 = RxJavaPlugins.onAssembly((k0.b.a) new MaybeFlatMapCompletable(b2, lVar));
            }
            k0.b.a b3 = aVar.b(aVar2);
            i iVar2 = i.this;
            boolean z = this.c;
            Objects.requireNonNull(iVar2);
            k0.b.a f = b3.d(new g(iVar2, z)).f(k0.b.d0.a.b());
            k0.b.y.a aVar4 = k0.b.z.b.a.c;
            k0.b.y.d<Throwable> errorConsumer = InstabugSDKLogger.errorConsumer("InstabugDelegate");
            Objects.requireNonNull(f);
            Objects.requireNonNull(errorConsumer, "onError is null");
            CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(errorConsumer, aVar4);
            f.a(callbackCompletableObserver);
            iVar.d2 = callbackCompletableObserver;
        }
    }

    /* compiled from: InstabugDelegate */
    public class g implements Action {
        public g() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0105, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0106, code lost:
            com.instabug.library.util.InstabugSDKLogger.e("b", r0.getMessage(), r0);
            com.instabug.library.Instabug.disable();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
            return;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0052 A[Catch:{ UnsatisfiedLinkError -> 0x0105 }] */
        /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() throws java.lang.Exception {
            /*
                r13 = this;
                i0.j.e.i r0 = i0.j.e.i.this
                java.util.Objects.requireNonNull(r0)
                java.lang.Class<i0.j.e.v0.g.a.c> r1 = i0.j.e.v0.g.a.c.class
                monitor-enter(r1)
                i0.j.e.v0.g.a.c r2 = i0.j.e.v0.g.a.c.a     // Catch:{ all -> 0x0113 }
                if (r2 != 0) goto L_0x0013
                i0.j.e.v0.g.a.c r2 = new i0.j.e.v0.g.a.c     // Catch:{ all -> 0x0113 }
                r2.<init>()     // Catch:{ all -> 0x0113 }
                i0.j.e.v0.g.a.c.a = r2     // Catch:{ all -> 0x0113 }
            L_0x0013:
                i0.j.e.v0.g.a.c r3 = i0.j.e.v0.g.a.c.a     // Catch:{ all -> 0x0113 }
                monitor-exit(r1)
                java.lang.String r1 = i0.j.e.c1.b.C()
                java.lang.String r2 = i0.j.e.c1.b.v()
                r3.c = r1
                r3.d = r2
                android.content.Context r1 = r0.i()
                if (r1 == 0) goto L_0x0112
                com.instabug.library.settings.SettingsManager r1 = com.instabug.library.settings.SettingsManager.getInstance()
                java.lang.String r1 = r1.getAppToken()
                if (r1 == 0) goto L_0x0112
                android.content.Context r0 = r0.i()
                com.instabug.library.settings.SettingsManager r1 = com.instabug.library.settings.SettingsManager.getInstance()
                java.lang.String r7 = r1.getAppToken()
                boolean r1 = r3.b()     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                r2 = 0
                r4 = 1
                if (r1 != 0) goto L_0x004f
                boolean r1 = r3.d()     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                if (r1 == 0) goto L_0x004d
                goto L_0x004f
            L_0x004d:
                r1 = r2
                goto L_0x0050
            L_0x004f:
                r1 = r4
            L_0x0050:
                if (r1 == 0) goto L_0x0112
                i0.j.e.l0.c.b r1 = r3.b     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                i0.j.e.t0.d r1 = r1.a()     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                if (r1 == 0) goto L_0x007a
                long r5 = r1.y     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                long r8 = java.lang.System.currentTimeMillis()     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                java.lang.String r1 = "instabug"
                android.content.SharedPreferences r1 = r0.getSharedPreferences(r1, r2)     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                r10 = 0
                java.lang.String r12 = "logs_last_uploaded_at"
                long r10 = r1.getLong(r12, r10)     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                long r8 = r8 - r10
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                long r5 = r1.toMillis(r5)     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r1 <= 0) goto L_0x007a
                r2 = r4
            L_0x007a:
                if (r2 == 0) goto L_0x0112
                com.instabug.library.network.NetworkManager r1 = new com.instabug.library.network.NetworkManager     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                r1.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                i0.j.e.v0.g.a.d r2 = new i0.j.e.v0.g.a.d     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                r2.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                i0.j.e.v0.e.i.a r4 = new i0.j.e.v0.e.i.a     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                r4.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                java.lang.Class<i0.j.e.v0.g.a.e> r5 = i0.j.e.v0.g.a.e.class
                monitor-enter(r5)     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                i0.j.e.v0.g.a.e r6 = i0.j.e.v0.g.a.e.d     // Catch:{ all -> 0x0102 }
                if (r6 != 0) goto L_0x0099
                i0.j.e.v0.g.a.e r6 = new i0.j.e.v0.g.a.e     // Catch:{ all -> 0x0102 }
                r6.<init>(r1, r2, r3, r4)     // Catch:{ all -> 0x0102 }
                i0.j.e.v0.g.a.e.d = r6     // Catch:{ all -> 0x0102 }
            L_0x0099:
                i0.j.e.v0.g.a.e r1 = i0.j.e.v0.g.a.e.d     // Catch:{ all -> 0x0102 }
                monitor-exit(r5)     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                r3.f = r1     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                java.lang.String r1 = r3.d     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                java.lang.String r2 = r3.c     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                android.util.Pair r4 = new android.util.Pair     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                java.lang.String r5 = ""
                r4.<init>(r5, r5)     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                if (r1 == 0) goto L_0x00bf
                boolean r5 = r3.b()     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                if (r5 == 0) goto L_0x00bf
                java.lang.String r2 = r3.c(r1)     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                java.lang.String r1 = r3.f(r1)     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                android.util.Pair r4 = new android.util.Pair     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                r4.<init>(r2, r1)     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                goto L_0x00d4
            L_0x00bf:
                if (r2 == 0) goto L_0x00d4
                boolean r1 = r3.d()     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                if (r1 == 0) goto L_0x00d4
                java.lang.String r1 = r3.c(r2)     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                java.lang.String r2 = r3.f(r2)     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                android.util.Pair r4 = new android.util.Pair     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                r4.<init>(r1, r2)     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
            L_0x00d4:
                java.lang.Object r1 = r4.first     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                r6 = r1
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                java.lang.Object r1 = r4.second     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                r5 = r1
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                java.lang.String r1 = "logs/"
                java.io.File r0 = com.instabug.library.internal.storage.DiskUtils.getInsatbugLogDirectory(r1, r0)     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                if (r0 == 0) goto L_0x0112
                boolean r1 = r0.exists()     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                if (r1 == 0) goto L_0x0112
                java.io.File[] r4 = r0.listFiles()     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                if (r4 == 0) goto L_0x0112
                i0.j.e.v0.g.a.e r0 = r3.f     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                if (r0 == 0) goto L_0x0112
                com.instabug.library.util.TaskDebouncer r0 = r3.g     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                i0.j.e.v0.g.a.b r1 = new i0.j.e.v0.g.a.b     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                r0.debounce((java.lang.Runnable) r1)     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                goto L_0x0112
            L_0x0102:
                r0 = move-exception
                monitor-exit(r5)     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
                throw r0     // Catch:{ UnsatisfiedLinkError -> 0x0105 }
            L_0x0105:
                r0 = move-exception
                java.lang.String r1 = "b"
                java.lang.String r2 = r0.getMessage()
                com.instabug.library.util.InstabugSDKLogger.e(r1, r2, r0)
                com.instabug.library.Instabug.disable()
            L_0x0112:
                return
            L_0x0113:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.j.e.i.g.run():void");
        }
    }

    public i(Application application) {
        Context applicationContext = application.getApplicationContext();
        this.y = new WeakReference<>(applicationContext);
        this.d = new r(new i0.j.e.v0.e.j.q(new i0.j.e.v0.e.j.m(new NetworkManager(), new PreferencesUtils(applicationContext, SettingsManager.INSTABUG_SHARED_PREF_NAME)), new i0.j.e.v0.e.j.c()));
        this.q = new i0.j.e.r0.r(SettingsManager.getSessionsSyncConfigurations(applicationContext), new i0.j.e.r0.a(), new PreferencesUtils(applicationContext, SettingsManager.INSTABUG_SHARED_PREF_NAME), new i0.j.e.r0.e(), new k(new NetworkManager(), new i0.j.e.d1.c(applicationContext)), new i0.j.e.l0.e.a());
        this.x = application;
        this.h2 = false;
        InstabugInternalTrackingDelegate.init(application);
    }

    public final void a() {
        if (m() == InstabugState.ENABLED) {
            i0.j.e.f1.n k = i0.j.e.f1.n.k();
            Objects.requireNonNull(k);
            Object lastSeenView = InstabugCore.getLastSeenView();
            if (lastSeenView != null) {
                k.f(lastSeenView instanceof Fragment ? StepType.FRAGMENT_RESUMED : StepType.ACTIVITY_RESUMED, lastSeenView.getClass().getSimpleName(), lastSeenView.getClass().getName(), (String) null);
            }
        } else if (m() == InstabugState.DISABLED) {
            i0.j.e.f1.n k2 = i0.j.e.f1.n.k();
            i0.j.e.f1.m mVar = k2.c;
            Objects.requireNonNull(mVar);
            String[] strArr = new String[1];
            RxJavaPlugins.onAssembly(new h(new i0.j.e.f1.j(mVar, strArr))).v(k0.b.d0.a.b()).t(new i0.j.e.f1.i(strArr), k0.b.z.b.a.e, k0.b.z.b.a.c, k0.b.z.b.a.d);
            k2.c.a.clear();
            i0.j.e.f1.n.k().e = 0;
        }
    }

    public final void b() {
        k0.b.a aVar;
        boolean z = m() == InstabugState.DISABLED;
        r rVar = this.d;
        Objects.requireNonNull(rVar);
        if (!i0.j.e.c1.b.G()) {
            aVar = RxJavaPlugins.onAssembly((k0.b.a) new k0.b.z.e.a.b(new com.instabug.library.network.e.e.e("current user is not identified")));
        } else if (!InstabugCore.isExperimentalFeatureAvailable(Feature.BE_USER_ATTRIBUTES)) {
            aVar = RxJavaPlugins.onAssembly((k0.b.a) new k0.b.z.e.a.b(new com.instabug.library.network.e.e.e("sync feature is not available")));
        } else {
            String appToken = SettingsManager.getInstance().getAppToken();
            String C = i0.j.e.c1.b.C();
            String v = i0.j.e.c1.b.v();
            i0.j.e.v0.e.j.q qVar = rVar.a;
            Request addParameter = new Request(Request.Endpoint.USER_ATTRIBUTES, NetworkManager.RequestType.NORMAL).setRequestMethod(Request.RequestMethod.Get).addHeader(new Request.RequestParameter(Header.IF_MATCH, qVar.a.a.getString("key_user_attrs_hash"))).addParameter("uuid", C).addParameter("email", v);
            if (appToken != null) {
                addParameter.addParameter("application_token", appToken);
            }
            aVar = k0.b.l.o(addParameter).j(new i0.j.e.v0.e.j.p(qVar)).p(new i0.j.e.v0.e.j.o(qVar, C)).l(new i0.j.e.v0.e.j.n(qVar));
        }
        k0.b.a f3 = aVar.d(new x(this, z)).f(k0.b.d0.a.c());
        k0.b.y.a aVar2 = k0.b.z.b.a.c;
        e eVar = new e();
        Objects.requireNonNull(f3);
        CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(eVar, aVar2);
        f3.a(callbackCompletableObserver);
        this.Z1 = callbackCompletableObserver;
        this.g2.debounce((Runnable) new f(z));
        ActionsOrchestrator.obtainOrchestrator().addWorkerThreadAction(new g()).orchestrate();
    }

    public final void c() {
        k0.b.w.a aVar = this.c2;
        if (aVar != null) {
            aVar.dispose();
            this.c2 = null;
        }
    }

    public void d(InstabugState instabugState) {
        if (instabugState != m()) {
            InstabugStateEventBus.getInstance().post(instabugState);
            InstabugStateProvider.getInstance().setState(instabugState);
        }
    }

    public void e(WelcomeMessage.State state) {
        if (!Instabug.isEnabled()) {
            InstabugSDKLogger.e("Instabug", "Cannot show intro message while SDK is Disabled");
        } else if (state == WelcomeMessage.State.DISABLED) {
            InstabugSDKLogger.e("Instabug", "Cannot show onboarding message while WelcomeMessageState is DISABLED");
        } else if (InvocationManager.getInstance().getCurrentInstabugInvocationEvents().length == 0 || !n()) {
            InstabugSDKLogger.e("Instabug", "Cannot show onboarding message while invocation event in NONE");
        } else if (!InstabugCore.isAppOnForeground()) {
            if (this.c2 == null) {
                this.c2 = SDKCoreEventSubscriber.subscribe(new a(state));
            }
        } else if (!InstabugCore.isForegroundBusy()) {
            h(state);
        } else if (this.c2 == null) {
            this.c2 = SDKCoreEventSubscriber.subscribe(new b(state));
        }
    }

    public void f() {
        synchronized (i0.j.e.y.b.a.b) {
            if (i0.j.e.y.b.a.b("initPluginsPromptOptionAvailability()")) {
                for (Plugin initDefaultPromptOptionAvailabilityState : i0.j.e.y.b.a.a) {
                    initDefaultPromptOptionAvailabilityState.initDefaultPromptOptionAvailabilityState();
                }
            }
        }
        Context context = (Context) this.y.get();
        if (context != null) {
            UserAttributesCacheManager.prepareCaches(context);
        } else {
            InstabugSDKLogger.w("InstabugDelegate", "can't execute prepareCaches() due to null context");
        }
    }

    public void g(Feature.State state) {
        z.j().d(Feature.INSTABUG, state);
        if (i() != null) {
            z.j().k(i());
        }
    }

    public final void h(WelcomeMessage.State state) {
        PresentationManager.getInstance().show(new c(state));
    }

    public Context i() {
        if (this.y.get() == null) {
            InstabugSDKLogger.e("InstabugDelegate", "Application context instance equal null");
        }
        return (Context) this.y.get();
    }

    public void j() {
        if (i() == null) {
            InstabugSDKLogger.e(this, "Unable to register a LocalBroadcast receiver because of a null context");
        } else {
            h0.s.a.a.a(i()).b(this.c, new IntentFilter("SDK invoked"));
        }
    }

    public void k() {
        ArrayList arrayList;
        Feature[] featureArr;
        String str;
        z j = z.j();
        Feature feature = Feature.INSTABUG;
        if (!j.i(feature) || z.j().h(feature) != Feature.State.ENABLED) {
            d(InstabugState.DISABLED);
        } else if (!this.h2) {
            boolean z = true;
            this.h2 = true;
            i0.j.e.y.b.a.c(i());
            InstabugSDKLogger.v("InstabugDelegate", "Initializing database manager");
            synchronized (this) {
                DatabaseManager.init(new i0.j.e.l0.k.a.b.a(i()));
            }
            Context i = i();
            z j2 = z.j();
            Objects.requireNonNull(j2);
            int i2 = 0;
            if (!MemoryUtils.isLowMemory(i)) {
                SharedPreferences sharedPreferences = i.getSharedPreferences(SettingsManager.INSTABUG_SHARED_PREF_NAME, 0);
                if (!sharedPreferences.contains(Feature.VP_CUSTOMIZATION.name() + "AVAIL")) {
                    SharedPreferences.Editor edit = i.getSharedPreferences(SettingsManager.INSTABUG_SHARED_PREF_NAME, 0).edit();
                    edit.putLong("LAST_FETCHED_AT", 0);
                    edit.apply();
                    j2.c(i);
                } else {
                    Feature[] values = Feature.values();
                    boolean z2 = false;
                    while (i2 < 28) {
                        Feature feature2 = values[i2];
                        boolean z3 = sharedPreferences.getBoolean(feature2.name() + "EXP_AVAIL", z2);
                        j2.h.put(feature2, Boolean.valueOf(z3));
                        InstabugSDKLogger.d("InstabugFeaturesManager", "Experimental feature " + feature2 + " saved availability " + z3 + " restored from shared preferences");
                        String str2 = feature2.name() + "AVAIL";
                        String str3 = feature2.name() + "AVAIL";
                        Feature feature3 = Feature.SDK_ANALYTICS;
                        if (feature2 == feature3 || j2.l(feature2)) {
                            z = z2;
                        }
                        boolean z4 = sharedPreferences.getBoolean(str3, z);
                        if (sharedPreferences.contains(str2)) {
                            featureArr = values;
                            j2.g.put(feature2, Boolean.valueOf(z4));
                            InstabugSDKLogger.d("InstabugFeaturesManager", "Feature " + feature2 + " saved availability " + z4 + " restored from shared preferences");
                        } else {
                            featureArr = values;
                            if (!j2.g.containsKey(feature2)) {
                                j2.g.putIfAbsent(feature2, Boolean.valueOf(z4));
                                InstabugSDKLogger.d("InstabugFeaturesManager", "Restored feature " + feature2 + " availability " + z4 + " from shared preferences");
                            } else {
                                InstabugSDKLogger.d("InstabugFeaturesManager", "Not restoring feature " + feature2 + " availability as it's already set to " + j2.g.get(feature2));
                            }
                        }
                        if (!j2.f.containsKey(feature2)) {
                            String str4 = feature2.name() + "STATE";
                            if (feature2 == feature3) {
                                str = Feature.State.DISABLED.name();
                            } else if (j2.l(feature2)) {
                                str = z.d.name();
                            } else {
                                str = z.c.name();
                            }
                            Feature.State valueOf = Feature.State.valueOf(sharedPreferences.getString(str4, str));
                            j2.f.putIfAbsent(feature2, valueOf);
                            InstabugSDKLogger.d("InstabugFeaturesManager", "Restored feature " + feature2 + " state " + valueOf + " from shared preferences");
                        } else {
                            InstabugSDKLogger.d("InstabugFeaturesManager", "Not restoring feature " + feature2 + " state as it's already set to " + j2.f.get(feature2));
                        }
                        i2++;
                        z = true;
                        z2 = false;
                        values = featureArr;
                    }
                    i0.j.e.a.d.b.a().post(Boolean.valueOf(j2.i(Feature.SDK_ANALYTICS)));
                }
            } else {
                InstabugSDKLogger.e(z.class.getSimpleName(), "Couldn't restoreFeaturesFromSharedPreferences because memory is low,Instabug will be paused.");
                Instabug.pauseSdk();
            }
            if (InstabugCore.isFirstRunAfterEncryptorUpdate()) {
                PoolProvider.postIOTask(new s(this));
            }
            a();
            this.a2 = SessionStateEventBus.getInstance().subscribe(new f(this));
            this.Y1 = SDKCoreEventSubscriber.subscribe(new t(this));
            InstabugSDKLogger.d("InstabugDelegate", "Initializing the exception handler");
            Thread.setDefaultUncaughtExceptionHandler(new i0.j.e.j0.a());
            InstabugSDKLogger.d("InstabugDelegate", "Starting Instabug SDK functionality");
            d(InstabugState.ENABLED);
            g(Feature.State.ENABLED);
            InstabugSDKLogger.v("InstabugDelegate", "show intro dialog if valid");
            InstabugSDKLogger.v("InstabugDelegate", "Checking if should show welcome message, firstRun " + SettingsManager.getInstance().isFirstRun() + ", SettingsManager.getInstance().getWelcomeMessageState() " + SettingsManager.getInstance().getWelcomeMessageState());
            if (SettingsManager.getInstance().isFirstRun()) {
                InstabugSDKLogger.v("InstabugDelegate", "Showing Intro Message");
                Looper myLooper = Looper.myLooper();
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    myLooper = Looper.getMainLooper();
                }
                new Handler(myLooper).postDelayed(new h(this), 10000);
            }
            i0.d().c();
            InstabugSDKLogger.v("InstabugDelegate", "Disposing expired data");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new i0.j.e.l0.b.c("user", "uuid", InstabugDbContract.UserEntity.COLUMN_LAST_SEEN, com.instabug.library.internal.b.f.USER_DATA));
            synchronized (i0.j.e.y.b.a.b) {
                arrayList = new ArrayList();
                if (!i0.j.e.y.b.a.b("getDataDisposalPolicies()")) {
                    for (Plugin dataDisposalPolicies : i0.j.e.y.b.a.a) {
                        arrayList.addAll(dataDisposalPolicies.getDataDisposalPolicies());
                    }
                }
            }
            arrayList2.addAll(arrayList);
            PoolProvider.postIOTask(new i0.j.e.l0.b.a(new i0.j.e.l0.b.b(arrayList2)));
            InstabugSDKLogger.v("InstabugDelegate", "run valid migration");
            if (i() == null) {
                InstabugSDKLogger.e(this, "Unable to start migration because of a null context");
            } else {
                Context i3 = i();
                AbstractMigration[] abstractMigrationArr = i0.j.e.s0.d.a;
                ArrayList arrayList3 = new ArrayList();
                for (AbstractMigration abstractMigration : i0.j.e.s0.d.a) {
                    abstractMigration.initialize(i3);
                    boolean z5 = abstractMigration.getMigrationVersion() <= 4 && abstractMigration.shouldMigrate();
                    StringBuilder P0 = i0.d.a.a.a.P0("Checking if should apply this migration: ");
                    P0.append(abstractMigration.getMigrationId());
                    P0.append(", result is ");
                    P0.append(z5);
                    P0.append(" last migration version is ");
                    P0.append(SettingsManager.getInstance().getLastMigrationVersion());
                    P0.append(" target migration version ");
                    P0.append(4);
                    InstabugSDKLogger.d("MigrationManager", P0.toString());
                    if (z5) {
                        abstractMigration.doPreMigration();
                        arrayList3.add(abstractMigration.migrate());
                    }
                }
                int size = arrayList3.size();
                k0.b.l[] lVarArr = new k0.b.l[size];
                for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                    lVarArr[i4] = (k0.b.l) arrayList3.get(i4);
                }
                if (size != 0) {
                    k0.b.l.q(Arrays.asList(lVarArr)).s(k0.b.d0.a.b()).v(k0.b.d0.a.b()).c(new i0.j.e.s0.c());
                } else {
                    InstabugSDKLogger.d("MigrationManager", "No migrations to run");
                }
            }
            InstabugSDKLogger.v("InstabugDelegate", "Registering broadcasts");
            j();
            InstabugSDKLogger.v("InstabugDelegate", "Preparing user state");
            Context applicationContext = Instabug.getApplicationContext();
            if (applicationContext != null && z.j().h(Feature.INSTABUG) == Feature.State.ENABLED && SettingsManager.getInstance().shouldMakeUUIDMigrationRequest()) {
                i0.j.e.c1.b.i(applicationContext);
            }
            InstabugSDKLogger.v("InstabugDelegate", "Initializing auto screen recording");
            InternalAutoScreenRecorderHelper.getInstance().start();
            i0.j.e.u0.b.c().a();
            if (!InstabugInternalTrackingDelegate.getInstance().isRegistered()) {
                InstabugInternalTrackingDelegate.getInstance().registerActivityLifecycleListener(this.x);
            }
        }
        InstabugSDKLogger.v("InstabugDelegate", "Initializing invocation manager");
        InstabugSDKLogger.v("InstabugDelegate", "initialize Instabug InvocationMode Manager");
        InvocationManager.init();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l() {
        /*
            r2 = this;
            boolean r0 = com.instabug.library.Instabug.isBuilding()
            if (r0 == 0) goto L_0x000f
            i0.j.e.i$d r0 = new i0.j.e.i$d
            r0.<init>()
            com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventSubscriber.subscribe(r0)
            return
        L_0x000f:
            com.instabug.library.InstabugState r0 = r2.m()
            com.instabug.library.InstabugState r1 = com.instabug.library.InstabugState.NOT_BUILT
            if (r0 == r1) goto L_0x0031
            i0.j.e.z r0 = i0.j.e.z.j()
            com.instabug.library.Feature r1 = com.instabug.library.Feature.INSTABUG
            boolean r0 = r0.i(r1)
            if (r0 == 0) goto L_0x0031
            i0.j.e.z r0 = i0.j.e.z.j()
            com.instabug.library.Feature$State r0 = r0.h(r1)
            com.instabug.library.Feature$State r1 = com.instabug.library.Feature.State.ENABLED
            if (r0 != r1) goto L_0x0031
            r0 = 1
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 == 0) goto L_0x003c
            i0.j.e.l r0 = new i0.j.e.l
            r0.<init>(r2)
            com.instabug.library.util.threading.PoolProvider.postIOTaskWithCheck(r0)
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.e.i.l():void");
    }

    public final InstabugState m() {
        return InstabugStateProvider.getInstance().getState();
    }

    public final boolean n() {
        InstabugInvocationEvent[] currentInstabugInvocationEvents = InvocationManager.getInstance().getCurrentInstabugInvocationEvents();
        return (currentInstabugInvocationEvents.length == 1 && currentInstabugInvocationEvents[0] == InstabugInvocationEvent.NONE) ? false : true;
    }

    public void onSDKInvoked(boolean z) {
        InstabugSDKLogger.d("InstabugDelegate", "SDK Invoked: " + z);
        InstabugState m = m();
        if (m != InstabugState.TAKING_SCREENSHOT && m != InstabugState.RECORDING_VIDEO && m != InstabugState.TAKING_SCREENSHOT_FOR_CHAT && m != InstabugState.RECORDING_VIDEO_FOR_CHAT && m != InstabugState.IMPORTING_IMAGE_FROM_GALLERY_FOR_CHAT) {
            if (z) {
                d(InstabugState.INVOKED);
                return;
            }
            Activity currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
            if (currentActivity != null) {
                OrientationUtils.unlockOrientation(currentActivity);
            }
            if (z.j().i(Feature.INSTABUG)) {
                d(InstabugState.ENABLED);
            } else {
                d(InstabugState.DISABLED);
            }
        }
    }
}
