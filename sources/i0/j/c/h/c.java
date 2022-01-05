package i0.j.c.h;

import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.tracking.ActivityLifeCycleEvent;
import i0.j.c.h.a;
import k0.b.y.d;

/* compiled from: NotificationBarInvoker */
public class c implements d<ActivityLifeCycleEvent> {
    public final /* synthetic */ a c;

    public c(a aVar) {
        this.c = aVar;
    }

    public void b(Object obj) throws Exception {
        int i = a.b.a[((ActivityLifeCycleEvent) obj).ordinal()];
        if (i == 1) {
            a aVar = this.c;
            if (aVar.e != null && aVar.f != null && InstabugCore.getTargetActivity() != null && ChatsCacheManager.getUnreadCount() > 0) {
                aVar.a(InstabugCore.getTargetActivity(), aVar.e, aVar.f);
            }
        } else if (i == 2) {
            this.c.d(false);
        }
    }
}
