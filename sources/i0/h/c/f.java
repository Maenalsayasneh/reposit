package i0.h.c;

import android.content.Context;
import android.os.Build;
import i0.h.c.u.g;

/* compiled from: FirebaseCommonRegistrar */
public final /* synthetic */ class f implements g {
    public static final f a = new f();

    public String a(Object obj) {
        Context context = (Context) obj;
        int i = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        return (i < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
    }
}
