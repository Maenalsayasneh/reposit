package i0.j.e.v0.g.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.instabug.library.Instabug;
import com.instabug.library.network.Request;
import com.instabug.library.network.service.synclogs.SyncLogKeyProvider;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.TaskDebouncer;
import i0.j.e.l0.c.b;
import i0.j.e.q0.e;
import i0.j.e.t0.d;
import java.io.File;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: SyncLogFacade */
public class c implements Request.Callbacks<List<String>, Exception> {
    public static c a;
    public b b = b.c();
    public String c;
    public String d;
    public a e = new SyncLogKeyProvider();
    public e f;
    public TaskDebouncer g = new TaskDebouncer(TimeUnit.SECONDS.toMillis(1));

    public String a(String str) {
        StringBuilder sb = new StringBuilder();
        Objects.requireNonNull((SyncLogKeyProvider) this.e);
        sb.append(SyncLogKeyProvider.getNativeMatchingEmailPrefix());
        sb.append(str.toLowerCase());
        Objects.requireNonNull((SyncLogKeyProvider) this.e);
        sb.append(SyncLogKeyProvider.getNativeMatchingEmailSuffix());
        return i0.j.e.c1.b.c(sb.toString());
    }

    public boolean b() {
        d a2;
        Set<String> set;
        String str;
        String str2 = this.d;
        if ((str2 != null && a(str2) == null) || (a2 = this.b.a()) == null || (set = a2.Y1) == null || (str = this.d) == null || a(str) == null || !set.contains(a(this.d))) {
            return false;
        }
        return true;
    }

    public String c(String str) {
        StringBuilder sb = new StringBuilder();
        Objects.requireNonNull((SyncLogKeyProvider) this.e);
        sb.append(SyncLogKeyProvider.getNativeSyncingEmailPrefix());
        sb.append(str.toLowerCase());
        Objects.requireNonNull((SyncLogKeyProvider) this.e);
        sb.append(SyncLogKeyProvider.getNativeSyncingEmailSuffix());
        return i0.j.e.c1.b.c(sb.toString());
    }

    public boolean d() {
        d a2;
        Set<String> set;
        String str;
        String str2 = this.c;
        if ((str2 != null && e(str2) == null) || (a2 = this.b.a()) == null || (set = a2.Z1) == null || (str = this.c) == null || e(str) == null || !set.contains(e(this.c))) {
            return false;
        }
        return true;
    }

    public final String e(String str) {
        StringBuilder sb = new StringBuilder();
        Objects.requireNonNull((SyncLogKeyProvider) this.e);
        sb.append(SyncLogKeyProvider.getNativeMatchingUuidPrefix());
        sb.append(str.toLowerCase());
        Objects.requireNonNull((SyncLogKeyProvider) this.e);
        sb.append(SyncLogKeyProvider.getNativeMatchingUuidSuffix());
        return i0.j.e.c1.b.c(sb.toString());
    }

    public final String f(String str) {
        StringBuilder sb = new StringBuilder();
        Objects.requireNonNull((SyncLogKeyProvider) this.e);
        sb.append(SyncLogKeyProvider.getNativeSyncingUuidPrefix());
        sb.append(str.toLowerCase());
        Objects.requireNonNull((SyncLogKeyProvider) this.e);
        sb.append(SyncLogKeyProvider.getNativeSyncingUuidSuffix());
        return i0.j.e.c1.b.c(sb.toString());
    }

    public void onFailed(Object obj) {
        InstabugSDKLogger.e("b", "exception", (Exception) obj);
    }

    public void onSucceeded(Object obj) {
        List<String> list = (List) obj;
        Context applicationContext = Instabug.getApplicationContext();
        if (applicationContext != null) {
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences.Editor edit = applicationContext.getSharedPreferences(SettingsManager.INSTABUG_SHARED_PREF_NAME, 0).edit();
            edit.putLong("logs_last_uploaded_at", currentTimeMillis);
            edit.apply();
        }
        if (list != null) {
            for (String file : list) {
                File file2 = new File(file);
                if (!e.d(file2)) {
                    try {
                        if (!file2.delete()) {
                            InstabugSDKLogger.w(this, "couldn't delete disposable file (" + file2.getName() + ")");
                        }
                    } catch (Exception e2) {
                        InstabugSDKLogger.e(this, "couldn't delete disposable file", e2);
                    }
                }
            }
        }
    }
}
