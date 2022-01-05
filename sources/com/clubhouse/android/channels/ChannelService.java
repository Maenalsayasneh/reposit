package com.clubhouse.android.channels;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import com.clubhouse.android.channels.analytics.LeaveReason;
import h0.q.q;
import i0.e.b.f3.i.a;
import i0.e.b.h3.a.b;
import i0.e.b.z2.c;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/clubhouse/android/channels/ChannelService;", "Lh0/q/t;", "Lm0/i;", "onCreate", "()V", "onDestroy", "Landroid/content/Intent;", "rootIntent", "onTaskRemoved", "(Landroid/content/Intent;)V", "Li0/e/b/f3/i/a;", "Y1", "Li0/e/b/f3/i/a;", "getUserComponentHandler", "()Li0/e/b/f3/i/a;", "setUserComponentHandler", "(Li0/e/b/f3/i/a;)V", "userComponentHandler", "Lcom/clubhouse/android/channels/ChannelBroadcastReceiver;", "Z1", "Lcom/clubhouse/android/channels/ChannelBroadcastReceiver;", "getBroadcastReceiver", "()Lcom/clubhouse/android/channels/ChannelBroadcastReceiver;", "setBroadcastReceiver", "(Lcom/clubhouse/android/channels/ChannelBroadcastReceiver;)V", "broadcastReceiver", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: ChannelService.kt */
public final class ChannelService extends c {
    public static final /* synthetic */ int y = 0;
    public a Y1;
    public ChannelBroadcastReceiver Z1;

    public void onCreate() {
        super.onCreate();
        a aVar = this.Y1;
        if (aVar != null) {
            b bVar = aVar.d;
            if (bVar != null) {
                m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ChannelService$onCreate$lambda1$$inlined$filter$1(((i0.e.b.c3.i.a) h.L0(bVar, i0.e.b.c3.i.a.class)).b().e), new ChannelService$onCreate$1$2(this, (m0.l.c<? super ChannelService$onCreate$1$2>) null)), q.a(this));
            }
            ChannelBroadcastReceiver channelBroadcastReceiver = this.Z1;
            if (channelBroadcastReceiver != null) {
                registerReceiver(channelBroadcastReceiver, new IntentFilter("CHANNEL_ACTION"));
            } else {
                i.m("broadcastReceiver");
                throw null;
            }
        } else {
            i.m("userComponentHandler");
            throw null;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        ChannelBroadcastReceiver channelBroadcastReceiver = this.Z1;
        if (channelBroadcastReceiver != null) {
            unregisterReceiver(channelBroadcastReceiver);
        } else {
            i.m("broadcastReceiver");
            throw null;
        }
    }

    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        Intent intent2 = new Intent(this, ChannelBroadcastReceiver.class);
        intent2.setAction("CHANNEL_ACTION");
        PendingIntent.getBroadcast(this, 0, intent2, 0).send(LeaveReason.TASK_REMOVED.ordinal());
    }
}
