package com.clubhouse.android.ui.creation;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.airbnb.epoxy.paging3.PagingDataEpoxyController;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.shared.ui.AbstractUserFragment;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.q.p;
import h0.v.a.g;
import i0.b.a.t;
import i0.b.b.h;
import i0.e.b.b3.b.e.m;
import i0.e.b.g3.k.w0.b.j;
import i0.e.b.g3.n.q;
import i0.e.b.g3.n.w;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\u001d\u001eB\u0007¢\u0006\u0004\b\u001c\u0010\fJ!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fR.\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000e8\u0014@\u0014X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/clubhouse/android/ui/creation/ChooseUsersFragment;", "Lcom/clubhouse/android/shared/ui/AbstractUserFragment;", "Li0/e/b/a3/d/a;", "Li0/e/b/b3/b/e/m;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "U0", "()V", "J", "Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "t2", "Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "T0", "()Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "setPagedController", "(Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;)V", "pagedController", "Lcom/clubhouse/android/ui/creation/ChooseUsersViewModel;", "s2", "Lm0/c;", "X0", "()Lcom/clubhouse/android/ui/creation/ChooseUsersViewModel;", "viewModel", "<init>", "a", "UserController", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: ChooseUsersFragment.kt */
public final class ChooseUsersFragment extends AbstractUserFragment<i0.e.b.a3.d.a<m>> {
    public static final /* synthetic */ k<Object>[] r2 = {m0.n.b.m.c(new PropertyReference1Impl(m0.n.b.m.a(ChooseUsersFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/creation/ChooseUsersViewModel;"))};
    public final c s2;
    public PagingDataEpoxyController<i0.e.b.a3.d.a<m>> t2 = new UserController(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/clubhouse/android/ui/creation/ChooseUsersFragment$UserController;", "Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "Li0/e/b/a3/d/a;", "Li0/e/b/b3/b/e/m;", "", "currentPosition", "item", "Li0/b/a/t;", "buildItemModel", "(ILi0/e/b/a3/d/a;)Li0/b/a/t;", "<init>", "(Lcom/clubhouse/android/ui/creation/ChooseUsersFragment;)V", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* compiled from: ChooseUsersFragment.kt */
    public final class UserController extends PagingDataEpoxyController<i0.e.b.a3.d.a<m>> {
        public final /* synthetic */ ChooseUsersFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UserController(ChooseUsersFragment chooseUsersFragment) {
            super((Handler) null, (Handler) null, (g.e) null, 7, (f) null);
            i.e(chooseUsersFragment, "this$0");
            this.this$0 = chooseUsersFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: buildItemModel$lambda-0  reason: not valid java name */
        public static final void m29buildItemModel$lambda0(ChooseUsersFragment chooseUsersFragment, i0.e.b.a3.d.a aVar, View view) {
            i.e(chooseUsersFragment, "this$0");
            k<Object>[] kVarArr = ChooseUsersFragment.r2;
            chooseUsersFragment.X0().p(new w((m) aVar.a));
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
                i0.e.b.g3.n.b bVar = new i0.e.b.g3.n.b(this.this$0, aVar);
                jVar.w();
                jVar.m = bVar;
                i.d(jVar, "SelectableUser_()\n                .id(item.item.user.id)\n                .user(item.item.user)\n                .selected(item.selected)\n                .clickListener { _ -> viewModel.processIntent(ToggleUser(item.item)) }");
                return jVar;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* compiled from: ChooseUsersFragment.kt */
    public interface a {
        void v(List<UserInList> list);
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class b extends h<ChooseUsersFragment, ChooseUsersViewModel> {
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
            return i0.b.b.g.a.b(fragment, kVar, this.a, new ChooseUsersFragment$special$$inlined$fragmentViewModel$default$2$1(this), m0.n.b.m.a(q.class), false, this.b);
        }
    }

    public ChooseUsersFragment() {
        d a2 = m0.n.b.m.a(ChooseUsersViewModel.class);
        this.s2 = new b(a2, false, new ChooseUsersFragment$special$$inlined$fragmentViewModel$default$1(this, a2, a2), a2).a(this, r2[0]);
    }

    public void J() {
        v.v2(X0(), new ChooseUsersFragment$invalidate$1(this));
    }

    public PagingDataEpoxyController<i0.e.b.a3.d.a<m>> T0() {
        return this.t2;
    }

    public void U0() {
        S0().j.post(new i0.e.b.g3.n.c(this));
    }

    public final ChooseUsersViewModel X0() {
        return (ChooseUsersViewModel) this.s2.getValue();
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        EditText editText = S0().h;
        i.d(editText, "binding.search");
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(i0.e.b.d3.k.f(editText), new ChooseUsersFragment$onViewCreated$1(this, (m0.l.c<? super ChooseUsersFragment$onViewCreated$1>) null));
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, h0.q.q.a(viewLifecycleOwner));
        S0().i.setText(getString(R.string.choose_users_sheet_title));
        S0().d.setText(getString(R.string.search_room_empty));
        Button button = S0().a;
        i.d(button, "binding.actionButton");
        i0.e.b.d3.k.K(button);
        S0().a.setText(getString(R.string.choose_users_done));
        S0().a.setOnClickListener(new i0.e.b.g3.n.a(this));
    }
}
