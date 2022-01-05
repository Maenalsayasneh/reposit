package com.clubhouse.android.ui.events;

import com.clubhouse.android.data.models.local.EventInClub;
import i0.e.b.g3.o.l0;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;
import n0.a.g2.q;

@c(c = "com.clubhouse.android.ui.events.HalfEventViewModel$subscribeToRsvpStatusForEvent$1", f = "HalfEventViewModel.kt", l = {136}, m = "invokeSuspend")
/* compiled from: HalfEventViewModel.kt */
public final class HalfEventViewModel$subscribeToRsvpStatusForEvent$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ HalfEventViewModel d;

    @c(c = "com.clubhouse.android.ui.events.HalfEventViewModel$subscribeToRsvpStatusForEvent$1$1", f = "HalfEventViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.events.HalfEventViewModel$subscribeToRsvpStatusForEvent$1$1  reason: invalid class name */
    /* compiled from: HalfEventViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<Map<Integer, ? extends Boolean>, m0.l.c<? super i>, Object> {
        public /* synthetic */ Object c;

        public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(halfEventViewModel, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            AnonymousClass1 r02 = new AnonymousClass1(halfEventViewModel, (m0.l.c) obj2);
            r02.c = (Map) obj;
            i iVar = i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            final Map map = (Map) this.c;
            final HalfEventViewModel halfEventViewModel = halfEventViewModel;
            AnonymousClass1 r1 = new l<l0, i>() {
                public Object invoke(Object obj) {
                    Integer num;
                    l0 l0Var = (l0) obj;
                    m0.n.b.i.e(l0Var, "state");
                    Map<Integer, Boolean> map = map;
                    EventInClub eventInClub = l0Var.c;
                    if (eventInClub == null) {
                        num = null;
                    } else {
                        num = Integer.valueOf(eventInClub.Y1);
                    }
                    Boolean bool = map.get(num);
                    if (bool != null) {
                        HalfEventViewModel halfEventViewModel = halfEventViewModel;
                        HalfEventViewModel$subscribeToRsvpStatusForEvent$1$1$1$1$1 halfEventViewModel$subscribeToRsvpStatusForEvent$1$1$1$1$1 = new HalfEventViewModel$subscribeToRsvpStatusForEvent$1$1$1$1$1(bool.booleanValue());
                        int i = HalfEventViewModel.m;
                        halfEventViewModel.m(halfEventViewModel$subscribeToRsvpStatusForEvent$1$1$1$1$1);
                    }
                    return i.a;
                }
            };
            int i = HalfEventViewModel.m;
            halfEventViewModel.n(r1);
            return i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfEventViewModel$subscribeToRsvpStatusForEvent$1(HalfEventViewModel halfEventViewModel, m0.l.c<? super HalfEventViewModel$subscribeToRsvpStatusForEvent$1> cVar) {
        super(2, cVar);
        this.d = halfEventViewModel;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new HalfEventViewModel$subscribeToRsvpStatusForEvent$1(this.d, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new HalfEventViewModel$subscribeToRsvpStatusForEvent$1(this.d, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            final HalfEventViewModel halfEventViewModel = this.d;
            q<Map<Integer, Boolean>> qVar = halfEventViewModel.p.c.a;
            AnonymousClass1 r3 = new AnonymousClass1((m0.l.c<? super AnonymousClass1>) null);
            this.c = 1;
            if (a.E0(qVar, r3, this) == coroutineSingletons) {
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
