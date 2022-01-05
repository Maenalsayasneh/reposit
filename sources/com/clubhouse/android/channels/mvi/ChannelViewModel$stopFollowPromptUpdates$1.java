package com.clubhouse.android.channels.mvi;

import androidx.recyclerview.widget.RecyclerView;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import i0.e.b.z2.g.k;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: ChannelViewModel.kt */
public final class ChannelViewModel$stopFollowPromptUpdates$1 extends Lambda implements l<i0.e.b.z2.g.l, i0.e.b.z2.g.l> {
    public static final ChannelViewModel$stopFollowPromptUpdates$1 c = new ChannelViewModel$stopFollowPromptUpdates$1();

    public ChannelViewModel$stopFollowPromptUpdates$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        i0.e.b.z2.g.l lVar = (i0.e.b.z2.g.l) obj;
        i.e(lVar, "$this$setState");
        return i0.e.b.z2.g.l.copy$default(lVar, (k) null, (SourceLocation) null, false, false, false, (List) null, false, RecyclerView.FOREVER_NS, 0, false, false, 0, (List) null, false, false, 32639, (Object) null);
    }
}
