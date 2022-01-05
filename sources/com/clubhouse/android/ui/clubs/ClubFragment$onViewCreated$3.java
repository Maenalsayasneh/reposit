package com.clubhouse.android.ui.clubs;

import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.b.e;
import i0.e.b.a3.f.j;
import i0.e.b.g3.l.d1;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.clubs.ClubFragment$onViewCreated$3", f = "ClubFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ClubFragment.kt */
public final class ClubFragment$onViewCreated$3 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ ClubFragment d;

    /* compiled from: kotlin-style lambda group */
    public static final class a extends Lambda implements l<j, i> {
        public final /* synthetic */ int c;
        public final /* synthetic */ Object d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i, Object obj) {
            super(1);
            this.c = i;
            this.d = obj;
        }

        public final Object invoke(Object obj) {
            int i = this.c;
            if (i == 0) {
                j jVar = (j) obj;
                m0.n.b.i.e(jVar, "$this$showBanner");
                jVar.e(((e) ((b) this.d)).a);
                return i.a;
            } else if (i == 1) {
                j jVar2 = (j) obj;
                m0.n.b.i.e(jVar2, "$this$showBanner");
                jVar2.e(((ClubFragment) this.d).getResources().getString(R.string.club_deleted));
                return i.a;
            } else {
                throw null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubFragment$onViewCreated$3(ClubFragment clubFragment, m0.l.c<? super ClubFragment$onViewCreated$3> cVar) {
        super(2, cVar);
        this.d = clubFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ClubFragment$onViewCreated$3 clubFragment$onViewCreated$3 = new ClubFragment$onViewCreated$3(this.d, cVar);
        clubFragment$onViewCreated$3.c = obj;
        return clubFragment$onViewCreated$3;
    }

    public Object invoke(Object obj, Object obj2) {
        ClubFragment$onViewCreated$3 clubFragment$onViewCreated$3 = new ClubFragment$onViewCreated$3(this.d, (m0.l.c) obj2);
        clubFragment$onViewCreated$3.c = (b) obj;
        i iVar = i.a;
        clubFragment$onViewCreated$3.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof e) {
            v.c2(this.d, new a(0, bVar));
        } else if (bVar instanceof d) {
            final ClubFragment clubFragment = this.d;
            v.f2(clubFragment, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                    String str = ((d) bVar).a;
                    if (str == null) {
                        str = clubFragment.getString(R.string.common_error_try_again);
                        m0.n.b.i.d(str, "getString(R.string.common_error_try_again)");
                    }
                    jVar.c.b.setText(str);
                    return i.a;
                }
            });
        } else if (bVar instanceof d1) {
            ClubFragment clubFragment2 = this.d;
            v.c2(clubFragment2, new a(1, clubFragment2));
            v.c1(this.d);
        }
        return i.a;
    }
}
