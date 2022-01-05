package com.airbnb.epoxy;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: EpoxyViewBinderExtensions.kt */
public final class EpoxyViewBinderExtensionsKt$epoxyView$4 extends Lambda implements a<LifecycleAwareEpoxyViewBinder> {
    public final /* synthetic */ p Y1;
    public final /* synthetic */ Fragment c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ l y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EpoxyViewBinderExtensionsKt$epoxyView$4(Fragment fragment, int i, boolean z, boolean z2, l lVar, p pVar) {
        super(0);
        this.c = fragment;
        this.d = i;
        this.q = z;
        this.x = z2;
        this.y = lVar;
        this.Y1 = pVar;
    }

    public Object invoke() {
        Fragment fragment = this.c;
        int i = this.d;
        boolean z = this.q;
        boolean z2 = this.x;
        l lVar = this.y;
        p pVar = this.Y1;
        h0.q.p viewLifecycleOwner = fragment.getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        LifecycleAwareEpoxyViewBinder lifecycleAwareEpoxyViewBinder = new LifecycleAwareEpoxyViewBinder(viewLifecycleOwner, new EpoxyViewBinderExtensionsKt$epoxyViewInternal$2(fragment), i, z, z2, pVar);
        lVar.invoke(lifecycleAwareEpoxyViewBinder);
        return lifecycleAwareEpoxyViewBinder;
    }
}
