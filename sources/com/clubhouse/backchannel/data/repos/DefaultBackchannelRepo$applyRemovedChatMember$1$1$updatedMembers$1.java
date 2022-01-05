package com.clubhouse.backchannel.data.repos;

import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: DefaultBackchannelRepo.kt */
public final class DefaultBackchannelRepo$applyRemovedChatMember$1$1$updatedMembers$1 extends Lambda implements l<ChatMember, Boolean> {
    public final /* synthetic */ int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultBackchannelRepo$applyRemovedChatMember$1$1$updatedMembers$1(int i) {
        super(1);
        this.c = i;
    }

    public Object invoke(Object obj) {
        ChatMember chatMember = (ChatMember) obj;
        i.e(chatMember, "it");
        return Boolean.valueOf(chatMember.getId().intValue() == this.c);
    }
}
