package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.network.ServerDataSource;
import com.clubhouse.android.data.network.paging.GetEventsPagingForUserSource;
import com.clubhouse.android.data.network.paging.GetEventsPagingSource;
import i0.e.a.a;
import i0.e.b.b3.c.c;
import java.util.Map;
import m0.n.b.i;

/* compiled from: EventRepo.kt */
public final class EventRepo {
    public final ServerDataSource a;
    public final a b;
    public final c c;
    public final GetEventsPagingSource.a d;
    public final GetEventsPagingForUserSource.a e;

    public EventRepo(ServerDataSource serverDataSource, a aVar, c cVar, GetEventsPagingSource.a aVar2, GetEventsPagingForUserSource.a aVar3) {
        i.e(serverDataSource, "fetcher");
        i.e(aVar, "analytics");
        i.e(cVar, "eventCache");
        i.e(aVar2, "eventsPagingSourceFactory");
        i.e(aVar3, "eventsPagingForUserSourceFactory");
        this.a = serverDataSource;
        this.b = aVar;
        this.c = cVar;
        this.d = aVar2;
        this.e = aVar3;
    }

    public static /* synthetic */ Object g(EventRepo eventRepo, int i, boolean z, Map map, m0.l.c cVar, int i2) {
        int i3 = i2 & 4;
        return eventRepo.f(i, z, (Map<String, ? extends Object>) null, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r14, java.util.List<java.lang.Integer> r15, java.lang.Integer r16, java.lang.Boolean r17, java.lang.String r18, java.lang.Long r19, m0.l.c<? super com.clubhouse.android.data.models.remote.response.CreateEventResponse> r20) {
        /*
            r13 = this;
            r0 = r13
            r1 = r20
            boolean r2 = r1 instanceof com.clubhouse.android.data.repos.EventRepo$createEvent$1
            if (r2 == 0) goto L_0x0016
            r2 = r1
            com.clubhouse.android.data.repos.EventRepo$createEvent$1 r2 = (com.clubhouse.android.data.repos.EventRepo$createEvent$1) r2
            int r3 = r2.x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.x = r3
            goto L_0x001b
        L_0x0016:
            com.clubhouse.android.data.repos.EventRepo$createEvent$1 r2 = new com.clubhouse.android.data.repos.EventRepo$createEvent$1
            r2.<init>(r13, r1)
        L_0x001b:
            java.lang.Object r1 = r2.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.x
            r5 = 1
            if (r4 == 0) goto L_0x0036
            if (r4 != r5) goto L_0x002e
            java.lang.Object r2 = r2.c
            com.clubhouse.android.data.repos.EventRepo r2 = (com.clubhouse.android.data.repos.EventRepo) r2
            i0.j.f.p.h.d4(r1)
            goto L_0x0067
        L_0x002e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0036:
            i0.j.f.p.h.d4(r1)
            com.clubhouse.android.data.network.ServerDataSource r1 = r0.a
            if (r17 != 0) goto L_0x003f
            r4 = 0
            goto L_0x0043
        L_0x003f:
            boolean r4 = r17.booleanValue()
        L_0x0043:
            r9 = r4
            com.clubhouse.android.data.models.remote.request.CreateEventRequest r4 = new com.clubhouse.android.data.models.remote.request.CreateEventRequest
            r6 = r4
            r7 = r15
            r8 = r16
            r10 = r18
            r11 = r19
            r12 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r2.c = r0
            r2.x = r5
            java.util.Objects.requireNonNull(r1)
            com.clubhouse.android.data.network.ServerDataSource$createEvent$2 r5 = new com.clubhouse.android.data.network.ServerDataSource$createEvent$2
            r6 = 0
            r5.<init>(r1, r4, r6)
            java.lang.Object r1 = r1.a(r5, r2)
            if (r1 != r3) goto L_0x0066
            return r3
        L_0x0066:
            r2 = r0
        L_0x0067:
            com.clubhouse.android.shared.Result r1 = (com.clubhouse.android.shared.Result) r1
            com.clubhouse.android.data.repos.EventRepo$createEvent$2 r3 = new com.clubhouse.android.data.repos.EventRepo$createEvent$2
            r3.<init>(r2)
            com.clubhouse.android.data.repos.EventRepo$createEvent$3 r4 = new com.clubhouse.android.data.repos.EventRepo$createEvent$3
            r4.<init>(r2)
            r1.b(r3, r4)
            java.lang.Object r1 = r1.a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.EventRepo.a(java.lang.String, java.util.List, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.Long, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(int r5, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.clubhouse.android.data.repos.EventRepo$deleteEvent$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.clubhouse.android.data.repos.EventRepo$deleteEvent$1 r0 = (com.clubhouse.android.data.repos.EventRepo$deleteEvent$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.EventRepo$deleteEvent$1 r0 = new com.clubhouse.android.data.repos.EventRepo$deleteEvent$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.c
            com.clubhouse.android.data.repos.EventRepo r5 = (com.clubhouse.android.data.repos.EventRepo) r5
            i0.j.f.p.h.d4(r6)
            goto L_0x0052
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            i0.j.f.p.h.d4(r6)
            com.clubhouse.android.data.network.ServerDataSource r6 = r4.a
            com.clubhouse.android.data.models.remote.request.DeleteEventRequest r2 = new com.clubhouse.android.data.models.remote.request.DeleteEventRequest
            r2.<init>(r5)
            r0.c = r4
            r0.x = r3
            java.util.Objects.requireNonNull(r6)
            com.clubhouse.android.data.network.ServerDataSource$deleteEvent$2 r5 = new com.clubhouse.android.data.network.ServerDataSource$deleteEvent$2
            r3 = 0
            r5.<init>(r6, r2, r3)
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r5 = r4
        L_0x0052:
            com.clubhouse.android.shared.Result r6 = (com.clubhouse.android.shared.Result) r6
            com.clubhouse.android.data.repos.EventRepo$deleteEvent$2 r0 = new com.clubhouse.android.data.repos.EventRepo$deleteEvent$2
            r0.<init>(r5)
            com.clubhouse.android.data.repos.EventRepo$deleteEvent$3 r1 = new com.clubhouse.android.data.repos.EventRepo$deleteEvent$3
            r1.<init>(r5)
            r6.b(r0, r1)
            java.lang.Object r5 = r6.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.EventRepo.b(int, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(int r17, java.lang.String r18, java.util.List<java.lang.Integer> r19, java.lang.Integer r20, java.lang.Boolean r21, java.lang.String r22, java.lang.Long r23, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r24) {
        /*
            r16 = this;
            r0 = r16
            r1 = r24
            boolean r2 = r1 instanceof com.clubhouse.android.data.repos.EventRepo$editEvent$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.clubhouse.android.data.repos.EventRepo$editEvent$1 r2 = (com.clubhouse.android.data.repos.EventRepo$editEvent$1) r2
            int r3 = r2.x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.x = r3
            goto L_0x001c
        L_0x0017:
            com.clubhouse.android.data.repos.EventRepo$editEvent$1 r2 = new com.clubhouse.android.data.repos.EventRepo$editEvent$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.x
            r5 = 1
            if (r4 == 0) goto L_0x0037
            if (r4 != r5) goto L_0x002f
            java.lang.Object r2 = r2.c
            com.clubhouse.android.data.repos.EventRepo r2 = (com.clubhouse.android.data.repos.EventRepo) r2
            i0.j.f.p.h.d4(r1)
            goto L_0x006f
        L_0x002f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0037:
            i0.j.f.p.h.d4(r1)
            com.clubhouse.android.data.network.ServerDataSource r1 = r0.a
            if (r21 != 0) goto L_0x0040
            r4 = 0
            goto L_0x0044
        L_0x0040:
            boolean r4 = r21.booleanValue()
        L_0x0044:
            r9 = r4
            com.clubhouse.android.data.models.remote.request.EditEventRequest r4 = new com.clubhouse.android.data.models.remote.request.EditEventRequest
            r11 = 0
            r15 = 16
            r6 = r4
            r7 = r19
            r8 = r20
            r10 = r17
            r12 = r22
            r13 = r23
            r14 = r18
            r6.<init>((java.util.List) r7, (java.lang.Integer) r8, (boolean) r9, (int) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.Long) r13, (java.lang.String) r14, (int) r15)
            r2.c = r0
            r2.x = r5
            java.util.Objects.requireNonNull(r1)
            com.clubhouse.android.data.network.ServerDataSource$editEvent$2 r5 = new com.clubhouse.android.data.network.ServerDataSource$editEvent$2
            r6 = 0
            r5.<init>(r1, r4, r6)
            java.lang.Object r1 = r1.a(r5, r2)
            if (r1 != r3) goto L_0x006e
            return r3
        L_0x006e:
            r2 = r0
        L_0x006f:
            com.clubhouse.android.shared.Result r1 = (com.clubhouse.android.shared.Result) r1
            com.clubhouse.android.data.repos.EventRepo$editEvent$2 r3 = new com.clubhouse.android.data.repos.EventRepo$editEvent$2
            r3.<init>(r2)
            com.clubhouse.android.data.repos.EventRepo$editEvent$3 r4 = new com.clubhouse.android.data.repos.EventRepo$editEvent$3
            r4.<init>(r2)
            r1.b(r3, r4)
            java.lang.Object r1 = r1.a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.EventRepo.c(int, java.lang.String, java.util.List, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.Long, m0.l.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(java.lang.Integer r6, java.lang.String r7, java.lang.String r8, java.util.Map<java.lang.String, ? extends java.lang.Object> r9, m0.l.c<? super com.clubhouse.android.data.models.remote.response.GetEventResponse> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof com.clubhouse.android.data.repos.EventRepo$getEvent$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.clubhouse.android.data.repos.EventRepo$getEvent$1 r0 = (com.clubhouse.android.data.repos.EventRepo$getEvent$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.EventRepo$getEvent$1 r0 = new com.clubhouse.android.data.repos.EventRepo$getEvent$1
            r0.<init>(r5, r10)
        L_0x0018:
            java.lang.Object r10 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            java.lang.Object r6 = r0.d
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.c
            com.clubhouse.android.data.repos.EventRepo r6 = (com.clubhouse.android.data.repos.EventRepo) r6
            i0.j.f.p.h.d4(r10)
            goto L_0x0059
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            i0.j.f.p.h.d4(r10)
            com.clubhouse.android.data.network.ServerDataSource r10 = r5.a
            com.clubhouse.android.data.models.remote.request.GetEventRequest r2 = new com.clubhouse.android.data.models.remote.request.GetEventRequest
            r2.<init>(r6, r7, r8, r9)
            r0.c = r5
            r0.d = r7
            r0.y = r4
            java.util.Objects.requireNonNull(r10)
            com.clubhouse.android.data.network.ServerDataSource$getEvent$2 r6 = new com.clubhouse.android.data.network.ServerDataSource$getEvent$2
            r6.<init>(r10, r2, r3)
            java.lang.Object r10 = r10.a(r6, r0)
            if (r10 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r6 = r5
        L_0x0059:
            com.clubhouse.android.shared.Result r10 = (com.clubhouse.android.shared.Result) r10
            com.clubhouse.android.data.repos.EventRepo$getEvent$2 r8 = new com.clubhouse.android.data.repos.EventRepo$getEvent$2
            r8.<init>(r6, r7)
            com.clubhouse.android.shared.Result.c(r10, r3, r8, r4, r3)
            java.lang.Object r7 = r10.a()
            r8 = r7
            com.clubhouse.android.data.models.remote.response.GetEventResponse r8 = (com.clubhouse.android.data.models.remote.response.GetEventResponse) r8
            i0.e.b.b3.c.c r6 = r6.c
            com.clubhouse.android.data.models.local.EventInClub r8 = r8.a
            int r9 = r8.Y1
            java.lang.Boolean r8 = r8.x
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            boolean r8 = m0.n.b.i.a(r8, r10)
            r6.a(r9, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.EventRepo.d(java.lang.Integer, java.lang.String, java.lang.String, java.util.Map, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(int r12, m0.l.c<? super com.clubhouse.android.data.models.remote.response.GetEventsResponse> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.clubhouse.android.data.repos.EventRepo$getEventsForClub$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.clubhouse.android.data.repos.EventRepo$getEventsForClub$1 r0 = (com.clubhouse.android.data.repos.EventRepo$getEventsForClub$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.EventRepo$getEventsForClub$1 r0 = new com.clubhouse.android.data.repos.EventRepo$getEventsForClub$1
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            java.lang.Object r12 = r0.c
            com.clubhouse.android.data.repos.EventRepo r12 = (com.clubhouse.android.data.repos.EventRepo) r12
            i0.j.f.p.h.d4(r13)
            goto L_0x005d
        L_0x002c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0034:
            i0.j.f.p.h.d4(r13)
            com.clubhouse.android.data.network.ServerDataSource r13 = r11.a
            com.clubhouse.android.data.models.remote.request.GetClubRequest r2 = new com.clubhouse.android.data.models.remote.request.GetClubRequest
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r12)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 14
            r5 = r2
            r5.<init>((java.lang.Integer) r6, (java.lang.String) r7, (java.lang.String) r8, (java.util.Map) r9, (int) r10)
            r0.c = r11
            r0.x = r4
            java.util.Objects.requireNonNull(r13)
            com.clubhouse.android.data.network.ServerDataSource$getEventsForClub$2 r12 = new com.clubhouse.android.data.network.ServerDataSource$getEventsForClub$2
            r12.<init>(r13, r2, r3)
            java.lang.Object r13 = r13.a(r12, r0)
            if (r13 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r12 = r11
        L_0x005d:
            com.clubhouse.android.shared.Result r13 = (com.clubhouse.android.shared.Result) r13
            com.clubhouse.android.data.repos.EventRepo$getEventsForClub$2 r0 = new com.clubhouse.android.data.repos.EventRepo$getEventsForClub$2
            r0.<init>(r12)
            com.clubhouse.android.shared.Result.c(r13, r3, r0, r4, r3)
            java.lang.Object r13 = r13.a()
            r0 = r13
            com.clubhouse.android.data.models.remote.response.GetEventsResponse r0 = (com.clubhouse.android.data.models.remote.response.GetEventsResponse) r0
            i0.e.b.b3.c.c r12 = r12.c
            java.util.List<com.clubhouse.android.data.models.local.EventInClub> r0 = r0.a
            r12.b(r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.EventRepo.e(int, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(int r10, boolean r11, java.util.Map<java.lang.String, ? extends java.lang.Object> r12, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.clubhouse.android.data.repos.EventRepo$rsvpToEvent$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.clubhouse.android.data.repos.EventRepo$rsvpToEvent$1 r0 = (com.clubhouse.android.data.repos.EventRepo$rsvpToEvent$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.EventRepo$rsvpToEvent$1 r0 = new com.clubhouse.android.data.repos.EventRepo$rsvpToEvent$1
            r0.<init>(r9, r13)
        L_0x0018:
            java.lang.Object r13 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            java.lang.Object r10 = r0.c
            com.clubhouse.android.data.repos.EventRepo r10 = (com.clubhouse.android.data.repos.EventRepo) r10
            i0.j.f.p.h.d4(r13)
            goto L_0x00ad
        L_0x002c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0034:
            i0.j.f.p.h.d4(r13)
            i0.e.b.b3.c.c r13 = r9.c
            n0.a.g2.q<java.util.Map<java.lang.Integer, java.lang.Boolean>> r2 = r13.a
            java.lang.Object r2 = r2.getValue()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            java.lang.Object r2 = r2.get(r4)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r4 = 0
            if (r2 != 0) goto L_0x0050
            r2 = r4
            goto L_0x0076
        L_0x0050:
            r2.booleanValue()
            n0.a.g2.q<java.util.Map<java.lang.Integer, java.lang.Boolean>> r5 = r13.a
            java.lang.Object r6 = r5.getValue()
            java.util.Map r6 = (java.util.Map) r6
            kotlin.Pair r7 = new kotlin.Pair
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            boolean r2 = r2.booleanValue()
            r2 = r2 ^ r3
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r7.<init>(r8, r2)
            java.util.Map r2 = m0.j.g.c0(r6, r7)
            r5.setValue(r2)
            m0.i r2 = m0.i.a
        L_0x0076:
            if (r2 != 0) goto L_0x0092
            n0.a.g2.q<java.util.Map<java.lang.Integer, java.lang.Boolean>> r13 = r13.a
            java.lang.Object r2 = r13.getValue()
            java.util.Map r2 = (java.util.Map) r2
            kotlin.Pair r5 = new kotlin.Pair
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r5.<init>(r6, r7)
            java.util.Map r2 = m0.j.g.c0(r2, r5)
            r13.setValue(r2)
        L_0x0092:
            com.clubhouse.android.data.network.ServerDataSource r13 = r9.a
            com.clubhouse.android.data.models.remote.request.RSVPEventRequest r2 = new com.clubhouse.android.data.models.remote.request.RSVPEventRequest
            r2.<init>(r10, r11, r12)
            r0.c = r9
            r0.x = r3
            java.util.Objects.requireNonNull(r13)
            com.clubhouse.android.data.network.ServerDataSource$rsvpToEvent$2 r10 = new com.clubhouse.android.data.network.ServerDataSource$rsvpToEvent$2
            r10.<init>(r13, r2, r4)
            java.lang.Object r13 = r13.a(r10, r0)
            if (r13 != r1) goto L_0x00ac
            return r1
        L_0x00ac:
            r10 = r9
        L_0x00ad:
            com.clubhouse.android.shared.Result r13 = (com.clubhouse.android.shared.Result) r13
            com.clubhouse.android.data.repos.EventRepo$rsvpToEvent$2 r11 = new com.clubhouse.android.data.repos.EventRepo$rsvpToEvent$2
            r11.<init>(r10)
            com.clubhouse.android.data.repos.EventRepo$rsvpToEvent$3 r12 = new com.clubhouse.android.data.repos.EventRepo$rsvpToEvent$3
            r12.<init>(r10)
            r13.b(r11, r12)
            java.lang.Object r10 = r13.a()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.EventRepo.f(int, boolean, java.util.Map, m0.l.c):java.lang.Object");
    }
}
