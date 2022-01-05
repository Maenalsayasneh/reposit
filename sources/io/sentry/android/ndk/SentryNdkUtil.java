package io.sentry.android.ndk;

import io.sentry.protocol.SdkVersion;

public final class SentryNdkUtil {
    private SentryNdkUtil() {
    }

    public static void addPackage(SdkVersion sdkVersion) {
        if (sdkVersion != null) {
            sdkVersion.addPackage("maven:io.sentry:sentry-android-ndk", "4.3.0");
        }
    }
}
