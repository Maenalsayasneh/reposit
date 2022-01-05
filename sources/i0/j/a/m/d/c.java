package i0.j.a.m.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.a.n.a.a;
import java.util.Objects;

/* compiled from: PowerSaveModeBroadcast */
public class c extends BroadcastReceiver {
    public final a a = i0.j.a.g.a.i();
    public b b;
    public boolean c;

    public c(b bVar) {
        this.b = bVar;
    }

    public void a(Context context) {
        try {
            if (this.c) {
                Objects.requireNonNull(this.a);
                InstabugSDKLogger.p("Instabug - APM", "PowerSaveModeBroadcast is already registered. Skipping re-registering");
                return;
            }
            context.registerReceiver(this, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
            this.c = true;
            Objects.requireNonNull(this.a);
            InstabugSDKLogger.p("Instabug - APM", "PowerSaveModeReceiver registered on " + context.toString());
        } catch (Exception e) {
            InstabugSDKLogger.e("PowerSaveModeBroadcast", e.toString(), e);
        }
    }

    public void b(Context context) {
        try {
            if (this.c) {
                context.unregisterReceiver(this);
                this.c = false;
                Objects.requireNonNull(this.a);
                InstabugSDKLogger.p("Instabug - APM", "PowerSaveModeReceiver unregistered from " + context.toString());
                return;
            }
            Objects.requireNonNull(this.a);
            InstabugSDKLogger.p("Instabug - APM", "PowerSaveModeBroadcast is not registered. Skipping unregistering");
        } catch (Exception e) {
            InstabugSDKLogger.e("PowerSaveModeBroadcast", e.toString(), e);
        }
    }

    public void onReceive(Context context, Intent intent) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.b.j(powerManager.isPowerSaveMode());
        }
    }
}
