package com.clubhouse.android.ui.clubs.invites;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.airbnb.epoxy.paging3.PagingDataEpoxyController;
import com.airbnb.mvrx.DeliveryMode;
import com.clubhouse.android.databinding.FragmentGrowClubBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.android.ui.clubs.ClubViewModel;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import h0.v.a.g;
import i0.b.a.t;
import i0.b.b.h;
import i0.b.b.i;
import i0.e.b.b3.b.e.j;
import i0.e.b.g3.l.v1;
import i0.e.b.g3.l.x2.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.m;
import m0.o.c;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u000234B\u0007¢\u0006\u0004\b2\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00060\u0017R\u00020\u00008\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u00060\u001bR\u00020\u00008\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\u00020\u001f8B@\u0002X\u0002¢\u0006\f\n\u0004\b \u0010\r\u001a\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001d\u00101\u001a\u00020,8B@\u0002X\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00065"}, d2 = {"Lcom/clubhouse/android/ui/clubs/invites/GrowClubFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/android/ui/clubs/invites/GrowClubViewModel;", "f2", "Lm0/c;", "R0", "()Lcom/clubhouse/android/ui/clubs/invites/GrowClubViewModel;", "viewModel", "Lcom/clubhouse/android/databinding/FragmentGrowClubBinding;", "c2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "P0", "()Lcom/clubhouse/android/databinding/FragmentGrowClubBinding;", "binding", "Lcom/clubhouse/android/ui/clubs/invites/GrowClubFragment$SearchPagingController;", "e2", "Lcom/clubhouse/android/ui/clubs/invites/GrowClubFragment$SearchPagingController;", "searchController", "Lcom/clubhouse/android/ui/clubs/invites/GrowClubFragment$RecommendationPagingController;", "d2", "Lcom/clubhouse/android/ui/clubs/invites/GrowClubFragment$RecommendationPagingController;", "recommendationController", "Lcom/clubhouse/android/ui/clubs/ClubViewModel;", "g2", "Q0", "()Lcom/clubhouse/android/ui/clubs/ClubViewModel;", "clubViewModel", "Li0/e/a/b/a;", "a2", "Li0/e/a/b/a;", "getActionTrailRecorder", "()Li0/e/a/b/a;", "setActionTrailRecorder", "(Li0/e/a/b/a;)V", "actionTrailRecorder", "Lcom/clubhouse/android/ui/clubs/invites/GrowClubArgs;", "b2", "Lm0/o/c;", "O0", "()Lcom/clubhouse/android/ui/clubs/invites/GrowClubArgs;", "args", "<init>", "RecommendationPagingController", "SearchPagingController", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: GrowClubFragment.kt */
public final class GrowClubFragment extends Hilt_GrowClubFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(GrowClubFragment.class), "args", "getArgs()Lcom/clubhouse/android/ui/clubs/invites/GrowClubArgs;")), m.c(new PropertyReference1Impl(m.a(GrowClubFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentGrowClubBinding;")), m.c(new PropertyReference1Impl(m.a(GrowClubFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/clubs/invites/GrowClubViewModel;")), m.c(new PropertyReference1Impl(m.a(GrowClubFragment.class), "clubViewModel", "getClubViewModel()Lcom/clubhouse/android/ui/clubs/ClubViewModel;"))};
    public i0.e.a.b.a a2;
    public final c b2 = new i();
    public final FragmentViewBindingDelegate c2 = new FragmentViewBindingDelegate(FragmentGrowClubBinding.class, this);
    public final RecommendationPagingController d2 = new RecommendationPagingController(this);
    public final SearchPagingController e2 = new SearchPagingController(this);
    public final m0.c f2;
    public final m0.c g2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0007\u001a\u00020\u00062\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/clubhouse/android/ui/clubs/invites/GrowClubFragment$RecommendationPagingController;", "Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "Li0/e/b/b3/b/e/j;", "", "Li0/b/a/t;", "models", "Lm0/i;", "addModels", "(Ljava/util/List;)V", "", "currentPosition", "item", "buildItemModel", "(ILi0/e/b/b3/b/e/j;)Li0/b/a/t;", "<init>", "(Lcom/clubhouse/android/ui/clubs/invites/GrowClubFragment;)V", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* compiled from: GrowClubFragment.kt */
    public final class RecommendationPagingController extends PagingDataEpoxyController<j> {
        public final /* synthetic */ GrowClubFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RecommendationPagingController(GrowClubFragment growClubFragment) {
            super((Handler) null, (Handler) null, (g.e) null, 7, (f) null);
            m0.n.b.i.e(growClubFragment, "this$0");
            this.this$0 = growClubFragment;
        }

        public void addModels(List<? extends t<?>> list) {
            m0.n.b.i.e(list, "models");
            GrowClubFragment growClubFragment = this.this$0;
            k<Object>[] kVarArr = GrowClubFragment.Z1;
            v.u2(growClubFragment.Q0(), this.this$0.R0(), new GrowClubFragment$RecommendationPagingController$addModels$1(this, this.this$0));
            super.addModels(list);
        }

        public t<?> buildItemModel(int i, j jVar) {
            GrowClubFragment growClubFragment = this.this$0;
            Objects.requireNonNull(jVar, "null cannot be cast to non-null type com.clubhouse.android.data.network.paging.UserItem");
            i0.e.b.g3.l.x2.j N0 = GrowClubFragment.N0(growClubFragment, (i0.e.b.b3.b.e.m) jVar);
            m0.n.b.i.d(N0, "buildUser(item as UserItem)");
            return N0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/clubhouse/android/ui/clubs/invites/GrowClubFragment$SearchPagingController;", "Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "Li0/e/b/b3/b/e/j;", "", "currentPosition", "item", "Li0/b/a/t;", "buildItemModel", "(ILi0/e/b/b3/b/e/j;)Li0/b/a/t;", "<init>", "(Lcom/clubhouse/android/ui/clubs/invites/GrowClubFragment;)V", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* compiled from: GrowClubFragment.kt */
    public final class SearchPagingController extends PagingDataEpoxyController<j> {
        public final /* synthetic */ GrowClubFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SearchPagingController(GrowClubFragment growClubFragment) {
            super((Handler) null, (Handler) null, (g.e) null, 7, (f) null);
            m0.n.b.i.e(growClubFragment, "this$0");
            this.this$0 = growClubFragment;
        }

        public t<?> buildItemModel(int i, j jVar) {
            GrowClubFragment growClubFragment = this.this$0;
            Objects.requireNonNull(jVar, "null cannot be cast to non-null type com.clubhouse.android.data.network.paging.UserItem");
            i0.e.b.g3.l.x2.j N0 = GrowClubFragment.N0(growClubFragment, (i0.e.b.b3.b.e.m) jVar);
            m0.n.b.i.d(N0, "buildUser(item as UserItem)");
            return N0;
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<GrowClubFragment, GrowClubViewModel> {
        public final /* synthetic */ d a;
        public final /* synthetic */ l b;
        public final /* synthetic */ d c;

        public a(d dVar, boolean z, l lVar, d dVar2) {
            this.a = dVar;
            this.b = lVar;
            this.c = dVar2;
        }

        public m0.c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            m0.n.b.i.e(fragment, "thisRef");
            m0.n.b.i.e(kVar, "property");
            return i0.b.b.g.a.b(fragment, kVar, this.a, new GrowClubFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(i0.e.b.g3.l.x2.t.class), false, this.b);
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class b extends h<GrowClubFragment, ClubViewModel> {
        public final /* synthetic */ d a;
        public final /* synthetic */ l b;
        public final /* synthetic */ d c;

        public b(d dVar, boolean z, l lVar, d dVar2) {
            this.a = dVar;
            this.b = lVar;
            this.c = dVar2;
        }

        public m0.c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            m0.n.b.i.e(fragment, "thisRef");
            m0.n.b.i.e(kVar, "property");
            return i0.b.b.g.a.b(fragment, kVar, this.a, new GrowClubFragment$special$$inlined$fragmentViewModel$default$4$1(this), m.a(v1.class), false, this.b);
        }
    }

    public GrowClubFragment() {
        super(R.layout.fragment_grow_club);
        d a3 = m.a(GrowClubViewModel.class);
        a aVar = new a(a3, false, new GrowClubFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3);
        k<Object>[] kVarArr = Z1;
        this.f2 = aVar.a(this, kVarArr[2]);
        d a4 = m.a(ClubViewModel.class);
        this.g2 = new b(a4, false, new GrowClubFragment$special$$inlined$fragmentViewModel$default$3(this, a4, a4), a4).a(this, kVarArr[3]);
    }

    public static final i0.e.b.g3.l.x2.j N0(GrowClubFragment growClubFragment, i0.e.b.b3.b.e.m mVar) {
        int ordinal = growClubFragment.O0().d.ordinal();
        if (ordinal == 0) {
            return (i0.e.b.g3.l.x2.j) v.v2(growClubFragment.R0(), new GrowClubFragment$buildUser$1(mVar, growClubFragment));
        }
        if (ordinal == 1) {
            return (i0.e.b.g3.l.x2.j) v.u2(growClubFragment.Q0(), growClubFragment.R0(), new GrowClubFragment$buildUser$2(mVar, growClubFragment));
        }
        throw new NoWhenBranchMatchedException();
    }

    public void J() {
        v.u2(Q0(), R0(), new GrowClubFragment$invalidate$1(this));
    }

    public final GrowClubArgs O0() {
        return (GrowClubArgs) this.b2.getValue(this, Z1[0]);
    }

    public final FragmentGrowClubBinding P0() {
        return (FragmentGrowClubBinding) this.c2.getValue(this, Z1[1]);
    }

    public final ClubViewModel Q0() {
        return (ClubViewModel) this.g2.getValue();
    }

    public final GrowClubViewModel R0() {
        return (GrowClubViewModel) this.f2.getValue();
    }

    public void onViewCreated(View view, Bundle bundle) {
        m0.n.b.i.e(view, "view");
        super.onViewCreated(view, bundle);
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        m0.n.b.i.d(onBackPressedDispatcher, "requireActivity().onBackPressedDispatcher");
        g0.a.b.b.a.a(onBackPressedDispatcher, this, false, new GrowClubFragment$onViewCreated$1(this), 2);
        P0().a.setOnClickListener(new i0.e.b.g3.l.x2.g(this));
        TextView textView = P0().b;
        m0.n.b.i.d(textView, "binding.done");
        GrowClubSource growClubSource = O0().q;
        GrowClubSource growClubSource2 = GrowClubSource.CLUB_CREATION;
        i0.e.b.d3.k.L(textView, Boolean.valueOf(growClubSource == growClubSource2));
        P0().b.setOnClickListener(new i0.e.b.g3.l.x2.h(this));
        if (O0().q == growClubSource2) {
            TextView textView2 = P0().d;
            m0.n.b.i.d(textView2, "binding.inviteMessage");
            i0.e.b.d3.k.K(textView2);
            TextView textView3 = P0().d;
            Resources resources = getResources();
            m0.n.b.i.d(resources, "resources");
            ArrayList i1 = i0.d.a.a.a.i1(resources, "<this>", new Object[0], "rawArgs", 0);
            String string = resources.getString(R.string.club_invite_message);
            m0.n.b.i.d(string, "getString(id)");
            Object[] array = i1.toArray(new Object[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Object[] copyOf = Arrays.copyOf(array, array.length);
            String format = String.format(string, Arrays.copyOf(copyOf, copyOf.length));
            m0.n.b.i.d(format, "java.lang.String.format(format, *args)");
            Spanned fromHtml = Html.fromHtml(format, 63);
            m0.n.b.i.d(fromHtml, "fromHtml(\n            String.format(getString(id), *args.toTypedArray()),\n            HtmlCompat.FROM_HTML_MODE_COMPACT\n        )");
            textView3.setText(fromHtml);
        }
        P0().f.setController(this.d2);
        EditText editText = P0().g;
        m0.n.b.i.d(editText, "binding.search");
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(i0.e.b.d3.k.f(editText), new GrowClubFragment$onViewCreated$4(this, (m0.l.c<? super GrowClubFragment$onViewCreated$4>) null));
        p viewLifecycleOwner = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$12 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(R0().l, new GrowClubFragment$onViewCreated$5(this, (m0.l.c<? super GrowClubFragment$onViewCreated$5>) null));
        p viewLifecycleOwner2 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner2, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$12, q.a(viewLifecycleOwner2));
        v.l1(this, R0(), GrowClubFragment$onViewCreated$6.c, (DeliveryMode) null, new GrowClubFragment$onViewCreated$7(this, (m0.l.c<? super GrowClubFragment$onViewCreated$7>) null), 2, (Object) null);
        v.l1(this, R0(), GrowClubFragment$onViewCreated$8.c, (DeliveryMode) null, new GrowClubFragment$onViewCreated$9(this, (m0.l.c<? super GrowClubFragment$onViewCreated$9>) null), 2, (Object) null);
        SearchPagingController searchPagingController = this.e2;
        EpoxyRecyclerView epoxyRecyclerView = P0().f;
        m0.n.b.i.d(epoxyRecyclerView, "binding.resultsList");
        v.S1(searchPagingController, epoxyRecyclerView);
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$13 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(v.f1(this.e2), new GrowClubFragment$onViewCreated$10(this, (m0.l.c<? super GrowClubFragment$onViewCreated$10>) null));
        p viewLifecycleOwner3 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner3, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$13, q.a(viewLifecycleOwner3));
        R0().p(u.a);
    }
}
