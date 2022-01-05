package com.clubhouse.android.ui.recentSpeakers;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.airbnb.epoxy.paging3.PagingDataEpoxyController;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.databinding.FragmentRecentSpeakersBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.android.ui.profile.ProfileArgs;
import com.clubhouse.app.R;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.b0.v;
import h0.q.p;
import h0.t.q;
import h0.v.a.g;
import i0.b.a.t;
import i0.b.b.h;
import i0.e.b.g3.v.b;
import i0.e.b.g3.v.d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001b\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00060\u0017R\u00020\u00008\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/clubhouse/android/ui/recentSpeakers/RecentSpeakersFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/android/databinding/FragmentRecentSpeakersBinding;", "a2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "N0", "()Lcom/clubhouse/android/databinding/FragmentRecentSpeakersBinding;", "binding", "Lcom/clubhouse/android/ui/recentSpeakers/RecentSpeakersViewModel;", "b2", "Lm0/c;", "getViewModel", "()Lcom/clubhouse/android/ui/recentSpeakers/RecentSpeakersViewModel;", "viewModel", "Lcom/clubhouse/android/ui/recentSpeakers/RecentSpeakersFragment$PagingController;", "c2", "Lcom/clubhouse/android/ui/recentSpeakers/RecentSpeakersFragment$PagingController;", "pagedController", "<init>", "PagingController", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: RecentSpeakersFragment.kt */
public final class RecentSpeakersFragment extends Hilt_RecentSpeakersFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(RecentSpeakersFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentRecentSpeakersBinding;")), m.c(new PropertyReference1Impl(m.a(RecentSpeakersFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/recentSpeakers/RecentSpeakersViewModel;"))};
    public final FragmentViewBindingDelegate a2 = new FragmentViewBindingDelegate(FragmentRecentSpeakersBinding.class, this);
    public final c b2;
    public final PagingController c2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/clubhouse/android/ui/recentSpeakers/RecentSpeakersFragment$PagingController;", "Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "Li0/e/b/b3/b/e/m;", "", "currentPosition", "item", "Li0/b/a/t;", "buildItemModel", "(ILi0/e/b/b3/b/e/m;)Li0/b/a/t;", "<init>", "(Lcom/clubhouse/android/ui/recentSpeakers/RecentSpeakersFragment;)V", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* compiled from: RecentSpeakersFragment.kt */
    public final class PagingController extends PagingDataEpoxyController<i0.e.b.b3.b.e.m> {
        public final /* synthetic */ RecentSpeakersFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PagingController(RecentSpeakersFragment recentSpeakersFragment) {
            super((Handler) null, (Handler) null, (g.e) null, 7, (f) null);
            i.e(recentSpeakersFragment, "this$0");
            this.this$0 = recentSpeakersFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: buildItemModel$lambda-0  reason: not valid java name */
        public static final void m37buildItemModel$lambda0(RecentSpeakersFragment recentSpeakersFragment, i0.e.b.b3.b.e.m mVar, View view) {
            i.e(recentSpeakersFragment, "this$0");
            UserInList userInList = mVar.g;
            SourceLocation sourceLocation = SourceLocation.RECENT_CHANNELS_SPEAKERS;
            i.e(userInList, "<this>");
            i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
            ProfileArgs profileArgs = new ProfileArgs(userInList.getId(), (String) null, new BasicUser(userInList.getId().intValue(), userInList.getName(), userInList.C(), userInList.b()), false, (Uri) null, sourceLocation, (Map) null, 26);
            i.e(profileArgs, "mavericksArg");
            v.a1(recentSpeakersFragment, new d(profileArgs, (String) null), (q) null, 2);
        }

        /* access modifiers changed from: private */
        /* renamed from: buildItemModel$lambda-1  reason: not valid java name */
        public static final void m38buildItemModel$lambda1(RecentSpeakersFragment recentSpeakersFragment, i0.e.b.b3.b.e.m mVar, View view) {
            i.e(recentSpeakersFragment, "this$0");
            ((RecentSpeakersViewModel) recentSpeakersFragment.b2.getValue()).p(new i0.e.b.g3.v.g(mVar.g.getId().intValue()));
        }

        public t<?> buildItemModel(int i, i0.e.b.b3.b.e.m mVar) {
            if (mVar != null) {
                i0.e.b.f3.m.b.c cVar = new i0.e.b.f3.m.b.c();
                cVar.t(mVar.g.getId());
                UserInList userInList = mVar.g;
                cVar.w();
                cVar.j = userInList;
                boolean z = mVar.i;
                cVar.w();
                cVar.n = z;
                boolean z2 = mVar.j;
                cVar.w();
                cVar.p = z2;
                boolean z3 = mVar.h;
                cVar.w();
                cVar.q = z3;
                i0.e.b.g3.v.a aVar = new i0.e.b.g3.v.a(this.this$0, mVar);
                cVar.w();
                cVar.l = aVar;
                b bVar = new b(this.this$0, mVar);
                cVar.w();
                cVar.o = bVar;
                i.d(cVar, "FollowableListUser_()\n                .id(item.user.id)\n                .user(item.user)\n                .following(item.followedBySelf)\n                .blocked(item.blockedBySelf)\n                .self(item.isSelf)\n                .clickListener { _ ->\n                    navigateSafe(\n                        RecentSpeakersFragmentDirections.actionRecentSpeakersFragmentToProfileFragment(\n                            item.user.toProfileArgs(SourceLocation.RECENT_CHANNELS_SPEAKERS)\n                        )\n                    )\n                }\n                .followClickListener { _ ->\n                    viewModel.processIntent(ToggleFollowUser(item.user.id))\n                }");
                return cVar;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<RecentSpeakersFragment, RecentSpeakersViewModel> {
        public final /* synthetic */ m0.r.d a;
        public final /* synthetic */ l b;
        public final /* synthetic */ m0.r.d c;

        public a(m0.r.d dVar, boolean z, l lVar, m0.r.d dVar2) {
            this.a = dVar;
            this.b = lVar;
            this.c = dVar2;
        }

        public c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            i.e(fragment, "thisRef");
            i.e(kVar, "property");
            return i0.b.b.g.a.b(fragment, kVar, this.a, new RecentSpeakersFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(i0.e.b.g3.v.f.class), false, this.b);
        }
    }

    public RecentSpeakersFragment() {
        super(R.layout.fragment_recent_speakers);
        m0.r.d a3 = m.a(RecentSpeakersViewModel.class);
        this.b2 = new a(a3, false, new RecentSpeakersFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, Z1[1]);
        this.c2 = new PagingController(this);
    }

    public void J() {
        v.v2((RecentSpeakersViewModel) this.b2.getValue(), new RecentSpeakersFragment$invalidate$1(this));
    }

    public final FragmentRecentSpeakersBinding N0() {
        return (FragmentRecentSpeakersBinding) this.a2.getValue(this, Z1[0]);
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        N0().a.setOnClickListener(new i0.e.b.g3.v.c(this));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(v.f1(this.c2), new RecentSpeakersFragment$configurePagingController$1(this, (m0.l.c<? super RecentSpeakersFragment$configurePagingController$1>) null));
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, h0.q.q.a(viewLifecycleOwner));
        N0().b.setController(this.c2);
    }
}
