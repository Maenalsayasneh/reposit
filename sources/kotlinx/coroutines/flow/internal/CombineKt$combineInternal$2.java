package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.a;
import m0.n.a.p;
import m0.n.a.q;
import n0.a.f0;
import n0.a.g2.d;
import n0.a.g2.e;

@c(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {57, 79, 82}, m = "invokeSuspend")
/* compiled from: Combine.kt */
public final class CombineKt$combineInternal$2 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object Y1;
    public final /* synthetic */ d<T>[] Z1;
    public final /* synthetic */ a<T[]> a2;
    public final /* synthetic */ q<e<? super R>, T[], m0.l.c<? super i>, Object> b2;
    public Object c;
    public final /* synthetic */ e<R> c2;
    public Object d;
    public int q;
    public int x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombineKt$combineInternal$2(d<? extends T>[] dVarArr, a<T[]> aVar, q<? super e<? super R>, ? super T[], ? super m0.l.c<? super i>, ? extends Object> qVar, e<? super R> eVar, m0.l.c<? super CombineKt$combineInternal$2> cVar) {
        super(2, cVar);
        this.Z1 = dVarArr;
        this.a2 = aVar;
        this.b2 = qVar;
        this.c2 = eVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(this.Z1, this.a2, this.b2, this.c2, cVar);
        combineKt$combineInternal$2.Y1 = obj;
        return combineKt$combineInternal$2;
    }

    public Object invoke(Object obj, Object obj2) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(this.Z1, this.a2, this.b2, this.c2, (m0.l.c) obj2);
        combineKt$combineInternal$2.Y1 = (f0) obj;
        return combineKt$combineInternal$2.invokeSuspend(i.a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: n0.a.h2.t[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: n0.a.h2.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: n0.a.h2.t[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: n0.a.h2.t[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: n0.a.h2.t[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e5 A[LOOP:1: B:30:0x00e5->B:36:0x0105, LOOP_START, PHI: r3 r9 
      PHI: (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:27:0x00e0, B:36:0x0105] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v2 m0.j.l) = (r9v1 m0.j.l), (r9v17 m0.j.l) binds: [B:27:0x00e0, B:36:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 0
            r4 = 2
            r5 = 3
            r6 = 1
            if (r2 == 0) goto L_0x0068
            if (r2 == r6) goto L_0x004b
            if (r2 == r4) goto L_0x0035
            if (r2 != r5) goto L_0x002d
            int r2 = r0.x
            int r3 = r0.q
            java.lang.Object r7 = r0.d
            byte[] r7 = (byte[]) r7
            java.lang.Object r8 = r0.c
            n0.a.f2.d r8 = (n0.a.f2.d) r8
            java.lang.Object r9 = r0.Y1
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            i0.j.f.p.h.d4(r24)
            r10 = r0
        L_0x0026:
            r22 = r3
            r3 = r2
            r2 = r22
            goto L_0x0160
        L_0x002d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0035:
            int r3 = r0.x
            int r2 = r0.q
            java.lang.Object r7 = r0.d
            byte[] r7 = (byte[]) r7
            java.lang.Object r8 = r0.c
            n0.a.f2.d r8 = (n0.a.f2.d) r8
            java.lang.Object r9 = r0.Y1
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            i0.j.f.p.h.d4(r24)
            r10 = r0
            goto L_0x00bd
        L_0x004b:
            int r2 = r0.x
            int r3 = r0.q
            java.lang.Object r7 = r0.d
            byte[] r7 = (byte[]) r7
            java.lang.Object r8 = r0.c
            n0.a.f2.d r8 = (n0.a.f2.d) r8
            java.lang.Object r9 = r0.Y1
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            i0.j.f.p.h.d4(r24)
            r10 = r24
            n0.a.f2.g r10 = (n0.a.f2.g) r10
            java.lang.Object r10 = r10.c
            r14 = r0
            r15 = r9
            goto L_0x00da
        L_0x0068:
            i0.j.f.p.h.d4(r24)
            java.lang.Object r2 = r0.Y1
            n0.a.f0 r2 = (n0.a.f0) r2
            n0.a.g2.d<T>[] r7 = r0.Z1
            int r13 = r7.length
            if (r13 != 0) goto L_0x0077
            m0.i r1 = m0.i.a
            return r1
        L_0x0077:
            java.lang.Object[] r14 = new java.lang.Object[r13]
            n0.a.h2.t r7 = n0.a.g2.d0.n.b
            r8 = 6
            m0.j.g.q(r14, r7, r3, r3, r8)
            r7 = 0
            n0.a.f2.d r21 = m0.r.t.a.r.m.a1.a.d(r13, r7, r7, r8)
            java.util.concurrent.atomic.AtomicInteger r12 = new java.util.concurrent.atomic.AtomicInteger
            r12.<init>(r13)
            if (r13 <= 0) goto L_0x00b5
            r17 = r3
        L_0x008d:
            int r11 = r17 + 1
            r8 = 0
            r9 = 0
            kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 r10 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1
            n0.a.g2.d<T>[] r7 = r0.Z1
            r20 = 0
            r15 = r10
            r16 = r7
            r18 = r12
            r19 = r21
            r15.<init>(r16, r17, r18, r19, r20)
            r15 = 3
            r16 = 0
            r7 = r2
            r3 = r11
            r11 = r15
            r15 = r12
            r12 = r16
            m0.r.t.a.r.m.a1.a.E2(r7, r8, r9, r10, r11, r12)
            if (r3 < r13) goto L_0x00b0
            goto L_0x00b5
        L_0x00b0:
            r17 = r3
            r12 = r15
            r3 = 0
            goto L_0x008d
        L_0x00b5:
            byte[] r7 = new byte[r13]
            r10 = r0
            r2 = r13
            r9 = r14
            r8 = r21
            r3 = 0
        L_0x00bd:
            int r3 = r3 + r6
            byte r3 = (byte) r3
            r10.Y1 = r9
            r10.c = r8
            r10.d = r7
            r10.q = r2
            r10.x = r3
            r10.y = r6
            java.lang.Object r11 = r8.n(r10)
            if (r11 != r1) goto L_0x00d2
            return r1
        L_0x00d2:
            r15 = r9
            r14 = r10
            r10 = r11
            r22 = r3
            r3 = r2
            r2 = r22
        L_0x00da:
            java.lang.Object r9 = n0.a.f2.g.b(r10)
            m0.j.l r9 = (m0.j.l) r9
            if (r9 != 0) goto L_0x00e5
            m0.i r1 = m0.i.a
            return r1
        L_0x00e5:
            int r10 = r9.a
            r11 = r15[r10]
            T r9 = r9.b
            r15[r10] = r9
            n0.a.h2.t r9 = n0.a.g2.d0.n.b
            if (r11 != r9) goto L_0x00f3
            int r3 = r3 + -1
        L_0x00f3:
            byte r9 = r7[r10]
            if (r9 != r2) goto L_0x00f8
            goto L_0x0107
        L_0x00f8:
            byte r9 = (byte) r2
            r7[r10] = r9
            java.lang.Object r9 = r8.m()
            java.lang.Object r9 = n0.a.f2.g.b(r9)
            m0.j.l r9 = (m0.j.l) r9
            if (r9 != 0) goto L_0x00e5
        L_0x0107:
            if (r3 != 0) goto L_0x015b
            m0.n.a.a<T[]> r9 = r14.a2
            java.lang.Object r9 = r9.invoke()
            r13 = r9
            java.lang.Object[] r13 = (java.lang.Object[]) r13
            if (r13 != 0) goto L_0x0133
            m0.n.a.q<n0.a.g2.e<? super R>, T[], m0.l.c<? super m0.i>, java.lang.Object> r9 = r14.b2
            n0.a.g2.e<R> r10 = r14.c2
            r14.Y1 = r15
            r14.c = r8
            r14.d = r7
            r14.q = r3
            r14.x = r2
            r14.y = r4
            java.lang.Object r9 = r9.invoke(r10, r15, r14)
            if (r9 != r1) goto L_0x012b
            return r1
        L_0x012b:
            r10 = r14
            r9 = r15
            r22 = r3
            r3 = r2
            r2 = r22
            goto L_0x00bd
        L_0x0133:
            r11 = 0
            r12 = 0
            r16 = 0
            r17 = 14
            r9 = r15
            r10 = r13
            r4 = r13
            r13 = r16
            r6 = r14
            r14 = r17
            m0.j.g.j(r9, r10, r11, r12, r13, r14)
            m0.n.a.q<n0.a.g2.e<? super R>, T[], m0.l.c<? super m0.i>, java.lang.Object> r9 = r6.b2
            n0.a.g2.e<R> r10 = r6.c2
            r6.Y1 = r15
            r6.c = r8
            r6.d = r7
            r6.q = r3
            r6.x = r2
            r6.y = r5
            java.lang.Object r4 = r9.invoke(r10, r4, r6)
            if (r4 != r1) goto L_0x015c
            return r1
        L_0x015b:
            r6 = r14
        L_0x015c:
            r10 = r6
            r9 = r15
            goto L_0x0026
        L_0x0160:
            r4 = 2
            r6 = 1
            goto L_0x00bd
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
