package i0.j.a.e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.instabug.library.Feature;
import com.instabug.library.core.InstabugCore;
import i0.j.a.g.a;
import java.util.Collections;
import java.util.Set;

/* compiled from: APMConfigurationProviderImpl */
public class c implements b {
    public SharedPreferences a;
    public SharedPreferences.Editor b;
    public d c;

    @SuppressLint({"CommitPrefEdits"})
    public c() {
        SharedPreferences sharedPreferences;
        synchronized (a.class) {
            Context m = a.m();
            sharedPreferences = m != null ? m.getSharedPreferences("APM_SHARED_PREFERENCES", 0) : null;
        }
        this.a = sharedPreferences;
        this.c = new d();
        SharedPreferences sharedPreferences2 = this.a;
        if (sharedPreferences2 != null) {
            this.b = sharedPreferences2.edit();
        }
    }

    public boolean a() {
        Set<String> set;
        Feature feature = Feature.INSTABUG;
        if ((InstabugCore.isFeatureAvailable(feature) && InstabugCore.getFeatureState(feature) == Feature.State.ENABLED) && ((Boolean) this.c.a("IS_APM_SDK_ENABLED", Boolean.TRUE)).booleanValue() && m()) {
            String sDKVersion = InstabugCore.getSDKVersion();
            SharedPreferences sharedPreferences = this.a;
            if (sharedPreferences != null) {
                set = sharedPreferences.getStringSet("KEY_DISABLED_SDK_VERSIONS", Collections.emptySet());
            } else {
                set = Collections.emptySet();
            }
            if (!(set != null && set.contains(sDKVersion))) {
                return true;
            }
        }
        return false;
    }

    public boolean b() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("LAUNCHES_ENABLED", false);
        }
        return false;
    }

    public int c() {
        return ((Integer) this.c.a("LOG_LEVEL", 3)).intValue();
    }

    public long d() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null) {
            return sharedPreferences.getLong("NETWORK_LOGS_REQUEST_LIMIT", 500);
        }
        return 500;
    }

    public long e() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null) {
            return sharedPreferences.getLong("TRACES_PER_REQUEST_LIMIT", 500);
        }
        return 500;
    }

    public boolean f() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("UI_TRACE_ENABLED", false);
        }
        return false;
    }

    public boolean g() {
        return f() && ((Boolean) this.c.a("UI_TRACE_SDK_ENABLED", Boolean.TRUE)).booleanValue() && a();
    }

    public boolean h() {
        if (!a()) {
            return false;
        }
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null ? sharedPreferences.getBoolean("NETWORK_ENABLED", false) : false) {
            return true;
        }
        return false;
    }

    public long i() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null) {
            return sharedPreferences.getLong("NETWORK_LOGS_CACHE_LIMIT", 2500);
        }
        return 2500;
    }

    public boolean j() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null || !sharedPreferences.getBoolean("CRASH_DETECTION_ENABLED", false) || !a()) {
            return false;
        }
        return true;
    }

    public boolean k() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null || !sharedPreferences.getBoolean("TRACES_ENABLED", false) || !a()) {
            return false;
        }
        return true;
    }

    public boolean l() {
        return b() && ((Boolean) this.c.a("LAUNCHES_SDK_ENABLED", Boolean.TRUE)).booleanValue() && a();
    }

    public boolean m() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("IS_APM_FEATURE_AVAILABLE", false);
        }
        return false;
    }
}
