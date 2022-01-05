package h0.i.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.util.TypedValue;
import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: ContextCompat */
public class a {
    private static final String TAG = "ContextCompat";
    private static final Object sLock = new Object();
    private static final Object sSync = new Object();
    private static TypedValue sTempValue;

    /* renamed from: h0.i.b.a$a  reason: collision with other inner class name */
    /* compiled from: ContextCompat */
    public static class C0040a {
        public static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        public static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* compiled from: ContextCompat */
    public static class b {
        public static File[] a(Context context) {
            return context.getExternalCacheDirs();
        }

        public static File[] b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        public static File[] c(Context context) {
            return context.getObbDirs();
        }
    }

    /* compiled from: ContextCompat */
    public static class c {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable b(Context context, int i) {
            return context.getDrawable(i);
        }

        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* compiled from: ContextCompat */
    public static class d {
        public static int a(Context context, int i) {
            return context.getColor(i);
        }

        public static ColorStateList b(Context context, int i) {
            return context.getColorStateList(i);
        }

        public static <T> T c(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        public static String d(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* compiled from: ContextCompat */
    public static class e {
        public static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        public static File b(Context context) {
            return context.getDataDir();
        }

        public static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* compiled from: ContextCompat */
    public static class f {
        public static ComponentName a(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* compiled from: ContextCompat */
    public static class g {
        public static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* compiled from: ContextCompat */
    public static class h {
        public static String a(Context context) {
            return context.getAttributionTag();
        }
    }

    public static int checkSelfPermission(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        return e.a(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.io.File createFilesDir(java.io.File r4) {
        /*
            java.lang.Object r0 = sSync
            monitor-enter(r0)
            boolean r1 = r4.exists()     // Catch:{ all -> 0x002d }
            if (r1 != 0) goto L_0x002b
            boolean r1 = r4.mkdirs()     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return r4
        L_0x0011:
            java.lang.String r1 = "ContextCompat"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x002d }
            r2.<init>()     // Catch:{ all -> 0x002d }
            java.lang.String r3 = "Unable to create files subdir "
            r2.append(r3)     // Catch:{ all -> 0x002d }
            java.lang.String r3 = r4.getPath()     // Catch:{ all -> 0x002d }
            r2.append(r3)     // Catch:{ all -> 0x002d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x002d }
            android.util.Log.w(r1, r2)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return r4
        L_0x002d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.i.b.a.createFilesDir(java.io.File):java.io.File");
    }

    public static String getAttributionTag(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return h.a(context);
        }
        return null;
    }

    public static File getCodeCacheDir(Context context) {
        return c.a(context);
    }

    public static int getColor(Context context, int i) {
        return d.a(context, i);
    }

    public static ColorStateList getColorStateList(Context context, int i) {
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = h0.i.b.d.h.a;
        return resources.getColorStateList(i, theme);
    }

    public static File getDataDir(Context context) {
        return e.b(context);
    }

    public static Drawable getDrawable(Context context, int i) {
        return c.b(context, i);
    }

    public static File[] getExternalCacheDirs(Context context) {
        return b.a(context);
    }

    public static File[] getExternalFilesDirs(Context context, String str) {
        return b.b(context, str);
    }

    public static Executor getMainExecutor(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return g.a(context);
        }
        return new h0.i.e.b(new Handler(context.getMainLooper()));
    }

    public static File getNoBackupFilesDir(Context context) {
        return c.c(context);
    }

    public static File[] getObbDirs(Context context) {
        return b.c(context);
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        return d.c(context, cls);
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        return d.d(context, cls);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        return e.c(context);
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, (Bundle) null);
    }

    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        C0040a.b(context, intent, bundle);
    }

    public static void startForegroundService(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            f.a(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        C0040a.a(context, intentArr, bundle);
        return true;
    }
}
