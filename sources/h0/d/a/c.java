package h0.d.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import g0.a.a.b;

/* compiled from: CustomTabsClient */
public class c {
    public final b a;
    public final ComponentName b;

    public c(b bVar, ComponentName componentName, Context context) {
        this.a = bVar;
        this.b = componentName;
    }

    public static boolean a(Context context, String str, d dVar) {
        dVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, dVar, 33);
    }
}
