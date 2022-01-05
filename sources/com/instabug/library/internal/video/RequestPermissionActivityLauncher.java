package com.instabug.library.internal.video;

import android.app.Activity;
import android.content.Intent;
import com.instabug.library.screenshot.ScreenshotProvider;

public class RequestPermissionActivityLauncher {
    public static void start(Activity activity, boolean z, boolean z2, ScreenshotProvider.ScreenshotCapturingListener screenshotCapturingListener) {
        Intent intent = new Intent(activity, RequestPermissionActivity.class);
        intent.putExtra(RequestPermissionActivity.KEY_IS_VIDEO, z);
        intent.putExtra(RequestPermissionActivity.KEY_IS_INITIAL, z2);
        activity.overridePendingTransition(0, 0);
        activity.startActivityForResult(intent, RequestPermissionActivity.REQUEST_MEDIA_PROJECTION_PERMISSION);
        RequestPermissionActivity.screenshotCapturingListener = screenshotCapturingListener;
    }
}
