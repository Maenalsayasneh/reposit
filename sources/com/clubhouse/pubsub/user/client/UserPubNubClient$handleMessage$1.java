package com.clubhouse.pubsub.user.client;

import com.pubnub.api.models.consumer.pubsub.MessageResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.pubsub.user.client.UserPubNubClient", f = "UserPubNubClient.kt", l = {77}, m = "handleMessage")
/* compiled from: UserPubNubClient.kt */
public final class UserPubNubClient$handleMessage$1 extends ContinuationImpl {
    public /* synthetic */ Object c;
    public final /* synthetic */ UserPubNubClient d;
    public int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserPubNubClient$handleMessage$1(UserPubNubClient userPubNubClient, m0.l.c<? super UserPubNubClient$handleMessage$1> cVar) {
        super(cVar);
        this.d = userPubNubClient;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.q |= Integer.MIN_VALUE;
        return UserPubNubClient.a(this.d, (MessageResult) null, this);
    }
}
