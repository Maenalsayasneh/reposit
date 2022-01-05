package i0.h.a.a.i;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import i0.h.a.a.i.s.h.k;
import i0.h.a.a.i.s.h.o;
import i0.h.a.a.i.s.h.q;
import i0.h.a.a.i.s.i.t;
import java.util.concurrent.Executor;

/* compiled from: DaggerTransportRuntimeComponent */
public final class c extends n {
    public l0.a.a<t> Y1;
    public l0.a.a<SchedulerConfig> Z1;
    public l0.a.a<q> a2;
    public l0.a.a<i0.h.a.a.i.s.c> b2;
    public l0.a.a<Executor> c;
    public l0.a.a<k> c2;
    public l0.a.a<Context> d;
    public l0.a.a<o> d2;
    public l0.a.a<m> e2;
    public l0.a.a q;
    public l0.a.a x;
    public l0.a.a y;

    /* JADX WARNING: type inference failed for: r1v3, types: [i0.h.a.a.i.q.a.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(android.content.Context r17, i0.h.a.a.i.c.a r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r16.<init>()
            i0.h.a.a.i.f r2 = i0.h.a.a.i.f.a.a
            java.lang.Object r3 = i0.h.a.a.i.q.a.a.a
            boolean r3 = r2 instanceof i0.h.a.a.i.q.a.a
            if (r3 == 0) goto L_0x0010
            goto L_0x0016
        L_0x0010:
            i0.h.a.a.i.q.a.a r3 = new i0.h.a.a.i.q.a.a
            r3.<init>(r2)
            r2 = r3
        L_0x0016:
            r0.c = r2
            i0.h.a.a.i.q.a.b r2 = new i0.h.a.a.i.q.a.b
            java.lang.String r3 = "instance cannot be null"
            java.util.Objects.requireNonNull(r1, r3)
            r2.<init>(r1)
            r0.d = r2
            i0.h.a.a.i.u.b r1 = i0.h.a.a.i.u.b.a.a
            i0.h.a.a.i.u.c r3 = i0.h.a.a.i.u.c.a.a
            i0.h.a.a.i.p.i r4 = new i0.h.a.a.i.p.i
            r4.<init>(r2, r1, r3)
            r0.q = r4
            i0.h.a.a.i.p.k r5 = new i0.h.a.a.i.p.k
            r5.<init>(r2, r4)
            boolean r2 = r5 instanceof i0.h.a.a.i.q.a.a
            if (r2 == 0) goto L_0x0039
            goto L_0x003f
        L_0x0039:
            i0.h.a.a.i.q.a.a r2 = new i0.h.a.a.i.q.a.a
            r2.<init>(r5)
            r5 = r2
        L_0x003f:
            r0.x = r5
            l0.a.a<android.content.Context> r2 = r0.d
            i0.h.a.a.i.s.i.e r4 = i0.h.a.a.i.s.i.e.a.a
            i0.h.a.a.i.s.i.f r5 = i0.h.a.a.i.s.i.f.a.a
            i0.h.a.a.i.s.i.a0 r6 = new i0.h.a.a.i.s.i.a0
            r6.<init>(r2, r4, r5)
            r0.y = r6
            i0.h.a.a.i.s.i.g r2 = i0.h.a.a.i.s.i.g.a.a
            i0.h.a.a.i.s.i.u r4 = new i0.h.a.a.i.s.i.u
            r4.<init>(r1, r3, r2, r6)
            boolean r2 = r4 instanceof i0.h.a.a.i.q.a.a
            if (r2 == 0) goto L_0x005b
            r2 = r4
            goto L_0x0060
        L_0x005b:
            i0.h.a.a.i.q.a.a r2 = new i0.h.a.a.i.q.a.a
            r2.<init>(r4)
        L_0x0060:
            r0.Y1 = r2
            i0.h.a.a.i.s.f r4 = new i0.h.a.a.i.s.f
            r4.<init>(r1)
            r0.Z1 = r4
            l0.a.a<android.content.Context> r11 = r0.d
            i0.h.a.a.i.s.g r12 = new i0.h.a.a.i.s.g
            r12.<init>(r11, r2, r4, r3)
            r0.a2 = r12
            l0.a.a<java.util.concurrent.Executor> r13 = r0.c
            l0.a.a r14 = r0.x
            i0.h.a.a.i.s.d r15 = new i0.h.a.a.i.s.d
            r5 = r15
            r6 = r13
            r7 = r14
            r8 = r12
            r9 = r2
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            r0.b2 = r15
            i0.h.a.a.i.s.h.l r10 = new i0.h.a.a.i.s.h.l
            r4 = r10
            r5 = r11
            r6 = r14
            r7 = r2
            r9 = r13
            r14 = r10
            r10 = r2
            r11 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.c2 = r14
            i0.h.a.a.i.s.h.p r9 = new i0.h.a.a.i.s.h.p
            r9.<init>(r13, r2, r12, r2)
            r0.d2 = r9
            i0.h.a.a.i.o r2 = new i0.h.a.a.i.o
            r4 = r2
            r5 = r1
            r6 = r3
            r7 = r15
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            boolean r1 = r2 instanceof i0.h.a.a.i.q.a.a
            if (r1 == 0) goto L_0x00a8
            goto L_0x00ae
        L_0x00a8:
            i0.h.a.a.i.q.a.a r1 = new i0.h.a.a.i.q.a.a
            r1.<init>(r2)
            r2 = r1
        L_0x00ae:
            r0.e2 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.a.i.c.<init>(android.content.Context, i0.h.a.a.i.c$a):void");
    }
}
