package com.airbnb.mvrx;

import i0.b.b.b;
import i0.b.b.j;
import i0.j.f.p.h;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.m;
import n0.a.f0;

@c(c = "com.airbnb.mvrx.MavericksViewModel$execute$5", f = "MavericksViewModel.kt", l = {224}, m = "invokeSuspend")
/* compiled from: MavericksViewModel.kt */
public final class MavericksViewModel$execute$5 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ MavericksViewModel d;
    public final /* synthetic */ l q;
    public final /* synthetic */ p x;
    public final /* synthetic */ m y;

    /* compiled from: kotlin-style lambda group */
    public static final class a extends Lambda implements l<S, S> {
        public final /* synthetic */ int c;
        public final /* synthetic */ Object d;
        public final /* synthetic */ Object q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i, Object obj, Object obj2) {
            super(1);
            this.c = i;
            this.d = obj;
            this.q = obj2;
        }

        public final Object invoke(Object obj) {
            b bVar;
            int i = this.c;
            if (i != 0) {
                Object obj2 = null;
                if (i == 1) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$receiver");
                    MavericksViewModel$execute$5 mavericksViewModel$execute$5 = (MavericksViewModel$execute$5) this.d;
                    p pVar = mavericksViewModel$execute$5.x;
                    Exception exc = (Exception) this.q;
                    m mVar = mavericksViewModel$execute$5.y;
                    if (!(mVar == null || (bVar = (b) mVar.get(jVar)) == null)) {
                        obj2 = bVar.a();
                    }
                    return (j) pVar.invoke(jVar, new i0.b.b.c(exc, obj2));
                }
                throw null;
            }
            j jVar2 = (j) obj;
            m0.n.b.i.e(jVar2, "$receiver");
            return (j) ((MavericksViewModel$execute$5) this.d).x.invoke(jVar2, new i0.b.b.f0(this.q));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MavericksViewModel$execute$5(MavericksViewModel mavericksViewModel, l lVar, p pVar, m mVar, m0.l.c cVar) {
        super(2, cVar);
        this.d = mavericksViewModel;
        this.q = lVar;
        this.x = pVar;
        this.y = mVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new MavericksViewModel$execute$5(this.d, this.q, this.x, this.y, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((MavericksViewModel$execute$5) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            l lVar = this.q;
            this.c = 1;
            obj = lVar.invoke(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                h.d4(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                this.d.m(new a(1, this, e2));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.d.m(new a(0, this, obj));
        return i.a;
    }
}
