package com.clubhouse.backchannel.create;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import i0.e.c.f.b.a.a;
import i0.j.f.p.h;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.backchannel.create.BackchannelCreateChatViewModel$getOrCreateChat$1", f = "BackchannelCreateChatViewModel.kt", l = {88}, m = "invokeSuspend")
/* compiled from: BackchannelCreateChatViewModel.kt */
public final class BackchannelCreateChatViewModel$getOrCreateChat$1 extends SuspendLambda implements l<m0.l.c<? super a>, Object> {
    public int c;
    public final /* synthetic */ BackchannelCreateChatViewModel d;
    public final /* synthetic */ List<Integer> q;
    public final /* synthetic */ SourceLocation x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelCreateChatViewModel$getOrCreateChat$1(BackchannelCreateChatViewModel backchannelCreateChatViewModel, List<Integer> list, SourceLocation sourceLocation, m0.l.c<? super BackchannelCreateChatViewModel$getOrCreateChat$1> cVar) {
        super(1, cVar);
        this.d = backchannelCreateChatViewModel;
        this.q = list;
        this.x = sourceLocation;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new BackchannelCreateChatViewModel$getOrCreateChat$1(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj) {
        return new BackchannelCreateChatViewModel$getOrCreateChat$1(this.d, this.q, this.x, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            i0.e.c.f.d.a aVar = this.d.o;
            List<Integer> list = this.q;
            SourceLocation sourceLocation = this.x;
            this.c = 1;
            obj = aVar.a(list, sourceLocation, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
