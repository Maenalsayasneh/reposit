package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import h0.g0.i;
import h0.g0.r.l;
import java.util.Objects;

public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = i.e("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        i.c().a(a, String.format("Received intent %s", new Object[]{intent}), new Throwable[0]);
        try {
            l c = l.c(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            Objects.requireNonNull(c);
            synchronized (l.d) {
                c.m = goAsync;
                if (c.l) {
                    goAsync.finish();
                    c.m = null;
                }
            }
        } catch (IllegalStateException e) {
            i.c().b(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
