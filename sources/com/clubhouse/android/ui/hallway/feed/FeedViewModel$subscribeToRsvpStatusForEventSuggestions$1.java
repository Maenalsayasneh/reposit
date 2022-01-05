package com.clubhouse.android.ui.hallway.feed;

import i0.e.b.g3.p.c0.v;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;
import n0.a.g2.q;

@c(c = "com.clubhouse.android.ui.hallway.feed.FeedViewModel$subscribeToRsvpStatusForEventSuggestions$1", f = "FeedViewModel.kt", l = {160}, m = "invokeSuspend")
/* compiled from: FeedViewModel.kt */
public final class FeedViewModel$subscribeToRsvpStatusForEventSuggestions$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ FeedViewModel d;

    @c(c = "com.clubhouse.android.ui.hallway.feed.FeedViewModel$subscribeToRsvpStatusForEventSuggestions$1$1", f = "FeedViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.hallway.feed.FeedViewModel$subscribeToRsvpStatusForEventSuggestions$1$1  reason: invalid class name */
    /* compiled from: FeedViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<Map<Integer, ? extends Boolean>, m0.l.c<? super i>, Object> {
        public /* synthetic */ Object c;

        public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(feedViewModel, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            AnonymousClass1 r02 = new AnonymousClass1(feedViewModel, (m0.l.c) obj2);
            r02.c = (Map) obj;
            i iVar = i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            final Map map = (Map) this.c;
            final FeedViewModel feedViewModel = feedViewModel;
            AnonymousClass1 r1 = new l<v, i>() {
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: kotlin.collections.EmptyList} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: kotlin.collections.EmptyList} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: kotlin.collections.EmptyList} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.util.ArrayList} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: kotlin.collections.EmptyList} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: kotlin.collections.EmptyList} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Object invoke(java.lang.Object r31) {
                    /*
                        r30 = this;
                        r0 = r30
                        r1 = r31
                        i0.e.b.g3.p.c0.v r1 = (i0.e.b.g3.p.c0.v) r1
                        java.lang.String r2 = "state"
                        m0.n.b.i.e(r1, r2)
                        i0.b.b.b<java.util.List<i0.e.b.b3.a.a.d.a.e>> r2 = r1.a
                        java.lang.Object r2 = r2.a()
                        java.util.List r2 = (java.util.List) r2
                        if (r2 == 0) goto L_0x00c1
                        i0.b.b.b<java.util.List<i0.e.b.b3.a.a.d.a.e>> r1 = r1.a
                        java.lang.Object r1 = r1.a()
                        java.util.List r1 = (java.util.List) r1
                        if (r1 != 0) goto L_0x0022
                        r2 = 0
                        goto L_0x00b1
                    L_0x0022:
                        java.util.Map<java.lang.Integer, java.lang.Boolean> r3 = r3
                        java.util.ArrayList r4 = new java.util.ArrayList
                        r5 = 10
                        int r5 = i0.j.f.p.h.K(r1, r5)
                        r4.<init>(r5)
                        java.util.Iterator r1 = r1.iterator()
                    L_0x0033:
                        boolean r5 = r1.hasNext()
                        if (r5 == 0) goto L_0x00b0
                        java.lang.Object r5 = r1.next()
                        i0.e.b.b3.a.a.d.a.e r5 = (i0.e.b.b3.a.a.d.a.e) r5
                        boolean r6 = r5 instanceof i0.e.b.b3.a.a.d.a.c
                        if (r6 == 0) goto L_0x00ab
                        i0.e.b.b3.a.a.d.a.c r5 = (i0.e.b.b3.a.a.d.a.c) r5
                        java.util.List<com.clubhouse.android.data.models.local.EventInClub> r6 = r5.b
                        java.util.List r6 = m0.j.g.A0(r6)
                        r7 = 0
                        r8 = r6
                        java.util.ArrayList r8 = (java.util.ArrayList) r8
                        java.util.Iterator r9 = r8.iterator()
                    L_0x0053:
                        boolean r10 = r9.hasNext()
                        if (r10 == 0) goto L_0x00a4
                        java.lang.Object r10 = r9.next()
                        int r11 = r7 + 1
                        if (r7 < 0) goto L_0x009f
                        com.clubhouse.android.data.models.local.EventInClub r10 = (com.clubhouse.android.data.models.local.EventInClub) r10
                        r12 = r10
                        r13 = 0
                        r14 = 0
                        r15 = 0
                        int r10 = r10.Y1
                        java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                        java.lang.Object r10 = r3.get(r10)
                        java.lang.Boolean r2 = java.lang.Boolean.TRUE
                        boolean r2 = m0.n.b.i.a(r10, r2)
                        java.lang.Boolean r16 = java.lang.Boolean.valueOf(r2)
                        r17 = 0
                        r18 = 0
                        r19 = 0
                        r20 = 0
                        r21 = 0
                        r22 = 0
                        r23 = 0
                        r24 = 0
                        r25 = 0
                        r26 = 0
                        r27 = 0
                        r28 = 0
                        r29 = 65527(0xfff7, float:9.1823E-41)
                        com.clubhouse.android.data.models.local.EventInClub r2 = com.clubhouse.android.data.models.local.EventInClub.d(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
                        r8.set(r7, r2)
                        r7 = r11
                        goto L_0x0053
                    L_0x009f:
                        m0.j.g.r0()
                        r2 = 0
                        throw r2
                    L_0x00a4:
                        r2 = 0
                        r7 = 1
                        i0.e.b.b3.a.a.d.a.c r5 = i0.e.b.b3.a.a.d.a.c.a(r5, r2, r6, r7)
                        goto L_0x00ac
                    L_0x00ab:
                        r2 = 0
                    L_0x00ac:
                        r4.add(r5)
                        goto L_0x0033
                    L_0x00b0:
                        r2 = r4
                    L_0x00b1:
                        if (r2 != 0) goto L_0x00b5
                        kotlin.collections.EmptyList r2 = kotlin.collections.EmptyList.c
                    L_0x00b5:
                        com.clubhouse.android.ui.hallway.feed.FeedViewModel r1 = r0
                        com.clubhouse.android.ui.hallway.feed.FeedViewModel$subscribeToRsvpStatusForEventSuggestions$1$1$1$1 r3 = new com.clubhouse.android.ui.hallway.feed.FeedViewModel$subscribeToRsvpStatusForEventSuggestions$1$1$1$1
                        r3.<init>(r2)
                        int r2 = com.clubhouse.android.ui.hallway.feed.FeedViewModel.m
                        r1.m(r3)
                    L_0x00c1:
                        m0.i r1 = m0.i.a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.hallway.feed.FeedViewModel$subscribeToRsvpStatusForEventSuggestions$1.AnonymousClass1.AnonymousClass1.invoke(java.lang.Object):java.lang.Object");
                }
            };
            int i = FeedViewModel.m;
            feedViewModel.n(r1);
            return i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedViewModel$subscribeToRsvpStatusForEventSuggestions$1(FeedViewModel feedViewModel, m0.l.c<? super FeedViewModel$subscribeToRsvpStatusForEventSuggestions$1> cVar) {
        super(2, cVar);
        this.d = feedViewModel;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new FeedViewModel$subscribeToRsvpStatusForEventSuggestions$1(this.d, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new FeedViewModel$subscribeToRsvpStatusForEventSuggestions$1(this.d, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            final FeedViewModel feedViewModel = this.d;
            q<Map<Integer, Boolean>> qVar = feedViewModel.v.c.a;
            AnonymousClass1 r3 = new AnonymousClass1((m0.l.c<? super AnonymousClass1>) null);
            this.c = 1;
            if (a.E0(qVar, r3, this) == coroutineSingletons) {
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
