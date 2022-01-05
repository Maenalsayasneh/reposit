package com.clubhouse.backchannel.data.repos;

import com.clubhouse.pubsub.user.backchannel.models.remote.Chat;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;

/* compiled from: DefaultBackchannelRepo.kt */
public final class DefaultBackchannelRepo$unarchiveChat$3$1 extends Lambda implements l<Chat, Chat> {
    public final /* synthetic */ DefaultBackchannelRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultBackchannelRepo$unarchiveChat$3$1(DefaultBackchannelRepo defaultBackchannelRepo) {
        super(1);
        this.c = defaultBackchannelRepo;
    }

    public Object invoke(Object obj) {
        Chat chat = (Chat) obj;
        if (chat == null) {
            return null;
        }
        return chat.c(this.c.k, false);
    }
}
