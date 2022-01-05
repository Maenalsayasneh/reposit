package com.clubhouse.android.ui.clubs.nominations;

import com.clubhouse.core.ui.R;
import h0.b.a.d;
import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.f.j;
import i0.e.b.g3.l.a3.r;
import i0.e.b.g3.l.a3.s;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.clubs.nominations.ClubNominationsFragment$onViewCreated$4", f = "ClubNominationsFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ClubNominationsFragment.kt */
public final class ClubNominationsFragment$onViewCreated$4 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ ClubNominationsFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubNominationsFragment$onViewCreated$4(ClubNominationsFragment clubNominationsFragment, m0.l.c<? super ClubNominationsFragment$onViewCreated$4> cVar) {
        super(2, cVar);
        this.d = clubNominationsFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ClubNominationsFragment$onViewCreated$4 clubNominationsFragment$onViewCreated$4 = new ClubNominationsFragment$onViewCreated$4(this.d, cVar);
        clubNominationsFragment$onViewCreated$4.c = obj;
        return clubNominationsFragment$onViewCreated$4;
    }

    public Object invoke(Object obj, Object obj2) {
        ClubNominationsFragment$onViewCreated$4 clubNominationsFragment$onViewCreated$4 = new ClubNominationsFragment$onViewCreated$4(this.d, (m0.l.c) obj2);
        clubNominationsFragment$onViewCreated$4.c = (b) obj;
        i iVar = i.a;
        clubNominationsFragment$onViewCreated$4.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof d) {
            v.f2(this.d, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                    jVar.e(((d) bVar).a);
                    return i.a;
                }
            });
        } else if (bVar instanceof r) {
            v.c1(this.d);
        } else if (bVar instanceof s) {
            ClubNominationsFragment clubNominationsFragment = this.d;
            k<Object>[] kVarArr = ClubNominationsFragment.Z1;
            Objects.requireNonNull(clubNominationsFragment);
            ClubNominationsFragment$showOpenMembershipPrompt$1 clubNominationsFragment$showOpenMembershipPrompt$1 = new ClubNominationsFragment$showOpenMembershipPrompt$1(clubNominationsFragment);
            m0.n.b.i.e(clubNominationsFragment, "<this>");
            m0.n.b.i.e(clubNominationsFragment$showOpenMembershipPrompt$1, "f");
            d.a aVar = new d.a(clubNominationsFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
            clubNominationsFragment$showOpenMembershipPrompt$1.invoke(aVar);
            aVar.g();
        }
        return i.a;
    }
}
