package kotlin.coroutines.jvm.internal;

import m0.l.c;
import m0.n.b.g;
import m0.n.b.i;
import m0.n.b.m;

/* compiled from: ContinuationImpl.kt */
public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements g<Object> {
    public final int c;

    public RestrictedSuspendLambda(int i, c<Object> cVar) {
        super(cVar);
        this.c = i;
    }

    public int getArity() {
        return this.c;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String d = m.d(this);
        i.d(d, "Reflection.renderLambdaToString(this)");
        return d;
    }
}
