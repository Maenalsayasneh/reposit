package com.clubhouse.android.channels.mvi;

import com.clubhouse.android.shared.preferences.Key;
import i0.e.b.f3.k.b;
import i0.e.b.z2.g.d1;
import i0.e.b.z2.g.x0;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelViewModel.kt */
public final class ChannelViewModel$toggleRaiseHand$1 extends Lambda implements l<i0.e.b.z2.g.l, i> {
    public final /* synthetic */ ChannelViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelViewModel$toggleRaiseHand$1(ChannelViewModel channelViewModel) {
        super(1);
        this.c = channelViewModel;
    }

    public Object invoke(Object obj) {
        i0.e.b.z2.g.l lVar = (i0.e.b.z2.g.l) obj;
        m0.n.b.i.e(lVar, "state");
        if (!lVar.G) {
            this.c.o(x0.a);
        } else if (lVar.d) {
            ChannelViewModel channelViewModel = this.c;
            Objects.requireNonNull(channelViewModel);
            channelViewModel.n(new ChannelViewModel$unraiseHand$1(channelViewModel));
        } else {
            ChannelViewModel channelViewModel2 = this.c;
            b bVar = channelViewModel2.n;
            Key key = Key.KEY_SEEN_RAISE_HAND_EDUCATION;
            if (bVar.a(key, false)) {
                channelViewModel2.n(new ChannelViewModel$raiseHand$1(channelViewModel2));
            } else {
                channelViewModel2.n.g(key, true);
                channelViewModel2.o(d1.a);
            }
        }
        return i.a;
    }
}
