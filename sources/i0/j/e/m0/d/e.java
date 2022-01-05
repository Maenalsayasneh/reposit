package i0.j.e.m0.d;

import android.app.Activity;
import android.content.res.Configuration;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import i0.j.e.y.a.a;
import java.util.Objects;
import k0.b.y.d;

/* compiled from: ScreenRecordingFab */
public class e implements d<a> {
    public final /* synthetic */ d c;

    public e(d dVar) {
        this.c = dVar;
    }

    public void b(Object obj) throws Exception {
        Configuration configuration = ((a) obj).b;
        if (configuration != null) {
            d dVar = this.c;
            Objects.requireNonNull(dVar);
            Activity currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
            if (currentActivity != null) {
                dVar.e();
                dVar.f();
                dVar.c = null;
                dVar.y = (int) (((float) configuration.screenWidthDp) * currentActivity.getApplicationContext().getResources().getDisplayMetrics().density);
                int i = (int) (((float) configuration.screenHeightDp) * currentActivity.getApplicationContext().getResources().getDisplayMetrics().density);
                dVar.Y1 = i;
                dVar.b(currentActivity, dVar.y, i);
            }
        }
    }
}
