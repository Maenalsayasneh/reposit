package com.clubhouse.android.ui.events;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.events.EventsViewModel$rsvpEvent$1", f = "EventsViewModel.kt", l = {123}, m = "invokeSuspend")
/* compiled from: EventsViewModel.kt */
public final class EventsViewModel$rsvpEvent$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ EventsViewModel d;
    public final /* synthetic */ EventInClub q;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ Map<String, Object> y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventsViewModel$rsvpEvent$1(EventsViewModel eventsViewModel, EventInClub eventInClub, boolean z, Map<String, ? extends Object> map, m0.l.c<? super EventsViewModel$rsvpEvent$1> cVar) {
        super(1, cVar);
        this.d = eventsViewModel;
        this.q = eventInClub;
        this.x = z;
        this.y = map;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new EventsViewModel$rsvpEvent$1(this.d, this.q, this.x, this.y, cVar);
    }

    public Object invoke(Object obj) {
        return new EventsViewModel$rsvpEvent$1(this.d, this.q, this.x, this.y, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            Map<String, Object> map = this.y;
            this.c = 1;
            obj = this.d.o.f(this.q.Y1, !this.x, map, this);
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
