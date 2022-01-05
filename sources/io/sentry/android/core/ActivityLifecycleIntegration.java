package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import io.sentry.Breadcrumb;
import io.sentry.IHub;
import io.sentry.ILogger;
import io.sentry.ITransaction;
import io.sentry.Integration;
import io.sentry.Scope;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SpanStatus;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.io.IOException;
import java.util.Map;
import java.util.WeakHashMap;
import k0.c.w.a.b;
import k0.c.w.a.c;
import org.jetbrains.annotations.VisibleForTesting;

public final class ActivityLifecycleIntegration implements Integration, Closeable, Application.ActivityLifecycleCallbacks {
    private final WeakHashMap<Activity, ITransaction> activitiesWithOngoingTransactions = new WeakHashMap<>();
    private final Application application;
    private IHub hub;
    private SentryAndroidOptions options;
    private boolean performanceEnabled = false;

    public ActivityLifecycleIntegration(Application application2) {
        this.application = (Application) Objects.requireNonNull(application2, "Application is required");
    }

    private void addBreadcrumb(Activity activity, String str) {
        if (this.options.isEnableActivityLifecycleBreadcrumbs()) {
            Breadcrumb breadcrumb = new Breadcrumb();
            breadcrumb.setType(NotificationCompat.CATEGORY_NAVIGATION);
            breadcrumb.setData("state", str);
            breadcrumb.setData("screen", getActivityName(activity));
            breadcrumb.setCategory("ui.lifecycle");
            breadcrumb.setLevel(SentryLevel.INFO);
            this.hub.addBreadcrumb(breadcrumb);
        }
    }

    private void finishTransaction(ITransaction iTransaction) {
        if (iTransaction != null) {
            SpanStatus status = iTransaction.getStatus();
            if (status == null) {
                status = SpanStatus.OK;
            }
            iTransaction.finish(status);
        }
    }

    private String getActivityName(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    private boolean isPerformanceEnabled(SentryAndroidOptions sentryAndroidOptions) {
        return !(sentryAndroidOptions.getTracesSampleRate() == null && sentryAndroidOptions.getTracesSampler() == null) && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
    }

    private boolean isRunningTransaction(Activity activity) {
        return this.activitiesWithOngoingTransactions.containsKey(activity);
    }

    private void startTracing(Activity activity) {
        if (this.performanceEnabled && !isRunningTransaction(activity)) {
            stopPreviousTransactions();
            ITransaction startTransaction = this.hub.startTransaction(getActivityName(activity), NotificationCompat.CATEGORY_NAVIGATION);
            this.hub.configureScope(new b(this, startTransaction));
            this.activitiesWithOngoingTransactions.put(activity, startTransaction);
        }
    }

    private void stopPreviousTransactions() {
        for (Map.Entry<Activity, ITransaction> value : this.activitiesWithOngoingTransactions.entrySet()) {
            finishTransaction((ITransaction) value.getValue());
        }
    }

    private void stopTracing(Activity activity, boolean z) {
        if (this.performanceEnabled && z) {
            finishTransaction(this.activitiesWithOngoingTransactions.get(activity));
        }
    }

    public /* synthetic */ void a(Scope scope, ITransaction iTransaction, ITransaction iTransaction2) {
        if (iTransaction2 == null) {
            scope.setTransaction(iTransaction);
            return;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", iTransaction.getName());
    }

    @VisibleForTesting
    public void applyScope(Scope scope, ITransaction iTransaction) {
        scope.withTransaction(new c(this, scope, iTransaction));
    }

    public void close() throws IOException {
        this.application.unregisterActivityLifecycleCallbacks(this);
        this.options.getLogger().log(SentryLevel.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
    }

    public WeakHashMap<Activity, ITransaction> getActivitiesWithOngoingTransactions() {
        return this.activitiesWithOngoingTransactions;
    }

    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        addBreadcrumb(activity, "created");
    }

    public synchronized void onActivityDestroyed(Activity activity) {
        addBreadcrumb(activity, "destroyed");
        stopTracing(activity, true);
        if (this.performanceEnabled) {
            this.activitiesWithOngoingTransactions.remove(activity);
        }
    }

    public synchronized void onActivityPaused(Activity activity) {
        addBreadcrumb(activity, "paused");
    }

    public synchronized void onActivityPostResumed(Activity activity) {
        stopTracing(activity, this.options.isEnableActivityLifecycleTracingAutoFinish());
    }

    public synchronized void onActivityPreCreated(Activity activity, Bundle bundle) {
        startTracing(activity);
    }

    public synchronized void onActivityResumed(Activity activity) {
        addBreadcrumb(activity, "resumed");
    }

    public synchronized void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        addBreadcrumb(activity, "saveInstanceState");
    }

    public synchronized void onActivityStarted(Activity activity) {
        addBreadcrumb(activity, SDKCoreEvent.Session.VALUE_STARTED);
    }

    public synchronized void onActivityStopped(Activity activity) {
        addBreadcrumb(activity, "stopped");
    }

    public void register(IHub iHub, SentryOptions sentryOptions) {
        this.options = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.hub = (IHub) Objects.requireNonNull(iHub, "Hub is required");
        ILogger logger = this.options.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.log(sentryLevel, "ActivityLifecycleIntegration enabled: %s", Boolean.valueOf(this.options.isEnableActivityLifecycleBreadcrumbs()));
        this.performanceEnabled = isPerformanceEnabled(this.options);
        if (this.options.isEnableActivityLifecycleBreadcrumbs() || this.performanceEnabled) {
            this.application.registerActivityLifecycleCallbacks(this);
            this.options.getLogger().log(sentryLevel, "ActivityLifecycleIntegration installed.", new Object[0]);
        }
    }
}
