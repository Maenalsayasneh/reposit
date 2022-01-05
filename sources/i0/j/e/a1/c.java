package i0.j.e.a1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;

/* compiled from: InstabugFragmentLifecycleListener */
public class c extends FragmentManager.k {
    public void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        super.onFragmentAttached(fragmentManager, fragment, context);
        InstabugInternalTrackingDelegate.getInstance().onFragmentAttached(fragment);
    }

    public void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentDetached(fragmentManager, fragment);
        InstabugInternalTrackingDelegate.getInstance().onFragmentDetached(fragment);
    }

    public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentPaused(fragmentManager, fragment);
        InstabugInternalTrackingDelegate.getInstance().onFragmentPaused(fragment);
    }

    public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentResumed(fragmentManager, fragment);
        InstabugInternalTrackingDelegate.getInstance().onFragmentResumed(fragment);
    }

    public void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentStarted(fragmentManager, fragment);
        InstabugInternalTrackingDelegate.getInstance().onFragmentStarted(fragment);
    }

    public void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentStopped(fragmentManager, fragment);
        InstabugInternalTrackingDelegate.getInstance().onFragmentStopped(fragment);
    }

    public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        super.onFragmentViewCreated(fragmentManager, fragment, view, bundle);
        InstabugInternalTrackingDelegate.getInstance().onFragmentViewCreated(fragment);
    }
}
