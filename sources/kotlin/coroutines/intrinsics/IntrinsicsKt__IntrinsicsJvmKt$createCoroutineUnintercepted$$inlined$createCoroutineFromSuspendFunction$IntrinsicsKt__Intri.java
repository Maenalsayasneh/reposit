package kotlin.coroutines.intrinsics;

import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import m0.l.c;
import m0.n.a.l;
import m0.n.b.r;

/* compiled from: IntrinsicsJvm.kt */
public final class IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1 extends RestrictedContinuationImpl {
    public int c;
    public final /* synthetic */ c d;
    public final /* synthetic */ l q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1(c cVar, c cVar2, l lVar) {
        super(cVar2);
        this.d = cVar;
        this.q = lVar;
    }

    public Object invokeSuspend(Object obj) {
        int i = this.c;
        if (i == 0) {
            this.c = 1;
            h.d4(obj);
            l lVar = this.q;
            Objects.requireNonNull(lVar, "null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            r.c(lVar, 1);
            return lVar.invoke(this);
        } else if (i == 1) {
            this.c = 2;
            h.d4(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
  h.d4(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
