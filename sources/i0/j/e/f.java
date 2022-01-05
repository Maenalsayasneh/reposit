package i0.j.e;

import android.content.Context;
import com.instabug.library.InstabugState;
import com.instabug.library.PresentationManager;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventSubscriber;
import com.instabug.library.core.plugin.Plugin;
import com.instabug.library.model.session.SessionState;
import com.instabug.library.model.session.config.SessionsConfig;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.DeviceStateProvider;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import i0.j.e.t0.c;
import java.lang.ref.WeakReference;
import java.util.Objects;
import k0.b.w.a;
import k0.b.y.d;

/* compiled from: InstabugDelegate */
public class f implements d<SessionState> {
    public final /* synthetic */ i c;

    public f(i iVar) {
        this.c = iVar;
    }

    public void b(Object obj) throws Exception {
        SessionState sessionState = (SessionState) obj;
        if (sessionState.equals(SessionState.FINISH)) {
            InstabugSDKLogger.logEndSession(System.currentTimeMillis());
            i iVar = this.c;
            Objects.requireNonNull(iVar);
            PoolProvider.postIOTask(new v(iVar));
            i iVar2 = this.c;
            a aVar = iVar2.b2;
            if (aVar != null) {
                aVar.dispose();
                iVar2.b2 = null;
            }
            i iVar3 = this.c;
            if (iVar3.m() == InstabugState.DISABLED) {
                iVar3.b();
            } else {
                a aVar2 = iVar3.Z1;
                if (aVar2 != null) {
                    aVar2.dispose();
                    iVar3.Z1 = null;
                }
                a aVar3 = iVar3.d2;
                if (aVar3 != null) {
                    aVar3.dispose();
                    iVar3.d2 = null;
                }
            }
            synchronized (i0.j.e.y.b.a.b) {
                if (i0.j.e.y.b.a.b("sleep()")) {
                    for (Plugin sleepIfPossible : i0.j.e.y.b.a.a) {
                        sleepIfPossible.sleepIfPossible();
                    }
                    PresentationManager.release();
                }
            }
        } else if (sessionState.equals(SessionState.START)) {
            SessionsConfig sessionsSyncConfigurations = SettingsManager.getInstance().getSessionsSyncConfigurations();
            i iVar4 = this.c;
            iVar4.q.a = sessionsSyncConfigurations;
            WeakReference weakReference = new WeakReference(iVar4.i());
            String sdkVersion = DeviceStateProvider.getSdkVersion();
            String os = DeviceStateProvider.getOS();
            Context context = (Context) weakReference.get();
            long freeMemory = context != null ? DeviceStateProvider.getFreeMemory(context) : -1;
            String appToken = SettingsManager.getInstance().getAppToken();
            InstabugSDKLogger.logSessionDetails(new c(appToken != null ? appToken : null, os, sdkVersion, freeMemory));
            this.c.f2.debounce((Runnable) new e(this));
            i iVar5 = this.c;
            if (iVar5.b2 == null) {
                iVar5.b2 = SDKCoreEventSubscriber.subscribe(new k(iVar5));
            }
            this.c.b();
            Objects.requireNonNull(this.c);
            PoolProvider.postIOTask(new u());
            synchronized (i0.j.e.y.b.a.b) {
                if (i0.j.e.y.b.a.b("wake()")) {
                    for (Plugin wakeIfPossible : i0.j.e.y.b.a.a) {
                        wakeIfPossible.wakeIfPossible();
                    }
                }
            }
        }
        i iVar6 = this.c;
        WeakReference<Context> weakReference2 = iVar6.y;
        if (weakReference2 != null) {
            Context context2 = (Context) weakReference2.get();
            if (context2 != null) {
                PoolProvider.postIOTask(new w(context2));
            } else {
                InstabugSDKLogger.e(iVar6, "Context is null.");
            }
        }
    }
}
