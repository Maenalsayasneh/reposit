package i0.j.e.l0.j;

import com.instabug.library.internal.orchestrator.Action;
import com.instabug.library.settings.SettingsManager;

/* compiled from: LoginUserAction */
public class f implements Action {
    public final String a;

    public f(String str) {
        this.a = str;
    }

    public void run() throws Exception {
        SettingsManager.getInstance().setUserLoggedOut(false);
        SettingsManager.getInstance().setMD5Uuid(this.a);
    }
}
