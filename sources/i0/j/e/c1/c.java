package i0.j.e.c1;

import com.instabug.library.internal.storage.cache.db.InstabugDBInsertionListener;
import com.instabug.library.internal.storage.cache.user.UserCacheManager;

/* compiled from: UserManager */
public final class c implements Runnable {
    public final /* synthetic */ String c;
    public final /* synthetic */ InstabugDBInsertionListener d;

    public c(String str, InstabugDBInsertionListener instabugDBInsertionListener) {
        this.c = str;
        this.d = instabugDBInsertionListener;
    }

    public void run() {
        UserCacheManager.insertIfNotExists(this.c, b.A());
        InstabugDBInsertionListener instabugDBInsertionListener = this.d;
        if (instabugDBInsertionListener != null) {
            instabugDBInsertionListener.onDataInserted(this.c);
        }
    }
}
