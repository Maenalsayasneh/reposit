package com.clubhouse.android.data.network;

import com.clubhouse.android.data.repos.UserRepo;
import i0.e.b.b3.c.c;
import i0.e.b.f3.k.b;
import m0.n.b.i;

/* compiled from: FeedDataSource.kt */
public final class FeedDataSource {
    public final ServerDataSource a;
    public final b b;
    public final UserRepo c;
    public final c d;

    public FeedDataSource(ServerDataSource serverDataSource, b bVar, UserRepo userRepo, c cVar) {
        i.e(serverDataSource, "fetcher");
        i.e(bVar, "userPrefs");
        i.e(userRepo, "userRepo");
        i.e(cVar, "eventCache");
        this.a = serverDataSource;
        this.b = bVar;
        this.c = userRepo;
        this.d = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0169 A[Catch:{ Exception -> 0x021b }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x016f A[Catch:{ Exception -> 0x021b }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0170 A[Catch:{ Exception -> 0x021b }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01b9 A[Catch:{ Exception -> 0x021b }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01ba A[Catch:{ Exception -> 0x021b }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01cd A[Catch:{ Exception -> 0x021b }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01ce A[Catch:{ Exception -> 0x021b }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c1 A[Catch:{ Exception -> 0x021b }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c3 A[Catch:{ Exception -> 0x021b }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x013b A[Catch:{ Exception -> 0x021b }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0140 A[Catch:{ Exception -> 0x021b }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0149 A[Catch:{ Exception -> 0x021b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(m0.l.c<? super com.clubhouse.android.shared.Result<? extends java.util.List<? extends i0.e.b.b3.a.a.d.a.e>>> r21) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            boolean r2 = r0 instanceof com.clubhouse.android.data.network.FeedDataSource$getFeedItems$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.clubhouse.android.data.network.FeedDataSource$getFeedItems$1 r2 = (com.clubhouse.android.data.network.FeedDataSource$getFeedItems$1) r2
            int r3 = r2.x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.x = r3
            goto L_0x001c
        L_0x0017:
            com.clubhouse.android.data.network.FeedDataSource$getFeedItems$1 r2 = new com.clubhouse.android.data.network.FeedDataSource$getFeedItems$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.x
            r5 = 0
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x003a
            if (r4 != r6) goto L_0x0032
            java.lang.Object r2 = r2.c
            com.clubhouse.android.data.network.FeedDataSource r2 = (com.clubhouse.android.data.network.FeedDataSource) r2
            i0.j.f.p.h.d4(r0)     // Catch:{ Exception -> 0x021b }
            goto L_0x00b0
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003a:
            i0.j.f.p.h.d4(r0)
            com.clubhouse.android.data.network.ServerDataSource r0 = r1.a     // Catch:{ Exception -> 0x021b }
            i0.e.b.f3.k.b r4 = r1.b     // Catch:{ Exception -> 0x021b }
            java.util.Objects.requireNonNull(r4)     // Catch:{ Exception -> 0x021b }
            com.clubhouse.android.shared.preferences.Key r8 = com.clubhouse.android.shared.preferences.Key.FORCE_USER_SUGGESTIONS     // Catch:{ Exception -> 0x021b }
            boolean r4 = r4.a(r8, r7)     // Catch:{ Exception -> 0x021b }
            if (r4 == 0) goto L_0x0050
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x021b }
            r10 = r4
            goto L_0x0051
        L_0x0050:
            r10 = r5
        L_0x0051:
            i0.e.b.f3.k.b r4 = r1.b     // Catch:{ Exception -> 0x021b }
            java.util.Objects.requireNonNull(r4)     // Catch:{ Exception -> 0x021b }
            com.clubhouse.android.shared.preferences.Key r8 = com.clubhouse.android.shared.preferences.Key.FORCE_CLUB_SUGGESTIONS     // Catch:{ Exception -> 0x021b }
            boolean r4 = r4.a(r8, r7)     // Catch:{ Exception -> 0x021b }
            if (r4 == 0) goto L_0x0062
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x021b }
            r11 = r4
            goto L_0x0063
        L_0x0062:
            r11 = r5
        L_0x0063:
            i0.e.b.f3.k.b r4 = r1.b     // Catch:{ Exception -> 0x021b }
            java.util.Objects.requireNonNull(r4)     // Catch:{ Exception -> 0x021b }
            com.clubhouse.android.shared.preferences.Key r8 = com.clubhouse.android.shared.preferences.Key.FORCE_EVENT_SUGGESTIONS     // Catch:{ Exception -> 0x021b }
            boolean r4 = r4.a(r8, r7)     // Catch:{ Exception -> 0x021b }
            if (r4 == 0) goto L_0x0074
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x021b }
            r12 = r4
            goto L_0x0075
        L_0x0074:
            r12 = r5
        L_0x0075:
            i0.e.b.f3.k.b r4 = r1.b     // Catch:{ Exception -> 0x021b }
            java.util.Objects.requireNonNull(r4)     // Catch:{ Exception -> 0x021b }
            com.clubhouse.android.shared.preferences.Key r8 = com.clubhouse.android.shared.preferences.Key.FORCE_TOPIC_SUGGESTIONS     // Catch:{ Exception -> 0x021b }
            boolean r4 = r4.a(r8, r7)     // Catch:{ Exception -> 0x021b }
            if (r4 == 0) goto L_0x0086
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x021b }
            r13 = r4
            goto L_0x0087
        L_0x0086:
            r13 = r5
        L_0x0087:
            i0.e.b.f3.k.b r4 = r1.b     // Catch:{ Exception -> 0x021b }
            java.util.Objects.requireNonNull(r4)     // Catch:{ Exception -> 0x021b }
            com.clubhouse.android.shared.preferences.Key r8 = com.clubhouse.android.shared.preferences.Key.FORCE_LANGUAGE_PICKER     // Catch:{ Exception -> 0x021b }
            boolean r4 = r4.a(r8, r7)     // Catch:{ Exception -> 0x021b }
            if (r4 == 0) goto L_0x0098
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x021b }
            r14 = r4
            goto L_0x0099
        L_0x0098:
            r14 = r5
        L_0x0099:
            r2.c = r1     // Catch:{ Exception -> 0x021b }
            r2.x = r6     // Catch:{ Exception -> 0x021b }
            java.util.Objects.requireNonNull(r0)     // Catch:{ Exception -> 0x021b }
            com.clubhouse.android.data.network.ServerDataSource$getFeed$2 r4 = new com.clubhouse.android.data.network.ServerDataSource$getFeed$2     // Catch:{ Exception -> 0x021b }
            r15 = 0
            r8 = r4
            r9 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x021b }
            java.lang.Object r0 = r0.a(r4, r2)     // Catch:{ Exception -> 0x021b }
            if (r0 != r3) goto L_0x00af
            return r3
        L_0x00af:
            r2 = r1
        L_0x00b0:
            com.clubhouse.android.shared.Result r0 = (com.clubhouse.android.shared.Result) r0     // Catch:{ Exception -> 0x021b }
            java.lang.Object r0 = r0.a()     // Catch:{ Exception -> 0x021b }
            com.clubhouse.android.data.models.remote.response.GetFeedResponse r0 = (com.clubhouse.android.data.models.remote.response.GetFeedResponse) r0     // Catch:{ Exception -> 0x021b }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x021b }
            r3.<init>()     // Catch:{ Exception -> 0x021b }
            java.util.List<com.clubhouse.android.data.models.local.feed.server.ServerFeedItem> r0 = r0.a     // Catch:{ Exception -> 0x021b }
            if (r0 != 0) goto L_0x00c3
            goto L_0x0215
        L_0x00c3:
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x021b }
        L_0x00c7:
            boolean r4 = r0.hasNext()     // Catch:{ Exception -> 0x021b }
            if (r4 == 0) goto L_0x0215
            java.lang.Object r4 = r0.next()     // Catch:{ Exception -> 0x021b }
            com.clubhouse.android.data.models.local.feed.server.ServerFeedItem r4 = (com.clubhouse.android.data.models.local.feed.server.ServerFeedItem) r4     // Catch:{ Exception -> 0x021b }
            com.clubhouse.android.data.models.local.feed.server.FeedInvitesUpsell r8 = r4.q     // Catch:{ Exception -> 0x021b }
            if (r8 != 0) goto L_0x00d8
            goto L_0x00e8
        L_0x00d8:
            i0.e.b.b3.a.a.d.a.g r9 = new i0.e.b.b3.a.a.d.a.g     // Catch:{ Exception -> 0x021b }
            java.util.Map<java.lang.String, java.lang.Object> r8 = r8.c     // Catch:{ Exception -> 0x021b }
            if (r8 != 0) goto L_0x00e2
            java.util.Map r8 = m0.j.g.o()     // Catch:{ Exception -> 0x021b }
        L_0x00e2:
            r9.<init>(r8)     // Catch:{ Exception -> 0x021b }
            r3.add(r9)     // Catch:{ Exception -> 0x021b }
        L_0x00e8:
            com.clubhouse.android.data.models.local.feed.server.FeedTodayView r8 = r4.d     // Catch:{ Exception -> 0x021b }
            if (r8 != 0) goto L_0x00ed
            goto L_0x0109
        L_0x00ed:
            i0.e.b.b3.a.a.d.a.d r9 = new i0.e.b.b3.a.a.d.a.d     // Catch:{ Exception -> 0x021b }
            r10 = 3
            r9.<init>(r5, r5, r10)     // Catch:{ Exception -> 0x021b }
            java.util.List<com.clubhouse.android.data.models.local.EventInClub> r10 = r8.c     // Catch:{ Exception -> 0x021b }
            if (r10 != 0) goto L_0x00f8
            goto L_0x00fd
        L_0x00f8:
            r11 = 2
            i0.e.b.b3.a.a.d.a.d r9 = i0.e.b.b3.a.a.d.a.d.a(r9, r10, r5, r11)     // Catch:{ Exception -> 0x021b }
        L_0x00fd:
            java.util.List<com.clubhouse.android.data.models.local.EventInClub> r8 = r8.d     // Catch:{ Exception -> 0x021b }
            if (r8 != 0) goto L_0x0102
            goto L_0x0106
        L_0x0102:
            i0.e.b.b3.a.a.d.a.d r9 = i0.e.b.b3.a.a.d.a.d.a(r9, r5, r8, r6)     // Catch:{ Exception -> 0x021b }
        L_0x0106:
            r3.add(r9)     // Catch:{ Exception -> 0x021b }
        L_0x0109:
            com.clubhouse.android.data.models.local.channel.ChannelInFeed r8 = r4.c     // Catch:{ Exception -> 0x021b }
            if (r8 != 0) goto L_0x010e
            goto L_0x0116
        L_0x010e:
            i0.e.b.b3.a.a.d.a.a r9 = new i0.e.b.b3.a.a.d.a.a     // Catch:{ Exception -> 0x021b }
            r9.<init>(r8)     // Catch:{ Exception -> 0x021b }
            r3.add(r9)     // Catch:{ Exception -> 0x021b }
        L_0x0116:
            com.clubhouse.android.data.models.local.feed.server.FeedTopicsUpsell r8 = r4.x     // Catch:{ Exception -> 0x021b }
            java.lang.String r9 = ""
            if (r8 != 0) goto L_0x011d
            goto L_0x0153
        L_0x011d:
            java.util.List<com.clubhouse.android.data.models.local.Topic> r8 = r8.d     // Catch:{ Exception -> 0x021b }
            if (r8 != 0) goto L_0x0122
            goto L_0x0153
        L_0x0122:
            boolean r10 = r8.isEmpty()     // Catch:{ Exception -> 0x021b }
            r10 = r10 ^ r6
            if (r10 == 0) goto L_0x0153
            com.clubhouse.android.data.models.local.feed.server.FeedTopicsUpsell r10 = r4.x     // Catch:{ Exception -> 0x021b }
            java.lang.String r10 = r10.c     // Catch:{ Exception -> 0x021b }
            if (r10 == 0) goto L_0x0138
            int r10 = r10.length()     // Catch:{ Exception -> 0x021b }
            if (r10 != 0) goto L_0x0136
            goto L_0x0138
        L_0x0136:
            r10 = r7
            goto L_0x0139
        L_0x0138:
            r10 = r6
        L_0x0139:
            if (r10 != 0) goto L_0x0140
            com.clubhouse.android.data.models.local.feed.server.FeedTopicsUpsell r10 = r4.x     // Catch:{ Exception -> 0x021b }
            java.lang.String r10 = r10.c     // Catch:{ Exception -> 0x021b }
            goto L_0x0141
        L_0x0140:
            r10 = r9
        L_0x0141:
            i0.e.b.b3.a.a.d.a.i r11 = new i0.e.b.b3.a.a.d.a.i     // Catch:{ Exception -> 0x021b }
            com.clubhouse.android.data.models.local.feed.server.FeedTopicsUpsell r12 = r4.x     // Catch:{ Exception -> 0x021b }
            java.util.Map<java.lang.String, java.lang.Object> r12 = r12.q     // Catch:{ Exception -> 0x021b }
            if (r12 != 0) goto L_0x014d
            java.util.Map r12 = m0.j.g.o()     // Catch:{ Exception -> 0x021b }
        L_0x014d:
            r11.<init>(r10, r8, r12)     // Catch:{ Exception -> 0x021b }
            r3.add(r11)     // Catch:{ Exception -> 0x021b }
        L_0x0153:
            com.clubhouse.android.data.models.local.feed.server.SuggestionCarousel r8 = r4.y     // Catch:{ Exception -> 0x021b }
            if (r8 != 0) goto L_0x0159
            goto L_0x01fd
        L_0x0159:
            java.lang.String r10 = r8.c     // Catch:{ Exception -> 0x021b }
            if (r10 == 0) goto L_0x0166
            int r10 = r10.length()     // Catch:{ Exception -> 0x021b }
            if (r10 != 0) goto L_0x0164
            goto L_0x0166
        L_0x0164:
            r10 = r7
            goto L_0x0167
        L_0x0166:
            r10 = r6
        L_0x0167:
            if (r10 != 0) goto L_0x016b
            java.lang.String r9 = r8.c     // Catch:{ Exception -> 0x021b }
        L_0x016b:
            java.util.List<com.clubhouse.android.data.models.local.user.UserInList> r10 = r8.d     // Catch:{ Exception -> 0x021b }
            if (r10 != 0) goto L_0x0170
            goto L_0x01b5
        L_0x0170:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ Exception -> 0x021b }
            r11.<init>()     // Catch:{ Exception -> 0x021b }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x021b }
        L_0x0179:
            boolean r12 = r10.hasNext()     // Catch:{ Exception -> 0x021b }
            if (r12 == 0) goto L_0x01a6
            java.lang.Object r12 = r10.next()     // Catch:{ Exception -> 0x021b }
            r14 = r12
            com.clubhouse.android.data.models.local.user.UserInList r14 = (com.clubhouse.android.data.models.local.user.UserInList) r14     // Catch:{ Exception -> 0x021b }
            i0.e.b.b3.b.e.m r12 = new i0.e.b.b3.b.e.m     // Catch:{ Exception -> 0x021b }
            r15 = 0
            com.clubhouse.android.data.repos.UserRepo r13 = r2.c     // Catch:{ Exception -> 0x021b }
            java.lang.Integer r16 = r14.getId()     // Catch:{ Exception -> 0x021b }
            int r5 = r16.intValue()     // Catch:{ Exception -> 0x021b }
            boolean r16 = r13.t(r5)     // Catch:{ Exception -> 0x021b }
            r17 = 0
            r18 = 0
            r19 = 26
            r13 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x021b }
            r11.add(r12)     // Catch:{ Exception -> 0x021b }
            r5 = 0
            goto L_0x0179
        L_0x01a6:
            boolean r5 = r11.isEmpty()     // Catch:{ Exception -> 0x021b }
            r5 = r5 ^ r6
            if (r5 == 0) goto L_0x01b5
            i0.e.b.b3.a.a.d.a.j r5 = new i0.e.b.b3.a.a.d.a.j     // Catch:{ Exception -> 0x021b }
            r5.<init>(r9, r11)     // Catch:{ Exception -> 0x021b }
            r3.add(r5)     // Catch:{ Exception -> 0x021b }
        L_0x01b5:
            java.util.List<com.clubhouse.android.data.models.local.club.ClubWithAdmin> r5 = r8.q     // Catch:{ Exception -> 0x021b }
            if (r5 != 0) goto L_0x01ba
            goto L_0x01c9
        L_0x01ba:
            boolean r10 = r5.isEmpty()     // Catch:{ Exception -> 0x021b }
            r10 = r10 ^ r6
            if (r10 == 0) goto L_0x01c9
            i0.e.b.b3.a.a.d.a.b r10 = new i0.e.b.b3.a.a.d.a.b     // Catch:{ Exception -> 0x021b }
            r10.<init>(r9, r5)     // Catch:{ Exception -> 0x021b }
            r3.add(r10)     // Catch:{ Exception -> 0x021b }
        L_0x01c9:
            java.util.List<com.clubhouse.android.data.models.local.EventInClub> r5 = r8.x     // Catch:{ Exception -> 0x021b }
            if (r5 != 0) goto L_0x01ce
            goto L_0x01fd
        L_0x01ce:
            boolean r8 = r5.isEmpty()     // Catch:{ Exception -> 0x021b }
            r8 = r8 ^ r6
            if (r8 == 0) goto L_0x01fd
            java.util.Iterator r8 = r5.iterator()     // Catch:{ Exception -> 0x021b }
        L_0x01d9:
            boolean r10 = r8.hasNext()     // Catch:{ Exception -> 0x021b }
            if (r10 == 0) goto L_0x01f5
            java.lang.Object r10 = r8.next()     // Catch:{ Exception -> 0x021b }
            com.clubhouse.android.data.models.local.EventInClub r10 = (com.clubhouse.android.data.models.local.EventInClub) r10     // Catch:{ Exception -> 0x021b }
            i0.e.b.b3.c.c r11 = r2.d     // Catch:{ Exception -> 0x021b }
            int r12 = r10.Y1     // Catch:{ Exception -> 0x021b }
            java.lang.Boolean r10 = r10.x     // Catch:{ Exception -> 0x021b }
            java.lang.Boolean r13 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x021b }
            boolean r10 = m0.n.b.i.a(r10, r13)     // Catch:{ Exception -> 0x021b }
            r11.a(r12, r10)     // Catch:{ Exception -> 0x021b }
            goto L_0x01d9
        L_0x01f5:
            i0.e.b.b3.a.a.d.a.c r8 = new i0.e.b.b3.a.a.d.a.c     // Catch:{ Exception -> 0x021b }
            r8.<init>(r9, r5)     // Catch:{ Exception -> 0x021b }
            r3.add(r8)     // Catch:{ Exception -> 0x021b }
        L_0x01fd:
            com.clubhouse.android.data.models.local.feed.server.FeedLanguagePicker r4 = r4.Y1     // Catch:{ Exception -> 0x021b }
            if (r4 != 0) goto L_0x0202
            goto L_0x0212
        L_0x0202:
            i0.e.b.b3.a.a.d.a.h r5 = new i0.e.b.b3.a.a.d.a.h     // Catch:{ Exception -> 0x021b }
            java.lang.String r8 = r4.c     // Catch:{ Exception -> 0x021b }
            java.lang.String r9 = r4.d     // Catch:{ Exception -> 0x021b }
            java.lang.String r10 = r4.q     // Catch:{ Exception -> 0x021b }
            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.x     // Catch:{ Exception -> 0x021b }
            r5.<init>(r8, r9, r10, r4)     // Catch:{ Exception -> 0x021b }
            r3.add(r5)     // Catch:{ Exception -> 0x021b }
        L_0x0212:
            r5 = 0
            goto L_0x00c7
        L_0x0215:
            com.clubhouse.android.shared.Result$c r0 = new com.clubhouse.android.shared.Result$c     // Catch:{ Exception -> 0x021b }
            r0.<init>(r3)     // Catch:{ Exception -> 0x021b }
            return r0
        L_0x021b:
            r0 = move-exception
            com.clubhouse.android.shared.Result$a r2 = new com.clubhouse.android.shared.Result$a
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.network.FeedDataSource.a(m0.l.c):java.lang.Object");
    }
}
