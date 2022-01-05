package io.sentry.android.core;

import android.os.Build;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public final class BuildInfoProvider implements IBuildInfoProvider {
    public String getBuildTags() {
        return Build.TAGS;
    }

    public int getSdkInfoVersion() {
        return Build.VERSION.SDK_INT;
    }
}
