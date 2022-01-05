package com.clubhouse.android.ui.events;

import android.widget.TextView;
import i0.e.b.a3.b.b;
import i0.e.b.g3.o.r0;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.events.EventsFragment$onViewCreated$1", f = "EventsFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: EventsFragment.kt */
public final class EventsFragment$onViewCreated$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ EventsFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventsFragment$onViewCreated$1(EventsFragment eventsFragment, m0.l.c<? super EventsFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = eventsFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        EventsFragment$onViewCreated$1 eventsFragment$onViewCreated$1 = new EventsFragment$onViewCreated$1(this.d, cVar);
        eventsFragment$onViewCreated$1.c = obj;
        return eventsFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        EventsFragment$onViewCreated$1 eventsFragment$onViewCreated$1 = new EventsFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        eventsFragment$onViewCreated$1.c = (b) obj;
        i iVar = i.a;
        eventsFragment$onViewCreated$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        if (((b) this.c) instanceof r0) {
            EventsFragment eventsFragment = this.d;
            k<Object>[] kVarArr = EventsFragment.Z1;
            TextView textView = eventsFragment.N0().c;
            m0.n.b.i.d(textView, "binding.emptyView");
            i0.e.b.d3.k.p(textView);
            this.d.d2.requestForcedModelBuild();
        }
        return i.a;
    }
}
