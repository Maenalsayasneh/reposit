package com.clubhouse.android.ui.clubs;

import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.b.e;
import i0.e.b.a3.f.j;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.clubs.ClubMemberSearchFragment$onViewCreated$1", f = "ClubMemberSearchFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ClubMemberSearchFragment.kt */
public final class ClubMemberSearchFragment$onViewCreated$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ ClubMemberSearchFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubMemberSearchFragment$onViewCreated$1(ClubMemberSearchFragment clubMemberSearchFragment, m0.l.c<? super ClubMemberSearchFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = clubMemberSearchFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ClubMemberSearchFragment$onViewCreated$1 clubMemberSearchFragment$onViewCreated$1 = new ClubMemberSearchFragment$onViewCreated$1(this.d, cVar);
        clubMemberSearchFragment$onViewCreated$1.c = obj;
        return clubMemberSearchFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        ClubMemberSearchFragment$onViewCreated$1 clubMemberSearchFragment$onViewCreated$1 = new ClubMemberSearchFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        clubMemberSearchFragment$onViewCreated$1.c = (b) obj;
        i iVar = i.a;
        clubMemberSearchFragment$onViewCreated$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof e) {
            v.c2(this.d, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showBanner");
                    jVar.e(((e) bVar).a);
                    return i.a;
                }
            });
        } else if (bVar instanceof d) {
            final ClubMemberSearchFragment clubMemberSearchFragment = this.d;
            v.f2(clubMemberSearchFragment, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                    String str = ((d) bVar).a;
                    if (str == null) {
                        str = clubMemberSearchFragment.getString(R.string.common_error_try_again);
                        m0.n.b.i.d(str, "getString(R.string.common_error_try_again)");
                    }
                    jVar.c.b.setText(str);
                    return i.a;
                }
            });
        }
        return i.a;
    }
}
