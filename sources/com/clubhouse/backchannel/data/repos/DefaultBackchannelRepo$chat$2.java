package com.clubhouse.backchannel.data.repos;

import com.clubhouse.pubsub.user.backchannel.models.remote.ChatDestination;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatType;
import com.clubhouse.pubsub.user.backchannel.models.remote.Role;
import i0.e.c.f.b.a.a;
import i0.j.f.p.h;
import j$.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.q;

@c(c = "com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$chat$2", f = "DefaultBackchannelRepo.kt", l = {}, m = "invokeSuspend")
/* compiled from: DefaultBackchannelRepo.kt */
public final class DefaultBackchannelRepo$chat$2 extends SuspendLambda implements q<a, Map<Integer, ? extends i0.e.b.b3.a.a.f.a>, m0.l.c<? super a>, Object> {
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;

    public DefaultBackchannelRepo$chat$2(m0.l.c<? super DefaultBackchannelRepo$chat$2> cVar) {
        super(3, cVar);
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        DefaultBackchannelRepo$chat$2 defaultBackchannelRepo$chat$2 = new DefaultBackchannelRepo$chat$2((m0.l.c) obj3);
        defaultBackchannelRepo$chat$2.c = (a) obj;
        defaultBackchannelRepo$chat$2.d = (Map) obj2;
        return defaultBackchannelRepo$chat$2.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        Integer num;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        a aVar = (a) this.c;
        Map map = (Map) this.d;
        List<ChatMember> list = aVar.g;
        ArrayList arrayList = new ArrayList(h.K(list, 10));
        for (ChatMember chatMember : list) {
            i0.e.b.b3.a.a.f.a aVar2 = (i0.e.b.b3.a.a.f.a) map.get(chatMember.getId());
            if (aVar2 == null) {
                num = null;
            } else {
                num = new Integer(aVar2.d);
            }
            arrayList.add(ChatMember.a(chatMember, (String) null, 0, false, (Role) null, 0, (String) null, (String) null, (String) null, (ChatDestination) null, num, (Boolean) null, (Boolean) null, 3583));
        }
        String str = aVar.a;
        int i = aVar.b;
        OffsetDateTime offsetDateTime = aVar.c;
        i0.e.c.f.b.a.c cVar = aVar.d;
        int i2 = aVar.e;
        ChatType chatType = aVar.f;
        List<ChatMember> list2 = aVar.h;
        boolean z = aVar.i;
        m0.n.b.i.e(str, "id");
        m0.n.b.i.e(offsetDateTime, "timeUpdated");
        m0.n.b.i.e(chatType, "type");
        m0.n.b.i.e(arrayList, "participants");
        m0.n.b.i.e(list2, "blockedParticipants");
        return new a(str, i, offsetDateTime, cVar, i2, chatType, arrayList, list2, z);
    }
}
