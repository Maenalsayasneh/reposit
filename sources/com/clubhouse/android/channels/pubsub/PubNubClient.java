package com.clubhouse.android.channels.pubsub;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.shared.TimedChunkFlow;
import com.clubhouse.android.user.model.UserSelf;
import com.pubnub.api.PNConfiguration;
import com.pubnub.api.PubNub;
import com.pubnub.api.builder.SubscribeBuilder;
import com.pubnub.api.callbacks.SubscribeCallback;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.enums.PNStatusCategory;
import com.pubnub.api.models.consumer.PNStatus;
import com.pubnub.api.models.consumer.pubsub.PNMessageResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import i0.e.b.b3.a.a.c.b;
import i0.e.b.z2.h.a;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import m0.j.g;
import m0.l.c;
import m0.l.e;
import m0.n.b.i;
import n0.a.f0;
import n0.a.g2.d;
import n0.a.g2.p;
import n0.a.g2.u;
import n0.a.h2.f;
import n0.a.m0;

/* compiled from: PubNubClient.kt */
public final class PubNubClient implements a {
    public final PubNub a;
    public final n0.c.l.a b;
    public final i0.e.a.a c;
    public final String d;
    public final f0 e;
    public final p<b> f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final p<Error> k = u.b(0, 0, (BufferOverflow) null, 7);
    public final p<b> l = u.b(0, 0, (BufferOverflow) null, 7);
    public final d<List<b>> m;

