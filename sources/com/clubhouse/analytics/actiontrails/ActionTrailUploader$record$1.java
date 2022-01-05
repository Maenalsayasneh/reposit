package com.clubhouse.analytics.actiontrails;

import androidx.recyclerview.widget.RecyclerView;
import androidx.work.ExistingWorkPolicy;
import com.clubhouse.analytics.util.CacheUtil$putString$2;
import com.clubhouse.android.data.models.local.ActionTrail;
import h0.g0.b;
import h0.g0.j;
import h0.g0.n;
import h0.g0.o;
import i0.j.f.p.h;
import i0.k.a.a;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.random.Random;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.n.b.m;
import n0.a.f0;
import n0.a.m0;

@c(c = "com.clubhouse.analytics.actiontrails.ActionTrailUploader$record$1", f = "ActionTrailUploader.kt", l = {54}, m = "invokeSuspend")
/* compiled from: ActionTrailUploader.kt */
public final class ActionTrailUploader$record$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ ActionTrailUploader d;
    public final /* synthetic */ String q;
    public final /* synthetic */ ActionTrail x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActionTrailUploader$record$1(ActionTrailUploader actionTrailUploader, String str, ActionTrail actionTrail, m0.l.c<? super ActionTrailUploader$record$1> cVar) {
        super(2, cVar);
        this.d = actionTrailUploader;
        this.q = str;
        this.x = actionTrail;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new ActionTrailUploader$record$1(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new ActionTrailUploader$record$1(this.d, this.q, this.x, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ActionTrailUploader actionTrailUploader = this.d;
            a aVar = actionTrailUploader.d;
            String str = this.q;
            n0.c.l.a aVar2 = actionTrailUploader.c;
            String c2 = aVar2.c(m0.r.t.a.r.m.a1.a.u3(aVar2.a(), m.e(ActionTrail.class)), this.x);
            this.c = 1;
            Object k4 = m0.r.t.a.r.m.a1.a.k4(m0.c, new CacheUtil$putString$2(aVar, str, c2, (m0.l.c<? super CacheUtil$putString$2>) null), this);
            if (k4 != coroutineSingletons) {
                k4 = i.a;
            }
            if (k4 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ActionTrailUploader actionTrailUploader2 = this.d;
        b bVar = ActionTrailUploader.a;
        Objects.requireNonNull(actionTrailUploader2);
        j.a aVar3 = new j.a(ActionTrailWorker.class);
        aVar3.b.j = ActionTrailUploader.a;
        m0.q.h hVar = new m0.q.h(20, 300);
        Random.Default defaultR = Random.d;
        m0.n.b.i.e(hVar, "$this$random");
        m0.n.b.i.e(defaultR, "random");
        try {
            long X2 = h.X2(defaultR, hVar);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            aVar3.b.g = timeUnit.toMillis(X2);
            if (RecyclerView.FOREVER_NS - System.currentTimeMillis() > aVar3.b.g) {
                o a = aVar3.a();
                m0.n.b.i.d(a, "OneTimeWorkRequestBuilder<ActionTrailWorker>()\n            .setConstraints(constraints)\n            .setInitialDelay((20L..300L).random(), TimeUnit.SECONDS)\n            .build()");
                n nVar = actionTrailUploader2.b;
                ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.REPLACE;
                Objects.requireNonNull(nVar);
                nVar.a("action_trail_work", existingWorkPolicy, Collections.singletonList((j) a));
                return i.a;
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
