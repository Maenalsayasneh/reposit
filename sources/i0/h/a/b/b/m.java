package i0.h.a.b.b;

import android.util.Log;
import com.google.android.gms.cloudmessaging.zzp;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final /* synthetic */ class m implements Runnable {
    public final g c;
    public final q d;

    public m(g gVar, q qVar) {
        this.c = gVar;
        this.d = qVar;
    }

    public final void run() {
        g gVar = this.c;
        int i = this.d.a;
        synchronized (gVar) {
            q qVar = gVar.e.get(i);
            if (qVar != null) {
                StringBuilder sb = new StringBuilder(31);
                sb.append("Timing out request: ");
                sb.append(i);
                Log.w("MessengerIpcClient", sb.toString());
                gVar.e.remove(i);
                qVar.b(new zzp(3, "Timed out waiting for response"));
                gVar.c();
            }
        }
    }
}
