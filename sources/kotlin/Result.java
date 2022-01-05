package kotlin;

import i0.d.a.a.a;
import java.io.Serializable;
import m0.n.b.i;

/* compiled from: Result.kt */
public final class Result<T> implements Serializable {
    public final Object c;

    /* compiled from: Result.kt */
    public static final class Failure implements Serializable {
        public final Throwable c;

        public Failure(Throwable th) {
            i.e(th, "exception");
            this.c = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Failure) && i.a(this.c, ((Failure) obj).c);
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            StringBuilder P0 = a.P0("Failure(");
            P0.append(this.c);
            P0.append(')');
            return P0.toString();
        }
    }

    public /* synthetic */ Result(Object obj) {
        this.c = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).c;
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Result) && i.a(this.c, ((Result) obj).c);
    }

    public int hashCode() {
        Object obj = this.c;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object obj = this.c;
        if (obj instanceof Failure) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }
}
