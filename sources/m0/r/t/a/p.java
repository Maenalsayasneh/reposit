package m0.r.t.a;

import java.lang.ref.WeakReference;
import m0.n.b.i;

/* compiled from: moduleByClassLoader.kt */
public final class p {
    public final WeakReference<ClassLoader> a;
    public final int b;

    public p(ClassLoader classLoader) {
        i.e(classLoader, "classLoader");
        this.a = new WeakReference<>(classLoader);
        this.b = System.identityHashCode(classLoader);
    }

    public boolean equals(Object obj) {
        return (obj instanceof p) && ((ClassLoader) this.a.get()) == ((ClassLoader) ((p) obj).a.get());
    }

    public int hashCode() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r0.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r1 = this;
            java.lang.ref.WeakReference<java.lang.ClassLoader> r0 = r1.a
            java.lang.Object r0 = r0.get()
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            java.lang.String r0 = "<null>"
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.p.toString():java.lang.String");
    }
}
