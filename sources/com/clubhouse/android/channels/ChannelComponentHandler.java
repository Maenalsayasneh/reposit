package com.clubhouse.android.channels;

import com.clubhouse.android.data.repos.ChannelRepo;
import h0.b0.v;
import i0.e.b.z2.e.a;
import i0.e.b.z2.e.b;
import kotlin.Result;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: ChannelComponentHandler.kt */
public final class ChannelComponentHandler {
    public b a;
    public ChannelRepo b;
    public a c;

    public ChannelComponentHandler(b bVar, ChannelRepo channelRepo, i0.e.b.a3.a.b bVar2) {
        i.e(bVar, "channelComponentBuilder");
        i.e(channelRepo, "channelRepo");
        i.e(bVar2, "releaseCompletable");
        this.a = bVar;
        this.b = channelRepo;
        bVar2.a.E(new l<Throwable, m0.i>(this) {
            public final /* synthetic */ ChannelComponentHandler c;

            {
                this.c = r1;
            }

            public Object invoke(Object obj) {
                i0.e.b.a3.a.b a;
                Throwable th = (Throwable) obj;
                a aVar = this.c.c;
                if (!(aVar == null || (a = v.b0(aVar).a()) == null)) {
                    i0.e.b.a3.a.b.a(a, (Result) null, 1);
                }
                return m0.i.a;
            }
        });
    }
}
