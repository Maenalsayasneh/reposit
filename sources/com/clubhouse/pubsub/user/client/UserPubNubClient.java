package com.clubhouse.pubsub.user.client;

import com.clubhouse.android.shared.auth.UserManager;
import com.pubnub.api.PubNub;
import com.pubnub.api.callbacks.SubscribeCallback;
import com.pubnub.api.enums.PNStatusCategory;
import com.pubnub.api.models.consumer.PNStatus;
import com.pubnub.api.models.consumer.pubsub.PNMessageResult;
import i0.e.d.b.b.a;
import i0.e.d.b.b.b;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import m0.l.c;
import m0.l.e;
import m0.n.a.l;
import m0.n.b.i;
import n0.a.f0;
import n0.a.g2.a0;
import n0.a.g2.p;
import n0.a.g2.q;
import n0.a.g2.u;

/* compiled from: UserPubNubClient.kt */
public final class UserPubNubClient implements a {
    public final n0.c.l.a a;
    public final PubNub b;
    public final p<b> c = u.b(0, 0, (BufferOverflow) null, 7);
    public final q<Boolean> d = a0.a(Boolean.FALSE);

    public UserPubNubClient(n0.c.l.a aVar, PubNub pubNub, final f0 f0Var, i0.e.b.a3.a.b bVar, UserManager userManager, i0.e.b.f3.i.a aVar2) {
        i.e(aVar, "json");
        i.e(pubNub, "pubNub");
        i.e(f0Var, "coroutineScope");
        i.e(bVar, "releaseCompletable");
        i.e(userManager, "userManager");
        i.e(aVar2, "userComponentHandler");
        this.a = aVar;
        this.b = pubNub;
        bVar.a.E(new l<Throwable, m0.i>(this) {
            public final /* synthetic */ UserPubNubClient c;

            {
                this.c = r1;
            }

            public Object invoke(Object obj) {
                Throwable th = (Throwable) obj;
                this.c.b.unsubscribeAll();
                return m0.i.a;
            }
        });
        pubNub.addListener(new SubscribeCallback.BaseSubscribeCallback() {

            /* renamed from: com.clubhouse.pubsub.user.client.UserPubNubClient$2$a */
            /* compiled from: UserPubNubClient.kt */
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] a;

                static {
                    PNStatusCategory.values();
                    int[] iArr = new int[20];
                    iArr[PNStatusCategory.PNConnectedCategory.ordinal()] = 1;
                    iArr[PNStatusCategory.PNAcknowledgmentCategory.ordinal()] = 2;
                    iArr[PNStatusCategory.PNReconnectedCategory.ordinal()] = 3;
                    iArr[PNStatusCategory.PNAccessDeniedCategory.ordinal()] = 4;
                    iArr[PNStatusCategory.PNTimeoutCategory.ordinal()] = 5;
                    iArr[PNStatusCategory.PNNetworkIssuesCategory.ordinal()] = 6;
                    iArr[PNStatusCategory.PNDisconnectedCategory.ordinal()] = 7;
                    iArr[PNStatusCategory.PNUnexpectedDisconnectCategory.ordinal()] = 8;
                    iArr[PNStatusCategory.PNCancelledCategory.ordinal()] = 9;
                    iArr[PNStatusCategory.PNBadRequestCategory.ordinal()] = 10;
                    iArr[PNStatusCategory.PNURITooLongCategory.ordinal()] = 11;
                    iArr[PNStatusCategory.PNMalformedFilterExpressionCategory.ordinal()] = 12;
                    iArr[PNStatusCategory.PNMalformedResponseCategory.ordinal()] = 13;
                    iArr[PNStatusCategory.PNDecryptionErrorCategory.ordinal()] = 14;
                    iArr[PNStatusCategory.PNTLSConnectionFailedCategory.ordinal()] = 15;
                    iArr[PNStatusCategory.PNTLSUntrustedCertificateCategory.ordinal()] = 16;
                    iArr[PNStatusCategory.PNRequestMessageCountExceededCategory.ordinal()] = 17;
                    iArr[PNStatusCategory.PNReconnectionAttemptsExhaustedCategory.ordinal()] = 18;
                    iArr[PNStatusCategory.PNRateLimitExceededCategory.ordinal()] = 19;
                    a = iArr;
                }
            }

            public void message(PubNub pubNub, PNMessageResult pNMessageResult) {
                i.e(pubNub, "pubnub");
                i.e(pNMessageResult, "pnMessageResult");
                v0.a.a.d.d(i.k("Pubnub message: ", pNMessageResult), new Object[0]);
                m0.r.t.a.r.m.a1.a.E2(f0Var, (e) null, (CoroutineStart) null, new UserPubNubClient$2$message$1(this, pNMessageResult, (c<? super UserPubNubClient$2$message$1>) null), 3, (Object) null);
            }

            public void status(PubNub pubNub, PNStatus pNStatus) {
                i.e(pubNub, "pubnub");
                i.e(pNStatus, "pnStatus");
                v0.a.a.d.d(i.k("Pubnub status: ", pNStatus), new Object[0]);
                PNStatusCategory category = pNStatus.getCategory();
                switch (category == null ? -1 : a.a[category.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        this.d.setValue(Boolean.TRUE);
                        return;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        this.d.setValue(Boolean.FALSE);
                        return;
                    default:
                        return;
                }
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(com.clubhouse.pubsub.user.client.UserPubNubClient r5, com.pubnub.api.models.consumer.pubsub.MessageResult r6, m0.l.c r7) {
        /*
            java.util.Objects.requireNonNull(r5)
            boolean r0 = r7 instanceof com.clubhouse.pubsub.user.client.UserPubNubClient$handleMessage$1
            if (r0 == 0) goto L_0x0016
            r0 = r7
            com.clubhouse.pubsub.user.client.UserPubNubClient$handleMessage$1 r0 = (com.clubhouse.pubsub.user.client.UserPubNubClient$handleMessage$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.q = r1
            goto L_0x001b
        L_0x0016:
            com.clubhouse.pubsub.user.client.UserPubNubClient$handleMessage$1 r0 = new com.clubhouse.pubsub.user.client.UserPubNubClient$handleMessage$1
            r0.<init>(r5, r7)
        L_0x001b:
            java.lang.Object r7 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            i0.j.f.p.h.d4(r7)     // Catch:{ all -> 0x0058 }
            goto L_0x0055
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            i0.j.f.p.h.d4(r7)
            n0.a.g2.p<i0.e.d.b.b.b> r7 = r5.c     // Catch:{ all -> 0x0058 }
            n0.c.l.a r5 = r5.a     // Catch:{ all -> 0x0058 }
            i0.e.d.b.b.c r2 = i0.e.d.b.b.c.c     // Catch:{ all -> 0x0058 }
            com.google.gson.JsonElement r6 = r6.getMessage()     // Catch:{ all -> 0x0058 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0058 }
            java.lang.String r4 = "message.message.toString()"
            m0.n.b.i.d(r6, r4)     // Catch:{ all -> 0x0058 }
            java.lang.Object r5 = r5.b(r2, r6)     // Catch:{ all -> 0x0058 }
            r0.q = r3     // Catch:{ all -> 0x0058 }
            java.lang.Object r5 = r7.emit(r5, r0)     // Catch:{ all -> 0x0058 }
            if (r5 != r1) goto L_0x0055
            goto L_0x006b
        L_0x0055:
            m0.i r5 = m0.i.a     // Catch:{ all -> 0x0058 }
            goto L_0x005d
        L_0x0058:
            r5 = move-exception
            java.lang.Object r5 = i0.j.f.p.h.l0(r5)
        L_0x005d:
            java.lang.Throwable r5 = kotlin.Result.a(r5)
            if (r5 != 0) goto L_0x0064
            goto L_0x0069
        L_0x0064:
            v0.a.a$b r6 = v0.a.a.d
            r6.w(r5)
        L_0x0069:
            m0.i r1 = m0.i.a
        L_0x006b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.pubsub.user.client.UserPubNubClient.a(com.clubhouse.pubsub.user.client.UserPubNubClient, com.pubnub.api.models.consumer.pubsub.MessageResult, m0.l.c):java.lang.Object");
    }
}
