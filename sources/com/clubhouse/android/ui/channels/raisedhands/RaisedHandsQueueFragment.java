package com.clubhouse.android.ui.channels.raisedhands;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.channels.mvi.ChannelViewModel;
import com.clubhouse.android.core.ui.BaseBottomSheetFragment;
import com.clubhouse.android.databinding.FragmentRaisedHandsQueueBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.b.b.g;
import i0.b.b.h;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/clubhouse/android/ui/channels/raisedhands/RaisedHandsQueueFragment;", "Lcom/clubhouse/android/core/ui/BaseBottomSheetFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/android/databinding/FragmentRaisedHandsQueueBinding;", "m2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "T0", "()Lcom/clubhouse/android/databinding/FragmentRaisedHandsQueueBinding;", "binding", "Lcom/clubhouse/android/channels/mvi/ChannelViewModel;", "n2", "Lm0/c;", "getChannelViewModel", "()Lcom/clubhouse/android/channels/mvi/ChannelViewModel;", "channelViewModel", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: RaisedHandsQueueFragment.kt */
public final class RaisedHandsQueueFragment extends BaseBottomSheetFragment {
    public static final /* synthetic */ k<Object>[] l2 = {m.c(new PropertyReference1Impl(m.a(RaisedHandsQueueFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentRaisedHandsQueueBinding;")), m.c(new PropertyReference1Impl(m.a(RaisedHandsQueueFragment.class), "channelViewModel", "getChannelViewModel()Lcom/clubhouse/android/channels/mvi/ChannelViewModel;"))};
    public final FragmentViewBindingDelegate m2 = new FragmentViewBindingDelegate(FragmentRaisedHandsQueueBinding.class, this);
    public final c n2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<RaisedHandsQueueFragment, ChannelViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new RaisedHandsQueueFragment$special$$inlined$parentFragmentViewModel$default$2$1(this), m.a(i0.e.b.z2.g.l.class), true, this.b);
        }
    }

    public RaisedHandsQueueFragment() {
        super(R.layout.fragment_raised_hands_queue);
        d a2 = m.a(ChannelViewModel.class);
        this.n2 = new a(a2, true, new RaisedHandsQueueFragment$special$$inlined$parentFragmentViewModel$default$1(this, a2, a2), a2).a(this, l2[1]);
    }

    public static final ChannelViewModel S0(RaisedHandsQueueFragment raisedHandsQueueFragment) {
        return (ChannelViewModel) raisedHandsQueueFragment.n2.getValue();
    }

    public void J() {
        v.v2((ChannelViewModel) this.n2.getValue(), new RaisedHandsQueueFragment$invalidate$1(this));
    }

    public final FragmentRaisedHandsQueueBinding T0() {
        return (FragmentRaisedHandsQueueBinding) this.m2.getValue(this, l2[0]);
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        EpoxyRecyclerView epoxyRecyclerView = T0().d;
        i.d(epoxyRecyclerView, "binding.userList");
        i0.e.b.d3.k.D(epoxyRecyclerView, this, new RaisedHandsQueueFragment$buildModels$1(this));
        T0().b.setOnClickListener(new i0.e.b.g3.k.v0.a(this));
    }
}
