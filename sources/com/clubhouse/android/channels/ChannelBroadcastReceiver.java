package com.clubhouse.android.channels;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.clubhouse.android.channels.analytics.LeaveReason;
import com.clubhouse.android.channels.mvi.ChannelControlModel;
import h0.b0.v;
import i0.e.b.c3.g.a;
import i0.e.b.h3.a.b;
import i0.e.b.z2.g.c0;
import i0.j.f.p.h;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/clubhouse/android/channels/ChannelBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lm0/i;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: ChannelBroadcastReceiver.kt */
public final class ChannelBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        ChannelControlModel d;
        i.e(context, "context");
        i.e(intent, "intent");
        b bVar = ((a) h.K0(context.getApplicationContext(), a.class)).h().d;
        i.c(bVar);
        i0.e.b.z2.e.a aVar = v.s(bVar).c;
        if (!(aVar == null || (d = v.b0(aVar).d()) == null)) {
            d.p(new c0(LeaveReason.values()[getResultCode()]));
        }
        context.stopService(new Intent(context, ChannelService.class));
    }
}
