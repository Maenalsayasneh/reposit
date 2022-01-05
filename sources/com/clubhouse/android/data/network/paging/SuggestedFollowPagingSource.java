package com.clubhouse.android.data.network.paging;

import com.clubhouse.android.data.models.remote.request.OnboardingState;
import com.clubhouse.android.data.network.ServerDataSource;
import i0.e.b.b3.b.e.j;
import java.util.Set;
import kotlin.collections.EmptySet;
import m0.n.b.i;
import n0.a.g2.a0;
import n0.a.g2.q;

/* compiled from: SuggestedFollowPagingSource.kt */
public final class SuggestedFollowPagingSource extends AbstractPagingSource<j> {
    public final boolean c;
    public final OnboardingState d;
    public final int e;
    public final ServerDataSource f;
    public final i0.e.a.a g;
    public final q<Boolean> h = a0.a(Boolean.FALSE);
    public final q<Set<Integer>> i = a0.a(EmptySet.c);

    /* compiled from: SuggestedFollowPagingSource.kt */
    public interface a {
        SuggestedFollowPagingSource a(boolean z, OnboardingState onboardingState, int i);
    }

    public SuggestedFollowPagingSource(boolean z, OnboardingState onboardingState, int i2, ServerDataSource serverDataSource, i0.e.a.a aVar) {
        i.e(serverDataSource, "fetcher");
        i.e(aVar, "analytics");
        this.c = z;
        this.d = onboardingState;
        this.e = i2;
        this.f = serverDataSource;
        this.g = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a1 A[LOOP:0: B:17:0x009b->B:19:0x00a1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e5 A[LOOP:1: B:26:0x00df->B:28:0x00e5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(int r12, int r13, m0.l.c<? super h0.u.x.b<java.lang.Integer, i0.e.b.b3.b.e.j>> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.clubhouse.android.data.network.paging.SuggestedFollowPagingSource$query$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.clubhouse.android.data.network.paging.SuggestedFollowPagingSource$query$1 r0 = (com.clubhouse.android.data.network.paging.SuggestedFollowPagingSource$query$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.network.paging.SuggestedFollowPagingSource$query$1 r0 = new com.clubhouse.android.data.network.paging.SuggestedFollowPagingSource$query$1
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            int r12 = r0.d
            java.lang.Object r13 = r0.c
            com.clubhouse.android.data.network.paging.SuggestedFollowPagingSource r13 = (com.clubhouse.android.data.network.paging.SuggestedFollowPagingSource) r13
            i0.j.f.p.h.d4(r14)
            goto L_0x005a
        L_0x002e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0036:
            i0.j.f.p.h.d4(r14)
            com.clubhouse.android.data.network.ServerDataSource r14 = r11.f
            com.clubhouse.android.data.models.remote.request.GetSuggestedFollowsAllRequest r2 = new com.clubhouse.android.data.models.remote.request.GetSuggestedFollowsAllRequest
            boolean r5 = r11.c
            com.clubhouse.android.data.models.remote.request.OnboardingState r6 = r11.d
            r2.<init>(r5, r6, r13, r12)
            r0.c = r11
            r0.d = r12
            r0.y = r4
            java.util.Objects.requireNonNull(r14)
            com.clubhouse.android.data.network.ServerDataSource$getSuggestedFollowsAll$2 r13 = new com.clubhouse.android.data.network.ServerDataSource$getSuggestedFollowsAll$2
            r13.<init>(r14, r2, r3)
            java.lang.Object r14 = r14.a(r13, r0)
            if (r14 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r13 = r11
        L_0x005a:
            com.clubhouse.android.shared.Result r14 = (com.clubhouse.android.shared.Result) r14
            com.clubhouse.android.data.network.paging.SuggestedFollowPagingSource$query$response$1 r0 = new com.clubhouse.android.data.network.paging.SuggestedFollowPagingSource$query$response$1
            r0.<init>(r13)
            com.clubhouse.android.data.network.paging.SuggestedFollowPagingSource$query$response$2 r1 = new com.clubhouse.android.data.network.paging.SuggestedFollowPagingSource$query$response$2
            r1.<init>(r13)
            r14.b(r0, r1)
            java.lang.Object r14 = r14.a()
            com.clubhouse.android.data.models.remote.response.PaginatedUsersInListResponse r14 = (com.clubhouse.android.data.models.remote.response.PaginatedUsersInListResponse) r14
            java.util.List<com.clubhouse.android.data.models.local.user.UserInList> r0 = r14.a
            int r1 = r13.e
            n0.a.g2.q<java.util.Set<java.lang.Integer>> r2 = r13.i
            java.lang.Object r2 = r2.getValue()
            java.util.Set r2 = (java.util.Set) r2
            int r2 = r2.size()
            int r1 = r1 - r2
            n0.a.g2.q<java.util.Set<java.lang.Integer>> r2 = r13.i
            java.lang.Object r5 = r2.getValue()
            java.util.Set r5 = (java.util.Set) r5
            java.util.List r1 = m0.j.g.p0(r0, r1)
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r8 = i0.j.f.p.h.K(r1, r7)
            r6.<init>(r8)
            java.util.Iterator r1 = r1.iterator()
        L_0x009b:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x00b8
            java.lang.Object r8 = r1.next()
            com.clubhouse.android.data.models.local.user.UserInList r8 = (com.clubhouse.android.data.models.local.user.UserInList) r8
            java.lang.Integer r8 = r8.getId()
            int r8 = r8.intValue()
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r8)
            r6.add(r9)
            goto L_0x009b
        L_0x00b8:
            java.util.Set r1 = m0.j.g.d0(r5, r6)
            r2.setValue(r1)
            n0.a.g2.q<java.lang.Boolean> r13 = r13.h
            if (r12 != r4) goto L_0x00ca
            boolean r12 = r0.isEmpty()
            if (r12 == 0) goto L_0x00ca
            goto L_0x00cb
        L_0x00ca:
            r4 = 0
        L_0x00cb:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r4)
            r13.setValue(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            int r13 = i0.j.f.p.h.K(r0, r7)
            r12.<init>(r13)
            java.util.Iterator r13 = r0.iterator()
        L_0x00df:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00fc
            java.lang.Object r0 = r13.next()
            r5 = r0
            com.clubhouse.android.data.models.local.user.UserInList r5 = (com.clubhouse.android.data.models.local.user.UserInList) r5
            i0.e.b.b3.b.e.m r0 = new i0.e.b.b3.b.e.m
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 30
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r12.add(r0)
            goto L_0x00df
        L_0x00fc:
            java.lang.Integer r13 = r14.c
            h0.u.x$b$b r14 = new h0.u.x$b$b
            r14.<init>(r12, r3, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.network.paging.SuggestedFollowPagingSource.e(int, int, m0.l.c):java.lang.Object");
    }
}
