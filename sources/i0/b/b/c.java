package i0.b.b;

import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.Arrays;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.m;

/* compiled from: Async.kt */
public final class c<T> extends b<T> {
    public final Throwable b;
    public final T c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Throwable th, Object obj, int i) {
        super(true, true, (Object) null, (f) null);
        int i2 = i & 2;
        i.e(th, "error");
        this.b = th;
        this.c = null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        Throwable th = ((c) obj).b;
        if (!i.a(m.a(this.b.getClass()), m.a(th.getClass())) || !i.a(this.b.getMessage(), th.getMessage())) {
            return false;
        }
        StackTraceElement[] stackTrace = this.b.getStackTrace();
        i.d(stackTrace, "error.stackTrace");
        StackTraceElement[] stackTrace2 = th.getStackTrace();
        i.d(stackTrace2, "otherError.stackTrace");
        if (i.a((StackTraceElement) h.I0(stackTrace), (StackTraceElement) h.I0(stackTrace2))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        StackTraceElement[] stackTrace = this.b.getStackTrace();
        i.d(stackTrace, "error.stackTrace");
        return Arrays.hashCode(new Object[]{m.a(this.b.getClass()), this.b.getMessage(), h.I0(stackTrace)});
    }

    public String toString() {
        StringBuilder P0 = a.P0("Fail(error=");
        P0.append(this.b);
        P0.append(", value=");
        P0.append(this.c);
        P0.append(")");
        return P0.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Throwable th, T t) {
        super(true, true, t, (f) null);
        i.e(th, "error");
        this.b = th;
        this.c = t;
    }
}
