package i0.j.e.a1;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.PresentationManager;
import com.instabug.library._InstabugActivity;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.logging.InstabugUserEventLogger;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.DeviceStateProvider;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import h0.b.a.e;
import h0.o.a.v;
import i0.j.e.i0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: InstabugActivityLifecycleListener */
public class a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public Map<Activity, i0.j.e.d1.a> Y1 = new HashMap();
    public boolean c = false;
    public long d = 0;
    public final Set<String> q = new HashSet();
    public boolean x = false;
    public Map<Activity, c> y = new HashMap();

    /* renamed from: i0.j.e.a1.a$a  reason: collision with other inner class name */
    /* compiled from: InstabugActivityLifecycleListener */
    public class C0175a implements Runnable {
        public final /* synthetic */ Activity c;

        /* renamed from: i0.j.e.a1.a$a$a  reason: collision with other inner class name */
        /* compiled from: InstabugActivityLifecycleListener */
        public class C0176a implements Runnable {
            public C0176a() {
            }

            public void run() {
                InstabugInternalTrackingDelegate.getInstance().handleActivityResumedEvent(C0175a.this.c);
                if (SystemClock.elapsedRealtime() - a.this.d >= 300) {
                    if (PresentationManager.getInstance().getCurrentActivityName().equalsIgnoreCase(C0175a.this.c.getLocalClassName())) {
                        a aVar = a.this;
                        if (aVar.c) {
                            aVar.d = SystemClock.elapsedRealtime();
                        }
                    }
                    PresentationManager.getInstance().setCurrentActivity(C0175a.this.c);
                    C0175a aVar2 = C0175a.this;
                    a aVar3 = a.this;
                    if (aVar3.c) {
                        aVar3.c = false;
                    } else if (!(aVar2.c instanceof _InstabugActivity)) {
                        PresentationManager.getInstance().notifyActivityChanged();
                    }
                }
            }
        }

        public C0175a(Activity activity) {
            this.c = activity;
        }

        public void run() {
            if (SettingsManager.getInstance().isInBackground()) {
                if (DeviceStateProvider.getFreeStorage() < 50) {
                    Instabug.pauseSdk();
                    InstabugSDKLogger.e("IBActivityLifecycleListener", "Instabug was disabled temporary because of low disk storage '< 50MB' and it will be resumed next session one there is available disk storage");
                    a.this.x = true;
                    return;
                }
                i0.d().c();
                SettingsManager.getInstance().setInBackground(false);
            }
            PoolProvider.postMainThreadTask(new C0176a());
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.q.add(activity.getClass().getSimpleName());
        InstabugInternalTrackingDelegate.getInstance().handleActivityCreatedEvent(activity);
        if ((activity instanceof e) && !(activity instanceof _InstabugActivity)) {
            c cVar = new c();
            ((e) activity).getSupportFragmentManager().o.a.add(new v.a(cVar, true));
            this.y.put(activity, cVar);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        this.q.remove(activity.getClass().getSimpleName());
        if (this.q.isEmpty()) {
            InstabugSDKLogger.v("IBActivityLifecycleListener", "app is getting terminated, clearing user event logs");
            InstabugUserEventLogger.getInstance().clearAll();
        }
        InstabugInternalTrackingDelegate.getInstance().handleActivityDestroyedEvent(activity);
        if ((activity instanceof e) && !(activity instanceof _InstabugActivity)) {
            c cVar = this.y.get(activity);
            if (cVar != null) {
                v vVar = ((e) activity).getSupportFragmentManager().o;
                synchronized (vVar.a) {
                    int i = 0;
                    int size = vVar.a.size();
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (vVar.a.get(i).a == cVar) {
                            vVar.a.remove(i);
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            this.y.remove(activity);
        }
    }

    public void onActivityPaused(Activity activity) {
        Activity activity2;
        View a;
        Window.Callback callback;
        InstabugInternalTrackingDelegate.getInstance().handleActivityPausedEvent(activity);
        Window.Callback callback2 = activity.getWindow().getCallback();
        if ((callback2 instanceof f) && (callback = ((f) callback2).c) != null) {
            activity.getWindow().setCallback(callback);
        }
        if (InstabugCore.isFeatureAvailable(Feature.REPRO_STEPS)) {
            i0.j.e.d1.a aVar = this.Y1.get(activity);
            if (!(aVar == null || aVar.d.get() == null || (activity2 = (Activity) aVar.d.get()) == null || (a = aVar.a(activity2)) == null)) {
                a.getViewTreeObserver().removeOnGlobalLayoutListener(aVar.c);
                a.getViewTreeObserver().removeOnGlobalFocusChangeListener(aVar);
            }
            this.Y1.remove(activity);
        }
    }

    public void onActivityResumed(Activity activity) {
        Window window = activity.getWindow();
        window.setCallback(new f(window.getCallback()));
        if (InstabugCore.isFeatureAvailable(Feature.REPRO_STEPS)) {
            this.Y1.put(activity, new i0.j.e.d1.a(activity, new b()));
        }
        PoolProvider.postIOTask(new C0175a(activity));
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        InstabugSDKLogger.d("IBActivityLifecycleListener", activity.getClass().getSimpleName() + " SaveInstanceState");
    }

    public void onActivityStarted(Activity activity) {
        InstabugInternalTrackingDelegate.getInstance().handleActivityStartedEvent(activity);
    }

    public void onActivityStopped(Activity activity) {
        InstabugInternalTrackingDelegate.getInstance().handleActivityStoppedEvent(activity);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.c = true;
        InstabugInternalTrackingDelegate.getInstance().handleConfigurationChanged(configuration);
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
        if (i == 20) {
            SettingsManager.getInstance().setInBackground(true);
            if (this.x) {
                Instabug.resumeSdk();
                this.x = false;
                return;
            }
            i0.d().a();
        }
    }
}
