package com.clubhouse.backchannel.data.network;

import com.clubhouse.android.user.model.User;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.a3.d.a;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.q;

@c(c = "com.clubhouse.backchannel.data.network.ChatRecipientsDataSource$result$1", f = "ChatRecipientsDataSource.kt", l = {}, m = "invokeSuspend")
/* compiled from: ChatRecipientsDataSource.kt */
public final class ChatRecipientsDataSource$result$1 extends SuspendLambda implements q<b<? extends List<? extends a<User>>>, Set<? extends User>, m0.l.c<? super b<? extends List<? extends a<User>>>>, Object> {
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;

    public ChatRecipientsDataSource$result$1(m0.l.c<? super ChatRecipientsDataSource$result$1> cVar) {
        super(3, cVar);
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        ChatRecipientsDataSource$result$1 chatRecipientsDataSource$result$1 = new ChatRecipientsDataSource$result$1((m0.l.c) obj3);
        chatRecipientsDataSource$result$1.c = (b) obj;
        chatRecipientsDataSource$result$1.d = (Set) obj2;
        return chatRecipientsDataSource$result$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        b bVar = (b) this.c;
        Set set = (Set) this.d;
        if (!(bVar instanceof f0)) {
            return bVar;
        }
        Iterable<a> iterable = (Iterable) ((f0) bVar).b;
        ArrayList arrayList = new ArrayList(h.K(iterable, 10));
        for (a aVar : iterable) {
            arrayList.add(new a(aVar.a, set.contains(aVar.a)));
        }
        return new f0(arrayList);
    }
}
