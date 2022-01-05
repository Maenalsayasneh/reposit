package kotlin.jvm.internal;

import i0.d.a.a.a;
import m0.n.b.g;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.c;

public class FunctionReference extends CallableReference implements g, m0.r.g {
    private final int arity;
    private final int flags;

    public FunctionReference(int i) {
        this(i, CallableReference.NO_RECEIVER, (Class) null, (String) null, (String) null, 0);
    }

    public c computeReflected() {
        return m.a.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            if (!i.a(getOwner(), functionReference.getOwner()) || !getName().equals(functionReference.getName()) || !getSignature().equals(functionReference.getSignature()) || this.flags != functionReference.flags || this.arity != functionReference.arity || !i.a(getBoundReceiver(), functionReference.getBoundReceiver())) {
                return false;
            }
            return true;
        } else if (obj instanceof m0.r.g) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    public boolean isExternal() {
        return getReflected().isExternal();
    }

    public boolean isInfix() {
        return getReflected().isInfix();
    }

    public boolean isInline() {
        return getReflected().isInline();
    }

    public boolean isOperator() {
        return getReflected().isOperator();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder P0 = a.P0("function ");
        P0.append(getName());
        P0.append(" (Kotlin reflection is not available)");
        return P0.toString();
    }

    public FunctionReference(int i, Object obj) {
        this(i, obj, (Class) null, (String) null, (String) null, 0);
    }

    public m0.r.g getReflected() {
        return (m0.r.g) super.getReflected();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
