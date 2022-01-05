package com.clubhouse.android.shared;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.shared.TimedChunkFlow$resultFlow$2", f = "TimedChunkFlow.kt", l = {}, m = "invokeSuspend")
/* compiled from: TimedChunkFlow.kt */
public final class TimedChunkFlow$resultFlow$2 extends SuspendLambda implements p<List<T>, m0.l.c<? super i>, Object> {
    public final /* synthetic */ TimedChunkFlow<T> c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimedChunkFlow$resultFlow$2(TimedChunkFlow<T> timedChunkFlow, m0.l.c<? super TimedChunkFlow$resultFlow$2> cVar) {
        super(2, cVar);
        this.c = timedChunkFlow;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new TimedChunkFlow$resultFlow$2(this.c, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        List list = (List) obj;
        TimedChunkFlow$resultFlow$2 timedChunkFlow$resultFlow$2 = new TimedChunkFlow$resultFlow$2(this.c, (m0.l.c) obj2);
        i iVar = i.a;
        timedChunkFlow$resultFlow$2.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        TimedChunkFlow<T> timedChunkFlow = this.c;
        ReentrantLock reentrantLock = timedChunkFlow.a;
        reentrantLock.lock();
        try {
            timedChunkFlow.b = new ArrayList();
            return i.a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
