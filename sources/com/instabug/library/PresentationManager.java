package com.instabug.library;

import android.app.Activity;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class PresentationManager {
    private static volatile PresentationManager INSTANCE = null;
    private static final String TAG = "PresentationManager";
    private WeakReference<Activity> currentActivity;
    private boolean isInInstabugContext = false;
    private boolean isNotificationShowing = false;
    private String lastRunnableName;
    private final ArrayList<Runnable> screensList = new ArrayList<>();

    private PresentationManager() {
    }

    public static synchronized PresentationManager getInstance() {
        PresentationManager presentationManager;
        synchronized (PresentationManager.class) {
            if (INSTANCE != null) {
                presentationManager = INSTANCE;
            } else {
                presentationManager = new PresentationManager();
                INSTANCE = presentationManager;
            }
        }
        return presentationManager;
    }

    private boolean hasPreviousRunnable(ArrayList<Runnable> arrayList) {
        Iterator<Runnable> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().getClass().getName().equals(this.lastRunnableName)) {
                InstabugSDKLogger.v(TAG, "hasPreviousRunnable");
                return true;
            }
        }
        InstabugSDKLogger.v(TAG, "hasPreviousRunnable false");
        return false;
    }

    private boolean instabugNotDisplayed() {
        boolean isForegroundBusy;
        WeakReference<Activity> weakReference = this.currentActivity;
        if (weakReference == null || weakReference.get() == null) {
            isForegroundBusy = InstabugCore.isForegroundBusy();
        } else {
            isForegroundBusy = this.currentActivity.get() instanceof _InstabugActivity;
        }
        return !isForegroundBusy;
    }

    public static void release() {
        INSTANCE = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = (android.app.Activity) r0.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getCurrentActivityName() {
        /*
            r1 = this;
            java.lang.ref.WeakReference<android.app.Activity> r0 = r1.currentActivity
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = r0.getLocalClassName()
            return r0
        L_0x0011:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.PresentationManager.getCurrentActivityName():java.lang.String");
    }

    public synchronized void notifyActivityChanged() {
        InstabugSDKLogger.v(TAG, "screensList.size(): " + this.screensList.size());
        InstabugSDKLogger.v(TAG, "!InstabugCore.isForegroundBusy(): " + (InstabugCore.isForegroundBusy() ^ true));
        if (this.screensList.size() > 0 && !InstabugCore.isForegroundBusy() && Instabug.isEnabled()) {
            this.lastRunnableName = this.screensList.get(0).getClass().getName();
            PoolProvider.postMainThreadTask(this.screensList.remove(0));
        }
    }

    public void setCurrentActivity(Activity activity) {
        this.currentActivity = new WeakReference<>(activity);
    }

    public void setInInstabugContext(boolean z) {
        this.isInInstabugContext = z;
    }

    public void setNotificationShowing(boolean z) {
        this.isNotificationShowing = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e5, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void show(java.lang.Runnable r6) {
        /*
            r5 = this;
            java.util.ArrayList<java.lang.Runnable> r0 = r5.screensList
            monitor-enter(r0)
            if (r6 == 0) goto L_0x00e4
            java.util.ArrayList<java.lang.Runnable> r1 = r5.screensList     // Catch:{ all -> 0x00e6 }
            boolean r1 = r5.hasPreviousRunnable(r1)     // Catch:{ all -> 0x00e6 }
            if (r1 == 0) goto L_0x000f
            goto L_0x00e4
        L_0x000f:
            java.util.ArrayList<java.lang.Runnable> r1 = r5.screensList     // Catch:{ all -> 0x00e6 }
            r1.add(r6)     // Catch:{ all -> 0x00e6 }
            java.lang.String r6 = "PresentationManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e6 }
            r1.<init>()     // Catch:{ all -> 0x00e6 }
            java.lang.String r2 = "screensList Size:"
            r1.append(r2)     // Catch:{ all -> 0x00e6 }
            java.util.ArrayList<java.lang.Runnable> r2 = r5.screensList     // Catch:{ all -> 0x00e6 }
            int r2 = r2.size()     // Catch:{ all -> 0x00e6 }
            r1.append(r2)     // Catch:{ all -> 0x00e6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e6 }
            com.instabug.library.util.InstabugSDKLogger.d(r6, r1)     // Catch:{ all -> 0x00e6 }
            java.lang.String r6 = "PresentationManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e6 }
            r1.<init>()     // Catch:{ all -> 0x00e6 }
            java.lang.String r2 = "currentActivity != null:"
            r1.append(r2)     // Catch:{ all -> 0x00e6 }
            java.lang.ref.WeakReference<android.app.Activity> r2 = r5.currentActivity     // Catch:{ all -> 0x00e6 }
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0044
            r2 = r4
            goto L_0x0045
        L_0x0044:
            r2 = r3
        L_0x0045:
            r1.append(r2)     // Catch:{ all -> 0x00e6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e6 }
            com.instabug.library.util.InstabugSDKLogger.d(r6, r1)     // Catch:{ all -> 0x00e6 }
            java.lang.String r6 = "PresentationManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e6 }
            r1.<init>()     // Catch:{ all -> 0x00e6 }
            java.lang.String r2 = "currentActivity.get() != null:"
            r1.append(r2)     // Catch:{ all -> 0x00e6 }
            java.lang.ref.WeakReference<android.app.Activity> r2 = r5.currentActivity     // Catch:{ all -> 0x00e6 }
            if (r2 == 0) goto L_0x0068
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x00e6 }
            if (r2 == 0) goto L_0x0068
            java.lang.ref.WeakReference<android.app.Activity> r2 = r5.currentActivity     // Catch:{ all -> 0x00e6 }
            goto L_0x006a
        L_0x0068:
            java.lang.String r2 = " activity isn't provided"
        L_0x006a:
            r1.append(r2)     // Catch:{ all -> 0x00e6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e6 }
            com.instabug.library.util.InstabugSDKLogger.d(r6, r1)     // Catch:{ all -> 0x00e6 }
            java.lang.String r6 = "PresentationManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e6 }
            r1.<init>()     // Catch:{ all -> 0x00e6 }
            java.lang.String r2 = "!(currentActivity.get() instanceof _InstabugActivity: "
            r1.append(r2)     // Catch:{ all -> 0x00e6 }
            java.lang.ref.WeakReference<android.app.Activity> r2 = r5.currentActivity     // Catch:{ all -> 0x00e6 }
            if (r2 == 0) goto L_0x008d
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x00e6 }
            boolean r2 = r2 instanceof com.instabug.library._InstabugActivity     // Catch:{ all -> 0x00e6 }
            if (r2 != 0) goto L_0x008d
            r3 = r4
        L_0x008d:
            r1.append(r3)     // Catch:{ all -> 0x00e6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e6 }
            com.instabug.library.util.InstabugSDKLogger.d(r6, r1)     // Catch:{ all -> 0x00e6 }
            java.lang.String r6 = "PresentationManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e6 }
            r1.<init>()     // Catch:{ all -> 0x00e6 }
            java.lang.String r2 = "!isNotificationShowing:"
            r1.append(r2)     // Catch:{ all -> 0x00e6 }
            boolean r2 = r5.isNotificationShowing     // Catch:{ all -> 0x00e6 }
            r2 = r2 ^ r4
            r1.append(r2)     // Catch:{ all -> 0x00e6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e6 }
            com.instabug.library.util.InstabugSDKLogger.d(r6, r1)     // Catch:{ all -> 0x00e6 }
            java.lang.String r6 = "PresentationManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e6 }
            r1.<init>()     // Catch:{ all -> 0x00e6 }
            java.lang.String r2 = "!isInInstabugContext:"
            r1.append(r2)     // Catch:{ all -> 0x00e6 }
            boolean r2 = r5.isInInstabugContext     // Catch:{ all -> 0x00e6 }
            r2 = r2 ^ r4
            r1.append(r2)     // Catch:{ all -> 0x00e6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e6 }
            com.instabug.library.util.InstabugSDKLogger.d(r6, r1)     // Catch:{ all -> 0x00e6 }
            java.util.ArrayList<java.lang.Runnable> r6 = r5.screensList     // Catch:{ all -> 0x00e6 }
            int r6 = r6.size()     // Catch:{ all -> 0x00e6 }
            if (r6 != r4) goto L_0x00e2
            boolean r6 = r5.instabugNotDisplayed()     // Catch:{ all -> 0x00e6 }
            if (r6 == 0) goto L_0x00e2
            boolean r6 = r5.isNotificationShowing     // Catch:{ all -> 0x00e6 }
            if (r6 != 0) goto L_0x00e2
            boolean r6 = r5.isInInstabugContext     // Catch:{ all -> 0x00e6 }
            if (r6 != 0) goto L_0x00e2
            r5.notifyActivityChanged()     // Catch:{ all -> 0x00e6 }
        L_0x00e2:
            monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
            return
        L_0x00e4:
            monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
            return
        L_0x00e6:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.PresentationManager.show(java.lang.Runnable):void");
    }
}
