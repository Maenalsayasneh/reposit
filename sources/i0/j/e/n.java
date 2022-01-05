package i0.j.e;

import android.content.Context;
import com.instabug.library.Instabug;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.e.u0.b;
import i0.j.e.y.b.a;
import java.util.Objects;

/* compiled from: InstabugDelegate */
public class n implements Runnable {
    public final /* synthetic */ i c;

    public n(i iVar) {
        this.c = iVar;
    }

    public void run() {
        try {
            Objects.requireNonNull(this.c);
            Context applicationContext = Instabug.getApplicationContext();
            if (applicationContext != null) {
                z.j().k(applicationContext);
            }
            a.e();
            b.c().b();
            i iVar = this.c;
            if (iVar.i() != null) {
                h0.s.a.a.a(iVar.i()).d(iVar.c);
            }
            i iVar2 = this.c;
            k0.b.w.a aVar = iVar2.Y1;
            if (aVar != null) {
                aVar.dispose();
                iVar2.Y1 = null;
            }
            Objects.requireNonNull(this.c);
            InstabugSDKLogger.d("InstabugDelegate", "Stopping Instabug SDK invocation listeners");
            InvocationManager.getInstance().sleep();
        } catch (Exception e) {
            InstabugSDKLogger.e("InstabugDelegate", e.getMessage(), e);
        }
    }
}
