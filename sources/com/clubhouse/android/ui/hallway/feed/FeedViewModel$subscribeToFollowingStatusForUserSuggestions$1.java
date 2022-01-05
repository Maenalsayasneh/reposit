package com.clubhouse.android.ui.hallway.feed;

import i0.e.b.g3.p.c0.v;
import i0.j.f.p.h;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;
import n0.a.g2.d;

@c(c = "com.clubhouse.android.ui.hallway.feed.FeedViewModel$subscribeToFollowingStatusForUserSuggestions$1", f = "FeedViewModel.kt", l = {185}, m = "invokeSuspend")
/* compiled from: FeedViewModel.kt */
public final class FeedViewModel$subscribeToFollowingStatusForUserSuggestions$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ FeedViewModel d;

    @c(c = "com.clubhouse.android.ui.hallway.feed.FeedViewModel$subscribeToFollowingStatusForUserSuggestions$1$1", f = "FeedViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.hallway.feed.FeedViewModel$subscribeToFollowingStatusForUserSuggestions$1$1  reason: invalid class name */
    /* compiled from: FeedViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<Set<? extends Integer>, m0.l.c<? super i>, Object> {
        public /* synthetic */ Object c;

        public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(feedViewModel, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            AnonymousClass1 r02 = new AnonymousClass1(feedViewModel, (m0.l.c) obj2);
            r02.c = (Set) obj;
            i iVar = i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            final Set set = (Set) this.c;
            final FeedViewModel feedViewModel = feedViewModel;
            AnonymousClass1 r1 = new l<v, i>() {
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: kotlin.collections.EmptyList} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: kotlin.collections.EmptyList} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: kotlin.collections.EmptyList} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: kotlin.collections.EmptyList} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.util.ArrayList} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: kotlin.collections.EmptyList} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Object invoke(java.lang.Object r20) {
                    /*
                        r19 = this;
                        r0 = r19
                        r1 = r20
                        i0.e.b.g3.p.c0.v r1 = (i0.e.b.g3.p.c0.v) r1
                        java.lang.String r2 = "state"
                        m0.n.b.i.e(r1, r2)
                        i0.b.b.b<java.util.List<i0.e.b.b3.a.a.d.a.e>> r2 = r1.a
                        java.lang.Object r2 = r2.a()
                        java.util.List r2 = (java.util.List) r2
                        if (r2 == 0) goto L_0x00aa
                        i0.b.b.b<java.util.List<i0.e.b.b3.a.a.d.a.e>> r1 = r1.a
                        java.lang.Object r1 = r1.a()
                        java.util.List r1 = (java.util.List) r1
                        r2 = 0
                        if (r1 != 0) goto L_0x0022
                        goto L_0x009a
                    L_0x0022:
                        java.util.Set<java.lang.Integer> r3 = r3
                        java.util.ArrayList r4 = new java.util.ArrayList
                        r5 = 10
                        int r5 = i0.j.f.p.h.K(r1, r5)
                        r4.<init>(r5)
                        java.util.Iterator r1 = r1.iterator()
                    L_0x0033:
                        boolean r5 = r1.hasNext()
                        if (r5 == 0) goto L_0x0099
                        java.lang.Object r5 = r1.next()
                        i0.e.b.b3.a.a.d.a.e r5 = (i0.e.b.b3.a.a.d.a.e) r5
                        boolean r6 = r5 instanceof i0.e.b.b3.a.a.d.a.j
                        if (r6 == 0) goto L_0x0095
                        i0.e.b.b3.a.a.d.a.j r5 = (i0.e.b.b3.a.a.d.a.j) r5
                        java.util.List<i0.e.b.b3.b.e.m> r6 = r5.b
                        java.util.List r6 = m0.j.g.A0(r6)
                        r7 = 0
                        r8 = r6
                        java.util.ArrayList r8 = (java.util.ArrayList) r8
                        java.util.Iterator r9 = r8.iterator()
                    L_0x0053:
                        boolean r10 = r9.hasNext()
                        if (r10 == 0) goto L_0x0083
                        java.lang.Object r10 = r9.next()
                        int r11 = r7 + 1
                        if (r7 < 0) goto L_0x007f
                        r12 = r10
                        i0.e.b.b3.b.e.m r12 = (i0.e.b.b3.b.e.m) r12
                        r13 = 0
                        r14 = 0
                        com.clubhouse.android.data.models.local.user.UserInList r10 = r12.g
                        java.lang.Integer r10 = r10.getId()
                        boolean r15 = r3.contains(r10)
                        r16 = 0
                        r17 = 0
                        r18 = 27
                        i0.e.b.b3.b.e.m r10 = i0.e.b.b3.b.e.m.g(r12, r13, r14, r15, r16, r17, r18)
                        r8.set(r7, r10)
                        r7 = r11
                        goto L_0x0053
                    L_0x007f:
                        m0.j.g.r0()
                        throw r2
                    L_0x0083:
                        java.lang.String r5 = r5.a
                        java.lang.String r7 = "title"
                        m0.n.b.i.e(r5, r7)
                        java.lang.String r7 = "users"
                        m0.n.b.i.e(r6, r7)
                        i0.e.b.b3.a.a.d.a.j r7 = new i0.e.b.b3.a.a.d.a.j
                        r7.<init>(r5, r6)
                        r5 = r7
                    L_0x0095:
                        r4.add(r5)
                        goto L_0x0033
                    L_0x0099:
                        r2 = r4
                    L_0x009a:
                        if (r2 != 0) goto L_0x009e
                        kotlin.collections.EmptyList r2 = kotlin.collections.EmptyList.c
                    L_0x009e:
                        com.clubhouse.android.ui.hallway.feed.FeedViewModel r1 = r0
                        com.clubhouse.android.ui.hallway.feed.FeedViewModel$subscribeToFollowingStatusForUserSuggestions$1$1$1$1 r3 = new com.clubhouse.android.ui.hallway.feed.FeedViewModel$subscribeToFollowingStatusForUserSuggestions$1$1$1$1
                        r3.<init>(r2)
                        int r2 = com.clubhouse.android.ui.hallway.feed.FeedViewModel.m
                        r1.m(r3)
                    L_0x00aa:
                        m0.i r1 = m0.i.a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.hallway.feed.FeedViewModel$subscribeToFollowingStatusForUserSuggestions$1.AnonymousClass1.AnonymousClass1.invoke(java.lang.Object):java.lang.Object");
                }
            };
            int i = FeedViewModel.m;
            feedViewModel.n(r1);
            return i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedViewModel$subscribeToFollowingStatusForUserSuggestions$1(FeedViewModel feedViewModel, m0.l.c<? super FeedViewModel$subscribeToFollowingStatusForUserSuggestions$1> cVar) {
        super(2, cVar);
        this.d = feedViewModel;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new FeedViewModel$subscribeToFollowingStatusForUserSuggestions$1(this.d, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new FeedViewModel$subscribeToFollowingStatusForUserSuggestions$1(this.d, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            final FeedViewModel feedViewModel = this.d;
            d<Set<Integer>> dVar = feedViewModel.t.d.g;
            AnonymousClass1 r3 = new AnonymousClass1((m0.l.c<? super AnonymousClass1>) null);
            this.c = 1;
            if (a.E0(dVar, r3, this) == coroutineSingletons) {
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
