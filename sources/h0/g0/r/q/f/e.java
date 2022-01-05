package h0.g0.r.q.f;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import h0.g0.i;
import h0.g0.r.q.b;

/* compiled from: NetworkStateTracker */
public class e extends d<b> {
    public static final String g = i.e("NetworkStateTracker");
    public final ConnectivityManager h = ((ConnectivityManager) this.c.getSystemService("connectivity"));
    public a i = new a();

    /* compiled from: NetworkStateTracker */
    public class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            i.c().a(e.g, String.format("Network capabilities changed: %s", new Object[]{networkCapabilities}), new Throwable[0]);
            e eVar = e.this;
            eVar.c(eVar.f());
        }

        public void onLost(Network network) {
            i.c().a(e.g, "Network connection lost", new Throwable[0]);
            e eVar = e.this;
            eVar.c(eVar.f());
        }
    }

    public e(Context context, h0.g0.r.t.q.a aVar) {
        super(context, aVar);
    }

    public Object a() {
        return f();
    }

    public void d() {
        try {
            i.c().a(g, "Registering network callback", new Throwable[0]);
            this.h.registerDefaultNetworkCallback(this.i);
        } catch (IllegalArgumentException | SecurityException e) {
            i.c().b(g, "Received exception while registering network callback", e);
        }
    }

    public void e() {
        try {
            i.c().a(g, "Unregistering network callback", new Throwable[0]);
            this.h.unregisterNetworkCallback(this.i);
        } catch (IllegalArgumentException | SecurityException e) {
            i.c().b(g, "Received exception while unregistering network callback", e);
        }
    }

    public b f() {
        boolean z;
        NetworkInfo activeNetworkInfo = this.h.getActiveNetworkInfo();
        boolean z2 = true;
        boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            NetworkCapabilities networkCapabilities = this.h.getNetworkCapabilities(this.h.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                z = true;
                boolean isActiveNetworkMetered = this.h.isActiveNetworkMetered();
                if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
                    z2 = false;
                }
                return new b(z3, z, isActiveNetworkMetered, z2);
            }
        } catch (SecurityException e) {
            i.c().b(g, "Unable to validate active network", e);
        }
        z = false;
        boolean isActiveNetworkMetered2 = this.h.isActiveNetworkMetered();
        z2 = false;
        return new b(z3, z, isActiveNetworkMetered2, z2);
    }
}
