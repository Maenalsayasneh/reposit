package h0.u;

import com.pubnub.api.endpoints.objects_api.utils.Include;
import m0.l.c;
import m0.l.e;
import m0.n.b.i;
import n0.a.f0;
import n0.a.f2.r;

/* compiled from: SimpleChannelFlow.kt */
public final class d0<T> implements c0<T>, f0, r<T> {
    public final r<T> c;
    public final /* synthetic */ f0 d;

    public d0(f0 f0Var, r<? super T> rVar) {
        i.e(f0Var, "scope");
        i.e(rVar, Include.INCLUDE_CHANNEL_PARAM_VALUE);
        this.d = f0Var;
        this.c = rVar;
    }

    public e C() {
        return this.d.C();
    }

    public boolean o(Throwable th) {
        return this.c.o(th);
    }

    public Object t(T t, c<? super m0.i> cVar) {
        return this.c.t(t, cVar);
    }
}
