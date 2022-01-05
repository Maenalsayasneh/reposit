package com.clubhouse.android.ui.search;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.clubs.HalfClubRulesArgs;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.t.q;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.f.j;
import i0.e.b.b3.b.e.e;
import i0.e.b.g3.w.g0;
import i0.e.b.g3.w.u;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.search.ExploreV2Fragment$onViewCreated$15", f = "ExploreV2Fragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ExploreV2Fragment.kt */
public final class ExploreV2Fragment$onViewCreated$15 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ ExploreV2Fragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExploreV2Fragment$onViewCreated$15(ExploreV2Fragment exploreV2Fragment, m0.l.c<? super ExploreV2Fragment$onViewCreated$15> cVar) {
        super(2, cVar);
        this.d = exploreV2Fragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ExploreV2Fragment$onViewCreated$15 exploreV2Fragment$onViewCreated$15 = new ExploreV2Fragment$onViewCreated$15(this.d, cVar);
        exploreV2Fragment$onViewCreated$15.c = obj;
        return exploreV2Fragment$onViewCreated$15;
    }

    public Object invoke(Object obj, Object obj2) {
        ExploreV2Fragment$onViewCreated$15 exploreV2Fragment$onViewCreated$15 = new ExploreV2Fragment$onViewCreated$15(this.d, (m0.l.c) obj2);
        exploreV2Fragment$onViewCreated$15.c = (b) obj;
        i iVar = i.a;
        exploreV2Fragment$onViewCreated$15.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof g0) {
            ExploreV2Fragment exploreV2Fragment = this.d;
            e eVar = ((g0) bVar).a;
            k<Object>[] kVarArr = ExploreV2Fragment.Z1;
            Objects.requireNonNull(exploreV2Fragment);
            HalfClubRulesArgs halfClubRulesArgs = new HalfClubRulesArgs(eVar.b, Boolean.TRUE, (String) null, SourceLocation.SEARCH, eVar.d, 4);
            m0.n.b.i.e(halfClubRulesArgs, "mavericksArg");
            v.a1(exploreV2Fragment, new u(halfClubRulesArgs), (q) null, 2);
        } else if (bVar instanceof i0.e.b.a3.b.e) {
            v.c2(this.d, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showBanner");
                    jVar.e(((i0.e.b.a3.b.e) bVar).a);
                    return i.a;
                }
            });
        } else if (bVar instanceof d) {
            final ExploreV2Fragment exploreV2Fragment2 = this.d;
            v.f2(exploreV2Fragment2, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                    String str = ((d) bVar).a;
                    if (str == null) {
                        str = exploreV2Fragment2.getString(R.string.common_error_try_again);
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
