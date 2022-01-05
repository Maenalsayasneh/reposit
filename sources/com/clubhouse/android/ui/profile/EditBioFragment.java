package com.clubhouse.android.ui.profile;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.databinding.FragmentEditDescriptionBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.u.c4;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118F@\u0006X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\u00020\u00178F@\u0006X\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/clubhouse/android/ui/profile/EditBioFragment;", "Lcom/clubhouse/android/core/ui/BaseExpandedBottomSheetFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/android/ui/profile/EditBioArgs;", "s2", "Lm0/o/c;", "getArgs", "()Lcom/clubhouse/android/ui/profile/EditBioArgs;", "args", "Lcom/clubhouse/android/databinding/FragmentEditDescriptionBinding;", "q2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "U0", "()Lcom/clubhouse/android/databinding/FragmentEditDescriptionBinding;", "binding", "Lcom/clubhouse/android/ui/profile/EditBioViewModel;", "r2", "Lm0/c;", "getViewModel", "()Lcom/clubhouse/android/ui/profile/EditBioViewModel;", "viewModel", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: EditBioFragment.kt */
public final class EditBioFragment extends Hilt_EditBioFragment {
    public static final /* synthetic */ k<Object>[] p2 = {m.c(new PropertyReference1Impl(m.a(EditBioFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentEditDescriptionBinding;")), m.c(new PropertyReference1Impl(m.a(EditBioFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/profile/EditBioViewModel;")), m.c(new PropertyReference1Impl(m.a(EditBioFragment.class), "args", "getArgs()Lcom/clubhouse/android/ui/profile/EditBioArgs;"))};
    public final FragmentViewBindingDelegate q2 = new FragmentViewBindingDelegate(FragmentEditDescriptionBinding.class, this);
    public final c r2;
    public final m0.o.c s2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<EditBioFragment, EditBioViewModel> {
        public final /* synthetic */ d a;
        public final /* synthetic */ l b;
        public final /* synthetic */ d c;

        public a(d dVar, boolean z, l lVar, d dVar2) {
            this.a = dVar;
            this.b = lVar;
            this.c = dVar2;
        }

        public c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            i.e(fragment, "thisRef");
            i.e(kVar, "property");
            return g.a.b(fragment, kVar, this.a, new EditBioFragment$special$$inlined$parentFragmentViewModel$default$2$1(this), m.a(c4.class), true, this.b);
        }
    }

    public EditBioFragment() {
        super(R.layout.fragment_edit_description);
        d a2 = m.a(EditBioViewModel.class);
        this.r2 = new a(a2, true, new EditBioFragment$special$$inlined$parentFragmentViewModel$default$1(this, a2, a2), a2).a(this, p2[1]);
        this.s2 = new i0.b.b.i();
    }

    public void J() {
    }

    public final FragmentEditDescriptionBinding U0() {
        return (FragmentEditDescriptionBinding) this.q2.getValue(this, p2[0]);
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        ((AmplitudeAnalytics) v.l(this)).a("Settings-UpdateBio");
        CharSequence text = getResources().getText(R.string.update_your_bio);
        i.d(text, "resources.getText(R.string.update_your_bio)");
        U0().c.setText(text);
        U0().c.setContentDescription(text);
        U0().a.setText(((EditBioArgs) this.s2.getValue(this, p2[2])).c);
        EditText editText = U0().a;
        i.d(editText, "binding.description");
        i.e(editText, "<this>");
        editText.setOnTouchListener(i0.e.b.d3.h.c);
        Button button = U0().b;
        i.d(button, "binding.done");
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button, q.a(viewLifecycleOwner), new i0.e.b.g3.u.a(this));
        U0().a.requestFocus();
    }
}
