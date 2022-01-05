package com.clubhouse.android.ui.profile;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.airbnb.epoxy.paging3.PagingDataEpoxyController;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.databinding.FragmentFollowListBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.android.ui.clubs.ClubArgs;
import com.clubhouse.app.R;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.b0.v;
import h0.q.p;
import h0.t.q;
import h0.v.a.g;
import i0.b.a.t;
import i0.e.b.b3.b.e.e;
import i0.e.b.b3.b.e.j;
import i0.e.b.f3.m.b.h;
import i0.e.b.g3.u.i4;
import i0.e.b.g3.u.j4;
import i0.e.b.g3.u.l;
import i0.e.b.g3.u.l4;
import i0.e.b.g3.u.n;
import i0.e.b.g3.u.o;
import i0.e.b.g3.u.p5;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001b\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\u000b8F@\u0006X\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00060\u0011R\u00020\u00008\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u001a\u001a\u00020\u00158F@\u0006X\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/clubhouse/android/ui/profile/FollowListFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/android/ui/profile/FollowListViewModel;", "b2", "Lm0/c;", "getViewModel", "()Lcom/clubhouse/android/ui/profile/FollowListViewModel;", "viewModel", "Lcom/clubhouse/android/ui/profile/FollowListFragment$FollowItemController;", "c2", "Lcom/clubhouse/android/ui/profile/FollowListFragment$FollowItemController;", "pagedController", "Lcom/clubhouse/android/databinding/FragmentFollowListBinding;", "a2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "N0", "()Lcom/clubhouse/android/databinding/FragmentFollowListBinding;", "binding", "<init>", "FollowItemController", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: FollowListFragment.kt */
public final class FollowListFragment extends Hilt_FollowListFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(FollowListFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentFollowListBinding;")), m.c(new PropertyReference1Impl(m.a(FollowListFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/profile/FollowListViewModel;"))};
    public final FragmentViewBindingDelegate a2 = new FragmentViewBindingDelegate(FragmentFollowListBinding.class, this);
    public final c b2;
    public final FollowItemController c2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/clubhouse/android/ui/profile/FollowListFragment$FollowItemController;", "Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "Li0/e/b/b3/b/e/j;", "", "currentPosition", "item", "Li0/b/a/t;", "buildItemModel", "(ILi0/e/b/b3/b/e/j;)Li0/b/a/t;", "<init>", "(Lcom/clubhouse/android/ui/profile/FollowListFragment;)V", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* compiled from: FollowListFragment.kt */
    public final class FollowItemController extends PagingDataEpoxyController<j> {
        public final /* synthetic */ FollowListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FollowItemController(FollowListFragment followListFragment) {
            super((Handler) null, (Handler) null, (g.e) null, 7, (f) null);
            i.e(followListFragment, "this$0");
            this.this$0 = followListFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: buildItemModel$lambda-0  reason: not valid java name */
        public static final void m34buildItemModel$lambda0(FollowListFragment followListFragment, j jVar, View view) {
            i.e(followListFragment, "this$0");
            ClubArgs clubArgs = new ClubArgs(Integer.valueOf(((e) jVar).b.x), (String) null, (String) null, false, false, SourceLocation.PROFILE, (Map) null, 94);
            i.e(clubArgs, "mavericksArg");
            v.a1(followListFragment, new i4(clubArgs), (q) null, 2);
        }

        /* access modifiers changed from: private */
        /* renamed from: buildItemModel$lambda-1  reason: not valid java name */
        public static final void m35buildItemModel$lambda1(FollowListFragment followListFragment, j jVar, View view) {
            i.e(followListFragment, "this$0");
            UserInList userInList = ((i0.e.b.b3.b.e.m) jVar).g;
            SourceLocation sourceLocation = SourceLocation.LIST;
            i.e(userInList, "<this>");
            i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
            ProfileArgs profileArgs = new ProfileArgs(userInList.getId(), (String) null, new BasicUser(userInList.getId().intValue(), userInList.getName(), userInList.C(), userInList.b()), false, (Uri) null, sourceLocation, (Map) null, 26);
            i.e(profileArgs, "mavericksArg");
            v.a1(followListFragment, new j4(profileArgs, (String) null), (q) null, 2);
        }

        /* access modifiers changed from: private */
        /* renamed from: buildItemModel$lambda-2  reason: not valid java name */
        public static final void m36buildItemModel$lambda2(FollowListFragment followListFragment, j jVar, View view) {
            i.e(followListFragment, "this$0");
            ((FollowListViewModel) followListFragment.b2.getValue()).p(new p5(((i0.e.b.b3.b.e.m) jVar).g.getId().intValue()));
        }

        public t<?> buildItemModel(int i, j jVar) {
            if (jVar == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            } else if (jVar instanceof e) {
                h hVar = new h();
                e eVar = (e) jVar;
                hVar.t(Integer.valueOf(eVar.b.x));
                ClubWithAdmin clubWithAdmin = eVar.b;
                hVar.w();
                hVar.j = clubWithAdmin;
                n nVar = new n(this.this$0, jVar);
                hVar.w();
                hVar.n = nVar;
                i.d(hVar, "ListClub_()\n                        .id(item.club.id)\n                        .club(item.club)\n                        .clickListener { _ ->\n                            navigateSafe(\n                                FollowListFragmentDirections\n                                    .actionFollowListFragmentToClubFragment(\n                                        ClubArgs(item.club.id, source = SourceLocation.PROFILE ))\n                            )\n                        }");
                return hVar;
            } else if (jVar instanceof i0.e.b.b3.b.e.m) {
                i0.e.b.f3.m.b.c cVar = new i0.e.b.f3.m.b.c();
                i0.e.b.b3.b.e.m mVar = (i0.e.b.b3.b.e.m) jVar;
                cVar.t(mVar.g.getId());
                UserInList userInList = mVar.g;
                cVar.w();
                cVar.j = userInList;
                String str = mVar.g.c;
                cVar.w();
                cVar.k = str;
                boolean z = mVar.i;
                cVar.w();
                cVar.n = z;
                boolean z2 = mVar.j;
                cVar.w();
                cVar.p = z2;
                boolean z3 = mVar.h;
                cVar.w();
                cVar.q = z3;
                i0.e.b.g3.u.m mVar2 = new i0.e.b.g3.u.m(this.this$0, jVar);
                cVar.w();
                cVar.l = mVar2;
                l lVar = new l(this.this$0, jVar);
                cVar.w();
                cVar.o = lVar;
                i.d(cVar, "FollowableListUser_()\n                        .id(item.user.id)\n                        .user(item.user)\n                        .userBio(item.user.bio)\n                        .following(item.followedBySelf)\n                        .blocked(item.blockedBySelf)\n                        .self(item.isSelf)\n                        .clickListener { _ ->\n                            navigateSafe(\n                                FollowListFragmentDirections\n                                    .actionFollowListFragmentToProfileFragment(item.user.toProfileArgs(\n                                        SourceLocation.LIST\n                                    ))\n                            )\n                        }\n                        .followClickListener { _ ->\n                            viewModel.processIntent(\n                                ToggleFollowUser(item.user.id)\n                            )\n                        }");
                return cVar;
            } else {
                throw new Throwable("Invalid item type");
            }
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends i0.b.b.h<FollowListFragment, FollowListViewModel> {
        public final /* synthetic */ d a;
        public final /* synthetic */ m0.n.a.l b;
        public final /* synthetic */ d c;

        public a(d dVar, boolean z, m0.n.a.l lVar, d dVar2) {
            this.a = dVar;
            this.b = lVar;
            this.c = dVar2;
        }

        public c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            i.e(fragment, "thisRef");
            i.e(kVar, "property");
            return i0.b.b.g.a.b(fragment, kVar, this.a, new FollowListFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(l4.class), false, this.b);
        }
    }

    public FollowListFragment() {
        super(R.layout.fragment_follow_list);
        d a3 = m.a(FollowListViewModel.class);
        this.b2 = new a(a3, false, new FollowListFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, Z1[1]);
        this.c2 = new FollowItemController(this);
    }

    public void J() {
        v.v2((FollowListViewModel) this.b2.getValue(), new FollowListFragment$invalidate$1(this));
    }

    public final FragmentFollowListBinding N0() {
        return (FragmentFollowListBinding) this.a2.getValue(this, Z1[0]);
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        N0().a.setOnClickListener(new o(this));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(v.f1(this.c2), new FollowListFragment$onViewCreated$2(this, (m0.l.c<? super FollowListFragment$onViewCreated$2>) null));
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, h0.q.q.a(viewLifecycleOwner));
        N0().c.setController(this.c2);
    }
}
