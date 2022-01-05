package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.EmptyCoroutineContext;
import m0.l.c;
import m0.l.e;

/* compiled from: ContinuationImpl.kt */
public abstract class RestrictedContinuationImpl extends BaseContinuationImpl {
    public RestrictedContinuationImpl(c<Object> cVar) {
        super(cVar);
        if (cVar != null) {
            if (!(cVar.getContext() == EmptyCoroutineContext.c)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    public e getContext() {
        return EmptyCoroutineContext.c;
    }
}
