package io.sentry.android.core;

import io.sentry.IHub;
import io.sentry.ILogger;
import io.sentry.Integration;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.util.Objects;

public final class NdkIntegration implements Integration {
    public static final String SENTRY_NDK_CLASS_NAME = "io.sentry.android.ndk.SentryNdk";
    private final Class<?> sentryNdkClass;

    public NdkIntegration(Class<?> cls) {
        this.sentryNdkClass = cls;
    }

    public Class<?> getSentryNdkClass() {
        return this.sentryNdkClass;
    }

    public final void register(IHub iHub, SentryOptions sentryOptions) {
        Objects.requireNonNull(iHub, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        boolean isEnableNdk = sentryAndroidOptions.isEnableNdk();
        ILogger logger = sentryAndroidOptions.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.log(sentryLevel, "NdkIntegration enabled: %s", Boolean.valueOf(isEnableNdk));
        if (!isEnableNdk || this.sentryNdkClass == null) {
            sentryAndroidOptions.setEnableNdk(false);
            return;
        }
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        if (cacheDirPath == null || cacheDirPath.isEmpty()) {
            sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "No cache dir path is defined in options.", new Object[0]);
            sentryAndroidOptions.setEnableNdk(false);
            return;
        }
        try {
            this.sentryNdkClass.getMethod("init", new Class[]{SentryAndroidOptions.class}).invoke((Object) null, new Object[]{sentryAndroidOptions});
            sentryAndroidOptions.getLogger().log(sentryLevel, "NdkIntegration installed.", new Object[0]);
        } catch (NoSuchMethodException e) {
            sentryAndroidOptions.setEnableNdk(false);
            sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "Failed to invoke the SentryNdk.init method.", (Throwable) e);
        } catch (Throwable th) {
            sentryAndroidOptions.setEnableNdk(false);
            sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "Failed to initialize SentryNdk.", th);
        }
    }
}
