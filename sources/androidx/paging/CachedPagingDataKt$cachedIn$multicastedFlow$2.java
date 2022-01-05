package androidx.paging;

import androidx.paging.multicast.ChannelManager;
import h0.u.l;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.l.f.a.c;
import m0.n.a.q;
import m0.n.b.i;

@c(c = "androidx.paging.CachedPagingDataKt$cachedIn$multicastedFlow$2", f = "CachedPagingData.kt", l = {93}, m = "invokeSuspend")
/* compiled from: CachedPagingData.kt */
public final class CachedPagingDataKt$cachedIn$multicastedFlow$2 extends SuspendLambda implements q<l<T>, l<T>, m0.l.c<? super l<T>>, Object> {
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public int q;

    public CachedPagingDataKt$cachedIn$multicastedFlow$2(m0.l.c cVar) {
        super(3, cVar);
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        l lVar = (l) obj;
        l lVar2 = (l) obj2;
        m0.l.c cVar = (m0.l.c) obj3;
        i.e(lVar, "prev");
        i.e(lVar2, "next");
        i.e(cVar, "continuation");
        CachedPagingDataKt$cachedIn$multicastedFlow$2 cachedPagingDataKt$cachedIn$multicastedFlow$2 = new CachedPagingDataKt$cachedIn$multicastedFlow$2(cVar);
        cachedPagingDataKt$cachedIn$multicastedFlow$2.c = lVar;
        cachedPagingDataKt$cachedIn$multicastedFlow$2.d = lVar2;
        return cachedPagingDataKt$cachedIn$multicastedFlow$2.invokeSuspend(m0.i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.q;
        if (i == 0) {
            h.d4(obj);
            l lVar = (l) this.d;
            this.c = lVar;
            this.q = 1;
            Object b = ((ChannelManager) ((l) this.c).a.c.a.getValue()).a.b(this);
            if (b != coroutineSingletons) {
                b = m0.i.a;
            }
            if (b != coroutineSingletons) {
                b = m0.i.a;
            }
            if (b != coroutineSingletons) {
                b = m0.i.a;
            }
            if (b != coroutineSingletons) {
                b = m0.i.a;
            }
            return b == coroutineSingletons ? coroutineSingletons : lVar;
        } else if (i == 1) {
            l lVar2 = (l) this.c;
            h.d4(obj);
            return lVar2;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
