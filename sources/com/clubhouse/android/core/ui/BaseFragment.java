package com.clubhouse.android.core.ui;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.airbnb.mvrx.DeliveryMode;
import com.airbnb.mvrx.MavericksViewModel;
import h0.b0.v;
import h0.q.p;
import i0.b.b.j;
import i0.b.b.q;
import i0.e.b.a3.f.b;
import kotlin.Metadata;
import m0.l.c;
import m0.n.b.i;
import m0.r.m;
import n0.a.f1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\u00020\u000e8\u0016@\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\u00020\u000e8\u0016@\u0016XD¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012¨\u0006\""}, d2 = {"Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroidx/fragment/app/Fragment;", "Li0/b/b/q;", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "()V", "", "shouldShowKeyboard", "Z", "K0", "()Z", "Li0/e/b/a3/f/b;", "c", "Li0/e/b/a3/f/b;", "I0", "()Li0/e/b/a3/f/b;", "setBannerHandler", "(Li0/e/b/a3/f/b;)V", "bannerHandler", "d", "J0", "shouldAdjustResize", "", "contentLayoutId", "<init>", "(I)V", "core_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: BaseFragment.kt */
public abstract class BaseFragment extends Fragment implements q {
    public b c;
    public final boolean d = true;

    public BaseFragment(int i) {
        super(i);
    }

    public void B0() {
        v.q1(this);
    }

    public final b I0() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar;
        }
        i.m("bannerHandler");
        throw null;
    }

    public boolean J0() {
        return this.d;
    }

    public boolean K0() {
        return false;
    }

    public String V() {
        return v.o0(this);
    }

    public p h0() {
        return v.r0(this);
    }

    public <S extends j, T> f1 l0(MavericksViewModel<S> mavericksViewModel, m<S, ? extends i0.b.b.b<? extends T>> mVar, DeliveryMode deliveryMode, m0.n.a.p<? super Throwable, ? super c<? super m0.i>, ? extends Object> pVar, m0.n.a.p<? super T, ? super c<? super m0.i>, ? extends Object> pVar2) {
        return v.g1(this, mavericksViewModel, mVar, deliveryMode, pVar, pVar2);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.setClassLoader(getClass().getClassLoader());
        }
    }

    public void onResume() {
        super.onResume();
        if (J0()) {
            requireActivity().getWindow().setSoftInputMode(16);
        } else {
            requireActivity().getWindow().setSoftInputMode(48);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        if (K0()) {
            v.h2(this);
        } else {
            v.x0(this);
        }
    }

    public <S extends j, A> f1 x0(MavericksViewModel<S> mavericksViewModel, m<S, ? extends A> mVar, DeliveryMode deliveryMode, m0.n.a.p<? super A, ? super c<? super m0.i>, ? extends Object> pVar) {
        return v.i1(this, mavericksViewModel, mVar, deliveryMode, pVar);
    }
}
