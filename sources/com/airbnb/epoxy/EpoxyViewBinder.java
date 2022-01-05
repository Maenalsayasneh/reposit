package com.airbnb.epoxy;

import i0.b.a.e0;
import i0.b.a.t;
import m0.i;
import m0.n.a.p;

/* compiled from: EpoxyViewBinder.kt */
public final class EpoxyViewBinder implements e0 {
    public static p<? super EpoxyViewBinder, ? super RuntimeException, i> a = EpoxyViewBinder$Companion$globalExceptionHandler$1.c;
    public t<?> b;

    public void add(t<?> tVar) {
        m0.n.b.i.e(tVar, "model");
        if (this.b == null) {
            this.b = tVar;
            return;
        }
        throw new IllegalArgumentException("A model was already added to the ModelCollector. Only one should be added.".toString());
    }
}
