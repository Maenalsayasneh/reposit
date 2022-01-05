package io.sentry.android.ndk;

import io.sentry.android.core.SentryAndroidOptions;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public final class SentryNdk {
    static {
        System.loadLibrary("log");
        System.loadLibrary("sentry");
        System.loadLibrary("sentry-android");
    }

    private SentryNdk() {
    }

    public static void init(SentryAndroidOptions sentryAndroidOptions) {
        SentryNdkUtil.addPackage(sentryAndroidOptions.getSdkVersion());
        initSentryNative(sentryAndroidOptions);
        sentryAndroidOptions.addScopeObserver(new NdkScopeObserver(sentryAndroidOptions));
        sentryAndroidOptions.setDebugImagesLoader(new DebugImagesLoader(sentryAndroidOptions, new NativeModuleListLoader()));
    }

    private static native void initSentryNative(SentryAndroidOptions sentryAndroidOptions);
}
