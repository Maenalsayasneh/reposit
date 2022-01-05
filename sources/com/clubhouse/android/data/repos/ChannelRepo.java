package com.clubhouse.android.data.repos;

import android.util.LruCache;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.network.FeedDataSource;
import com.clubhouse.android.data.network.ServerDataSource;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import i0.e.a.a;
import m0.n.b.i;
import n0.a.g2.a0;
import n0.a.g2.q;

/* compiled from: ChannelRepo.kt */
public final class ChannelRepo {
    public final FeedDataSource a;
    public final ServerDataSource b;
    public final a c;
    public final LruCache<String, Channel> d = new LruCache<>(50);
    public final q<Channel> e = a0.a(null);

    public ChannelRepo(FeedDataSource feedDataSource, ServerDataSource serverDataSource, a aVar) {
        i.e(feedDataSource, "feedDataSource");
        i.e(serverDataSource, "fetcher");
        i.e(aVar, "analytics");
        this.a = feedDataSource;
        this.b = serverDataSource;
        this.c = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A(java.lang.String r5, int r6, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.repos.ChannelRepo$rejectSpeakerInvite$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.repos.ChannelRepo$rejectSpeakerInvite$1 r0 = (com.clubhouse.android.data.repos.ChannelRepo$rejectSpeakerInvite$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ChannelRepo$rejectSpeakerInvite$1 r0 = new com.clubhouse.android.data.repos.ChannelRepo$rejectSpeakerInvite$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r5 = r0.d
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.c
            com.clubhouse.android.data.repos.ChannelRepo r6 = (com.clubhouse.android.data.repos.ChannelRepo) r6
            i0.j.f.p.h.d4(r7)
            goto L_0x0058
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            i0.j.f.p.h.d4(r7)
            com.clubhouse.android.data.network.ServerDataSource r7 = r4.b
            com.clubhouse.android.data.models.remote.request.ChannelUserRequest r2 = new com.clubhouse.android.data.models.remote.request.ChannelUserRequest
            r2.<init>(r5, r6)
            r0.c = r4
            r0.d = r5
            r0.y = r3
            java.util.Objects.requireNonNull(r7)
            com.clubhouse.android.data.network.ServerDataSource$rejectSpeakerInvite$2 r6 = new com.clubhouse.android.data.network.ServerDataSource$rejectSpeakerInvite$2
            r3 = 0
            r6.<init>(r7, r2, r3)
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r6 = r4
        L_0x0058:
            com.clubhouse.android.shared.Result r7 = (com.clubhouse.android.shared.Result) r7
            com.clubhouse.android.data.repos.ChannelRepo$rejectSpeakerInvite$2 r0 = new com.clubhouse.android.data.repos.ChannelRepo$rejectSpeakerInvite$2
            r0.<init>(r6, r5)
            com.clubhouse.android.data.repos.ChannelRepo$rejectSpeakerInvite$3 r1 = new com.clubhouse.android.data.repos.ChannelRepo$rejectSpeakerInvite$3
            r1.<init>(r6, r5)
            r7.b(r0, r1)
            java.lang.Object r5 = r7.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ChannelRepo.A(java.lang.String, int, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object B(java.lang.String r5, int r6, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.repos.ChannelRepo$uninviteSpeaker$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.repos.ChannelRepo$uninviteSpeaker$1 r0 = (com.clubhouse.android.data.repos.ChannelRepo$uninviteSpeaker$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ChannelRepo$uninviteSpeaker$1 r0 = new com.clubhouse.android.data.repos.ChannelRepo$uninviteSpeaker$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r5 = r0.d
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.c
            com.clubhouse.android.data.repos.ChannelRepo r6 = (com.clubhouse.android.data.repos.ChannelRepo) r6
            i0.j.f.p.h.d4(r7)
            goto L_0x0058
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            i0.j.f.p.h.d4(r7)
            com.clubhouse.android.data.network.ServerDataSource r7 = r4.b
            com.clubhouse.android.data.models.remote.request.ChannelUserRequest r2 = new com.clubhouse.android.data.models.remote.request.ChannelUserRequest
            r2.<init>(r5, r6)
            r0.c = r4
            r0.d = r5
            r0.y = r3
            java.util.Objects.requireNonNull(r7)
            com.clubhouse.android.data.network.ServerDataSource$uninviteSpeaker$2 r6 = new com.clubhouse.android.data.network.ServerDataSource$uninviteSpeaker$2
            r3 = 0
            r6.<init>(r7, r2, r3)
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r6 = r4
        L_0x0058:
            com.clubhouse.android.shared.Result r7 = (com.clubhouse.android.shared.Result) r7
            com.clubhouse.android.data.repos.ChannelRepo$uninviteSpeaker$2 r0 = new com.clubhouse.android.data.repos.ChannelRepo$uninviteSpeaker$2
            r0.<init>(r6, r5)
            com.clubhouse.android.data.repos.ChannelRepo$uninviteSpeaker$3 r1 = new com.clubhouse.android.data.repos.ChannelRepo$uninviteSpeaker$3
            r1.<init>(r6, r5)
            r7.b(r0, r1)
            java.lang.Object r5 = r7.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ChannelRepo.B(java.lang.String, int, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object C(java.lang.String r7, m0.l.c<? super com.clubhouse.android.data.models.remote.response.AudienceReplyResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.clubhouse.android.data.repos.ChannelRepo$unraiseHands$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.clubhouse.android.data.repos.ChannelRepo$unraiseHands$1 r0 = (com.clubhouse.android.data.repos.ChannelRepo$unraiseHands$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ChannelRepo$unraiseHands$1 r0 = new com.clubhouse.android.data.repos.ChannelRepo$unraiseHands$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r7 = r0.d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r0.c
            com.clubhouse.android.data.repos.ChannelRepo r0 = (com.clubhouse.android.data.repos.ChannelRepo) r0
            i0.j.f.p.h.d4(r8)
            goto L_0x005a
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            i0.j.f.p.h.d4(r8)
            com.clubhouse.android.data.network.ServerDataSource r8 = r6.b
            com.clubhouse.android.data.models.remote.request.AudienceReplyRequest r2 = new com.clubhouse.android.data.models.remote.request.AudienceReplyRequest
            r4 = 0
            r5 = 2
            r2.<init>((java.lang.String) r7, (boolean) r4, (boolean) r3, (int) r5)
            r0.c = r6
            r0.d = r7
            r0.y = r3
            java.util.Objects.requireNonNull(r8)
            com.clubhouse.android.data.network.ServerDataSource$audienceReply$2 r3 = new com.clubhouse.android.data.network.ServerDataSource$audienceReply$2
            r4 = 0
            r3.<init>(r8, r2, r4)
            java.lang.Object r8 = r8.a(r3, r0)
            if (r8 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r0 = r6
        L_0x005a:
            com.clubhouse.android.shared.Result r8 = (com.clubhouse.android.shared.Result) r8
            com.clubhouse.android.data.repos.ChannelRepo$unraiseHands$2 r1 = new com.clubhouse.android.data.repos.ChannelRepo$unraiseHands$2
            r1.<init>(r0, r7)
            com.clubhouse.android.data.repos.ChannelRepo$unraiseHands$3 r2 = new com.clubhouse.android.data.repos.ChannelRepo$unraiseHands$3
            r2.<init>(r0, r7)
            r8.b(r1, r2)
            java.lang.Object r7 = r8.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ChannelRepo.C(java.lang.String, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r5, m0.l.c<? super com.clubhouse.android.data.models.remote.response.AcceptChannelInviteResponse> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.repos.ChannelRepo$acceptNewChannelInvite$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.repos.ChannelRepo$acceptNewChannelInvite$1 r0 = (com.clubhouse.android.data.repos.ChannelRepo$acceptNewChannelInvite$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ChannelRepo$acceptNewChannelInvite$1 r0 = new com.clubhouse.android.data.repos.ChannelRepo$acceptNewChannelInvite$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.c
            com.clubhouse.android.data.repos.ChannelRepo r5 = (com.clubhouse.android.data.repos.ChannelRepo) r5
            i0.j.f.p.h.d4(r7)
            goto L_0x0052
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            i0.j.f.p.h.d4(r7)
            com.clubhouse.android.data.network.ServerDataSource r7 = r4.b
            com.clubhouse.android.data.models.remote.response.ChannelInviteActionRequest r2 = new com.clubhouse.android.data.models.remote.response.ChannelInviteActionRequest
            r2.<init>(r5)
            r0.c = r4
            r0.x = r3
            java.util.Objects.requireNonNull(r7)
            com.clubhouse.android.data.network.ServerDataSource$acceptNewChannelInvite$2 r5 = new com.clubhouse.android.data.network.ServerDataSource$acceptNewChannelInvite$2
            r6 = 0
            r5.<init>(r7, r2, r6)
            java.lang.Object r7 = r7.a(r5, r0)
            if (r7 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r5 = r4
        L_0x0052:
            com.clubhouse.android.shared.Result r7 = (com.clubhouse.android.shared.Result) r7
            com.clubhouse.android.data.repos.ChannelRepo$acceptNewChannelInvite$2 r6 = new com.clubhouse.android.data.repos.ChannelRepo$acceptNewChannelInvite$2
            r6.<init>(r5)
            com.clubhouse.android.data.repos.ChannelRepo$acceptNewChannelInvite$3 r0 = new com.clubhouse.android.data.repos.ChannelRepo$acceptNewChannelInvite$3
            r0.<init>(r5)
            r7.b(r6, r0)
            java.lang.Object r5 = r7.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ChannelRepo.a(long, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r6, java.lang.Integer r7, m0.l.c<? super com.clubhouse.android.data.models.remote.response.AcceptSpeakerInviteResponse> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.clubhouse.android.data.repos.ChannelRepo$acceptSpeakerInvite$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.clubhouse.android.data.repos.ChannelRepo$acceptSpeakerInvite$1 r0 = (com.clubhouse.android.data.repos.ChannelRepo$acceptSpeakerInvite$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ChannelRepo$acceptSpeakerInvite$1 r0 = new com.clubhouse.android.data.repos.ChannelRepo$acceptSpeakerInvite$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            java.lang.Object r6 = r0.d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.c
            com.clubhouse.android.data.repos.ChannelRepo r7 = (com.clubhouse.android.data.repos.ChannelRepo) r7
            i0.j.f.p.h.d4(r8)
            goto L_0x0058
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            i0.j.f.p.h.d4(r8)
            com.clubhouse.android.data.network.ServerDataSource r8 = r5.b
            com.clubhouse.android.data.models.remote.request.AcceptSpeakerInviteRequest r2 = new com.clubhouse.android.data.models.remote.request.AcceptSpeakerInviteRequest
            r2.<init>(r6, r7)
            r0.c = r5
            r0.d = r6
            r0.y = r4
            java.util.Objects.requireNonNull(r8)
            com.clubhouse.android.data.network.ServerDataSource$acceptSpeakerInvite$2 r7 = new com.clubhouse.android.data.network.ServerDataSource$acceptSpeakerInvite$2
            r7.<init>(r8, r2, r3)
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r7 = r5
        L_0x0058:
            com.clubhouse.android.shared.Result r8 = (com.clubhouse.android.shared.Result) r8
            com.clubhouse.android.data.repos.ChannelRepo$acceptSpeakerInvite$2 r0 = new com.clubhouse.android.data.repos.ChannelRepo$acceptSpeakerInvite$2
            r0.<init>(r7, r6)
            com.clubhouse.android.shared.Result.c(r8, r3, r0, r4, r3)
            java.lang.Object r6 = r8.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ChannelRepo.b(java.lang.String, java.lang.Integer, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.lang.String r5, int r6, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.repos.ChannelRepo$blockFromChannel$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.repos.ChannelRepo$blockFromChannel$1 r0 = (com.clubhouse.android.data.repos.ChannelRepo$blockFromChannel$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ChannelRepo$blockFromChannel$1 r0 = new com.clubhouse.android.data.repos.ChannelRepo$blockFromChannel$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r5 = r0.d
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.c
            com.clubhouse.android.data.repos.ChannelRepo r6 = (com.clubhouse.android.data.repos.ChannelRepo) r6
            i0.j.f.p.h.d4(r7)
            goto L_0x0058
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            i0.j.f.p.h.d4(r7)
            com.clubhouse.android.data.network.ServerDataSource r7 = r4.b
            com.clubhouse.android.data.models.remote.request.ChannelUserRequest r2 = new com.clubhouse.android.data.models.remote.request.ChannelUserRequest
            r2.<init>(r5, r6)
            r0.c = r4
            r0.d = r5
            r0.y = r3
            java.util.Objects.requireNonNull(r7)
            com.clubhouse.android.data.network.ServerDataSource$blockFromChannel$2 r6 = new com.clubhouse.android.data.network.ServerDataSource$blockFromChannel$2
            r3 = 0
            r6.<init>(r7, r2, r3)
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r6 = r4
        L_0x0058:
            com.clubhouse.android.shared.Result r7 = (com.clubhouse.android.shared.Result) r7
            com.clubhouse.android.data.repos.ChannelRepo$blockFromChannel$2 r0 = new com.clubhouse.android.data.repos.ChannelRepo$blockFromChannel$2
            r0.<init>(r6, r5)
            com.clubhouse.android.data.repos.ChannelRepo$blockFromChannel$3 r1 = new com.clubhouse.android.data.repos.ChannelRepo$blockFromChannel$3
            r1.<init>(r6, r5)
            r7.b(r0, r1)
            java.lang.Object r5 = r7.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ChannelRepo.c(java.lang.String, int, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(long r5, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.repos.ChannelRepo$cancelNewChannelInvite$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.repos.ChannelRepo$cancelNewChannelInvite$1 r0 = (com.clubhouse.android.data.repos.ChannelRepo$cancelNewChannelInvite$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ChannelRepo$cancelNewChannelInvite$1 r0 = new com.clubhouse.android.data.repos.ChannelRepo$cancelNewChannelInvite$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.c
            com.clubhouse.android.data.repos.ChannelRepo r5 = (com.clubhouse.android.data.repos.ChannelRepo) r5
            i0.j.f.p.h.d4(r7)
            goto L_0x0052
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            i0.j.f.p.h.d4(r7)
            com.clubhouse.android.data.network.ServerDataSource r7 = r4.b
            com.clubhouse.android.data.models.remote.response.ChannelInviteActionRequest r2 = new com.clubhouse.android.data.models.remote.response.ChannelInviteActionRequest
            r2.<init>(r5)
            r0.c = r4
            r0.x = r3
            java.util.Objects.requireNonNull(r7)
            com.clubhouse.android.data.network.ServerDataSource$cancelNewChannelInvite$2 r5 = new com.clubhouse.android.data.network.ServerDataSource$cancelNewChannelInvite$2
            r6 = 0
            r5.<init>(r7, r2, r6)
            java.lang.Object r7 = r7.a(r5, r0)
            if (r7 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r5 = r4
        L_0x0052:
            com.clubhouse.android.shared.Result r7 = (com.clubhouse.android.shared.Result) r7
            com.clubhouse.android.data.repos.ChannelRepo$cancelNewChannelInvite$2 r6 = new com.clubhouse.android.data.repos.ChannelRepo$cancelNewChannelInvite$2
            r6.<init>(r5)
            com.clubhouse.android.data.repos.ChannelRepo$cancelNewChannelInvite$3 r0 = new com.clubhouse.android.data.repos.ChannelRepo$cancelNewChannelInvite$3
            r0.<init>(r5)
            r7.b(r6, r0)
            java.lang.Object r5 = r7.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ChannelRepo.d(long, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(java.lang.String r6, boolean r7, com.clubhouse.android.data.models.local.channel.HandraisePermission r8, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.clubhouse.android.data.repos.ChannelRepo$changeHandraisePermissions$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.clubhouse.android.data.repos.ChannelRepo$changeHandraisePermissions$1 r0 = (com.clubhouse.android.data.repos.ChannelRepo$changeHandraisePermissions$1) r0
            int r1 = r0.Y1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y1 = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ChannelRepo$changeHandraisePermissions$1 r0 = new com.clubhouse.android.data.repos.ChannelRepo$changeHandraisePermissions$1
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.x
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.Y1
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r6 = r0.q
            com.clubhouse.android.data.models.remote.request.ChangeHandraiseSettingsRequest r6 = (com.clubhouse.android.data.models.remote.request.ChangeHandraiseSettingsRequest) r6
            java.lang.Object r7 = r0.d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.c
            com.clubhouse.android.data.repos.ChannelRepo r8 = (com.clubhouse.android.data.repos.ChannelRepo) r8
            i0.j.f.p.h.d4(r9)
            r4 = r9
            r9 = r6
            r6 = r7
            r7 = r4
            goto L_0x0062
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003f:
            i0.j.f.p.h.d4(r9)
            com.clubhouse.android.data.models.remote.request.ChangeHandraiseSettingsRequest r9 = new com.clubhouse.android.data.models.remote.request.ChangeHandraiseSettingsRequest
            r9.<init>(r6, r7, r8)
            com.clubhouse.android.data.network.ServerDataSource r7 = r5.b
            r0.c = r5
            r0.d = r6
            r0.q = r9
            r0.Y1 = r3
            java.util.Objects.requireNonNull(r7)
            com.clubhouse.android.data.network.ServerDataSource$changeHandraiseSettings$2 r8 = new com.clubhouse.android.data.network.ServerDataSource$changeHandraiseSettings$2
            r2 = 0
            r8.<init>(r7, r9, r2)
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r1) goto L_0x0061
            return r1
        L_0x0061:
            r8 = r5
        L_0x0062:
            com.clubhouse.android.shared.Result r7 = (com.clubhouse.android.shared.Result) r7
            com.clubhouse.android.data.repos.ChannelRepo$changeHandraisePermissions$2 r0 = new com.clubhouse.android.data.repos.ChannelRepo$changeHandraisePermissions$2
            r0.<init>(r8, r6, r9)
            com.clubhouse.android.data.repos.ChannelRepo$changeHandraisePermissions$3 r9 = new com.clubhouse.android.data.repos.ChannelRepo$changeHandraisePermissions$3
            r9.<init>(r8, r6)
            r7.b(r0, r9)
            java.lang.Object r6 = r7.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ChannelRepo.e(java.lang.String, boolean, com.clubhouse.android.data.models.local.channel.HandraisePermission, m0.l.c):java.lang.Object");
    }

    public final Channel f(String str) {
        i.e(str, Include.INCLUDE_CHANNEL_PARAM_VALUE);
        Channel value = this.e.getValue();
        return (Channel) (i.a(value == null ? null : value.e(), str) ? this.e.getValue() : this.d.get(str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(com.clubhouse.android.data.models.remote.request.CreateChannelRequest r5, m0.l.c<? super com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.clubhouse.android.data.repos.ChannelRepo$createChannel$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.clubhouse.android.data.repos.ChannelRepo$createChannel$1 r0 = (com.clubhouse.android.data.repos.ChannelRepo$createChannel$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ChannelRepo$createChannel$1 r0 = new com.clubhouse.android.data.repos.ChannelRepo$createChannel$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r5 = r0.d
            com.clubhouse.android.data.models.remote.request.CreateChannelRequest r5 = (com.clubhouse.android.data.models.remote.request.CreateChannelRequest) r5
            java.lang.Object r0 = r0.c
            com.clubhouse.android.data.repos.ChannelRepo r0 = (com.clubhouse.android.data.repos.ChannelRepo) r0
            i0.j.f.p.h.d4(r6)
            goto L_0x0053
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            i0.j.f.p.h.d4(r6)
            com.clubhouse.android.data.network.ServerDataSource r6 = r4.b
            r0.c = r4
            r0.d = r5
            r0.y = r3
            java.util.Objects.requireNonNull(r6)
            com.clubhouse.android.data.network.ServerDataSource$createChannel$2 r2 = new com.clubhouse.android.data.network.ServerDataSource$createChannel$2
            r3 = 0
            r2.<init>(r6, r5, r3)
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r0 = r4
        L_0x0053:
            com.clubhouse.android.shared.Result r6 = (com.clubhouse.android.shared.Result) r6
            com.clubhouse.android.data.repos.ChannelRepo$createChannel$2 r1 = new com.clubhouse.android.data.repos.ChannelRepo$createChannel$2
            r1.<init>(r0, r5)
            com.clubhouse.android.data.repos.ChannelRepo$createChannel$3 r5 = new com.clubhouse.android.data.repos.ChannelRepo$createChannel$3
            r5.<init>(r0)
            r6.b(r1, r5)
            java.lang.Object r5 = r6.a()
            r6 = r5
            com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess r6 = (com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess) r6
            android.util.LruCache<java.lang.String, com.clubhouse.android.data.models.local.channel.Channel> r0 = r0.d
            java.lang.String r1 = r6.d2
            r0.put(r1, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ChannelRepo.g(com.clubhouse.android.data.models.remote.request.CreateChannelRequest, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(java.lang.String r7, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.clubhouse.android.data.repos.ChannelRepo$disableChannel$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.clubhouse.android.data.repos.ChannelRepo$disableChannel$1 r0 = (com.clubhouse.android.data.repos.ChannelRepo$disableChannel$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ChannelRepo$disableChannel$1 r0 = new com.clubhouse.android.data.repos.ChannelRepo$disableChannel$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            java.lang.Object r7 = r0.d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r0.c
            com.clubhouse.android.data.repos.ChannelRepo r0 = (com.clubhouse.android.data.repos.ChannelRepo) r0
            i0.j.f.p.h.d4(r8)
            goto L_0x0058
        L_0x0030:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0038:
            i0.j.f.p.h.d4(r8)
            com.clubhouse.android.data.network.ServerDataSource r8 = r6.b
            com.clubhouse.android.data.models.remote.request.ChannelRequest r2 = new com.clubhouse.android.data.models.remote.request.ChannelRequest
            r2.<init>(r7)
            r0.c = r6
            r0.d = r7
            r0.y = r4
            java.util.Objects.requireNonNull(r8)
            com.clubhouse.android.data.network.ServerDataSource$disableClips$2 r5 = new com.clubhouse.android.data.network.ServerDataSource$disableClips$2
            r5.<init>(r8, r2, r3)
            java.lang.Object r8 = r8.a(r5, r0)
            if (r8 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r0 = r6
        L_0x0058:
            com.clubhouse.android.shared.Result r8 = (com.clubhouse.android.shared.Result) r8
            com.clubhouse.android.data.repos.ChannelRepo$disableChannel$2 r1 = new com.clubhouse.android.data.repos.ChannelRepo$disableChannel$2
            r1.<init>(r0, r7)
            com.clubhouse.android.shared.Result.c(r8, r3, r1, r4, r3)
            java.lang.Object r7 = r8.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ChannelRepo.h(java.lang.String, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(java.lang.String r6, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.repos.ChannelRepo$endChannel$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.repos.ChannelRepo$endChannel$1 r0 = (com.clubhouse.android.data.repos.ChannelRepo$endChannel$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ChannelRepo$endChannel$1 r0 = new com.clubhouse.android.data.repos.ChannelRepo$endChannel$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r6 = r0.d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r0.c
            com.clubhouse.android.data.repos.ChannelRepo r0 = (com.clubhouse.android.data.repos.ChannelRepo) r0
            i0.j.f.p.h.d4(r7)
            goto L_0x0058
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            i0.j.f.p.h.d4(r7)
            com.clubhouse.android.data.network.ServerDataSource r7 = r5.b
            com.clubhouse.android.data.models.remote.request.ChannelRequest r2 = new com.clubhouse.android.data.models.remote.request.ChannelRequest
            r2.<init>(r6)
            r0.c = r5
            r0.d = r6
            r0.y = r3
            java.util.Objects.requireNonNull(r7)
            com.clubhouse.android.data.network.ServerDataSource$endChannel$2 r3 = new com.clubhouse.android.data.network.ServerDataSource$endChannel$2
            r4 = 0
            r3.<init>(r7, r2, r4)
            java.lang.Object r7 = r7.a(r3, r0)
            if (r7 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r0 = r5
        L_0x0058:
            com.clubhouse.android.shared.Result r7 = (com.clubhouse.android.shared.Result) r7
            com.clubhouse.android.data.repos.ChannelRepo$endChannel$2 r1 = new com.clubhouse.android.data.repos.ChannelRepo$endChannel$2
            r1.<init>(r0, r6)
            com.clubhouse.android.data.repos.ChannelRepo$endChannel$3 r2 = new com.clubhouse.android.data.repos.ChannelRepo$endChannel$3
            r2.<init>(r0, r6)
            r7.b(r1, r2)
            java.lang.Object r6 = r7.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ChannelRepo.i(java.lang.String, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(java.lang.String r6, m0.l.c<? super com.clubhouse.android.data.models.local.channel.ChannelInRoom> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.repos.ChannelRepo$getChannel$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.repos.ChannelRepo$getChannel$1 r0 = (com.clubhouse.android.data.repos.ChannelRepo$getChannel$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ChannelRepo$getChannel$1 r0 = new com.clubhouse.android.data.repos.ChannelRepo$getChannel$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            java.lang.Object r6 = r0.c
            com.clubhouse.android.data.repos.ChannelRepo r6 = (com.clubhouse.android.data.repos.ChannelRepo) r6
            i0.j.f.p.h.d4(r7)
            goto L_0x0052
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            i0.j.f.p.h.d4(r7)
            com.clubhouse.android.data.network.ServerDataSource r7 = r5.b
            com.clubhouse.android.data.models.remote.request.ChannelRequest r2 = new com.clubhouse.android.data.models.remote.request.ChannelRequest
            r2.<init>(r6)
            r0.c = r5
            r0.x = r4
            java.util.Objects.requireNonNull(r7)
            com.clubhouse.android.data.network.ServerDataSource$getChannel$2 r6 = new com.clubhouse.android.data.network.ServerDataSource$getChannel$2
            r6.<init>(r7, r2, r3)
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r6 = r5
        L_0x0052:
            com.clubhouse.android.shared.Result r7 = (com.clubhouse.android.shared.Result) r7
            com.clubhouse.android.data.repos.ChannelRepo$getChannel$2 r0 = new com.clubhouse.android.data.repos.ChannelRepo$getChannel$2
            r0.<init>(r6)
            com.clubhouse.android.shared.Result.c(r7, r3, r0, r4, r3)
            java.lang.Object r7 = r7.a()
            r0 = r7
            com.clubhouse.android.data.models.local.channel.BaseChannelInRoom r0 = (com.clubhouse.android.data.models.local.channel.BaseChannelInRoom) r0
            android.util.LruCache<java.lang.String, com.clubhouse.android.data.models.local.channel.Channel> r6 = r6.d
            java.lang.String r1 = r0.d2
            r6.put(r1, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ChannelRepo.j(java.lang.String, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(m0.l.c<? super com.clubhouse.android.data.models.remote.response.GetCreateChannelTargetsResponse> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.clubhouse.android.data.repos.ChannelRepo$getCreateChannelTargets$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.clubhouse.android.data.repos.ChannelRepo$getCreateChannelTargets$1 r0 = (com.clubhouse.android.data.repos.ChannelRepo$getCreateChannelTargets$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ChannelRepo$getCreateChannelTargets$1 r0 = new com.clubhouse.android.data.repos.ChannelRepo$getCreateChannelTargets$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.c
            com.clubhouse.android.data.repos.ChannelRepo r0 = (com.clubhouse.android.data.repos.ChannelRepo) r0
            i0.j.f.p.h.d4(r5)
            goto L_0x004d
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            i0.j.f.p.h.d4(r5)
            com.clubhouse.android.data.network.ServerDataSource r5 = r4.b
            r0.c = r4
            r0.x = r3
            java.util.Objects.requireNonNull(r5)
            com.clubhouse.android.data.network.ServerDataSource$getCreateChannelTargets$2 r2 = new com.clubhouse.android.data.network.ServerDataSource$getCreateChannelTargets$2
            r3 = 0
            r2.<init>(r5, r3)
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r0 = r4
        L_0x004d:
            com.clubhouse.android.shared.Result r5 = (com.clubhouse.android.shared.Result) r5
            com.clubhouse.android.data.repos.ChannelRepo$getCreateChannelTargets$2 r1 = new com.clubhouse.android.data.repos.ChannelRepo$getCreateChannelTargets$2
            r1.<init>(r0)
            com.clubhouse.android.data.repos.ChannelRepo$getCreateChannelTargets$3 r2 = new com.clubhouse.android.data.repos.ChannelRepo$getCreateChannelTargets$3
            r2.<init>(r0)
            r5.b(r1, r2)
            java.lang.Object r5 = r5.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ChannelRepo.k(m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(m0.l.c<? super java.util.List<? extends i0.e.b.b3.a.a.d.a.e>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.repos.ChannelRepo$getFeed$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.repos.ChannelRepo$getFeed$1 r0 = (com.clubhouse.android.data.repos.ChannelRepo$getFeed$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ChannelRepo$getFeed$1 r0 = new com.clubhouse.android.data.repos.ChannelRepo$getFeed$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            long r1 = r0.d
            java.lang.Object r0 = r0.c
            com.clubhouse.android.data.repos.ChannelRepo r0 = (com.clubhouse.android.data.repos.ChannelRepo) r0
            i0.j.f.p.h.d4(r7)
            goto L_0x004d
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0035:
            i0.j.f.p.h.d4(r7)
            long r4 = java.lang.System.currentTimeMillis()
            com.clubhouse.android.data.network.FeedDataSource r7 = r6.a
            r0.c = r6
            r0.d = r4
            r0.y = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r6
            r1 = r4
        L_0x004d:
            com.clubhouse.android.shared.Result r7 = (com.clubhouse.android.shared.Result) r7
            com.clubhouse.android.data.repos.ChannelRepo$getFeed$2 r4 = new com.clubhouse.android.data.repos.ChannelRepo$getFeed$2
            r4.<init>(r0, r1)
            r0 = 0
            com.clubhouse.android.shared.Result.c(r7, r0, r4, r3, r0)
            java.lang.Object r7 = r7.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ChannelRepo.l(m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(m0.l.c<? super com.clubhouse.android.data.models.local.channel.ChannelInRoom> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.clubhouse.android.data.repos.ChannelRepo$getWelcomeChannel$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.clubhouse.android.data.repos.ChannelRepo$getWelcomeChannel$1 r0 = (com.clubhouse.android.data.repos.ChannelRepo$getWelcomeChannel$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ChannelRepo$getWelcomeChannel$1 r0 = new com.clubhouse.android.data.repos.ChannelRepo$getWelcomeChannel$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.c
            com.clubhouse.android.data.repos.ChannelRepo r0 = (com.clubhouse.android.data.repos.ChannelRepo) r0
            i0.j.f.p.h.d4(r5)
            goto L_0x004d
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            i0.j.f.p.h.d4(r5)
            com.clubhouse.android.data.network.ServerDataSource r5 = r4.b
            r0.c = r4
            r0.x = r3
            java.util.Objects.requireNonNull(r5)
            com.clubhouse.android.data.network.ServerDataSource$getWelcomeChannel$2 r2 = new com.clubhouse.android.data.network.ServerDataSource$getWelcomeChannel$2
            r3 = 0
            r2.<init>(r5, r3)
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r0 = r4
        L_0x004d:
            com.clubhouse.android.shared.Result r5 = (com.clubhouse.android.shared.Result) r5
            com.clubhouse.android.data.repos.ChannelRepo$getWelcomeChannel$2 r1 = new com.clubhouse.android.data.repos.ChannelRepo$getWelcomeChannel$2
            r1.<init>(r0)
            com.clubhouse.android.data.repos.ChannelRepo$getWelcomeChannel$3 r2 = new com.clubhouse.android.data.repos.ChannelRepo$getWelcomeChannel$3
            r2.<init>(r0)
            r5.b(r1, r2)
            java.lang.Object r5 = r5.a()
            r1 = r5
            com.clubhouse.android.data.models.local.channel.BaseChannelInRoom r1 = (com.clubhouse.android.data.models.local.channel.BaseChannelInRoom) r1
            android.util.LruCache<java.lang.String, com.clubhouse.android.data.models.local.channel.Channel> r0 = r0.d
            java.lang.String r2 = r1.d2
            r0.put(r2, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ChannelRepo.m(m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n(java.lang.String r5, boolean r6, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.repos.ChannelRepo$hideChannel$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.repos.ChannelRepo$hideChannel$1 r0 = (com.clubhouse.android.data.repos.ChannelRepo$hideChannel$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ChannelRepo$hideChannel$1 r0 = new com.clubhouse.android.data.repos.ChannelRepo$hideChannel$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.c
            com.clubhouse.android.data.repos.ChannelRepo r5 = (com.clubhouse.android.data.repos.ChannelRepo) r5
            i0.j.f.p.h.d4(r7)
            goto L_0x0052
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            i0.j.f.p.h.d4(r7)
            com.clubhouse.android.data.network.ServerDataSource r7 = r4.b
            com.clubhouse.android.data.models.remote.request.HideChannelRequest r2 = new com.clubhouse.android.data.models.remote.request.HideChannelRequest
            r2.<init>(r5, r6)
            r0.c = r4
            r0.x = r3
            java.util.Objects.requireNonNull(r7)
            com.clubhouse.android.data.network.ServerDataSource$hideChannel$2 r5 = new com.clubhouse.android.data.network.ServerDataSource$hideChannel$2
            r6 = 0
            r5.<init>(r7, r2, r6)
            java.lang.Object r7 = r7.a(r5, r0)
            if (r7 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r5 = r4
        L_0x0052:
            com.clubhouse.android.shared.Result r7 = (com.clubhouse.android.shared.Result) r7
            com.clubhouse.android.data.repos.ChannelRepo$hideChannel$2 r6 = new com.clubhouse.android.data.repos.ChannelRepo$hideChannel$2
            r6.<init>(r5)
            com.clubhouse.android.data.repos.ChannelRepo$hideChannel$3 r0 = new com.clubhouse.android.data.repos.ChannelRepo$hideChannel$3
            r0.<init>(r5)
            r7.b(r6, r0)
            java.lang.Object r5 = r7.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ChannelRepo.n(java.lang.String, boolean, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Integer r6, java.lang.Integer r7, java.util.Map<java.lang.String, ? extends java.lang.Object> r8, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.clubhouse.android.data.repos.ChannelRepo$ignoreSuggestion$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.clubhouse.android.data.repos.ChannelRepo$ignoreSuggestion$1 r0 = (com.clubhouse.android.data.repos.ChannelRepo$ignoreSuggestion$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ChannelRepo$ignoreSuggestion$1 r0 = new com.clubhouse.android.data.repos.ChannelRepo$ignoreSuggestion$1
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            java.lang.Object r6 = r0.c
            com.clubhouse.android.data.repos.ChannelRepo r6 = (com.clubhouse.android.data.repos.ChannelRepo) r6
            i0.j.f.p.h.d4(r9)
            goto L_0x0052
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            i0.j.f.p.h.d4(r9)
            com.clubhouse.android.data.network.ServerDataSource r9 = r5.b
            com.clubhouse.android.data.models.remote.response.IgnoreSuggestionRequest r2 = new com.clubhouse.android.data.models.remote.response.IgnoreSuggestionRequest
            r2.<init>(r6, r7, r8)
            r0.c = r5
            r0.x = r4
            java.util.Objects.requireNonNull(r9)
            com.clubhouse.android.data.network.ServerDataSource$ignoreSuggestion$2 r6 = new com.clubhouse.android.data.network.ServerDataSource$ignoreSuggestion$2
            r6.<init>(r9, r2, r3)
            java.lang.Object r9 = r9.a(r6, r0)
            if (r9 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r6 = r5
        L_0x0052:
            com.clubhouse.android.shared.Result r9 = (com.clubhouse.android.shared.Result) r9
            com.clubhouse.android.data.repos.ChannelRepo$ignoreSuggestion$2 r7 = new com.clubhouse.android.data.repos.ChannelRepo$ignoreSuggestion$2
            r7.<init>(r6)
            com.clubhouse.android.shared.Result.c(r9, r3, r7, r4, r3)
            java.lang.Object r6 = r9.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ChannelRepo.o(java.lang.Integer, java.lang.Integer, java.util.Map, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object p(java.lang.String r5, int r6, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.repos.ChannelRepo$inviteSpeaker$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.repos.ChannelRepo$inviteSpeaker$1 r0 = (com.clubhouse.android.data.repos.ChannelRepo$inviteSpeaker$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ChannelRepo$inviteSpeaker$1 r0 = new com.clubhouse.android.data.repos.ChannelRepo$inviteSpeaker$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r5 = r0.d
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.c
            com.clubhouse.android.data.repos.ChannelRepo r6 = (com.clubhouse.android.data.repos.ChannelRepo) r6
            i0.j.f.p.h.d4(r7)
            goto L_0x0058
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            i0.j.f.p.h.d4(r7)
            com.clubhouse.android.data.network.ServerDataSource r7 = r4.b
            com.clubhouse.android.data.models.remote.request.ChannelUserRequest r2 = new com.clubhouse.android.data.models.remote.request.ChannelUserRequest
            r2.<init>(r5, r6)
            r0.c = r4
            r0.d = r5
            r0.y = r3
            java.util.Objects.requireNonNull(r7)
            com.clubhouse.android.data.network.ServerDataSource$inviteSpeaker$2 r6 = new com.clubhouse.android.data.network.ServerDataSource$inviteSpeaker$2
            r3 = 0
            r6.<init>(r7, r2, r3)
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r6 = r4
        L_0x0058:
            com.clubhouse.android.shared.Result r7 = (com.clubhouse.android.shared.Result) r7
            com.clubhouse.android.data.repos.ChannelRepo$inviteSpeaker$2 r0 = new com.clubhouse.android.data.repos.ChannelRepo$inviteSpeaker$2
            r0.<init>(r6, r5)
            com.clubhouse.android.data.repos.ChannelRepo$inviteSpeaker$3 r1 = new com.clubhouse.android.data.repos.ChannelRepo$inviteSpeaker$3
            r1.<init>(r6, r5)
            r7.b(r0, r1)
            java.lang.Object r5 = r7.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ChannelRepo.p(java.lang.String, int, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object q(java.lang.String r6, int r7, m0.l.c<? super com.clubhouse.android.data.models.remote.response.InviteToExistingChannelResponse> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.clubhouse.android.data.repos.ChannelRepo$inviteToExistingChannel$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.clubhouse.android.data.repos.ChannelRepo$inviteToExistingChannel$1 r0 = (com.clubhouse.android.data.repos.ChannelRepo$inviteToExistingChannel$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ChannelRepo$inviteToExistingChannel$1 r0 = new com.clubhouse.android.data.repos.ChannelRepo$inviteToExistingChannel$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            java.lang.Object r6 = r0.d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.c
            com.clubhouse.android.data.repos.ChannelRepo r7 = (com.clubhouse.android.data.repos.ChannelRepo) r7
            i0.j.f.p.h.d4(r8)
            goto L_0x0058
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            i0.j.f.p.h.d4(r8)
            com.clubhouse.android.data.network.ServerDataSource r8 = r5.b
            com.clubhouse.android.data.models.remote.request.ChannelUserRequest r2 = new com.clubhouse.android.data.models.remote.request.ChannelUserRequest
            r2.<init>(r6, r7)
            r0.c = r5
            r0.d = r6
            r0.y = r4
            java.util.Objects.requireNonNull(r8)
            com.clubhouse.android.data.network.ServerDataSource$inviteToExistingChannel$2 r7 = new com.clubhouse.android.data.network.ServerDataSource$inviteToExistingChannel$2
            r7.<init>(r8, r2, r3)
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r7 = r5
        L_0x0058:
            com.clubhouse.android.shared.Result r8 = (com.clubhouse.android.shared.Result) r8
            com.clubhouse.android.data.repos.ChannelRepo$inviteToExistingChannel$2 r0 = new com.clubhouse.android.data.repos.ChannelRepo$inviteToExistingChannel$2
            r0.<init>(r7, r6)
            com.clubhouse.android.shared.Result.c(r8, r3, r0, r4, r3)
            java.lang.Object r6 = r8.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ChannelRepo.q(java.lang.String, int, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object r(int r7, m0.l.c<? super com.clubhouse.android.data.models.remote.response.InviteToNewChannelResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.clubhouse.android.data.repos.ChannelRepo$inviteToNewChannel$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.clubhouse.android.data.repos.ChannelRepo$inviteToNewChannel$1 r0 = (com.clubhouse.android.data.repos.ChannelRepo$inviteToNewChannel$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ChannelRepo$inviteToNewChannel$1 r0 = new com.clubhouse.android.data.repos.ChannelRepo$inviteToNewChannel$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r7 = r0.c
            com.clubhouse.android.data.repos.ChannelRepo r7 = (com.clubhouse.android.data.repos.ChannelRepo) r7
            i0.j.f.p.h.d4(r8)
            goto L_0x0058
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            i0.j.f.p.h.d4(r8)
            com.clubhouse.android.data.network.ServerDataSource r8 = r6.b
            com.clubhouse.android.data.models.remote.request.UserRequest r2 = new com.clubhouse.android.data.models.remote.request.UserRequest
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r7)
            r7 = 6
            r5 = 0
            r2.<init>((java.lang.Integer) r4, (java.lang.String) r5, (java.util.Map) r5, (int) r7)
            r0.c = r6
            r0.x = r3
            java.util.Objects.requireNonNull(r8)
            com.clubhouse.android.data.network.ServerDataSource$inviteToNewChannel$2 r7 = new com.clubhouse.android.data.network.ServerDataSource$inviteToNewChannel$2
            r7.<init>(r8, r2, r5)
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r7 = r6
        L_0x0058:
            com.clubhouse.android.shared.Result r8 = (com.clubhouse.android.shared.Result) r8
            com.clubhouse.android.data.repos.ChannelRepo$inviteToNewChannel$2 r0 = new com.clubhouse.android.data.repos.ChannelRepo$inviteToNewChannel$2
            r0.<init>(r7)
            com.clubhouse.android.data.repos.ChannelRepo$inviteToNewChannel$3 r1 = new com.clubhouse.android.data.repos.ChannelRepo$inviteToNewChannel$3
            r1.<init>(r7)
            r8.b(r0, r1)
            java.lang.Object r7 = r8.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ChannelRepo.r(int, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object s(java.lang.String r6, java.util.Map<java.lang.String, ? extends java.lang.Object> r7, m0.l.c<? super com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.clubhouse.android.data.repos.ChannelRepo$joinChannel$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.clubhouse.android.data.repos.ChannelRepo$joinChannel$1 r0 = (com.clubhouse.android.data.repos.ChannelRepo$joinChannel$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ChannelRepo$joinChannel$1 r0 = new com.clubhouse.android.data.repos.ChannelRepo$joinChannel$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            java.lang.Object r6 = r0.d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.c
            com.clubhouse.android.data.repos.ChannelRepo r7 = (com.clubhouse.android.data.repos.ChannelRepo) r7
            i0.j.f.p.h.d4(r8)
            goto L_0x0058
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            i0.j.f.p.h.d4(r8)
            com.clubhouse.android.data.network.ServerDataSource r8 = r5.b
            com.clubhouse.android.data.models.remote.request.JoinChannelRequest r2 = new com.clubhouse.android.data.models.remote.request.JoinChannelRequest
            r2.<init>(r6, r7)
            r0.c = r5
            r0.d = r6
            r0.y = r4
            java.util.Objects.requireNonNull(r8)
            com.clubhouse.android.data.network.ServerDataSource$joinChannel$2 r7 = new com.clubhouse.android.data.network.ServerDataSource$joinChannel$2
            r7.<init>(r8, r2, r3)
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r7 = r5
        L_0x0058:
            com.clubhouse.android.shared.Result r8 = (com.clubhouse.android.shared.Result) r8
            com.clubhouse.android.data.repos.ChannelRepo$joinChannel$2 r0 = new com.clubhouse.android.data.repos.ChannelRepo$joinChannel$2
            r0.<init>(r7, r6)
            com.clubhouse.android.shared.Result.c(r8, r3, r0, r4, r3)
            java.lang.Object r6 = r8.a()
            r8 = r6
            com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess r8 = (com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess) r8
            android.util.LruCache<java.lang.String, com.clubhouse.android.data.models.local.channel.Channel> r7 = r7.d
            java.lang.String r0 = r8.d2
            r7.put(r0, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ChannelRepo.s(java.lang.String, java.util.Map, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(java.lang.String r7, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.clubhouse.android.data.repos.ChannelRepo$leaveChannel$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.clubhouse.android.data.repos.ChannelRepo$leaveChannel$1 r0 = (com.clubhouse.android.data.repos.ChannelRepo$leaveChannel$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ChannelRepo$leaveChannel$1 r0 = new com.clubhouse.android.data.repos.ChannelRepo$leaveChannel$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            java.lang.Object r7 = r0.d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r0.c
            com.clubhouse.android.data.repos.ChannelRepo r0 = (com.clubhouse.android.data.repos.ChannelRepo) r0
            i0.j.f.p.h.d4(r8)
            goto L_0x0058
        L_0x0030:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0038:
            i0.j.f.p.h.d4(r8)
            com.clubhouse.android.data.network.ServerDataSource r8 = r6.b
            com.clubhouse.android.data.models.remote.request.ChannelRequest r2 = new com.clubhouse.android.data.models.remote.request.ChannelRequest
            r2.<init>(r7)
            r0.c = r6
            r0.d = r7
            r0.y = r4
            java.util.Objects.requireNonNull(r8)
            com.clubhouse.android.data.network.ServerDataSource$leaveChannel$2 r5 = new com.clubhouse.android.data.network.ServerDataSource$leaveChannel$2
            r5.<init>(r8, r2, r3)
            java.lang.Object r8 = r8.a(r5, r0)
            if (r8 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r0 = r6
        L_0x0058:
            com.clubhouse.android.shared.Result r8 = (com.clubhouse.android.shared.Result) r8
            com.clubhouse.android.data.repos.ChannelRepo$leaveChannel$2 r1 = new com.clubhouse.android.data.repos.ChannelRepo$leaveChannel$2
            r1.<init>(r0, r7)
            com.clubhouse.android.shared.Result.c(r8, r3, r1, r4, r3)
            java.lang.Object r7 = r8.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ChannelRepo.t(java.lang.String, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u(java.lang.String r6, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.repos.ChannelRepo$makeChannelPublic$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.repos.ChannelRepo$makeChannelPublic$1 r0 = (com.clubhouse.android.data.repos.ChannelRepo$makeChannelPublic$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ChannelRepo$makeChannelPublic$1 r0 = new com.clubhouse.android.data.repos.ChannelRepo$makeChannelPublic$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r6 = r0.d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r0.c
            com.clubhouse.android.data.repos.ChannelRepo r0 = (com.clubhouse.android.data.repos.ChannelRepo) r0
            i0.j.f.p.h.d4(r7)
            goto L_0x0058
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            i0.j.f.p.h.d4(r7)
            com.clubhouse.android.data.network.ServerDataSource r7 = r5.b
            com.clubhouse.android.data.models.remote.request.ChannelRequest r2 = new com.clubhouse.android.data.models.remote.request.ChannelRequest
            r2.<init>(r6)
            r0.c = r5
            r0.d = r6
            r0.y = r3
            java.util.Objects.requireNonNull(r7)
            com.clubhouse.android.data.network.ServerDataSource$makeChannelPublic$2 r3 = new com.clubhouse.android.data.network.ServerDataSource$makeChannelPublic$2
            r4 = 0
            r3.<init>(r7, r2, r4)
            java.lang.Object r7 = r7.a(r3, r0)
            if (r7 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r0 = r5
        L_0x0058:
            com.clubhouse.android.shared.Result r7 = (com.clubhouse.android.shared.Result) r7
            com.clubhouse.android.data.repos.ChannelRepo$makeChannelPublic$2 r1 = new com.clubhouse.android.data.repos.ChannelRepo$makeChannelPublic$2
            r1.<init>(r0, r6)
            com.clubhouse.android.data.repos.ChannelRepo$makeChannelPublic$3 r2 = new com.clubhouse.android.data.repos.ChannelRepo$makeChannelPublic$3
            r2.<init>(r0, r6)
            r7.b(r1, r2)
            java.lang.Object r6 = r7.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ChannelRepo.u(java.lang.String, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(java.lang.String r6, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.repos.ChannelRepo$makeChannelSocial$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.repos.ChannelRepo$makeChannelSocial$1 r0 = (com.clubhouse.android.data.repos.ChannelRepo$makeChannelSocial$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ChannelRepo$makeChannelSocial$1 r0 = new com.clubhouse.android.data.repos.ChannelRepo$makeChannelSocial$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r6 = r0.d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r0.c
            com.clubhouse.android.data.repos.ChannelRepo r0 = (com.clubhouse.android.data.repos.ChannelRepo) r0
            i0.j.f.p.h.d4(r7)
            goto L_0x0058
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            i0.j.f.p.h.d4(r7)
            com.clubhouse.android.data.network.ServerDataSource r7 = r5.b
            com.clubhouse.android.data.models.remote.request.ChannelRequest r2 = new com.clubhouse.android.data.models.remote.request.ChannelRequest
            r2.<init>(r6)
            r0.c = r5
            r0.d = r6
            r0.y = r3
            java.util.Objects.requireNonNull(r7)
            com.clubhouse.android.data.network.ServerDataSource$makeChannelSocial$2 r3 = new com.clubhouse.android.data.network.ServerDataSource$makeChannelSocial$2
            r4 = 0
            r3.<init>(r7, r2, r4)
            java.lang.Object r7 = r7.a(r3, r0)
            if (r7 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r0 = r5
        L_0x0058:
            com.clubhouse.android.shared.Result r7 = (com.clubhouse.android.shared.Result) r7
            com.clubhouse.android.data.repos.ChannelRepo$makeChannelSocial$2 r1 = new com.clubhouse.android.data.repos.ChannelRepo$makeChannelSocial$2
            r1.<init>(r0, r6)
            com.clubhouse.android.data.repos.ChannelRepo$makeChannelSocial$3 r2 = new com.clubhouse.android.data.repos.ChannelRepo$makeChannelSocial$3
            r2.<init>(r0, r6)
            r7.b(r1, r2)
            java.lang.Object r6 = r7.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ChannelRepo.v(java.lang.String, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object w(java.lang.String r5, int r6, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.repos.ChannelRepo$makeModerator$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.repos.ChannelRepo$makeModerator$1 r0 = (com.clubhouse.android.data.repos.ChannelRepo$makeModerator$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ChannelRepo$makeModerator$1 r0 = new com.clubhouse.android.data.repos.ChannelRepo$makeModerator$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r5 = r0.d
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.c
            com.clubhouse.android.data.repos.ChannelRepo r6 = (com.clubhouse.android.data.repos.ChannelRepo) r6
            i0.j.f.p.h.d4(r7)
            goto L_0x0058
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            i0.j.f.p.h.d4(r7)
            com.clubhouse.android.data.network.ServerDataSource r7 = r4.b
            com.clubhouse.android.data.models.remote.request.ChannelUserRequest r2 = new com.clubhouse.android.data.models.remote.request.ChannelUserRequest
            r2.<init>(r5, r6)
            r0.c = r4
            r0.d = r5
            r0.y = r3
            java.util.Objects.requireNonNull(r7)
            com.clubhouse.android.data.network.ServerDataSource$makeModerator$2 r6 = new com.clubhouse.android.data.network.ServerDataSource$makeModerator$2
            r3 = 0
            r6.<init>(r7, r2, r3)
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r6 = r4
        L_0x0058:
            com.clubhouse.android.shared.Result r7 = (com.clubhouse.android.shared.Result) r7
            com.clubhouse.android.data.repos.ChannelRepo$makeModerator$2 r0 = new com.clubhouse.android.data.repos.ChannelRepo$makeModerator$2
            r0.<init>(r6, r5)
            com.clubhouse.android.data.repos.ChannelRepo$makeModerator$3 r1 = new com.clubhouse.android.data.repos.ChannelRepo$makeModerator$3
            r1.<init>(r6, r5)
            r7.b(r0, r1)
            java.lang.Object r5 = r7.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ChannelRepo.w(java.lang.String, int, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.String r5, int r6, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.repos.ChannelRepo$muteSpeaker$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.repos.ChannelRepo$muteSpeaker$1 r0 = (com.clubhouse.android.data.repos.ChannelRepo$muteSpeaker$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ChannelRepo$muteSpeaker$1 r0 = new com.clubhouse.android.data.repos.ChannelRepo$muteSpeaker$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r5 = r0.d
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.c
            com.clubhouse.android.data.repos.ChannelRepo r6 = (com.clubhouse.android.data.repos.ChannelRepo) r6
            i0.j.f.p.h.d4(r7)
            goto L_0x0058
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            i0.j.f.p.h.d4(r7)
            com.clubhouse.android.data.network.ServerDataSource r7 = r4.b
            com.clubhouse.android.data.models.remote.request.ChannelUserRequest r2 = new com.clubhouse.android.data.models.remote.request.ChannelUserRequest
            r2.<init>(r5, r6)
            r0.c = r4
            r0.d = r5
            r0.y = r3
            java.util.Objects.requireNonNull(r7)
            com.clubhouse.android.data.network.ServerDataSource$muteSpeaker$2 r6 = new com.clubhouse.android.data.network.ServerDataSource$muteSpeaker$2
            r3 = 0
            r6.<init>(r7, r2, r3)
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r6 = r4
        L_0x0058:
            com.clubhouse.android.shared.Result r7 = (com.clubhouse.android.shared.Result) r7
            com.clubhouse.android.data.repos.ChannelRepo$muteSpeaker$2 r0 = new com.clubhouse.android.data.repos.ChannelRepo$muteSpeaker$2
            r0.<init>(r6, r5)
            com.clubhouse.android.data.repos.ChannelRepo$muteSpeaker$3 r1 = new com.clubhouse.android.data.repos.ChannelRepo$muteSpeaker$3
            r1.<init>(r6, r5)
            r7.b(r0, r1)
            java.lang.Object r5 = r7.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ChannelRepo.x(java.lang.String, int, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object y(java.lang.String r7, m0.l.c<? super com.clubhouse.android.data.models.remote.response.AudienceReplyResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.clubhouse.android.data.repos.ChannelRepo$raiseHands$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.clubhouse.android.data.repos.ChannelRepo$raiseHands$1 r0 = (com.clubhouse.android.data.repos.ChannelRepo$raiseHands$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ChannelRepo$raiseHands$1 r0 = new com.clubhouse.android.data.repos.ChannelRepo$raiseHands$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r7 = r0.d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r0.c
            com.clubhouse.android.data.repos.ChannelRepo r0 = (com.clubhouse.android.data.repos.ChannelRepo) r0
            i0.j.f.p.h.d4(r8)
            goto L_0x005a
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            i0.j.f.p.h.d4(r8)
            com.clubhouse.android.data.network.ServerDataSource r8 = r6.b
            com.clubhouse.android.data.models.remote.request.AudienceReplyRequest r2 = new com.clubhouse.android.data.models.remote.request.AudienceReplyRequest
            r4 = 0
            r5 = 4
            r2.<init>((java.lang.String) r7, (boolean) r3, (boolean) r4, (int) r5)
            r0.c = r6
            r0.d = r7
            r0.y = r3
            java.util.Objects.requireNonNull(r8)
            com.clubhouse.android.data.network.ServerDataSource$audienceReply$2 r3 = new com.clubhouse.android.data.network.ServerDataSource$audienceReply$2
            r4 = 0
            r3.<init>(r8, r2, r4)
            java.lang.Object r8 = r8.a(r3, r0)
            if (r8 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r0 = r6
        L_0x005a:
            com.clubhouse.android.shared.Result r8 = (com.clubhouse.android.shared.Result) r8
            com.clubhouse.android.data.repos.ChannelRepo$raiseHands$2 r1 = new com.clubhouse.android.data.repos.ChannelRepo$raiseHands$2
            r1.<init>(r0, r7)
            com.clubhouse.android.data.repos.ChannelRepo$raiseHands$3 r2 = new com.clubhouse.android.data.repos.ChannelRepo$raiseHands$3
            r2.<init>(r0, r7)
            r8.b(r1, r2)
            java.lang.Object r7 = r8.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ChannelRepo.y(java.lang.String, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object z(long r5, m0.l.c<? super com.clubhouse.android.data.models.remote.response.EmptySuccessResponse> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.repos.ChannelRepo$rejectNewChannelInvite$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.repos.ChannelRepo$rejectNewChannelInvite$1 r0 = (com.clubhouse.android.data.repos.ChannelRepo$rejectNewChannelInvite$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.repos.ChannelRepo$rejectNewChannelInvite$1 r0 = new com.clubhouse.android.data.repos.ChannelRepo$rejectNewChannelInvite$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.c
            com.clubhouse.android.data.repos.ChannelRepo r5 = (com.clubhouse.android.data.repos.ChannelRepo) r5
            i0.j.f.p.h.d4(r7)
            goto L_0x0052
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            i0.j.f.p.h.d4(r7)
            com.clubhouse.android.data.network.ServerDataSource r7 = r4.b
            com.clubhouse.android.data.models.remote.response.ChannelInviteActionRequest r2 = new com.clubhouse.android.data.models.remote.response.ChannelInviteActionRequest
            r2.<init>(r5)
            r0.c = r4
            r0.x = r3
            java.util.Objects.requireNonNull(r7)
            com.clubhouse.android.data.network.ServerDataSource$rejectNewChannelInvite$2 r5 = new com.clubhouse.android.data.network.ServerDataSource$rejectNewChannelInvite$2
            r6 = 0
            r5.<init>(r7, r2, r6)
            java.lang.Object r7 = r7.a(r5, r0)
            if (r7 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r5 = r4
        L_0x0052:
            com.clubhouse.android.shared.Result r7 = (com.clubhouse.android.shared.Result) r7
            com.clubhouse.android.data.repos.ChannelRepo$rejectNewChannelInvite$2 r6 = new com.clubhouse.android.data.repos.ChannelRepo$rejectNewChannelInvite$2
            r6.<init>(r5)
            com.clubhouse.android.data.repos.ChannelRepo$rejectNewChannelInvite$3 r0 = new com.clubhouse.android.data.repos.ChannelRepo$rejectNewChannelInvite$3
            r0.<init>(r5)
            r7.b(r6, r0)
            java.lang.Object r5 = r7.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.repos.ChannelRepo.z(long, m0.l.c):java.lang.Object");
    }
}
