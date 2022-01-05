package com.clubhouse.android.channels.mvi;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.remote.response.AudienceReplyResponse;
import i0.b.b.b;
import i0.e.b.z2.g.k;
import i0.e.b.z2.g.l;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: ChannelViewModel.kt */
public final class ChannelViewModel$raiseHand$1$1$2 extends Lambda implements p<l, b<? extends AudienceReplyResponse>, l> {
    public static final ChannelViewModel$raiseHand$1$1$2 c = new ChannelViewModel$raiseHand$1$1$2();

    public ChannelViewModel$raiseHand$1$1$2() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        List list;
        l lVar = (l) obj;
        b bVar = (b) obj2;
        i.e(lVar, "$this$execute");
        i.e(bVar, "it");
        AudienceReplyResponse audienceReplyResponse = (AudienceReplyResponse) bVar.a();
        if (audienceReplyResponse == null) {
            list = null;
        } else {
            list = audienceReplyResponse.a;
        }
        if (list == null) {
            list = EmptyList.c;
        }
        return l.copy$default(lVar, (k) null, (SourceLocation) null, false, true, false, (List) null, false, 0, 0, false, false, 0, list, false, false, 28663, (Object) null);
    }
}
