package i0.j.e.r0;

import com.instabug.library.internal.utils.PreferencesUtils;
import com.instabug.library.model.session.config.SessionsConfig;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.TimeUtils;
import i0.j.e.l0.e.a;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: SessionsSyncManager */
public class r {
    public SessionsConfig a;
    public final a b;
    public final PreferencesUtils c;
    public final e d;
    public final k e;
    public final a f;

    public r(SessionsConfig sessionsConfig, a aVar, PreferencesUtils preferencesUtils, e eVar, k kVar, a aVar2) {
        this.a = sessionsConfig;
        this.b = aVar;
        this.c = preferencesUtils;
        this.d = eVar;
        this.e = kVar;
        this.f = aVar2;
    }

    public static void a(r rVar, String str) {
        Objects.requireNonNull(rVar);
        InstabugSDKLogger.i("SessionsSyncManager", str);
    }

    public final long b() {
        return TimeUnit.MILLISECONDS.toMinutes(TimeUtils.currentTimeMillis() - this.c.getLong("key_last_batch_synced_at"));
    }
}
