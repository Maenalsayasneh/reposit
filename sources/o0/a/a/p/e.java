package o0.a.a.p;

import android.content.ComponentName;
import android.os.RemoteException;
import h0.d.a.c;
import h0.d.a.d;
import o0.a.a.r.a;

/* compiled from: CustomTabManager */
public class e extends d {
    public final /* synthetic */ f a;

    public e(f fVar) {
        this.a = fVar;
    }

    public void onCustomTabsServiceConnected(ComponentName componentName, c cVar) {
        a.a("CustomTabsService is connected", new Object[0]);
        try {
            cVar.a.E(0);
        } catch (RemoteException unused) {
        }
        this.a.b.set(cVar);
        this.a.c.countDown();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        a.a("CustomTabsService is disconnected", new Object[0]);
        this.a.b.set((Object) null);
        this.a.c.countDown();
    }
}
