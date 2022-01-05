package i0.j.f.o;

import com.instabug.library.Feature;
import com.instabug.library.core.InstabugCore;
import java.util.concurrent.TimeUnit;

/* compiled from: SurveysSettings */
public class c {
    public static final long a = TimeUnit.DAYS.toMillis(7);
    public static final /* synthetic */ int b = 0;

    public static String a() {
        if (b.b() == null) {
            return null;
        }
        return b.b().b.getString("survey_resolve_country_code", (String) null);
    }

    public static void b(String str) {
        if (b.b() != null) {
            b b2 = b.b();
            b2.c.putString("instabug_last_app_version", str);
            b2.c.apply();
        }
    }

    public static long c() {
        if (b.b() == null) {
            return -1;
        }
        return b.b().b.getLong("instabug_app_version_first_seen", -1);
    }

    public static String d() {
        if (b.b() == null) {
            return null;
        }
        return b.b().b.getString("instabug_last_app_version", (String) null);
    }

    public static boolean e() {
        boolean z;
        a a2 = a.a();
        Boolean bool = a2.i;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = a2.g;
        }
        return z && a.a().k;
    }

    public static boolean f() {
        return a.a().j && InstabugCore.isFeatureAvailable(Feature.VZ_MESSAGES_CUSTOM_APPRATING_UI);
    }
}
