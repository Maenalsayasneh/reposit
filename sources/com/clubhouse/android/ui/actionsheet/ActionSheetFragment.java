package com.clubhouse.android.ui.actionsheet;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.core.ui.R;
import com.clubhouse.core.ui.databinding.FragmentActionSheetBinding;
import h0.b0.v;
import i0.b.b.g;
import i0.b.b.h;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import m0.c;
import m0.i;
import m0.n.a.l;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010\u000eJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\u00020\u000f8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001d\u0010+\u001a\u00020&8B@\u0002X\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/clubhouse/android/ui/actionsheet/ActionSheetFragment;", "Lcom/clubhouse/android/core/ui/BaseBottomSheetFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "J", "()V", "Lcom/clubhouse/core/ui/databinding/FragmentActionSheetBinding;", "r2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "getBinding", "()Lcom/clubhouse/core/ui/databinding/FragmentActionSheetBinding;", "binding", "", "Li0/e/b/g3/i/c;", "s2", "Ljava/util/List;", "getActions$core_ui_release", "()Ljava/util/List;", "setActions$core_ui_release", "(Ljava/util/List;)V", "actions", "Lkotlin/Function0;", "t2", "Lm0/n/a/a;", "getCancelListener$core_ui_release", "()Lm0/n/a/a;", "setCancelListener$core_ui_release", "(Lm0/n/a/a;)V", "cancelListener", "Lcom/clubhouse/android/ui/actionsheet/ActionSheetViewModel;", "q2", "Lm0/c;", "V0", "()Lcom/clubhouse/android/ui/actionsheet/ActionSheetViewModel;", "viewModel", "<init>", "core-ui_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: ActionSheetFragment.kt */
public final class ActionSheetFragment extends Hilt_ActionSheetFragment {
    public static final /* synthetic */ k<Object>[] p2 = {m.c(new PropertyReference1Impl(m.a(ActionSheetFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/actionsheet/ActionSheetViewModel;")), m.c(new PropertyReference1Impl(m.a(ActionSheetFragment.class), "binding", "getBinding()Lcom/clubhouse/core/ui/databinding/FragmentActionSheetBinding;"))};
    public final c q2;
    public final FragmentViewBindingDelegate r2 = new FragmentViewBindingDelegate(FragmentActionSheetBinding.class, this);
    public List<i0.e.b.g3.i.c> s2 = EmptyList.c;
    public m0.n.a.a<i> t2 = ActionSheetFragment$cancelListener$1.c;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<ActionSheetFragment, ActionSheetViewModel> {
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
            m0.n.b.i.e(fragment, "thisRef");
            m0.n.b.i.e(kVar, "property");
            return g.a.b(fragment, kVar, this.a, new ActionSheetFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(i0.e.b.g3.i.h.class), false, this.b);
        }
    }

    public ActionSheetFragment() {
        super(R.layout.fragment_action_sheet);
        d a2 = m.a(ActionSheetViewModel.class);
        this.q2 = new a(a2, false, new ActionSheetFragment$special$$inlined$fragmentViewModel$default$1(this, a2, a2), a2).a(this, p2[0]);
    }

    public static final FragmentActionSheetBinding U0(ActionSheetFragment actionSheetFragment) {
        return (FragmentActionSheetBinding) actionSheetFragment.r2.getValue(actionSheetFragment, p2[1]);
    }

    public void J() {
        v.v2(V0(), new ActionSheetFragment$invalidate$1(this));
    }

    public final ActionSheetViewModel V0() {
        return (ActionSheetViewModel) this.q2.getValue();
    }

    public void onCancel(DialogInterface dialogInterface) {
        m0.n.b.i.e(dialogInterface, "dialog");
        this.t2.invoke();
    }

    public void onViewCreated(View view, Bundle bundle) {
        T t;
        m0.n.b.i.e(view, "view");
        super.onViewCreated(view, bundle);
        if (this.s2.isEmpty()) {
            I0();
            return;
        }
        v.U1(this);
        Iterator<T> it = this.s2.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((i0.e.b.g3.i.c) t).f) {
                break;
            }
        }
        i0.e.b.g3.i.c cVar = (i0.e.b.g3.i.c) t;
        if (cVar != null) {
            V0().p(new i0.e.b.g3.i.i(cVar));
        }
        EpoxyRecyclerView epoxyRecyclerView = ((FragmentActionSheetBinding) this.r2.getValue(this, p2[1])).a;
        m0.n.b.i.d(epoxyRecyclerView, "binding.actionList");
        i0.e.b.d3.k.E(epoxyRecyclerView, new ActionSheetFragment$onViewCreated$3(this, view));
    }
}
