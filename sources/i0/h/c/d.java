package i0.h.c;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import i0.h.c.u.g;

/* compiled from: FirebaseCommonRegistrar */
public final /* synthetic */ class d implements g {
    public static final d a = new d();

    public String a(Object obj) {
        ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }
}
