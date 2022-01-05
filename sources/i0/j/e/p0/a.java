package i0.j.e.p0;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* compiled from: ActivityReferenceManager */
public final class a {
    public WeakReference<Activity> a;

    public Activity a() {
        WeakReference<Activity> weakReference = this.a;
        if (weakReference == null) {
            return null;
        }
        Activity activity = (Activity) weakReference.get();
        boolean z = false;
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            z = true;
        }
        if (!z) {
            return null;
        }
        return activity;
    }
}
