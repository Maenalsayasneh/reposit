package i0.j.e;

import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.ui.onboarding.WelcomeMessage;

/* compiled from: InstabugDelegate */
public class h implements Runnable {
    public final /* synthetic */ i c;

    public h(i iVar) {
        this.c = iVar;
    }

    public void run() {
        if (SettingsManager.getInstance().getWelcomeMessageState() != WelcomeMessage.State.DISABLED && InvocationManager.getInstance().getCurrentInstabugInvocationEvents().length > 0 && this.c.n() && SettingsManager.getInstance().shouldAutoShowOnboarding()) {
            this.c.e(SettingsManager.getInstance().getWelcomeMessageState());
        }
    }
}
