package h0.i.c;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import g0.a.b.b.a;
import h0.f.h;
import h0.i.f.l;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: TypefaceCompatApi24Impl */
public class g extends l {
    public static final Class<?> b;
    public static final Constructor<?> c;
    public static final Method d;
    public static final Method e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method2 = null;
            method = null;
        }
        c = constructor;
        b = cls;
        d = method;
        e = method2;
    }

    public static boolean f(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface g(Object obj) {
        try {
            Object newInstance = Array.newInstance(b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0068 A[LOOP:0: B:8:0x0015->B:39:0x0068, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface a(android.content.Context r17, h0.i.b.d.d r18, android.content.res.Resources r19, int r20) {
        /*
            r16 = this;
            r0 = 0
            r1 = 0
            java.lang.reflect.Constructor<?> r2 = c     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000b }
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000b }
            java.lang.Object r2 = r2.newInstance(r3)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000b }
            goto L_0x000c
        L_0x000b:
            r2 = r1
        L_0x000c:
            if (r2 != 0) goto L_0x000f
            return r1
        L_0x000f:
            r3 = r18
            h0.i.b.d.e[] r3 = r3.a
            int r4 = r3.length
            r5 = r0
        L_0x0015:
            if (r5 >= r4) goto L_0x0070
            r6 = r3[r5]
            int r0 = r6.f
            java.io.File r7 = g0.a.b.b.a.R(r17)
            r8 = r19
            if (r7 != 0) goto L_0x0024
            goto L_0x002d
        L_0x0024:
            boolean r0 = g0.a.b.b.a.u(r7, r8, r0)     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x002f
            r7.delete()
        L_0x002d:
            r0 = r1
            goto L_0x0058
        L_0x002f:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0054 }
            r9.<init>(r7)     // Catch:{ IOException -> 0x0054 }
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch:{ all -> 0x0048 }
            long r14 = r10.size()     // Catch:{ all -> 0x0048 }
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0048 }
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch:{ all -> 0x0048 }
            r9.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0055
        L_0x0048:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch:{ all -> 0x004e }
            goto L_0x0053
        L_0x004e:
            r0 = move-exception
            r9 = r0
            r10.addSuppressed(r9)     // Catch:{ IOException -> 0x0054 }
        L_0x0053:
            throw r10     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            r0 = r1
        L_0x0055:
            r7.delete()
        L_0x0058:
            if (r0 != 0) goto L_0x005b
            return r1
        L_0x005b:
            int r7 = r6.e
            int r9 = r6.b
            boolean r6 = r6.c
            boolean r0 = f(r2, r0, r7, r9, r6)
            if (r0 != 0) goto L_0x0068
            return r1
        L_0x0068:
            int r5 = r5 + 1
            goto L_0x0015
        L_0x006b:
            r0 = move-exception
            r7.delete()
            throw r0
        L_0x0070:
            android.graphics.Typeface r0 = g(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.i.c.g.a(android.content.Context, h0.i.b.d.d, android.content.res.Resources, int):android.graphics.Typeface");
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, l[] lVarArr, int i) {
        Object obj;
        try {
            obj = c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        h hVar = new h();
        for (l lVar : lVarArr) {
            Uri uri = lVar.a;
            ByteBuffer byteBuffer = (ByteBuffer) hVar.get(uri);
            if (byteBuffer == null) {
                byteBuffer = a.g0(context, cancellationSignal, uri);
                hVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !f(obj, byteBuffer, lVar.b, lVar.c, lVar.d)) {
                return null;
            }
        }
        Typeface g = g(obj);
        if (g == null) {
            return null;
        }
        return Typeface.create(g, i);
    }
}
