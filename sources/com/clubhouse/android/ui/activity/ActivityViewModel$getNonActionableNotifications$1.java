package com.clubhouse.android.ui.activity;

import androidx.paging.PageFetcher;
import androidx.paging.Pager$flow$1;
import androidx.paging.Pager$flow$2;
import com.clubhouse.android.data.repos.ActivityRepo;
import com.clubhouse.android.data.repos.ActivityRepo$getNotifications$1;
import g0.a.b.b.a;
import h0.u.e0;
import h0.u.v;
import h0.u.w;
import i0.e.b.g3.j.d0;
import i0.j.f.p.h;
import java.util.List;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import n0.a.f0;
import n0.a.g2.d;

@c(c = "com.clubhouse.android.ui.activity.ActivityViewModel$getNonActionableNotifications$1", f = "ActivityViewModel.kt", l = {135}, m = "invokeSuspend")
/* compiled from: ActivityViewModel.kt */
public final class ActivityViewModel$getNonActionableNotifications$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ ActivityViewModel d;

    @c(c = "com.clubhouse.android.ui.activity.ActivityViewModel$getNonActionableNotifications$1$1", f = "ActivityViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.activity.ActivityViewModel$getNonActionableNotifications$1$1  reason: invalid class name */
    /* compiled from: ActivityViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<w<i0.e.b.b3.b.e.i>, m0.l.c<? super i>, Object> {
        public /* synthetic */ Object c;

        public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(activityViewModel, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            AnonymousClass1 r02 = new AnonymousClass1(activityViewModel, (m0.l.c) obj2);
            r02.c = (w) obj;
            i iVar = i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            final w wVar = (w) this.c;
            ActivityViewModel activityViewModel = activityViewModel;
            AnonymousClass1 r1 = new l<d0, d0>() {
                public Object invoke(Object obj) {
                    d0 d0Var = (d0) obj;
                    m0.n.b.i.e(d0Var, "$this$setState");
                    return d0.copy$default(d0Var, wVar, (List) null, (List) null, 6, (Object) null);
                }
            };
            int i = ActivityViewModel.m;
            activityViewModel.m(r1);
            return i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityViewModel$getNonActionableNotifications$1(ActivityViewModel activityViewModel, m0.l.c<? super ActivityViewModel$getNonActionableNotifications$1> cVar) {
        super(2, cVar);
        this.d = activityViewModel;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new ActivityViewModel$getNonActionableNotifications$1(this.d, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new ActivityViewModel$getNonActionableNotifications$1(this.d, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        l lVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ActivityRepo activityRepo = this.d.n;
            Objects.requireNonNull(activityRepo);
            v vVar = new v(20, 5, false, 20, 0, 0, 52);
            ActivityRepo$getNotifications$1 activityRepo$getNotifications$1 = new ActivityRepo$getNotifications$1(activityRepo);
            m0.n.b.i.e(vVar, "config");
            m0.n.b.i.e(activityRepo$getNotifications$1, "pagingSourceFactory");
            m0.n.b.i.e(vVar, "config");
            m0.n.b.i.e(activityRepo$getNotifications$1, "pagingSourceFactory");
            if (activityRepo$getNotifications$1 instanceof e0) {
                lVar = new Pager$flow$1(activityRepo$getNotifications$1);
            } else {
                lVar = new Pager$flow$2(activityRepo$getNotifications$1, (m0.l.c) null);
            }
            d<w<w<Value>>> h = a.h(new PageFetcher(lVar, (Object) null, vVar).c, this.d.c);
            final ActivityViewModel activityViewModel = this.d;
            AnonymousClass1 r1 = new AnonymousClass1((m0.l.c<? super AnonymousClass1>) null);
            this.c = 1;
            if (m0.r.t.a.r.m.a1.a.E0(h, r1, this) == coroutineSingletons) {
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
