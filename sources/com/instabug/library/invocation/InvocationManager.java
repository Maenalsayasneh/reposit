package com.instabug.library.invocation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugState;
import com.instabug.library.InstabugStateProvider;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.CurrentActivityLifeCycleEventBus;
import com.instabug.library.core.plugin.PluginPromptOption;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.tracking.ActivityLifeCycleEvent;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import h0.i.i.f;
import i0.j.e.m0.d.i;
import i0.j.e.m0.d.k;
import i0.j.e.m0.d.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import k0.b.y.d;

public class InvocationManager {
    private static InvocationManager INSTANCE = null;
    public static final String TAG = "InvocationManager";
    private k0.b.w.a currentActivityLifeCycleDisposable;
    private InstabugInvocationEvent[] currentInstabugInvocationEvents = {InstabugInvocationEvent.SHAKE};
    private InvocationSettings currentInvocationSettings = new InvocationSettings();
    private List<i0.j.e.m0.d.a> currentInvokers = Collections.synchronizedList(new ArrayList());
    private i0.j.e.m0.c invocationRequestListenerImp;
    private boolean isInvocationAvailable = true;
    private i0.j.e.m0.d.a lastUsedInvoker;

    public class a implements d<ActivityLifeCycleEvent> {
        public a() {
        }

