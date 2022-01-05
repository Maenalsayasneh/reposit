package com.instabug.library.screenshot;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.util.DisplayMetrics;
import com.instabug.library.R;
import com.instabug.library.core.eventbus.ScreenCaptureEventBus;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import i0.j.e.t0.e;
import java.util.Random;
import k0.b.y.d;

@SuppressFBWarnings(justification = "The service onStartCommand() can be called many times while onCreate() is called once", value = {"DMI_RANDOM_USED_ONLY_ONCE"})
public class ScreenshotCaptureService extends Service {
    public static final int c = new Random().nextInt();
    public MediaProjection d;

    public class a implements d<e> {
        public a() {
        }

        public void b(Object obj) throws Exception {
            e eVar = (e) obj;
            ScreenshotCaptureService.this.stopForeground(true);
        }
    }

    public class b implements ImageReader.OnImageAvailableListener {
        public final /* synthetic */ ImageReader a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public b(ImageReader imageReader, int i, int i2) {
            this.a = imageReader;
            this.b = i;
            this.c = i2;
        }

        @SuppressLint({"NULL_DEREFERENCE"})
        public void onImageAvailable(ImageReader imageReader) {
            this.a.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
            ScreenshotCaptureService.this.d.stop();
            PoolProvider.postBitmapTask(new i0.j.e.y0.b(this.b, this.c, imageReader));
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        ScreenCaptureEventBus.getInstance().subscribe(new a());
    }

    @SuppressLint({"NULL_DEREFERENCE"})
    public int onStartCommand(Intent intent, int i, int i2) {
        Intent intent2 = intent;
        if (intent2 != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                i0.j.e.c1.b.h(this, R.string.ibg_screen_recording_notification_title, c);
            }
            Intent intent3 = (Intent) intent2.getParcelableExtra("instabug.intent.extra.MEDIA_PROJ_INTENT");
            if (intent3 == null) {
                stopForeground(true);
                InstabugSDKLogger.e("ScreenshotCaptureService", "Passed Media projection intent is null");
            }
            MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) getSystemService("media_projection");
            MediaProjection mediaProjection = this.d;
            if (mediaProjection != null) {
                mediaProjection.stop();
                this.d = null;
            }
            MediaProjection mediaProjection2 = mediaProjectionManager.getMediaProjection(-1, intent3);
            this.d = mediaProjection2;
            if (mediaProjection2 == null) {
                stopForeground(true);
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Activity currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
            if (currentActivity != null) {
                currentActivity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
                int i3 = displayMetrics.densityDpi;
                int i4 = displayMetrics.widthPixels;
                int i5 = displayMetrics.heightPixels;
                ImageReader newInstance = ImageReader.newInstance(i4, i5, 1, 1);
                VirtualDisplay createVirtualDisplay = this.d.createVirtualDisplay("screencap", i4, i5, i3, 9, newInstance.getSurface(), (VirtualDisplay.Callback) null, (Handler) null);
                newInstance.setOnImageAvailableListener(new b(newInstance, i4, i5), (Handler) null);
                MediaProjection mediaProjection3 = this.d;
                mediaProjection3.unregisterCallback(new i0.j.e.y0.a(createVirtualDisplay, newInstance, mediaProjection3));
            } else {
                stopForeground(true);
                InstabugSDKLogger.e("ScreenshotCaptureService", "Current activity is null");
            }
        } else {
            InstabugSDKLogger.e("ScreenshotCaptureService", "Firing Intent is null");
            stopForeground(true);
        }
        return super.onStartCommand(intent, i, i2);
    }
}
