package com.clubhouse.android.channels.mvi;

import com.clubhouse.android.data.models.local.channel.AllUserMessage;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.channel.ClipsPermission;
import com.clubhouse.android.data.models.local.channel.HandraisePermission;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import i0.e.b.b3.a.a.c.a;
import i0.e.b.b3.a.a.c.d;
import i0.e.b.z2.g.k;
import i0.e.b.z2.g.x0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ChannelControlModel.kt */
public final class ChannelControlModel$handleHandraiseSettingsChanged$1 extends Lambda implements l<k, i> {
    public final /* synthetic */ AllUserMessage c;
    public final /* synthetic */ ChannelControlModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelControlModel$handleHandraiseSettingsChanged$1(AllUserMessage allUserMessage, ChannelControlModel channelControlModel) {
        super(1);
        this.c = allUserMessage;
        this.d = channelControlModel;
    }

    public Object invoke(Object obj) {
        k kVar = (k) obj;
        m0.n.b.i.e(kVar, "currentState");
        if (kVar.i && m0.n.b.i.a(this.c.e, Boolean.FALSE)) {
            this.d.o(x0.a);
        }
        if (kVar.j != this.c.d || !m0.n.b.i.a(Boolean.valueOf(kVar.i), this.c.e)) {
            ChannelControlModel channelControlModel = this.d;
            final AllUserMessage allUserMessage = this.c;
            channelControlModel.m(new l<k, k>() {
                public Object invoke(Object obj) {
                    boolean z;
                    k kVar = (k) obj;
                    m0.n.b.i.e(kVar, "$this$setState");
                    d dVar = new d((Set) null, (Set) null, (Set) null, 7);
                    Boolean bool = AllUserMessage.this.e;
                    if (bool == null) {
                        z = true;
                    } else {
                        z = bool.booleanValue();
                    }
                    boolean z2 = z;
                    HandraisePermission handraisePermission = AllUserMessage.this.d;
                    if (handraisePermission == null) {
                        handraisePermission = HandraisePermission.ALL;
                    }
                    return k.copy$default(kVar, (String) null, (Channel) null, (SourceLocation) null, (a) null, dVar, false, false, false, z2, handraisePermission, (ClipsPermission) null, (List) null, false, 0, false, false, false, 130287, (Object) null);
                }
            });
        }
        return i.a;
    }
}
