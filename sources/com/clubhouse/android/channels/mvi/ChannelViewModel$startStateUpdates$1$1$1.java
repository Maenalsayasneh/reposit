package com.clubhouse.android.channels.mvi;

import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import i0.e.b.b3.a.a.c.a;
import i0.e.b.z2.g.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: ChannelViewModel.kt */
public final class ChannelViewModel$startStateUpdates$1$1$1 extends Lambda implements l<i0.e.b.z2.g.l, i0.e.b.z2.g.l> {
    public final /* synthetic */ k c;
    public final /* synthetic */ ChannelViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelViewModel$startStateUpdates$1$1$1(k kVar, ChannelViewModel channelViewModel) {
        super(1);
        this.c = kVar;
        this.d = channelViewModel;
    }

    public Object invoke(Object obj) {
        boolean z;
        i0.e.b.z2.g.l lVar = (i0.e.b.z2.g.l) obj;
        i.e(lVar, "$this$setState");
        k kVar = this.c;
        ChannelViewModel channelViewModel = this.d;
        a aVar = kVar.d;
        int i = ChannelViewModel.m;
        Objects.requireNonNull(channelViewModel);
        Set<Integer> keySet = aVar.b.keySet();
        ArrayList arrayList = new ArrayList();
        for (T next : keySet) {
            if (channelViewModel.t.s(((Number) next).intValue())) {
                arrayList.add(next);
            }
        }
        ChannelViewModel channelViewModel2 = this.d;
        a aVar2 = this.c.d;
        Objects.requireNonNull(channelViewModel2);
        if (aVar2.k.size() > 0) {
            List<UserInChannel> list = aVar2.k;
            ArrayList arrayList2 = new ArrayList();
            for (T next2 : list) {
                if (!channelViewModel2.t.t(((UserInChannel) next2).getId().intValue())) {
                    arrayList2.add(next2);
                }
            }
            if (arrayList2.size() == 0) {
                z = true;
                return i0.e.b.z2.g.l.copy$default(lVar, kVar, (SourceLocation) null, false, false, false, arrayList, z, 0, 0, false, false, 0, (List) null, false, false, 32670, (Object) null);
            }
        }
        z = false;
        return i0.e.b.z2.g.l.copy$default(lVar, kVar, (SourceLocation) null, false, false, false, arrayList, z, 0, 0, false, false, 0, (List) null, false, false, 32670, (Object) null);
    }
}
