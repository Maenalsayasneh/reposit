package i0.j.e;

import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.Objects;
import k0.b.b0.a;

/* compiled from: SessionManager */
public class e0 extends a {
    public final /* synthetic */ i0 d;

    public e0(i0 i0Var) {
        this.d = i0Var;
    }

    public void onComplete() {
        Objects.requireNonNull(this.d);
        SettingsManager.getInstance().setIsFirstSession(false);
    }

    public void onError(Throwable th) {
        InstabugSDKLogger.e("SessionManager", th.getClass().getSimpleName(), th);
    }
}
