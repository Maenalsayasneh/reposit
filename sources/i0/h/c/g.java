package i0.h.c;

import android.content.Context;
import com.google.firebase.FirebaseCommonRegistrar;

/* compiled from: FirebaseCommonRegistrar */
public final /* synthetic */ class g implements i0.h.c.u.g {
    public static final g a = new g();

    public String a(Object obj) {
        Context context = (Context) obj;
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
    }
}
