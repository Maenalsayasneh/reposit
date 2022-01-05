package com.instabug.library.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.instabug.library.Instabug;
import com.instabug.library.instacapture.screenshot.FieldHelper;
import com.instabug.library.instacapture.screenshot.RootViewInfo;
import com.instabug.library.instacapture.screenshot.ScreenshotTaker;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.internal.storage.DiskUtils;
import com.instabug.library.internal.storage.cache.AssetsCacheManager;
import com.instabug.library.model.AssetEntity;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.BitmapWorkerTask;
import com.instabug.library.util.memory.Action;
import com.instabug.library.util.memory.MemoryGuard;
import com.instabug.library.util.memory.predicate.MemoryNotLowPredicate;
import com.instabug.library.util.threading.PoolProvider;
import com.instabug.library.util.threading.ThreadUtils;
import com.instabug.library.visualusersteps.VisualUserStepsHelper;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;

public class BitmapUtils {
    private static final String ICON_FILE_PREFIX = "icon";
    public static final String TAG = "BitmapUtils";

    @Keep
    public interface OnBitmapReady {
        void onBitmapFailedToLoad();

        void onBitmapReady(Bitmap bitmap);
    }

    public interface OnSaveBitmapCallback {
        void onError(Throwable th);

        void onSuccess(Uri uri);
    }

    public static class a implements Action {
        public final /* synthetic */ File a;

        public a(File file) {
            this.a = file;
        }

        public void onAffirmed() throws Throwable {
            BitmapUtils.compressBitmapAndSave(this.a);
        }

        public void onDenied() throws Throwable {
            InstabugSDKLogger.e(BitmapUtils.TAG, "Not enough memory for compressing image");
        }
    }

    public static class b implements Runnable {
        public final /* synthetic */ File c;
        public final /* synthetic */ String d;
        public final /* synthetic */ Bitmap q;
        public final /* synthetic */ int x;
        public final /* synthetic */ OnSaveBitmapCallback y;

        public b(File file, String str, Bitmap bitmap, int i, OnSaveBitmapCallback onSaveBitmapCallback) {
            this.c = file;
            this.d = str;
            this.q = bitmap;
            this.x = i;
            this.y = onSaveBitmapCallback;
        }

