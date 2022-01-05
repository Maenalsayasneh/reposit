package com.clubhouse.backchannel.data.repos;

import com.clubhouse.pubsub.user.backchannel.models.remote.Chat;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.q;

@c(c = "com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$blockedChats$1", f = "DefaultBackchannelRepo.kt", l = {}, m = "invokeSuspend")
/* compiled from: DefaultBackchannelRepo.kt */
public final class DefaultBackchannelRepo$blockedChats$1 extends SuspendLambda implements q<Map<String, ? extends Chat>, Set<? extends Integer>, m0.l.c<? super List<? extends String>>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ DefaultBackchannelRepo d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultBackchannelRepo$blockedChats$1(DefaultBackchannelRepo defaultBackchannelRepo, m0.l.c<? super DefaultBackchannelRepo$blockedChats$1> cVar) {
        super(3, cVar);
        this.d = defaultBackchannelRepo;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        Set set = (Set) obj2;
        DefaultBackchannelRepo$blockedChats$1 defaultBackchannelRepo$blockedChats$1 = new DefaultBackchannelRepo$blockedChats$1(this.d, (m0.l.c) obj3);
        defaultBackchannelRepo$blockedChats$1.c = (Map) obj;
        return defaultBackchannelRepo$blockedChats$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        Collection values = ((Map) this.c).values();
        DefaultBackchannelRepo defaultBackchannelRepo = this.d;
        ArrayList arrayList = new ArrayList();
        for (Object next : values) {
            Chat chat = (Chat) next;
            if (Boolean.valueOf(!DefaultBackchannelRepo.w(defaultBackchannelRepo, chat) && !defaultBackchannelRepo.A(chat)).booleanValue()) {
                arrayList.add(next);
            }
        }
        DefaultBackchannelRepo defaultBackchannelRepo2 = this.d;
        ArrayList arrayList2 = new ArrayList(h.K(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(defaultBackchannelRepo2.F((Chat) it.next()).a);
        }
        return arrayList2;
    }
}
