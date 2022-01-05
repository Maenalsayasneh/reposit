package com.clubhouse.android.core.ui;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.airbnb.mvrx.DeliveryMode;
import com.airbnb.mvrx.MavericksViewModel;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import h0.b0.v;
import h0.i.i.c0;
import h0.i.i.f0;
import h0.q.p;
import i0.b.b.j;
import i0.b.b.q;
import i0.e.b.a3.f.b;
import i0.e.b.a3.f.c;
import i0.h.a.c.g.d;
import kotlin.Metadata;
import m0.i;
import m0.r.m;
import n0.a.f1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0001\u0010!\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010#J-\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/clubhouse/android/core/ui/BaseBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Li0/b/b/q;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Li0/h/a/c/g/d;", "R0", "(Landroid/os/Bundle;)Li0/h/a/c/g/d;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;", "Q0", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;", "Li0/e/b/a3/f/b;", "k2", "Li0/e/b/a3/f/b;", "getBannerHandler", "()Li0/e/b/a3/f/b;", "setBannerHandler", "(Li0/e/b/a3/f/b;)V", "bannerHandler", "", "j2", "I", "contentLayoutId", "<init>", "(I)V", "core_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: BaseBottomSheetFragment.kt */
public abstract class BaseBottomSheetFragment extends BottomSheetDialogFragment implements q {
    public final int j2;
    public b k2;

    public BaseBottomSheetFragment(int i) {
        this.j2 = i;
    }

    public void B0() {
        v.q1(this);
    }

    public BottomSheetBehavior.c Q0() {
        return null;
    }

    @SuppressLint({"RestrictedApi", "VisibleForTests"})
    /* renamed from: R0 */
    public d L0(Bundle bundle) {
        d dVar = new d(getContext(), K0());
        dVar.e().p = null;
        BottomSheetBehavior<FrameLayout> e = dVar.e();
        c cVar = new c(this, dVar);
        if (!e.J.contains(cVar)) {
            e.J.add(cVar);
        }
        BottomSheetBehavior.c Q0 = Q0();
        if (Q0 != null) {
            BottomSheetBehavior<FrameLayout> e2 = dVar.e();
            if (!e2.J.contains(Q0)) {
                e2.J.add(Q0);
            }
        }
        return dVar;
    }

    public String V() {
        return v.o0(this);
    }

    public p h0() {
        return v.r0(this);
    }

    public <S extends j, T> f1 l0(MavericksViewModel<S> mavericksViewModel, m<S, ? extends i0.b.b.b<? extends T>> mVar, DeliveryMode deliveryMode, m0.n.a.p<? super Throwable, ? super m0.l.c<? super i>, ? extends Object> pVar, m0.n.a.p<? super T, ? super m0.l.c<? super i>, ? extends Object> pVar2) {
        return v.g1(this, mavericksViewModel, mVar, deliveryMode, pVar, pVar2);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m0.n.b.i.e(layoutInflater, "inflater");
        return layoutInflater.inflate(this.j2, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        f0 a;
        m0.n.b.i.e(view, "view");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        boolean z = false;
        if (context != null) {
            m0.n.b.i.e(context, "<this>");
            if (context.getResources().getConfiguration().orientation == 2) {
                z = true;
            }
        }
        if (z) {
            v.U1(this);
        }
        Dialog dialog = this.e2;
        if (dialog != null && (window = dialog.getWindow()) != null && (a = c0.a(window, window.getDecorView())) != null) {
            a.a.a(true);
        }
    }

    public <S extends j, A> f1 x0(MavericksViewModel<S> mavericksViewModel, m<S, ? extends A> mVar, DeliveryMode deliveryMode, m0.n.a.p<? super A, ? super m0.l.c<? super i>, ? extends Object> pVar) {
        return v.i1(this, mavericksViewModel, mVar, deliveryMode, pVar);
    }
}
