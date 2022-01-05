package com.clubhouse.backchannel.data.repos;

import com.clubhouse.pubsub.user.backchannel.models.remote.Chat;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatType;
import h0.b0.v;
import j$.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import m0.l.c;
import m0.l.e;
import m0.n.a.l;
import m0.r.t.a.r.m.a1.a;

/* compiled from: DefaultBackchannelRepo.kt */
public final class DefaultBackchannelRepo$applyRemovedChatMember$1 extends Lambda implements l<Chat, Chat> {
    public final /* synthetic */ int c;
    public final /* synthetic */ DefaultBackchannelRepo d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultBackchannelRepo$applyRemovedChatMember$1(int i, DefaultBackchannelRepo defaultBackchannelRepo) {
        super(1);
        this.c = i;
        this.d = defaultBackchannelRepo;
    }

    public Object invoke(Object obj) {
        Chat chat = (Chat) obj;
        if (chat == null) {
            return null;
        }
        int i = this.c;
        DefaultBackchannelRepo defaultBackchannelRepo = this.d;
        List<T> N1 = v.N1(chat.Z1, new DefaultBackchannelRepo$applyRemovedChatMember$1$1$updatedMembers$1(i), DefaultBackchannelRepo$applyRemovedChatMember$1$1$updatedMembers$2.c);
        if (i != defaultBackchannelRepo.k) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) N1).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((ChatMember) next).q) {
                    arrayList.add(next);
                }
            }
            if (arrayList.size() != 1) {
                return Chat.a(chat, (String) null, (ChatType) null, (Integer) null, (OffsetDateTime) null, (OffsetDateTime) null, (ChatMessage) null, N1, 63);
            }
        }
        a.E2(defaultBackchannelRepo.h, (e) null, (CoroutineStart) null, new DefaultBackchannelRepo$applyRemovedChatMember$1$1$2(defaultBackchannelRepo, chat, (c<? super DefaultBackchannelRepo$applyRemovedChatMember$1$1$2>) null), 3, (Object) null);
        return null;
    }
}
