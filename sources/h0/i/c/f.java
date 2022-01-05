package h0.i.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import g0.a.b.b.a;
import h0.i.b.d.d;
import h0.i.b.d.e;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: TypefaceCompatApi21Impl */
public class f extends l {
    public static Class<?> b = null;
    public static Constructor<?> c = null;
    public static Method d = null;
    public static Method e = null;
    public static boolean f = false;

    public static boolean f(Object obj, String str, int i, boolean z) {
        g();
        try {
            return ((Boolean) d.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void g() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f) {
            f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e2) {
                Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
                method2 = null;
                cls = null;
                method = null;
            }
            c = constructor;
            b = cls;
            d = method;
            e = method2;
        }
    }

    public Typeface a(Context context, d dVar, Resources resources, int i) {
        g();
        try {
            Object newInstance = c.newInstance(new Object[0]);
            e[] eVarArr = dVar.a;
            int length = eVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                e eVar = eVarArr[i2];
                File R = a.R(context);
                if (R == null) {
                    return null;
                }
                try {
                    if (!a.u(R, resources, eVar.f)) {
                        R.delete();
                        return null;
                    } else if (!f(newInstance, R.getPath(), eVar.b, eVar.c)) {
                        return null;
                    } else {
                        R.delete();
                        i2++;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    R.delete();
                }
            }
            g();
            try {
                Object newInstance2 = Array.newInstance(b, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) e.invoke((Object) null, new Object[]{newInstance2});
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055 A[SYNTHETIC, Splitter:B:18:0x0055] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface b(android.content.Context r4, android.os.CancellationSignal r5, h0.i.f.l[] r6, int r7) {
        /*
            r3 = this;
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L_0x0006
            return r1
        L_0x0006:
            h0.i.c.k r0 = new h0.i.c.k
            r0.<init>(r3)
            java.lang.Object r6 = h0.i.c.l.e(r6, r7, r0)
            h0.i.f.l r6 = (h0.i.f.l) r6
            android.content.ContentResolver r7 = r4.getContentResolver()
            android.net.Uri r6 = r6.a     // Catch:{ IOException -> 0x008b }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r7.openFileDescriptor(r6, r0, r5)     // Catch:{ IOException -> 0x008b }
            if (r5 != 0) goto L_0x0025
            if (r5 == 0) goto L_0x0024
            r5.close()     // Catch:{ IOException -> 0x008b }
        L_0x0024:
            return r1
        L_0x0025:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ErrnoException -> 0x0052 }
            r6.<init>()     // Catch:{ ErrnoException -> 0x0052 }
            java.lang.String r7 = "/proc/self/fd/"
            r6.append(r7)     // Catch:{ ErrnoException -> 0x0052 }
            int r7 = r5.getFd()     // Catch:{ ErrnoException -> 0x0052 }
            r6.append(r7)     // Catch:{ ErrnoException -> 0x0052 }
            java.lang.String r6 = r6.toString()     // Catch:{ ErrnoException -> 0x0052 }
            java.lang.String r6 = android.system.Os.readlink(r6)     // Catch:{ ErrnoException -> 0x0052 }
            android.system.StructStat r7 = android.system.Os.stat(r6)     // Catch:{ ErrnoException -> 0x0052 }
            int r7 = r7.st_mode     // Catch:{ ErrnoException -> 0x0052 }
            boolean r7 = android.system.OsConstants.S_ISREG(r7)     // Catch:{ ErrnoException -> 0x0052 }
            if (r7 == 0) goto L_0x0052
            java.io.File r7 = new java.io.File     // Catch:{ ErrnoException -> 0x0052 }
            r7.<init>(r6)     // Catch:{ ErrnoException -> 0x0052 }
            goto L_0x0053
        L_0x0050:
            r4 = move-exception
            goto L_0x0082
        L_0x0052:
            r7 = r1
        L_0x0053:
            if (r7 == 0) goto L_0x0064
            boolean r6 = r7.canRead()     // Catch:{ all -> 0x0050 }
            if (r6 != 0) goto L_0x005c
            goto L_0x0064
        L_0x005c:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r7)     // Catch:{ all -> 0x0050 }
            r5.close()     // Catch:{ IOException -> 0x008b }
            return r4
        L_0x0064:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x0050 }
            java.io.FileDescriptor r7 = r5.getFileDescriptor()     // Catch:{ all -> 0x0050 }
            r6.<init>(r7)     // Catch:{ all -> 0x0050 }
            android.graphics.Typeface r4 = r3.c(r4, r6)     // Catch:{ all -> 0x0078 }
            r6.close()     // Catch:{ all -> 0x0050 }
            r5.close()     // Catch:{ IOException -> 0x008b }
            return r4
        L_0x0078:
            r4 = move-exception
            r6.close()     // Catch:{ all -> 0x007d }
            goto L_0x0081
        L_0x007d:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch:{ all -> 0x0050 }
        L_0x0081:
            throw r4     // Catch:{ all -> 0x0050 }
        L_0x0082:
            r5.close()     // Catch:{ all -> 0x0086 }
            goto L_0x008a
        L_0x0086:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch:{ IOException -> 0x008b }
        L_0x008a:
            throw r4     // Catch:{ IOException -> 0x008b }
        L_0x008b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.i.c.f.b(android.content.Context, android.os.CancellationSignal, h0.i.f.l[], int):android.graphics.Typeface");
    }
}
