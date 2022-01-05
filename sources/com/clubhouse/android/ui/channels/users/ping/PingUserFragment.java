package com.clubhouse.android.ui.channels.users.ping;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import com.airbnb.epoxy.paging3.PagingDataEpoxyController;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.shared.ui.AbstractUserFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import h0.v.a.g;
import i0.b.a.t;
import i0.b.b.h;
import i0.e.b.b3.b.e.m;
import i0.e.b.g3.k.w0.b.j;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b'\u0010\fJ!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fR.\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00118\u0014@\u0014X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001e\u001a\u00020\u00198B@\u0002X\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/clubhouse/android/ui/channels/users/ping/PingUserFragment;", "Lcom/clubhouse/android/shared/ui/AbstractUserFragment;", "Li0/e/b/a3/d/a;", "Li0/e/b/b3/b/e/m;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "U0", "()V", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;", "Q0", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;", "J", "Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "u2", "Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "T0", "()Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "setPagedController", "(Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;)V", "pagedController", "Lcom/clubhouse/android/ui/channels/users/ping/PingUserViewModel;", "t2", "Lm0/c;", "Y0", "()Lcom/clubhouse/android/ui/channels/users/ping/PingUserViewModel;", "viewModel", "Li0/e/a/b/a;", "s2", "Li0/e/a/b/a;", "getActionTrailRecorder", "()Li0/e/a/b/a;", "setActionTrailRecorder", "(Li0/e/a/b/a;)V", "actionTrailRecorder", "<init>", "UserController", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: PingUserFragment.kt */
public final class PingUserFragment extends AbstractUserFragment<i0.e.b.a3.d.a<m>> {
    public static final /* synthetic */ k<Object>[] r2 = {m0.n.b.m.c(new PropertyReference1Impl(m0.n.b.m.a(PingUserFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/channels/users/ping/PingUserViewModel;"))};
    public i0.e.a.b.a s2;
    public final c t2;
    public PagingDataEpoxyController<i0.e.b.a3.d.a<m>> u2 = new UserController(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/clubhouse/android/ui/channels/users/ping/PingUserFragment$UserController;", "Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "Li0/e/b/a3/d/a;", "Li0/e/b/b3/b/e/m;", "", "currentPosition", "item", "Li0/b/a/t;", "buildItemModel", "(ILi0/e/b/a3/d/a;)Li0/b/a/t;", "<init>", "(Lcom/clubhouse/android/ui/channels/users/ping/PingUserFragment;)V", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* compiled from: PingUserFragment.kt */
    public final class UserController extends PagingDataEpoxyController<i0.e.b.a3.d.a<m>> {
        public final /* synthetic */ PingUserFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UserController(PingUserFragment pingUserFragment) {
            super((Handler) null, (Handler) null, (g.e) null, 7, (f) null);
            i.e(pingUserFragment, "this$0");
            this.this$0 = pingUserFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: buildItemModel$lambda-0  reason: not valid java name */
        public static final void m23buildItemModel$lambda0(i0.e.b.a3.d.a aVar, PingUserFragment pingUserFragment, View view) {
            i.e(pingUserFragment, "this$0");
            if (!aVar.b) {
                k<Object>[] kVarArr = PingUserFragment.r2;
                pingUserFragment.Y0().p(new i0.e.b.g3.k.w0.b.g((m) aVar.a));
            }
        }

        public t<?> buildItemModel(int i, i0.e.b.a3.d.a<m> aVar) {
            if (aVar != null) {
                j jVar = new j();
                jVar.t(((m) aVar.a).g.getId());
                UserInList userInList = ((m) aVar.a).g;
                jVar.w();
                jVar.j = userInList;
                boolean z = aVar.b;
                jVar.w();
                jVar.k = z;
                i0.e.b.g3.k.w0.b.a aVar2 = new i0.e.b.g3.k.w0.b.a(aVar, this.this$0);
                jVar.w();
                jVar.m = aVar2;
                i.d(jVar, "SelectableUser_()\n                .id(item.item.user.id)\n                .user(item.item.user)\n                .selected(item.selected)\n                .clickListener { _ ->\n                    if (!item.selected) {\n                        viewModel.processIntent(SelectUser(item.item))\n                    }\n                }");
                return jVar;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* compiled from: PingUserFragment.kt */
    public static final class a extends BottomSheetBehavior.c {
        public final /* synthetic */ PingUserFragment a;

        public a(PingUserFragment pingUserFragment) {
            this.a = pingUserFragment;
        }

        public void onSlide(View view, float f) {
            i.e(view, "bottomSheet");
            PingUserFragment.X0(this.a, view);
        }

        public void onStateChanged(View view, int i) {
            i.e(view, "bottomSheet");
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class b extends h<PingUserFragment, PingUserViewModel> {
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
            return i0.b.b.g.a.b(fragment, kVar, this.a, new PingUserFragment$special$$inlined$fragmentViewModel$default$2$1(this), m0.n.b.m.a(i0.e.b.g3.k.w0.b.f.class), false, this.b);
        }
    }

    public PingUserFragment() {
        d a2 = m0.n.b.m.a(PingUserViewModel.class);
        this.t2 = new b(a2, false, new PingUserFragment$special$$inlined$fragmentViewModel$default$1(this, a2, a2), a2).a(this, r2[0]);
    }

    public static final void X0(PingUserFragment pingUserFragment, View view) {
        Objects.requireNonNull(pingUserFragment);
        Rect rect = new Rect();
        view.getLocalVisibleRect(rect);
        pingUserFragment.S0().b.setY((float) (rect.bottom - pingUserFragment.S0().b.getHeight()));
        pingUserFragment.S0().c.setY(pingUserFragment.S0().b.getY() - ((float) pingUserFragment.S0().c.getHeight()));
    }

    public void J() {
        v.v2(Y0(), new PingUserFragment$invalidate$1(this));
    }

    public BottomSheetBehavior.c Q0() {
        return new a(this);
    }

    public PagingDataEpoxyController<i0.e.b.a3.d.a<m>> T0() {
        return this.u2;
    }

    public void U0() {
        S0().j.post(new i0.e.b.g3.k.w0.b.d(this));
    }

    public final PingUserViewModel Y0() {
        return (PingUserViewModel) this.t2.getValue();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.clubhouse.android.ui.channels.users.ping.PingUserFragment, androidx.fragment.app.Fragment, com.clubhouse.android.shared.ui.AbstractUserFragment, com.clubhouse.android.ui.channels.users.ping.Hilt_PingUserFragment] */
    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        EditText editText = S0().h;
        i.d(editText, "binding.search");
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(i0.e.b.d3.k.f(editText), new PingUserFragment$onViewCreated$1(this, (m0.l.c<? super PingUserFragment$onViewCreated$1>) null));
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$12 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(Y0().l, new PingUserFragment$onViewCreated$2(this, (m0.l.c<? super PingUserFragment$onViewCreated$2>) null));
        p viewLifecycleOwner2 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner2, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$12, q.a(viewLifecycleOwner2));
        S0().b.setLayoutManager(new GridLayoutManager(getContext(), 32));
    }
}
