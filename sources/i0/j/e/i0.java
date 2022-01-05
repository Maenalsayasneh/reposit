package i0.j.e;

import android.content.Context;
import android.content.IntentFilter;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.CurrentActivityLifeCycleEventBus;
import com.instabug.library.core.eventbus.SessionStateEventBus;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventPublisher;
import com.instabug.library.internal.orchestrator.ActionsOrchestrator;
import com.instabug.library.internal.video.InternalAutoScreenRecorderHelper;
import com.instabug.library.model.common.Session;
import com.instabug.library.model.session.SessionMapper;
import com.instabug.library.model.session.SessionState;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.DeviceStateProvider;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.e.c1.b;
import i0.j.e.l0.j.k;
import i0.j.e.v0.c;
import io.reactivex.internal.operators.single.SingleCreate;
import io.reactivex.internal.operators.single.SingleFlatMapCompletable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import k0.b.r;

/* compiled from: SessionManager */
public class i0 {
    public static i0 a;
    public SettingsManager b;
    public int c;
    public c d = new c();
    public Session e;

    /* compiled from: SessionManager */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0011 */
        static {
            /*
                com.instabug.library.tracking.ActivityLifeCycleEvent.values()
                r0 = 6
                int[] r0 = new int[r0]
                a = r0
                com.instabug.library.tracking.ActivityLifeCycleEvent r1 = com.instabug.library.tracking.ActivityLifeCycleEvent.STARTED     // Catch:{ NoSuchFieldError -> 0x0011 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0011 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001c }
                com.instabug.library.tracking.ActivityLifeCycleEvent r1 = com.instabug.library.tracking.ActivityLifeCycleEvent.STOPPED     // Catch:{ NoSuchFieldError -> 0x001c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001c }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.j.e.i0.a.<clinit>():void");
        }
    }

    public i0(SettingsManager settingsManager) {
        this.b = settingsManager;
        CurrentActivityLifeCycleEventBus.getInstance().subscribe(new h0(this));
    }

    public static synchronized i0 d() {
        i0 i0Var;
        synchronized (i0.class) {
            i0Var = a;
            if (i0Var == null) {
                i0Var = new i0(SettingsManager.getInstance());
                a = i0Var;
            }
        }
        return i0Var;
    }

    public synchronized void a() {
        if (z.j().h(Feature.INSTABUG) == Feature.State.ENABLED) {
            SettingsManager.getInstance().setInBackground(true);
            e();
        }
    }

    public final void b(SessionState sessionState) {
        if (sessionState.equals(SessionState.FINISH)) {
            SettingsManager.getInstance().setIsAppOnForeground(false);
            SDKCoreEventPublisher.post(new SDKCoreEvent("session", SDKCoreEvent.Session.VALUE_FINISHED));
        } else {
            SettingsManager.getInstance().setIsAppOnForeground(true);
            SDKCoreEventPublisher.post(new SDKCoreEvent("session", SDKCoreEvent.Session.VALUE_STARTED));
        }
        SessionStateEventBus.getInstance().post(sessionState);
    }

    public synchronized void c() {
        Context applicationContext = Instabug.getApplicationContext();
        this.e = SessionMapper.toSession(UUID.randomUUID().toString(), DeviceStateProvider.getOS(), b.C(), applicationContext != null ? DeviceStateProvider.getAppVersion(applicationContext) : null, TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()), System.nanoTime());
        f();
        b(SessionState.START);
        if (this.d != null) {
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            Context applicationContext2 = Instabug.getApplicationContext();
            if (Instabug.isEnabled()) {
                c cVar = this.d;
                if (!cVar.a && applicationContext2 != null) {
                    applicationContext2.registerReceiver(cVar, intentFilter);
                    cVar.a = true;
                }
            }
        }
        if (SettingsManager.getInstance().autoScreenRecordingEnabled()) {
            InternalAutoScreenRecorderHelper.getInstance().start();
        }
    }

    public final void e() {
        if (this.b.getSessionStartedAt() != 0) {
            Session session = this.e;
            if (session != null && SettingsManager.getInstance().isSessionEnabled()) {
                r onAssembly = RxJavaPlugins.onAssembly(new SingleCreate(new g0(session)));
                f0 f0Var = new f0();
                Objects.requireNonNull(onAssembly);
                RxJavaPlugins.onAssembly((k0.b.a) new SingleFlatMapCompletable(onAssembly, f0Var)).f(k0.b.d0.a.b()).a(new e0(this));
            }
            if (SettingsManager.getInstance().isFirstDismiss()) {
                SettingsManager.getInstance().setIsFirstDismiss(false);
            }
            long currentTimeMillis = System.currentTimeMillis();
            InstabugCore.setLastSeenTimestamp(currentTimeMillis);
            ActionsOrchestrator.obtainOrchestrator().addWorkerThreadAction(new k(b.C(), currentTimeMillis)).orchestrate();
            b(SessionState.FINISH);
        } else {
            InstabugSDKLogger.d("SessionManager", "Instabug is enabled after session started, Session ignored");
        }
        Context applicationContext = Instabug.getApplicationContext();
        c cVar = this.d;
        if (!(cVar == null || applicationContext == null)) {
            try {
                applicationContext.unregisterReceiver(cVar);
                cVar.a = false;
            } catch (IllegalArgumentException unused) {
                InstabugSDKLogger.d("SessionManager", "This app is not registered");
            }
        }
        this.e = null;
    }

    public final void f() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        this.b.setSessionStartedAt(currentTimeMillis);
        if (SettingsManager.getInstance().isFirstRun()) {
            this.b.setIsFirstRun(false);
        }
        if (SettingsManager.getInstance().getFirstRunAt().getTime() == 0) {
            this.b.setFirstRunAt(System.currentTimeMillis());
        }
        this.b.incrementSessionsCount();
        ActionsOrchestrator.obtainOrchestrator().addWorkerThreadAction(new k(b.C(), currentTimeMillis * 1000)).orchestrate();
    }
}
