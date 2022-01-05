package h0.o.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.app.ActivityCompat;
import androidx.core.app.SharedElementCallback;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import h0.a.d;
import h0.q.n0;
import h0.q.o0;
import h0.q.r;
import h0.x.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: FragmentActivity */
public class k extends ComponentActivity implements ActivityCompat.OnRequestPermissionsResultCallback, ActivityCompat.RequestPermissionsRequestCodeValidator {
    public static final String FRAGMENTS_TAG = "android:support:fragments";
    public boolean mCreated;
    public final r mFragmentLifecycleRegistry = new r(this);
    public final r mFragments;
    public boolean mResumed;
    public boolean mStopped = true;

    /* compiled from: FragmentActivity */
    public class a implements a.b {
        public a() {
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            k.this.markFragmentsCreated();
            k.this.mFragmentLifecycleRegistry.e(Lifecycle.Event.ON_STOP);
            Parcelable g02 = k.this.mFragments.a.x.g0();
            if (g02 != null) {
                bundle.putParcelable(k.FRAGMENTS_TAG, g02);
            }
            return bundle;
        }
    }

    /* compiled from: FragmentActivity */
    public class b implements h0.a.e.b {
        public b() {
        }

        public void a(Context context) {
            t<?> tVar = k.this.mFragments.a;
            tVar.x.b(tVar, tVar, (Fragment) null);
            Bundle a2 = k.this.getSavedStateRegistry().a(k.FRAGMENTS_TAG);
            if (a2 != null) {
                Parcelable parcelable = a2.getParcelable(k.FRAGMENTS_TAG);
                t<?> tVar2 = k.this.mFragments.a;
                if (tVar2 instanceof o0) {
                    tVar2.x.f0(parcelable);
                    return;
                }
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
        }
    }

    /* compiled from: FragmentActivity */
    public class c extends t<k> implements o0, d, h0.a.f.c, y {
        public c() {
            super(k.this);
        }

        public void a(FragmentManager fragmentManager, Fragment fragment) {
            k.this.onAttachFragment(fragment);
        }

        public View b(int i) {
            return k.this.findViewById(i);
        }

        public boolean c() {
            Window window = k.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public Object d() {
            return k.this;
        }

        public LayoutInflater e() {
            return k.this.getLayoutInflater().cloneInContext(k.this);
        }

        public boolean f(Fragment fragment) {
            return !k.this.isFinishing();
        }

        public boolean g(String str) {
            return ActivityCompat.shouldShowRequestPermissionRationale(k.this, str);
        }

        public ActivityResultRegistry getActivityResultRegistry() {
            return k.this.getActivityResultRegistry();
        }

        public Lifecycle getLifecycle() {
            return k.this.mFragmentLifecycleRegistry;
        }

        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return k.this.getOnBackPressedDispatcher();
        }

        public n0 getViewModelStore() {
            return k.this.getViewModelStore();
        }

        public void h() {
            k.this.supportInvalidateOptionsMenu();
        }
    }

    public k() {
        c cVar = new c();
        g0.a.b.b.a.m(cVar, "callbacks == null");
        this.mFragments = new r(cVar);
        init();
    }

    private void init() {
        getSavedStateRegistry().b(FRAGMENTS_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private static boolean markState(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean z = false;
        for (Fragment next : fragmentManager.O()) {
            if (next != null) {
                if (next.getHost() != null) {
                    z |= markState(next.getChildFragmentManager(), state);
                }
                o0 o0Var = next.mViewLifecycleOwner;
                if (o0Var != null) {
                    o0Var.b();
                    if (o0Var.x.c.isAtLeast(Lifecycle.State.STARTED)) {
                        r rVar = next.mViewLifecycleOwner.x;
                        rVar.d("setCurrentState");
                        rVar.g(state);
                        z = true;
                    }
                }
                if (next.mLifecycleRegistry.c.isAtLeast(Lifecycle.State.STARTED)) {
                    r rVar2 = next.mLifecycleRegistry;
                    rVar2.d("setCurrentState");
                    rVar2.g(state);
                    z = true;
                }
            }
        }
        return z;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.a.x.f.onCreateView(view, str, context, attributeSet);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            h0.r.a.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.a.x.y(str, fileDescriptor, printWriter, strArr);
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.a.x;
    }

    @Deprecated
    public h0.r.a.a getSupportLoaderManager() {
        return h0.r.a.a.b(this);
    }

    public void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), Lifecycle.State.CREATED));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mFragments.a();
        super.onConfigurationChanged(configuration);
        this.mFragments.a.x.k(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(Lifecycle.Event.ON_CREATE);
        this.mFragments.a.x.m();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        r rVar = this.mFragments;
        return onCreatePanelMenu | rVar.a.x.n(menu, getMenuInflater());
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        this.mFragments.a.x.o();
        this.mFragmentLifecycleRegistry.e(Lifecycle.Event.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.a.x.p();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mFragments.a.x.r(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.mFragments.a.x.l(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.a.x.q(z);
    }

    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.mFragments.a();
        super.onNewIntent(intent);
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.mFragments.a.x.s(menu);
        }
        super.onPanelClosed(i, menu);
    }

    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.a.x.w(5);
        this.mFragmentLifecycleRegistry.e(Lifecycle.Event.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.a.x.u(z);
    }

    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Deprecated
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return onPrepareOptionsPanel(view, menu) | this.mFragments.a.x.v(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.a.x.C(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(Lifecycle.Event.ON_RESUME);
        FragmentManager fragmentManager = this.mFragments.a.x;
        fragmentManager.D = false;
        fragmentManager.E = false;
        fragmentManager.L.g = false;
        fragmentManager.w(7);
    }

    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            FragmentManager fragmentManager = this.mFragments.a.x;
            fragmentManager.D = false;
            fragmentManager.E = false;
            fragmentManager.L.g = false;
            fragmentManager.w(4);
        }
        this.mFragments.a.x.C(true);
        this.mFragmentLifecycleRegistry.e(Lifecycle.Event.ON_START);
        FragmentManager fragmentManager2 = this.mFragments.a.x;
        fragmentManager2.D = false;
        fragmentManager2.E = false;
        fragmentManager2.L.g = false;
        fragmentManager2.w(5);
    }

    public void onStateNotSaved() {
        this.mFragments.a();
    }

    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        FragmentManager fragmentManager = this.mFragments.a.x;
        fragmentManager.E = true;
        fragmentManager.L.g = true;
        fragmentManager.w(4);
        this.mFragmentLifecycleRegistry.e(Lifecycle.Event.ON_STOP);
    }

    public void setEnterSharedElementCallback(SharedElementCallback sharedElementCallback) {
        ActivityCompat.setEnterSharedElementCallback(this, sharedElementCallback);
    }

    public void setExitSharedElementCallback(SharedElementCallback sharedElementCallback) {
        ActivityCompat.setExitSharedElementCallback(this, sharedElementCallback);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            ActivityCompat.startIntentSenderForResult(this, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        ActivityCompat.finishAfterTransition(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        ActivityCompat.postponeEnterTransition(this);
    }

    public void supportStartPostponedEnterTransition() {
        ActivityCompat.startPostponedEnterTransition(this);
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            ActivityCompat.startActivityForResult(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView((View) null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public k(int i) {
        super(i);
        c cVar = new c();
        g0.a.b.b.a.m(cVar, "callbacks == null");
        this.mFragments = new r(cVar);
        init();
    }
}
