package com.clubhouse.android.data.repos;

import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.EventRepo", f = "EventRepo.kt", l = {45}, m = "getEvent")
/* compiled from: EventRepo.kt */
public final class EventRepo$getEvent$1 extends ContinuationImpl {
    public Object c;
    public Object d;
    public /* synthetic */ Object q;
    public final /* synthetic */ EventRepo x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventRepo$getEvent$1(EventRepo eventRepo, m0.l.c<? super EventRepo$getEvent$1> cVar) {
        super(cVar);
        this.x = eventRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.d((Integer) null, (String) null, (String) null, (Map<String, ? extends Object>) null, this);
    }
}
