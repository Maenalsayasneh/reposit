package com.clubhouse.pubsub.user.backchannel.models.remote;

import com.clubhouse.pubsub.user.backchannel.models.remote.MessageData;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import m0.n.a.a;
import n0.c.k.t0;

/* compiled from: MessageData.kt */
public final class MessageData$Unavailable$$cachedSerializer$delegate$2 extends Lambda implements a<KSerializer<Object>> {
    public static final MessageData$Unavailable$$cachedSerializer$delegate$2 c = new MessageData$Unavailable$$cachedSerializer$delegate$2();

    public MessageData$Unavailable$$cachedSerializer$delegate$2() {
        super(0);
    }

    public Object invoke() {
        return new t0("com.clubhouse.pubsub.user.backchannel.models.remote.MessageData.Unavailable", MessageData.Unavailable.a);
    }
}
