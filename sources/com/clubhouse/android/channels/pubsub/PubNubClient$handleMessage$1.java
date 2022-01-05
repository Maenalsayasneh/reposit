package com.clubhouse.android.channels.pubsub;

import com.pubnub.api.models.consumer.pubsub.MessageResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.channels.pubsub.PubNubClient", f = "PubNubClient.kt", l = {141, 143}, m = "handleMessage")
/* compiled from: PubNubClient.kt */
public final class PubNubClient$handleMessage$1 extends ContinuationImpl {
    public /* synthetic */ Object c;
    public final /* synthetic */ PubNubClient d;
    public int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PubNubClient$handleMessage$1(PubNubClient pubNubClient, m0.l.c<? super PubNubClient$handleMessage$1> cVar) {
        super(cVar);
        this.d = pubNubClient;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.q |= Integer.MIN_VALUE;
        return this.d.a((MessageResult) null, this);
    }
}
