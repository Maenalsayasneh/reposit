package com.clubhouse.android.shared.review;

import com.clubhouse.android.shared.preferences.Key;
import com.google.android.play.core.review.ReviewInfo;
import i0.e.b.f3.k.b;
import i0.e.b.f3.l.a;
import i0.j.f.p.h;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.shared.review.ReviewCoordinator$1$1", f = "ReviewCoordinator.kt", l = {}, m = "invokeSuspend")
/* compiled from: ReviewCoordinator.kt */
public final class ReviewCoordinator$1$1 extends SuspendLambda implements p<Boolean, m0.l.c<? super i>, Object> {
    public /* synthetic */ boolean c;
    public final /* synthetic */ ReviewCoordinator d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReviewCoordinator$1$1(ReviewCoordinator reviewCoordinator, m0.l.c<? super ReviewCoordinator$1$1> cVar) {
        super(2, cVar);
        this.d = reviewCoordinator;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ReviewCoordinator$1$1 reviewCoordinator$1$1 = new ReviewCoordinator$1$1(this.d, cVar);
        reviewCoordinator$1$1.c = ((Boolean) obj).booleanValue();
        return reviewCoordinator$1$1;
    }

    public Object invoke(Object obj, Object obj2) {
        Boolean valueOf = Boolean.valueOf(((Boolean) obj).booleanValue());
        ReviewCoordinator$1$1 reviewCoordinator$1$1 = new ReviewCoordinator$1$1(this.d, (m0.l.c) obj2);
        reviewCoordinator$1$1.c = valueOf.booleanValue();
        i iVar = i.a;
        reviewCoordinator$1$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        if (!this.c) {
            ReviewCoordinator reviewCoordinator = this.d;
            b bVar = reviewCoordinator.b;
            Objects.requireNonNull(bVar);
            if (!bVar.a(Key.HAVE_PROMPTED_FOR_REVIEW, false)) {
                b bVar2 = reviewCoordinator.b;
                Objects.requireNonNull(bVar2);
                if (bVar2.b(Key.TOTAL_CONNECTED_MILLIS, 0) > TimeUnit.MINUTES.toMillis(15)) {
                    i0.h.a.d.a.j.p<ReviewInfo> b = reviewCoordinator.e.b();
                    m0.n.b.i.d(b, "manager.requestReviewFlow()");
                    b.b(new a(reviewCoordinator));
                }
            }
        }
        return i.a;
    }
}
