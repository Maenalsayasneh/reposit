package i0.h.c.t;

import i0.h.a.b.m.a;
import i0.h.a.b.m.g;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public final /* synthetic */ class i0 implements a {
    public final j0 a;
    public final String b;

    public i0(j0 j0Var, String str) {
        this.a = j0Var;
        this.b = str;
    }

    public Object a(g gVar) {
        j0 j0Var = this.a;
        String str = this.b;
        synchronized (j0Var) {
            j0Var.b.remove(str);
        }
        return gVar;
    }
}
