package kotlin.jvm.internal;

import java.io.Serializable;
import m0.n.b.g;
import m0.n.b.i;
import m0.n.b.m;

/* compiled from: Lambda.kt */
public abstract class Lambda<R> implements g<R>, Serializable {
    private final int arity;

    public Lambda(int i) {
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String h = m.a.h(this);
        i.d(h, "Reflection.renderLambdaToString(this)");
        return h;
    }
}
