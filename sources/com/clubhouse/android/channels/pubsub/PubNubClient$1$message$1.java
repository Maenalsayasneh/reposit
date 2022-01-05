package com.clubhouse.android.channels.pubsub;

import com.pubnub.api.models.consumer.pubsub.PNMessageResult;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.clubhouse.android.channels.pubsub.PubNubClient$1$message$1", f = "PubNubClient.kt", l = {57}, m = "invokeSuspend")
/* compiled from: PubNubClient.kt */
public final class PubNubClient$1$message$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ PubNubClient d;
    public final /* synthetic */ PNMessageResult q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PubNubClient$1$message$1(PubNubClient pubNubClient, PNMessageResult pNMessageResult, m0.l.c<? super PubNubClient$1$message$1> cVar) {
        super(2, cVar);
        this.d = pubNubClient;
        this.q = pNMessageResult;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new PubNubClient$1$message$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new PubNubClient$1$message$1(this.d, this.q, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            PubNubClient pubNubClient = this.d;
            PNMessageResult pNMessageResult = this.q;
            this.c = 1;
            if (pubNubClient.a(pNMessageResult, this) == coroutineSingletons) {
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
