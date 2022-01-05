package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.runtime.R;
import h0.o.a.q;
import h0.q.p;
import h0.q.z;
import java.util.Objects;

public class DialogFragment extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public int Y1 = 0;
    public boolean Z1 = true;
    public boolean a2 = true;
    public int b2 = -1;
    public Handler c;
    public boolean c2;
    public Runnable d = new a();
    public z<p> d2 = new d();
    public Dialog e2;
    public boolean f2;
    public boolean g2;
    public boolean h2;
    public boolean i2 = false;
    public DialogInterface.OnCancelListener q = new b();
    public DialogInterface.OnDismissListener x = new c();
    public int y = 0;

    public class a implements Runnable {
        public a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            DialogFragment dialogFragment = DialogFragment.this;
            dialogFragment.x.onDismiss(dialogFragment.e2);
        }
    }

    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            DialogFragment dialogFragment = DialogFragment.this;
            Dialog dialog = dialogFragment.e2;
            if (dialog != null) {
                dialogFragment.onCancel(dialog);
            }
        }
    }

    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            DialogFragment dialogFragment = DialogFragment.this;
            Dialog dialog = dialogFragment.e2;
            if (dialog != null) {
                dialogFragment.onDismiss(dialog);
            }
        }
    }

    public class d implements z<p> {
        public d() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onChanged(Object obj) {
            if (((p) obj) != null) {
                DialogFragment dialogFragment = DialogFragment.this;
                if (dialogFragment.a2) {
                    View requireView = dialogFragment.requireView();
                    if (requireView.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    } else if (DialogFragment.this.e2 != null) {
                        if (FragmentManager.R(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogFragment.this.e2);
                        }
                        DialogFragment.this.e2.setContentView(requireView);
                    }
                }
            }
        }
    }

    public class e extends q {
        public final /* synthetic */ q a;

        public e(q qVar) {
            this.a = qVar;
        }

        public View b(int i) {
            if (this.a.c()) {
                return this.a.b(i);
            }
            Dialog dialog = DialogFragment.this.e2;
            if (dialog != null) {
                return dialog.findViewById(i);
            }
            return null;
        }

        public boolean c() {
            return this.a.c() || DialogFragment.this.i2;
        }
    }

    public DialogFragment() {
    }

    public void I0() {
        J0(true, false);
    }

    public final void J0(boolean z, boolean z2) {
        if (!this.g2) {
            this.g2 = true;
            this.h2 = false;
            Dialog dialog = this.e2;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.e2.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.c.getLooper()) {
                        onDismiss(this.e2);
                    } else {
                        this.c.post(this.d);
                    }
                }
            }
            this.f2 = true;
            if (this.b2 >= 0) {
                FragmentManager parentFragmentManager = getParentFragmentManager();
                int i = this.b2;
                Objects.requireNonNull(parentFragmentManager);
                if (i >= 0) {
                    parentFragmentManager.A(new FragmentManager.n((String) null, i, 1), false);
                    this.b2 = -1;
                    return;
                }
                throw new IllegalArgumentException(i0.d.a.a.a.e0("Bad id: ", i));
            }
            h0.o.a.a aVar = new h0.o.a.a(getParentFragmentManager());
            aVar.n(this);
            if (z) {
                aVar.i();
            } else {
                aVar.h();
            }
        }
    }

    public int K0() {
        return this.Y1;
    }

    public Dialog L0(Bundle bundle) {
        if (FragmentManager.R(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(requireContext(), K0());
    }

    public final Dialog M0() {
        Dialog dialog = this.e2;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void N0(int i, int i3) {
        if (FragmentManager.R(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i + ", " + i3);
        }
        this.y = i;
        if (i == 2 || i == 3) {
            this.Y1 = 16973913;
        }
        if (i3 != 0) {
            this.Y1 = i3;
        }
    }

    public void O0(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void P0(FragmentManager fragmentManager, String str) {
        this.g2 = false;
        this.h2 = true;
        h0.o.a.a aVar = new h0.o.a.a(fragmentManager);
        aVar.m(0, this, str, 1);
        aVar.h();
    }

    public q createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    public void dismiss() {
        J0(false, false);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().observeForever(this.d2);
        if (!this.h2) {
            this.g2 = false;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = new Handler();
        this.a2 = this.mContainerId == 0;
        if (bundle != null) {
            this.y = bundle.getInt("android:style", 0);
            this.Y1 = bundle.getInt("android:theme", 0);
            this.Z1 = bundle.getBoolean("android:cancelable", true);
            this.a2 = bundle.getBoolean("android:showsDialog", this.a2);
            this.b2 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.e2;
        if (dialog != null) {
            this.f2 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.e2.dismiss();
            if (!this.g2) {
                onDismiss(this.e2);
            }
            this.e2 = null;
            this.i2 = false;
        }
    }

    public void onDetach() {
        super.onDetach();
        if (!this.h2 && !this.g2) {
            this.g2 = true;
        }
        getViewLifecycleOwnerLiveData().removeObserver(this.d2);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f2) {
            if (FragmentManager.R(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            J0(true, true);
        }
    }

    /* JADX INFO: finally extract failed */
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        boolean z = this.a2;
        if (!z || this.c2) {
            if (FragmentManager.R(2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (!this.a2) {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                } else {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                }
            }
            return onGetLayoutInflater;
        }
        if (z && !this.i2) {
            try {
                this.c2 = true;
                Dialog L0 = L0(bundle);
                this.e2 = L0;
                if (this.a2) {
                    O0(L0, this.y);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.e2.setOwnerActivity((Activity) context);
                    }
                    this.e2.setCancelable(this.Z1);
                    this.e2.setOnCancelListener(this.q);
                    this.e2.setOnDismissListener(this.x);
                    this.i2 = true;
                } else {
                    this.e2 = null;
                }
                this.c2 = false;
            } catch (Throwable th) {
                this.c2 = false;
                throw th;
            }
        }
        if (FragmentManager.R(2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.e2;
        return dialog != null ? onGetLayoutInflater.cloneInContext(dialog.getContext()) : onGetLayoutInflater;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.e2;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.y;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i3 = this.Y1;
        if (i3 != 0) {
            bundle.putInt("android:theme", i3);
        }
        boolean z = this.Z1;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.a2;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i4 = this.b2;
        if (i4 != -1) {
            bundle.putInt("android:backStackId", i4);
        }
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = this.e2;
        if (dialog != null) {
            this.f2 = false;
            dialog.show();
            View decorView = this.e2.getWindow().getDecorView();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(androidx.lifecycle.viewmodel.R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(androidx.savedstate.R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    public void onStop() {
        super.onStop();
        Dialog dialog = this.e2;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.e2 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.e2.onRestoreInstanceState(bundle2);
        }
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView == null && this.e2 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.e2.onRestoreInstanceState(bundle2);
        }
    }

    public DialogFragment(int i) {
        super(i);
    }
}
