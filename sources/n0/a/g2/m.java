package n0.a.g2;

import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import m0.i;
import m0.l.c;

/* compiled from: Limit.kt */
public final class m implements e<T> {
    public final /* synthetic */ Ref$ObjectRef c;

    public m(Ref$ObjectRef ref$ObjectRef) {
        this.c = ref$ObjectRef;
    }

    public Object emit(T t, c<? super i> cVar) {
        this.c.c = t;
        throw new AbortFlowException(this);
    }
}