    public PubNubClient(PubNub pubNub, n0.c.l.a aVar, i0.e.a.a aVar2, String str, UserSelf userSelf, f0 f0Var) {
        i.e(pubNub, "pubNub");
        i.e(aVar, "json");
        i.e(aVar2, "analytics");
        i.e(str, "channelId");
        i.e(userSelf, "self");
        i.e(f0Var, "channelScope");
        this.a = pubNub;
        this.b = aVar;
        this.c = aVar2;
        this.d = str;
        this.e = new f(f0Var.C().plus(m0.c));
        p<b> b2 = u.b(0, 0, (BufferOverflow) null, 7);
        this.f = b2;
        this.g = i.k("users.", Integer.valueOf(userSelf.a));
        this.h = i.k("channel_all.", str);
        this.i = i.k("channel_speakers.", str);
        this.j = "channel_user." + str + '.' + userSelf.a;
        long millis = TimeUnit.SECONDS.toMillis(1);
        i.e(b2, "<this>");
        this.m = new TimedChunkFlow(b2, millis).c;
        pubNub.addListener(new SubscribeCallback.BaseSubscribeCallback(this) {
            public final /* synthetic */ PubNubClient a;

            {
                this.a = r1;
            }

            public void message(PubNub pubNub, PNMessageResult pNMessageResult) {
                i.e(pubNub, "pubnub");
                i.e(pNMessageResult, "pnMessageResult");
                v0.a.a.d.d("Pubnub message: %s", pNMessageResult);
                PubNubClient pubNubClient = this.a;
                m0.r.t.a.r.m.a1.a.E2(pubNubClient.e, (e) null, (CoroutineStart) null, new PubNubClient$1$message$1(pubNubClient, pNMessageResult, (c<? super PubNubClient$1$message$1>) null), 3, (Object) null);
            }

            public void status(PubNub pubNub, PNStatus pNStatus) {
                i.e(pubNub, "pubnub");
                i.e(pNStatus, "pnStatus");
                PubNubClient pubNubClient = this.a;
                Objects.requireNonNull(pubNubClient);
                if (pNStatus.getOperation() == PNOperationType.PNSubscribeOperation) {
                    PNStatusCategory category = pNStatus.getCategory();
                    PNStatusCategory pNStatusCategory = PNStatusCategory.PNConnectedCategory;
                    if (category == pNStatusCategory || pNStatus.getCategory() == PNStatusCategory.PNReconnectedCategory) {
                        if (pNStatus.getCategory() == pNStatusCategory) {
                            v0.a.a.d.d(i0.d.a.a.a.y0(i0.d.a.a.a.P0("Pubnub: Subscribe: PNConnectedCategory to "), pubNubClient.d, ". Success."), new Object[0]);
                            return;
                        }
                        v0.a.a.d.d(i.k("Pubnub: Subscribe: Connected but after a few failures to ", pubNubClient.d), new Object[0]);
                        ((AmplitudeAnalytics) pubNubClient.c).b("Pubnub-Connect-Status", i0.d.a.a.a.n1("Category", "Reconnected"));
                    } else if (pNStatus.getCategory() == PNStatusCategory.PNUnexpectedDisconnectCategory) {
                        v0.a.a.d.d("Pubnub: Subscribe: PNUnexpectedDisconnectCategory. Will retry automatically.", new Object[0]);
                        ((AmplitudeAnalytics) pubNubClient.c).b("Pubnub-Connect-Status", i0.d.a.a.a.n1("Category", "UnexpectedDisconnect"));
                    } else {
                        PNStatusCategory category2 = pNStatus.getCategory();
                        PNStatusCategory pNStatusCategory2 = PNStatusCategory.PNAccessDeniedCategory;
                        if (category2 == pNStatusCategory2) {
                            v0.a.a.d.d("Pubnub: Subscribe: PNAccessDeniedCategory. Cannot recover.", new Object[0]);
                            ((AmplitudeAnalytics) pubNubClient.c).b("Pubnub-Connect-Status", i0.d.a.a.a.n1("Category", "AccessDenied"));
                        } else {
                            v0.a.a.d.d(i.k("Pubnub: Subscribe: Other error: ", pNStatus.getCategory()), new Object[0]);
                            ((AmplitudeAnalytics) pubNubClient.c).b("Pubnub-Connect-Status", i0.d.a.a.a.n1("Category", i.k("Other-", pNStatus.getCategory())));
                        }
                        if (pNStatus.getCategory() == pNStatusCategory2 || pNStatus.getCategory() == PNStatusCategory.PNTimeoutCategory || pNStatus.getCategory() == PNStatusCategory.PNNetworkIssuesCategory || pNStatus.getCategory() == PNStatusCategory.PNBadRequestCategory) {
                            pubNubClient.k.d(new Error(pNStatus.getErrorData().getInformation()));
                        }
                    }
                } else if (pNStatus.getOperation() == PNOperationType.PNUnsubscribeOperation) {
                    if (pNStatus.getCategory() == PNStatusCategory.PNDisconnectedCategory || pNStatus.getCategory() == PNStatusCategory.PNAcknowledgmentCategory) {
                        v0.a.a.d.d("Pubnub: Unsubscribe: PNDisconnectedCategory success", new Object[0]);
                        return;
                    }
                    v0.a.a.d.d(i.k("Pubnub: Unsubscribe: Other error: ", pNStatus.getCategory()), new Object[0]);
                    ((AmplitudeAnalytics) pubNubClient.c).b("Pubnub-Disconnect-Status", i0.d.a.a.a.n1("Category", i.k("Other-", pNStatus.getCategory())));
                } else if (pNStatus.getOperation() == PNOperationType.PNHeartbeatOperation && pNStatus.isError()) {
                    v0.a.a.d.d(i.k("Pubnub: Heartbeat: PNHeartbeatOperation error: ", pNStatus.getCategory()), new Object[0]);
                }
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: i0.e.b.b3.a.a.c.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: i0.e.b.b3.a.a.c.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: i0.e.b.b3.a.a.c.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: i0.e.b.b3.a.a.c.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(com.pubnub.api.models.consumer.pubsub.MessageResult r8, m0.l.c<? super m0.i> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.clubhouse.android.channels.pubsub.PubNubClient$handleMessage$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.clubhouse.android.channels.pubsub.PubNubClient$handleMessage$1 r0 = (com.clubhouse.android.channels.pubsub.PubNubClient$handleMessage$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.channels.pubsub.PubNubClient$handleMessage$1 r0 = new com.clubhouse.android.channels.pubsub.PubNubClient$handleMessage$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.q
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 == r4) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            goto L_0x002f
        L_0x0027:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x002f:
            i0.j.f.p.h.d4(r9)
            goto L_0x0125
        L_0x0034:
            i0.j.f.p.h.d4(r9)
            r9 = 0
            java.lang.String r2 = r7.g
            java.lang.String r5 = r8.getChannel()
            boolean r2 = m0.n.b.i.a(r2, r5)
            java.lang.String r5 = "result.message.toString()"
            if (r2 == 0) goto L_0x006a
            n0.c.l.a r9 = r7.b
            com.google.gson.JsonElement r8 = r8.getMessage()
            java.lang.String r8 = r8.toString()
            m0.n.b.i.d(r8, r5)
            n0.c.l.q.d r2 = r9.b
            n0.c.m.b r2 = r2.k
            java.lang.Class<com.clubhouse.android.data.models.local.channel.UserMessage> r5 = com.clubhouse.android.data.models.local.channel.UserMessage.class
            m0.r.n r5 = m0.n.b.m.e(r5)
            kotlinx.serialization.KSerializer r2 = m0.r.t.a.r.m.a1.a.u3(r2, r5)
            java.lang.Object r8 = r9.b(r2, r8)
            r9 = r8
            i0.e.b.b3.a.a.c.b r9 = (i0.e.b.b3.a.a.c.b) r9
            goto L_0x00f6
        L_0x006a:
            java.lang.String r2 = r7.h
            java.lang.String r6 = r8.getChannel()
            boolean r2 = m0.n.b.i.a(r2, r6)
            if (r2 == 0) goto L_0x0099
            n0.c.l.a r9 = r7.b
            com.google.gson.JsonElement r8 = r8.getMessage()
            java.lang.String r8 = r8.toString()
            m0.n.b.i.d(r8, r5)
            n0.c.l.q.d r2 = r9.b
            n0.c.m.b r2 = r2.k
            java.lang.Class<com.clubhouse.android.data.models.local.channel.AllUserMessage> r5 = com.clubhouse.android.data.models.local.channel.AllUserMessage.class
            m0.r.n r5 = m0.n.b.m.e(r5)
            kotlinx.serialization.KSerializer r2 = m0.r.t.a.r.m.a1.a.u3(r2, r5)
            java.lang.Object r8 = r9.b(r2, r8)
            r9 = r8
            i0.e.b.b3.a.a.c.b r9 = (i0.e.b.b3.a.a.c.b) r9
            goto L_0x00f6
        L_0x0099:
            java.lang.String r2 = r7.j
            java.lang.String r6 = r8.getChannel()
            boolean r2 = m0.n.b.i.a(r2, r6)
            if (r2 == 0) goto L_0x00c8
            n0.c.l.a r9 = r7.b
            com.google.gson.JsonElement r8 = r8.getMessage()
            java.lang.String r8 = r8.toString()
            m0.n.b.i.d(r8, r5)
            n0.c.l.q.d r2 = r9.b
            n0.c.m.b r2 = r2.k
            java.lang.Class<com.clubhouse.android.data.models.local.channel.ChannelUserMessage> r5 = com.clubhouse.android.data.models.local.channel.ChannelUserMessage.class
            m0.r.n r5 = m0.n.b.m.e(r5)
            kotlinx.serialization.KSerializer r2 = m0.r.t.a.r.m.a1.a.u3(r2, r5)
            java.lang.Object r8 = r9.b(r2, r8)
            r9 = r8
            i0.e.b.b3.a.a.c.b r9 = (i0.e.b.b3.a.a.c.b) r9
            goto L_0x00f6
        L_0x00c8:
            java.lang.String r2 = r7.i
            java.lang.String r6 = r8.getChannel()
            boolean r2 = m0.n.b.i.a(r2, r6)
            if (r2 == 0) goto L_0x00f6
            n0.c.l.a r9 = r7.b
            com.google.gson.JsonElement r8 = r8.getMessage()
            java.lang.String r8 = r8.toString()
            m0.n.b.i.d(r8, r5)
            n0.c.l.q.d r2 = r9.b
            n0.c.m.b r2 = r2.k
            java.lang.Class<com.clubhouse.android.data.models.local.channel.SpeakerMessage> r5 = com.clubhouse.android.data.models.local.channel.SpeakerMessage.class
            m0.r.n r5 = m0.n.b.m.e(r5)
            kotlinx.serialization.KSerializer r2 = m0.r.t.a.r.m.a1.a.u3(r2, r5)
            java.lang.Object r8 = r9.b(r2, r8)
            r9 = r8
            i0.e.b.b3.a.a.c.b r9 = (i0.e.b.b3.a.a.c.b) r9
        L_0x00f6:
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r2 = 0
            r8[r2] = r9
            v0.a.a$b r2 = v0.a.a.d
            java.lang.String r5 = "Pubnub decoded message: %s"
            r2.d(r5, r8)
            if (r9 != 0) goto L_0x0105
            goto L_0x0125
        L_0x0105:
            com.clubhouse.android.data.models.local.channel.MessageType r8 = r9.b()
            boolean r8 = r8.getShouldBatch()
            if (r8 == 0) goto L_0x011a
            n0.a.g2.p<i0.e.b.b3.a.a.c.b> r8 = r7.f
            r0.q = r4
            java.lang.Object r8 = r8.emit(r9, r0)
            if (r8 != r1) goto L_0x0125
            return r1
        L_0x011a:
            n0.a.g2.p<i0.e.b.b3.a.a.c.b> r8 = r7.l
            r0.q = r3
            java.lang.Object r8 = r8.emit(r9, r0)
            if (r8 != r1) goto L_0x0125
            return r1
        L_0x0125:
            m0.i r8 = m0.i.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.channels.pubsub.PubNubClient.a(com.pubnub.api.models.consumer.pubsub.MessageResult, m0.l.c):java.lang.Object");
    }

    public void b(i0.e.b.z2.f.f fVar) {
        i.e(fVar, MessageExtension.FIELD_DATA);
        PNConfiguration configuration = this.a.getConfiguration();
        configuration.setAuthKey(fVar.b);
        configuration.setOrigin(fVar.a);
        configuration.setPresenceTimeoutWithCustomInterval(fVar.c, fVar.d);
        List U = g.U(this.g, this.h, this.j);
        if (fVar.f) {
            U.add(this.i);
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : U) {
            if (!this.a.getSubscribedChannels().contains((String) next)) {
                arrayList.add(next);
            }
        }
        SubscribeBuilder channels = this.a.subscribe().channels((List) arrayList);
        Long l2 = fVar.e;
        if (l2 != null) {
            channels.withTimetoken(Long.valueOf(l2.longValue()));
        }
        channels.execute();
        this.a.presence().channels((List<String>) h.L2(this.j)).connected(true).execute();
    }
}
