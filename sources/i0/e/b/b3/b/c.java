package i0.e.b.b3.b;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.shared.auth.UserManager;
import com.clubhouse.android.shared.preferences.DeviceSharedPreferences;
import com.clubhouse.android.shared.preferences.Key;
import com.clubhouse.android.user.model.UserSelf;
import com.instabug.library.model.NetworkLog;
import com.instabug.library.networkv2.request.Header;
import i0.e.b.f3.k.b;
import i0.j.f.p.h;
import java.util.Objects;
import java.util.regex.Pattern;
import m0.n.b.i;
import q0.b0;
import q0.e0;
import q0.h0.h.g;
import q0.x;

/* compiled from: ClubhouseInterceptor.kt */
public final class c implements x {
    public final String a;
    public final i0.e.b.f3.i.c b;
    public final DeviceSharedPreferences c;
    public final UserManager d;

    public c(String str, i0.e.b.f3.i.c cVar, DeviceSharedPreferences deviceSharedPreferences, UserManager userManager) {
        i.e(str, "userAgent");
        i.e(cVar, "userStore");
        i.e(deviceSharedPreferences, "devicePreferences");
        i.e(userManager, "userManager");
        this.a = str;
        this.b = cVar;
        this.c = deviceSharedPreferences;
        this.d = userManager;
    }

    public e0 intercept(x.a aVar) {
        UserSelf userSelf;
        i.e(aVar, "chain");
        g gVar = (g) aVar;
        b0 b0Var = gVar.f;
        Objects.requireNonNull(b0Var);
        b0.a aVar2 = new b0.a(b0Var);
        aVar2.a("Accept", NetworkLog.JSON);
        aVar2.a("User-Agent", this.a);
        aVar2.a("CH-AppBuild", "4734");
        aVar2.a("CH-AppVersion", "1.0.8");
        aVar2.a("CH-DeviceId", (String) this.c.e.getValue());
        aVar2.a("CH-DeviceMfr", this.c.f);
        aVar2.a("CH-DeviceModel", this.c.g);
        aVar2.a("CH-Locale", this.c.b);
        aVar2.a("CH-Languages", this.c.c);
        String str = this.c.d;
        i.e(str, "<this>");
        i.e("[^A-Za-z _-]", "pattern");
        Pattern compile = Pattern.compile("[^A-Za-z _-]");
        i.d(compile, "Pattern.compile(pattern)");
        i.e(compile, "nativePattern");
        i.e(str, "input");
        i.e("", "replacement");
        String replaceAll = compile.matcher(str).replaceAll("");
        i.d(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        aVar2.a("CH-Keyboards", replaceAll);
        String str2 = this.c.h;
        if (str2 != null) {
            aVar2.a("CH-Session-Id", str2);
        }
        i0.e.b.f3.i.c cVar = this.b;
        synchronized (cVar) {
            if (cVar.b == null) {
                b bVar = cVar.a;
                Objects.requireNonNull(bVar);
                cVar.b = bVar.l(Key.LOGGED_IN_USER);
            }
            userSelf = cVar.b;
            if (userSelf == null) {
                userSelf = cVar.a();
            }
        }
        if (userSelf != null) {
            aVar2.a("CH-UserID", String.valueOf(userSelf.a));
            aVar2.a(Header.AUTHORIZATION, i.k("Token ", userSelf.e.b));
        }
        e0 a2 = gVar.a(aVar2.b());
        if (a2.y == 401) {
            UserManager userManager = this.d;
            Throwable th = new Throwable(a2.x);
            Objects.requireNonNull(userManager);
            i.e(th, "throwable");
            ((AmplitudeAnalytics) userManager.c).a("Signup-LoginFailed");
            userManager.d(h.l0(th));
        }
        return a2;
    }
}
