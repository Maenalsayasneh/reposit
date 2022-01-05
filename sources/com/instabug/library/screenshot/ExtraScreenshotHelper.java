package com.instabug.library.screenshot;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.instabug.library.PresentationManager;
import com.instabug.library.R;
import com.instabug.library.core.eventbus.CurrentActivityLifeCycleEventBus;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.screenshot.ScreenshotProvider;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.tracking.ActivityLifeCycleEvent;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.BitmapUtils;
import com.instabug.library.util.Colorizer;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.ScreenUtility;
import com.instabug.library.view.ViewUtils;
import h0.i.i.q;
import java.util.concurrent.atomic.AtomicInteger;

public class ExtraScreenshotHelper {
    public static final String TAG = "ExtraScreenshotHelper";
    private ImageButton captureButton;
    private k0.b.w.a currentActivityLifeCycleDisposable;
    private boolean isCaptureButtonShown = false;
    /* access modifiers changed from: private */
    public OnCaptureListener onCaptureListener;

    public interface OnCaptureListener {
        void onExtraScreenshotCaptured(Uri uri);

        void onExtraScreenshotError(Throwable th);
    }

    public class a implements View.OnClickListener {
        public final /* synthetic */ Activity c;

        public a(Activity activity) {
            this.c = activity;
        }

        public void onClick(View view) {
            ExtraScreenshotHelper.this.hide();
            ExtraScreenshotHelper extraScreenshotHelper = ExtraScreenshotHelper.this;
            extraScreenshotHelper.captureExtraScreenshot(this.c, extraScreenshotHelper.onCaptureListener);
        }
    }

    public class b implements ScreenshotProvider.ScreenshotCapturingListener {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ OnCaptureListener b;

        public class a implements BitmapUtils.OnSaveBitmapCallback {
            public a() {
            }

            public void onError(Throwable th) {
                InstabugSDKLogger.e(ExtraScreenshotHelper.class, th.getMessage(), th);
            }

            public void onSuccess(Uri uri) {
                OnCaptureListener onCaptureListener = b.this.b;
                if (onCaptureListener != null) {
                    onCaptureListener.onExtraScreenshotCaptured(uri);
                }
            }
        }

        public b(Activity activity, OnCaptureListener onCaptureListener) {
            this.a = activity;
            this.b = onCaptureListener;
        }

        public void onScreenshotCapturedSuccessfully(Bitmap bitmap) {
            Activity currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
            if (currentActivity != null) {
                BitmapUtils.maskBitmap(currentActivity, bitmap, SettingsManager.getInstance(), (Canvas) null);
                BitmapUtils.saveBitmap(bitmap, this.a, new a());
            }
        }

        public void onScreenshotCapturingFailed(Throwable th) {
            OnCaptureListener onCaptureListener = this.b;
            if (onCaptureListener != null) {
                onCaptureListener.onExtraScreenshotError(th);
            }
            ExtraScreenshotHelper.this.reset();
            InstabugSDKLogger.e(ExtraScreenshotHelper.TAG, th.getMessage(), th);
        }
    }

    public class c implements ScreenshotProvider.ScreenshotCapturingListener {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ OnCaptureListener b;

        public class a implements BitmapUtils.OnSaveBitmapCallback {
            public a() {
            }

            public void onError(Throwable th) {
                InstabugSDKLogger.e(ExtraScreenshotHelper.TAG, th.getMessage(), th);
            }

            public void onSuccess(Uri uri) {
                OnCaptureListener onCaptureListener = c.this.b;
                if (onCaptureListener != null) {
                    onCaptureListener.onExtraScreenshotCaptured(uri);
                }
            }
        }

        public c(Activity activity, OnCaptureListener onCaptureListener) {
            this.a = activity;
            this.b = onCaptureListener;
        }

        public void onScreenshotCapturedSuccessfully(Bitmap bitmap) {
            BitmapUtils.saveBitmap(bitmap, this.a, new a());
        }

        public void onScreenshotCapturingFailed(Throwable th) {
            InstabugSDKLogger.e(ExtraScreenshotHelper.TAG, th.getMessage(), th);
        }
    }

    public class d implements k0.b.y.d<ActivityLifeCycleEvent> {
        public d() {
        }

        public void b(Object obj) throws Exception {
            int i = e.a[((ActivityLifeCycleEvent) obj).ordinal()];
            if (i == 1) {
                ExtraScreenshotHelper.this.handleCurrentActivityResumeEvent();
            } else if (i == 2) {
                ExtraScreenshotHelper.this.handleCurrentActivityPauseEvent();
            }
        }
    }

