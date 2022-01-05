package i0.j.f.l;

import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.survey.e.c.a;

/* compiled from: AnnouncementManager */
public class c implements Runnable {
    public final /* synthetic */ a c;
    public final /* synthetic */ g d;

    public c(g gVar, a aVar) {
        this.d = gVar;
        this.c = aVar;
    }

    public void run() {
        try {
            Thread.sleep((long) (this.c.a2.q.y.x * 1000));
            g.b(this.d, this.c);
        } catch (InterruptedException e) {
            InstabugSDKLogger.e(g.class.getAnnotations(), e.getMessage(), e);
        }
    }
}
