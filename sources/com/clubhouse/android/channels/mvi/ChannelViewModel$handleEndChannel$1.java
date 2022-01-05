package com.clubhouse.android.channels.mvi;

import i0.e.b.z2.g.n0;
import i0.e.b.z2.g.u;
import i0.e.b.z2.g.w0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelViewModel.kt */
public final class ChannelViewModel$handleEndChannel$1 extends Lambda implements l<i0.e.b.z2.g.l, i> {
    public final /* synthetic */ n0 c;
    public final /* synthetic */ ChannelViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelViewModel$handleEndChannel$1(n0 n0Var, ChannelViewModel channelViewModel) {
        super(1);
        this.c = n0Var;
        this.d = channelViewModel;
    }

    public Object invoke(Object obj) {
        i0.e.b.z2.g.l lVar = (i0.e.b.z2.g.l) obj;
        m0.n.b.i.e(lVar, "state");
        if (!this.c.a || lVar.p.d() <= 1) {
            this.d.r.p(u.a);
        } else {
            this.d.o(new w0(lVar.p.d()));
        }
        return i.a;
    }
}
