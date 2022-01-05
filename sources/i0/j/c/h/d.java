package i0.j.c.h;

import com.instabug.library.InstabugState;
import i0.j.c.h.l;

/* compiled from: NotificationBarInvoker */
public class d implements k0.b.y.d<InstabugState> {
    public final /* synthetic */ a c;

    public d(a aVar) {
        this.c = aVar;
    }

    public void b(Object obj) throws Exception {
        if (((InstabugState) obj) == InstabugState.DISABLED) {
            a aVar = this.c;
            aVar.e = null;
            aVar.d(true);
            ((l.b) this.c.f).a();
        }
    }
}
