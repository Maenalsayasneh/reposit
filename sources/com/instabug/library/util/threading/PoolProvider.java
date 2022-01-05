package com.instabug.library.util.threading;

import android.content.Context;
import android.os.Looper;
import com.instabug.library.Instabug;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.memory.MemoryUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class PoolProvider {
    private static PoolProvider INSTANCE = null;
    public static final int NUMBER_OF_CORES = Runtime.getRuntime().availableProcessors();
    private static final String TAG = "PoolProvider";
    /* access modifiers changed from: private */
    public static Map<String, i0.j.e.d1.h.c> singleThreadPoolExecutorhMap = new HashMap();
    private final ThreadPoolExecutor forBitmapTasks;
    /* access modifiers changed from: private */
    public final ThreadPoolExecutor forComputationTasks;
    private final ThreadPoolExecutor forIOTasks;
    private final ScheduledThreadPoolExecutor forScheduledTasks;
    private final Executor mainThreadExecutor = new i0.j.e.d1.h.a();

    public static class a implements Runnable {
        public final /* synthetic */ Runnable c;

        public a(Runnable runnable) {
            this.c = runnable;
        }

        public void run() {
            if (!MemoryUtils.isLowMemory(PoolProvider.getContext())) {
                try {
                    this.c.run();
                } catch (OutOfMemoryError e) {
                    InstabugSDKLogger.e(PoolProvider.TAG, "low memory, can't perform bitmap task", e);
                }
            } else {
                InstabugSDKLogger.e(PoolProvider.TAG, "low memory, can't perform bitmap task");
            }
        }
    }

    public static class b implements Runnable {
        public final /* synthetic */ Runnable c;

        public b(Runnable runnable) {
            this.c = runnable;
        }

        public void run() {
            if (!MemoryUtils.isLowMemory(PoolProvider.getContext())) {
                try {
                    this.c.run();
                } catch (OutOfMemoryError e) {
                    InstabugSDKLogger.e(PoolProvider.TAG, "low memory, can't run i/o task", e);
                }
            } else {
                InstabugSDKLogger.e(PoolProvider.TAG, "low memory, can't run i/o task");
            }
        }
    }

    public static class c implements Runnable {
        public final /* synthetic */ Runnable c;

        public c(Runnable runnable) {
            this.c = runnable;
        }

        public void run() {
            if (!MemoryUtils.isLowMemory(PoolProvider.getContext())) {
                try {
                    PoolProvider.getInstance().forComputationTasks.execute(this.c);
                } catch (OutOfMemoryError e) {
                    InstabugSDKLogger.e(PoolProvider.TAG, "low memory, can't run computation task", e);
                }
            } else {
                InstabugSDKLogger.e(PoolProvider.TAG, "low memory, can't run computation task");
            }
        }
    }

    public static class d implements Runnable {
        public final /* synthetic */ Runnable c;

        public d(Runnable runnable) {
            this.c = runnable;
        }

        public void run() {
            if (!MemoryUtils.isLowMemory(PoolProvider.getContext())) {
                try {
                    this.c.run();
                } catch (OutOfMemoryError e) {
                    InstabugSDKLogger.e(PoolProvider.TAG, "low memory, can't run delayed task", e);
                }
            } else {
                InstabugSDKLogger.e(PoolProvider.TAG, "low memory, can't run delayed task");
            }
        }
    }

    public static class e implements Runnable {
        public final /* synthetic */ Runnable c;

        public e(Runnable runnable) {
            this.c = runnable;
        }

        public void run() {
            if (!MemoryUtils.isLowMemory(PoolProvider.getContext())) {
                try {
                    this.c.run();
                } catch (OutOfMemoryError e) {
                    InstabugSDKLogger.e(PoolProvider.TAG, "low memory, can't run main thread task", e);
                }
            } else {
                InstabugSDKLogger.e(PoolProvider.TAG, "low memory, can't run main thread task");
            }
        }
    }

    public static class f implements Runnable {
        public final /* synthetic */ Runnable c;

        public f(Runnable runnable) {
            this.c = runnable;
        }

        public void run() {
            if (!MemoryUtils.isLowMemory(PoolProvider.getContext())) {
                try {
                    this.c.run();
                } catch (OutOfMemoryError e) {
                    InstabugSDKLogger.e(PoolProvider.TAG, "low memory, can't run task", e);
                }
            } else {
                InstabugSDKLogger.e(PoolProvider.TAG, "low memory, can't run task");
            }
        }
    }

    public static class g implements i0.j.e.d1.h.d {
    }

    private PoolProvider() {
        i0.j.e.d1.h.b bVar = new i0.j.e.d1.h.b(10);
        int i = NUMBER_OF_CORES;
        int i2 = i * 2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        i0.j.e.d1.h.b bVar2 = bVar;
        this.forBitmapTasks = new ThreadPoolExecutor(i2, i2 + 2, 10, timeUnit, new LinkedBlockingQueue(), bVar2);
        int i3 = i * 2;
        this.forIOTasks = new ThreadPoolExecutor(i3, i3 + 2, 10, timeUnit, new LinkedBlockingQueue(), bVar2);
        int i4 = i * 2;
        this.forComputationTasks = new ThreadPoolExecutor(i4, i4 + 2, 10, timeUnit, new LinkedBlockingQueue(), bVar2);
        this.forScheduledTasks = new ScheduledThreadPoolExecutor(i * 2, bVar);
    }

    public static Context getContext() {
        try {
            return Instabug.getApplicationContext();
        } catch (IllegalStateException e2) {
            InstabugSDKLogger.e(TAG, e2.getMessage(), e2);
            return null;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static synchronized com.instabug.library.util.threading.PoolProvider getInstance() {
        /*
            java.lang.Class<com.instabug.library.util.threading.PoolProvider> r0 = com.instabug.library.util.threading.PoolProvider.class
            monitor-enter(r0)
            com.instabug.library.util.threading.PoolProvider r1 = INSTANCE     // Catch:{ all -> 0x0018 }
            if (r1 != 0) goto L_0x0014
            monitor-enter(r0)     // Catch:{ all -> 0x0018 }
            com.instabug.library.util.threading.PoolProvider r1 = new com.instabug.library.util.threading.PoolProvider     // Catch:{ all -> 0x0011 }
            r1.<init>()     // Catch:{ all -> 0x0011 }
            INSTANCE = r1     // Catch:{ all -> 0x0011 }
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            goto L_0x0014
        L_0x0011:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            throw r1     // Catch:{ all -> 0x0018 }
        L_0x0014:
            com.instabug.library.util.threading.PoolProvider r1 = INSTANCE     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)
            return r1
        L_0x0018:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.util.threading.PoolProvider.getInstance():com.instabug.library.util.threading.PoolProvider");
    }

    public static Executor getSingleThreadExecuter(String str) {
        if (singleThreadPoolExecutorhMap.containsKey(str)) {
            return singleThreadPoolExecutorhMap.get(str);
        }
        i0.j.e.d1.h.c cVar = new i0.j.e.d1.h.c();
        if (str != null) {
            cVar.c = str;
        }
        cVar.d = new g();
        singleThreadPoolExecutorhMap.put(str, cVar);
        return cVar;
    }

    public static Executor getUserActionsExecutor() {
        return getSingleThreadExecuter("user-actions-executor");
    }

    public static Executor getUserEventLoggerExecuter() {
        return getSingleThreadExecuter("UserEventLogger");
    }

    public static Executor newBackgroundExecutor() {
        int i = NUMBER_OF_CORES * 2;
        return new ThreadPoolExecutor(i, i + 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new i0.j.e.d1.h.b(10));
    }

    public static void postBitmapTask(Runnable runnable) {
        InstabugSDKLogger.v(TAG, "postBitmapTask");
        getInstance().forBitmapTasks.execute(new a(runnable));
    }

    public static void postComputationTask(Runnable runnable) {
        InstabugSDKLogger.v(TAG, "postComputationTask");
        getInstance().forComputationTasks.execute(new c(runnable));
    }

    public static void postDelayedTask(Runnable runnable, long j) {
        getInstance().forScheduledTasks.schedule(new d(runnable), j, TimeUnit.MILLISECONDS);
    }

    public static void postIOTask(Runnable runnable) {
        InstabugSDKLogger.v(TAG, "postIOTask");
        getInstance().forIOTasks.execute(new b(runnable));
    }

    public static void postIOTaskWithCheck(Runnable runnable) {
        InstabugSDKLogger.v(TAG, "postIOTaskWithCheck");
        if (Looper.myLooper() == Looper.getMainLooper()) {
            postIOTask(runnable);
        } else {
            runnable.run();
        }
    }

    public static void postMainThreadTask(Runnable runnable) {
        InstabugSDKLogger.v(TAG, "postMainThreadTask");
        getInstance().mainThreadExecutor.execute(new e(runnable));
    }

    public static void postTask(Executor executor, Runnable runnable) {
        InstabugSDKLogger.v(TAG, "postTask");
        executor.execute(new f(runnable));
    }

    public ThreadPoolExecutor getBackgroundExecutor() {
        return this.forIOTasks;
    }
}
