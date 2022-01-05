package i0.j.f.l;

import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.survey.e.c.a;
import java.util.Objects;

/* compiled from: AnnouncementManager */
public class d implements Runnable {
    public final /* synthetic */ g c;

    public d(g gVar) {
        this.c = gVar;
    }

    public void run() {
        try {
            Objects.requireNonNull(this.c);
            Thread.sleep((long) 5000);
            a a = this.c.e().a();
            if (a != null) {
                g.b(this.c, a);
            }
        } catch (InterruptedException e) {
            InstabugSDKLogger.e(g.class.getAnnotations(), e.getMessage(), e);
        }
    }
}
