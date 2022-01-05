package com.instabug.library.tracking;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.google.android.material.tabs.TabLayout;
import com.instabug.library.Feature;
import com.instabug.library.InstabugState;
import com.instabug.library.InstabugStateProvider;
import com.instabug.library._InstabugActivity;
import com.instabug.library.core.eventbus.CurrentActivityLifeCycleEventBus;
import com.instabug.library.model.StepType;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.e.a0;
import i0.j.e.a1.a;
import i0.j.e.a1.d;
import i0.j.e.a1.e;
import i0.j.e.a1.f;
import i0.j.e.a1.g;
import i0.j.e.f1.n;
import i0.j.e.z;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class InstabugInternalTrackingDelegate {
    private static volatile InstabugInternalTrackingDelegate INSTANCE = null;
    public static final String TAG = "InstabugInternalTrackingDelegate";
    private final a activityLifecycleListener = new a();
    private WeakReference<Activity> currentActivity;
    private boolean isRegistered = false;
    private WeakReference<Fragment> lastResumedFragment;
    private final g navigableViewsTrackingDelegate;

    private InstabugInternalTrackingDelegate(Application application) {
        if (application != null) {
            registerActivityLifecycleListener(application);
        }
        this.navigableViewsTrackingDelegate = new g();
    }

    public static InstabugInternalTrackingDelegate getInstance() {
        return INSTANCE;
    }

    public static void init(Application application) {
        if (INSTANCE == null) {
            INSTANCE = new InstabugInternalTrackingDelegate(application);
        }
    }

    private boolean isNotInstabugActivity(Activity activity) {
        return !(activity instanceof _InstabugActivity);
    }

    private boolean isReproStepsEnable() {
        return z.j().h(Feature.REPRO_STEPS) == Feature.State.ENABLED && InstabugStateProvider.getInstance().getState().equals(InstabugState.ENABLED);
    }

    private boolean isUserTrackingStepsEnable() {
        return z.j().h(Feature.TRACK_USER_STEPS) == Feature.State.ENABLED && InstabugStateProvider.getInstance().getState().equals(InstabugState.ENABLED);
    }

    private void registerWindowCallbacksIfNeeded(Activity activity) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof f)) {
                InstabugSDKLogger.d(TAG, "register WindowCallbacks needed");
                activity.getWindow().setCallback(new f(callback));
            }
        }
    }

    public Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = this.currentActivity;
        if (weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public Object getLastSeenView() {
        WeakReference<Fragment> weakReference = this.lastResumedFragment;
        if (weakReference == null || weakReference.get() == null) {
            return getTargetActivity();
        }
        return this.lastResumedFragment.get();
    }

    public Activity getTargetActivity() {
        WeakReference<Activity> weakReference = this.currentActivity;
        Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
        if (activity != null && activity.getParent() != null) {
            Activity parent = activity.getParent();
            while (parent.getParent() != null) {
                parent = parent.getParent();
            }
            return parent;
        } else if (activity != null) {
            return activity;
        } else {
            return null;
        }
    }

    public void handleActivityCreatedEvent(Activity activity) {
        if (isNotInstabugActivity(activity)) {
            if (isUserTrackingStepsEnable()) {
                InstabugSDKLogger.d(TAG, activity.getClass().getSimpleName() + " created");
                e.c().a(activity.getClass().getName(), StepType.ACTIVITY_CREATED);
            }
            if (isReproStepsEnable() && SettingsManager.getInstance().getCurrentPlatform() == 2) {
                n.k().f(StepType.ACTIVITY_CREATED, activity.getClass().getSimpleName(), activity.getClass().getName(), (String) null);
            }
            CurrentActivityLifeCycleEventBus.getInstance().post(ActivityLifeCycleEvent.CREATED);
        }
    }

    public void handleActivityDestroyedEvent(Activity activity) {
        WeakReference<Activity> weakReference;
        if (isNotInstabugActivity(activity)) {
            if (isUserTrackingStepsEnable()) {
                InstabugSDKLogger.d(TAG, activity.getClass().getSimpleName() + " destroyed");
                e.c().a(activity.getClass().getName(), StepType.ACTIVITY_DESTROYED);
            }
            if (isReproStepsEnable()) {
                n.k().f(StepType.ACTIVITY_DESTROYED, activity.getClass().getSimpleName(), activity.getClass().getName(), (String) null);
            }
            if (!(activity == null || (weakReference = this.currentActivity) == null || weakReference.get() == null || activity != this.currentActivity.get())) {
                this.currentActivity.clear();
            }
            CurrentActivityLifeCycleEventBus.getInstance().post(ActivityLifeCycleEvent.DESTROYED);
        }
    }

    public void handleActivityPausedEvent(Activity activity) {
        WeakReference<Activity> weakReference = this.currentActivity;
        Activity activity2 = weakReference != null ? (Activity) weakReference.get() : null;
        if (isNotInstabugActivity(activity)) {
            if (activity2 == null) {
                InstabugSDKLogger.w(TAG, "No activity was set earlier than this call. Doing nothing");
                return;
            } else if (!activity.equals(activity2)) {
                InstabugSDKLogger.w(TAG, "You're trying to pause an activity that is not the current activity! Please make sure you're calling onCurrentActivityPaused and onCurrentActivityResumed on every activity");
                return;
            } else {
                if (isUserTrackingStepsEnable()) {
                    InstabugSDKLogger.d(TAG, activity.getClass().getSimpleName() + " paused");
                    e.c().a(activity.getClass().getName(), StepType.ACTIVITY_PAUSED);
                }
                if (isReproStepsEnable()) {
                    n.k().f(StepType.ACTIVITY_PAUSED, activity.getClass().getSimpleName(), activity.getClass().getName(), (String) null);
                }
                CurrentActivityLifeCycleEventBus.getInstance().post(ActivityLifeCycleEvent.PAUSED);
            }
        }
        g gVar = this.navigableViewsTrackingDelegate;
        Objects.requireNonNull(gVar);
        gVar.b(activity.getClass().getName());
    }

    public void handleActivityResumedEvent(Activity activity) {
        if (isNotInstabugActivity(activity)) {
            this.currentActivity = new WeakReference<>(activity);
            if (isUserTrackingStepsEnable()) {
                InstabugSDKLogger.d(TAG, activity.getClass().getSimpleName() + " resumed");
                e.c().a(activity.getClass().getName(), StepType.ACTIVITY_RESUMED);
            }
            if (isReproStepsEnable()) {
                n.k().f(StepType.ACTIVITY_RESUMED, activity.getClass().getSimpleName(), activity.getClass().getName(), (String) null);
                g gVar = this.navigableViewsTrackingDelegate;
                Objects.requireNonNull(gVar);
                List<TabLayout> a = gVar.a(activity.getWindow().getDecorView());
                if (a != null && a.size() > 0) {
                    gVar.c(a, activity.getClass().getName());
                }
            }
            CurrentActivityLifeCycleEventBus.getInstance().post(ActivityLifeCycleEvent.RESUMED);
            registerWindowCallbacksIfNeeded(activity);
        }
    }

    public void handleActivityStartedEvent(Activity activity) {
        if (isNotInstabugActivity(activity)) {
            if (isUserTrackingStepsEnable()) {
                InstabugSDKLogger.d(TAG, activity.getClass().getSimpleName() + " started");
                e.c().a(activity.getClass().getName(), StepType.ACTIVITY_STARTED);
            }
            if (isReproStepsEnable() && SettingsManager.getInstance().getCurrentPlatform() == 2) {
                n.k().f(StepType.ACTIVITY_STARTED, activity.getClass().getSimpleName(), activity.getClass().getName(), (String) null);
            }
        }
        CurrentActivityLifeCycleEventBus.getInstance().post(ActivityLifeCycleEvent.STARTED);
    }

    public void handleActivityStoppedEvent(Activity activity) {
        if (isNotInstabugActivity(activity)) {
            if (isUserTrackingStepsEnable()) {
                InstabugSDKLogger.d(TAG, activity.getClass().getSimpleName() + " stopped");
                e.c().a(activity.getClass().getName(), StepType.ACTIVITY_STOPPED);
            }
            if (isReproStepsEnable()) {
                n.k().f(StepType.ACTIVITY_STOPPED, activity.getClass().getSimpleName(), activity.getClass().getName(), (String) null);
            }
        }
        CurrentActivityLifeCycleEventBus.getInstance().post(ActivityLifeCycleEvent.STOPPED);
    }

    public void handleConfigurationChanged(Configuration configuration) {
        if (getTargetActivity() != null) {
            i0.j.e.y.a.a a = i0.j.e.y.a.a.a();
            a.b = configuration;
            i0.j.e.y.a.a.a().post(a);
        }
    }

    public boolean isRegistered() {
        return this.isRegistered;
    }

    public void onApplicationCreated(Application application) {
        if (isUserTrackingStepsEnable()) {
            InstabugSDKLogger.d(TAG, application.getClass().getSimpleName() + " created");
            e.c().a(application.getClass().getName(), StepType.APPLICATION_CREATED);
        }
    }

    public void onFragmentAttached(Fragment fragment) {
        WeakReference<Activity> weakReference = this.currentActivity;
        if (!(weakReference == null || weakReference.get() == null)) {
            Activity activity = (Activity) this.currentActivity.get();
            if (isUserTrackingStepsEnable()) {
                e.c().b(fragment.getClass().getName(), activity.getClass().getName(), (String) null, StepType.FRAGMENT_ATTACHED);
            }
        }
        if (isReproStepsEnable()) {
            n.k().f(StepType.FRAGMENT_ATTACHED, fragment.getClass().getSimpleName(), fragment.getClass().getName(), (String) null);
        }
    }

    public void onFragmentDetached(Fragment fragment) {
        WeakReference<Activity> weakReference = this.currentActivity;
        if (!(weakReference == null || weakReference.get() == null)) {
            Activity activity = (Activity) this.currentActivity.get();
            if (isUserTrackingStepsEnable()) {
                e.c().b(fragment.getClass().getName(), activity.getClass().getName(), (String) null, StepType.FRAGMENT_DETACHED);
            }
        }
        if (isReproStepsEnable()) {
            n.k().f(StepType.FRAGMENT_DETACHED, fragment.getClass().getSimpleName(), fragment.getClass().getName(), (String) null);
        }
        g gVar = this.navigableViewsTrackingDelegate;
        Objects.requireNonNull(gVar);
        gVar.b(fragment.getClass().getName());
    }

    public void onFragmentPaused(Fragment fragment) {
        this.lastResumedFragment = null;
        WeakReference<Activity> weakReference = this.currentActivity;
        if (!(weakReference == null || weakReference.get() == null)) {
            Activity activity = (Activity) this.currentActivity.get();
            if (isUserTrackingStepsEnable()) {
                e.c().b(fragment.getClass().getName(), activity.getClass().getName(), (String) null, StepType.FRAGMENT_PAUSED);
            }
        }
        if (isReproStepsEnable()) {
            n.k().f(StepType.FRAGMENT_PAUSED, fragment.getClass().getSimpleName(), fragment.getClass().getName(), (String) null);
        }
    }

    public void onFragmentResumed(Fragment fragment) {
        this.lastResumedFragment = new WeakReference<>(fragment);
        WeakReference<Activity> weakReference = this.currentActivity;
        String str = StepType.FRAGMENT_RESUMED;
        if (!(weakReference == null || weakReference.get() == null)) {
            Activity activity = (Activity) this.currentActivity.get();
            if (isUserTrackingStepsEnable()) {
                e.c().b(fragment.getClass().getName(), activity.getClass().getName(), (String) null, str);
            }
        }
        if (isReproStepsEnable() && fragment.getUserVisibleHint()) {
            n k = n.k();
            if (fragment instanceof DialogFragment) {
                str = StepType.DIALOG_FRAGMENT_RESUMED;
            }
            k.f(str, fragment.getClass().getSimpleName(), fragment.getClass().getName(), (String) null);
        }
        if (fragment != null && fragment.getActivity() != null) {
            registerWindowCallbacksIfNeeded(fragment.getActivity());
        }
    }

    public void onFragmentStarted(Fragment fragment) {
        WeakReference<Activity> weakReference = this.currentActivity;
        if (!(weakReference == null || weakReference.get() == null)) {
            Activity activity = (Activity) this.currentActivity.get();
            if (isUserTrackingStepsEnable()) {
                e.c().b(fragment.getClass().getName(), activity.getClass().getName(), (String) null, StepType.FRAGMENT_STARTED);
            }
        }
        if (isReproStepsEnable()) {
            n.k().f(StepType.FRAGMENT_STARTED, fragment.getClass().getSimpleName(), fragment.getClass().getName(), (String) null);
        }
    }

    public void onFragmentStopped(Fragment fragment) {
        WeakReference<Activity> weakReference = this.currentActivity;
        if (!(weakReference == null || weakReference.get() == null)) {
            Activity activity = (Activity) this.currentActivity.get();
            if (isUserTrackingStepsEnable()) {
                e.c().b(fragment.getClass().getName(), activity.getClass().getName(), (String) null, StepType.FRAGMENT_STOPPED);
            }
        }
        if (isReproStepsEnable()) {
            n.k().f(StepType.FRAGMENT_STOPPED, fragment.getClass().getSimpleName(), fragment.getClass().getName(), (String) null);
        }
    }

    public void onFragmentViewCreated(Fragment fragment) {
        List<TabLayout> a;
        WeakReference<Activity> weakReference = this.currentActivity;
        if (!(weakReference == null || weakReference.get() == null)) {
            Activity activity = (Activity) this.currentActivity.get();
            if (isUserTrackingStepsEnable()) {
                e.c().b(fragment.getClass().getName(), activity.getClass().getName(), (String) null, StepType.FRAGMENT_VIEW_CREATED);
            }
        }
        if (isReproStepsEnable()) {
            n.k().f(StepType.FRAGMENT_VIEW_CREATED, fragment.getClass().getSimpleName(), fragment.getClass().getName(), (String) null);
            g gVar = this.navigableViewsTrackingDelegate;
            Objects.requireNonNull(gVar);
            View view = fragment.getView();
            if (view != null && (a = gVar.a(view)) != null && a.size() > 0) {
                gVar.c(a, fragment.getClass().getName());
            }
        }
    }

    public void onFragmentVisibilityChanged(boolean z, Fragment fragment) {
        WeakReference<Activity> weakReference = this.currentActivity;
        if (!(weakReference == null || weakReference.get() == null)) {
            Activity activity = (Activity) this.currentActivity.get();
            if (isUserTrackingStepsEnable()) {
                e c = e.c();
                String name = fragment.getClass().getName();
                String name2 = activity.getClass().getName();
                c.b(name, name2, "Fragment visibility: " + z, StepType.FRAGMENT_VISIBILITY_CHANGED);
            }
        }
        if (isReproStepsEnable()) {
            n.k().f(StepType.FRAGMENT_VISIBILITY_CHANGED, fragment.getClass().getSimpleName(), fragment.getClass().getName(), (String) null);
        }
    }

    public void registerActivityLifecycleListener(Application application) {
        InstabugSDKLogger.d(TAG, "Registering activity lifecycle listener");
        application.registerActivityLifecycleCallbacks(this.activityLifecycleListener);
        application.registerComponentCallbacks(this.activityLifecycleListener);
        this.isRegistered = true;
    }

    public void trackTouchEvent(MotionEvent motionEvent) {
        if (d.a == null) {
            d.a = new d();
        }
        Objects.requireNonNull(d.a);
        int pointerCount = motionEvent.getPointerCount();
        a0[] a0VarArr = new a0[pointerCount];
        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
            motionEvent.getX(i);
            motionEvent.getY(i);
            a0VarArr[i] = new a0();
        }
        a0[] a0VarArr2 = (a0[]) Arrays.copyOf(a0VarArr, pointerCount);
        if (com.instabug.library.p.a.a == null) {
            com.instabug.library.p.a.a = new com.instabug.library.p.a();
        }
        com.instabug.library.p.a aVar = com.instabug.library.p.a.a;
        aVar.b.onTouchEvent(motionEvent);
        aVar.c.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            boolean z = true;
            if (action == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                aVar.i = System.currentTimeMillis();
                float f = aVar.f;
                float f2 = aVar.g;
                float abs = Math.abs(f - x);
                float f3 = (float) 200;
                if (abs <= f3 && Math.abs(f2 - y) <= f3) {
                    long j = aVar.i - aVar.h;
                    if (j <= ((long) aVar.e) || j >= ((long) aVar.d)) {
                        z = false;
                    }
                    if (z) {
                        aVar.b(StepType.LONG_PRESS, motionEvent);
                    } else if (!aVar.j && !aVar.k) {
                        aVar.b(StepType.TAP, motionEvent);
                    }
                    aVar.k = false;
                    return;
                }
                return;
            }
            return;
        }
        aVar.f = motionEvent.getX();
        aVar.g = motionEvent.getY();
        aVar.h = System.currentTimeMillis();
        aVar.j = false;
    }

    public void unregisterActivityLifecycleListener(Application application) {
        InstabugSDKLogger.d(TAG, "Unregistering activity lifecycle listener");
        application.unregisterActivityLifecycleCallbacks(this.activityLifecycleListener);
        application.unregisterComponentCallbacks(this.activityLifecycleListener);
        this.isRegistered = false;
    }
}
