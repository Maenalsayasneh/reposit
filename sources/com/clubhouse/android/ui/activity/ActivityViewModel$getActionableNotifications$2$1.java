package com.clubhouse.android.ui.activity;

import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import h0.u.w;
import i0.b.b.b;
import i0.e.b.g3.j.d0;
import i0.j.f.p.h;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;
import n0.a.g2.d;

@c(c = "com.clubhouse.android.ui.activity.ActivityViewModel$getActionableNotifications$2$1", f = "ActivityViewModel.kt", l = {98}, m = "invokeSuspend")
/* compiled from: ActivityViewModel.kt */
public final class ActivityViewModel$getActionableNotifications$2$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ b<d<List<ActionableNotification>>> d;
    public final /* synthetic */ ActivityViewModel q;

    @c(c = "com.clubhouse.android.ui.activity.ActivityViewModel$getActionableNotifications$2$1$1", f = "ActivityViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.activity.ActivityViewModel$getActionableNotifications$2$1$1  reason: invalid class name */
    /* compiled from: ActivityViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<List<? extends ActionableNotification>, m0.l.c<? super i>, Object> {
        public /* synthetic */ Object c;

        public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(activityViewModel, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            AnonymousClass1 r02 = new AnonymousClass1(activityViewModel, (m0.l.c) obj2);
            r02.c = (List) obj;
            i iVar = i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            final List list = (List) this.c;
            ActivityViewModel activityViewModel = activityViewModel;
            AnonymousClass1 r1 = new l<d0, d0>() {
                public Object invoke(Object obj) {
                    d0 d0Var = (d0) obj;
                    m0.n.b.i.e(d0Var, "$this$setState");
                    return d0.copy$default(d0Var, (w) null, list, (List) null, 5, (Object) null);
                }
            };
            int i = ActivityViewModel.m;
            activityViewModel.m(r1);
            return i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityViewModel$getActionableNotifications$2$1(b<? extends d<? extends List<ActionableNotification>>> bVar, ActivityViewModel activityViewModel, m0.l.c<? super ActivityViewModel$getActionableNotifications$2$1> cVar) {
        super(2, cVar);
        this.d = bVar;
        this.q = activityViewModel;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new ActivityViewModel$getActionableNotifications$2$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new ActivityViewModel$getActionableNotifications$2$1(this.d, this.q, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            final ActivityViewModel activityViewModel = this.q;
            AnonymousClass1 r1 = new AnonymousClass1((m0.l.c<? super AnonymousClass1>) null);
            this.c = 1;
            if (a.E0((d) ((i0.b.b.f0) this.d).b, r1, this) == coroutineSingletons) {
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
