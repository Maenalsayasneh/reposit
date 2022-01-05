package com.clubhouse.android.ui.clubs;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.paging3.PagingDataEpoxyController;
import com.clubhouse.android.databinding.FragmentClubMemberSearchBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import h0.v.a.g;
import i0.b.a.t;
import i0.b.b.h;
import i0.e.b.g3.l.r0;
import i0.e.b.g3.l.s1;
import i0.e.b.g3.l.u0;
import i0.e.b.g3.l.v0;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b!\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00060\u0017R\u00020\u00008\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010 \u001a\u00020\u001b8\u0016@\u0016XD¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lcom/clubhouse/android/ui/clubs/ClubMemberSearchFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/android/databinding/FragmentClubMemberSearchBinding;", "c2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "N0", "()Lcom/clubhouse/android/databinding/FragmentClubMemberSearchBinding;", "binding", "Lcom/clubhouse/android/ui/clubs/ClubMemberSearchViewModel;", "d2", "Lm0/c;", "O0", "()Lcom/clubhouse/android/ui/clubs/ClubMemberSearchViewModel;", "viewModel", "Lcom/clubhouse/android/ui/clubs/ClubMemberSearchFragment$ClubMemberItemController;", "e2", "Lcom/clubhouse/android/ui/clubs/ClubMemberSearchFragment$ClubMemberItemController;", "pagedController", "", "f2", "Z", "K0", "()Z", "shouldShowKeyboard", "<init>", "Z1", "ClubMemberItemController", "a", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: ClubMemberSearchFragment.kt */
public final class ClubMemberSearchFragment extends Hilt_ClubMemberSearchFragment {
    public static final a Z1 = new a((f) null);
    public static final /* synthetic */ k<Object>[] a2 = {m.c(new PropertyReference1Impl(m.a(ClubMemberSearchFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentClubMemberSearchBinding;")), m.c(new PropertyReference1Impl(m.a(ClubMemberSearchFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/clubs/ClubMemberSearchViewModel;"))};
    public static final String b2 = "ClubMemberSearch";
    public final FragmentViewBindingDelegate c2 = new FragmentViewBindingDelegate(FragmentClubMemberSearchBinding.class, this);
    public final c d2;
    public final ClubMemberItemController e2;
    public final boolean f2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/clubhouse/android/ui/clubs/ClubMemberSearchFragment$ClubMemberItemController;", "Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "Li0/e/b/b3/b/e/f;", "", "currentPosition", "item", "Li0/b/a/t;", "buildItemModel", "(ILi0/e/b/b3/b/e/f;)Li0/b/a/t;", "<init>", "(Lcom/clubhouse/android/ui/clubs/ClubMemberSearchFragment;)V", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* compiled from: ClubMemberSearchFragment.kt */
    public final class ClubMemberItemController extends PagingDataEpoxyController<i0.e.b.b3.b.e.f> {
        public final /* synthetic */ ClubMemberSearchFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ClubMemberItemController(ClubMemberSearchFragment clubMemberSearchFragment) {
            super((Handler) null, (Handler) null, (g.e) null, 7, (f) null);
            i.e(clubMemberSearchFragment, "this$0");
            this.this$0 = clubMemberSearchFragment;
        }

        public t<?> buildItemModel(int i, i0.e.b.b3.b.e.f fVar) {
            if (fVar != null) {
                ClubMemberSearchFragment clubMemberSearchFragment = this.this$0;
                a aVar = ClubMemberSearchFragment.Z1;
                Object v2 = v.v2(clubMemberSearchFragment.O0(), new ClubMemberSearchFragment$ClubMemberItemController$buildItemModel$1(fVar, this.this$0));
                i.d(v2, "buildItemModel");
                return (t) v2;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* compiled from: ClubMemberSearchFragment.kt */
    public static final class a {
        public a(f fVar) {
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class b extends h<ClubMemberSearchFragment, ClubMemberSearchViewModel> {
        public final /* synthetic */ d a;
        public final /* synthetic */ l b;
        public final /* synthetic */ d c;

        public b(d dVar, boolean z, l lVar, d dVar2) {
            this.a = dVar;
            this.b = lVar;
            this.c = dVar2;
        }

        public c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            i.e(fragment, "thisRef");
            i.e(kVar, "property");
            return i0.b.b.g.a.b(fragment, kVar, this.a, new ClubMemberSearchFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(s1.class), false, this.b);
        }
    }

    public ClubMemberSearchFragment() {
        super(R.layout.fragment_club_member_search);
        d a3 = m.a(ClubMemberSearchViewModel.class);
        this.d2 = new b(a3, false, new ClubMemberSearchFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, a2[1]);
        this.e2 = new ClubMemberItemController(this);
        this.f2 = true;
    }

    public void J() {
        v.v2(O0(), new ClubMemberSearchFragment$invalidate$1(this));
    }

    public boolean K0() {
        return this.f2;
    }

    public final FragmentClubMemberSearchBinding N0() {
        return (FragmentClubMemberSearchBinding) this.c2.getValue(this, a2[0]);
    }

    public final ClubMemberSearchViewModel O0() {
        return (ClubMemberSearchViewModel) this.d2.getValue();
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        v.V1(this, b2, Boolean.TRUE);
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(O0().l, new ClubMemberSearchFragment$onViewCreated$1(this, (m0.l.c<? super ClubMemberSearchFragment$onViewCreated$1>) null));
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner));
        N0().a.setOnClickListener(new r0(this));
        N0().f.setOnFocusChangeListener(new u0(this));
        EditText editText = N0().f;
        i.d(editText, "binding.search");
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$12 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(i0.e.b.d3.k.f(editText), new ClubMemberSearchFragment$onViewCreated$4(this, (m0.l.c<? super ClubMemberSearchFragment$onViewCreated$4>) null));
        p viewLifecycleOwner2 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner2, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$12, q.a(viewLifecycleOwner2));
        N0().b.setOnClickListener(new v0(this));
        N0().e.setItemAnimator((RecyclerView.k) null);
        N0().e.setController(this.e2);
    }
}
