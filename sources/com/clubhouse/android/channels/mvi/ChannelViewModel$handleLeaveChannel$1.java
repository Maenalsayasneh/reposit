package com.clubhouse.android.channels.mvi;

import com.clubhouse.android.channels.analytics.LeaveReason;
import com.clubhouse.android.shared.preferences.Key;
import i0.e.b.b3.a.a.c.a;
import i0.e.b.f3.k.b;
import i0.e.b.z2.g.b1;
import i0.e.b.z2.g.c0;
import i0.e.b.z2.g.c1;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelViewModel.kt */
public final class ChannelViewModel$handleLeaveChannel$1 extends Lambda implements l<i0.e.b.z2.g.l, i> {
    public final /* synthetic */ ChannelViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelViewModel$handleLeaveChannel$1(ChannelViewModel channelViewModel) {
        super(1);
        this.c = channelViewModel;
    }

    public Object invoke(Object obj) {
        i0.e.b.z2.g.l lVar = (i0.e.b.z2.g.l) obj;
        m0.n.b.i.e(lVar, "state");
        long currentTimeMillis = System.currentTimeMillis() - lVar.a.n;
        b bVar = this.c.n;
        Objects.requireNonNull(bVar);
        Key key = Key.TOTAL_CONNECTED_MILLIS;
        bVar.h(key, bVar.b(key, 0) + currentTimeMillis);
        if (!lVar.p.g() || !lVar.H || !m0.n.b.i.a(lVar.a.b(), Boolean.FALSE)) {
            a aVar = lVar.p;
            if (!(aVar.f() && aVar.d.size() == 1) || lVar.p.k.size() <= 1) {
                this.c.r.p(new c0(LeaveReason.LEAVE_BUTTON));
            } else {
                this.c.o(b1.a);
            }
        } else {
            this.c.o(c1.a);
        }
        return i.a;
    }
}
