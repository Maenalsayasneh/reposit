package i0.j.e.l0.j;

import com.instabug.library.internal.orchestrator.Action;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.internal.storage.cache.user.UserCacheManager;

/* compiled from: InvalidateCacheForIdentifyingUserAction */
public class e implements Action {
    public final String a;

    public e(String str) {
        this.a = str;
    }

    public void run() throws Exception {
        CacheManager.getInstance().invalidateAllCachesForIdentifyingUsers();
        UserCacheManager.updateLastSeen(this.a, 0);
    }
}
