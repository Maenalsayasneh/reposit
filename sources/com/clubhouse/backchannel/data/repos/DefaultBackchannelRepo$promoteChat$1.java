package com.clubhouse.backchannel.data.repos;

import com.clubhouse.pubsub.user.backchannel.models.remote.Chat;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatType;
import h0.b0.v;
import j$.time.OffsetDateTime;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: DefaultBackchannelRepo.kt */
public final class DefaultBackchannelRepo$promoteChat$1 extends Lambda implements l<Chat, Chat> {
    public final /* synthetic */ DefaultBackchannelRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultBackchannelRepo$promoteChat$1(DefaultBackchannelRepo defaultBackchannelRepo) {
        super(1);
        this.c = defaultBackchannelRepo;
    }

    public Object invoke(Object obj) {
        Chat chat = (Chat) obj;
        if (chat == null) {
            return null;
        }
        List<ChatMember> list = chat.Z1;
        final DefaultBackchannelRepo defaultBackchannelRepo = this.c;
        return Chat.a(chat, (String) null, (ChatType) null, (Integer) null, (OffsetDateTime) null, (OffsetDateTime) null, (ChatMessage) null, v.N1(list, new l<ChatMember, Boolean>() {
            public Object invoke(Object obj) {
                ChatMember chatMember = (ChatMember) obj;
                i.e(chatMember, "it");
                return Boolean.valueOf(chatMember.getId().intValue() == DefaultBackchannelRepo.this.k);
            }
        }, AnonymousClass2.c), 63);
    }
}
