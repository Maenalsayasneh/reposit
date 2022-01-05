package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.q;
import n0.a.f0;
import n0.a.g2.d;
import n0.a.g2.e;

@c(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {224, 358}, m = "invokeSuspend")
/* compiled from: Delay.kt */
public final class FlowKt__DelayKt$debounceInternal$1 extends SuspendLambda implements q<f0, e<? super T>, m0.l.c<? super i>, Object> {
    public final /* synthetic */ l<T, Long> Y1;
    public final /* synthetic */ d<T> Z1;
    public Object c;
    public Object d;
    public int q;
    public /* synthetic */ Object x;
    public /* synthetic */ Object y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1(l<? super T, Long> lVar, d<? extends T> dVar, m0.l.c<? super FlowKt__DelayKt$debounceInternal$1> cVar) {
        super(3, cVar);
        this.Y1 = lVar;
        this.Z1 = dVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.Y1, this.Z1, (m0.l.c) obj3);
        flowKt__DelayKt$debounceInternal$1.x = (f0) obj;
        flowKt__DelayKt$debounceInternal$1.y = (e) obj2;
        return flowKt__DelayKt$debounceInternal$1.invokeSuspend(i.a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: n0.a.g2.e} */
    /* JADX WARNING: Can't wrap try/catch for region: R(14:7|29|32|33|34|(1:36)|37|40|(1:42)|(1:44)|10|(12:12|(7:14|(1:16)|17|(1:19)(1:20)|(1:30)(1:(5:23|(1:25)|26|(1:28)|29))|30|31)|32|33|34|(0)|37|40|(0)|(0)|10|(1:45)(0))|45|46) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00df, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e0, code lost:
        r9.K(r1);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c8 A[Catch:{ all -> 0x00df }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f2 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r14.q
            r2 = 1
            r3 = 2
            r4 = 0
            r5 = 0
            if (r1 == 0) goto L_0x0040
            if (r1 == r2) goto L_0x002a
            if (r1 != r3) goto L_0x0022
            java.lang.Object r1 = r14.d
            kotlin.jvm.internal.Ref$LongRef r1 = (kotlin.jvm.internal.Ref$LongRef) r1
            java.lang.Object r1 = r14.c
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            java.lang.Object r6 = r14.y
            n0.a.f2.n r6 = (n0.a.f2.n) r6
            java.lang.Object r7 = r14.x
            n0.a.g2.e r7 = (n0.a.g2.e) r7
            i0.j.f.p.h.d4(r15)
            goto L_0x005d
        L_0x0022:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x002a:
            java.lang.Object r1 = r14.d
            kotlin.jvm.internal.Ref$LongRef r1 = (kotlin.jvm.internal.Ref$LongRef) r1
            java.lang.Object r6 = r14.c
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r7 = r14.y
            n0.a.f2.n r7 = (n0.a.f2.n) r7
            java.lang.Object r8 = r14.x
            n0.a.g2.e r8 = (n0.a.g2.e) r8
            i0.j.f.p.h.d4(r15)
            r15 = r14
            goto L_0x00a6
        L_0x0040:
            i0.j.f.p.h.d4(r15)
            java.lang.Object r15 = r14.x
            n0.a.f0 r15 = (n0.a.f0) r15
            java.lang.Object r1 = r14.y
            r7 = r1
            n0.a.g2.e r7 = (n0.a.g2.e) r7
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1 r1 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1
            n0.a.g2.d<T> r6 = r14.Z1
            r1.<init>(r6, r5)
            r6 = 3
            n0.a.f2.n r6 = kotlinx.coroutines.channels.ProduceKt.c(r15, r5, r4, r1, r6)
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
        L_0x005d:
            r15 = r14
            r8 = r7
            r7 = r6
            r6 = r1
        L_0x0061:
            T r1 = r6.c
            n0.a.h2.t r9 = n0.a.g2.d0.n.c
            if (r1 == r9) goto L_0x00f3
            kotlin.jvm.internal.Ref$LongRef r1 = new kotlin.jvm.internal.Ref$LongRef
            r1.<init>()
            T r9 = r6.c
            if (r9 == 0) goto L_0x00b5
            m0.n.a.l<T, java.lang.Long> r10 = r15.Y1
            n0.a.h2.t r11 = n0.a.g2.d0.n.a
            if (r9 != r11) goto L_0x0077
            r9 = r5
        L_0x0077:
            java.lang.Object r9 = r10.invoke(r9)
            java.lang.Number r9 = (java.lang.Number) r9
            long r9 = r9.longValue()
            r1.c = r9
            r12 = 0
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 < 0) goto L_0x008b
            r10 = r2
            goto L_0x008c
        L_0x008b:
            r10 = r4
        L_0x008c:
            if (r10 == 0) goto L_0x00a9
            if (r9 != 0) goto L_0x00b5
            T r9 = r6.c
            if (r9 != r11) goto L_0x0095
            r9 = r5
        L_0x0095:
            r15.x = r8
            r15.y = r7
            r15.c = r6
            r15.d = r1
            r15.q = r2
            java.lang.Object r9 = r8.emit(r9, r15)
            if (r9 != r0) goto L_0x00a6
            return r0
        L_0x00a6:
            r6.c = r5
            goto L_0x00b5
        L_0x00a9:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Debounce timeout should not be negative"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x00b5:
            r15.x = r8
            r15.y = r7
            r15.c = r6
            r15.d = r1
            r15.q = r3
            n0.a.j2.a r9 = new n0.a.j2.a
            r9.<init>(r15)
            T r10 = r6.c     // Catch:{ all -> 0x00df }
            if (r10 == 0) goto L_0x00d2
            long r10 = r1.c     // Catch:{ all -> 0x00df }
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1 r1 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1     // Catch:{ all -> 0x00df }
            r1.<init>(r8, r6, r5)     // Catch:{ all -> 0x00df }
            r9.L(r10, r1)     // Catch:{ all -> 0x00df }
        L_0x00d2:
            n0.a.j2.b r1 = r7.h()     // Catch:{ all -> 0x00df }
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2 r10 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2     // Catch:{ all -> 0x00df }
            r10.<init>(r6, r8, r5)     // Catch:{ all -> 0x00df }
            r1.d(r9, r10)     // Catch:{ all -> 0x00df }
            goto L_0x00e3
        L_0x00df:
            r1 = move-exception
            r9.K(r1)
        L_0x00e3:
            java.lang.Object r1 = r9.J()
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r1 != r9) goto L_0x00f0
            java.lang.String r9 = "frame"
            m0.n.b.i.e(r15, r9)
        L_0x00f0:
            if (r1 != r0) goto L_0x0061
            return r0
        L_0x00f3:
            m0.i r15 = m0.i.a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
