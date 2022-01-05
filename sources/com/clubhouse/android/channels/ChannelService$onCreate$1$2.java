package com.clubhouse.android.channels;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.channel.ChannelInRoom;
import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.app.R;
import i0.e.b.e3.a;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.channels.ChannelService$onCreate$1$2", f = "ChannelService.kt", l = {}, m = "invokeSuspend")
/* compiled from: ChannelService.kt */
public final class ChannelService$onCreate$1$2 extends SuspendLambda implements p<Channel, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ ChannelService d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelService$onCreate$1$2(ChannelService channelService, m0.l.c<? super ChannelService$onCreate$1$2> cVar) {
        super(2, cVar);
        this.d = channelService;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ChannelService$onCreate$1$2 channelService$onCreate$1$2 = new ChannelService$onCreate$1$2(this.d, cVar);
        channelService$onCreate$1$2.c = obj;
        return channelService$onCreate$1$2;
    }

    public Object invoke(Object obj, Object obj2) {
        ChannelService$onCreate$1$2 channelService$onCreate$1$2 = new ChannelService$onCreate$1$2(this.d, (m0.l.c) obj2);
        channelService$onCreate$1$2.c = (Channel) obj;
        i iVar = i.a;
        channelService$onCreate$1$2.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        Channel channel = (Channel) this.c;
        ChannelService channelService = this.d;
        Objects.requireNonNull(channel, "null cannot be cast to non-null type com.clubhouse.android.data.models.local.channel.ChannelInRoom");
        ChannelInRoom channelInRoom = (ChannelInRoom) channel;
        int i = ChannelService.y;
        Objects.requireNonNull(channelService);
        h0.t.i iVar = new h0.t.i(channelService);
        iVar.e(R.navigation.main_graph);
        iVar.d(R.id.hallwayFragment);
        PendingIntent a = iVar.a();
        m0.n.b.i.d(a, "NavDeepLinkBuilder(this)\n            .setGraph(R.navigation.main_graph)\n            .setDestination(R.id.hallwayFragment)\n            .createPendingIntent()");
        String string = channelService.getString(R.string.leave_quietly);
        Intent intent = new Intent(channelService, ChannelBroadcastReceiver.class);
        intent.setAction("CHANNEL_ACTION");
        String str = null;
        NotificationCompat.Action action = new NotificationCompat.Action((IconCompat) null, (CharSequence) string, PendingIntent.getBroadcast(channelService, 0, intent, 0));
        a aVar = a.a;
        NotificationCompat.Builder contentTitle = new NotificationCompat.Builder((Context) channelService, a.b.a).setShowWhen(false).setContentTitle(channelInRoom.u0());
        Club i2 = channelInRoom.i();
        if (i2 != null) {
            str = i2.getName();
        }
        Notification build = contentTitle.setSubText(str).setContentText(channelInRoom.Q()).setStyle(new NotificationCompat.BigTextStyle().bigText(channelInRoom.Q())).setSmallIcon((int) R.drawable.ic_person).setContentIntent(a).setTicker(channelInRoom.u0()).addAction(action).build();
        m0.n.b.i.d(build, "Builder(this, ClubhouseNotifications.ONGOING_ROOM.channelId)\n                .setShowWhen(false)\n                .setContentTitle(channel.topic)\n                .setSubText(channel.club?.name)\n                .setContentText(channel.speakerSummary())\n                .setStyle(NotificationCompat.BigTextStyle()\n                    .bigText(channel.speakerSummary()))\n                .setSmallIcon(R.drawable.ic_person)\n                .setContentIntent(launchIntent)\n                .setTicker(channel.topic)\n                .addAction(leaveChannelAction)\n                .build()");
        channelService.startForeground(3309, build);
        return i.a;
    }
}
