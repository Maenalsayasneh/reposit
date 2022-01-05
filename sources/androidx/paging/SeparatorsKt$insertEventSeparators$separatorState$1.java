package androidx.paging;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.l.f.a.c;
import m0.n.a.q;
import m0.n.b.i;

@c(c = "androidx.paging.SeparatorsKt$insertEventSeparators$separatorState$1", f = "Separators.kt", l = {575}, m = "invokeSuspend")
/* compiled from: Separators.kt */
public final class SeparatorsKt$insertEventSeparators$separatorState$1 extends SuspendLambda implements q<T, T, m0.l.c<? super R>, Object> {
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public int q;
    public final /* synthetic */ q x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SeparatorsKt$insertEventSeparators$separatorState$1(q qVar, m0.l.c cVar) {
        super(3, cVar);
        this.x = qVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        m0.l.c cVar = (m0.l.c) obj3;
        i.e(cVar, "continuation");
        SeparatorsKt$insertEventSeparators$separatorState$1 separatorsKt$insertEventSeparators$separatorState$1 = new SeparatorsKt$insertEventSeparators$separatorState$1(this.x, cVar);
        separatorsKt$insertEventSeparators$separatorState$1.c = obj;
        separatorsKt$insertEventSeparators$separatorState$1.d = obj2;
        return separatorsKt$insertEventSeparators$separatorState$1.invokeSuspend(m0.i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.q;
        if (i == 0) {
            h.d4(obj);
            Object obj2 = this.c;
            Object obj3 = this.d;
            q qVar = this.x;
            this.c = null;
            this.q = 1;
            obj = qVar.invoke(obj2, obj3, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
