package i0.j.e.k0.a.b;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.PixelCopy;
import android.view.View;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.HashMap;
import k0.b.y.e;

/* compiled from: PixelCopyDelegate */
public final class b implements e<Pair<Bitmap, HashMap<View, Integer>>, Bitmap> {
    public final /* synthetic */ Activity c;

    public b(Activity activity) {
        this.c = activity;
    }

    public Object apply(Object obj) throws Exception {
        Pair pair = (Pair) obj;
        Bitmap bitmap = (Bitmap) pair.first;
        try {
            PixelCopy.request(this.c.getWindow(), bitmap, new a(this, bitmap, (HashMap) pair.second), new Handler(Looper.getMainLooper()));
        } catch (Exception e) {
            InstabugSDKLogger.e("PixelCopyDelegate", e.getMessage() != null ? "Something went wrong while capturing " : "", e);
        }
        return bitmap;
    }
}
