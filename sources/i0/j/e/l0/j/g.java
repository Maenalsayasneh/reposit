package i0.j.e.l0.j;

import com.instabug.library.internal.orchestrator.Action;
import com.instabug.library.settings.SettingsManager;
import i0.j.e.c1.b;

/* compiled from: LogoutUserAction */
public class g implements Action {
    public void run() throws Exception {
        SettingsManager.getInstance().resetSessionCount();
        SettingsManager.getInstance().setUserLoggedOut(true);
        SettingsManager.getInstance().setUuid((String) null);
        SettingsManager.getInstance().setMD5Uuid((String) null);
        b.B("");
        b.D("");
        SettingsManager.getInstance().setShouldMakeUUIDMigrationRequest(false);
        b.f();
    }
}
