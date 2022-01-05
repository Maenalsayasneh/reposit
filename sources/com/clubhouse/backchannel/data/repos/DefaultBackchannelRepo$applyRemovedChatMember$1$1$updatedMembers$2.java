package com.clubhouse.backchannel.data.repos;

import com.clubhouse.pubsub.user.backchannel.models.remote.ChatDestination;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember;
import com.clubhouse.pubsub.user.backchannel.models.remote.Role;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: DefaultBackchannelRepo.kt */
public final class DefaultBackchannelRepo$applyRemovedChatMember$1$1$updatedMembers$2 extends Lambda implements l<ChatMember, ChatMember> {
    public static final DefaultBackchannelRepo$applyRemovedChatMember$1$1$updatedMembers$2 c = new DefaultBackchannelRepo$applyRemovedChatMember$1$1$updatedMembers$2();

    public DefaultBackchannelRepo$applyRemovedChatMember$1$1$updatedMembers$2() {
        super(1);
    }

    public Object invoke(Object obj) {
        ChatMember chatMember = (ChatMember) obj;
        i.e(chatMember, "it");
        return ChatMember.a(chatMember, (String) null, 0, false, (Role) null, 0, (String) null, (String) null, (String) null, (ChatDestination) null, (Integer) null, (Boolean) null, (Boolean) null, 4091);
    }
}
