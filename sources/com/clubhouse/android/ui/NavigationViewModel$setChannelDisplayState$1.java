package com.clubhouse.android.ui;

import i0.e.b.g3.h;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: NavigationViewModel.kt */
public final class NavigationViewModel$setChannelDisplayState$1 extends Lambda implements l<h, h> {
    public final /* synthetic */ ChannelDisplayState c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationViewModel$setChannelDisplayState$1(ChannelDisplayState channelDisplayState) {
        super(1);
        this.c = channelDisplayState;
    }

    public Object invoke(Object obj) {
        i.e((h) obj, "$this$setState");
        ChannelDisplayState channelDisplayState = this.c;
        i.e(channelDisplayState, "channelDisplayState");
        return new h(channelDisplayState);
    }
}
