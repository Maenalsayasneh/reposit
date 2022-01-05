package com.clubhouse.android.shared.review;

import android.app.Activity;
import com.clubhouse.android.shared.Flag;
import i0.e.a.a;
import i0.e.b.f3.h;
import i0.e.b.f3.k.b;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.l.c;
import m0.n.b.i;
import n0.a.f0;

/* compiled from: ReviewCoordinator.kt */
public final class ReviewCoordinator {
    public final Activity a;
    public final b b;
    public final f0 c;
    public final a d;
    public final i0.h.a.d.a.h.a e;

    public ReviewCoordinator(Activity activity, b bVar, i0.e.b.f3.i.a aVar, f0 f0Var, a aVar2) {
        i.e(activity, "activity");
        i.e(bVar, "userSharedPreferences");
        i.e(aVar, "userComponentHandler");
        i.e(f0Var, "coroutineScope");
        i.e(aVar2, "analytics");
        this.a = activity;
        this.b = bVar;
        this.c = f0Var;
        this.d = aVar2;
        i0.h.a.d.a.h.a w = i0.h.a.b.c.m.b.w(activity);
        i.d(w, "create(activity)");
        this.e = w;
        i0.e.b.h3.a.b bVar2 = aVar.d;
        if (bVar2 != null) {
            m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(((h) i0.j.f.p.h.L0(bVar2, h.class)).e().b(Flag.DisableInAppReview), new ReviewCoordinator$1$1(this, (c<? super ReviewCoordinator$1$1>) null)), f0Var);
        }
    }
}
