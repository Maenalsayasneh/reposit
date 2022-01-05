package com.clubhouse.android.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.airbnb.epoxy.paging3.PagingDataEpoxyController;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.databinding.FragmentActivityBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.android.ui.clubs.ClubArgs;
import com.clubhouse.android.ui.events.HalfEventArgs;
import com.clubhouse.android.ui.profile.FollowListArgs;
import com.clubhouse.android.ui.profile.FollowListType;
import com.clubhouse.android.ui.profile.ProfileArgs;
import com.clubhouse.app.R;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.b0.v;
import h0.t.q;
import h0.v.a.g;
import i0.b.a.t;
import i0.e.b.a3.f.e;
import i0.e.b.b3.a.a.e.b;
import i0.e.b.b3.a.a.e.d;
import i0.e.b.b3.a.a.e.j;
import i0.e.b.b3.a.a.e.n;
import i0.e.b.b3.a.a.e.o;
import i0.e.b.b3.a.a.e.p;
import i0.e.b.b3.b.e.i;
import i0.e.b.g3.j.a0;
import i0.e.b.g3.j.b0;
import i0.e.b.g3.j.d0;
import i0.e.b.g3.j.l0.h;
import i0.e.b.g3.j.x;
import i0.e.b.g3.j.z;
import j$.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.m;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001b\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00060\u000bR\u00020\u00008\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u0014\u001a\u00020\u000f8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u001a\u001a\u00020\u00158F@\u0006X\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/clubhouse/android/ui/activity/ActivityFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/android/ui/activity/ActivityFragment$ActivityItemController;", "c2", "Lcom/clubhouse/android/ui/activity/ActivityFragment$ActivityItemController;", "pagedController", "Lcom/clubhouse/android/ui/activity/ActivityViewModel;", "b2", "Lm0/c;", "O0", "()Lcom/clubhouse/android/ui/activity/ActivityViewModel;", "viewModel", "Lcom/clubhouse/android/databinding/FragmentActivityBinding;", "a2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "N0", "()Lcom/clubhouse/android/databinding/FragmentActivityBinding;", "binding", "<init>", "ActivityItemController", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: ActivityFragment.kt */
public final class ActivityFragment extends Hilt_ActivityFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(ActivityFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentActivityBinding;")), m.c(new PropertyReference1Impl(m.a(ActivityFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/activity/ActivityViewModel;"))};
    public final FragmentViewBindingDelegate a2 = new FragmentViewBindingDelegate(FragmentActivityBinding.class, this);
    public final c b2;
    public final ActivityItemController c2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\u0010\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/clubhouse/android/ui/activity/ActivityFragment$ActivityItemController;", "Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "Li0/e/b/b3/b/e/i;", "item", "Lm0/i;", "handleAvatarSelected", "(Li0/e/b/b3/b/e/i;)V", "handleActivityItemSelected", "", "Li0/b/a/t;", "models", "addModels", "(Ljava/util/List;)V", "", "currentPosition", "buildItemModel", "(ILi0/e/b/b3/b/e/i;)Li0/b/a/t;", "<init>", "(Lcom/clubhouse/android/ui/activity/ActivityFragment;)V", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* compiled from: ActivityFragment.kt */
    public final class ActivityItemController extends PagingDataEpoxyController<i> {
        public final /* synthetic */ ActivityFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ActivityItemController(ActivityFragment activityFragment) {
            super((Handler) null, (Handler) null, (g.e) null, 7, (f) null);
            m0.n.b.i.e(activityFragment, "this$0");
            this.this$0 = activityFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: buildItemModel$lambda-0  reason: not valid java name */
        public static final void m19buildItemModel$lambda0(ActivityItemController activityItemController, i iVar, View view) {
            m0.n.b.i.e(activityItemController, "this$0");
            activityItemController.handleAvatarSelected(iVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: buildItemModel$lambda-1  reason: not valid java name */
        public static final void m20buildItemModel$lambda1(ActivityItemController activityItemController, i iVar, View view) {
            m0.n.b.i.e(activityItemController, "this$0");
            activityItemController.handleActivityItemSelected(iVar);
        }

        private final void handleActivityItemSelected(i iVar) {
            i0.e.b.b3.a.a.e.k kVar = iVar.j;
            if (kVar instanceof o) {
                Context requireContext = this.this$0.requireContext();
                m0.n.b.i.d(requireContext, "requireContext()");
                e.a(requireContext, ((o) kVar).a);
            } else if (kVar instanceof b) {
                ActivityFragment activityFragment = this.this$0;
                String str = ((b) kVar).a;
                m0.n.b.i.e(activityFragment, "<this>");
                m0.n.b.i.e(str, "channelId");
                v.a1(activityFragment, new a0(str, (String) null, (String) null, (String) null, SourceLocation.ACTIVITY.getCode()), (q) null, 2);
            } else if (kVar instanceof d) {
                ActivityFragment activityFragment2 = this.this$0;
                int i = ((d) kVar).a;
                m0.n.b.i.e(activityFragment2, "<this>");
                ClubArgs clubArgs = new ClubArgs(Integer.valueOf(i), (String) null, (String) null, false, false, SourceLocation.ACTIVITY, (Map) null, 94);
                m0.n.b.i.e(clubArgs, "mavericksArg");
                v.a1(activityFragment2, new i0.e.b.g3.j.v(clubArgs), (q) null, 2);
            } else if (kVar instanceof i0.e.b.b3.a.a.e.q) {
                ActivityFragment activityFragment3 = this.this$0;
                BasicUser basicUser = ((i0.e.b.b3.a.a.e.q) kVar).a;
                SourceLocation sourceLocation = SourceLocation.ACTIVITY;
                m0.n.b.i.e(activityFragment3, "<this>");
                m0.n.b.i.e(basicUser, "user");
                m0.n.b.i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
                m0.n.b.i.e(basicUser, "<this>");
                m0.n.b.i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
                ProfileArgs profileArgs = new ProfileArgs(basicUser.getId(), (String) null, new BasicUser(basicUser.getId().intValue(), basicUser.getName(), basicUser.C(), basicUser.b()), false, (Uri) null, sourceLocation, (Map) null, 26);
                m0.n.b.i.e(profileArgs, "mavericksArg");
                v.a1(activityFragment3, new b0(profileArgs, (String) null), (q) null, 2);
            } else if (kVar instanceof i0.e.b.b3.a.a.e.e) {
                ActivityFragment activityFragment4 = this.this$0;
                int i2 = ((i0.e.b.b3.a.a.e.e) kVar).a;
                m0.n.b.i.e(activityFragment4, "<this>");
                HalfEventArgs halfEventArgs = new HalfEventArgs((String) null, Integer.valueOf(i2), (String) null, (String) null, (EventInClub) null, (SourceLocation) null, (Map) null, 125);
                m0.n.b.i.e(halfEventArgs, "mavericksArg");
                v.a1(activityFragment4, new z(halfEventArgs), (q) null, 2);
            } else if (kVar instanceof i0.e.b.b3.a.a.e.f) {
                ActivityFragment activityFragment5 = this.this$0;
                long j = ((i0.e.b.b3.a.a.e.f) kVar).a;
                m0.n.b.i.e(activityFragment5, "<this>");
                FollowListArgs followListArgs = new FollowListArgs(0, j, FollowListType.FROM_NOTIFICATION, 1);
                m0.n.b.i.e(followListArgs, "mavericksArg");
                v.a1(activityFragment5, new x(followListArgs), (q) null, 2);
            } else if (kVar instanceof n) {
                ActivityFragment activityFragment6 = this.this$0;
                String string = activityFragment6.getString(R.string.clubhouse_twitter_link);
                m0.n.b.i.e(activityFragment6, "<this>");
                Context requireContext2 = activityFragment6.requireContext();
                m0.n.b.i.d(requireContext2, "requireContext()");
                m0.n.b.i.e(requireContext2, "<this>");
                if (string != null) {
                    requireContext2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string)));
                }
            } else if (kVar instanceof i0.e.b.b3.a.a.e.m) {
                ActivityFragment activityFragment7 = this.this$0;
                m0.n.b.i.e(activityFragment7, "<this>");
                v.a1(activityFragment7, new h0.t.a(R.id.action_activityFragment_to_recentPaymentsFragment), (q) null, 2);
            }
        }

        private final void handleAvatarSelected(i iVar) {
            j jVar = iVar.c;
            if (jVar instanceof p) {
                ActivityFragment activityFragment = this.this$0;
                BasicUser basicUser = ((p) jVar).a;
                SourceLocation sourceLocation = SourceLocation.ACTIVITY;
                m0.n.b.i.e(activityFragment, "<this>");
                m0.n.b.i.e(basicUser, "user");
                m0.n.b.i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
                m0.n.b.i.e(basicUser, "<this>");
                m0.n.b.i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
                ProfileArgs profileArgs = new ProfileArgs(basicUser.getId(), (String) null, new BasicUser(basicUser.getId().intValue(), basicUser.getName(), basicUser.C(), basicUser.b()), false, (Uri) null, sourceLocation, (Map) null, 26);
                m0.n.b.i.e(profileArgs, "mavericksArg");
                v.a1(activityFragment, new b0(profileArgs, (String) null), (q) null, 2);
            } else if (jVar instanceof i0.e.b.b3.a.a.e.c) {
                ActivityFragment activityFragment2 = this.this$0;
                int i = ((i0.e.b.b3.a.a.e.c) jVar).a;
                m0.n.b.i.e(activityFragment2, "<this>");
                ClubArgs clubArgs = new ClubArgs(Integer.valueOf(i), (String) null, (String) null, false, false, SourceLocation.ACTIVITY, (Map) null, 94);
                m0.n.b.i.e(clubArgs, "mavericksArg");
                v.a1(activityFragment2, new i0.e.b.g3.j.v(clubArgs), (q) null, 2);
            }
        }

        public void addModels(List<? extends t<?>> list) {
            m0.n.b.i.e(list, "models");
            ActivityFragment activityFragment = this.this$0;
            k<Object>[] kVarArr = ActivityFragment.Z1;
            v.v2(activityFragment.O0(), new ActivityFragment$buildActionableNotifications$1(this, activityFragment));
            ActivityFragment activityFragment2 = this.this$0;
            v.v2(activityFragment2.O0(), new ActivityFragment$buildOnClubhouseNotifications$1(this, activityFragment2));
            super.addModels(list);
        }

        public t<?> buildItemModel(int i, i iVar) {
            if (iVar != null) {
                h hVar = new h();
                hVar.t(iVar.b);
                String str = iVar.e;
                hVar.w();
                hVar.j = str;
                String str2 = iVar.f;
                hVar.w();
                hVar.k = str2;
                String str3 = iVar.g;
                hVar.w();
                hVar.l = str3;
                OffsetDateTime offsetDateTime = iVar.h;
                hVar.w();
                hVar.m = offsetDateTime;
                Boolean bool = iVar.i;
                hVar.w();
                hVar.n = bool;
                i0.e.b.g3.j.c cVar = new i0.e.b.g3.j.c(this, iVar);
                hVar.w();
                hVar.o = cVar;
                i0.e.b.g3.j.d dVar = new i0.e.b.g3.j.d(this, iVar);
                hVar.w();
                hVar.p = dVar;
                m0.n.b.i.d(hVar, "ActivityItem_()\n                .id(item.id)\n                .photoUrl(item.photoUrl)\n                .name(item.name)\n                .message(item.message)\n                .timeCreated(item.timeCreated)\n                .unread(item.isUnread)\n                .avatarClickListener { _ -> handleAvatarSelected(item) }\n                .clickListener { _ -> handleActivityItemSelected(item) }");
                return hVar;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends i0.b.b.h<ActivityFragment, ActivityViewModel> {
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
            m0.n.b.i.e(fragment, "thisRef");
            m0.n.b.i.e(kVar, "property");
            return i0.b.b.g.a.b(fragment, kVar, this.a, new ActivityFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(d0.class), false, this.b);
        }
    }

    public ActivityFragment() {
        super(R.layout.fragment_activity);
        m0.r.d a3 = m.a(ActivityViewModel.class);
        this.b2 = new a(a3, false, new ActivityFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, Z1[1]);
        this.c2 = new ActivityItemController(this);
    }

    public void J() {
        v.v2(O0(), new ActivityFragment$invalidate$1(this));
    }

    public final FragmentActivityBinding N0() {
        return (FragmentActivityBinding) this.a2.getValue(this, Z1[0]);
    }

    public final ActivityViewModel O0() {
        return (ActivityViewModel) this.b2.getValue();
    }

    public void onViewCreated(View view, Bundle bundle) {
        m0.n.b.i.e(view, "view");
        super.onViewCreated(view, bundle);
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(O0().l, new ActivityFragment$onViewCreated$1(this, (m0.l.c<? super ActivityFragment$onViewCreated$1>) null));
        h0.q.p viewLifecycleOwner = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, h0.q.q.a(viewLifecycleOwner));
        N0().b.setOnClickListener(new i0.e.b.g3.j.b(this));
        N0().c.setProgressBackgroundColorSchemeColor(h0.i.b.a.getColor(requireContext(), R.color.clubhouse_eggshell));
        N0().c.setOnRefreshListener(new i0.e.b.g3.j.a(this));
        ActivityItemController activityItemController = this.c2;
        EpoxyRecyclerView epoxyRecyclerView = N0().a;
        m0.n.b.i.d(epoxyRecyclerView, "binding.activityList");
        v.T1(activityItemController, epoxyRecyclerView);
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$12 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(v.f1(this.c2), new ActivityFragment$configurePagingController$1(this, (m0.l.c<? super ActivityFragment$configurePagingController$1>) null));
        h0.q.p viewLifecycleOwner2 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner2, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$12, h0.q.q.a(viewLifecycleOwner2));
        N0().a.setController(this.c2);
        N0().a.setItemAnimator((RecyclerView.k) null);
    }
}
