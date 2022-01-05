package i0.h.a.b.h.f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import i0.h.a.b.c.d;

public class n {
    public static final String a = "n";
    @SuppressLint({"StaticFieldLeak"})
    public static Context b;
    public static o c;

    /* JADX WARNING: type inference failed for: r1v10, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static i0.h.a.b.h.f.o a(android.content.Context r3) throws com.google.android.gms.common.GooglePlayServicesNotAvailableException {
        /*
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r3, r0)
            i0.h.a.b.h.f.o r1 = c
            if (r1 == 0) goto L_0x000a
            return r1
        L_0x000a:
            r1 = 13400000(0xcc77c0, float:1.87774E-38)
            int r2 = i0.h.a.b.c.d.e
            int r1 = i0.h.a.b.c.e.a(r3, r1)
            if (r1 != 0) goto L_0x0083
            java.lang.String r1 = a
            java.lang.String r2 = "Making Creator dynamically"
            android.util.Log.i(r1, r2)
            android.content.Context r1 = c(r3)
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.String r2 = "com.google.android.gms.maps.internal.CreatorImpl"
            java.util.Objects.requireNonNull(r1, r0)     // Catch:{ ClassNotFoundException -> 0x006a }
            java.lang.Class r0 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x006a }
            java.lang.Object r0 = b(r0)     // Catch:{ ClassNotFoundException -> 0x006a }
            android.os.IBinder r0 = (android.os.IBinder) r0
            if (r0 != 0) goto L_0x0037
            r0 = 0
            goto L_0x004b
        L_0x0037:
            java.lang.String r1 = "com.google.android.gms.maps.internal.ICreator"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof i0.h.a.b.h.f.o
            if (r2 == 0) goto L_0x0045
            r0 = r1
            i0.h.a.b.h.f.o r0 = (i0.h.a.b.h.f.o) r0
            goto L_0x004b
        L_0x0045:
            i0.h.a.b.h.f.p r1 = new i0.h.a.b.h.f.p
            r1.<init>(r0)
            r0 = r1
        L_0x004b:
            c = r0
            android.content.Context r3 = c(r3)     // Catch:{ RemoteException -> 0x0063 }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ RemoteException -> 0x0063 }
            i0.h.a.b.d.d r1 = new i0.h.a.b.d.d     // Catch:{ RemoteException -> 0x0063 }
            r1.<init>(r3)     // Catch:{ RemoteException -> 0x0063 }
            r3 = 12451000(0xbdfcb8, float:1.7447567E-38)
            r0.b0(r1, r3)     // Catch:{ RemoteException -> 0x0063 }
            i0.h.a.b.h.f.o r3 = c
            return r3
        L_0x0063:
            r3 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r0 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r0.<init>(r3)
            throw r0
        L_0x006a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unable to find dynamic class "
            int r1 = r2.length()
            if (r1 == 0) goto L_0x0079
            java.lang.String r0 = r0.concat(r2)
            goto L_0x007f
        L_0x0079:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        L_0x007f:
            r3.<init>(r0)
            throw r3
        L_0x0083:
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r3 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException
            r3.<init>(r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.h.f.n.a(android.content.Context):i0.h.a.b.h.f.o");
    }

    public static <T> T b(Class<?> cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException unused) {
            String name = cls.getName();
            throw new IllegalStateException(name.length() != 0 ? "Unable to instantiate the dynamic class ".concat(name) : new String("Unable to instantiate the dynamic class "));
        } catch (IllegalAccessException unused2) {
            String name2 = cls.getName();
            throw new IllegalStateException(name2.length() != 0 ? "Unable to call the default constructor of ".concat(name2) : new String("Unable to call the default constructor of "));
        }
    }

    public static Context c(Context context) {
        Context context2;
        Context context3 = b;
        if (context3 != null) {
            return context3;
        }
        try {
            context2 = DynamiteModule.b(context, DynamiteModule.i, "com.google.android.gms.maps_dynamite").j;
        } catch (Exception e) {
            Log.e(a, "Failed to load maps module, use legacy", e);
            int i = d.e;
            try {
                context2 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
        }
        b = context2;
        return context2;
    }
}
