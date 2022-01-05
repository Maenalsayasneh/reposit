package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import h0.g0.i;
import h0.g0.r.p.b.b;

public abstract class ConstraintProxy extends BroadcastReceiver {
    public static final String a = i.e("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
    }

    public static class NetworkStateProxy extends ConstraintProxy {
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
    }

    public void onReceive(Context context, Intent intent) {
        i.c().a(a, String.format("onReceive : %s", new Object[]{intent}), new Throwable[0]);
        context.startService(b.a(context));
    }
}
