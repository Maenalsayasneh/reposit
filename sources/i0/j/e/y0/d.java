package i0.j.e.y0;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Handler;
import com.instabug.library.core.eventbus.ScreenCaptureEventBus;
import com.instabug.library.screenshot.ScreenshotCaptureService;
import com.instabug.library.screenshot.ScreenshotProvider;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import i0.j.e.t0.e;

@TargetApi(21)
/* compiled from: ScreenshotManager */
public class d implements k0.b.y.d<e> {
    public static final d c = new d();
    public ScreenshotProvider.ScreenshotCapturingListener d;
    public Intent q;

    public d() {
        ScreenCaptureEventBus.getInstance().subscribe(this);
    }

    public void a(int i, Intent intent, boolean z, ScreenshotProvider.ScreenshotCapturingListener screenshotCapturingListener) {
        if (i != -1 || intent == null) {
            this.q = null;
        } else {
            this.q = intent;
        }
        if (z && screenshotCapturingListener != null) {
            new Handler().postDelayed(new c(this, screenshotCapturingListener), 500);
        }
    }

    public void b(Object obj) throws Exception {
        Throwable th;
        e eVar = (e) obj;
        ScreenshotProvider.ScreenshotCapturingListener screenshotCapturingListener = this.d;
        if (screenshotCapturingListener != null) {
            int i = eVar.a;
            if (i == 0) {
                Bitmap bitmap = eVar.b;
                if (bitmap != null) {
                    screenshotCapturingListener.onScreenshotCapturedSuccessfully(bitmap);
                }
            } else if (i == 1 && (th = eVar.c) != null) {
                screenshotCapturingListener.onScreenshotCapturingFailed(th);
            }
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void c(ScreenshotProvider.ScreenshotCapturingListener screenshotCapturingListener) {
        this.d = screenshotCapturingListener;
        Activity currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
        if (currentActivity != null) {
            Intent intent = this.q;
            int i = ScreenshotCaptureService.c;
            Intent intent2 = new Intent(currentActivity, ScreenshotCaptureService.class);
            intent2.putExtra("instabug.intent.extra.MEDIA_PROJ_INTENT", intent);
            currentActivity.startService(intent2);
        }
    }
}
