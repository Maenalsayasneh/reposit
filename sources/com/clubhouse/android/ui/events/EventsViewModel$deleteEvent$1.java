package com.clubhouse.android.ui.events;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.EventRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.events.EventsViewModel$deleteEvent$1", f = "EventsViewModel.kt", l = {151}, m = "invokeSuspend")
/* compiled from: EventsViewModel.kt */
public final class EventsViewModel$deleteEvent$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ EventsViewModel d;
    public final /* synthetic */ EventInClub q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventsViewModel$deleteEvent$1(EventsViewModel eventsViewModel, EventInClub eventInClub, m0.l.c<? super EventsViewModel$deleteEvent$1> cVar) {
        super(1, cVar);
        this.d = eventsViewModel;
        this.q = eventInClub;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new EventsViewModel$deleteEvent$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new EventsViewModel$deleteEvent$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            EventRepo eventRepo = this.d.o;
            int i2 = this.q.Y1;
            this.c = 1;
            obj = eventRepo.b(i2, this);
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
