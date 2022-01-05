package com.clubhouse.backchannel.data.repos;

import com.clubhouse.pubsub.user.backchannel.models.remote.Chat;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatType;
import h0.b0.v;
import j$.time.OffsetDateTime;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: DefaultBackchannelRepo.kt */
public final class DefaultBackchannelRepo$applyAddedChatMember$1 extends Lambda implements l<Chat, Chat> {
    public final /* synthetic */ ChatMember c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultBackchannelRepo$applyAddedChatMember$1(ChatMember chatMember) {
        super(1);
        this.c = chatMember;
    }

    public Object invoke(Object obj) {
        List<T> list;
        Chat chat = (Chat) obj;
        if (chat == null) {
            return null;
        }
        if (chat.a2.contains(this.c.getId())) {
            List<ChatMember> list2 = chat.Z1;
            final ChatMember chatMember = this.c;
            list = v.N1(list2, new l<ChatMember, Boolean>() {
                public Object invoke(Object obj) {
                    ChatMember chatMember = (ChatMember) obj;
                    i.e(chatMember, "it");
                    return Boolean.valueOf(chatMember.getId().intValue() == ChatMember.this.getId().intValue());
                }
            }, AnonymousClass2.c);
        } else {
            list = g.a0(chat.Z1, this.c);
        }
        return Chat.a(chat, (String) null, (ChatType) null, (Integer) null, (OffsetDateTime) null, (OffsetDateTime) null, (ChatMessage) null, list, 63);
    }
}
