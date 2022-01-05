package m0.m.c;

import m0.n.b.i;

/* compiled from: JDK7PlatformImplementations.kt */
public class a extends m0.m.a {
    public void a(Throwable th, Throwable th2) {
        i.e(th, "cause");
        i.e(th2, "exception");
        th.addSuppressed(th2);
    }
}
