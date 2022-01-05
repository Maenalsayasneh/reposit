package androidx.paging;

import h0.u.a;
import h0.u.c0;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.n.a.q;
import n0.a.g2.d;

@c(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1", f = "FlowExt.kt", l = {76}, m = "invokeSuspend")
/* compiled from: FlowExt.kt */
public final class FlowExtKt$simpleTransformLatest$1 extends SuspendLambda implements p<c0<R>, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ d q;
    public final /* synthetic */ q x;

    @c(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1$1", f = "FlowExt.kt", l = {77}, m = "invokeSuspend")
    /* renamed from: androidx.paging.FlowExtKt$simpleTransformLatest$1$1  reason: invalid class name */
    /* compiled from: FlowExt.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<T, m0.l.c<? super i>, Object> {
        public /* synthetic */ Object c;
        public int d;
        public final /* synthetic */ FlowExtKt$simpleTransformLatest$1 q;

        {
            this.q = r1;
        }

        public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
            m0.n.b.i.e(cVar, "completion");
            AnonymousClass1 r02 = new AnonymousClass1(this.q, aVar, cVar);
            r02.c = obj;
            return r02;
        }

        public final Object invoke(Object obj, Object obj2) {
            m0.l.c cVar = (m0.l.c) obj2;
            m0.n.b.i.e(cVar, "completion");
            AnonymousClass1 r02 = new AnonymousClass1(this.q, aVar, cVar);
            r02.c = obj;
            return r02.invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.d;
            if (i == 0) {
                h.d4(obj);
                Object obj2 = this.c;
                q qVar = this.q.x;
                a aVar = aVar;
                this.d = 1;
                if (qVar.invoke(aVar, obj2, this) == coroutineSingletons) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowExtKt$simpleTransformLatest$1(d dVar, q qVar, m0.l.c cVar) {
        super(2, cVar);
        this.q = dVar;
        this.x = qVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        FlowExtKt$simpleTransformLatest$1 flowExtKt$simpleTransformLatest$1 = new FlowExtKt$simpleTransformLatest$1(this.q, this.x, cVar);
        flowExtKt$simpleTransformLatest$1.c = obj;
        return flowExtKt$simpleTransformLatest$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        FlowExtKt$simpleTransformLatest$1 flowExtKt$simpleTransformLatest$1 = new FlowExtKt$simpleTransformLatest$1(this.q, this.x, cVar);
        flowExtKt$simpleTransformLatest$1.c = obj;
        return flowExtKt$simpleTransformLatest$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            h.d4(obj);
            d dVar = this.q;
            final a aVar = new a((c0) this.c);
            AnonymousClass1 r6 = new AnonymousClass1(this, (m0.l.c) null);
            this.d = 1;
            if (m0.r.t.a.r.m.a1.a.E0(dVar, r6, this) == coroutineSingletons) {
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
