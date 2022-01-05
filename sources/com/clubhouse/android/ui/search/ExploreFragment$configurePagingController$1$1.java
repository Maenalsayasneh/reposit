package com.clubhouse.android.ui.search;

import android.widget.ProgressBar;
import android.widget.TextView;
import h0.b0.v;
import i0.e.b.g3.m.f.d;
import i0.e.b.g3.w.z;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.StringsKt__IndentKt;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.search.ExploreFragment$configurePagingController$1$1", f = "ExploreFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ExploreFragment.kt */
public final class ExploreFragment$configurePagingController$1$1 extends SuspendLambda implements p<d, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ ExploreFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExploreFragment$configurePagingController$1$1(ExploreFragment exploreFragment, m0.l.c<? super ExploreFragment$configurePagingController$1$1> cVar) {
        super(2, cVar);
        this.d = exploreFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ExploreFragment$configurePagingController$1$1 exploreFragment$configurePagingController$1$1 = new ExploreFragment$configurePagingController$1$1(this.d, cVar);
        exploreFragment$configurePagingController$1$1.c = obj;
        return exploreFragment$configurePagingController$1$1;
    }

    public Object invoke(Object obj, Object obj2) {
        ExploreFragment$configurePagingController$1$1 exploreFragment$configurePagingController$1$1 = new ExploreFragment$configurePagingController$1$1(this.d, (m0.l.c) obj2);
        exploreFragment$configurePagingController$1$1.c = (d) obj;
        i iVar = i.a;
        exploreFragment$configurePagingController$1$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final d dVar = (d) this.c;
        ExploreFragment exploreFragment = this.d;
        k<Object>[] kVarArr = ExploreFragment.Z1;
        ExploreViewModel O0 = exploreFragment.O0();
        final ExploreFragment exploreFragment2 = this.d;
        v.v2(O0, new l<z, i>() {
            public Object invoke(Object obj) {
                z zVar = (z) obj;
                m0.n.b.i.e(zVar, "it");
                ExploreFragment exploreFragment = exploreFragment2;
                k<Object>[] kVarArr = ExploreFragment.Z1;
                TextView textView = exploreFragment.N0().d;
                m0.n.b.i.d(textView, "binding.empty");
                boolean z = false;
                if (dVar instanceof d.a) {
                    String str = zVar.c;
                    if (str != null && (StringsKt__IndentKt.o(str) ^ true)) {
                        z = true;
                    }
                }
                i0.e.b.d3.k.L(textView, Boolean.valueOf(z));
                ProgressBar progressBar = exploreFragment2.N0().e;
                m0.n.b.i.d(progressBar, "binding.loading");
                i0.e.b.d3.k.L(progressBar, Boolean.valueOf(dVar instanceof d.C0203d));
                return i.a;
            }
        });
        return i.a;
    }
}
