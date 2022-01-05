package com.clubhouse.backchannel.data.network;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.shared.Result;
import com.clubhouse.android.user.model.User;
import com.clubhouse.backchannel.data.models.remote.response.ChatRecipientsResponse;
import i0.b.b.b;
import i0.b.b.f;
import i0.e.b.a3.d.a;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import n0.a.f0;
import n0.a.g2.q;

@c(c = "com.clubhouse.backchannel.data.network.ChatRecipientsDataSource$fetchResults$1", f = "ChatRecipientsDataSource.kt", l = {55}, m = "invokeSuspend")
/* compiled from: ChatRecipientsDataSource.kt */
public final class ChatRecipientsDataSource$fetchResults$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public Object c;
    public int d;
    public final /* synthetic */ ChatRecipientsDataSource q;
    public final /* synthetic */ String x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatRecipientsDataSource$fetchResults$1(ChatRecipientsDataSource chatRecipientsDataSource, String str, m0.l.c<? super ChatRecipientsDataSource$fetchResults$1> cVar) {
        super(2, cVar);
        this.q = chatRecipientsDataSource;
        this.x = str;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new ChatRecipientsDataSource$fetchResults$1(this.q, this.x, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new ChatRecipientsDataSource$fetchResults$1(this.q, this.x, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        q<b<List<a<User>>>> qVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            h.d4(obj);
            this.q.e.setValue(new f((Object) null, 1));
            ChatRecipientsDataSource chatRecipientsDataSource = this.q;
            q<b<List<a<User>>>> qVar2 = chatRecipientsDataSource.e;
            i0.e.c.f.c.b bVar = chatRecipientsDataSource.a;
            String str = this.x;
            this.c = qVar2;
            this.d = 1;
            Objects.requireNonNull(bVar);
            obj = bVar.a(new ChatDataSource$searchChatRecipients$2(bVar, str, (m0.l.c<? super ChatDataSource$searchChatRecipients$2>) null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            qVar = qVar2;
        } else if (i == 1) {
            qVar = (q) this.c;
            try {
                h.d4(obj);
            } catch (Throwable th) {
                this.q.e.setValue(new i0.b.b.c(th, (Object) null, 2));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Result result = (Result) obj;
        final ChatRecipientsDataSource chatRecipientsDataSource2 = this.q;
        Result.c(result, (l) null, new l<Exception, i>() {
            public Object invoke(Object obj) {
                m0.n.b.i.e((Exception) obj, "it");
                ((AmplitudeAnalytics) chatRecipientsDataSource2.b).a("Server-SearchChatRecipients-Error");
                return i.a;
            }
        }, 1, (Object) null);
        List<BasicUser> list = ((ChatRecipientsResponse) result.a()).a;
        ArrayList arrayList = new ArrayList(h.K(list, 10));
        for (BasicUser aVar : list) {
            arrayList.add(new a(aVar, false));
        }
        qVar.setValue(new i0.b.b.f0(arrayList));
        return i.a;
    }
}
