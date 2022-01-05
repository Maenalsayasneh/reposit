package com.clubhouse.android.shared.ui;

import android.os.Bundle;
import android.view.View;
import com.airbnb.epoxy.paging3.PagingDataEpoxyController;
import com.clubhouse.android.core.ui.BaseBottomSheetFragment;
import com.clubhouse.android.databinding.FragmentUserGridBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.l.c;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.k;
import m0.r.t.a.r.m.a1.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u001c\u0010\u000eJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108$@$X¤\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\u00020\u00168D@\u0004X\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/clubhouse/android/shared/ui/AbstractUserFragment;", "", "T", "Lcom/clubhouse/android/core/ui/BaseBottomSheetFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "U0", "()V", "onResume", "Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "T0", "()Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "setPagedController", "(Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;)V", "pagedController", "Lcom/clubhouse/android/databinding/FragmentUserGridBinding;", "m2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "S0", "()Lcom/clubhouse/android/databinding/FragmentUserGridBinding;", "binding", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: AbstractUserFragment.kt */
public abstract class AbstractUserFragment<T> extends BaseBottomSheetFragment {
    public static final /* synthetic */ k<Object>[] l2 = {m.c(new PropertyReference1Impl(m.a(AbstractUserFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentUserGridBinding;"))};
    public final FragmentViewBindingDelegate m2 = new FragmentViewBindingDelegate(FragmentUserGridBinding.class, this);

    public AbstractUserFragment() {
        super(R.layout.fragment_user_grid);
    }

    public final FragmentUserGridBinding S0() {
        return (FragmentUserGridBinding) this.m2.getValue(this, l2[0]);
    }

    public abstract PagingDataEpoxyController<T> T0();

    public abstract void U0();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        N0(0, 2132017459);
    }

    public void onResume() {
        super.onResume();
        U0();
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        S0().j.setController(T0());
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(v.f1(T0()), new AbstractUserFragment$onViewCreated$1(this, (c<? super AbstractUserFragment$onViewCreated$1>) null));
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner));
    }
}
