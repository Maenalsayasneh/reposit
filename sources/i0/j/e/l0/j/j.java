package i0.j.e.l0.j;

import com.instabug.library.internal.orchestrator.Action;
import com.instabug.library.internal.storage.cache.user.UserCacheManager;
import com.instabug.library.settings.SettingsManager;

/* compiled from: MigrateUserSessionsCountAction */
public class j implements Action {
    public final String a;

    public j(String str) {
        this.a = str;
    }

    public void run() throws Exception {
        int userSessionCount = UserCacheManager.getUserSessionCount(this.a) + SettingsManager.getInstance().getSessionsCount();
        UserCacheManager.insertUser(this.a, userSessionCount);
        SettingsManager.getInstance().updateUserSessionCount(userSessionCount);
    }
}
