package h0.g0.r.q.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import h0.g0.i;
import h0.g0.r.t.q.a;

/* compiled from: BatteryNotLowTracker */
public class b extends c<Boolean> {
    public static final String i = i.e("BatteryNotLowTracker");

    public b(Context context, a aVar) {
        super(context, aVar);
    }

    public Object a() {
        Intent registerReceiver = this.c.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            i.c().b(i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        float intExtra2 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        if (intExtra == 1 || intExtra2 > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    public void g(Context context, Intent intent) {
        if (intent.getAction() != null) {
            i.c().a(i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("android.intent.action.BATTERY_OKAY")) {
                c(Boolean.TRUE);
            } else if (action.equals("android.intent.action.BATTERY_LOW")) {
                c(Boolean.FALSE);
            }
        }
    }
}
