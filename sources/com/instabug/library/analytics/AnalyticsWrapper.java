package com.instabug.library.analytics;

import android.content.Context;
import com.instabug.library.analytics.model.Api;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import k0.b.l;
import k0.b.z.b.a;
import k0.b.z.e.c.n;

public class AnalyticsWrapper {
    private static AnalyticsWrapper INSTANCE = null;
    private static final String TAG = "AnalyticsWrapper";
    private volatile i0.j.e.a.b analyticsLogger;

    public class a extends k0.b.b0.b<Boolean> {
        public a() {
        }

        public void b(Object obj) {
            Boolean bool = (Boolean) obj;
            InstabugSDKLogger.i(AnalyticsWrapper.TAG, "SDK analytics is enabled: " + bool);
            if (bool.booleanValue()) {
                AnalyticsWrapper.this.enableAnalyticsLogging();
                return;
            }
            AnalyticsWrapper.this.disableAnalyticsLogging();
            AnalyticsWrapper.this.dropCachedLogs();
        }

        public void onComplete() {
        }

        public void onError(Throwable th) {
            InstabugSDKLogger.e(AnalyticsWrapper.TAG, th.getClass().getSimpleName(), th);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ String c;
        public final /* synthetic */ Api.Parameter[] d;

        public b(String str, Api.Parameter[] parameterArr) {
            this.c = str;
            this.d = parameterArr;
        }

        public void run() {
            AnalyticsWrapper.this.catchApiUsage(this.c, this.d);
        }
    }

    private AnalyticsWrapper() {
        Class<Boolean> cls = Boolean.class;
        l<E> observeEvents = i0.j.e.a.d.b.a().observeEvents(cls);
        l<E> observeEvents2 = i0.j.e.a.d.b.a().observeEvents(cls);
        Objects.requireNonNull(observeEvents);
        Objects.requireNonNull(observeEvents2, "next is null");
        RxJavaPlugins.onAssembly(new n(observeEvents, new a.i(observeEvents2), false)).v(k0.b.d0.a.a()).c(new a());
    }

    /* access modifiers changed from: private */
    public void disableAnalyticsLogging() {
        k0.b.w.a aVar;
        i0.j.e.a.b analyticsLogger2 = getAnalyticsLogger();
        if (!(analyticsLogger2 == null || (aVar = analyticsLogger2.c) == null)) {
            aVar.dispose();
        }
        setAnalyticsLogger((i0.j.e.a.b) null);
    }

    /* access modifiers changed from: private */
    public void dropCachedLogs() {
        i0.j.e.a.d.a.c();
        i0.j.e.a.d.a.a();
    }

    /* access modifiers changed from: private */
    public void enableAnalyticsLogging() {
        if (getAnalyticsLogger() == null) {
            setAnalyticsLogger(new i0.j.e.a.b());
        }
    }

    private i0.j.e.a.b getAnalyticsLogger() {
        return this.analyticsLogger;
    }

    public static synchronized AnalyticsWrapper getInstance() {
        AnalyticsWrapper analyticsWrapper;
        synchronized (AnalyticsWrapper.class) {
            if (INSTANCE == null) {
                INSTANCE = new AnalyticsWrapper();
            }
            analyticsWrapper = INSTANCE;
        }
        return analyticsWrapper;
    }

    public static long getLastUploadedAt(Context context) {
        return context.getSharedPreferences(SettingsManager.INSTABUG_SHARED_PREF_NAME, 0).getLong("analytics_last_uploaded", 0);
    }

    public static boolean haveBeenCleanedBefore(Context context) {
        return context.getSharedPreferences(SettingsManager.INSTABUG_SHARED_PREF_NAME, 0).getBoolean("have_been_cleaned", false);
    }

    private void setAnalyticsLogger(i0.j.e.a.b bVar) {
        this.analyticsLogger = bVar;
    }

    public static void setBeingCleaned(boolean z, Context context) {
        context.getSharedPreferences(SettingsManager.INSTABUG_SHARED_PREF_NAME, 0).edit().putBoolean("have_been_cleaned", z).apply();
    }

    public static void setLastUploadedAt(long j, Context context) {
        context.getSharedPreferences(SettingsManager.INSTABUG_SHARED_PREF_NAME, 0).edit().putLong("analytics_last_uploaded", j).apply();
    }

    public void catchApiUsage(String str, Api.Parameter... parameterArr) {
        i0.j.e.a.b analyticsLogger2 = getAnalyticsLogger();
        if (analyticsLogger2 != null) {
            analyticsLogger2.b.add(analyticsLogger2.b(str, false, parameterArr));
        }
    }

    public void catchApiUsageAsync(String str, Api.Parameter... parameterArr) {
        PoolProvider.postIOTask(new b(str, parameterArr));
    }

    public void catchDeprecatedApiUsage(String str, Api.Parameter... parameterArr) {
        i0.j.e.a.b analyticsLogger2 = getAnalyticsLogger();
        if (analyticsLogger2 != null) {
            analyticsLogger2.b.add(analyticsLogger2.b(str, true, parameterArr));
        }
    }

    public void catchDeprecatedLoggingApiUsage(String str, Api.Parameter... parameterArr) {
        i0.j.e.a.b analyticsLogger2 = getAnalyticsLogger();
        if (analyticsLogger2 != null) {
            analyticsLogger2.a(str, true, parameterArr);
        }
    }

    public void catchLoggingApiUsage(String str, Api.Parameter... parameterArr) {
        i0.j.e.a.b analyticsLogger2 = getAnalyticsLogger();
        if (analyticsLogger2 != null) {
            analyticsLogger2.a(str, false, parameterArr);
        }
    }
}
