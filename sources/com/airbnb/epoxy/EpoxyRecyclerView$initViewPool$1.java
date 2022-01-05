package com.airbnb.epoxy;

import androidx.recyclerview.widget.RecyclerView;
import i0.b.a.m0;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: EpoxyRecyclerView.kt */
public final class EpoxyRecyclerView$initViewPool$1 extends Lambda implements a<RecyclerView.t> {
    public final /* synthetic */ EpoxyRecyclerView c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EpoxyRecyclerView$initViewPool$1(EpoxyRecyclerView epoxyRecyclerView) {
        super(0);
        this.c = epoxyRecyclerView;
    }

    public Object invoke() {
        Objects.requireNonNull(this.c);
        return new m0();
    }
}
