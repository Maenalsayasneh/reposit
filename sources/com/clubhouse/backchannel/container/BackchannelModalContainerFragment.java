package com.clubhouse.backchannel.container;

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.fragment.app.FragmentContainerView;
import com.clubhouse.android.core.ui.BaseBottomSheetFragment;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.backchannel.R;
import com.clubhouse.backchannel.databinding.FragmentBackchannelContainerBinding;
import h0.b0.v;
import i0.e.c.d.a;
import i0.h.a.c.g.d;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/clubhouse/backchannel/container/BackchannelModalContainerFragment;", "Lcom/clubhouse/android/core/ui/BaseBottomSheetFragment;", "", "K0", "()I", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Li0/h/a/c/g/d;", "R0", "(Landroid/os/Bundle;)Li0/h/a/c/g/d;", "onStart", "()V", "J", "Lcom/clubhouse/backchannel/databinding/FragmentBackchannelContainerBinding;", "m2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "getBinding", "()Lcom/clubhouse/backchannel/databinding/FragmentBackchannelContainerBinding;", "binding", "<init>", "backchannel_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: BackchannelModalContainerFragment.kt */
public final class BackchannelModalContainerFragment extends BaseBottomSheetFragment {
    public static final /* synthetic */ k<Object>[] l2 = {m.c(new PropertyReference1Impl(m.a(BackchannelModalContainerFragment.class), "binding", "getBinding()Lcom/clubhouse/backchannel/databinding/FragmentBackchannelContainerBinding;"))};
    public final FragmentViewBindingDelegate m2 = new FragmentViewBindingDelegate(FragmentBackchannelContainerBinding.class, this);

    public BackchannelModalContainerFragment() {
        super(R.layout.fragment_backchannel_container);
    }

    public void J() {
    }

    public int K0() {
        return R.style.ClubhouseBottomSheetDialog_BackchannelContainer;
    }

    public Dialog L0(Bundle bundle) {
        d R0 = super.L0(bundle);
        i.e(this, "<this>");
        i.e(R0, "dialog");
        R0.setOnKeyListener(new a(this));
        return R0;
    }

    public d R0(Bundle bundle) {
        d R0 = super.L0(bundle);
        i.e(this, "<this>");
        i.e(R0, "dialog");
        R0.setOnKeyListener(new a(this));
        return R0;
    }

    public void onStart() {
        super.onStart();
        int i = Resources.getSystem().getDisplayMetrics().heightPixels;
        ViewParent parent = requireView().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.getLayoutParams().height = (int) (((float) i) * 0.7f);
            v.g(this, new BackchannelModalContainerFragment$onStart$1(viewGroup, this, i));
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        v.U1(this);
        Dialog dialog = this.e2;
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setDimAmount(0.2f);
        }
        FragmentContainerView fragmentContainerView = ((FragmentBackchannelContainerBinding) this.m2.getValue(this, l2[0])).a;
        i.d(fragmentContainerView, "binding.root");
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.common_sheet_corner_radius);
        i.e(fragmentContainerView, "$this$setPaddingTop");
        fragmentContainerView.setPadding(fragmentContainerView.getPaddingLeft(), dimensionPixelSize, fragmentContainerView.getPaddingRight(), fragmentContainerView.getPaddingBottom());
        v.H(this);
    }
}
