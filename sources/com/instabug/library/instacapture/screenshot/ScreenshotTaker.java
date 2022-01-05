package com.instabug.library.instacapture.screenshot;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.util.Pair;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.instabug.library.Instabug;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.BitmapUtils;
import com.instabug.library.util.DisplayUtils;
import com.instabug.library.util.InstabugSDKLogger;
import io.reactivex.internal.operators.observable.ObservableCreate;
import io.reactivex.plugins.RxJavaPlugins;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.opengles.GL10;
import k0.b.l;
import k0.b.m;
import k0.b.n;
import k0.b.o;
import k0.b.z.e.c.i;

public final class ScreenshotTaker {
    private static final String TAG = "ScreenshotTaker";

    public static class a implements k0.b.y.e<RootViewInfo, o<Bitmap>> {
        public final /* synthetic */ Bitmap c;
        public final /* synthetic */ int[] d;
        public final /* synthetic */ Activity q;

        public a(Bitmap bitmap, int[] iArr, Activity activity) {
            this.c = bitmap;
            this.d = iArr;
            this.q = activity;
        }

        public Object apply(Object obj) throws Exception {
            return ScreenshotTaker.drawRootToBitmap((RootViewInfo) obj, this.c, this.d, this.q);
        }
    }

    public static class b implements k0.b.y.e<HashMap<View, Integer>, Bitmap> {
        public final /* synthetic */ Bitmap c;

        public b(Bitmap bitmap) {
            this.c = bitmap;
        }

