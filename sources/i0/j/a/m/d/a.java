package i0.j.a.m.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.Objects;

/* compiled from: BatteryLevelChangeBroadcast */
public class a extends BroadcastReceiver {
    public final i0.j.a.n.a.a a = i0.j.a.g.a.i();
    public b b;
    public boolean c;

    public a(b bVar) {
        this.b = bVar;
    }

    public void a(Context context) {
        try {
            if (this.c) {
                Objects.requireNonNull(this.a);
                InstabugSDKLogger.p("Instabug - APM", "BatteryLevelChangeBroadcast is already registered. Skipping re-registering");
                return;
            }
            context.registerReceiver(this, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.c = true;
            Objects.requireNonNull(this.a);
            InstabugSDKLogger.p("Instabug - APM", "batteryLevelReceiver registered on " + context.toString());
        } catch (Exception e) {
            InstabugSDKLogger.e("BatteryLevelChangeBroadcast", e.toString(), e);
        }
    }

    public void b(Context context) {
        try {
            if (this.c) {
                context.unregisterReceiver(this);
                this.c = false;
                Objects.requireNonNull(this.a);
                InstabugSDKLogger.p("Instabug - APM", "batteryLevelReceiver unregistered from " + context.toString());
                return;
            }
            Objects.requireNonNull(this.a);
            InstabugSDKLogger.p("Instabug - APM", "BatteryLevelChangeBroadcast is not registered. Skipping unregistering");
        } catch (Exception e) {
            InstabugSDKLogger.e("BatteryLevelChangeBroadcast", e.toString(), e);
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            this.b.e(intent.getIntExtra("level", 0));
        }
    }
}
