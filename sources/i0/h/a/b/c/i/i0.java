package i0.h.a.b.c.i;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import i0.h.a.b.c.i.e;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public final class i0 implements Handler.Callback {
    public final /* synthetic */ h0 a;

    public i0(h0 h0Var, g0 g0Var) {
        this.a = h0Var;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.a.c) {
                e.a aVar = (e.a) message.obj;
                j0 j0Var = this.a.c.get(aVar);
                if (j0Var != null && j0Var.a.isEmpty()) {
                    if (j0Var.c) {
                        j0Var.g.e.removeMessages(1, j0Var.e);
                        h0 h0Var = j0Var.g;
                        h0Var.f.c(h0Var.d, j0Var);
                        j0Var.c = false;
                        j0Var.b = 2;
                    }
                    this.a.c.remove(aVar);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.a.c) {
                e.a aVar2 = (e.a) message.obj;
                j0 j0Var2 = this.a.c.get(aVar2);
                if (j0Var2 != null && j0Var2.b == 3) {
                    String valueOf = String.valueOf(aVar2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = j0Var2.f;
                    if (componentName == null) {
                        Objects.requireNonNull(aVar2);
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = aVar2.c;
                        Objects.requireNonNull(str, "null reference");
                        componentName = new ComponentName(str, "unknown");
                    }
                    j0Var2.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}
