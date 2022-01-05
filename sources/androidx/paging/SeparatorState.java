package androidx.paging;

import h0.u.f0;
import h0.u.m;
import java.util.ArrayList;
import java.util.List;
import m0.l.c;
import m0.n.a.q;
import m0.n.b.i;

/* compiled from: Separators.kt */
public final class SeparatorState<R, T extends R> {
    public final List<f0<T>> a = new ArrayList();
    public boolean b;
    public boolean c;
    public final m d = new m();
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public final TerminalSeparatorType i;
    public final q<T, T, c<? super R>, Object> j;

    public SeparatorState(TerminalSeparatorType terminalSeparatorType, q<? super T, ? super T, ? super c<? super R>, ? extends Object> qVar) {
        i.e(terminalSeparatorType, "terminalSeparatorType");
        i.e(qVar, "generator");
        this.i = terminalSeparatorType;
        this.j = qVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(androidx.paging.PageEvent<T> r6, m0.l.c<? super androidx.paging.PageEvent<R>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.paging.SeparatorState$onEvent$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.paging.SeparatorState$onEvent$1 r0 = (androidx.paging.SeparatorState$onEvent$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.d = r1
            goto L_0x0018
        L_0x0013:
            androidx.paging.SeparatorState$onEvent$1 r0 = new androidx.paging.SeparatorState$onEvent$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r6 = r0.x
            androidx.paging.SeparatorState r6 = (androidx.paging.SeparatorState) r6
            i0.j.f.p.h.d4(r7)
            goto L_0x0111
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            java.lang.Object r6 = r0.x
            androidx.paging.SeparatorState r6 = (androidx.paging.SeparatorState) r6
            i0.j.f.p.h.d4(r7)
            goto L_0x0054
        L_0x003f:
            i0.j.f.p.h.d4(r7)
            boolean r7 = r6 instanceof androidx.paging.PageEvent.Insert
            if (r7 == 0) goto L_0x0058
            androidx.paging.PageEvent$Insert r6 = (androidx.paging.PageEvent.Insert) r6
            r0.x = r5
            r0.d = r4
            java.lang.Object r7 = r5.b(r6, r0)
            if (r7 != r1) goto L_0x0053
            return r1
        L_0x0053:
            r6 = r5
        L_0x0054:
            androidx.paging.PageEvent r7 = (androidx.paging.PageEvent) r7
            goto L_0x0113
        L_0x0058:
            boolean r7 = r6 instanceof androidx.paging.PageEvent.a
            if (r7 == 0) goto L_0x00ab
            r7 = r6
            androidx.paging.PageEvent$a r7 = (androidx.paging.PageEvent.a) r7
            java.lang.String r6 = "event"
            m0.n.b.i.e(r7, r6)
            h0.u.m r6 = r5.d
            androidx.paging.LoadType r0 = r7.a
            h0.u.j$c r1 = h0.u.j.c.c
            r2 = 0
            r6.d(r0, r2, r1)
            androidx.paging.LoadType r6 = r7.a
            androidx.paging.LoadType r0 = androidx.paging.LoadType.PREPEND
            if (r6 != r0) goto L_0x007b
            int r6 = r7.d
            r5.e = r6
            r5.h = r2
            goto L_0x0085
        L_0x007b:
            androidx.paging.LoadType r1 = androidx.paging.LoadType.APPEND
            if (r6 != r1) goto L_0x0085
            int r6 = r7.d
            r5.f = r6
            r5.g = r2
        L_0x0085:
            java.util.List<h0.u.f0<T>> r6 = r5.a
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0096
            androidx.paging.LoadType r6 = r7.a
            if (r6 != r0) goto L_0x0094
            r5.c = r2
            goto L_0x0096
        L_0x0094:
            r5.b = r2
        L_0x0096:
            int r6 = r7.b
            m0.q.e r0 = new m0.q.e
            int r1 = r7.c
            r0.<init>(r6, r1)
            java.util.List<h0.u.f0<T>> r6 = r5.a
            androidx.paging.SeparatorState$onDrop$1 r1 = new androidx.paging.SeparatorState$onDrop$1
            r1.<init>(r0)
            m0.j.g.g0(r6, r1)
            r6 = r5
            goto L_0x0113
        L_0x00ab:
            boolean r7 = r6 instanceof androidx.paging.PageEvent.b
            if (r7 == 0) goto L_0x0146
            androidx.paging.PageEvent$b r6 = (androidx.paging.PageEvent.b) r6
            r0.x = r5
            r0.d = r3
            h0.u.m r7 = r5.d
            androidx.paging.LoadType r2 = r6.a
            boolean r3 = r6.b
            h0.u.j r7 = r7.b(r2, r3)
            h0.u.j r2 = r6.c
            boolean r7 = m0.n.b.i.a(r7, r2)
            if (r7 == 0) goto L_0x00c8
            goto L_0x010c
        L_0x00c8:
            h0.u.m r7 = r5.d
            androidx.paging.LoadType r2 = r6.a
            boolean r3 = r6.b
            h0.u.j r4 = r6.c
            r7.d(r2, r3, r4)
            androidx.paging.LoadType r7 = r6.a
            androidx.paging.LoadType r2 = androidx.paging.LoadType.REFRESH
            if (r7 == r2) goto L_0x010c
            boolean r2 = r6.b
            if (r2 == 0) goto L_0x010c
            h0.u.j r2 = r6.c
            boolean r2 = r2.a
            if (r2 == 0) goto L_0x010c
            androidx.paging.LoadType r6 = androidx.paging.LoadType.PREPEND
            if (r7 != r6) goto L_0x00f8
            androidx.paging.PageEvent$Insert$a r6 = androidx.paging.PageEvent.Insert.b
            kotlin.collections.EmptyList r7 = kotlin.collections.EmptyList.c
            int r2 = r5.e
            h0.u.m r3 = r5.d
            h0.u.b r3 = r3.e()
            androidx.paging.PageEvent$Insert r6 = r6.b(r7, r2, r3)
            goto L_0x0108
        L_0x00f8:
            androidx.paging.PageEvent$Insert$a r6 = androidx.paging.PageEvent.Insert.b
            kotlin.collections.EmptyList r7 = kotlin.collections.EmptyList.c
            int r2 = r5.f
            h0.u.m r3 = r5.d
            h0.u.b r3 = r3.e()
            androidx.paging.PageEvent$Insert r6 = r6.a(r7, r2, r3)
        L_0x0108:
            java.lang.Object r6 = r5.b(r6, r0)
        L_0x010c:
            r7 = r6
            if (r7 != r1) goto L_0x0110
            return r1
        L_0x0110:
            r6 = r5
        L_0x0111:
            androidx.paging.PageEvent r7 = (androidx.paging.PageEvent) r7
        L_0x0113:
            boolean r0 = r6.b
            if (r0 == 0) goto L_0x012c
            java.util.List<h0.u.f0<T>> r0 = r6.a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0120
            goto L_0x012c
        L_0x0120:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "deferred endTerm, page stash should be empty"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x012c:
            boolean r0 = r6.c
            if (r0 == 0) goto L_0x0145
            java.util.List<h0.u.f0<T>> r6 = r6.a
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0139
            goto L_0x0145
        L_0x0139:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "deferred startTerm, page stash should be empty"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x0145:
            return r7
        L_0x0146:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState.a(androidx.paging.PageEvent, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0340, code lost:
        r3.b = r4;
        r3.c = r4;
        r3.h = r5;
        r3.g = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0348, code lost:
        if (r2 != null) goto L_0x034e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x034a, code lost:
        m0.n.b.i.e(r1, "$this$asRType");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0099, code lost:
        r0 = r3;
        r8 = r4;
        r9 = r5;
        r5 = r6;
        r15 = r14;
        r3 = r2;
        r14 = r13;
        r13 = r12;
        r12 = r11;
        r11 = r10;
        r10 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0443, code lost:
        r9 = r8.e;
        r10 = r8.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00d5, code lost:
        r0 = r8;
        r8 = r11;
        r11 = r14;
        r14 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0448, code lost:
        if (r10 == null) goto L_0x0457;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x044a, code lost:
        r10 = (java.lang.Integer) m0.j.g.u(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0450, code lost:
        if (r10 == null) goto L_0x0457;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0452, code lost:
        r10 = r10.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0457, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0458, code lost:
        g0.a.b.b.a.b(r5, r6, (h0.u.f0) null, r8, r9, r10);
        r7 = r1;
        r5 = r2;
        r10 = r12;
        r9 = r13;
        r8 = r15;
        r12 = r18;
        r6 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0468, code lost:
        if (r7 != 0) goto L_0x07af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x046a, code lost:
        m0.n.b.i.c(r9);
        r1 = r9.intValue();
        r2 = r5;
        r13 = r14;
        r14 = r20;
        r5 = 0;
        r26 = r10;
        r10 = r8;
        r8 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x047b, code lost:
        if (r5 >= r1) goto L_0x04cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x047d, code lost:
        r0 = r14.j;
        r3.x = r14;
        r3.y = r13;
        r3.Y1 = r6;
        r3.Z1 = r12;
        r3.a2 = r10;
        r3.b2 = r9;
        r3.c2 = r8;
        r3.d2 = r11;
        r3.e2 = r6;
        r18 = r11;
        r3.f2 = null;
        r3.g2 = r2;
        r3.h2 = r7;
        r3.i2 = r5;
        r3.j2 = r1;
        r3.d = 3;
        r0 = g0.a.b.b.a.X(r13.d.get(r5), r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04ad, code lost:
        if (r0 != r4) goto L_0x04b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04af, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x04b0, code lost:
        r15 = r13;
        r11 = r18;
        r13 = r12;
        r12 = r10;
        r10 = r8;
        r8 = r6;
        r26 = r2;
        r2 = r0;
        r0 = r7;
        r7 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04bd, code lost:
        r8.add(r2);
        r5 = r5 + 1;
        r2 = r7;
        r8 = r10;
        r10 = r12;
        r12 = r13;
        r13 = r15;
        r7 = r0;
        r0 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04cb, code lost:
        r18 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04d1, code lost:
        if (r13.c != androidx.paging.LoadType.APPEND) goto L_0x0557;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04db, code lost:
        if ((!r14.a.isEmpty()) == false) goto L_0x0557;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04dd, code lost:
        r0 = (h0.u.f0) m0.j.g.G(r14.a);
        r1 = r14.j;
        r5 = m0.j.g.G(r0.d);
        m0.n.b.i.c(r10);
        r11 = m0.j.g.u(r10.d);
        r3.x = r14;
        r3.y = r13;
        r3.Y1 = r6;
        r3.Z1 = r12;
        r3.a2 = r10;
        r3.b2 = r9;
        r3.c2 = r8;
        r15 = r18;
        r3.d2 = r15;
        r3.e2 = r0;
        r28 = r0;
        r3.f2 = null;
        r3.g2 = r2;
        r3.h2 = r7;
        r3.d = 4;
        r0 = r1.invoke(r5, r11, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x051a, code lost:
        if (r0 != r4) goto L_0x051d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x051c, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x051d, code lost:
        r1 = r7;
        r11 = r9;
        r18 = r13;
        r19 = r14;
        r9 = r2;
        r14 = r6;
        r13 = r12;
        r12 = r10;
        r10 = r8;
        r8 = r4;
        r4 = r28;
        r26 = r3;
        r3 = r0;
        r0 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0530, code lost:
        r6 = r12.e;
        r2 = r12.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0534, code lost:
        if (r2 == null) goto L_0x0544;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0536, code lost:
        r2 = (java.lang.Integer) m0.j.g.u(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x053c, code lost:
        if (r2 == null) goto L_0x0544;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x053e, code lost:
        r7 = r2.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0544, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0545, code lost:
        g0.a.b.b.a.b(r14, r3, r4, r12, r6, r7);
        r3 = r0;
        r4 = r8;
        r5 = r9;
        r8 = r10;
        r9 = r11;
        r10 = r13;
        r6 = r14;
        r7 = r15;
        r13 = r18;
        r14 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0557, code lost:
        r5 = r2;
        r1 = r7;
        r7 = r18;
        r26 = r12;
        r12 = r10;
        r10 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0561, code lost:
        m0.n.b.i.c(r12);
        r10.add(r14.c(r12));
        r0 = r14.j;
        r3.x = r14;
        r3.y = r13;
        r3.Y1 = r6;
        r3.Z1 = r10;
        r3.a2 = r9;
        r3.b2 = r8;
        r3.c2 = r7;
        r3.d2 = r6;
        r3.e2 = null;
        r3.f2 = null;
        r3.g2 = r5;
        r3.h2 = r1;
        r3.d = 5;
        r2 = g0.a.b.b.a.X(r12, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x058d, code lost:
        if (r2 != r4) goto L_0x0590;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x058f, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0590, code lost:
        r11 = r6;
        r12 = r13;
        r13 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0593, code lost:
        r6.add(r2);
        r0 = r12.d;
        r2 = r9.intValue();
        m0.n.b.i.c(r7);
        r0 = r0.subList(r2, r7.intValue() + 1).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x05b1, code lost:
        if (r0.hasNext() == false) goto L_0x07a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x05b3, code lost:
        r2 = r0.next();
        r14 = r13;
        r13 = r12;
        r12 = r11;
        r11 = r10;
        r10 = r8;
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x05c1, code lost:
        if (r8.hasNext() == false) goto L_0x06cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x05c3, code lost:
        r0 = (h0.u.f0) r8.next();
        r6 = (h0.u.f0) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x05d4, code lost:
        if ((!r0.d.isEmpty()) == false) goto L_0x0672;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x05d6, code lost:
        r2 = r14.j;
        r9 = m0.j.g.G(r6.d);
        r15 = m0.j.g.u(r0.d);
        r3.x = r14;
        r3.y = r13;
        r3.Y1 = r12;
        r3.Z1 = r11;
        r3.a2 = r10;
        r3.b2 = r7;
        r3.c2 = r8;
        r3.d2 = r0;
        r3.e2 = r6;
        r28 = r0;
        r3.f2 = null;
        r3.g2 = r5;
        r3.h2 = r1;
        r3.d = 6;
        r2 = r2.invoke(r9, r15, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0606, code lost:
        if (r2 != r4) goto L_0x0609;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0608, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0609, code lost:
        r0 = r3;
        r9 = r5;
        r15 = r11;
        r18 = r12;
        r19 = r14;
        r11 = r28;
        r3 = r2;
        r12 = r8;
        r14 = r10;
        r8 = r4;
        r10 = r6;
        r26 = r13;
        r13 = r7;
        r7 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x061c, code lost:
        r2 = r7.c;
        r4 = androidx.paging.LoadType.PREPEND;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0620, code lost:
        if (r2 != r4) goto L_0x0625;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0622, code lost:
        r5 = r10.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0625, code lost:
        r5 = r11.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0627, code lost:
        r6 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0628, code lost:
        if (r2 != r4) goto L_0x0644;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x062a, code lost:
        r2 = r10.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x062c, code lost:
        if (r2 == null) goto L_0x063b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x062e, code lost:
        r2 = (java.lang.Integer) m0.j.g.G(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0634, code lost:
        if (r2 == null) goto L_0x063b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0636, code lost:
        r4 = r2.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x063b, code lost:
        r4 = m0.j.g.y(r10.d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0641, code lost:
        r20 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0644, code lost:
        r2 = r11.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0646, code lost:
        if (r2 == null) goto L_0x0655;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0648, code lost:
        r2 = (java.lang.Integer) m0.j.g.u(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x064e, code lost:
        if (r2 == null) goto L_0x0655;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0650, code lost:
        r4 = r2.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0655, code lost:
        r20 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0657, code lost:
        r21 = r7;
        g0.a.b.b.a.b(r18, r3, r10, r11, r6, r20);
        r3 = r0;
        r4 = r8;
        r5 = r9;
        r7 = r10;
        r10 = r11;
        r11 = r12;
        r12 = r13;
        r13 = r14;
        r14 = r15;
        r6 = r18;
        r9 = r19;
        r8 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0672, code lost:
        r9 = r14;
        r14 = r11;
        r11 = r8;
        r8 = r13;
        r13 = r10;
        r10 = r0;
        r26 = r7;
        r7 = r6;
        r6 = r12;
        r12 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0689, code lost:
        if ((!r10.d.isEmpty()) == false) goto L_0x0692;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x068b, code lost:
        r14.add(r9.c(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0692, code lost:
        r0 = r9.j;
        r3.x = r9;
        r3.y = r8;
        r3.Y1 = r6;
        r3.Z1 = r14;
        r3.a2 = r13;
        r3.b2 = r12;
        r3.c2 = r11;
        r3.d2 = r10;
        r3.e2 = r7;
        r3.f2 = r6;
        r3.g2 = r5;
        r3.h2 = r1;
        r3.d = 7;
        r2 = g0.a.b.b.a.X(r10, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x06b3, code lost:
        if (r2 != r4) goto L_0x06b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x06b5, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x06b6, code lost:
        r15 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x06b9, code lost:
        r6.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x06c4, code lost:
        if ((!r10.d.isEmpty()) == false) goto L_0x06c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x06c6, code lost:
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x06c8, code lost:
        r2 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x06c9, code lost:
        r7 = r12;
        r10 = r13;
        r12 = r15;
        r13 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x06d3, code lost:
        if (r13.c != androidx.paging.LoadType.PREPEND) goto L_0x0745;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x06dd, code lost:
        if ((!r14.a.isEmpty()) == false) goto L_0x0745;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x06df, code lost:
        r6 = (h0.u.f0) m0.j.g.u(r14.a);
        r0 = r14.j;
        m0.n.b.i.c(r10);
        r2 = m0.j.g.G(r10.d);
        r8 = m0.j.g.u(r6.d);
        r3.x = r14;
        r3.y = r13;
        r3.Y1 = r12;
        r3.Z1 = r11;
        r3.a2 = r10;
        r3.b2 = r7;
        r3.c2 = r6;
        r3.d2 = null;
        r3.e2 = null;
        r3.f2 = null;
        r3.g2 = r5;
        r3.h2 = r1;
        r3.d = 8;
        r2 = r0.invoke(r2, r8, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x071a, code lost:
        if (r2 != r4) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x071c, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x071d, code lost:
        r6 = r11.e;
        r2 = r11.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0721, code lost:
        if (r2 == null) goto L_0x0730;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0723, code lost:
        r2 = (java.lang.Integer) m0.j.g.G(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0729, code lost:
        if (r2 == null) goto L_0x0730;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x072b, code lost:
        r2 = r2.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0730, code lost:
        r2 = m0.j.g.y(r11.d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0736, code lost:
        g0.a.b.b.a.b(r13, r3, r11, r5, r6, r2);
        r3 = r0;
        r4 = r8;
        r5 = r9;
        r7 = r10;
        r10 = r11;
        r11 = r12;
        r12 = r13;
        r13 = r14;
        r14 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0745, code lost:
        r0 = r7.intValue() + 1;
        r2 = m0.j.g.y(r13.d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0751, code lost:
        if (r0 > r2) goto L_0x07a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0753, code lost:
        r6 = r1;
        r1 = r2;
        r15 = r13;
        r7 = r14;
        r13 = r11;
        r11 = r12;
        r12 = r10;
        r10 = r5;
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x075c, code lost:
        r2 = r7.j;
        r3.x = r7;
        r3.y = r15;
        r3.Y1 = r11;
        r3.Z1 = r13;
        r3.a2 = r12;
        r3.b2 = r11;
        r3.c2 = null;
        r3.d2 = null;
        r3.e2 = null;
        r3.f2 = null;
        r3.g2 = r10;
        r3.h2 = r6;
        r3.i2 = r5;
        r3.j2 = r1;
        r3.d = 9;
        r2 = g0.a.b.b.a.X(r15.d.get(r5), r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x078b, code lost:
        if (r2 != r4) goto L_0x078e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x078d, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x078e, code lost:
        r14 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x078f, code lost:
        r11.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0792, code lost:
        if (r5 == r1) goto L_0x0798;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0794, code lost:
        r5 = r5 + 1;
        r11 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0798, code lost:
        r0 = r3;
        r3 = r7;
        r5 = r10;
        r10 = r12;
        r1 = r14;
        r8 = r15;
        r7 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x07a0, code lost:
        r7 = r1;
        r0 = r3;
        r1 = r12;
        r8 = r13;
        r3 = r14;
        r13 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x07ae, code lost:
        throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x07af, code lost:
        r0 = r3;
        r1 = r6;
        r13 = r12;
        r8 = r14;
        r3 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x07b5, code lost:
        if (r5 == false) goto L_0x0821;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x07b9, code lost:
        if (r3.g != false) goto L_0x0821;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x07bb, code lost:
        r3.g = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x07be, code lost:
        if (r7 == 0) goto L_0x07c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x07c0, code lost:
        r2 = (h0.u.f0) m0.j.g.G(r3.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x07c9, code lost:
        m0.n.b.i.c(r10);
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x07cd, code lost:
        r5 = r3.j;
        r6 = m0.j.g.G(r2.d);
        r0.x = r3;
        r0.y = r8;
        r0.Y1 = r1;
        r0.Z1 = r13;
        r0.a2 = r2;
        r0.b2 = r1;
        r0.c2 = null;
        r0.d2 = null;
        r0.e2 = null;
        r0.f2 = null;
        r0.d = 10;
        r0 = r5.invoke(r6, null, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x07f2, code lost:
        if (r0 != r4) goto L_0x07f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x07f4, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x07f5, code lost:
        r15 = r0;
        r6 = r1;
        r14 = r6;
        r5 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x07f9, code lost:
        r0 = r2.e;
        r1 = r2.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x07ff, code lost:
        if (r1 == null) goto L_0x080e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0801, code lost:
        r1 = (java.lang.Integer) m0.j.g.G(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0807, code lost:
        if (r1 == null) goto L_0x080e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0809, code lost:
        r1 = r1.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x080e, code lost:
        r1 = m0.j.g.y(r2.d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0814, code lost:
        g0.a.b.b.a.b(r14, r15, r2, (h0.u.f0) null, r0, r1);
        r13 = r5;
        r22 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0821, code lost:
        r22 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0823, code lost:
        r3.b = false;
        r3.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x082c, code lost:
        if (r8.c != androidx.paging.LoadType.APPEND) goto L_0x0834;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x082e, code lost:
        r3.a.addAll(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0834, code lost:
        r3.a.addAll(0, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0850, code lost:
        return new androidx.paging.PageEvent.Insert(r8.c, r22, r8.e, r8.f, r8.g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:?, code lost:
        return new androidx.paging.PageEvent.Insert(r1.c, i0.j.f.p.h.L2(g0.a.b.b.a.q0(r2, new int[]{0}, 0, 0)), r1.e, r1.f, r1.g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0248, code lost:
        r2 = (r2 = r2.e).d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(androidx.paging.PageEvent.Insert<T> r28, m0.l.c<? super androidx.paging.PageEvent.Insert<R>> r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            boolean r3 = r2 instanceof androidx.paging.SeparatorState$onInsert$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            androidx.paging.SeparatorState$onInsert$1 r3 = (androidx.paging.SeparatorState$onInsert$1) r3
            int r4 = r3.d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.d = r4
            goto L_0x001e
        L_0x0019:
            androidx.paging.SeparatorState$onInsert$1 r3 = new androidx.paging.SeparatorState$onInsert$1
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r3.d
            java.lang.String r6 = "$this$asRType"
            switch(r5) {
                case 0: goto L_0x020a;
                case 1: goto L_0x01fb;
                case 2: goto L_0x01b9;
                case 3: goto L_0x017c;
                case 4: goto L_0x0140;
                case 5: goto L_0x0117;
                case 6: goto L_0x00db;
                case 7: goto L_0x00a6;
                case 8: goto L_0x0076;
                case 9: goto L_0x0051;
                case 10: goto L_0x0031;
                default: goto L_0x0029;
            }
        L_0x0029:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0031:
            java.lang.Object r1 = r3.b2
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r4 = r3.a2
            h0.u.f0 r4 = (h0.u.f0) r4
            java.lang.Object r5 = r3.Z1
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r6 = r3.Y1
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r8 = r3.y
            androidx.paging.PageEvent$Insert r8 = (androidx.paging.PageEvent.Insert) r8
            java.lang.Object r3 = r3.x
            androidx.paging.SeparatorState r3 = (androidx.paging.SeparatorState) r3
            i0.j.f.p.h.d4(r2)
            r14 = r1
            r15 = r2
            r2 = r4
            goto L_0x07f9
        L_0x0051:
            int r1 = r3.j2
            int r5 = r3.i2
            int r6 = r3.h2
            boolean r10 = r3.g2
            java.lang.Object r11 = r3.b2
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.lang.Object r12 = r3.a2
            h0.u.f0 r12 = (h0.u.f0) r12
            java.lang.Object r13 = r3.Z1
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Object r14 = r3.Y1
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.lang.Object r15 = r3.y
            androidx.paging.PageEvent$Insert r15 = (androidx.paging.PageEvent.Insert) r15
            java.lang.Object r7 = r3.x
            androidx.paging.SeparatorState r7 = (androidx.paging.SeparatorState) r7
            i0.j.f.p.h.d4(r2)
            goto L_0x078f
        L_0x0076:
            int r1 = r3.h2
            boolean r5 = r3.g2
            java.lang.Object r6 = r3.c2
            h0.u.f0 r6 = (h0.u.f0) r6
            java.lang.Object r7 = r3.b2
            java.lang.Integer r7 = (java.lang.Integer) r7
            java.lang.Object r10 = r3.a2
            h0.u.f0 r10 = (h0.u.f0) r10
            java.lang.Object r11 = r3.Z1
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.lang.Object r12 = r3.Y1
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.lang.Object r13 = r3.y
            androidx.paging.PageEvent$Insert r13 = (androidx.paging.PageEvent.Insert) r13
            java.lang.Object r14 = r3.x
            androidx.paging.SeparatorState r14 = (androidx.paging.SeparatorState) r14
            i0.j.f.p.h.d4(r2)
        L_0x0099:
            r0 = r3
            r8 = r4
            r9 = r5
            r5 = r6
            r15 = r14
            r3 = r2
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r7
            goto L_0x071d
        L_0x00a6:
            int r1 = r3.h2
            boolean r5 = r3.g2
            java.lang.Object r6 = r3.f2
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r7 = r3.e2
            h0.u.f0 r7 = (h0.u.f0) r7
            java.lang.Object r10 = r3.d2
            h0.u.f0 r10 = (h0.u.f0) r10
            java.lang.Object r11 = r3.c2
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r12 = r3.b2
            java.lang.Integer r12 = (java.lang.Integer) r12
            java.lang.Object r13 = r3.a2
            h0.u.f0 r13 = (h0.u.f0) r13
            java.lang.Object r14 = r3.Z1
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.lang.Object r15 = r3.Y1
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            java.lang.Object r8 = r3.y
            androidx.paging.PageEvent$Insert r8 = (androidx.paging.PageEvent.Insert) r8
            java.lang.Object r9 = r3.x
            androidx.paging.SeparatorState r9 = (androidx.paging.SeparatorState) r9
            i0.j.f.p.h.d4(r2)
        L_0x00d5:
            r0 = r8
            r8 = r11
            r11 = r14
            r14 = r9
            goto L_0x06b9
        L_0x00db:
            int r1 = r3.h2
            boolean r5 = r3.g2
            java.lang.Object r6 = r3.e2
            h0.u.f0 r6 = (h0.u.f0) r6
            java.lang.Object r7 = r3.d2
            h0.u.f0 r7 = (h0.u.f0) r7
            java.lang.Object r8 = r3.c2
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r3.b2
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.Object r10 = r3.a2
            h0.u.f0 r10 = (h0.u.f0) r10
            java.lang.Object r11 = r3.Z1
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.lang.Object r12 = r3.Y1
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.lang.Object r13 = r3.y
            androidx.paging.PageEvent$Insert r13 = (androidx.paging.PageEvent.Insert) r13
            java.lang.Object r14 = r3.x
            androidx.paging.SeparatorState r14 = (androidx.paging.SeparatorState) r14
            i0.j.f.p.h.d4(r2)
            r0 = r3
            r15 = r11
            r18 = r12
            r19 = r14
            r3 = r2
            r11 = r7
            r12 = r8
            r14 = r10
            r7 = r13
            r8 = r4
            r10 = r6
            r13 = r9
            r9 = r5
            goto L_0x061c
        L_0x0117:
            int r1 = r3.h2
            boolean r5 = r3.g2
            java.lang.Object r6 = r3.d2
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r7 = r3.c2
            java.lang.Integer r7 = (java.lang.Integer) r7
            java.lang.Object r8 = r3.b2
            h0.u.f0 r8 = (h0.u.f0) r8
            java.lang.Object r9 = r3.a2
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.Object r10 = r3.Z1
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.lang.Object r11 = r3.Y1
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.lang.Object r12 = r3.y
            androidx.paging.PageEvent$Insert r12 = (androidx.paging.PageEvent.Insert) r12
            java.lang.Object r13 = r3.x
            androidx.paging.SeparatorState r13 = (androidx.paging.SeparatorState) r13
            i0.j.f.p.h.d4(r2)
            goto L_0x0593
        L_0x0140:
            int r1 = r3.h2
            boolean r5 = r3.g2
            java.lang.Object r6 = r3.e2
            h0.u.f0 r6 = (h0.u.f0) r6
            java.lang.Object r7 = r3.d2
            java.lang.Integer r7 = (java.lang.Integer) r7
            java.lang.Object r8 = r3.c2
            h0.u.f0 r8 = (h0.u.f0) r8
            java.lang.Object r9 = r3.b2
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.Object r10 = r3.a2
            h0.u.f0 r10 = (h0.u.f0) r10
            java.lang.Object r11 = r3.Z1
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.lang.Object r12 = r3.Y1
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.lang.Object r13 = r3.y
            androidx.paging.PageEvent$Insert r13 = (androidx.paging.PageEvent.Insert) r13
            java.lang.Object r14 = r3.x
            androidx.paging.SeparatorState r14 = (androidx.paging.SeparatorState) r14
            i0.j.f.p.h.d4(r2)
            r0 = r3
            r15 = r7
            r18 = r13
            r19 = r14
            r3 = r2
            r13 = r11
            r14 = r12
            r11 = r9
            r12 = r10
            r9 = r5
            r10 = r8
            r8 = r4
            r4 = r6
            goto L_0x0530
        L_0x017c:
            int r1 = r3.j2
            int r5 = r3.i2
            int r6 = r3.h2
            boolean r7 = r3.g2
            java.lang.Object r8 = r3.e2
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r9 = r3.d2
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.Object r10 = r3.c2
            h0.u.f0 r10 = (h0.u.f0) r10
            java.lang.Object r11 = r3.b2
            java.lang.Integer r11 = (java.lang.Integer) r11
            java.lang.Object r12 = r3.a2
            h0.u.f0 r12 = (h0.u.f0) r12
            java.lang.Object r13 = r3.Z1
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Object r14 = r3.Y1
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.lang.Object r15 = r3.y
            androidx.paging.PageEvent$Insert r15 = (androidx.paging.PageEvent.Insert) r15
            r28 = r1
            java.lang.Object r1 = r3.x
            androidx.paging.SeparatorState r1 = (androidx.paging.SeparatorState) r1
            i0.j.f.p.h.d4(r2)
            r0 = r6
            r6 = r14
            r14 = r1
            r1 = r28
            r26 = r11
            r11 = r9
            r9 = r26
            goto L_0x04bd
        L_0x01b9:
            int r1 = r3.h2
            boolean r5 = r3.g2
            java.lang.Object r6 = r3.f2
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r3.e2
            h0.u.f0 r7 = (h0.u.f0) r7
            java.lang.Object r8 = r3.d2
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.Object r9 = r3.c2
            h0.u.f0 r9 = (h0.u.f0) r9
            java.lang.Object r10 = r3.b2
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.Object r11 = r3.a2
            h0.u.f0 r11 = (h0.u.f0) r11
            java.lang.Object r12 = r3.Z1
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.lang.Object r13 = r3.Y1
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Object r14 = r3.y
            androidx.paging.PageEvent$Insert r14 = (androidx.paging.PageEvent.Insert) r14
            java.lang.Object r15 = r3.x
            androidx.paging.SeparatorState r15 = (androidx.paging.SeparatorState) r15
            i0.j.f.p.h.d4(r2)
            r18 = r12
            r19 = r13
            r20 = r15
            r12 = r9
            r13 = r10
            r15 = r11
            r11 = r8
            r8 = r7
            r26 = r6
            r6 = r2
            r2 = r5
            r5 = r26
            goto L_0x0443
        L_0x01fb:
            java.lang.Object r1 = r3.y
            androidx.paging.PageEvent$Insert r1 = (androidx.paging.PageEvent.Insert) r1
            java.lang.Object r3 = r3.x
            androidx.paging.SeparatorState r3 = (androidx.paging.SeparatorState) r3
            i0.j.f.p.h.d4(r2)
            r4 = 0
            r5 = 1
            goto L_0x0340
        L_0x020a:
            i0.j.f.p.h.d4(r2)
            androidx.paging.TerminalSeparatorType r2 = r0.i
            java.lang.String r5 = "$this$terminatesStart"
            m0.n.b.i.e(r1, r5)
            java.lang.String r5 = "terminalSeparatorType"
            m0.n.b.i.e(r2, r5)
            androidx.paging.LoadType r7 = r1.c
            androidx.paging.LoadType r8 = androidx.paging.LoadType.APPEND
            if (r7 != r8) goto L_0x0222
            boolean r2 = r0.c
            goto L_0x0253
        L_0x0222:
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x023a
            r7 = 1
            if (r2 != r7) goto L_0x0234
            h0.u.b r2 = r1.g
            h0.u.k r2 = r2.d
            h0.u.j r2 = r2.d
            boolean r2 = r2.a
            goto L_0x0253
        L_0x0234:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L_0x023a:
            h0.u.b r2 = r1.g
            h0.u.k r7 = r2.d
            h0.u.j r7 = r7.d
            boolean r7 = r7.a
            if (r7 == 0) goto L_0x0252
            h0.u.k r2 = r2.e
            if (r2 == 0) goto L_0x0250
            h0.u.j r2 = r2.d
            if (r2 == 0) goto L_0x0250
            boolean r2 = r2.a
            if (r2 == 0) goto L_0x0252
        L_0x0250:
            r2 = 1
            goto L_0x0253
        L_0x0252:
            r2 = 0
        L_0x0253:
            androidx.paging.TerminalSeparatorType r7 = r0.i
            java.lang.String r8 = "$this$terminatesEnd"
            m0.n.b.i.e(r1, r8)
            m0.n.b.i.e(r7, r5)
            androidx.paging.LoadType r5 = r1.c
            androidx.paging.LoadType r8 = androidx.paging.LoadType.PREPEND
            if (r5 != r8) goto L_0x0266
            boolean r5 = r0.b
            goto L_0x0297
        L_0x0266:
            int r5 = r7.ordinal()
            if (r5 == 0) goto L_0x027e
            r7 = 1
            if (r5 != r7) goto L_0x0278
            h0.u.b r5 = r1.g
            h0.u.k r5 = r5.d
            h0.u.j r5 = r5.e
            boolean r5 = r5.a
            goto L_0x0297
        L_0x0278:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L_0x027e:
            h0.u.b r5 = r1.g
            h0.u.k r7 = r5.d
            h0.u.j r7 = r7.e
            boolean r7 = r7.a
            if (r7 == 0) goto L_0x0296
            h0.u.k r5 = r5.e
            if (r5 == 0) goto L_0x0294
            h0.u.j r5 = r5.e
            if (r5 == 0) goto L_0x0294
            boolean r5 = r5.a
            if (r5 == 0) goto L_0x0296
        L_0x0294:
            r5 = 1
            goto L_0x0297
        L_0x0296:
            r5 = 0
        L_0x0297:
            java.util.List<h0.u.f0<T>> r7 = r1.d
            boolean r8 = r7 instanceof java.util.Collection
            if (r8 == 0) goto L_0x02a5
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x02a5
        L_0x02a3:
            r7 = 1
            goto L_0x02c6
        L_0x02a5:
            java.util.Iterator r7 = r7.iterator()
        L_0x02a9:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x02a3
            java.lang.Object r8 = r7.next()
            h0.u.f0 r8 = (h0.u.f0) r8
            java.util.List<T> r8 = r8.d
            boolean r8 = r8.isEmpty()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x02a9
            r7 = 0
        L_0x02c6:
            boolean r8 = r0.h
            if (r8 == 0) goto L_0x02d5
            androidx.paging.LoadType r8 = r1.c
            androidx.paging.LoadType r9 = androidx.paging.LoadType.PREPEND
            if (r8 != r9) goto L_0x02d5
            if (r7 == 0) goto L_0x02d3
            goto L_0x02d5
        L_0x02d3:
            r8 = 0
            goto L_0x02d6
        L_0x02d5:
            r8 = 1
        L_0x02d6:
            if (r8 == 0) goto L_0x085d
            boolean r8 = r0.g
            if (r8 == 0) goto L_0x02e7
            androidx.paging.LoadType r8 = r1.c
            androidx.paging.LoadType r9 = androidx.paging.LoadType.APPEND
            if (r8 != r9) goto L_0x02e7
            if (r7 == 0) goto L_0x02e5
            goto L_0x02e7
        L_0x02e5:
            r8 = 0
            goto L_0x02e8
        L_0x02e7:
            r8 = 1
        L_0x02e8:
            if (r8 == 0) goto L_0x0851
            h0.u.m r8 = r0.d
            h0.u.b r9 = r1.g
            r8.c(r9)
            androidx.paging.LoadType r8 = r1.c
            androidx.paging.LoadType r9 = androidx.paging.LoadType.APPEND
            if (r8 == r9) goto L_0x02fb
            int r9 = r1.e
            r0.e = r9
        L_0x02fb:
            androidx.paging.LoadType r9 = androidx.paging.LoadType.PREPEND
            if (r8 == r9) goto L_0x0303
            int r8 = r1.f
            r0.f = r8
        L_0x0303:
            if (r7 == 0) goto L_0x0382
            if (r2 != 0) goto L_0x030d
            if (r5 != 0) goto L_0x030d
            m0.n.b.i.e(r1, r6)
            return r1
        L_0x030d:
            boolean r8 = r0.h
            if (r8 == 0) goto L_0x0319
            boolean r8 = r0.g
            if (r8 == 0) goto L_0x0319
            m0.n.b.i.e(r1, r6)
            return r1
        L_0x0319:
            java.util.List<h0.u.f0<T>> r8 = r0.a
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x0382
            if (r2 == 0) goto L_0x036b
            if (r5 == 0) goto L_0x036b
            boolean r7 = r0.h
            if (r7 != 0) goto L_0x036b
            boolean r7 = r0.g
            if (r7 != 0) goto L_0x036b
            m0.n.a.q<T, T, m0.l.c<? super R>, java.lang.Object> r2 = r0.j
            r3.x = r0
            r3.y = r1
            r5 = 1
            r3.d = r5
            r7 = 0
            java.lang.Object r2 = r2.invoke(r7, r7, r3)
            if (r2 != r4) goto L_0x033e
            return r4
        L_0x033e:
            r3 = r0
            r4 = 0
        L_0x0340:
            r3.b = r4
            r3.c = r4
            r3.h = r5
            r3.g = r5
            if (r2 != 0) goto L_0x034e
            m0.n.b.i.e(r1, r6)
            goto L_0x036a
        L_0x034e:
            androidx.paging.LoadType r8 = r1.c
            r3 = 1
            int[] r3 = new int[r3]
            r4 = 0
            r3[r4] = r4
            h0.u.f0 r2 = g0.a.b.b.a.q0(r2, r3, r4, r4)
            java.util.List r9 = i0.j.f.p.h.L2(r2)
            int r10 = r1.e
            int r11 = r1.f
            h0.u.b r12 = r1.g
            androidx.paging.PageEvent$Insert r1 = new androidx.paging.PageEvent$Insert
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12)
        L_0x036a:
            return r1
        L_0x036b:
            if (r5 == 0) goto L_0x0375
            boolean r3 = r0.g
            if (r3 != 0) goto L_0x0375
            r3 = 1
            r0.b = r3
            goto L_0x0376
        L_0x0375:
            r3 = 1
        L_0x0376:
            if (r2 == 0) goto L_0x037e
            boolean r2 = r0.h
            if (r2 != 0) goto L_0x037e
            r0.c = r3
        L_0x037e:
            m0.n.b.i.e(r1, r6)
            return r1
        L_0x0382:
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List<h0.u.f0<T>> r8 = r1.d
            int r8 = r8.size()
            r6.<init>(r8)
            java.util.ArrayList r12 = new java.util.ArrayList
            java.util.List<h0.u.f0<T>> r8 = r1.d
            int r8 = r8.size()
            r12.<init>(r8)
            if (r7 != 0) goto L_0x03ec
            r8 = 0
        L_0x039b:
            java.util.List<h0.u.f0<T>> r9 = r1.d
            int r9 = m0.j.g.y(r9)
            if (r8 >= r9) goto L_0x03b6
            java.util.List<h0.u.f0<T>> r9 = r1.d
            java.lang.Object r9 = r9.get(r8)
            h0.u.f0 r9 = (h0.u.f0) r9
            java.util.List<T> r9 = r9.d
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x03b6
            int r8 = r8 + 1
            goto L_0x039b
        L_0x03b6:
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r8)
            java.util.List<h0.u.f0<T>> r10 = r1.d
            java.lang.Object r8 = r10.get(r8)
            h0.u.f0 r8 = (h0.u.f0) r8
            java.util.List<h0.u.f0<T>> r10 = r1.d
            int r10 = m0.j.g.y(r10)
        L_0x03c9:
            if (r10 <= 0) goto L_0x03de
            java.util.List<h0.u.f0<T>> r11 = r1.d
            java.lang.Object r11 = r11.get(r10)
            h0.u.f0 r11 = (h0.u.f0) r11
            java.util.List<T> r11 = r11.d
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x03de
            int r10 = r10 + -1
            goto L_0x03c9
        L_0x03de:
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r10)
            java.util.List<h0.u.f0<T>> r13 = r1.d
            java.lang.Object r10 = r13.get(r10)
            h0.u.f0 r10 = (h0.u.f0) r10
            goto L_0x03f0
        L_0x03ec:
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x03f0:
            if (r2 == 0) goto L_0x0465
            boolean r2 = r0.h
            if (r2 != 0) goto L_0x0465
            r2 = 1
            r0.h = r2
            if (r7 == 0) goto L_0x0404
            java.util.List<h0.u.f0<T>> r2 = r0.a
            java.lang.Object r2 = m0.j.g.u(r2)
            h0.u.f0 r2 = (h0.u.f0) r2
            goto L_0x0408
        L_0x0404:
            m0.n.b.i.c(r8)
            r2 = r8
        L_0x0408:
            m0.n.a.q<T, T, m0.l.c<? super R>, java.lang.Object> r13 = r0.j
            java.util.List<T> r14 = r2.d
            java.lang.Object r14 = m0.j.g.u(r14)
            r3.x = r0
            r3.y = r1
            r3.Y1 = r6
            r3.Z1 = r12
            r3.a2 = r8
            r3.b2 = r9
            r3.c2 = r10
            r3.d2 = r11
            r3.e2 = r2
            r3.f2 = r6
            r3.g2 = r5
            r3.h2 = r7
            r15 = 2
            r3.d = r15
            r15 = 0
            java.lang.Object r13 = r13.invoke(r15, r14, r3)
            if (r13 != r4) goto L_0x0433
            return r4
        L_0x0433:
            r20 = r0
            r14 = r1
            r19 = r6
            r1 = r7
            r15 = r8
            r18 = r12
            r8 = r2
            r2 = r5
            r5 = r19
            r12 = r10
            r6 = r13
            r13 = r9
        L_0x0443:
            r7 = 0
            int r9 = r8.e
            java.util.List<java.lang.Integer> r10 = r8.f
            if (r10 == 0) goto L_0x0457
            java.lang.Object r10 = m0.j.g.u(r10)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 == 0) goto L_0x0457
            int r10 = r10.intValue()
            goto L_0x0458
        L_0x0457:
            r10 = 0
        L_0x0458:
            g0.a.b.b.a.b(r5, r6, r7, r8, r9, r10)
            r7 = r1
            r5 = r2
            r10 = r12
            r9 = r13
            r8 = r15
            r12 = r18
            r6 = r19
            goto L_0x0468
        L_0x0465:
            r20 = r0
            r14 = r1
        L_0x0468:
            if (r7 != 0) goto L_0x07af
            m0.n.b.i.c(r9)
            int r1 = r9.intValue()
            r2 = r5
            r13 = r14
            r14 = r20
            r5 = 0
            r26 = r10
            r10 = r8
            r8 = r26
        L_0x047b:
            if (r5 >= r1) goto L_0x04cb
            java.util.List<h0.u.f0<T>> r15 = r13.d
            java.lang.Object r15 = r15.get(r5)
            h0.u.f0 r15 = (h0.u.f0) r15
            m0.n.a.q<T, T, m0.l.c<? super R>, java.lang.Object> r0 = r14.j
            r3.x = r14
            r3.y = r13
            r3.Y1 = r6
            r3.Z1 = r12
            r3.a2 = r10
            r3.b2 = r9
            r3.c2 = r8
            r3.d2 = r11
            r3.e2 = r6
            r18 = r11
            r11 = 0
            r3.f2 = r11
            r3.g2 = r2
            r3.h2 = r7
            r3.i2 = r5
            r3.j2 = r1
            r11 = 3
            r3.d = r11
            java.lang.Object r0 = g0.a.b.b.a.X(r15, r0, r3)
            if (r0 != r4) goto L_0x04b0
            return r4
        L_0x04b0:
            r15 = r13
            r11 = r18
            r13 = r12
            r12 = r10
            r10 = r8
            r8 = r6
            r26 = r2
            r2 = r0
            r0 = r7
            r7 = r26
        L_0x04bd:
            r8.add(r2)
            r2 = 1
            int r5 = r5 + r2
            r2 = r7
            r8 = r10
            r10 = r12
            r12 = r13
            r13 = r15
            r7 = r0
            r0 = r27
            goto L_0x047b
        L_0x04cb:
            r18 = r11
            androidx.paging.LoadType r0 = r13.c
            androidx.paging.LoadType r1 = androidx.paging.LoadType.APPEND
            if (r0 != r1) goto L_0x0557
            java.util.List<h0.u.f0<T>> r0 = r14.a
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0557
            java.util.List<h0.u.f0<T>> r0 = r14.a
            java.lang.Object r0 = m0.j.g.G(r0)
            h0.u.f0 r0 = (h0.u.f0) r0
            m0.n.a.q<T, T, m0.l.c<? super R>, java.lang.Object> r1 = r14.j
            java.util.List<T> r5 = r0.d
            java.lang.Object r5 = m0.j.g.G(r5)
            m0.n.b.i.c(r10)
            java.util.List<T> r11 = r10.d
            java.lang.Object r11 = m0.j.g.u(r11)
            r3.x = r14
            r3.y = r13
            r3.Y1 = r6
            r3.Z1 = r12
            r3.a2 = r10
            r3.b2 = r9
            r3.c2 = r8
            r15 = r18
            r3.d2 = r15
            r3.e2 = r0
            r28 = r0
            r0 = 0
            r3.f2 = r0
            r3.g2 = r2
            r3.h2 = r7
            r0 = 4
            r3.d = r0
            java.lang.Object r0 = r1.invoke(r5, r11, r3)
            if (r0 != r4) goto L_0x051d
            return r4
        L_0x051d:
            r1 = r7
            r11 = r9
            r18 = r13
            r19 = r14
            r9 = r2
            r14 = r6
            r13 = r12
            r12 = r10
            r10 = r8
            r8 = r4
            r4 = r28
            r26 = r3
            r3 = r0
            r0 = r26
        L_0x0530:
            int r6 = r12.e
            java.util.List<java.lang.Integer> r2 = r12.f
            if (r2 == 0) goto L_0x0544
            java.lang.Object r2 = m0.j.g.u(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0544
            int r2 = r2.intValue()
            r7 = r2
            goto L_0x0545
        L_0x0544:
            r7 = 0
        L_0x0545:
            r2 = r14
            r5 = r12
            g0.a.b.b.a.b(r2, r3, r4, r5, r6, r7)
            r3 = r0
            r4 = r8
            r5 = r9
            r8 = r10
            r9 = r11
            r10 = r13
            r6 = r14
            r7 = r15
            r13 = r18
            r14 = r19
            goto L_0x0561
        L_0x0557:
            r15 = r18
            r5 = r2
            r1 = r7
            r7 = r15
            r26 = r12
            r12 = r10
            r10 = r26
        L_0x0561:
            m0.n.b.i.c(r12)
            h0.u.f0 r0 = r14.c(r12)
            r10.add(r0)
            m0.n.a.q<T, T, m0.l.c<? super R>, java.lang.Object> r0 = r14.j
            r3.x = r14
            r3.y = r13
            r3.Y1 = r6
            r3.Z1 = r10
            r3.a2 = r9
            r3.b2 = r8
            r3.c2 = r7
            r3.d2 = r6
            r2 = 0
            r3.e2 = r2
            r3.f2 = r2
            r3.g2 = r5
            r3.h2 = r1
            r2 = 5
            r3.d = r2
            java.lang.Object r2 = g0.a.b.b.a.X(r12, r0, r3)
            if (r2 != r4) goto L_0x0590
            return r4
        L_0x0590:
            r11 = r6
            r12 = r13
            r13 = r14
        L_0x0593:
            r6.add(r2)
            java.util.List<h0.u.f0<T>> r0 = r12.d
            int r2 = r9.intValue()
            m0.n.b.i.c(r7)
            int r6 = r7.intValue()
            r9 = 1
            int r6 = r6 + r9
            java.util.List r0 = r0.subList(r2, r6)
            java.util.Iterator r0 = r0.iterator()
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x07a7
            java.lang.Object r2 = r0.next()
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r8
            r8 = r0
        L_0x05bd:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x06cf
            java.lang.Object r0 = r8.next()
            h0.u.f0 r0 = (h0.u.f0) r0
            r6 = r2
            h0.u.f0 r6 = (h0.u.f0) r6
            java.util.List<T> r2 = r0.d
            boolean r2 = r2.isEmpty()
            r9 = 1
            r2 = r2 ^ r9
            if (r2 == 0) goto L_0x0672
            m0.n.a.q<T, T, m0.l.c<? super R>, java.lang.Object> r2 = r14.j
            java.util.List<T> r9 = r6.d
            java.lang.Object r9 = m0.j.g.G(r9)
            java.util.List<T> r15 = r0.d
            java.lang.Object r15 = m0.j.g.u(r15)
            r3.x = r14
            r3.y = r13
            r3.Y1 = r12
            r3.Z1 = r11
            r3.a2 = r10
            r3.b2 = r7
            r3.c2 = r8
            r3.d2 = r0
            r3.e2 = r6
            r28 = r0
            r0 = 0
            r3.f2 = r0
            r3.g2 = r5
            r3.h2 = r1
            r0 = 6
            r3.d = r0
            java.lang.Object r2 = r2.invoke(r9, r15, r3)
            if (r2 != r4) goto L_0x0609
            return r4
        L_0x0609:
            r0 = r3
            r9 = r5
            r15 = r11
            r18 = r12
            r19 = r14
            r11 = r28
            r3 = r2
            r12 = r8
            r14 = r10
            r8 = r4
            r10 = r6
            r26 = r13
            r13 = r7
            r7 = r26
        L_0x061c:
            androidx.paging.LoadType r2 = r7.c
            androidx.paging.LoadType r4 = androidx.paging.LoadType.PREPEND
            if (r2 != r4) goto L_0x0625
            int r5 = r10.e
            goto L_0x0627
        L_0x0625:
            int r5 = r11.e
        L_0x0627:
            r6 = r5
            if (r2 != r4) goto L_0x0644
            java.util.List<java.lang.Integer> r2 = r10.f
            if (r2 == 0) goto L_0x063b
            java.lang.Object r2 = m0.j.g.G(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x063b
            int r4 = r2.intValue()
            goto L_0x0641
        L_0x063b:
            java.util.List<T> r2 = r10.d
            int r4 = m0.j.g.y(r2)
        L_0x0641:
            r20 = r4
            goto L_0x0657
        L_0x0644:
            java.util.List<java.lang.Integer> r2 = r11.f
            if (r2 == 0) goto L_0x0655
            java.lang.Object r2 = m0.j.g.u(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0655
            int r4 = r2.intValue()
            goto L_0x0641
        L_0x0655:
            r20 = 0
        L_0x0657:
            r2 = r18
            r4 = r10
            r5 = r11
            r21 = r7
            r7 = r20
            g0.a.b.b.a.b(r2, r3, r4, r5, r6, r7)
            r3 = r0
            r4 = r8
            r5 = r9
            r7 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r6 = r18
            r9 = r19
            r8 = r21
            goto L_0x0681
        L_0x0672:
            r28 = r0
            r9 = r14
            r14 = r11
            r11 = r8
            r8 = r13
            r13 = r10
            r10 = r28
            r26 = r7
            r7 = r6
            r6 = r12
            r12 = r26
        L_0x0681:
            java.util.List<T> r0 = r10.d
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0692
            h0.u.f0 r0 = r9.c(r10)
            r14.add(r0)
        L_0x0692:
            m0.n.a.q<T, T, m0.l.c<? super R>, java.lang.Object> r0 = r9.j
            r3.x = r9
            r3.y = r8
            r3.Y1 = r6
            r3.Z1 = r14
            r3.a2 = r13
            r3.b2 = r12
            r3.c2 = r11
            r3.d2 = r10
            r3.e2 = r7
            r3.f2 = r6
            r3.g2 = r5
            r3.h2 = r1
            r2 = 7
            r3.d = r2
            java.lang.Object r2 = g0.a.b.b.a.X(r10, r0, r3)
            if (r2 != r4) goto L_0x06b6
            return r4
        L_0x06b6:
            r15 = r6
            goto L_0x00d5
        L_0x06b9:
            r6.add(r2)
            java.util.List<T> r2 = r10.d
            boolean r2 = r2.isEmpty()
            r6 = 1
            r2 = r2 ^ r6
            if (r2 == 0) goto L_0x06c8
            r2 = r10
            goto L_0x06c9
        L_0x06c8:
            r2 = r7
        L_0x06c9:
            r7 = r12
            r10 = r13
            r12 = r15
            r13 = r0
            goto L_0x05bd
        L_0x06cf:
            androidx.paging.LoadType r0 = r13.c
            androidx.paging.LoadType r2 = androidx.paging.LoadType.PREPEND
            if (r0 != r2) goto L_0x0745
            java.util.List<h0.u.f0<T>> r0 = r14.a
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0745
            java.util.List<h0.u.f0<T>> r0 = r14.a
            java.lang.Object r0 = m0.j.g.u(r0)
            r6 = r0
            h0.u.f0 r6 = (h0.u.f0) r6
            m0.n.a.q<T, T, m0.l.c<? super R>, java.lang.Object> r0 = r14.j
            m0.n.b.i.c(r10)
            java.util.List<T> r2 = r10.d
            java.lang.Object r2 = m0.j.g.G(r2)
            java.util.List<T> r8 = r6.d
            java.lang.Object r8 = m0.j.g.u(r8)
            r3.x = r14
            r3.y = r13
            r3.Y1 = r12
            r3.Z1 = r11
            r3.a2 = r10
            r3.b2 = r7
            r3.c2 = r6
            r9 = 0
            r3.d2 = r9
            r3.e2 = r9
            r3.f2 = r9
            r3.g2 = r5
            r3.h2 = r1
            r9 = 8
            r3.d = r9
            java.lang.Object r2 = r0.invoke(r2, r8, r3)
            if (r2 != r4) goto L_0x0099
            return r4
        L_0x071d:
            int r6 = r11.e
            java.util.List<java.lang.Integer> r2 = r11.f
            if (r2 == 0) goto L_0x0730
            java.lang.Object r2 = m0.j.g.G(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0730
            int r2 = r2.intValue()
            goto L_0x0736
        L_0x0730:
            java.util.List<T> r2 = r11.d
            int r2 = m0.j.g.y(r2)
        L_0x0736:
            r7 = r2
            r2 = r13
            r4 = r11
            g0.a.b.b.a.b(r2, r3, r4, r5, r6, r7)
            r3 = r0
            r4 = r8
            r5 = r9
            r7 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
        L_0x0745:
            int r0 = r7.intValue()
            r2 = 1
            int r0 = r0 + r2
            java.util.List<h0.u.f0<T>> r2 = r13.d
            int r2 = m0.j.g.y(r2)
            if (r0 > r2) goto L_0x07a0
            r6 = r1
            r1 = r2
            r15 = r13
            r7 = r14
            r13 = r11
            r11 = r12
            r12 = r10
            r10 = r5
            r5 = r0
        L_0x075c:
            java.util.List<h0.u.f0<T>> r0 = r15.d
            java.lang.Object r0 = r0.get(r5)
            h0.u.f0 r0 = (h0.u.f0) r0
            m0.n.a.q<T, T, m0.l.c<? super R>, java.lang.Object> r2 = r7.j
            r3.x = r7
            r3.y = r15
            r3.Y1 = r11
            r3.Z1 = r13
            r3.a2 = r12
            r3.b2 = r11
            r8 = 0
            r3.c2 = r8
            r3.d2 = r8
            r3.e2 = r8
            r3.f2 = r8
            r3.g2 = r10
            r3.h2 = r6
            r3.i2 = r5
            r3.j2 = r1
            r8 = 9
            r3.d = r8
            java.lang.Object r2 = g0.a.b.b.a.X(r0, r2, r3)
            if (r2 != r4) goto L_0x078e
            return r4
        L_0x078e:
            r14 = r11
        L_0x078f:
            r11.add(r2)
            if (r5 == r1) goto L_0x0798
            int r5 = r5 + 1
            r11 = r14
            goto L_0x075c
        L_0x0798:
            r0 = r3
            r3 = r7
            r5 = r10
            r10 = r12
            r1 = r14
            r8 = r15
            r7 = r6
            goto L_0x07b5
        L_0x07a0:
            r7 = r1
            r0 = r3
            r1 = r12
            r8 = r13
            r3 = r14
            r13 = r11
            goto L_0x07b5
        L_0x07a7:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Empty collection can't be reduced."
            r0.<init>(r1)
            throw r0
        L_0x07af:
            r0 = r3
            r1 = r6
            r13 = r12
            r8 = r14
            r3 = r20
        L_0x07b5:
            if (r5 == 0) goto L_0x0821
            boolean r2 = r3.g
            if (r2 != 0) goto L_0x0821
            r2 = 1
            r3.g = r2
            if (r7 == 0) goto L_0x07c9
            java.util.List<h0.u.f0<T>> r2 = r3.a
            java.lang.Object r2 = m0.j.g.G(r2)
            h0.u.f0 r2 = (h0.u.f0) r2
            goto L_0x07cd
        L_0x07c9:
            m0.n.b.i.c(r10)
            r2 = r10
        L_0x07cd:
            m0.n.a.q<T, T, m0.l.c<? super R>, java.lang.Object> r5 = r3.j
            java.util.List<T> r6 = r2.d
            java.lang.Object r6 = m0.j.g.G(r6)
            r0.x = r3
            r0.y = r8
            r0.Y1 = r1
            r0.Z1 = r13
            r0.a2 = r2
            r0.b2 = r1
            r7 = 0
            r0.c2 = r7
            r0.d2 = r7
            r0.e2 = r7
            r0.f2 = r7
            r9 = 10
            r0.d = r9
            java.lang.Object r0 = r5.invoke(r6, r7, r0)
            if (r0 != r4) goto L_0x07f5
            return r4
        L_0x07f5:
            r15 = r0
            r6 = r1
            r14 = r6
            r5 = r13
        L_0x07f9:
            r17 = 0
            int r0 = r2.e
            java.util.List<java.lang.Integer> r1 = r2.f
            if (r1 == 0) goto L_0x080e
            java.lang.Object r1 = m0.j.g.G(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x080e
            int r1 = r1.intValue()
            goto L_0x0814
        L_0x080e:
            java.util.List<T> r1 = r2.d
            int r1 = m0.j.g.y(r1)
        L_0x0814:
            r19 = r1
            r16 = r2
            r18 = r0
            g0.a.b.b.a.b(r14, r15, r16, r17, r18, r19)
            r13 = r5
            r22 = r6
            goto L_0x0823
        L_0x0821:
            r22 = r1
        L_0x0823:
            r0 = 0
            r3.b = r0
            r3.c = r0
            androidx.paging.LoadType r1 = r8.c
            androidx.paging.LoadType r2 = androidx.paging.LoadType.APPEND
            if (r1 != r2) goto L_0x0834
            java.util.List<h0.u.f0<T>> r0 = r3.a
            r0.addAll(r13)
            goto L_0x0839
        L_0x0834:
            java.util.List<h0.u.f0<T>> r1 = r3.a
            r1.addAll(r0, r13)
        L_0x0839:
            androidx.paging.LoadType r0 = r8.c
            int r1 = r8.e
            int r2 = r8.f
            h0.u.b r3 = r8.g
            androidx.paging.PageEvent$Insert r4 = new androidx.paging.PageEvent$Insert
            r20 = r4
            r21 = r0
            r23 = r1
            r24 = r2
            r25 = r3
            r20.<init>(r21, r22, r23, r24, r25)
            return r4
        L_0x0851:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Additional append event after append state is done"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x085d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Additional prepend event after prepend state is done"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState.b(androidx.paging.PageEvent$Insert, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0025, code lost:
        r7 = (java.lang.Integer) m0.j.g.u(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> h0.u.f0<T> c(h0.u.f0<T> r9) {
        /*
            r8 = this;
            h0.u.f0 r0 = new h0.u.f0
            int[] r1 = r9.c
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.util.List<T> r4 = r9.d
            java.lang.Object r4 = m0.j.g.u(r4)
            r5 = 0
            r3[r5] = r4
            java.util.List<T> r4 = r9.d
            java.lang.Object r4 = m0.j.g.G(r4)
            r6 = 1
            r3[r6] = r4
            java.util.List r3 = m0.j.g.K(r3)
            int r4 = r9.e
            java.lang.Integer[] r2 = new java.lang.Integer[r2]
            java.util.List<java.lang.Integer> r7 = r9.f
            if (r7 == 0) goto L_0x0032
            java.lang.Object r7 = m0.j.g.u(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x0032
            int r7 = r7.intValue()
            goto L_0x0033
        L_0x0032:
            r7 = r5
        L_0x0033:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2[r5] = r7
            java.util.List<java.lang.Integer> r5 = r9.f
            if (r5 == 0) goto L_0x004a
            java.lang.Object r5 = m0.j.g.G(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x004a
            int r9 = r5.intValue()
            goto L_0x0050
        L_0x004a:
            java.util.List<T> r9 = r9.d
            int r9 = m0.j.g.y(r9)
        L_0x0050:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r2[r6] = r9
            java.util.List r9 = m0.j.g.K(r2)
            r0.<init>(r1, r3, r4, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState.c(h0.u.f0):h0.u.f0");
    }
}
