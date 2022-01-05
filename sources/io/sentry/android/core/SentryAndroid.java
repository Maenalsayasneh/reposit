package io.sentry.android.core;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.OptionsContainer;
import io.sentry.Sentry;
import io.sentry.SentryLevel;
import java.lang.reflect.InvocationTargetException;
import k0.c.w.a.i;
import k0.c.w.a.j;

public final class SentryAndroid {
    private SentryAndroid() {
    }

    public static void init(Context context) {
        init(context, (ILogger) new AndroidLogger());
    }

    public static void init(Context context, ILogger iLogger) {
        init(context, iLogger, i.a);
    }

    public static void init(Context context, Sentry.OptionsConfiguration<SentryAndroidOptions> optionsConfiguration) {
        init(context, new AndroidLogger(), optionsConfiguration);
    }

    public static void init(Context context, ILogger iLogger, Sentry.OptionsConfiguration<SentryAndroidOptions> optionsConfiguration) {
        try {
            Sentry.init(OptionsContainer.create(SentryAndroidOptions.class), new j(context, iLogger, optionsConfiguration), true);
        } catch (IllegalAccessException e) {
            iLogger.log(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", (Throwable) e);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e);
        } catch (InstantiationException e2) {
            iLogger.log(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", (Throwable) e2);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e2);
        } catch (NoSuchMethodException e3) {
            iLogger.log(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", (Throwable) e3);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e3);
        } catch (InvocationTargetException e4) {
            iLogger.log(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", (Throwable) e4);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e4);
        }
    }
}
