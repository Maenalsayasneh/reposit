package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import h0.g0.i;
import h0.g0.r.l;
import h0.g0.r.t.f;
import h0.g0.r.t.q.b;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String a = i.e("ConstrntProxyUpdtRecvr");

    public class a implements Runnable {
        public final /* synthetic */ Intent c;
        public final /* synthetic */ Context d;
        public final /* synthetic */ BroadcastReceiver.PendingResult q;

        public a(ConstraintProxyUpdateReceiver constraintProxyUpdateReceiver, Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.c = intent;
            this.d = context;
            this.q = pendingResult;
        }

        public void run() {
            try {
                boolean booleanExtra = this.c.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.c.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.c.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.c.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                i.c().a(ConstraintProxyUpdateReceiver.a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[]{Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)}), new Throwable[0]);
                f.a(this.d, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                f.a(this.d, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                f.a(this.d, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                f.a(this.d, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.q.finish();
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            i.c().a(a, String.format("Ignoring unknown action %s", new Object[]{action}), new Throwable[0]);
            return;
        }
        BroadcastReceiver.PendingResult goAsync = goAsync();
        ((b) l.c(context).h).a.execute(new a(this, intent, context, goAsync));
    }
}
