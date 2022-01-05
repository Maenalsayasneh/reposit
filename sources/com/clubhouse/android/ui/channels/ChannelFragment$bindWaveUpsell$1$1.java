package com.clubhouse.android.ui.channels;

import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.g3.k.j;
import i0.e.b.g3.k.k;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$bindWaveUpsell$1$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ ChannelFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$bindWaveUpsell$1$1(ChannelFragment channelFragment) {
        super(1);
        this.c = channelFragment;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        m0.n.b.i.e(aVar, "$this$alertDialog");
        aVar.e(R.string.wave_social_alert_title);
        aVar.a.f = this.c.getString(R.string.wave_social_alert_body);
        aVar.c(R.string.never_mind, j.c);
        aVar.d(R.string.sounds_good_exclamation, new k(this.c));
        return i.a;
    }
}
