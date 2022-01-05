package i0.j.e.l0.j;

import com.instabug.library.internal.orchestrator.Action;
import com.instabug.library.internal.storage.cache.user.UserCacheManager;

/* compiled from: ArchiveSessionCountAction */
public class a implements Action {
    public final String a;
    public final int b;

    public a(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public void run() throws Exception {
        UserCacheManager.updateSessionCount(this.a, this.b);
    }
}
