package i0.j.e.p0;

import com.instabug.library.util.InstabugSDKLogger;
import i0.j.e.p0.e.a;
import k0.b.y.d;

/* compiled from: InstaCapture */
public class c implements d<Throwable> {
    public final /* synthetic */ a c;
    public final /* synthetic */ d d;

    public c(d dVar, a aVar) {
        this.d = dVar;
        this.c = aVar;
    }

    public void b(Object obj) throws Exception {
        Throwable th = (Throwable) obj;
        InstabugSDKLogger.e(d.class, "Screenshot capture failed", th);
        a aVar = this.c;
        if (aVar != null) {
            aVar.b(th);
        }
        d.c(this.d, this.c);
        this.d.e();
    }
}
