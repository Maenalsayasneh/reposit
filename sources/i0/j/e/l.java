package i0.j.e;

import android.content.Context;
import com.instabug.library.Feature;
import com.instabug.library.InstabugState;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.InstabugMediaProjectionIntent;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import h0.s.a.a;
import i0.j.e.u0.b;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* compiled from: InstabugDelegate */
public class l implements Runnable {
    public final /* synthetic */ i c;

    public l(i iVar) {
        this.c = iVar;
    }

    public void run() {
        Context context;
        InstabugSDKLogger.d("InstabugDelegate", "Stopping Instabug SDK functionality");
        InstabugCore.setAutoScreenRecordingEnabled(false);
        this.c.d(InstabugState.DISABLED);
        this.c.g(Feature.State.DISABLED);
        InstabugSDKLogger.v("InstabugDelegate", "Un-registering broadcasts");
        b.c().b();
        i iVar = this.c;
        if (iVar.i() != null) {
            a.a(iVar.i()).d(iVar.c);
        }
        Objects.requireNonNull(this.c);
        InstabugSDKLogger.d("InstabugDelegate", "Stopping Instabug SDK invocation listeners");
        InvocationManager.getInstance().sleep();
        i0.j.e.y.b.a.e();
        i0 d = i0.d();
        synchronized (d) {
            InstabugSDKLogger.d("SessionManager", "Instabug is disabled during app session, ending current session");
            SettingsManager.getInstance().setInBackground(false);
            d.e();
        }
        InstabugInternalTrackingDelegate.getInstance().unregisterActivityLifecycleListener(this.c.x);
        this.c.a();
        WeakReference<Context> weakReference = this.c.y;
        if (!(weakReference == null || (context = (Context) weakReference.get()) == null)) {
            PoolProvider.getSingleThreadExecuter("drop_db_executor").execute(new m(context));
        }
        i iVar2 = this.c;
        k0.b.w.a aVar = iVar2.a2;
        if (aVar != null) {
            aVar.dispose();
            iVar2.a2 = null;
        }
        i iVar3 = this.c;
        k0.b.w.a aVar2 = iVar3.Y1;
        if (aVar2 != null) {
            aVar2.dispose();
            iVar3.Y1 = null;
        }
        this.c.h2 = false;
        InstabugMediaProjectionIntent.release();
    }
}
