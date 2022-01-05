package com.clubhouse.backchannel.archive;

import i0.e.c.f.d.a;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.backchannel.archive.BackchannelArchiveViewModel$unarchiveChat$2", f = "BackchannelArchiveViewModel.kt", l = {62}, m = "invokeSuspend")
/* compiled from: BackchannelArchiveViewModel.kt */
public final class BackchannelArchiveViewModel$unarchiveChat$2 extends SuspendLambda implements l<m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ BackchannelArchiveViewModel d;
    public final /* synthetic */ String q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelArchiveViewModel$unarchiveChat$2(BackchannelArchiveViewModel backchannelArchiveViewModel, String str, m0.l.c<? super BackchannelArchiveViewModel$unarchiveChat$2> cVar) {
        super(1, cVar);
        this.d = backchannelArchiveViewModel;
        this.q = str;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new BackchannelArchiveViewModel$unarchiveChat$2(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new BackchannelArchiveViewModel$unarchiveChat$2(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            a aVar = this.d.n;
            String str = this.q;
            this.c = 1;
            if (aVar.m(str, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
