package com.airbnb.epoxy;

import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: EpoxyViewBinderExtensions.kt */
public final class EpoxyViewBinderExtensionsKt$epoxyViewInternal$2 extends Lambda implements a<View> {
    public final /* synthetic */ Fragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EpoxyViewBinderExtensionsKt$epoxyViewInternal$2(Fragment fragment) {
        super(0);
        this.c = fragment;
    }

    public Object invoke() {
        return this.c.getView();
    }
}
