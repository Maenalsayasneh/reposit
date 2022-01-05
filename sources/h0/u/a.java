package h0.u;

import com.pubnub.api.endpoints.objects_api.utils.Include;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.l.c;
import m0.n.b.i;
import n0.a.f2.r;
import n0.a.g2.e;

/* compiled from: FlowExt.kt */
public final class a<T> implements e<T> {
    public final r<T> c;

    public a(r<? super T> rVar) {
        i.e(rVar, Include.INCLUDE_CHANNEL_PARAM_VALUE);
        this.c = rVar;
    }

    public Object emit(T t, c<? super m0.i> cVar) {
        Object t2 = this.c.t(t, cVar);
        if (t2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return t2;
        }
        return m0.i.a;
    }
}
