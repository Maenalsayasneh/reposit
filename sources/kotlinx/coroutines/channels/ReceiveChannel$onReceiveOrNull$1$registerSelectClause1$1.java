package kotlinx.coroutines.channels;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f2.g;

@c(c = "kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1", f = "Channel.kt", l = {376}, m = "invokeSuspend")
/* compiled from: Channel.kt */
public final class ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1 extends SuspendLambda implements p<g<? extends E>, m0.l.c<? super R>, Object> {
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ p<E, m0.l.c<? super R>, Object> q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1(p<? super E, ? super m0.l.c<? super R>, ? extends Object> pVar, m0.l.c<? super ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1> cVar) {
        super(2, cVar);
        this.q = pVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1 receiveChannel$onReceiveOrNull$1$registerSelectClause1$1 = new ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1(this.q, cVar);
        receiveChannel$onReceiveOrNull$1$registerSelectClause1$1.d = obj;
        return receiveChannel$onReceiveOrNull$1$registerSelectClause1$1;
    }

    public Object invoke(Object obj, Object obj2) {
        g gVar = new g(((g) obj).c);
        ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1 receiveChannel$onReceiveOrNull$1$registerSelectClause1$1 = new ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1(this.q, (m0.l.c) obj2);
        receiveChannel$onReceiveOrNull$1$registerSelectClause1$1.d = gVar;
        return receiveChannel$onReceiveOrNull$1$registerSelectClause1$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            Object obj2 = ((g) this.d).c;
            Throwable a = g.a(obj2);
            if (a == null) {
                p<E, m0.l.c<? super R>, Object> pVar = this.q;
                Object b = g.b(obj2);
                this.c = 1;
                obj = pVar.invoke(b, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                throw a;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
