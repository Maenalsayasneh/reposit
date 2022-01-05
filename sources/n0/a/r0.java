package n0.a;

import i0.d.a.a.a;

/* compiled from: JobSupport.kt */
public final class r0 implements a1 {
    public final boolean c;

    public r0(boolean z) {
        this.c = z;
    }

    public boolean a() {
        return this.c;
    }

    public m1 g() {
        return null;
    }

    public String toString() {
        return a.x0(a.P0("Empty{"), this.c ? "Active" : "New", '}');
    }
}
