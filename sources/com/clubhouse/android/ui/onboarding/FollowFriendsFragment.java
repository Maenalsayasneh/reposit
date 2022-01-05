package com.clubhouse.android.ui.onboarding;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import com.clubhouse.android.databinding.FragmentFollowFriendsBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.android.shared.ui.ImpressionTrackingEpoxyRecyclerView;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.r.e1;
import i0.e.b.g3.r.o;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\fJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001d\u0010\u001a\u001a\u00020\u00158B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010 \u001a\u00020\u001b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/clubhouse/android/ui/onboarding/FollowFriendsFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Li0/e/a/b/a;", "a2", "Li0/e/a/b/a;", "getActionTrailRecorder", "()Li0/e/a/b/a;", "setActionTrailRecorder", "(Li0/e/a/b/a;)V", "actionTrailRecorder", "Lcom/clubhouse/android/ui/onboarding/FollowFriendsViewModel;", "c2", "Lm0/c;", "O0", "()Lcom/clubhouse/android/ui/onboarding/FollowFriendsViewModel;", "viewModel", "Lcom/clubhouse/android/databinding/FragmentFollowFriendsBinding;", "b2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "N0", "()Lcom/clubhouse/android/databinding/FragmentFollowFriendsBinding;", "binding", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: FollowFriendsFragment.kt */
public final class FollowFriendsFragment extends Hilt_FollowFriendsFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(FollowFriendsFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentFollowFriendsBinding;")), m.c(new PropertyReference1Impl(m.a(FollowFriendsFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/onboarding/FollowFriendsViewModel;"))};
    public i0.e.a.b.a a2;
    public final FragmentViewBindingDelegate b2 = new FragmentViewBindingDelegate(FragmentFollowFriendsBinding.class, this);
    public final c c2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<FollowFriendsFragment, FollowFriendsViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new FollowFriendsFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(e1.class), false, this.b);
        }
    }

    public FollowFriendsFragment() {
        super(R.layout.fragment_follow_friends);
        d a3 = m.a(FollowFriendsViewModel.class);
        this.c2 = new a(a3, false, new FollowFriendsFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, Z1[1]);
    }

    public void J() {
        v.v2(O0(), new FollowFriendsFragment$invalidate$1(this));
    }

    public final FragmentFollowFriendsBinding N0() {
        return (FragmentFollowFriendsBinding) this.b2.getValue(this, Z1[0]);
    }

    public final FollowFriendsViewModel O0() {
        return (FollowFriendsViewModel) this.c2.getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v.V(this);
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(O0().l, new FollowFriendsFragment$onViewCreated$1(this, (m0.l.c<? super FollowFriendsFragment$onViewCreated$1>) null));
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner));
        N0().b.setOnClickListener(new o(this));
        N0().e.setOnClickListener(new i0.e.b.g3.r.p(this));
        N0().c.setLayoutManager(new GridLayoutManager(getContext(), 3));
        ImpressionTrackingEpoxyRecyclerView impressionTrackingEpoxyRecyclerView = N0().c;
        i.d(impressionTrackingEpoxyRecyclerView, "binding.friendSuggestions");
        i0.e.b.d3.k.D(impressionTrackingEpoxyRecyclerView, this, new FollowFriendsFragment$buildModels$1(this));
    }
}
