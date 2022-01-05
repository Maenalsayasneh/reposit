package i0.j.e.k0.a.b;

import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.Display;
import com.instabug.library.util.InstabugSDKLogger;
import io.reactivex.internal.operators.observable.ObservableCreate;
import io.reactivex.plugins.RxJavaPlugins;
import k0.b.m;
import k0.b.n;

/* compiled from: PixelCopyDelegate */
public final class d implements n<Bitmap> {
    public final /* synthetic */ Activity a;

    public d(Activity activity) {
        this.a = activity;
    }

    public void a(m<Bitmap> mVar) throws Exception {
        int i;
        Bitmap bitmap;
        Activity activity = this.a;
        int i2 = 0;
        if (activity == null || activity.getWindowManager().getDefaultDisplay() == null || activity.getResources() == null || activity.getResources().getDisplayMetrics() == null) {
            i = 0;
        } else {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            Point point = new Point();
            if (defaultDisplay != null) {
                defaultDisplay.getRealSize(point);
            }
            int i3 = point.x;
            int i4 = point.y;
            i2 = i3;
            i = i4;
        }
        long j = (long) (i2 * i * 4);
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) this.a.getSystemService("activity")).getMemoryInfo(memoryInfo);
            if (j < memoryInfo.availMem) {
                bitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
            } else {
                bitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.RGB_565);
            }
            ((ObservableCreate.CreateEmitter) mVar).b(bitmap);
        } catch (IllegalArgumentException | OutOfMemoryError e) {
            InstabugSDKLogger.e("PixelCopyDelegate", e.getMessage() != null ? "Something went wrong while capturing " : "", e);
            if (!((ObservableCreate.CreateEmitter) mVar).c(e)) {
                RxJavaPlugins.onError(e);
            }
        }
    }
}
