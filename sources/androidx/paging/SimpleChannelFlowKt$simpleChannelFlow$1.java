package androidx.paging;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;
import n0.a.g2.e;

@c(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1", f = "SimpleChannelFlow.kt", l = {46}, m = "invokeSuspend")
/* compiled from: SimpleChannelFlow.kt */
public final class SimpleChannelFlowKt$simpleChannelFlow$1 extends SuspendLambda implements p<e<? super T>, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ p q;

    @c(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1", f = "SimpleChannelFlow.kt", l = {64, 65}, m = "invokeSuspend")
    /* renamed from: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1  reason: invalid class name */
    /* compiled from: SimpleChannelFlow.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
        public /* synthetic */ Object c;
        public Object d;
        public int q;
        public final /* synthetic */ SimpleChannelFlowKt$simpleChannelFlow$1 x;

        {
            this.x = r1;
        }

        public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
            m0.n.b.i.e(cVar, "completion");
            AnonymousClass1 r02 = new AnonymousClass1(this.x, eVar, cVar);
            r02.c = obj;
            return r02;
        }

        public final Object invoke(Object obj, Object obj2) {
            m0.l.c cVar = (m0.l.c) obj2;
            m0.n.b.i.e(cVar, "completion");
            AnonymousClass1 r02 = new AnonymousClass1(this.x, eVar, cVar);
            r02.c = obj;
            return r02.invokeSuspend(i.a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x006f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r12.q
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0031
                if (r1 == r4) goto L_0x0021
                if (r1 != r3) goto L_0x0019
                java.lang.Object r1 = r12.d
                n0.a.f2.f r1 = (n0.a.f2.f) r1
                java.lang.Object r5 = r12.c
                n0.a.f1 r5 = (n0.a.f1) r5
                i0.j.f.p.h.d4(r13)
                goto L_0x0053
            L_0x0019:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0021:
                java.lang.Object r1 = r12.d
                n0.a.f2.f r1 = (n0.a.f2.f) r1
                java.lang.Object r5 = r12.c
                n0.a.f1 r5 = (n0.a.f1) r5
                i0.j.f.p.h.d4(r13)
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r12
                goto L_0x0067
            L_0x0031:
                i0.j.f.p.h.d4(r13)
                java.lang.Object r13 = r12.c
                r5 = r13
                n0.a.f0 r5 = (n0.a.f0) r5
                r13 = 0
                r1 = 6
                n0.a.f2.d r13 = m0.r.t.a.r.m.a1.a.d(r13, r2, r2, r1)
                r6 = 0
                r7 = 0
                androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1 r8 = new androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1
                r8.<init>(r12, r13, r2)
                r9 = 3
                r10 = 0
                n0.a.f1 r5 = m0.r.t.a.r.m.a1.a.E2(r5, r6, r7, r8, r9, r10)
                kotlinx.coroutines.channels.AbstractChannel r13 = (kotlinx.coroutines.channels.AbstractChannel) r13
                kotlinx.coroutines.channels.AbstractChannel$a r1 = new kotlinx.coroutines.channels.AbstractChannel$a
                r1.<init>(r13)
            L_0x0053:
                r13 = r12
            L_0x0054:
                r13.c = r5
                r13.d = r1
                r13.q = r4
                java.lang.Object r6 = r1.a(r13)
                if (r6 != r0) goto L_0x0061
                return r0
            L_0x0061:
                r11 = r0
                r0 = r13
                r13 = r6
                r6 = r5
                r5 = r1
                r1 = r11
            L_0x0067:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto L_0x0087
                java.lang.Object r13 = r5.next()
                n0.a.g2.e r7 = r5
                r0.c = r6
                r0.d = r5
                r0.q = r3
                java.lang.Object r13 = r7.emit(r13, r0)
                if (r13 != r1) goto L_0x0082
                return r1
            L_0x0082:
                r13 = r0
                r0 = r1
                r1 = r5
                r5 = r6
                goto L_0x0054
            L_0x0087:
                m0.r.t.a.r.m.a1.a.o0(r6, r2, r4, r2)
                m0.i r13 = m0.i.a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SimpleChannelFlowKt$simpleChannelFlow$1(p pVar, m0.l.c cVar) {
        super(2, cVar);
        this.q = pVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        SimpleChannelFlowKt$simpleChannelFlow$1 simpleChannelFlowKt$simpleChannelFlow$1 = new SimpleChannelFlowKt$simpleChannelFlow$1(this.q, cVar);
        simpleChannelFlowKt$simpleChannelFlow$1.c = obj;
        return simpleChannelFlowKt$simpleChannelFlow$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        SimpleChannelFlowKt$simpleChannelFlow$1 simpleChannelFlowKt$simpleChannelFlow$1 = new SimpleChannelFlowKt$simpleChannelFlow$1(this.q, cVar);
        simpleChannelFlowKt$simpleChannelFlow$1.c = obj;
        return simpleChannelFlowKt$simpleChannelFlow$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            h.d4(obj);
            final e eVar = (e) this.c;
            AnonymousClass1 r1 = new AnonymousClass1(this, (m0.l.c) null);
            this.d = 1;
            if (a.P0(r1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
