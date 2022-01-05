package com.clubhouse.android.ui.channels;

import com.clubhouse.android.channels.model.AudienceType;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.ui.actionsheet.ActionSheetBuilder;
import com.clubhouse.app.R;
import h0.b0.v;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$showChannelAudienceOptions$1 extends Lambda implements l<i0.e.b.z2.g.l, i> {
    public final /* synthetic */ ChannelFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$showChannelAudienceOptions$1(ChannelFragment channelFragment) {
        super(1);
        this.c = channelFragment;
    }

    public Object invoke(Object obj) {
        final AudienceType audienceType;
        i0.e.b.z2.g.l lVar = (i0.e.b.z2.g.l) obj;
        m0.n.b.i.e(lVar, "state");
        Channel channel = lVar.u;
        if (channel == null) {
            audienceType = null;
        } else {
            audienceType = v.o(channel);
        }
        if (audienceType == AudienceType.Club) {
            ChannelFragment channelFragment = this.c;
            k<Object>[] kVarArr = ChannelFragment.Z1;
            v.v2(channelFragment.S0(), new ChannelFragment$showConfirmMakeClubChannelPublic$1(channelFragment));
        } else {
            final ChannelFragment channelFragment2 = this.c;
            v.e(channelFragment2, new l<ActionSheetBuilder, i>() {
                public Object invoke(Object obj) {
                    ActionSheetBuilder actionSheetBuilder = (ActionSheetBuilder) obj;
                    m0.n.b.i.e(actionSheetBuilder, "$this$actionSheet");
                    actionSheetBuilder.a = ChannelFragment.this.getString(R.string.room_access_action_sheet_title);
                    actionSheetBuilder.b = ChannelFragment.this.getString(R.string.room_access_action_sheet_description);
                    actionSheetBuilder.c = true;
                    boolean z = false;
                    ChannelFragment.N0(ChannelFragment.this, actionSheetBuilder, AudienceType.Open, false);
                    AudienceType audienceType = audienceType;
                    AudienceType audienceType2 = AudienceType.Social;
                    if (audienceType == audienceType2 || audienceType == AudienceType.Closed) {
                        ChannelFragment channelFragment = ChannelFragment.this;
                        if (audienceType == audienceType2) {
                            z = true;
                        }
                        ChannelFragment.N0(channelFragment, actionSheetBuilder, audienceType2, z);
                    }
                    AudienceType audienceType3 = audienceType;
                    AudienceType audienceType4 = AudienceType.Closed;
                    if (audienceType3 == audienceType4) {
                        ChannelFragment.N0(ChannelFragment.this, actionSheetBuilder, audienceType4, true);
                    }
                    return i.a;
                }
            });
        }
        return i.a;
    }
}
