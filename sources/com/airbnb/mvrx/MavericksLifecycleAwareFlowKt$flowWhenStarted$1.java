package com.airbnb.mvrx;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;
import n0.a.g2.d;
import n0.a.g2.e;

@c(c = "com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1", f = "MavericksLifecycleAwareFlow.kt", l = {29}, m = "invokeSuspend")
/* compiled from: MavericksLifecycleAwareFlow.kt */
public final class MavericksLifecycleAwareFlowKt$flowWhenStarted$1 extends SuspendLambda implements p<e<? super T>, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ d q;
    public final /* synthetic */ h0.q.p x;

    @c(c = "com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1", f = "MavericksLifecycleAwareFlow.kt", l = {99}, m = "invokeSuspend")
    /* renamed from: com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1  reason: invalid class name */
    /* compiled from: MavericksLifecycleAwareFlow.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
        public Object Y1;
        public Object Z1;
        public int a2;
        public final /* synthetic */ MavericksLifecycleAwareFlowKt$flowWhenStarted$1 b2;
        public /* synthetic */ Object c;
        public Object d;
        public Object q;
        public Object x;
        public Object y;

        {
            this.b2 = r1;
        }

        public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
            m0.n.b.i.e(cVar, "completion");
            AnonymousClass1 r02 = new AnonymousClass1(this.b2, eVar, cVar);
            r02.c = obj;
            return r02;
        }

        public final Object invoke(Object obj, Object obj2) {
            m0.l.c cVar = (m0.l.c) obj2;
            m0.n.b.i.e(cVar, "completion");
            AnonymousClass1 r02 = new AnonymousClass1(this.b2, eVar, cVar);
            r02.c = obj;
            return r02.invokeSuspend(i.a);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(13:9|10|11|12|13|14|15|16|17|24|(1:26)(1:27)|(1:29)(4:30|31|7|(1:32)(0))|29) */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0119, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x011b, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x011c, code lost:
            r16 = r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0128, code lost:
            r3.K(r0);
         */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0133  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x013b  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0140  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x00a2  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                r21 = this;
                r1 = r21
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r1.a2
                r3 = 1
                if (r2 == 0) goto L_0x003c
                if (r2 != r3) goto L_0x0034
                java.lang.Object r2 = r1.Z1
                com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1 r2 = (com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1.AnonymousClass1) r2
                java.lang.Object r2 = r1.Y1
                kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref$BooleanRef) r2
                java.lang.Object r4 = r1.y
                kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
                java.lang.Object r5 = r1.x
                kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref$ObjectRef) r5
                java.lang.Object r6 = r1.q
                m0.n.a.q r6 = (m0.n.a.q) r6
                java.lang.Object r7 = r1.d
                n0.a.f2.n r7 = (n0.a.f2.n) r7
                java.lang.Object r8 = r1.c
                kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref$ObjectRef) r8
                i0.j.f.p.h.d4(r22)
                r9 = r1
                r13 = r2
                r14 = r4
                r15 = r5
                r12 = r6
                r11 = r7
                r10 = r8
                r2 = r0
                goto L_0x0147
            L_0x0034:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x003c:
                i0.j.f.p.h.d4(r22)
                java.lang.Object r2 = r1.c
                n0.a.f0 r2 = (n0.a.f0) r2
                kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
                r4.<init>()
                com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1 r5 = r1.b2
                h0.q.p r5 = r5.x
                androidx.lifecycle.Lifecycle r5 = r5.getLifecycle()
                java.lang.String r6 = "owner.lifecycle"
                m0.n.b.i.d(r5, r6)
                r6 = -1
                r7 = 6
                r8 = 0
                n0.a.f2.d r6 = m0.r.t.a.r.m.a1.a.d(r6, r8, r8, r7)
                com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$startedChannel$observer$1 r7 = new com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$startedChannel$observer$1
                r7.<init>(r6)
                r5.a(r7)
                com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$startedChannel$1 r9 = new com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$startedChannel$1
                r9.<init>(r5, r7)
                r5 = r6
                n0.a.f2.b r5 = (n0.a.f2.b) r5
                r5.r(r9)
                r4.c = r6
                com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$flowChannel$1 r5 = new com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$flowChannel$1
                r5.<init>(r1, r8)
                r6 = 3
                r7 = 0
                n0.a.f2.n r2 = kotlinx.coroutines.channels.ProduceKt.c(r2, r8, r7, r5, r6)
                com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$transform$1 r5 = new com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$transform$1
                r5.<init>(r1, r8)
                kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
                r6.<init>()
                r6.c = r8
                kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
                r9.<init>()
                r9.c = r8
                kotlin.jvm.internal.Ref$BooleanRef r8 = new kotlin.jvm.internal.Ref$BooleanRef
                r8.<init>()
                r8.c = r7
                r11 = r2
                r10 = r4
                r12 = r5
                r15 = r6
                r13 = r8
                r14 = r9
                r2 = r0
                r9 = r1
            L_0x009e:
                boolean r0 = r13.c
                if (r0 != 0) goto L_0x014c
                r9.c = r10
                r9.d = r11
                r9.q = r12
                r9.x = r15
                r9.y = r14
                r9.Y1 = r13
                r9.Z1 = r9
                r9.a2 = r3
                n0.a.j2.a r8 = new n0.a.j2.a
                r8.<init>(r9)
                T r0 = r10.c     // Catch:{ all -> 0x011f }
                n0.a.f2.d r0 = (n0.a.f2.d) r0     // Catch:{ all -> 0x011f }
                com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$$inlined$select$lambda$1 r16 = new com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$$inlined$select$lambda$1     // Catch:{ all -> 0x011f }
                r5 = 0
                r4 = r16
                r6 = r10
                r7 = r15
                r3 = r8
                r8 = r14
                r17 = r9
                r9 = r12
                r18 = r10
                r10 = r11
                r19 = r11
                r11 = r13
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x011b }
                n0.a.j2.b r0 = r0.j()     // Catch:{ all -> 0x011b }
                com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$$inlined$select$lambda$2 r11 = new com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$$inlined$select$lambda$2     // Catch:{ all -> 0x011b }
                r6 = 0
                r4 = r11
                r5 = r16
                r7 = r18
                r8 = r15
                r9 = r14
                r10 = r12
                r20 = r11
                r11 = r19
                r16 = r12
                r12 = r13
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0119 }
                r4 = r20
                r0.d(r3, r4)     // Catch:{ all -> 0x0119 }
                com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$$inlined$select$lambda$3 r0 = new com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$$inlined$select$lambda$3     // Catch:{ all -> 0x0119 }
                r5 = 0
                r4 = r0
                r6 = r18
                r7 = r15
                r8 = r14
                r9 = r16
                r10 = r19
                r11 = r13
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0119 }
                n0.a.j2.b r12 = r19.j()     // Catch:{ all -> 0x0119 }
                com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$$inlined$select$lambda$4 r11 = new com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$$inlined$select$lambda$4     // Catch:{ all -> 0x0119 }
                r6 = 0
                r4 = r11
                r5 = r0
                r7 = r18
                r8 = r15
                r9 = r14
                r10 = r16
                r0 = r11
                r11 = r19
                r1 = r12
                r12 = r13
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0119 }
                r1.d(r3, r0)     // Catch:{ all -> 0x0119 }
                goto L_0x012b
            L_0x0119:
                r0 = move-exception
                goto L_0x0128
            L_0x011b:
                r0 = move-exception
            L_0x011c:
                r16 = r12
                goto L_0x0128
            L_0x011f:
                r0 = move-exception
                r3 = r8
                r17 = r9
                r18 = r10
                r19 = r11
                goto L_0x011c
            L_0x0128:
                r3.K(r0)
            L_0x012b:
                java.lang.Object r0 = r3.J()
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                if (r0 != r1) goto L_0x013b
                java.lang.String r1 = "frame"
                r3 = r17
                m0.n.b.i.e(r3, r1)
                goto L_0x013d
            L_0x013b:
                r3 = r17
            L_0x013d:
                if (r0 != r2) goto L_0x0140
                return r2
            L_0x0140:
                r9 = r3
                r12 = r16
                r10 = r18
                r11 = r19
            L_0x0147:
                r1 = r21
                r3 = 1
                goto L_0x009e
            L_0x014c:
                m0.i r0 = m0.i.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MavericksLifecycleAwareFlowKt$flowWhenStarted$1(d dVar, h0.q.p pVar, m0.l.c cVar) {
        super(2, cVar);
        this.q = dVar;
        this.x = pVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        MavericksLifecycleAwareFlowKt$flowWhenStarted$1 mavericksLifecycleAwareFlowKt$flowWhenStarted$1 = new MavericksLifecycleAwareFlowKt$flowWhenStarted$1(this.q, this.x, cVar);
        mavericksLifecycleAwareFlowKt$flowWhenStarted$1.c = obj;
        return mavericksLifecycleAwareFlowKt$flowWhenStarted$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        MavericksLifecycleAwareFlowKt$flowWhenStarted$1 mavericksLifecycleAwareFlowKt$flowWhenStarted$1 = new MavericksLifecycleAwareFlowKt$flowWhenStarted$1(this.q, this.x, cVar);
        mavericksLifecycleAwareFlowKt$flowWhenStarted$1.c = obj;
        return mavericksLifecycleAwareFlowKt$flowWhenStarted$1.invokeSuspend(i.a);
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
