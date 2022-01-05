package com.clubhouse.android.ui.clubs;

import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.f.j;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.clubs.ClubFragment$onViewCreated$2", f = "ClubFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ClubFragment.kt */
public final class ClubFragment$onViewCreated$2 extends SuspendLambda implements p<Throwable, m0.l.c<? super i>, Object> {
    public final /* synthetic */ ClubFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubFragment$onViewCreated$2(ClubFragment clubFragment, m0.l.c<? super ClubFragment$onViewCreated$2> cVar) {
        super(2, cVar);
        this.c = clubFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new ClubFragment$onViewCreated$2(this.c, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        Throwable th = (Throwable) obj;
        final ClubFragment clubFragment = this.c;
        new ClubFragment$onViewCreated$2(clubFragment, (m0.l.c) obj2);
        i iVar = i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        v.f2(clubFragment, new l<j, i>() {
            public Object invoke(Object obj) {
                j jVar = (j) obj;
                m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                jVar.e(r2.getString(R.string.common_error_try_again));
                return i.a;
            }
        });
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final ClubFragment clubFragment = this.c;
        v.f2(clubFragment, new l<j, i>() {
            public Object invoke(Object obj) {
                j jVar = (j) obj;
                m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                jVar.e(clubFragment.getString(R.string.common_error_try_again));
                return i.a;
            }
        });
        return i.a;
    }
}
