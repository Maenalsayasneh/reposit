package com.clubhouse.android.channels.mvi;

import com.clubhouse.android.data.models.local.channel.AllUserMessage;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.channel.ClipsPermission;
import com.clubhouse.android.data.models.local.channel.HandraisePermission;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import i0.e.b.b3.a.a.c.a;
import i0.e.b.b3.a.a.c.d;
import i0.e.b.z2.g.k;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: ChannelControlModel.kt */
public final class ChannelControlModel$handleClipsSettingsChange$1 extends Lambda implements l<k, k> {
    public final /* synthetic */ AllUserMessage c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelControlModel$handleClipsSettingsChange$1(AllUserMessage allUserMessage) {
        super(1);
        this.c = allUserMessage;
    }

    public Object invoke(Object obj) {
        ClipsPermission clipsPermission;
        k kVar = (k) obj;
        i.e(kVar, "$this$setState");
        if (i.a(this.c.g, Boolean.TRUE)) {
            clipsPermission = ClipsPermission.ALLOWED_FOR_ALL;
        } else {
            clipsPermission = ClipsPermission.NOT_ALLOWED;
        }
        return k.copy$default(kVar, (String) null, (Channel) null, (SourceLocation) null, (a) null, (d) null, false, false, false, false, (HandraisePermission) null, clipsPermission, (List) null, false, 0, false, false, false, 130047, (Object) null);
    }
}
