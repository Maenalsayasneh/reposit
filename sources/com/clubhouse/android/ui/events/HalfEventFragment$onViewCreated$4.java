package com.clubhouse.android.ui.events;

import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.f.j;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.events.HalfEventFragment$onViewCreated$4", f = "HalfEventFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: HalfEventFragment.kt */
public final class HalfEventFragment$onViewCreated$4 extends SuspendLambda implements p<Throwable, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ HalfEventFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfEventFragment$onViewCreated$4(HalfEventFragment halfEventFragment, m0.l.c<? super HalfEventFragment$onViewCreated$4> cVar) {
        super(2, cVar);
        this.d = halfEventFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        HalfEventFragment$onViewCreated$4 halfEventFragment$onViewCreated$4 = new HalfEventFragment$onViewCreated$4(this.d, cVar);
        halfEventFragment$onViewCreated$4.c = obj;
        return halfEventFragment$onViewCreated$4;
    }

    public Object invoke(Object obj, Object obj2) {
        final HalfEventFragment halfEventFragment = this.d;
        HalfEventFragment$onViewCreated$4 halfEventFragment$onViewCreated$4 = new HalfEventFragment$onViewCreated$4(halfEventFragment, (m0.l.c) obj2);
        halfEventFragment$onViewCreated$4.c = (Throwable) obj;
        i iVar = i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        final Throwable th = (Throwable) halfEventFragment$onViewCreated$4.c;
        v.e2(halfEventFragment, new l<j, i>() {
            public Object invoke(Object obj) {
                j jVar = (j) obj;
                m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                String message = r3.getMessage();
                if (message == null) {
                    message = r0.getString(R.string.common_error_try_again);
                    m0.n.b.i.d(message, "getString(R.string.common_error_try_again)");
                }
                jVar.c.b.setText(message);
                return i.a;
            }
        });
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final Throwable th = (Throwable) this.c;
        final HalfEventFragment halfEventFragment = this.d;
        v.e2(halfEventFragment, new l<j, i>() {
            public Object invoke(Object obj) {
                j jVar = (j) obj;
                m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                String message = th.getMessage();
                if (message == null) {
                    message = halfEventFragment.getString(R.string.common_error_try_again);
                    m0.n.b.i.d(message, "getString(R.string.common_error_try_again)");
                }
                jVar.c.b.setText(message);
                return i.a;
            }
        });
        return i.a;
    }
}
