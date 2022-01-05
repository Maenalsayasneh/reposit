package com.clubhouse.android.ui.creation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.airbnb.mvrx.DeliveryMode;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.databinding.CreateChannelBinding;
import com.clubhouse.android.databinding.CreateChannelEventCellBinding;
import com.clubhouse.android.databinding.FragmentCreateChannelBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.android.ui.creation.ChooseUsersFragment;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import i0.b.b.g;
import i0.e.b.g3.n.o;
import i0.e.b.g3.n.t;
import i0.j.f.p.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import m0.c;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001.B\u0007¢\u0006\u0004\b,\u0010\u000bJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\u00020\u00178B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010!\u001a\u00020\u001d8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u001d\u0010&\u001a\u00020\"8B@\u0002X\u0002¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010%R\u001d\u0010+\u001a\u00020'8B@\u0002X\u0002¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lcom/clubhouse/android/ui/creation/CreateChannelFragment;", "Lcom/clubhouse/android/core/ui/BaseBottomSheetFragment;", "Lcom/clubhouse/android/ui/creation/ChooseUsersFragment$a;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "", "Lcom/clubhouse/android/data/models/local/user/UserInList;", "selectedUsers", "v", "(Ljava/util/List;)V", "Lcom/clubhouse/android/databinding/FragmentCreateChannelBinding;", "s2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "getRootBinding", "()Lcom/clubhouse/android/databinding/FragmentCreateChannelBinding;", "rootBinding", "Lcom/clubhouse/android/databinding/CreateChannelEventCellBinding;", "u2", "Lm0/c;", "V0", "()Lcom/clubhouse/android/databinding/CreateChannelEventCellBinding;", "eventBinding", "Lcom/clubhouse/android/ui/creation/CreateChannelViewModel;", "r2", "W0", "()Lcom/clubhouse/android/ui/creation/CreateChannelViewModel;", "viewModel", "Lh0/b0/g;", "v2", "getDefaultScene", "()Lh0/b0/g;", "defaultScene", "Lcom/clubhouse/android/databinding/CreateChannelBinding;", "t2", "U0", "()Lcom/clubhouse/android/databinding/CreateChannelBinding;", "binding", "<init>", "p2", "a", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: CreateChannelFragment.kt */
public final class CreateChannelFragment extends Hilt_CreateChannelFragment implements ChooseUsersFragment.a {
    public static final a p2 = new a((f) null);
    public static final /* synthetic */ k<Object>[] q2;
    public final c r2;
    public final FragmentViewBindingDelegate s2 = new FragmentViewBindingDelegate(FragmentCreateChannelBinding.class, this);
    public final c t2 = h.H2(new CreateChannelFragment$binding$2(this));
    public final c u2 = h.H2(new CreateChannelFragment$eventBinding$2(this));
    public final c v2 = h.H2(new CreateChannelFragment$defaultScene$2(this));

    /* compiled from: CreateChannelFragment.kt */
    public static final class a {
        public a(f fVar) {
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class b extends i0.b.b.h<CreateChannelFragment, CreateChannelViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new CreateChannelFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(t.class), false, this.b);
        }
    }

    static {
        k<Object>[] kVarArr = new k[5];
        kVarArr[0] = m.c(new PropertyReference1Impl(m.a(CreateChannelFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/creation/CreateChannelViewModel;"));
        kVarArr[1] = m.c(new PropertyReference1Impl(m.a(CreateChannelFragment.class), "rootBinding", "getRootBinding()Lcom/clubhouse/android/databinding/FragmentCreateChannelBinding;"));
        q2 = kVarArr;
    }

    public CreateChannelFragment() {
        super(R.layout.fragment_create_channel);
        d a2 = m.a(CreateChannelViewModel.class);
        this.r2 = new b(a2, false, new CreateChannelFragment$special$$inlined$fragmentViewModel$default$1(this, a2, a2), a2).a(this, q2[0]);
    }

    public void J() {
        v.v2(W0(), new CreateChannelFragment$invalidate$1(this));
    }

    public final CreateChannelBinding U0() {
        return (CreateChannelBinding) this.t2.getValue();
    }

    public final CreateChannelEventCellBinding V0() {
        return (CreateChannelEventCellBinding) this.u2.getValue();
    }

    public final CreateChannelViewModel W0() {
        return (CreateChannelViewModel) this.r2.getValue();
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        v.U1(this);
        U0().c.setLayoutManager(new GridLayoutManager(getContext(), 3));
        EpoxyRecyclerView epoxyRecyclerView = U0().c;
        i.d(epoxyRecyclerView, "binding.channelAudienceList");
        i0.e.b.d3.k.D(epoxyRecyclerView, this, new CreateChannelFragment$buildModels$1(this));
        Button button = U0().e;
        i.d(button, "binding.createButton");
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button, q.a(viewLifecycleOwner), new i0.e.b.g3.n.i(this));
        Button button2 = U0().b;
        i.d(button2, "binding.addTopicButton");
        p viewLifecycleOwner2 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner2, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button2, q.a(viewLifecycleOwner2), new i0.e.b.g3.n.d(this));
        Button button3 = U0().d;
        i.d(button3, "binding.choosePeopleButton");
        p viewLifecycleOwner3 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner3, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button3, q.a(viewLifecycleOwner3), new i0.e.b.g3.n.l(this));
        v.h1(this, W0(), CreateChannelFragment$onViewCreated$4.c, (DeliveryMode) null, new CreateChannelFragment$onViewCreated$5(this, (m0.l.c<? super CreateChannelFragment$onViewCreated$5>) null), new CreateChannelFragment$onViewCreated$6(this, (m0.l.c<? super CreateChannelFragment$onViewCreated$6>) null), 2, (Object) null);
        v.h1(this, W0(), CreateChannelFragment$onViewCreated$7.c, (DeliveryMode) null, new CreateChannelFragment$onViewCreated$8(this, (m0.l.c<? super CreateChannelFragment$onViewCreated$8>) null), new CreateChannelFragment$onViewCreated$9(this, (m0.l.c<? super CreateChannelFragment$onViewCreated$9>) null), 2, (Object) null);
    }

    public void v(List<UserInList> list) {
        i.e(list, "selectedUsers");
        W0().p(new o(list));
    }
}
