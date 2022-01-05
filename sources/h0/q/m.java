package h0.q;

import android.app.Activity;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LifecycleDispatcher */
public class m {
    public static AtomicBoolean a = new AtomicBoolean(false);

    /* compiled from: LifecycleDispatcher */
    public static class a extends i {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            e0.c(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }
}
