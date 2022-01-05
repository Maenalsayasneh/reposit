package com.airbnb.epoxy;

import android.view.View;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;

/* compiled from: _Sequences.kt */
public final class LifecycleAwareEpoxyViewBinder$view$$inlined$maybeFindViewByIdName$1 extends Lambda implements l<Object, Boolean> {
    public static final LifecycleAwareEpoxyViewBinder$view$$inlined$maybeFindViewByIdName$1 c = new LifecycleAwareEpoxyViewBinder$view$$inlined$maybeFindViewByIdName$1();

    public LifecycleAwareEpoxyViewBinder$view$$inlined$maybeFindViewByIdName$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        return Boolean.valueOf(obj instanceof View);
    }
}
