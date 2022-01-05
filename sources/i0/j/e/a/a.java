package i0.j.e.a;

import android.content.Context;
import com.instabug.library.Instabug;
import com.instabug.library.model.session.SessionState;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import i0.j.e.a.b;
import i0.j.e.a.d.c;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: AnalyticsLogger */
public class a implements Runnable {
    public final /* synthetic */ SessionState c;
    public final /* synthetic */ b.a d;

    public a(b.a aVar, SessionState sessionState) {
        this.d = aVar;
        this.c = sessionState;
    }

    public void run() {
        b bVar = b.this;
        SessionState sessionState = this.c;
        Objects.requireNonNull(bVar);
        long sessionStartedAt = SettingsManager.getInstance().getSessionStartedAt();
        if (sessionState == SessionState.FINISH) {
            i0.j.e.a.d.a.b(new ArrayList(bVar.b), sessionStartedAt);
            i0.j.e.a.d.a.b(bVar.a.values(), sessionStartedAt);
            bVar.b.clear();
            bVar.a.clear();
        }
        Context applicationContext = Instabug.getApplicationContext();
        if (applicationContext != null) {
            PoolProvider.postIOTask(new c(applicationContext));
        } else {
            InstabugSDKLogger.e("UploaderServiceLauncher", "Context is null.");
        }
    }
}
