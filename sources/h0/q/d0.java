package h0.q;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;

/* compiled from: ProcessLifecycleOwner */
public class d0 extends i {
    public final /* synthetic */ c0 this$0;

    /* compiled from: ProcessLifecycleOwner */
    public class a extends i {
        public a() {
        }

        public void onActivityPostResumed(Activity activity) {
            d0.this.this$0.a();
        }

        public void onActivityPostStarted(Activity activity) {
            d0.this.this$0.b();
        }
    }

    public d0(c0 c0Var) {
        this.this$0 = c0Var;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = e0.c;
            ((e0) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).d = this.this$0.b2;
        }
    }

    public void onActivityPaused(Activity activity) {
        c0 c0Var = this.this$0;
        int i = c0Var.q - 1;
        c0Var.q = i;
        if (i == 0) {
            c0Var.Y1.postDelayed(c0Var.a2, 700);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new a());
    }

    public void onActivityStopped(Activity activity) {
        c0 c0Var = this.this$0;
        int i = c0Var.d - 1;
        c0Var.d = i;
        if (i == 0 && c0Var.x) {
            c0Var.Z1.e(Lifecycle.Event.ON_STOP);
            c0Var.y = true;
        }
    }
}
