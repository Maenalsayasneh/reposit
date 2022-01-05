package com.clubhouse.backchannel.data.repos;

import com.clubhouse.android.core.storage.Store;
import com.clubhouse.android.shared.Result;
import com.clubhouse.backchannel.data.models.remote.response.ChatMessagesResponse;
import com.clubhouse.backchannel.data.network.ChatDataSource$getChatMessages$2;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage;
import i0.e.c.f.b.a.f;
import i0.e.c.f.b.a.j;
import i0.e.c.f.c.b;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$fetchChatMessages$2", f = "DefaultBackchannelRepo.kt", l = {273}, m = "invokeSuspend")
/* compiled from: DefaultBackchannelRepo.kt */
public final class DefaultBackchannelRepo$fetchChatMessages$2 extends SuspendLambda implements l<m0.l.c<? super List<? extends Store.a<String, ChatMessage>>>, Object> {
    public int c;
    public final /* synthetic */ DefaultBackchannelRepo d;
    public final /* synthetic */ String q;
    public final /* synthetic */ j x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultBackchannelRepo$fetchChatMessages$2(DefaultBackchannelRepo defaultBackchannelRepo, String str, j jVar, m0.l.c<? super DefaultBackchannelRepo$fetchChatMessages$2> cVar) {
        super(1, cVar);
        this.d = defaultBackchannelRepo;
        this.q = str;
        this.x = jVar;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new DefaultBackchannelRepo$fetchChatMessages$2(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj) {
        return new DefaultBackchannelRepo$fetchChatMessages$2(this.d, this.q, this.x, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            b bVar = this.d.a;
            String str = this.q;
            j jVar = this.x;
            Integer num = jVar.b;
            Integer num2 = jVar.a;
            this.c = 1;
            Objects.requireNonNull(bVar);
            obj = bVar.a(new ChatDataSource$getChatMessages$2(bVar, str, num, num2, (Integer) null, (m0.l.c<? super ChatDataSource$getChatMessages$2>) null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Result result = (Result) obj;
        Result.c(result, (l) null, new DefaultBackchannelRepo$fetchChatMessages$2$response$1(this.d, this.q, this.x), 1, (Object) null);
        DefaultBackchannelRepo defaultBackchannelRepo = this.d;
        String str2 = this.q;
        j jVar2 = this.x;
        defaultBackchannelRepo.C(str2, jVar2, new f(jVar2, System.currentTimeMillis()));
        List<ChatMessage> list = ((ChatMessagesResponse) result.a()).a;
        ArrayList arrayList = new ArrayList(h.K(list, 10));
        for (ChatMessage cVar : list) {
            arrayList.add(new Store.a.c(cVar));
        }
        return arrayList;
    }
}
