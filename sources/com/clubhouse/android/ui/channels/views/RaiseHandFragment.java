package com.clubhouse.android.ui.channels.views;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.clubhouse.android.channels.mvi.ChannelViewModel;
import com.clubhouse.android.core.ui.BaseBottomSheetFragment;
import com.clubhouse.android.databinding.FragmentRaiseHandBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.app.R;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.k.y0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/clubhouse/android/ui/channels/views/RaiseHandFragment;", "Lcom/clubhouse/android/core/ui/BaseBottomSheetFragment;", "Lm0/i;", "J", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/clubhouse/android/databinding/FragmentRaiseHandBinding;", "m2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "getBinding", "()Lcom/clubhouse/android/databinding/FragmentRaiseHandBinding;", "binding", "Lcom/clubhouse/android/channels/mvi/ChannelViewModel;", "n2", "Lm0/c;", "getChannelViewModel", "()Lcom/clubhouse/android/channels/mvi/ChannelViewModel;", "channelViewModel", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: RaiseHandFragment.kt */
public final class RaiseHandFragment extends BaseBottomSheetFragment {
    public static final /* synthetic */ k<Object>[] l2 = {m.c(new PropertyReference1Impl(m.a(RaiseHandFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentRaiseHandBinding;")), m.c(new PropertyReference1Impl(m.a(RaiseHandFragment.class), "channelViewModel", "getChannelViewModel()Lcom/clubhouse/android/channels/mvi/ChannelViewModel;"))};
    public final FragmentViewBindingDelegate m2 = new FragmentViewBindingDelegate(FragmentRaiseHandBinding.class, this);
    public final c n2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<RaiseHandFragment, ChannelViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new RaiseHandFragment$special$$inlined$parentFragmentViewModel$default$2$1(this), m.a(i0.e.b.z2.g.l.class), true, this.b);
        }
    }

    public RaiseHandFragment() {
        super(R.layout.fragment_raise_hand);
        d a2 = m.a(ChannelViewModel.class);
        this.n2 = new a(a2, true, new RaiseHandFragment$special$$inlined$parentFragmentViewModel$default$1(this, a2, a2), a2).a(this, l2[1]);
    }

    public void J() {
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        FragmentViewBindingDelegate fragmentViewBindingDelegate = this.m2;
        k<Object>[] kVarArr = l2;
        ((FragmentRaiseHandBinding) fragmentViewBindingDelegate.getValue(this, kVarArr[0])).b.setOnClickListener(new j(this));
        ((FragmentRaiseHandBinding) this.m2.getValue(this, kVarArr[0])).a.setOnClickListener(new i0.e.b.g3.k.y0.k(this));
    }
}