        public Object apply(Object obj) throws Exception {
            for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                ((View) entry.getKey()).setVisibility(((Integer) entry.getValue()).intValue());
            }
            return this.c;
        }
    }

    public static class c implements k0.b.y.e<Pair<Canvas, HashMap<View, Integer>>, HashMap<View, Integer>> {
        public final /* synthetic */ RootViewInfo c;
        public final /* synthetic */ Activity d;
        public final /* synthetic */ Bitmap q;

        public c(RootViewInfo rootViewInfo, Activity activity, Bitmap bitmap) {
            this.c = rootViewInfo;
            this.d = activity;
            this.q = bitmap;
        }

        public Object apply(Object obj) throws Exception {
            Pair pair = (Pair) obj;
            ArrayList unused = ScreenshotTaker.drawUnDrawableViews(this.c.getView(), (Canvas) pair.first);
            i0.j.c.l.a.g(this.d, this.q);
            BitmapUtils.maskBitmap(this.d, this.q, SettingsManager.getInstance(), (Canvas) pair.first);
            return (HashMap) pair.second;
        }
    }

    public static class d implements k0.b.y.e<Pair<Canvas, HashMap<View, Integer>>, Pair<Canvas, HashMap<View, Integer>>> {
        public final /* synthetic */ RootViewInfo c;

        public d(RootViewInfo rootViewInfo) {
            this.c = rootViewInfo;
        }

        public Object apply(Object obj) throws Exception {
            Pair pair = (Pair) obj;
            for (View visibility : ((HashMap) pair.second).keySet()) {
                visibility.setVisibility(4);
            }
            this.c.getView().draw((Canvas) pair.first);
            return pair;
        }
    }

    public static class e implements n<Pair<Canvas, HashMap<View, Integer>>> {
        public final /* synthetic */ RootViewInfo a;
        public final /* synthetic */ Bitmap b;
        public final /* synthetic */ int[] c;

        public e(RootViewInfo rootViewInfo, Bitmap bitmap, int[] iArr) {
            this.a = rootViewInfo;
            this.b = bitmap;
            this.c = iArr;
        }

        public void a(m<Pair<Canvas, HashMap<View, Integer>>> mVar) throws Exception {
            if ((this.a.getLayoutParams().flags & 2) == 2) {
                new Canvas(this.b).drawARGB((int) (this.a.getLayoutParams().dimAmount * 255.0f), 0, 0, 0);
            }
            Canvas canvas = new Canvas(this.b);
            canvas.translate((float) this.a.getLeft(), (float) this.a.getTop());
            HashMap hashMap = new HashMap();
            if (this.c != null) {
                for (int findViewById : this.c) {
                    View findViewById2 = this.a.getView().findViewById(findViewById);
                    if (findViewById2 != null) {
                        hashMap.put(findViewById2, Integer.valueOf(findViewById2.getVisibility()));
                    }
                }
            }
            ((ObservableCreate.CreateEmitter) mVar).b(new Pair(canvas, hashMap));
        }
    }

    public static class f implements Runnable {
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ IntBuffer q;
        public final /* synthetic */ CountDownLatch x;

        public f(int i, int i2, IntBuffer intBuffer, CountDownLatch countDownLatch) {
            this.c = i;
            this.d = i2;
            this.q = intBuffer;
            this.x = countDownLatch;
        }

        public void run() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            egl10.eglWaitGL();
            GL10 gl10 = (GL10) egl10.eglGetCurrentContext().getGL();
            gl10.glFinish();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            gl10.glReadPixels(0, 0, this.c, this.d + 0, 6408, 5121, this.q);
            this.x.countDown();
        }
    }

    private ScreenshotTaker() {
    }

    public static void drawGLSurfaceView(GLSurfaceView gLSurfaceView, int[] iArr, Canvas canvas) {
        InstabugSDKLogger.d(ScreenshotTaker.class, "Drawing GLSurfaceView");
        if (gLSurfaceView.getWindowToken() != null) {
            int width = gLSurfaceView.getWidth();
            int height = gLSurfaceView.getHeight();
            int[] iArr2 = new int[((height + 0) * width)];
            IntBuffer wrap = IntBuffer.wrap(iArr2);
            wrap.position(0);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            gLSurfaceView.queueEvent(new f(width, height, wrap, countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
            int[] iArr3 = new int[(width * height)];
            int i = 0;
            int i2 = 0;
            while (i < height) {
                for (int i3 = 0; i3 < width; i3++) {
                    int i4 = iArr2[(i * width) + i3];
                    iArr3[(((height - i2) - 1) * width) + i3] = (i4 & -16711936) | ((i4 << 16) & 16711680) | ((i4 >> 16) & 255);
                }
                i++;
                i2++;
            }
            Bitmap createBitmap = Bitmap.createBitmap(iArr3, width, height, Bitmap.Config.ARGB_8888);
            Paint paint = new Paint();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
            canvas.drawBitmap(createBitmap, (float) iArr[0], (float) iArr[1], paint);
            createBitmap.recycle();
        }
    }

    /* access modifiers changed from: private */
    public static l<Bitmap> drawRootToBitmap(RootViewInfo rootViewInfo, Bitmap bitmap, int[] iArr, Activity activity) {
        return RxJavaPlugins.onAssembly(new ObservableCreate(new e(rootViewInfo, bitmap, iArr))).p(new d(rootViewInfo)).p(new c(rootViewInfo, activity, bitmap)).p(new b(bitmap)).v(k0.b.v.a.a.a());
    }

    private static l<Bitmap> drawRootsToBitmap(List<RootViewInfo> list, Bitmap bitmap, int[] iArr, Activity activity) {
        if (list != null && list.size() > 1) {
            while (list.size() > 1) {
                list.remove(list.size() - 1);
            }
        }
        Objects.requireNonNull(list, "source is null");
        return RxJavaPlugins.onAssembly(new i(list)).j(new a(bitmap, iArr, activity));
    }

    @TargetApi(14)
    public static void drawTextureView(TextureView textureView, int[] iArr, Canvas canvas) {
        Class<ScreenshotTaker> cls = ScreenshotTaker.class;
        InstabugSDKLogger.d(cls, "Drawing TextureView");
        try {
            Bitmap bitmap = textureView.getBitmap();
            if (bitmap != null) {
                Paint paint = new Paint();
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
                canvas.drawBitmap(bitmap, (float) iArr[0], (float) iArr[1], paint);
                bitmap.recycle();
            }
        } catch (OutOfMemoryError e2) {
            InstabugSDKLogger.e(cls, cls.getSimpleName(), e2);
        }
    }

    /* access modifiers changed from: private */
    public static ArrayList<View> drawUnDrawableViews(View view, Canvas canvas) {
        if (!(view instanceof ViewGroup)) {
            ArrayList<View> arrayList = new ArrayList<>();
            arrayList.add(view);
            return arrayList;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(view);
            arrayList3.addAll(drawUnDrawableViews(childAt, canvas));
            int[] iArr = new int[2];
            childAt.getLocationOnScreen(iArr);
            if (childAt instanceof TextureView) {
                drawTextureView((TextureView) childAt, iArr, canvas);
            }
            if (childAt instanceof GLSurfaceView) {
                drawGLSurfaceView((GLSurfaceView) childAt, iArr, canvas);
            }
            if (childAt instanceof WebView) {
                drawWebView((WebView) childAt, canvas);
            }
            arrayList2.addAll(arrayList3);
        }
        return arrayList2;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    @TargetApi(11)
    public static void drawWebView(WebView webView, Canvas canvas) {
        int layerType = webView.getLayerType();
        if (layerType == 2) {
            webView.setLayerType(0, (Paint) null);
            webView.setDrawingCacheEnabled(true);
            webView.buildDrawingCache(true);
            Bitmap drawingCache = webView.getDrawingCache();
            if (drawingCache != null) {
                Paint paint = new Paint();
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
                int[] iArr = new int[2];
                webView.getLocationOnScreen(iArr);
                canvas.drawBitmap(drawingCache, (float) iArr[0], (float) iArr[1], paint);
                drawingCache.recycle();
            }
            webView.setDrawingCacheEnabled(false);
            webView.setLayerType(layerType, (Paint) null);
        }
    }

    public static l<Bitmap> getScreenshotBitmap(Activity activity, int[] iArr) {
        Bitmap bitmap;
        if (activity == null) {
            throw new IllegalArgumentException("Parameter activity cannot be null.");
        } else if (Build.VERSION.SDK_INT >= 26) {
            return RxJavaPlugins.onAssembly(new ObservableCreate(new i0.j.e.k0.a.b.d(activity))).s(k0.b.v.a.a.a()).p(new i0.j.e.k0.a.b.c(activity, iArr)).s(k0.b.v.a.a.a()).p(new i0.j.e.k0.a.b.b(activity));
        } else {
            View decorView = activity.getWindow().getDecorView();
            List<RootViewInfo> rootViews = FieldHelper.getRootViews(activity, iArr);
            StringBuilder P0 = i0.d.a.a.a.P0("viewRoots count: ");
            P0.append(rootViews.size());
            InstabugSDKLogger.d(ScreenshotTaker.class, P0.toString());
            try {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) activity.getSystemService("activity")).getMemoryInfo(memoryInfo);
                if (((long) (decorView.getWidth() * decorView.getHeight() * 4)) < memoryInfo.availMem) {
                    bitmap = Bitmap.createBitmap(decorView.getWidth(), decorView.getHeight(), Bitmap.Config.ARGB_8888);
                } else {
                    bitmap = Bitmap.createBitmap(decorView.getWidth(), decorView.getHeight(), Bitmap.Config.RGB_565);
                }
                return drawRootsToBitmap(rootViews, bitmap, iArr, activity);
            } catch (IllegalArgumentException | OutOfMemoryError e2) {
                InstabugSDKLogger.e(TAG, e2.getMessage() == null ? "error while capturing screenshot" : e2.getMessage(), e2);
                return null;
            }
        }
    }

    public static Rect getVisibleRect(View view) {
        Rect rect = new Rect();
        if (view == null || view.getVisibility() != 0 || view.getRootView().getParent() == null) {
            return new Rect(0, 0, 0, 0);
        }
        return !view.getGlobalVisibleRect(rect) ? new Rect(0, 0, 0, 0) : rect;
    }

    public static boolean isVisible(View view) {
        int i;
        int i2;
        if (view.getVisibility() != 0) {
            return false;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        Context applicationContext = Instabug.getApplicationContext();
        if (applicationContext == null) {
            i = 0;
        } else {
            i = DisplayUtils.getDisplayWidthInPx(applicationContext);
        }
        if (applicationContext == null) {
            i2 = 0;
        } else {
            i2 = DisplayUtils.getDisplayHeightInPx(applicationContext);
        }
        return rect.intersect(new Rect(0, 0, i, i2));
    }

    public static Rect getVisibleRect(View view, Rect rect) {
        Rect rect2 = new Rect();
        if (view == null || view.getVisibility() != 0 || view.getRootView().getParent() == null) {
            return new Rect(0, 0, 0, 0);
        }
        return !view.getGlobalVisibleRect(rect2) ? new Rect(0, 0, 0, 0) : rect2;
    }
}
