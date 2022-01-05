package com.clubhouse.android.channels.repos;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.g2.e;

@c(c = "com.clubhouse.android.channels.repos.SpeakerStateDataSource$muteSignalForUser$3", f = "SpeakerStateDataSource.kt", l = {44}, m = "invokeSuspend")
/* compiled from: SpeakerStateDataSource.kt */
public final class SpeakerStateDataSource$muteSignalForUser$3 extends SuspendLambda implements p<e<? super Boolean>, m0.l.c<? super i>, Object> {
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ SpeakerStateDataSource q;
    public final /* synthetic */ Integer x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpeakerStateDataSource$muteSignalForUser$3(SpeakerStateDataSource speakerStateDataSource, Integer num, m0.l.c<? super SpeakerStateDataSource$muteSignalForUser$3> cVar) {
        super(2, cVar);
        this.q = speakerStateDataSource;
        this.x = num;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        SpeakerStateDataSource$muteSignalForUser$3 speakerStateDataSource$muteSignalForUser$3 = new SpeakerStateDataSource$muteSignalForUser$3(this.q, this.x, cVar);
        speakerStateDataSource$muteSignalForUser$3.d = obj;
        return speakerStateDataSource$muteSignalForUser$3;
    }

    public Object invoke(Object obj, Object obj2) {
        SpeakerStateDataSource$muteSignalForUser$3 speakerStateDataSource$muteSignalForUser$3 = new SpeakerStateDataSource$muteSignalForUser$3(this.q, this.x, (m0.l.c) obj2);
        speakerStateDataSource$muteSignalForUser$3.d = (e) obj;
        return speakerStateDataSource$muteSignalForUser$3.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            Boolean valueOf = Boolean.valueOf(this.q.a(this.x));
            this.c = 1;
            if (((e) this.d).emit(valueOf, this) == coroutineSingletons) {
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
