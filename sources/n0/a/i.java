package n0.a;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.TimeoutCancellationException;
import m0.l.c;
import m0.n.a.p;
import m0.n.b.r;
import m0.r.t.a.r.m.a1.a;

/* compiled from: Builders.kt */
public final /* synthetic */ class i {
    public static final <U, T extends U> Object a(z1<U, ? super T> z1Var, p<? super f0, ? super c<? super T>, ? extends Object> pVar) {
        Object obj;
        Object g02;
        boolean z = false;
        z1Var.q(false, true, new q0(a.K1(z1Var.q.getContext()).C(z1Var.x, z1Var, z1Var.d)));
        if (pVar != null) {
            try {
                r.c(pVar, 2);
                obj = pVar.invoke(z1Var, z1Var);
            } catch (Throwable th) {
                obj = new z(th, false, 2);
            }
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (obj == coroutineSingletons || (g02 = z1Var.g0(obj)) == j1.b) {
                return coroutineSingletons;
            }
            if (g02 instanceof z) {
                Throwable th2 = ((z) g02).b;
                if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).c != z1Var) {
                    z = true;
                }
                if (z) {
                    throw th2;
                } else if (obj instanceof z) {
                    throw ((z) obj).b;
                }
            } else {
                obj = j1.a(g02);
            }
            return obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object b(long r7, m0.n.a.p<? super n0.a.f0, ? super m0.l.c<? super T>, ? extends java.lang.Object> r9, m0.l.c<? super T> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = (kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = new kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.x
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r4) goto L_0x0032
            java.lang.Object r7 = r0.q
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
            java.lang.Object r8 = r0.d
            m0.n.a.p r8 = (m0.n.a.p) r8
            i0.j.f.p.h.d4(r10)     // Catch:{ TimeoutCancellationException -> 0x0030 }
            goto L_0x0067
        L_0x0030:
            r8 = move-exception
            goto L_0x006b
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            i0.j.f.p.h.d4(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L_0x0044
            return r3
        L_0x0044:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            r0.d = r9     // Catch:{ TimeoutCancellationException -> 0x0068 }
            r0.q = r10     // Catch:{ TimeoutCancellationException -> 0x0068 }
            r0.c = r7     // Catch:{ TimeoutCancellationException -> 0x0068 }
            r0.y = r4     // Catch:{ TimeoutCancellationException -> 0x0068 }
            n0.a.z1 r2 = new n0.a.z1     // Catch:{ TimeoutCancellationException -> 0x0068 }
            r2.<init>(r7, r0)     // Catch:{ TimeoutCancellationException -> 0x0068 }
            r10.c = r2     // Catch:{ TimeoutCancellationException -> 0x0068 }
            java.lang.Object r7 = a(r2, r9)     // Catch:{ TimeoutCancellationException -> 0x0068 }
            if (r7 != r1) goto L_0x0063
            java.lang.String r8 = "frame"
            m0.n.b.i.e(r0, r8)     // Catch:{ TimeoutCancellationException -> 0x0068 }
        L_0x0063:
            if (r7 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r10 = r7
        L_0x0067:
            return r10
        L_0x0068:
            r7 = move-exception
            r8 = r7
            r7 = r10
        L_0x006b:
            n0.a.f1 r9 = r8.c
            T r7 = r7.c
            if (r9 != r7) goto L_0x0072
            return r3
        L_0x0072:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.i.b(long, m0.n.a.p, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(m0.l.c<? super m0.i> r8) {
        /*
            m0.l.e r0 = r8.getContext()
            m0.r.t.a.r.m.a1.a.n1(r0)
            m0.l.c r1 = i0.j.f.p.h.b2(r8)
            boolean r2 = r1 instanceof n0.a.h2.g
            r3 = 0
            if (r2 == 0) goto L_0x0013
            n0.a.h2.g r1 = (n0.a.h2.g) r1
            goto L_0x0014
        L_0x0013:
            r1 = r3
        L_0x0014:
            if (r1 != 0) goto L_0x001a
            m0.i r0 = m0.i.a
            goto L_0x0091
        L_0x001a:
            n0.a.d0 r2 = r1.y
            boolean r2 = r2.Q(r0)
            r4 = 1
            if (r2 == 0) goto L_0x002f
            m0.i r2 = m0.i.a
            r1.Z1 = r2
            r1.q = r4
            n0.a.d0 r2 = r1.y
            r2.O(r0, r1)
            goto L_0x008f
        L_0x002f:
            n0.a.d2 r2 = new n0.a.d2
            r2.<init>()
            m0.l.e r0 = r0.plus(r2)
            m0.i r5 = m0.i.a
            r1.Z1 = r5
            r1.q = r4
            n0.a.d0 r6 = r1.y
            r6.O(r0, r1)
            boolean r0 = r2.d
            if (r0 == 0) goto L_0x008f
            n0.a.y1 r0 = n0.a.y1.a
            n0.a.s0 r0 = n0.a.y1.a()
            n0.a.h2.a<n0.a.l0<?>> r2 = r0.y
            r6 = 0
            if (r2 != 0) goto L_0x0053
            goto L_0x0059
        L_0x0053:
            int r7 = r2.b
            int r2 = r2.c
            if (r7 != r2) goto L_0x005b
        L_0x0059:
            r2 = r4
            goto L_0x005c
        L_0x005b:
            r2 = r6
        L_0x005c:
            if (r2 == 0) goto L_0x005f
            goto L_0x0081
        L_0x005f:
            boolean r2 = r0.b0()
            if (r2 == 0) goto L_0x006d
            r1.Z1 = r5
            r1.q = r4
            r0.Y(r1)
            goto L_0x0082
        L_0x006d:
            r0.Z(r4)
            r1.run()     // Catch:{ all -> 0x007a }
        L_0x0073:
            boolean r2 = r0.d0()     // Catch:{ all -> 0x007a }
            if (r2 != 0) goto L_0x0073
            goto L_0x007e
        L_0x007a:
            r2 = move-exception
            r1.f(r2, r3)     // Catch:{ all -> 0x008a }
        L_0x007e:
            r0.T(r4)
        L_0x0081:
            r4 = r6
        L_0x0082:
            if (r4 == 0) goto L_0x0087
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            goto L_0x0091
        L_0x0087:
            m0.i r0 = m0.i.a
            goto L_0x0091
        L_0x008a:
            r8 = move-exception
            r0.T(r4)
            throw r8
        L_0x008f:
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
        L_0x0091:
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r0 != r1) goto L_0x009a
            java.lang.String r2 = "frame"
            m0.n.b.i.e(r8, r2)
        L_0x009a:
            if (r0 != r1) goto L_0x009d
            return r0
        L_0x009d:
            m0.i r8 = m0.i.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.i.c(m0.l.c):java.lang.Object");
    }
}
