package com.clubhouse.android.core.ui;

import androidx.appcompat.app.AppCompatDialogFragment;
import com.airbnb.mvrx.DeliveryMode;
import com.airbnb.mvrx.MavericksViewModel;
import h0.b0.v;
import h0.q.p;
import i0.b.b.b;
import i0.b.b.j;
import i0.b.b.q;
import kotlin.Metadata;
import m0.i;
import m0.l.c;
import m0.r.m;
import n0.a.f1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/clubhouse/android/core/ui/BaseDialogFragment;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "Li0/b/b/q;", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: BaseDialogFragment.kt */
public abstract class BaseDialogFragment extends AppCompatDialogFragment implements q {
    public void B0() {
        v.q1(this);
    }

    public String V() {
        return v.o0(this);
    }

    public p h0() {
        return v.r0(this);
    }

    public <S extends j, T> f1 l0(MavericksViewModel<S> mavericksViewModel, m<S, ? extends b<? extends T>> mVar, DeliveryMode deliveryMode, m0.n.a.p<? super Throwable, ? super c<? super i>, ? extends Object> pVar, m0.n.a.p<? super T, ? super c<? super i>, ? extends Object> pVar2) {
        return v.g1(this, mavericksViewModel, mVar, deliveryMode, pVar, pVar2);
    }

    public <S extends j, A> f1 x0(MavericksViewModel<S> mavericksViewModel, m<S, ? extends A> mVar, DeliveryMode deliveryMode, m0.n.a.p<? super A, ? super c<? super i>, ? extends Object> pVar) {
        return v.i1(this, mavericksViewModel, mVar, deliveryMode, pVar);
    }
}
