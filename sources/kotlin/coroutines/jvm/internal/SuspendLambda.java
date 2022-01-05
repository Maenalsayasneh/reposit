package kotlin.coroutines.jvm.internal;

import m0.l.c;
import m0.n.b.g;
import m0.n.b.i;
import m0.n.b.m;

/* compiled from: ContinuationImpl.kt */
public abstract class SuspendLambda extends ContinuationImpl implements g<Object> {
    private final int arity;

    public SuspendLambda(int i, c<Object> cVar) {
        super(cVar);
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String d = m.d(this);
        i.d(d, "Reflection.renderLambdaToString(this)");
        return d;
    }

    public SuspendLambda(int i) {
        this(i, (c<Object>) null);
    }
}
