package i0.h.a.d.a.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import i0.h.a.d.a.c.a;
import i0.h.a.d.a.e.f;
import i0.h.a.d.a.e.j0;
import i0.h.a.d.a.e.p;
import i0.h.a.d.a.e.q;

public final class n {
    public static final f a = new f("AppUpdateService");
    public static final Intent b = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    @Nullable
    public p<j0> c;
    public final String d;
    public final Context e;
    public final p f;

    public n(Context context, p pVar) {
        this.d = context.getPackageName();
        this.e = context;
        this.f = pVar;
        if (q.a(context)) {
            Context applicationContext = context.getApplicationContext();
            this.c = new p(applicationContext != null ? applicationContext : context, a, "AppUpdateService", b, k.a);
        }
    }

    public static Bundle a(n nVar, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putAll(a.a("app_update"));
        bundle2.putInt("playcore.version.code", 10900);
        bundle.putAll(bundle2);
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(nVar.e.getPackageManager().getPackageInfo(nVar.e.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            a.b(6, "The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }
}
