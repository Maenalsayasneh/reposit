package i0.h.a.b.c.m;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import i0.h.a.b.c.n.a;
import i0.h.a.b.c.n.b;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public class e {
    public static final Method a;
    public static final Method b;
    public static final Method c;
    public static final Method d;

    static {
        Method method;
        Method method2;
        Method method3;
        Class<String> cls = String.class;
        Process.myUid();
        Method method4 = null;
        try {
            method = WorkSource.class.getMethod("add", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            method = null;
        }
        a = method;
        try {
            method2 = WorkSource.class.getMethod("add", new Class[]{Integer.TYPE, cls});
        } catch (Exception unused2) {
            method2 = null;
        }
        b = method2;
        try {
            method3 = WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused3) {
            method3 = null;
        }
        c = method3;
        try {
            WorkSource.class.getMethod("get", new Class[]{Integer.TYPE});
        } catch (Exception unused4) {
        }
        try {
            method4 = WorkSource.class.getMethod("getName", new Class[]{Integer.TYPE});
        } catch (Exception unused5) {
        }
        d = method4;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{Integer.TYPE, cls});
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e2);
            }
        }
    }

    public static boolean a(@RecentlyNonNull Context context) {
        if (context == null || context.getPackageManager() == null) {
            return false;
        }
        a a2 = b.a(context);
        if (a2.a.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0) {
            return true;
        }
        return false;
    }
}
