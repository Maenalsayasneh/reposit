package i0.h.a.b.c.i;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import h0.b0.v;
import i0.h.a.b.c.i.b;
import i0.h.a.b.c.i.e;
import i0.h.a.b.c.l.a;
import i0.h.a.b.g.e.d;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public final class h0 extends e {
    public final HashMap<e.a, j0> c = new HashMap<>();
    public final Context d;
    public final Handler e;
    public final a f;
    public final long g;
    public final long h;

    public h0(Context context) {
        this.d = context.getApplicationContext();
        this.e = new d(context.getMainLooper(), new i0(this, (g0) null));
        this.f = a.b();
        this.g = 5000;
        this.h = 300000;
    }

    public final boolean a(e.a aVar, ServiceConnection serviceConnection, String str) {
        boolean z;
        v.A(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.c) {
            j0 j0Var = this.c.get(aVar);
            if (j0Var == null) {
                j0Var = new j0(this, aVar);
                j0Var.a.put(serviceConnection, serviceConnection);
                j0Var.a(str);
                this.c.put(aVar, j0Var);
            } else {
                this.e.removeMessages(0, aVar);
                if (!j0Var.a.containsKey(serviceConnection)) {
                    j0Var.a.put(serviceConnection, serviceConnection);
                    int i = j0Var.b;
                    if (i == 1) {
                        ((b.i) serviceConnection).onServiceConnected(j0Var.f, j0Var.d);
                    } else if (i == 2) {
                        j0Var.a(str);
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            z = j0Var.c;
        }
        return z;
    }

    public final void b(e.a aVar, ServiceConnection serviceConnection, String str) {
        v.A(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.c) {
            j0 j0Var = this.c.get(aVar);
            if (j0Var == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (j0Var.a.containsKey(serviceConnection)) {
                j0Var.a.remove(serviceConnection);
                if (j0Var.a.isEmpty()) {
                    this.e.sendMessageDelayed(this.e.obtainMessage(0, aVar), this.g);
                }
            } else {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }
}