    public static /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0011 */
        static {
            /*
                com.instabug.library.tracking.ActivityLifeCycleEvent.values()
                r0 = 6
                int[] r0 = new int[r0]
                a = r0
                com.instabug.library.tracking.ActivityLifeCycleEvent r1 = com.instabug.library.tracking.ActivityLifeCycleEvent.RESUMED     // Catch:{ NoSuchFieldError -> 0x0011 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0011 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001c }
                com.instabug.library.tracking.ActivityLifeCycleEvent r1 = com.instabug.library.tracking.ActivityLifeCycleEvent.PAUSED     // Catch:{ NoSuchFieldError -> 0x001c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001c }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.screenshot.ExtraScreenshotHelper.e.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void captureExtraScreenshot(Activity activity, OnCaptureListener onCaptureListener2) {
        if (isUsingMediaProjection()) {
            i0.j.e.y0.d.c.c(new b(activity, onCaptureListener2));
        } else {
            ScreenshotProvider.a(activity, new c(activity, onCaptureListener2));
        }
    }

    private ImageButton createCaptureButton(Activity activity) {
        ImageButton imageButton = new ImageButton(activity);
        imageButton.setId(R.id.instabug_extra_screenshot_button);
        imageButton.setScaleType(ImageView.ScaleType.CENTER);
        Drawable drawable = h0.i.b.a.getDrawable(activity, R.drawable.ibg_core_bg_white_oval);
        Drawable a2 = h0.b.b.a.a.a(activity, R.drawable.ibg_core_ic_screenshot);
        if (drawable != null) {
            imageButton.setBackgroundDrawable(Colorizer.getPrimaryColorTintedDrawable(drawable));
        }
        if (a2 != null) {
            imageButton.setImageDrawable(a2);
        }
        return imageButton;
    }

    private FrameLayout.LayoutParams createCaptureButtonContainer(Activity activity) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 81);
        layoutParams.setMargins(0, 0, 0, 20);
        Resources resources = activity.getResources();
        if (ScreenUtility.hasNavBar(activity) && !ScreenUtility.isLandscape(activity)) {
            layoutParams.bottomMargin = ScreenUtility.getNavigationBarHeight(resources) + layoutParams.bottomMargin;
        }
        return layoutParams;
    }

    /* access modifiers changed from: private */
    public void handleCurrentActivityPauseEvent() {
        hide();
    }

    /* access modifiers changed from: private */
    public void handleCurrentActivityResumeEvent() {
        Activity currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
        if (currentActivity != null) {
            show(currentActivity);
        } else {
            InstabugSDKLogger.v(TAG, "current activity equal null");
        }
    }

    /* access modifiers changed from: private */
    public void hide() {
        ImageButton imageButton;
        if (this.isCaptureButtonShown && (imageButton = this.captureButton) != null && imageButton.getParent() != null && (this.captureButton.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.captureButton.getParent()).removeView(this.captureButton);
            this.isCaptureButtonShown = false;
        }
    }

    private boolean isUsingMediaProjection() {
        return SettingsManager.getInstance().isScreenshotByMediaProjectionEnabled();
    }

    /* access modifiers changed from: private */
    public void reset() {
        hide();
        Activity currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
        if (currentActivity != null) {
            show(currentActivity);
        }
    }

    private void show(Activity activity) {
        if (!this.isCaptureButtonShown && !SettingsManager.getInstance().isProcessingForeground()) {
            ImageButton createCaptureButton = createCaptureButton(activity);
            this.captureButton = createCaptureButton;
            AtomicInteger atomicInteger = q.a;
            createCaptureButton.setElevation((float) ViewUtils.convertDpToPx(activity.getApplicationContext(), 5.0f));
            ((ViewGroup) activity.getWindow().getDecorView()).addView(this.captureButton, createCaptureButtonContainer(activity));
            this.isCaptureButtonShown = true;
            ImageButton imageButton = this.captureButton;
            if (imageButton != null) {
                imageButton.setOnClickListener(new a(activity));
            }
        }
    }

    private void subscribeToCurranActivityLifeCycle() {
        if (this.currentActivityLifeCycleDisposable == null) {
            this.currentActivityLifeCycleDisposable = CurrentActivityLifeCycleEventBus.getInstance().subscribe(new d());
        }
    }

    public void cancel() {
        hide();
        release();
    }

    @SuppressLint({"NULL_DEREFERENCE"})
    public void init(OnCaptureListener onCaptureListener2) {
        this.onCaptureListener = onCaptureListener2;
        subscribeToCurranActivityLifeCycle();
        InvocationManager.getInstance().switchOffInvocation();
        PresentationManager.getInstance().setInInstabugContext(true);
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void release() {
        ImageButton imageButton = this.captureButton;
        if (imageButton != null) {
            imageButton.setOnClickListener((View.OnClickListener) null);
        }
        this.captureButton = null;
        this.onCaptureListener = null;
        k0.b.w.a aVar = this.currentActivityLifeCycleDisposable;
        if (aVar != null && !aVar.isDisposed()) {
            this.currentActivityLifeCycleDisposable.dispose();
        }
        this.currentActivityLifeCycleDisposable = null;
        PresentationManager.getInstance().setInInstabugContext(false);
        InvocationManager.getInstance().switchOnInvocation();
    }
}
