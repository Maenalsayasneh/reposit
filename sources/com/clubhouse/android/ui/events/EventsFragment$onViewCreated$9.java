package com.clubhouse.android.ui.events;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.clubhouse.android.shared.preferences.Key;
import com.clubhouse.app.R;
import h0.b.a.d;
import h0.b0.v;
import i0.e.b.f3.k.b;
import i0.e.b.g3.m.f.d;
import i0.e.b.g3.o.a;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.events.EventsFragment$onViewCreated$9", f = "EventsFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: EventsFragment.kt */
public final class EventsFragment$onViewCreated$9 extends SuspendLambda implements p<d, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ EventsFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventsFragment$onViewCreated$9(EventsFragment eventsFragment, m0.l.c<? super EventsFragment$onViewCreated$9> cVar) {
        super(2, cVar);
        this.d = eventsFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        EventsFragment$onViewCreated$9 eventsFragment$onViewCreated$9 = new EventsFragment$onViewCreated$9(this.d, cVar);
        eventsFragment$onViewCreated$9.c = obj;
        return eventsFragment$onViewCreated$9;
    }

    public Object invoke(Object obj, Object obj2) {
        EventsFragment$onViewCreated$9 eventsFragment$onViewCreated$9 = new EventsFragment$onViewCreated$9(this.d, (m0.l.c) obj2);
        eventsFragment$onViewCreated$9.c = (d) obj;
        i iVar = i.a;
        eventsFragment$onViewCreated$9.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        d dVar = (d) this.c;
        EventsFragment eventsFragment = this.d;
        k<Object>[] kVarArr = EventsFragment.Z1;
        TextView textView = eventsFragment.N0().c;
        m0.n.b.i.d(textView, "binding.emptyView");
        i0.e.b.d3.k.L(textView, Boolean.valueOf(dVar instanceof d.a));
        this.d.N0().e.setRefreshing(dVar instanceof d.C0203d);
        if (dVar instanceof d.b) {
            EventsFragment eventsFragment2 = this.d;
            Throwable th = ((d.b) dVar).a;
            Objects.requireNonNull(eventsFragment2);
            v.c2(eventsFragment2, new EventsFragment$showError$1(th, eventsFragment2));
        } else if (dVar instanceof d.c) {
            b O0 = this.d.O0();
            Key key = Key.KEY_SHOW_MEET_THE_NEW_BELL;
            if (!O0.a(key, false)) {
                EventsFragment eventsFragment3 = this.d;
                View inflate = eventsFragment3.getLayoutInflater().inflate(R.layout.meet_the_new_bell, (ViewGroup) null);
                d.a aVar = new d.a(eventsFragment3.requireContext(), 2132017388);
                aVar.f(inflate);
                h0.b.a.d a = aVar.a();
                m0.n.b.i.d(a, "Builder(requireContext(), R.style.Clubhouse_AlertDialog_Rounded).apply {\n            setView(alertView)\n        }.create()");
                inflate.setOnClickListener(new a(a));
                a.show();
                this.d.O0().g(key, true);
            }
        }
        return i.a;
    }
}
