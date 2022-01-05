package com.instabug.library.core;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.Toast;
import com.instabug.library.Instabug;
import com.instabug.library.R;
import com.instabug.library.core.eventbus.AutoScreenRecordingEventBus;
import com.instabug.library.internal.video.RequestPermissionActivityLauncher;
import com.instabug.library.internal.video.ScreenRecordingService;
import com.instabug.library.screenshot.ScreenshotProvider;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.BitmapUtils;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.LocaleUtils;
import com.instabug.library.util.memory.MemoryUtils;

public class InitialScreenshotHelper {
    /* access modifiers changed from: private */
    public static Uri screenshotUri;

    public interface InitialScreenshotCapturingListener {
        void onScreenshotCapturedSuccessfully(Uri uri);

        void onScreenshotCapturingFailed(Throwable th);
    }

    public static class a implements ScreenshotProvider.ScreenshotCapturingListener {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ InitialScreenshotCapturingListener b;

        public a(Activity activity, InitialScreenshotCapturingListener initialScreenshotCapturingListener) {
            this.a = activity;
            this.b = initialScreenshotCapturingListener;
        }

        public void onScreenshotCapturedSuccessfully(Bitmap bitmap) {
            InitialScreenshotHelper.saveBitmap(bitmap, this.a, this.b);
        }

        public void onScreenshotCapturingFailed(Throwable th) {
            StringBuilder P0 = i0.d.a.a.a.P0("initial screenshot capturing got error: ");
            P0.append(th.getMessage());
            P0.append(", time in MS: ");
            P0.append(System.currentTimeMillis());
            InstabugSDKLogger.e(this, P0.toString(), th);
            this.b.onScreenshotCapturingFailed(th);
        }
    }

    public static class b implements ScreenshotProvider.ScreenshotCapturingListener {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ InitialScreenshotCapturingListener b;

        public b(Activity activity, InitialScreenshotCapturingListener initialScreenshotCapturingListener) {
            this.a = activity;
            this.b = initialScreenshotCapturingListener;
        }

        public void onScreenshotCapturedSuccessfully(Bitmap bitmap) {
            InitialScreenshotHelper.saveBitmap(bitmap, this.a, this.b);
        }

        public void onScreenshotCapturingFailed(Throwable th) {
            StringBuilder P0 = i0.d.a.a.a.P0("initial screenshot capturing got error: ");
            P0.append(th.getMessage());
            P0.append(", time in MS: ");
            P0.append(System.currentTimeMillis());
            InstabugSDKLogger.e(this, P0.toString(), th);
            this.b.onScreenshotCapturingFailed(th);
        }
    }

    public static class c implements BitmapUtils.OnSaveBitmapCallback {
        public final /* synthetic */ InitialScreenshotCapturingListener a;

        public c(InitialScreenshotCapturingListener initialScreenshotCapturingListener) {
            this.a = initialScreenshotCapturingListener;
        }

        public void onError(Throwable th) {
            StringBuilder P0 = i0.d.a.a.a.P0("initial screenshot capturing got error: ");
            P0.append(th.getMessage());
            P0.append(", time in MS: ");
            P0.append(System.currentTimeMillis());
            InstabugSDKLogger.e(this, P0.toString(), th);
            this.a.onScreenshotCapturingFailed(th);
        }

        public void onSuccess(Uri uri) {
            Uri unused = InitialScreenshotHelper.screenshotUri = uri;
            this.a.onScreenshotCapturedSuccessfully(uri);
        }
    }

    public static void captureScreenshot(InitialScreenshotCapturingListener initialScreenshotCapturingListener) {
        Activity targetActivity = InstabugInternalTrackingDelegate.getInstance().getTargetActivity();
        if (targetActivity != null) {
            if (MemoryUtils.isLowMemory(targetActivity)) {
                InstabugSDKLogger.e(InitialScreenshotHelper.class, "Couldn't take initial screenshot due to low memory");
                initialScreenshotCapturingListener.onScreenshotCapturingFailed(new Throwable("Your activity is currently in low memory"));
                Toast.makeText(targetActivity, LocaleUtils.getLocaleStringResource(Instabug.getLocale(targetActivity), R.string.instabug_str_capturing_screenshot_error, targetActivity), 0).show();
            } else if (isUsingMediaProjection()) {
                a aVar = new a(targetActivity, initialScreenshotCapturingListener);
                synchronized (ScreenshotProvider.class) {
                    InstabugSDKLogger.d("ScreemshotProvider", "start capture screenshot Using MediaProjection");
                    if (!targetActivity.isFinishing()) {
                        if (SettingsManager.getInstance().isScreenCurrentlyRecorded()) {
                            AutoScreenRecordingEventBus.getInstance().post(ScreenRecordingService.Action.STOP_TRIM_KEEP);
                        }
                        RequestPermissionActivityLauncher.start(targetActivity, false, true, aVar);
                    }
                }
            } else {
                ScreenshotProvider.a(targetActivity, new b(targetActivity, initialScreenshotCapturingListener));
            }
        }
    }

    private static boolean isUsingMediaProjection() {
        return SettingsManager.getInstance().isScreenshotByMediaProjectionEnabled();
    }

    /* access modifiers changed from: private */
    public static void saveBitmap(Bitmap bitmap, Activity activity, InitialScreenshotCapturingListener initialScreenshotCapturingListener) {
        BitmapUtils.saveBitmap(bitmap, activity, new c(initialScreenshotCapturingListener));
    }
}
