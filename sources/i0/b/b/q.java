package i0.b.b;

import com.airbnb.mvrx.DeliveryMode;
import com.airbnb.mvrx.MavericksViewModel;
import h0.q.p;
import m0.i;
import m0.l.c;
import m0.r.m;
import n0.a.f1;

/* compiled from: MavericksView.kt */
public interface q extends p {
    void B0();

    void J();

    String V();

    p h0();

    <S extends j, T> f1 l0(MavericksViewModel<S> mavericksViewModel, m<S, ? extends b<? extends T>> mVar, DeliveryMode deliveryMode, m0.n.a.p<? super Throwable, ? super c<? super i>, ? extends Object> pVar, m0.n.a.p<? super T, ? super c<? super i>, ? extends Object> pVar2);

    <S extends j, A> f1 x0(MavericksViewModel<S> mavericksViewModel, m<S, ? extends A> mVar, DeliveryMode deliveryMode, m0.n.a.p<? super A, ? super c<? super i>, ? extends Object> pVar);
}
