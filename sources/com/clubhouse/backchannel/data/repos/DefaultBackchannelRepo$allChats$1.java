package com.clubhouse.backchannel.data.repos;

import com.clubhouse.pubsub.user.backchannel.models.remote.Chat;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatType;
import i0.j.f.p.h;
import j$.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.j.g;
import m0.l.f.a.c;
import m0.n.a.r;

@c(c = "com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$allChats$1", f = "DefaultBackchannelRepo.kt", l = {}, m = "invokeSuspend")
/* compiled from: DefaultBackchannelRepo.kt */
public final class DefaultBackchannelRepo$allChats$1 extends SuspendLambda implements r<Map<String, ? extends Chat>, Map<String, ? extends List<? extends ChatMessage>>, Set<? extends Integer>, m0.l.c<? super List<? extends i0.e.c.f.b.a.a>>, Object> {
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ DefaultBackchannelRepo q;

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return h.L(((i0.e.c.f.b.a.a) t2).c, ((i0.e.c.f.b.a.a) t).c);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultBackchannelRepo$allChats$1(DefaultBackchannelRepo defaultBackchannelRepo, m0.l.c<? super DefaultBackchannelRepo$allChats$1> cVar) {
        super(4, cVar);
        this.q = defaultBackchannelRepo;
    }

    public Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        Set set = (Set) obj3;
        DefaultBackchannelRepo$allChats$1 defaultBackchannelRepo$allChats$1 = new DefaultBackchannelRepo$allChats$1(this.q, (m0.l.c) obj4);
        defaultBackchannelRepo$allChats$1.c = (Map) obj;
        defaultBackchannelRepo$allChats$1.d = (Map) obj2;
        return defaultBackchannelRepo$allChats$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        ChatMessage chatMessage;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        Map map = (Map) this.d;
        Collection<Chat> values = ((Map) this.c).values();
        ArrayList arrayList = new ArrayList(h.K(values, 10));
        for (Chat chat : values) {
            List list = (List) map.get(chat.c);
            Chat chat2 = null;
            if (!(list == null || (chatMessage = (ChatMessage) g.w(list)) == null)) {
                chat2 = Chat.a(chat, (String) null, (ChatType) null, (Integer) null, (OffsetDateTime) null, chatMessage.Z1, chatMessage, (List) null, 79);
            }
            if (chat2 != null) {
                chat = chat2;
            }
            arrayList.add(chat);
        }
        DefaultBackchannelRepo defaultBackchannelRepo = this.q;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (Boolean.valueOf(DefaultBackchannelRepo.w(defaultBackchannelRepo, (Chat) next)).booleanValue()) {
                arrayList2.add(next);
            }
        }
        DefaultBackchannelRepo defaultBackchannelRepo2 = this.q;
        ArrayList arrayList3 = new ArrayList(h.K(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(defaultBackchannelRepo2.F((Chat) it2.next()));
        }
        return g.n0(arrayList3, new a());
    }
}
