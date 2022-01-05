package io.sentry.android.core;

import h0.q.c0;
import io.sentry.IHub;
import io.sentry.ILogger;
import io.sentry.Integration;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.util.MainThreadChecker;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.io.IOException;
import k0.c.w.a.g;

public final class AppLifecycleIntegration implements Integration, Closeable {
    private final IHandler handler;
    private SentryAndroidOptions options;
    public LifecycleWatcher watcher;

    public AppLifecycleIntegration() {
        this(new MainLooperHandler());
    }

    /* access modifiers changed from: private */
    /* renamed from: addObserver */
    public void a(IHub iHub) {
        LifecycleWatcher lifecycleWatcher = new LifecycleWatcher(iHub, this.options.getSessionTrackingIntervalMillis(), this.options.isEnableSessionTracking(), this.options.isEnableAppLifecycleBreadcrumbs());
        this.watcher = lifecycleWatcher;
        c0.c.Z1.a(lifecycleWatcher);
        this.options.getLogger().log(SentryLevel.DEBUG, "AppLifecycleIntegration installed.", new Object[0]);
    }

    public void close() throws IOException {
        LifecycleWatcher lifecycleWatcher = this.watcher;
        if (lifecycleWatcher != null) {
            c0.c.Z1.b(lifecycleWatcher);
            this.watcher = null;
            SentryAndroidOptions sentryAndroidOptions = this.options;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
            }
        }
    }

    public void register(IHub iHub, SentryOptions sentryOptions) {
        Objects.requireNonNull(iHub, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.options = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.log(sentryLevel, "enableSessionTracking enabled: %s", Boolean.valueOf(this.options.isEnableSessionTracking()));
        this.options.getLogger().log(sentryLevel, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.options.isEnableAppLifecycleBreadcrumbs()));
        if (this.options.isEnableSessionTracking() || this.options.isEnableAppLifecycleBreadcrumbs()) {
            try {
                Class.forName("h0.q.f");
                Class.forName("h0.q.c0");
                if (MainThreadChecker.isMainThread()) {
                    a(iHub);
                } else {
                    this.handler.post(new g(this, iHub));
                }
            } catch (ClassNotFoundException e) {
                sentryOptions.getLogger().log(SentryLevel.INFO, "androidx.lifecycle is not available, AppLifecycleIntegration won't be installed", (Throwable) e);
            } catch (IllegalStateException e2) {
                sentryOptions.getLogger().log(SentryLevel.ERROR, "AppLifecycleIntegration could not be installed", (Throwable) e2);
            }
        }
    }

    public AppLifecycleIntegration(IHandler iHandler) {
        this.handler = iHandler;
    }
}
