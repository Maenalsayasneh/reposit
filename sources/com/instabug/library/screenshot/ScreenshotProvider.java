package com.instabug.library.screenshot;

import android.app.Activity;
import android.graphics.Bitmap;
import android.widget.Toast;
import com.instabug.library.Instabug;
import com.instabug.library.R;
import com.instabug.library.core.InitialScreenshotHelper;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.LocaleUtils;
import com.instabug.library.util.memory.MemoryUtils;
import i0.j.e.p0.d;
import i0.j.e.p0.e.b;

public class ScreenshotProvider {

    public interface ScreenshotCapturingListener {
        void onScreenshotCapturedSuccessfully(Bitmap bitmap);

        void onScreenshotCapturingFailed(Throwable th);
    }

    public static class a extends b {
        public final /* synthetic */ ScreenshotCapturingListener a;

        public a(ScreenshotCapturingListener screenshotCapturingListener) {
            this.a = screenshotCapturingListener;
        }

        public void b(Throwable th) {
            this.a.onScreenshotCapturingFailed(th);
        }

        public void m(Bitmap bitmap) {
            this.a.onScreenshotCapturedSuccessfully(bitmap);
        }
    }

    public static synchronized void a(Activity activity, ScreenshotCapturingListener screenshotCapturingListener) {
        synchronized (ScreenshotProvider.class) {
            if (activity != null) {
                try {
                    if (!activity.isFinishing()) {
                        if (MemoryUtils.isLowMemory(activity)) {
                            InstabugSDKLogger.e(InitialScreenshotHelper.class, "Couldn't take initial screenshot due to low memory");
                            screenshotCapturingListener.onScreenshotCapturingFailed(new Throwable("Your activity is currently in low memory"));
                            Toast.makeText(activity, LocaleUtils.getLocaleStringResource(Instabug.getLocale(activity), R.string.instabug_str_capturing_screenshot_error, activity), 0).show();
                            return;
                        }
                        InstabugSDKLogger.d("ScreemshotProvider", "start capture screenshot");
                        d.b(activity).d(new a(screenshotCapturingListener), R.id.instabug_decor_view, R.id.instabug_extra_screenshot_button, R.id.instabug_floating_button, R.id.instabug_in_app_notification, R.id.instabug_intro_dialog);
                    }
                } catch (Exception | OutOfMemoryError e) {
                    screenshotCapturingListener.onScreenshotCapturingFailed(e);
                } catch (Throwable th) {
                    throw th;
                }
            }
            screenshotCapturingListener.onScreenshotCapturingFailed(new Exception("Can't capture screenshot due to null activity"));
        }
    }
}
