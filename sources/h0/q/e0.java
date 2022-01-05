package h0.q;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;

/* compiled from: ReportFragment */
public class e0 extends Fragment {
    public static final /* synthetic */ int c = 0;
    public a d;

    /* compiled from: ReportFragment */
    public interface a {
    }

    /* compiled from: ReportFragment */
    public static class b implements Application.ActivityLifecycleCallbacks {
        public static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new b());
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            e0.a(activity, Lifecycle.Event.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            e0.a(activity, Lifecycle.Event.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            e0.a(activity, Lifecycle.Event.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            e0.a(activity, Lifecycle.Event.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            e0.a(activity, Lifecycle.Event.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            e0.a(activity, Lifecycle.Event.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    public static void a(Activity activity, Lifecycle.Event event) {
        if (activity instanceof s) {
            r lifecycle = ((s) activity).getLifecycle();
            lifecycle.d("handleLifecycleEvent");
            lifecycle.g(event.getTargetState());
        } else if (activity instanceof p) {
            Lifecycle lifecycle2 = ((p) activity).getLifecycle();
            if (lifecycle2 instanceof r) {
                r rVar = (r) lifecycle2;
                rVar.d("handleLifecycleEvent");
                rVar.g(event.getTargetState());
            }
        }
    }

    public static void c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new e0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void b(Lifecycle.Event event) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), event);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(Lifecycle.Event.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        b(Lifecycle.Event.ON_DESTROY);
        this.d = null;
    }

    public void onPause() {
        super.onPause();
        b(Lifecycle.Event.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        a aVar = this.d;
        if (aVar != null) {
            c0.this.a();
        }
        b(Lifecycle.Event.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        a aVar = this.d;
        if (aVar != null) {
            c0.this.b();
        }
        b(Lifecycle.Event.ON_START);
    }

    public void onStop() {
        super.onStop();
        b(Lifecycle.Event.ON_STOP);
    }
}
