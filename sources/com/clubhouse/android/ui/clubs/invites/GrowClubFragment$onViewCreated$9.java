package com.clubhouse.android.ui.clubs.invites;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.clubs.invites.GrowClubFragment$onViewCreated$9", f = "GrowClubFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: GrowClubFragment.kt */
public final class GrowClubFragment$onViewCreated$9 extends SuspendLambda implements p<String, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ GrowClubFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GrowClubFragment$onViewCreated$9(GrowClubFragment growClubFragment, m0.l.c<? super GrowClubFragment$onViewCreated$9> cVar) {
        super(2, cVar);
        this.d = growClubFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        GrowClubFragment$onViewCreated$9 growClubFragment$onViewCreated$9 = new GrowClubFragment$onViewCreated$9(this.d, cVar);
        growClubFragment$onViewCreated$9.c = obj;
        return growClubFragment$onViewCreated$9;
    }

    public Object invoke(Object obj, Object obj2) {
        GrowClubFragment$onViewCreated$9 growClubFragment$onViewCreated$9 = new GrowClubFragment$onViewCreated$9(this.d, (m0.l.c) obj2);
        growClubFragment$onViewCreated$9.c = (String) obj;
        i iVar = i.a;
        growClubFragment$onViewCreated$9.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        if (((String) this.c).length() == 0) {
            GrowClubFragment growClubFragment = this.d;
            k<Object>[] kVarArr = GrowClubFragment.Z1;
            growClubFragment.P0().f.setController(this.d.d2);
            TextView textView = this.d.P0().c;
            m0.n.b.i.d(textView, "binding.empty");
            i0.e.b.d3.k.p(textView);
        } else {
            GrowClubFragment growClubFragment2 = this.d;
            k<Object>[] kVarArr2 = GrowClubFragment.Z1;
            growClubFragment2.P0().f.setController(this.d.e2);
            this.d.P0().f.setItemAnimator((RecyclerView.k) null);
        }
        return i.a;
    }
}
