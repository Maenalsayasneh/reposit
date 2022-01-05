package i0.j.b.o.b;

import com.instabug.library.util.InstabugSDKLogger;
import i0.j.b.o.b.h;
import k0.b.w.a;
import k0.b.y.d;

/* compiled from: ActivityViewInspector */
public final class c implements d<a> {
    public final /* synthetic */ h.a c;

    public c(h.a aVar) {
        this.c = aVar;
    }

    public void b(Object obj) throws Exception {
        a aVar = (a) obj;
        StringBuilder P0 = i0.d.a.a.a.P0("subscribe called, time in MS: ");
        P0.append(System.currentTimeMillis());
        InstabugSDKLogger.d("ActivityViewInspector", P0.toString());
        this.c.a++;
    }
}
