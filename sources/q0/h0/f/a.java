package q0.h0.f;

import m0.n.b.i;

/* compiled from: Task.kt */
public abstract class a {
    public c a;
    public long b = -1;
    public final String c;
    public final boolean d;

    public a(String str, boolean z) {
        i.e(str, "name");
        this.c = str;
        this.d = z;
    }

    public abstract long a();

    public String toString() {
        return this.c;
    }
}
