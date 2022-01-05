package com.clubhouse.android.data.repos;

import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.EventRepo", f = "EventRepo.kt", l = {155}, m = "rsvpToEvent")
/* compiled from: EventRepo.kt */
public final class EventRepo$rsvpToEvent$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ EventRepo q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventRepo$rsvpToEvent$1(EventRepo eventRepo, m0.l.c<? super EventRepo$rsvpToEvent$1> cVar) {
        super(cVar);
        this.q = eventRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.f(0, false, (Map<String, ? extends Object>) null, this);
    }
}
