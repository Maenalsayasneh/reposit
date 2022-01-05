package com.clubhouse.android.channels.mvi;

import com.clubhouse.android.data.models.local.channel.ChannelInRoom;
import com.clubhouse.android.data.models.local.channel.ClipsPermission;
import com.clubhouse.android.data.models.local.channel.HandraisePermission;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import i0.e.b.b3.a.a.c.a;
import i0.e.b.b3.a.a.c.d;
import i0.e.b.z2.g.k;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelControlModel.kt */
public final class ChannelControlModel$setChannelClubInviteAsAccepted$1 extends Lambda implements l<k, i> {
    public final /* synthetic */ ChannelControlModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelControlModel$setChannelClubInviteAsAccepted$1(ChannelControlModel channelControlModel) {
        super(1);
        this.c = channelControlModel;
    }

    public Object invoke(Object obj) {
        final k kVar = (k) obj;
        m0.n.b.i.e(kVar, "state");
        if (kVar.b instanceof ChannelInRoom) {
            this.c.m(new l<k, k>() {
                public Object invoke(Object obj) {
                    k kVar = (k) obj;
                    m0.n.b.i.e(kVar, "$this$setState");
                    return k.copy$default(kVar, (String) null, ((ChannelInRoom) k.this.b).C0(true), (SourceLocation) null, (a) null, (d) null, false, false, false, false, (HandraisePermission) null, (ClipsPermission) null, (List) null, false, 0, false, false, false, 131069, (Object) null);
                }
            });
        }
        return i.a;
    }
}
