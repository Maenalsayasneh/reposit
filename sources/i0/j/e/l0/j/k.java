package i0.j.e.l0.j;

import com.instabug.library.internal.orchestrator.Action;
import com.instabug.library.internal.storage.cache.user.UserCacheManager;

/* compiled from: UpdateLastSeenAction */
public class k implements Action {
    public final String a;
    public final long b;

    public k(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public void run() throws Exception {
        UserCacheManager.updateLastSeen(this.a, this.b);
    }
}
