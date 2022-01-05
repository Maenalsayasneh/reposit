package i0.j.e.m0.d;

import android.app.Activity;
import com.instabug.library.tracking.ActivityLifeCycleEvent;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.e.m0.d.d;
import java.util.Objects;
import k0.b.y.d;

/* compiled from: ScreenRecordingFab */
public class f implements d<ActivityLifeCycleEvent> {
    public final /* synthetic */ d c;

    public f(d dVar) {
        this.c = dVar;
    }

    public void b(Object obj) throws Exception {
        int i = d.e.b[((ActivityLifeCycleEvent) obj).ordinal()];
        if (i == 1) {
            d dVar = this.c;
            Objects.requireNonNull(dVar);
            Activity currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
            if (currentActivity != null) {
                dVar.Y1 = currentActivity.getResources().getDisplayMetrics().heightPixels;
                int i2 = currentActivity.getResources().getDisplayMetrics().widthPixels;
                dVar.y = i2;
                dVar.b(currentActivity, i2, dVar.Y1);
                return;
            }
            InstabugSDKLogger.w("ScreenRecordingFab", "current activity equal null");
        } else if (i == 2) {
            d dVar2 = this.c;
            dVar2.e();
            dVar2.f();
        }
    }
}
