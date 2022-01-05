package h0.g0.r.q.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import h0.g0.i;

/* compiled from: BroadcastReceiverConstraintTracker */
public abstract class c<T> extends d<T> {
    public static final String g = i.e("BrdcstRcvrCnstrntTrckr");
    public final BroadcastReceiver h = new a();

    /* compiled from: BroadcastReceiverConstraintTracker */
    public class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.g(context, intent);
            }
        }
    }

    public c(Context context, h0.g0.r.t.q.a aVar) {
        super(context, aVar);
    }

    public void d() {
        i.c().a(g, String.format("%s: registering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.c.registerReceiver(this.h, f());
    }

    public void e() {
        i.c().a(g, String.format("%s: unregistering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.c.unregisterReceiver(this.h);
    }

    public abstract IntentFilter f();

    public abstract void g(Context context, Intent intent);
}
