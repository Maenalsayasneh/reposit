package com.airbnb.epoxy;

import android.view.View;
import android.view.ViewGroup;
import h0.i.i.w;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt___SequencesKt;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import m0.s.d;
import m0.s.h;

/* compiled from: ViewExtensions.kt */
public final class ViewExtensionsKt$allRecursiveChildren$1 extends Lambda implements l<View, h<? extends View>> {
    public static final ViewExtensionsKt$allRecursiveChildren$1 c = new ViewExtensionsKt$allRecursiveChildren$1();

    public ViewExtensionsKt$allRecursiveChildren$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        h hVar;
        View view = (View) obj;
        i.e(view, "it");
        h n3 = a.n3(view);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            i.e(viewGroup, "$this$allRecursiveChildren");
            i.e(viewGroup, "$this$children");
            hVar = SequencesKt___SequencesKt.f(new w(viewGroup), c);
        } else {
            hVar = d.a;
        }
        i.e(n3, "$this$plus");
        i.e(hVar, "elements");
        return a.x1(a.n3(n3, hVar));
    }
}
