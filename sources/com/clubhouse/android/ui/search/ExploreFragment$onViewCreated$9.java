package com.clubhouse.android.ui.search;

import android.os.Bundle;
import android.view.View;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.t.q;
import h0.t.u.a;
import i0.e.b.a3.b.b;
import i0.e.b.g3.w.a0;
import i0.e.b.g3.w.c0;
import i0.j.f.p.h;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.search.ExploreFragment$onViewCreated$9", f = "ExploreFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ExploreFragment.kt */
public final class ExploreFragment$onViewCreated$9 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ ExploreFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExploreFragment$onViewCreated$9(ExploreFragment exploreFragment, m0.l.c<? super ExploreFragment$onViewCreated$9> cVar) {
        super(2, cVar);
        this.d = exploreFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ExploreFragment$onViewCreated$9 exploreFragment$onViewCreated$9 = new ExploreFragment$onViewCreated$9(this.d, cVar);
        exploreFragment$onViewCreated$9.c = obj;
        return exploreFragment$onViewCreated$9;
    }

    public Object invoke(Object obj, Object obj2) {
        ExploreFragment$onViewCreated$9 exploreFragment$onViewCreated$9 = new ExploreFragment$onViewCreated$9(this.d, (m0.l.c) obj2);
        exploreFragment$onViewCreated$9.c = (b) obj;
        i iVar = i.a;
        exploreFragment$onViewCreated$9.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        b bVar = (b) this.c;
        if (m0.n.b.i.a(bVar, a0.a)) {
            this.d.d2.requestForcedModelBuild();
        } else if (m0.n.b.i.a(bVar, c0.a)) {
            ExploreFragment exploreFragment = this.d;
            k<Object>[] kVarArr = ExploreFragment.Z1;
            Pair[] pairArr = {new Pair(exploreFragment.N0().i, "search")};
            m0.n.b.i.f(pairArr, "sharedElements");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int i = 0; i < 1; i++) {
                Pair pair = pairArr[i];
                linkedHashMap.put((View) pair.c, (String) pair.d);
            }
            a.b bVar2 = new a.b(linkedHashMap);
            m0.n.b.i.b(bVar2, "FragmentNavigator.Extras…      }\n        }.build()");
            m0.n.b.i.e(exploreFragment, "<this>");
            m0.n.b.i.e(bVar2, "navigatorExtras");
            m0.n.b.i.f(exploreFragment, "$this$findNavController");
            NavController I0 = NavHostFragment.I0(exploreFragment);
            m0.n.b.i.b(I0, "NavHostFragment.findNavController(this)");
            if (v.U0(exploreFragment, I0)) {
                try {
                    I0.h(R.id.action_exploreFragment_to_exploreV2Fragment, new Bundle(), (q) null, bVar2);
                } catch (Throwable th) {
                    h.l0(th);
                }
            }
        }
        return i.a;
    }
}
