package com.clubhouse.android.ui.search;

import h0.b0.v;
import i0.e.b.g3.m.f.d;
import i0.e.b.g3.w.y;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.search.ExploreV2Fragment$configurePagingControllers$1", f = "ExploreV2Fragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ExploreV2Fragment.kt */
public final class ExploreV2Fragment$configurePagingControllers$1 extends SuspendLambda implements p<d, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ ExploreV2Fragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExploreV2Fragment$configurePagingControllers$1(ExploreV2Fragment exploreV2Fragment, m0.l.c<? super ExploreV2Fragment$configurePagingControllers$1> cVar) {
        super(2, cVar);
        this.d = exploreV2Fragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ExploreV2Fragment$configurePagingControllers$1 exploreV2Fragment$configurePagingControllers$1 = new ExploreV2Fragment$configurePagingControllers$1(this.d, cVar);
        exploreV2Fragment$configurePagingControllers$1.c = obj;
        return exploreV2Fragment$configurePagingControllers$1;
    }

    public Object invoke(Object obj, Object obj2) {
        ExploreV2Fragment$configurePagingControllers$1 exploreV2Fragment$configurePagingControllers$1 = new ExploreV2Fragment$configurePagingControllers$1(this.d, (m0.l.c) obj2);
        exploreV2Fragment$configurePagingControllers$1.c = (d) obj;
        i iVar = i.a;
        exploreV2Fragment$configurePagingControllers$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final d dVar = (d) this.c;
        ExploreV2Fragment exploreV2Fragment = this.d;
        k<Object>[] kVarArr = ExploreV2Fragment.Z1;
        ExploreV2ViewModel P0 = exploreV2Fragment.P0();
        final ExploreV2Fragment exploreV2Fragment2 = this.d;
        v.v2(P0, new l<y, i>() {
            /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
                if ((r5.d.length() == 0) != false) goto L_0x002d;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke(java.lang.Object r5) {
                /*
                    r4 = this;
                    i0.e.b.g3.w.y r5 = (i0.e.b.g3.w.y) r5
                    java.lang.String r0 = "it"
                    m0.n.b.i.e(r5, r0)
                    com.clubhouse.android.ui.search.ExploreV2Fragment r0 = r2
                    m0.r.k<java.lang.Object>[] r1 = com.clubhouse.android.ui.search.ExploreV2Fragment.Z1
                    com.clubhouse.android.databinding.FragmentExploreV2Binding r0 = r0.O0()
                    android.widget.ImageView r0 = r0.c
                    java.lang.String r1 = "binding.emptyIcon"
                    m0.n.b.i.d(r0, r1)
                    i0.e.b.g3.m.f.d r1 = r4
                    boolean r1 = r1 instanceof i0.e.b.g3.m.f.d.a
                    r2 = 1
                    r3 = 0
                    if (r1 == 0) goto L_0x002c
                    java.lang.String r5 = r5.d
                    int r5 = r5.length()
                    if (r5 != 0) goto L_0x0028
                    r5 = r2
                    goto L_0x0029
                L_0x0028:
                    r5 = r3
                L_0x0029:
                    if (r5 == 0) goto L_0x002c
                    goto L_0x002d
                L_0x002c:
                    r2 = r3
                L_0x002d:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
                    i0.e.b.d3.k.L(r0, r5)
                    com.clubhouse.android.ui.search.ExploreV2Fragment r5 = r2
                    com.clubhouse.android.databinding.FragmentExploreV2Binding r5 = r5.O0()
                    android.widget.TextView r5 = r5.b
                    java.lang.String r0 = "binding.empty"
                    m0.n.b.i.d(r5, r0)
                    i0.e.b.g3.m.f.d r0 = r4
                    boolean r0 = r0 instanceof i0.e.b.g3.m.f.d.a
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    i0.e.b.d3.k.L(r5, r0)
                    com.clubhouse.android.ui.search.ExploreV2Fragment r5 = r2
                    com.clubhouse.android.databinding.FragmentExploreV2Binding r5 = r5.O0()
                    android.widget.ProgressBar r5 = r5.d
                    java.lang.String r0 = "binding.loading"
                    m0.n.b.i.d(r5, r0)
                    i0.e.b.g3.m.f.d r0 = r4
                    boolean r0 = r0 instanceof i0.e.b.g3.m.f.d.C0203d
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    i0.e.b.d3.k.L(r5, r0)
                    com.clubhouse.android.ui.search.ExploreV2Fragment r5 = r2
                    com.clubhouse.android.databinding.FragmentExploreV2Binding r5 = r5.O0()
                    com.clubhouse.android.shared.ui.ImpressionTrackingEpoxyRecyclerView r5 = r5.f
                    java.lang.String r0 = "binding.resultsList"
                    m0.n.b.i.d(r5, r0)
                    i0.e.b.g3.m.f.d r0 = r4
                    boolean r0 = r0 instanceof i0.e.b.g3.m.f.d.C0203d
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    i0.e.b.d3.k.q(r5, r0)
                    m0.i r5 = m0.i.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.search.ExploreV2Fragment$configurePagingControllers$1.AnonymousClass1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        return i.a;
    }
}
