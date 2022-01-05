package com.clubhouse.android.ui.events.creation;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.databinding.FragmentAddEditEventBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.android.ui.creation.ChooseUsersFragment;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.o.w0.b;
import i0.e.b.g3.o.w0.e;
import i0.e.b.g3.o.w0.f;
import i0.e.b.g3.o.w0.j;
import i0.e.b.g3.o.w0.k0;
import i0.e.b.g3.o.w0.t;
import i0.e.b.g3.o.w0.u;
import i0.e.b.g3.o.w0.w;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001e\u0010\u000bJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u000bR\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001d\u001a\u00020\u00188B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/clubhouse/android/ui/events/creation/AddEditEventFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Lcom/clubhouse/android/ui/creation/ChooseUsersFragment$a;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "", "Lcom/clubhouse/android/data/models/local/user/UserInList;", "selectedUsers", "v", "(Ljava/util/List;)V", "onPause", "Lcom/clubhouse/android/databinding/FragmentAddEditEventBinding;", "a2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "N0", "()Lcom/clubhouse/android/databinding/FragmentAddEditEventBinding;", "binding", "Lcom/clubhouse/android/ui/events/creation/AddEditEventViewModel;", "b2", "Lm0/c;", "O0", "()Lcom/clubhouse/android/ui/events/creation/AddEditEventViewModel;", "viewModel", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: AddEditEventFragment.kt */
public final class AddEditEventFragment extends Hilt_AddEditEventFragment implements ChooseUsersFragment.a {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(AddEditEventFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentAddEditEventBinding;")), m.c(new PropertyReference1Impl(m.a(AddEditEventFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/events/creation/AddEditEventViewModel;"))};
    public final FragmentViewBindingDelegate a2 = new FragmentViewBindingDelegate(FragmentAddEditEventBinding.class, this);
    public final c b2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<AddEditEventFragment, AddEditEventViewModel> {
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
            return g.a.b(fragment, kVar, this.a, new AddEditEventFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(w.class), false, this.b);
        }
    }

    public AddEditEventFragment() {
        super(R.layout.fragment_add_edit_event);
        d a3 = m.a(AddEditEventViewModel.class);
        this.b2 = new a(a3, false, new AddEditEventFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, Z1[1]);
    }

    public void J() {
        v.v2(O0(), new AddEditEventFragment$invalidate$1(this));
    }

    public final FragmentAddEditEventBinding N0() {
        return (FragmentAddEditEventBinding) this.a2.getValue(this, Z1[0]);
    }

    public final AddEditEventViewModel O0() {
        return (AddEditEventViewModel) this.b2.getValue();
    }

    public void onPause() {
        v.x0(this);
        super.onPause();
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(O0().l, new AddEditEventFragment$onViewCreated$1(this, (m0.l.c<? super AddEditEventFragment$onViewCreated$1>) null));
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner));
        N0().b.setOnClickListener(new f(this));
        TextView textView = N0().w;
        i.d(textView, "binding.publish");
        p viewLifecycleOwner2 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner2, "viewLifecycleOwner");
        i0.e.b.d3.k.H(textView, q.a(viewLifecycleOwner2), new i0.e.b.g3.o.w0.c(this));
        i0.e.b.g3.o.w0.a aVar = new i0.e.b.g3.o.w0.a(this);
        N0().d.setOnClickListener(aVar);
        N0().e.setOnClickListener(aVar);
        i0.e.b.g3.o.w0.i iVar = new i0.e.b.g3.o.w0.i(this);
        N0().l.setOnClickListener(iVar);
        N0().n.setOnClickListener(iVar);
        N0().f.setDate(System.currentTimeMillis(), false, true);
        N0().f.setOnDateChangeListener(new i0.e.b.g3.o.w0.g(this));
        N0().o.setOnTimeChangedListener(new j(this));
        EditText editText = N0().k;
        i.d(editText, "binding.eventName");
        editText.addTextChangedListener(new u(this));
        v.v2(O0(), new AddEditEventFragment$initName$2(this));
        N0().a.setOnClickListener(new i0.e.b.g3.o.w0.p(this));
        N0().c.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        EpoxyRecyclerView epoxyRecyclerView = N0().c;
        i.d(epoxyRecyclerView, "binding.coHostsList");
        i0.e.b.d3.k.E(epoxyRecyclerView, new AddEditEventFragment$initCoHosts$2(this));
        N0().s.setOnClickListener(new b(this));
        EditText editText2 = N0().i;
        i.d(editText2, "binding.eventDescription");
        editText2.addTextChangedListener(new t(this));
        N0().i.setOnFocusChangeListener(new e(this));
        TextView textView2 = N0().j;
        i.d(textView2, "binding.eventDescriptionRemaining");
        v.v2(O0(), new AddEditEventFragment$updateRemainingDescription$1("", textView2, this));
        v.v2(O0(), new AddEditEventFragment$initDescription$3(this));
        N0().h.setOnClickListener(new i0.e.b.g3.o.w0.d(this));
    }

    public void v(List<UserInList> list) {
        i.e(list, "selectedUsers");
        O0().p(new k0(list));
    }
}