        public void b(Object obj) throws Exception {
            int i = c.b[((ActivityLifeCycleEvent) obj).ordinal()];
            if (i == 1) {
                InstabugSDKLogger.d(InvocationManager.TAG, "current activity resumed");
                InvocationManager.this.listen();
            } else if (i == 2) {
                InstabugSDKLogger.d(InvocationManager.TAG, "current activity paused");
                InvocationManager.this.sleep();
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ i0.j.e.m0.d.a c;

        public b(i0.j.e.m0.d.a aVar) {
            this.c = aVar;
        }

        public void run() {
            this.c.c();
            this.c.a();
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0036 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0041 */
        static {
            /*
                com.instabug.library.tracking.ActivityLifeCycleEvent.values()
                r0 = 6
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                com.instabug.library.tracking.ActivityLifeCycleEvent r2 = com.instabug.library.tracking.ActivityLifeCycleEvent.RESUMED     // Catch:{ NoSuchFieldError -> 0x0011 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0011 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001c }
                com.instabug.library.tracking.ActivityLifeCycleEvent r3 = com.instabug.library.tracking.ActivityLifeCycleEvent.PAUSED     // Catch:{ NoSuchFieldError -> 0x001c }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001c }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                com.instabug.library.invocation.InstabugInvocationEvent.values()
                r2 = 5
                int[] r2 = new int[r2]
                a = r2
                com.instabug.library.invocation.InstabugInvocationEvent r3 = com.instabug.library.invocation.InstabugInvocationEvent.SHAKE     // Catch:{ NoSuchFieldError -> 0x002c }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002c }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002c }
            L_0x002c:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0036 }
                com.instabug.library.invocation.InstabugInvocationEvent r2 = com.instabug.library.invocation.InstabugInvocationEvent.FLOATING_BUTTON     // Catch:{ NoSuchFieldError -> 0x0036 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0036 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0036 }
            L_0x0036:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0041 }
                com.instabug.library.invocation.InstabugInvocationEvent r1 = com.instabug.library.invocation.InstabugInvocationEvent.TWO_FINGER_SWIPE_LEFT     // Catch:{ NoSuchFieldError -> 0x0041 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0041 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0041 }
            L_0x0041:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x004c }
                com.instabug.library.invocation.InstabugInvocationEvent r1 = com.instabug.library.invocation.InstabugInvocationEvent.SCREENSHOT     // Catch:{ NoSuchFieldError -> 0x004c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.invocation.InvocationManager.c.<clinit>():void");
        }
    }

    private InvocationManager() {
        subscribeToCarenActivityLifeCycle();
        this.invocationRequestListenerImp = new i0.j.e.m0.c();
    }

    private i0.j.e.m0.d.b getFloatingButtonInvoker() {
        List<i0.j.e.m0.d.a> list = this.currentInvokers;
        if (list != null) {
            for (i0.j.e.m0.d.a next : list) {
                if (next instanceof i0.j.e.m0.d.b) {
                    return (i0.j.e.m0.d.b) next;
                }
            }
        }
        return null;
    }

    public static synchronized InvocationManager getInstance() {
        InvocationManager invocationManager;
        synchronized (InvocationManager.class) {
            if (INSTANCE == null) {
                init();
            }
            invocationManager = INSTANCE;
        }
        return invocationManager;
    }

    public static synchronized void init() {
        synchronized (InvocationManager.class) {
            InstabugSDKLogger.d(TAG, "initializing invocationManager");
            if (INSTANCE == null) {
                INSTANCE = new InvocationManager();
            } else if (!SettingsManager.getInstance().isInBackground()) {
                INSTANCE.listen();
            }
        }
    }

    private boolean isPromptOptionsAvailable() {
        return getAvailablePromptOptions().size() > 0;
    }

    private void subscribeToCarenActivityLifeCycle() {
        this.currentActivityLifeCycleDisposable = CurrentActivityLifeCycleEventBus.getInstance().subscribe(new a());
    }

    @SuppressLint({"ERADICATE_FIELD_NOT_NULLABLE"})
    public static void tearDown() {
        INSTANCE = null;
    }

    public void forceInvoke(int i) {
        PluginPromptOption pluginPromptOption;
        i0.j.e.m0.c cVar = this.invocationRequestListenerImp;
        if (cVar != null) {
            if (i == 1) {
                pluginPromptOption = i0.j.c.l.a.m(0, true);
            } else if (i == 2) {
                pluginPromptOption = i0.j.c.l.a.m(1, true);
            } else if (i != 3) {
                if (i == 4) {
                    cVar.d(2);
                } else if (i == 5) {
                    cVar.d(5);
                    return;
                }
                pluginPromptOption = null;
            } else {
                pluginPromptOption = i0.j.c.l.a.m(3, true);
            }
            if (pluginPromptOption == null) {
                return;
            }
            if (SettingsManager.isInitialScreenShotAllowed()) {
                cVar.b(pluginPromptOption);
            } else {
                cVar.a((Uri) null, pluginPromptOption);
            }
        }
    }

    public ArrayList<PluginPromptOption> getAvailablePromptOptions() {
        return i0.j.e.y.b.a.d();
    }

    public InstabugInvocationEvent[] getCurrentInstabugInvocationEvents() {
        InstabugInvocationEvent[] instabugInvocationEventArr = this.currentInstabugInvocationEvents;
        return (InstabugInvocationEvent[]) Arrays.copyOf(instabugInvocationEventArr, instabugInvocationEventArr.length);
    }

    public InvocationSettings getCurrentInvocationSettings() {
        return this.currentInvocationSettings;
    }

    public List<i0.j.e.m0.d.a> getCurrentInvokers() {
        return this.currentInvokers;
    }

    public i0.j.e.m0.d.a getLastUsedInvoker() {
        return this.lastUsedInvoker;
    }

    public void handle(MotionEvent motionEvent) {
        List<i0.j.e.m0.d.a> list;
        if (InstabugStateProvider.getInstance().getState().equals(InstabugState.ENABLED) && !InstabugCore.isForegroundBusy() && (list = this.currentInvokers) != null) {
            for (i0.j.e.m0.d.a next : list) {
                if (next instanceof l) {
                    l lVar = (l) next;
                    synchronized (lVar) {
                        if (lVar.c != null) {
                            if ((motionEvent.getAction() & 255) == 2) {
                                if (motionEvent.getPointerCount() >= 2) {
                                    lVar.x = true;
                                } else {
                                    return;
                                }
                            }
                            ((f.b) lVar.c.a).a.onTouchEvent(motionEvent);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public void invoke(int i) {
        PluginPromptOption pluginPromptOption;
        i0.j.e.m0.c cVar = this.invocationRequestListenerImp;
        if (cVar != null) {
            if (i == 1) {
                pluginPromptOption = i0.j.c.l.a.m(0, false);
            } else if (i == 2) {
                pluginPromptOption = i0.j.c.l.a.m(1, false);
            } else if (i != 3) {
                if (i == 4) {
                    cVar.d(2);
                } else if (i == 5) {
                    cVar.d(5);
                    return;
                }
                pluginPromptOption = null;
            } else {
                pluginPromptOption = i0.j.c.l.a.m(3, false);
            }
            if (pluginPromptOption == null) {
                return;
            }
            if (SettingsManager.isInitialScreenShotAllowed()) {
                cVar.b(pluginPromptOption);
            } else {
                cVar.a((Uri) null, pluginPromptOption);
            }
        }
    }

    public void listen() {
        if (Instabug.isEnabled() && this.isInvocationAvailable && isPromptOptionsAvailable() && this.currentInvokers != null && InstabugCore.getTargetActivity() != null && !SettingsManager.getInstance().isProcessingForeground()) {
            for (i0.j.e.m0.d.a next : this.currentInvokers) {
                if (!next.b()) {
                    next.a();
                }
            }
        }
    }

    public void notifyInvocationOptionChanged() {
        boolean z = !isPromptOptionsAvailable();
        i0.j.e.m0.d.b floatingButtonInvoker = getFloatingButtonInvoker();
        if (floatingButtonInvoker == null) {
            return;
        }
        if (z) {
            floatingButtonInvoker.c();
        } else {
            PoolProvider.postMainThreadTask(new i0.j.e.m0.d.c(floatingButtonInvoker));
        }
    }

    public void notifyPrimaryColorChanged() {
        List<i0.j.e.m0.d.a> list;
        if (Instabug.isEnabled() && (list = this.currentInvokers) != null) {
            for (i0.j.e.m0.d.a next : list) {
                if (InstabugCore.getTargetActivity() != null && (next instanceof i0.j.e.m0.d.b)) {
                    PoolProvider.postMainThreadTask(new b(next));
                }
            }
        }
    }

    public void release() {
        k0.b.w.a aVar = this.currentActivityLifeCycleDisposable;
        if (aVar != null && !aVar.isDisposed()) {
            this.currentActivityLifeCycleDisposable.dispose();
        }
        this.invocationRequestListenerImp = null;
    }

    public InstabugInvocationEvent[] removeDuplicates(InstabugInvocationEvent[] instabugInvocationEventArr) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (InstabugInvocationEvent instabugInvocationEvent : instabugInvocationEventArr) {
            if (!hashSet.contains(instabugInvocationEvent)) {
                arrayList.add(instabugInvocationEvent);
                hashSet.add(instabugInvocationEvent);
            }
        }
        return (InstabugInvocationEvent[]) arrayList.toArray(new InstabugInvocationEvent[arrayList.size()]);
    }

    public void setInstabugInvocationEvent(InstabugInvocationEvent... instabugInvocationEventArr) {
        this.currentInstabugInvocationEvents = removeDuplicates(instabugInvocationEventArr);
        List<i0.j.e.m0.d.a> list = this.currentInvokers;
        if (list != null) {
            for (i0.j.e.m0.d.a c2 : list) {
                c2.c();
            }
            this.currentInvokers.clear();
        }
        InstabugInvocationEvent[] instabugInvocationEventArr2 = this.currentInstabugInvocationEvents;
        int length = instabugInvocationEventArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            InstabugInvocationEvent instabugInvocationEvent = instabugInvocationEventArr2[i];
            InstabugSDKLogger.d(TAG, "set instabug invocation event: " + instabugInvocationEvent);
            if (instabugInvocationEvent == InstabugInvocationEvent.NONE && instabugInvocationEventArr.length == 1) {
                this.currentInvokers = null;
                break;
            }
            if (this.currentInvokers == null) {
                this.currentInvokers = new ArrayList();
            }
            Context applicationContext = Instabug.getApplicationContext();
            if (this.invocationRequestListenerImp != null) {
                int i2 = c.a[instabugInvocationEvent.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        this.currentInvokers.add(new i0.j.e.m0.d.b(this.invocationRequestListenerImp));
                    } else if (i2 != 3) {
                        if (i2 == 4) {
                            this.currentInvokers.add(new i(this.invocationRequestListenerImp));
                        }
                    } else if (applicationContext != null) {
                        this.currentInvokers.add(new l(applicationContext, this.invocationRequestListenerImp));
                    } else {
                        InstabugSDKLogger.w(TAG, "did not add TwoFingerSwipeLeftInvoker due to null appContext");
                    }
                } else if (applicationContext != null) {
                    k kVar = new k(applicationContext, this.invocationRequestListenerImp);
                    kVar.c.a2 = this.currentInvocationSettings.getShakeThreshold();
                    this.currentInvokers.add(kVar);
                } else {
                    InstabugSDKLogger.w(TAG, "did not add ShakeInvoker due to null appContext");
                }
            }
            i++;
        }
        if (this.currentInvokers != null) {
            setLastUsedInvoker((i0.j.e.m0.d.a) null);
            listen();
        }
    }

    public void setLastUsedInvoker(i0.j.e.m0.d.a aVar) {
        this.lastUsedInvoker = aVar;
    }

    public void show() {
        i0.j.e.m0.c cVar = this.invocationRequestListenerImp;
        if (cVar != null) {
            cVar.c((Uri) null);
        }
        this.lastUsedInvoker = null;
    }

    public void sleep() {
        List<i0.j.e.m0.d.a> list = this.currentInvokers;
        if (list != null) {
            for (i0.j.e.m0.d.a next : list) {
                if (next.b()) {
                    next.c();
                }
            }
        }
    }

    public void switchOffInvocation() {
        this.isInvocationAvailable = false;
    }

    public void switchOnInvocation() {
        this.isInvocationAvailable = true;
    }
}
