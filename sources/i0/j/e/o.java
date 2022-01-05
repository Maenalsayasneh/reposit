package i0.j.e;

import android.content.Context;
import com.instabug.library.Instabug;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventSubscriber;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.e.u0.b;
import i0.j.e.y.b.a;
import java.util.Objects;

/* compiled from: InstabugDelegate */
public class o implements Runnable {
    public final /* synthetic */ i c;

    public o(i iVar) {
        this.c = iVar;
    }

    public void run() {
        try {
            if (Instabug.getApplicationContext() != null) {
                Objects.requireNonNull(this.c);
                Context applicationContext = Instabug.getApplicationContext();
                if (applicationContext != null) {
                    z.j().k(applicationContext);
                }
                a.c(Instabug.getApplicationContext());
                b.c().a();
                this.c.j();
                i iVar = this.c;
                Objects.requireNonNull(iVar);
                iVar.Y1 = SDKCoreEventSubscriber.subscribe(new t(iVar));
                Objects.requireNonNull(this.c);
                InstabugSDKLogger.d("InstabugDelegate", "Starting Instabug SDK invocation listeners");
                InvocationManager.getInstance().listen();
            }
        } catch (Exception e) {
            InstabugSDKLogger.e("InstabugDelegate", e.getMessage(), e);
        }
    }
}
