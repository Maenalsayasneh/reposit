package com.clubhouse.android.core.storage;

import com.clubhouse.android.core.storage.Store;
import i0.j.f.p.h;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.clubhouse.android.core.storage.Store$applyMutation$1", f = "Store.kt", l = {114}, m = "invokeSuspend")
/* compiled from: Store.kt */
public final class Store$applyMutation$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ l<m0.l.c<? super List<? extends Store.a<I, T>>>, Object> d;
    public final /* synthetic */ Store<I, T> q;
    public final /* synthetic */ List<Store.c<I, T>> x;
    public final /* synthetic */ List<Store.a<I, T>> y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Store$applyMutation$1(l<? super m0.l.c<? super List<? extends Store.a<I, T>>>, ? extends Object> lVar, Store<I, T> store, List<Store.c<I, T>> list, List<? extends Store.a<I, T>> list2, m0.l.c<? super Store$applyMutation$1> cVar) {
        super(2, cVar);
        this.d = lVar;
        this.q = store;
        this.x = list;
        this.y = list2;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new Store$applyMutation$1(this.d, this.q, this.x, this.y, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new Store$applyMutation$1(this.d, this.q, this.x, this.y, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            l<m0.l.c<? super List<? extends Store.a<I, T>>>, Object> lVar = this.d;
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
            } catch (Throwable unused) {
                this.q.g(this.y, this.x);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.q.a((List) obj);
        this.q.g(EmptyList.c, this.x);
        return i.a;
    }
}
