package com.clubhouse.android.shared;

import i0.j.f.p.h;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.g2.d;
import n0.a.g2.e;

@c(c = "com.clubhouse.android.shared.TimedChunkFlow$resultFlow$1", f = "TimedChunkFlow.kt", l = {41}, m = "invokeSuspend")
/* compiled from: TimedChunkFlow.kt */
public final class TimedChunkFlow$resultFlow$1 extends SuspendLambda implements p<e<? super List<T>>, m0.l.c<? super i>, Object> {
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ d<T> q;
    public final /* synthetic */ TimedChunkFlow<T> x;

    /* compiled from: Collect.kt */
    public static final class a implements e<T> {
        public final /* synthetic */ TimedChunkFlow c;
        public final /* synthetic */ e d;

        public a(TimedChunkFlow timedChunkFlow, e eVar) {
            this.c = timedChunkFlow;
            this.d = eVar;
        }

        /* JADX INFO: finally extract failed */
        public Object emit(T t, m0.l.c<? super i> cVar) {
            ReentrantLock reentrantLock = this.c.a;
            reentrantLock.lock();
            try {
                this.c.b.add(t);
                List<T> list = this.c.b;
                reentrantLock.unlock();
                Object emit = this.d.emit(list, cVar);
                if (emit == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return emit;
                }
                return i.a;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimedChunkFlow$resultFlow$1(d<? extends T> dVar, TimedChunkFlow<T> timedChunkFlow, m0.l.c<? super TimedChunkFlow$resultFlow$1> cVar) {
        super(2, cVar);
        this.q = dVar;
        this.x = timedChunkFlow;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        TimedChunkFlow$resultFlow$1 timedChunkFlow$resultFlow$1 = new TimedChunkFlow$resultFlow$1(this.q, this.x, cVar);
        timedChunkFlow$resultFlow$1.d = obj;
        return timedChunkFlow$resultFlow$1;
    }

    public Object invoke(Object obj, Object obj2) {
        TimedChunkFlow$resultFlow$1 timedChunkFlow$resultFlow$1 = new TimedChunkFlow$resultFlow$1(this.q, this.x, (m0.l.c) obj2);
        timedChunkFlow$resultFlow$1.d = (e) obj;
        return timedChunkFlow$resultFlow$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            d<T> dVar = this.q;
            a aVar = new a(this.x, (e) this.d);
            this.c = 1;
            if (dVar.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
