package i0.j.e.l0.j;

import com.instabug.library.internal.orchestrator.Action;
import com.instabug.library.internal.storage.cache.user.UserCacheManager;

/* compiled from: InsertUuidAction */
public class d implements Action {
    public final String a;
    public final int b;

    public d(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public void run() {
        UserCacheManager.insertIfNotExists(this.a, this.b);
    }
}
