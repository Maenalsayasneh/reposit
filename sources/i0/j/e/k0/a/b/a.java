package i0.j.e.k0.a.b;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.PixelCopy;
import android.view.View;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.BitmapUtils;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PixelCopyDelegate */
public class a implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ Bitmap a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ b c;

    public a(b bVar, Bitmap bitmap, HashMap hashMap) {
        this.c = bVar;
        this.a = bitmap;
        this.b = hashMap;
    }

    public void onPixelCopyFinished(int i) {
        if (i == 0) {
            Activity activity = this.c.c;
            Bitmap bitmap = this.a;
            if (i == 0) {
                i0.j.c.l.a.g(activity, bitmap);
            } else {
                bitmap.recycle();
            }
            BitmapUtils.maskBitmap(this.c.c, this.a, SettingsManager.getInstance(), (Canvas) null);
        } else {
            InstabugSDKLogger.e("PixelCopyDelegate", "Something went wrong while capturing ");
            this.a.recycle();
        }
        HashMap hashMap = this.b;
        if (hashMap != null && hashMap.size() != 0) {
            for (Map.Entry entry : hashMap.entrySet()) {
                ((View) entry.getKey()).setVisibility(((Integer) entry.getValue()).intValue());
            }
        }
    }
}
