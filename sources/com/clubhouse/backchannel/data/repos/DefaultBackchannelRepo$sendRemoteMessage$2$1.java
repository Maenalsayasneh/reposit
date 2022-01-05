package com.clubhouse.backchannel.data.repos;

import com.clubhouse.pubsub.user.backchannel.models.remote.Chat;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;

/* compiled from: DefaultBackchannelRepo.kt */
public final class DefaultBackchannelRepo$sendRemoteMessage$2$1 extends Lambda implements l<Chat, Chat> {
    public final /* synthetic */ DefaultBackchannelRepo c;
    public final /* synthetic */ int d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultBackchannelRepo$sendRemoteMessage$2$1(DefaultBackchannelRepo defaultBackchannelRepo, int i) {
        super(1);
        this.c = defaultBackchannelRepo;
        this.d = i;
    }

    public Object invoke(Object obj) {
        Chat chat = (Chat) obj;
        if (chat == null) {
            return null;
        }
        return chat.d(this.c.k, this.d);
    }
}