        public void run() {
            File file = this.c;
            File file2 = new File(file, this.d + "_" + System.currentTimeMillis() + ".png");
            StringBuilder P0 = i0.d.a.a.a.P0("image path: ");
            P0.append(file2.toString());
            InstabugSDKLogger.v(AttachmentsUtility.class, P0.toString());
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                boolean access$100 = BitmapUtils.compressQuietly(this.q, Bitmap.CompressFormat.PNG, this.x, bufferedOutputStream);
                bufferedOutputStream.close();
                Uri fromFile = Uri.fromFile(file2);
                if (!access$100 || fromFile == null) {
                    this.y.onError(new Throwable("Uri equal null"));
                } else {
                    this.y.onSuccess(fromFile);
                }
            } catch (IOException e) {
                this.y.onError(e);
            }
        }
    }

    public static class c implements Runnable {
        public final /* synthetic */ Context c;
        public final /* synthetic */ Bitmap d;
        public final /* synthetic */ OnSaveBitmapCallback q;

        public class a implements Runnable {
            public final /* synthetic */ boolean c;
            public final /* synthetic */ Uri d;

            public a(boolean z, Uri uri) {
                this.c = z;
                this.d = uri;
            }

            public void run() {
                Uri uri;
                if (!this.c || (uri = this.d) == null) {
                    c.this.q.onError(new Throwable("Uri equal null"));
                } else {
                    c.this.q.onSuccess(uri);
                }
            }
        }

        public c(Context context, Bitmap bitmap, OnSaveBitmapCallback onSaveBitmapCallback) {
            this.c = context;
            this.d = bitmap;
            this.q = onSaveBitmapCallback;
        }

        public void run() {
            File instabugDirectory = DiskUtils.getInstabugDirectory(this.c);
            StringBuilder P0 = i0.d.a.a.a.P0("bug_");
            P0.append(System.currentTimeMillis());
            P0.append("_.jpg");
            File file = new File(instabugDirectory, P0.toString());
            StringBuilder P02 = i0.d.a.a.a.P0("image path: ");
            P02.append(file.toString());
            InstabugSDKLogger.v(AttachmentsUtility.class, P02.toString());
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                boolean access$100 = BitmapUtils.compressQuietly(this.d, Bitmap.CompressFormat.JPEG, 100, bufferedOutputStream);
                bufferedOutputStream.close();
                new Handler(Looper.getMainLooper()).post(new a(access$100, Uri.fromFile(file)));
            } catch (IOException e) {
                this.q.onError(e);
            }
        }
    }

    public static class d implements Runnable {
        public final /* synthetic */ long c;
        public final /* synthetic */ Drawable d;
        public final /* synthetic */ OnSaveBitmapCallback q;

        public class a implements OnBitmapReady {
            public final /* synthetic */ File a;

            public a(File file) {
                this.a = file;
            }

            public void onBitmapFailedToLoad() {
            }

            /* JADX WARNING: Removed duplicated region for block: B:20:0x002f A[SYNTHETIC, Splitter:B:20:0x002f] */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x003e A[ADDED_TO_REGION] */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x0059 A[SYNTHETIC, Splitter:B:30:0x0059] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onBitmapReady(android.graphics.Bitmap r8) {
                /*
                    r7 = this;
                    java.lang.String r0 = "can't close BufferedOutputStream"
                    java.lang.String r1 = "BitmapUtils"
                    if (r8 != 0) goto L_0x0007
                    return
                L_0x0007:
                    r2 = 0
                    r3 = 0
                    java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0028 }
                    java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0028 }
                    java.io.File r6 = r7.a     // Catch:{ IOException -> 0x0028 }
                    r5.<init>(r6)     // Catch:{ IOException -> 0x0028 }
                    r4.<init>(r5)     // Catch:{ IOException -> 0x0028 }
                    android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ IOException -> 0x0024, all -> 0x0021 }
                    r5 = 100
                    boolean r2 = com.instabug.library.util.BitmapUtils.compressQuietly(r8, r3, r5, r4)     // Catch:{ IOException -> 0x0024, all -> 0x0021 }
                    r4.close()     // Catch:{ IOException -> 0x0033 }
                    goto L_0x0036
                L_0x0021:
                    r8 = move-exception
                    r3 = r4
                    goto L_0x0057
                L_0x0024:
                    r3 = r4
                    goto L_0x0028
                L_0x0026:
                    r8 = move-exception
                    goto L_0x0057
                L_0x0028:
                    java.lang.String r8 = "can't compress bitmap"
                    com.instabug.library.util.InstabugSDKLogger.e(r1, r8)     // Catch:{ all -> 0x0026 }
                    if (r3 == 0) goto L_0x0036
                    r3.close()     // Catch:{ IOException -> 0x0033 }
                    goto L_0x0036
                L_0x0033:
                    com.instabug.library.util.InstabugSDKLogger.e(r1, r0)
                L_0x0036:
                    java.io.File r8 = r7.a
                    android.net.Uri r8 = android.net.Uri.fromFile(r8)
                    if (r2 == 0) goto L_0x0048
                    if (r8 == 0) goto L_0x0048
                    com.instabug.library.util.BitmapUtils$d r0 = com.instabug.library.util.BitmapUtils.d.this
                    com.instabug.library.util.BitmapUtils$OnSaveBitmapCallback r0 = r0.q
                    r0.onSuccess(r8)
                    goto L_0x0056
                L_0x0048:
                    com.instabug.library.util.BitmapUtils$d r8 = com.instabug.library.util.BitmapUtils.d.this
                    com.instabug.library.util.BitmapUtils$OnSaveBitmapCallback r8 = r8.q
                    java.lang.Throwable r0 = new java.lang.Throwable
                    java.lang.String r1 = "Uri equal null"
                    r0.<init>(r1)
                    r8.onError(r0)
                L_0x0056:
                    return
                L_0x0057:
                    if (r3 == 0) goto L_0x0060
                    r3.close()     // Catch:{ IOException -> 0x005d }
                    goto L_0x0060
                L_0x005d:
                    com.instabug.library.util.InstabugSDKLogger.e(r1, r0)
                L_0x0060:
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.util.BitmapUtils.d.a.onBitmapReady(android.graphics.Bitmap):void");
            }
        }

        public d(long j, Drawable drawable, OnSaveBitmapCallback onSaveBitmapCallback) {
            this.c = j;
            this.d = drawable;
            this.q = onSaveBitmapCallback;
        }

        public void run() {
            try {
                File iconTargetDirectory = BitmapUtils.getIconTargetDirectory(this.c);
                InstabugSDKLogger.v(AttachmentsUtility.class, "image path: " + iconTargetDirectory.getPath());
                BitmapUtils.drawableToBitmap(this.d, new a(iconTargetDirectory));
            } catch (Exception e) {
                this.q.onError(e);
            }
        }
    }

    public static class e implements AssetsCacheManager.OnDownloadFinished {
        public final /* synthetic */ OnBitmapReady a;

        public class a implements Runnable {
            public final /* synthetic */ AssetEntity c;

            public a(AssetEntity assetEntity) {
                this.c = assetEntity;
            }

            public void run() {
                BitmapUtils.decodeBitmap(this.c, e.this.a);
            }
        }

        public e(OnBitmapReady onBitmapReady) {
            this.a = onBitmapReady;
        }

        public void onFailed(Throwable th) {
            InstabugSDKLogger.e(this, "Asset Entity downloading got error", th);
            this.a.onBitmapFailedToLoad();
        }

        public void onSuccess(AssetEntity assetEntity) {
            StringBuilder P0 = i0.d.a.a.a.P0("Asset Entity downloaded: ");
            P0.append(assetEntity.getFile().getPath());
            InstabugSDKLogger.d(this, P0.toString());
            if (ThreadUtils.isCurrentThreadMain()) {
                PoolProvider.postBitmapTask(new a(assetEntity));
            } else {
                BitmapUtils.decodeBitmap(assetEntity, this.a);
            }
        }
    }

    public static class f implements Runnable {
        public final /* synthetic */ Bitmap Y1;
        public final /* synthetic */ Drawable c;
        public final /* synthetic */ Canvas d;
        public final /* synthetic */ int q;
        public final /* synthetic */ int x;
        public final /* synthetic */ OnBitmapReady y;

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                f fVar = f.this;
                float[] access$400 = BitmapUtils.getTargetDimensions(fVar.q, fVar.x);
                f fVar2 = f.this;
                fVar2.y.onBitmapReady(BitmapUtils.resizeBitmap(fVar2.Y1, access$400[0], access$400[1]));
            }
        }

        public f(Drawable drawable, Canvas canvas, int i, int i2, OnBitmapReady onBitmapReady, Bitmap bitmap) {
            this.c = drawable;
            this.d = canvas;
            this.q = i;
            this.x = i2;
            this.y = onBitmapReady;
            this.Y1 = bitmap;
        }

        public void run() {
            this.c.setBounds(0, 0, this.d.getWidth(), this.d.getHeight());
            this.c.draw(this.d);
            PoolProvider.postBitmapTask(new a());
        }
    }

    public static class g implements Runnable {
        public final /* synthetic */ Uri c;
        public final /* synthetic */ Context d;
        public final /* synthetic */ Bitmap q;
        public final /* synthetic */ OnSaveBitmapCallback x;

        public class a implements Runnable {
            public final /* synthetic */ boolean c;
            public final /* synthetic */ Uri d;

            public a(boolean z, Uri uri) {
                this.c = z;
                this.d = uri;
            }

            public void run() {
                OnSaveBitmapCallback onSaveBitmapCallback;
                if (this.c && (onSaveBitmapCallback = g.this.x) != null) {
                    onSaveBitmapCallback.onSuccess(this.d);
                }
            }
        }

        public g(Uri uri, Context context, Bitmap bitmap, OnSaveBitmapCallback onSaveBitmapCallback) {
            this.c = uri;
            this.d = context;
            this.q = bitmap;
            this.x = onSaveBitmapCallback;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
            r0 = android.net.Uri.fromFile(new java.io.File(r5.c.getPath()));
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                android.net.Uri r0 = r5.c     // Catch:{ FileNotFoundException -> 0x003f }
                java.lang.String r0 = r0.getPath()     // Catch:{ FileNotFoundException -> 0x003f }
                if (r0 == 0) goto L_0x004f
                java.io.File r0 = new java.io.File     // Catch:{ FileNotFoundException -> 0x003f }
                android.net.Uri r1 = r5.c     // Catch:{ FileNotFoundException -> 0x003f }
                java.lang.String r1 = r1.getPath()     // Catch:{ FileNotFoundException -> 0x003f }
                r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x003f }
                android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ FileNotFoundException -> 0x003f }
                android.content.Context r1 = r5.d     // Catch:{ FileNotFoundException -> 0x003f }
                android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ FileNotFoundException -> 0x003f }
                java.io.OutputStream r1 = r1.openOutputStream(r0)     // Catch:{ FileNotFoundException -> 0x003f }
                if (r1 == 0) goto L_0x004f
                android.graphics.Bitmap r2 = r5.q     // Catch:{ FileNotFoundException -> 0x003f }
                android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ FileNotFoundException -> 0x003f }
                r4 = 100
                boolean r1 = com.instabug.library.util.BitmapUtils.compressQuietly(r2, r3, r4, r1)     // Catch:{ FileNotFoundException -> 0x003f }
                android.os.Handler r2 = new android.os.Handler     // Catch:{ FileNotFoundException -> 0x003f }
                android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch:{ FileNotFoundException -> 0x003f }
                r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x003f }
                com.instabug.library.util.BitmapUtils$g$a r3 = new com.instabug.library.util.BitmapUtils$g$a     // Catch:{ FileNotFoundException -> 0x003f }
                r3.<init>(r1, r0)     // Catch:{ FileNotFoundException -> 0x003f }
                r2.post(r3)     // Catch:{ FileNotFoundException -> 0x003f }
                goto L_0x004f
            L_0x003f:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()
                if (r1 == 0) goto L_0x004f
                java.lang.String r1 = r0.getMessage()
                java.lang.String r2 = "BitmapUtils"
                com.instabug.library.util.InstabugSDKLogger.e(r2, r1, r0)
            L_0x004f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.util.BitmapUtils.g.run():void");
        }
    }

    public static int calculateInSampleSize(BitmapFactory.Options options) {
        int i = options.outHeight;
        int i2 = options.outWidth;
        int i3 = 1;
        if (i > 500 || i2 > 500) {
            int i4 = i / 2;
            int i5 = i2 / 2;
            while (i4 / i3 >= 500 && i5 / i3 >= 500) {
                i3 *= 2;
            }
        }
        return i3;
    }

    public static void compressBitmapAndSave(Context context, File file) {
        if (context != null && file != null) {
            MemoryGuard.from(context).withPredicate(new MemoryNotLowPredicate()).doAction(new a(file));
        }
    }

    /* access modifiers changed from: private */
    public static boolean compressQuietly(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i, OutputStream outputStream) {
        try {
            return !bitmap.isRecycled() && bitmap.compress(compressFormat, i, outputStream);
        } catch (Exception e2) {
            InstabugSDKLogger.e(TAG, e2.toString(), e2);
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static void decodeBitmap(AssetEntity assetEntity, OnBitmapReady onBitmapReady) {
        try {
            onBitmapReady.onBitmapReady(BitmapFactory.decodeStream(new FileInputStream(assetEntity.getFile())));
        } catch (FileNotFoundException e2) {
            InstabugSDKLogger.e(TAG, "Asset Entity downloading got FileNotFoundException error", e2);
            onBitmapReady.onBitmapFailedToLoad();
        }
    }

    public static Bitmap decodeSampledBitmapFromLocalPath(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = calculateInSampleSize(options);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    /* access modifiers changed from: private */
    public static void drawableToBitmap(Drawable drawable, OnBitmapReady onBitmapReady) {
        Bitmap bitmap;
        if (!(drawable instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) drawable).getBitmap()) == null) {
            Context applicationContext = Instabug.getApplicationContext();
            if (applicationContext != null) {
                int dpToPx = DisplayUtils.dpToPx(applicationContext.getResources(), 72);
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth <= dpToPx && intrinsicHeight <= dpToPx) {
                    Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    if (drawable.getConstantState() != null) {
                        drawable = drawable.getConstantState().newDrawable();
                    }
                    PoolProvider.postMainThreadTask(new f(drawable, canvas, intrinsicWidth, intrinsicHeight, onBitmapReady, createBitmap));
                    return;
                }
                return;
            }
            return;
        }
        onBitmapReady.onBitmapReady(resizeBitmap(bitmap, 24.0f, 24.0f));
    }

    public static Bitmap getBitmapFromUri(Uri uri) {
        try {
            if (Instabug.getApplicationContext() != null) {
                return MediaStore.Images.Media.getBitmap(Instabug.getApplicationContext().getContentResolver(), uri);
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            InstabugSDKLogger.e(TAG, "getBitmapFromFilePath returns null because of " + e2.getMessage());
        }
        return null;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public static File getIconTargetDirectory(long j) {
        return new File(VisualUserStepsHelper.getVisualUserStepsDirectory(Instabug.getApplicationContext()), i0.d.a.a.a.l0("icon_", j, ".png"));
    }

    private static Bitmap.CompressFormat getImageMimeType(File file) {
        if (file.getName().contains("png")) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    /* access modifiers changed from: private */
    public static float[] getTargetDimensions(int i, int i2) {
        float[] fArr = {24.0f, 24.0f};
        if (i2 > i) {
            fArr[0] = (((float) i) / ((float) i2)) * 24.0f;
        } else if (i2 < i) {
            fArr[1] = (((float) i2) / ((float) i)) * 24.0f;
        }
        return fArr;
    }

    public static void loadBitmap(String str, ImageView imageView) {
        new BitmapWorkerTask(imageView).execute(new String[]{str});
    }

    public static void loadBitmapForAsset(Context context, String str, AssetEntity.AssetType assetType, OnBitmapReady onBitmapReady) {
        if (context != null) {
            AssetsCacheManager.getAssetEntity(context, AssetsCacheManager.createEmptyEntity(context, str, assetType), new e(onBitmapReady));
        }
    }

    public static void loadBitmapWithFallback(String str, ImageView imageView, int i) {
        new BitmapWorkerTask(imageView, i).execute(new String[]{str});
    }

    public static void maskBitmap(Activity activity, Bitmap bitmap, SettingsManager settingsManager, Canvas canvas) {
        if (activity != null) {
            if (canvas == null) {
                canvas = new Canvas(bitmap);
            }
            Collection<View> privateViews = settingsManager.getPrivateViews();
            for (View next : privateViews) {
                if (!(next == null || activity.findViewById(next.getId()) == null || !ScreenshotTaker.isVisible(next))) {
                    next.getLocationOnScreen(new int[2]);
                    canvas.drawRect(ScreenshotTaker.getVisibleRect(next), new Paint());
                }
            }
            List<RootViewInfo> rootViews = FieldHelper.getRootViews(activity, (int[]) null);
            if (rootViews != null && rootViews.size() > 0) {
                for (RootViewInfo next2 : rootViews) {
                    for (View next3 : privateViews) {
                        if (!(next3 == null || next2.getView().findViewById(next3.getId()) == null || !ScreenshotTaker.isVisible(next3))) {
                            Rect visibleRect = ScreenshotTaker.getVisibleRect(next3);
                            int[] iArr = new int[2];
                            next2.getView().getLocationOnScreen(iArr);
                            visibleRect.top += iArr[1];
                            visibleRect.bottom += iArr[1];
                            canvas.drawRect(visibleRect, new Paint());
                        }
                    }
                }
            }
        }
    }

    public static Bitmap resizeBitmap(Bitmap bitmap, float f2, float f3) {
        if (bitmap == null) {
            return null;
        }
        if (f2 == 0.0f && f3 == 0.0f) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap((int) f2, (int) f3, Bitmap.Config.ARGB_8888);
        if (bitmap.getWidth() < bitmap.getHeight() && f2 > f3) {
            return bitmap;
        }
        if (bitmap.getWidth() > bitmap.getHeight() && f2 < f3) {
            return bitmap;
        }
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        if (bitmap.getWidth() < bitmap.getHeight()) {
            matrix.setScale(f2 / ((float) bitmap.getWidth()), f3 / ((float) bitmap.getHeight()));
        } else {
            matrix.setScale(f3 / ((float) bitmap.getHeight()), f2 / ((float) bitmap.getWidth()));
        }
        canvas.drawBitmap(bitmap, matrix, new Paint());
        return createBitmap;
    }

    public static void saveBitmap(Bitmap bitmap, Context context, OnSaveBitmapCallback onSaveBitmapCallback) {
        PoolProvider.postBitmapTask(new c(context, bitmap, onSaveBitmapCallback));
    }

    public static void saveBitmapAsPNG(Bitmap bitmap, int i, File file, String str, OnSaveBitmapCallback onSaveBitmapCallback) {
        PoolProvider.postBitmapTask(new b(file, str, bitmap, i, onSaveBitmapCallback));
    }

    public static void saveDrawableBitmap(Drawable drawable, long j, OnSaveBitmapCallback onSaveBitmapCallback) {
        if (drawable != null) {
            PoolProvider.postBitmapTask(new d(j, drawable, onSaveBitmapCallback));
        }
    }

    public static void saveBitmap(Bitmap bitmap, Uri uri, Context context, OnSaveBitmapCallback onSaveBitmapCallback) {
        if (uri.getPath() != null) {
            PoolProvider.postBitmapTask(new g(uri, context, bitmap, onSaveBitmapCallback));
        }
    }

    public static void loadBitmap(String str, ImageView imageView, float f2, float f3) {
        new BitmapWorkerTask(imageView, f2, f3).execute(new String[]{str});
    }

    /* access modifiers changed from: private */
    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public static void compressBitmapAndSave(File file) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i = 1;
            options.inJustDecodeBounds = true;
            FileInputStream fileInputStream = new FileInputStream(file);
            BitmapFactory.decodeStream(fileInputStream, (Rect) null, options);
            fileInputStream.close();
            while ((options.outWidth / i) / 2 >= 900 && (options.outHeight / i) / 2 >= 900) {
                i *= 2;
            }
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = i;
            FileInputStream fileInputStream2 = new FileInputStream(file);
            Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream2, (Rect) null, options2);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            decodeStream.compress(getImageMimeType(file), 100, fileOutputStream);
            decodeStream.recycle();
            fileOutputStream.close();
            fileInputStream2.close();
        } catch (Exception e2) {
            e2.printStackTrace();
            InstabugSDKLogger.e(TAG, "compressBitmapAndSave bitmap doesn't compressed correctly " + e2.getMessage());
        }
    }

    public static void loadBitmap(String str, ImageView imageView, BitmapWorkerTask.OnImageLoadedListener onImageLoadedListener) {
        new BitmapWorkerTask(imageView, onImageLoadedListener).execute(new String[]{str});
    }

    public static void loadBitmap(String str, ImageView imageView, float f2, float f3, BitmapWorkerTask.OnImageLoadedListener onImageLoadedListener) {
        new BitmapWorkerTask(imageView, f2, f3, onImageLoadedListener).execute(new String[]{str});
    }
}
