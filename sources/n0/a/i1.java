package n0.a;

import kotlinx.coroutines.JobSupport;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;

/* compiled from: JobSupport.kt */
public abstract class i1 extends b0 implements o0, a1 {
    public JobSupport x;

    public final JobSupport J() {
        JobSupport jobSupport = this.x;
        if (jobSupport != null) {
            return jobSupport;
        }
        i.m("job");
        throw null;
    }

    public boolean a() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispose() {
        /*
            r4 = this;
            kotlinx.coroutines.JobSupport r0 = r4.J()
        L_0x0004:
            java.lang.Object r1 = r0.a0()
            boolean r2 = r1 instanceof n0.a.i1
            if (r2 == 0) goto L_0x001a
            if (r1 == r4) goto L_0x000f
            goto L_0x0029
        L_0x000f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.JobSupport.c
            n0.a.r0 r3 = n0.a.j1.g
            boolean r1 = r2.compareAndSet(r0, r1, r3)
            if (r1 == 0) goto L_0x0004
            goto L_0x0029
        L_0x001a:
            boolean r0 = r1 instanceof n0.a.a1
            if (r0 == 0) goto L_0x0029
            n0.a.a1 r1 = (n0.a.a1) r1
            n0.a.m1 r0 = r1.g()
            if (r0 == 0) goto L_0x0029
            r4.E()
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.i1.dispose():void");
    }

    public m1 g() {
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + a.M1(this) + "[job@" + a.M1(J()) + ']';
    }
}
