package i0.j.e.f1;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.util.BitmapUtils;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.visualusersteps.VisualUserStepsHelper;
import i0.j.e.f1.c;
import java.io.File;

/* compiled from: VisualUserStepsProvider */
public class o implements Runnable {
    public final /* synthetic */ Bitmap c;
    public final /* synthetic */ Activity d;
    public final /* synthetic */ c q;

    /* compiled from: VisualUserStepsProvider */
    public class a implements BitmapUtils.OnSaveBitmapCallback {
        public a() {
        }

        public void onError(Throwable th) {
            StringBuilder P0 = i0.d.a.a.a.P0("capturing VisualUserStep failed error: ");
            P0.append(th.getMessage());
            P0.append(", time in MS: ");
            P0.append(System.currentTimeMillis());
            InstabugSDKLogger.e("VisualUserStepsProvider", P0.toString(), th);
        }

        public void onSuccess(Uri uri) {
            c.a aVar = new c.a(uri.getLastPathSegment());
            Activity activity = o.this.d;
            if (activity == null || activity.getResources().getConfiguration().orientation != 2) {
                aVar.b = "portrait";
            } else {
                aVar.b = "landscape";
            }
            o.this.q.d = aVar;
            if (uri.getPath() != null) {
                InstabugCore.encrypt(uri.getPath());
            }
        }
    }

    public o(Bitmap bitmap, Activity activity, c cVar) {
        this.c = bitmap;
        this.d = activity;
        this.q = cVar;
    }

    public void run() {
        Bitmap bitmap = this.c;
        File visualUserStepsDirectory = VisualUserStepsHelper.getVisualUserStepsDirectory(this.d);
        StringBuilder P0 = i0.d.a.a.a.P0("step");
        P0.append(this.q.b);
        BitmapUtils.saveBitmapAsPNG(bitmap, 70, visualUserStepsDirectory, P0.toString(), new a());
    }
}
