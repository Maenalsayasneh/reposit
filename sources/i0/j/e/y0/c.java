package i0.j.e.y0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.instabug.library.screenshot.ScreenshotProvider;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.BitmapUtils;
import com.instabug.library.util.InstabugSDKLogger;

/* compiled from: ScreenshotManager */
public class c implements Runnable {
    public final /* synthetic */ ScreenshotProvider.ScreenshotCapturingListener c;
    public final /* synthetic */ d d;

    /* compiled from: ScreenshotManager */
    public class a implements ScreenshotProvider.ScreenshotCapturingListener {
        public a() {
        }

        public void onScreenshotCapturedSuccessfully(Bitmap bitmap) {
            BitmapUtils.maskBitmap(InstabugInternalTrackingDelegate.getInstance().getCurrentActivity(), bitmap, SettingsManager.getInstance(), (Canvas) null);
            ScreenshotProvider.ScreenshotCapturingListener screenshotCapturingListener = c.this.c;
            if (screenshotCapturingListener != null) {
                screenshotCapturingListener.onScreenshotCapturedSuccessfully(bitmap);
            }
        }

        public void onScreenshotCapturingFailed(Throwable th) {
            StringBuilder P0 = i0.d.a.a.a.P0("initial screenshot capturing got error: ");
            P0.append(th.getMessage());
            P0.append(", time in MS: ");
            P0.append(System.currentTimeMillis());
            InstabugSDKLogger.e("ScreenshotManager", P0.toString(), th);
            ScreenshotProvider.ScreenshotCapturingListener screenshotCapturingListener = c.this.c;
            if (screenshotCapturingListener != null) {
                screenshotCapturingListener.onScreenshotCapturingFailed(th);
                SettingsManager.getInstance().setProcessingForeground(false);
            }
        }
    }

    public c(d dVar, ScreenshotProvider.ScreenshotCapturingListener screenshotCapturingListener) {
        this.d = dVar;
        this.c = screenshotCapturingListener;
    }

    public void run() {
        this.d.c(new a());
    }
}
