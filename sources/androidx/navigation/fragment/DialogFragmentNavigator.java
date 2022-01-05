package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import h0.q.n;
import h0.q.p;
import h0.t.c;
import h0.t.k;
import h0.t.q;
import h0.t.s;
import java.util.HashSet;

@s.b("dialog")
public final class DialogFragmentNavigator extends s<a> {
    public final Context a;
    public final FragmentManager b;
    public int c = 0;
    public final HashSet<String> d = new HashSet<>();
    public n e = new n(this) {
        public void a(p pVar, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_STOP) {
                DialogFragment dialogFragment = (DialogFragment) pVar;
                if (!dialogFragment.M0().isShowing()) {
                    NavHostFragment.I0(dialogFragment).l();
                }
            }
        }
    };

    public static class a extends k implements c {
        public String b2;

        public a(s<? extends a> sVar) {
            super((s<? extends k>) sVar);
        }

        public void o(Context context, AttributeSet attributeSet) {
            super.o(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.DialogFragmentNavigator);
            String string = obtainAttributes.getString(R.styleable.DialogFragmentNavigator_android_name);
            if (string != null) {
                this.b2 = string;
            }
            obtainAttributes.recycle();
        }
    }

    public DialogFragmentNavigator(Context context, FragmentManager fragmentManager) {
        this.a = context;
        this.b = fragmentManager;
    }

    public k a() {
        return new a(this);
    }

    public k b(k kVar, Bundle bundle, q qVar, s.a aVar) {
        a aVar2 = (a) kVar;
        if (this.b.V()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return null;
        }
        String str = aVar2.b2;
        if (str != null) {
            if (str.charAt(0) == '.') {
                str = this.a.getPackageName() + str;
            }
            Fragment instantiate = this.b.N().instantiate(this.a.getClassLoader(), str);
            if (!DialogFragment.class.isAssignableFrom(instantiate.getClass())) {
                StringBuilder P0 = i0.d.a.a.a.P0("Dialog destination ");
                String str2 = aVar2.b2;
                if (str2 != null) {
                    throw new IllegalArgumentException(i0.d.a.a.a.y0(P0, str2, " is not an instance of DialogFragment"));
                }
                throw new IllegalStateException("DialogFragment class was not set");
            }
            DialogFragment dialogFragment = (DialogFragment) instantiate;
            dialogFragment.setArguments(bundle);
            dialogFragment.getLifecycle().a(this.e);
            FragmentManager fragmentManager = this.b;
            StringBuilder P02 = i0.d.a.a.a.P0("androidx-nav-fragment:navigator:dialog:");
            int i = this.c;
            this.c = i + 1;
            P02.append(i);
            dialogFragment.P0(fragmentManager, P02.toString());
            return aVar2;
        }
        throw new IllegalStateException("DialogFragment class was not set");
    }

    public void c(Bundle bundle) {
        this.c = bundle.getInt("androidx-nav-dialogfragment:navigator:count", 0);
        for (int i = 0; i < this.c; i++) {
            FragmentManager fragmentManager = this.b;
            DialogFragment dialogFragment = (DialogFragment) fragmentManager.J("androidx-nav-fragment:navigator:dialog:" + i);
            if (dialogFragment != null) {
                dialogFragment.getLifecycle().a(this.e);
            } else {
                HashSet<String> hashSet = this.d;
                hashSet.add("androidx-nav-fragment:navigator:dialog:" + i);
            }
        }
    }

    public Bundle d() {
        if (this.c == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("androidx-nav-dialogfragment:navigator:count", this.c);
        return bundle;
    }

    public boolean e() {
        if (this.c == 0) {
            return false;
        }
        if (this.b.V()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        FragmentManager fragmentManager = this.b;
        StringBuilder P0 = i0.d.a.a.a.P0("androidx-nav-fragment:navigator:dialog:");
        int i = this.c - 1;
        this.c = i;
        P0.append(i);
        Fragment J = fragmentManager.J(P0.toString());
        if (J != null) {
            J.getLifecycle().b(this.e);
            ((DialogFragment) J).dismiss();
        }
        return true;
    }
}
