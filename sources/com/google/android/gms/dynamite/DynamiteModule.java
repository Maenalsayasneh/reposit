package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.util.DynamiteApi;
import h0.b0.v;
import i0.h.a.b.e.d;
import i0.h.a.b.e.e;
import i0.h.a.b.e.f;
import i0.h.a.b.e.g;
import i0.h.a.b.e.h;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public final class DynamiteModule {
    public static Boolean a = null;
    public static f b = null;
    public static h c = null;
    public static String d = null;
    public static int e = -1;
    public static final ThreadLocal<b> f = new ThreadLocal<>();
    public static final ThreadLocal<Long> g = new i0.h.a.b.e.a();
    public static final a.b h = new i0.h.a.b.e.b();
    @RecentlyNonNull
    public static final a i = new d();
    public final Context j;

    @DynamiteApi
    /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
    public static class DynamiteLoaderClassLoader {
        @RecentlyNullable
        public static ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
    public static class LoadingException extends Exception {
        public LoadingException(String str, i0.h.a.b.e.a aVar) {
            super(str);
        }

        public LoadingException(String str, Throwable th, i0.h.a.b.e.a aVar) {
            super(str, th);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
    public interface a {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
        public static class C0090a {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }

        /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
        public interface b {
            int a(Context context, String str, boolean z) throws LoadingException;

            int b(Context context, String str);
        }

        C0090a a(Context context, String str, b bVar) throws LoadingException;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
    public static class b {
        public Cursor a;

        public b() {
        }

        public b(i0.h.a.b.e.a aVar) {
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
    public static class c implements a.b {
        public final int a;

        public c(int i) {
            this.a = i;
        }

        public final int a(Context context, String str, boolean z) {
            return 0;
        }

        public final int b(Context context, String str) {
            return this.a;
        }
    }

    public DynamiteModule(Context context) {
        Objects.requireNonNull(context, "null reference");
        this.j = context;
    }

    public static int a(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (v.c0(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    @RecentlyNonNull
    public static DynamiteModule b(@RecentlyNonNull Context context, @RecentlyNonNull a aVar, @RecentlyNonNull String str) throws LoadingException {
        a.C0090a a2;
        Context context2 = context;
        a aVar2 = aVar;
        String str2 = str;
        ThreadLocal<b> threadLocal = f;
        b bVar = threadLocal.get();
        b bVar2 = new b((i0.h.a.b.e.a) null);
        threadLocal.set(bVar2);
        ThreadLocal<Long> threadLocal2 = g;
        long longValue = threadLocal2.get().longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            a2 = aVar2.a(context2, str2, h);
            int i2 = a2.a;
            int i3 = a2.b;
            StringBuilder sb = new StringBuilder(str.length() + 68 + str.length());
            sb.append("Considering local module ");
            sb.append(str2);
            sb.append(":");
            sb.append(i2);
            sb.append(" and remote module ");
            sb.append(str2);
            sb.append(":");
            sb.append(i3);
            Log.i("DynamiteModule", sb.toString());
            int i4 = a2.c;
            if (i4 == 0 || ((i4 == -1 && a2.a == 0) || (i4 == 1 && a2.b == 0))) {
                int i5 = a2.a;
                int i6 = a2.b;
                StringBuilder sb2 = new StringBuilder(91);
                sb2.append("No acceptable module found. Local version is ");
                sb2.append(i5);
                sb2.append(" and remote version is ");
                sb2.append(i6);
                sb2.append(".");
                throw new LoadingException(sb2.toString(), (i0.h.a.b.e.a) null);
            } else if (i4 == -1) {
                DynamiteModule c2 = c(context2, str2);
                if (longValue == 0) {
                    threadLocal2.remove();
                } else {
                    threadLocal2.set(Long.valueOf(longValue));
                }
                Cursor cursor = bVar2.a;
                if (cursor != null) {
                    cursor.close();
                }
                threadLocal.set(bVar);
                return c2;
            } else if (i4 == 1) {
                DynamiteModule d2 = d(context2, str2, a2.b);
                if (longValue == 0) {
                    threadLocal2.remove();
                } else {
                    threadLocal2.set(Long.valueOf(longValue));
                }
                Cursor cursor2 = bVar2.a;
                if (cursor2 != null) {
                    cursor2.close();
                }
                threadLocal.set(bVar);
                return d2;
            } else {
                int i7 = a2.c;
                StringBuilder sb3 = new StringBuilder(47);
                sb3.append("VersionPolicy returned invalid code:");
                sb3.append(i7);
                throw new LoadingException(sb3.toString(), (i0.h.a.b.e.a) null);
            }
        } catch (LoadingException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to load remote module: ".concat(valueOf) : new String("Failed to load remote module: "));
            int i8 = a2.a;
            if (i8 == 0 || aVar2.a(context2, str2, new c(i8)).c != -1) {
                throw new LoadingException("Remote load failed. No local fallback found.", e2, (i0.h.a.b.e.a) null);
            }
            DynamiteModule c3 = c(context2, str2);
            if (longValue == 0) {
                g.remove();
            } else {
                g.set(Long.valueOf(longValue));
            }
            Cursor cursor3 = bVar2.a;
            if (cursor3 != null) {
                cursor3.close();
            }
            f.set(bVar);
            return c3;
        } catch (Throwable th) {
            if (longValue == 0) {
                g.remove();
            } else {
                g.set(Long.valueOf(longValue));
            }
            Cursor cursor4 = bVar2.a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f.set(bVar);
            throw th;
        }
    }

    public static DynamiteModule c(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    public static DynamiteModule d(Context context, String str, int i2) throws LoadingException {
        Boolean bool;
        i0.h.a.b.d.b bVar;
        try {
            synchronized (DynamiteModule.class) {
                bool = a;
            }
            if (bool == null) {
                throw new LoadingException("Failed to determine which loading route to use.", (i0.h.a.b.e.a) null);
            } else if (bool.booleanValue()) {
                return i(context, str, i2);
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
                sb.append("Selected remote version of ");
                sb.append(str);
                sb.append(", version >= ");
                sb.append(i2);
                Log.i("DynamiteModule", sb.toString());
                f e2 = e(context);
                if (e2 != null) {
                    int d2 = e2.d();
                    if (d2 >= 3) {
                        b bVar2 = f.get();
                        if (bVar2 != null) {
                            bVar = e2.j(new i0.h.a.b.d.d(context), str, i2, new i0.h.a.b.d.d(bVar2.a));
                        } else {
                            throw new LoadingException("No cached result cursor holder", (i0.h.a.b.e.a) null);
                        }
                    } else if (d2 == 2) {
                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                        bVar = e2.P(new i0.h.a.b.d.d(context), str, i2);
                    } else {
                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                        bVar = e2.A(new i0.h.a.b.d.d(context), str, i2);
                    }
                    if (i0.h.a.b.d.d.j0(bVar) != null) {
                        return new DynamiteModule((Context) i0.h.a.b.d.d.j0(bVar));
                    }
                    throw new LoadingException("Failed to load remote module.", (i0.h.a.b.e.a) null);
                }
                throw new LoadingException("Failed to create IDynamiteLoader.", (i0.h.a.b.e.a) null);
            }
        } catch (RemoteException e3) {
            throw new LoadingException("Failed to load remote module.", e3, (i0.h.a.b.e.a) null);
        } catch (LoadingException e4) {
            throw e4;
        } catch (Throwable th) {
            try {
                Objects.requireNonNull(context, "null reference");
            } catch (Exception e5) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e5);
            }
            throw new LoadingException("Failed to load remote module.", th, (i0.h.a.b.e.a) null);
        }
    }

    public static f e(Context context) {
        f fVar;
        synchronized (DynamiteModule.class) {
            f fVar2 = b;
            if (fVar2 != null) {
                return fVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    fVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof f) {
                        fVar = (f) queryLocalInterface;
                    } else {
                        fVar = new e(iBinder);
                    }
                }
                if (fVar != null) {
                    b = fVar;
                    return fVar;
                }
            } catch (Exception e2) {
                String valueOf = String.valueOf(e2.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
        }
        return null;
    }

    public static void f(ClassLoader classLoader) throws LoadingException {
        h hVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                hVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof h) {
                    hVar = (h) queryLocalInterface;
                } else {
                    hVar = new g(iBinder);
                }
            }
            c = hVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new LoadingException("Failed to instantiate dynamite loader", e2, (i0.h.a.b.e.a) null);
        }
    }

    public static boolean g(Cursor cursor) {
        b bVar = f.get();
        if (bVar == null || bVar.a != null) {
            return false;
        }
        bVar.a = cursor;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0099 A[Catch:{ all -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x009e A[Catch:{ all -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int h(android.content.Context r9, java.lang.String r10, boolean r11) {
        /*
            java.lang.String r0 = "DynamiteModule"
            i0.h.a.b.e.f r1 = e(r9)
            r7 = 0
            if (r1 != 0) goto L_0x000a
            return r7
        L_0x000a:
            r8 = 0
            int r2 = r1.d()     // Catch:{ RemoteException -> 0x0088 }
            r3 = 3
            if (r2 < r3) goto L_0x0065
            i0.h.a.b.d.d r2 = new i0.h.a.b.d.d     // Catch:{ RemoteException -> 0x0063, all -> 0x0061 }
            r2.<init>(r9)     // Catch:{ RemoteException -> 0x0063, all -> 0x0061 }
            java.lang.ThreadLocal<java.lang.Long> r9 = g     // Catch:{ RemoteException -> 0x0088 }
            java.lang.Object r9 = r9.get()     // Catch:{ RemoteException -> 0x0088 }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ RemoteException -> 0x0088 }
            long r5 = r9.longValue()     // Catch:{ RemoteException -> 0x0088 }
            r3 = r10
            r4 = r11
            i0.h.a.b.d.b r9 = r1.X(r2, r3, r4, r5)     // Catch:{ RemoteException -> 0x0088 }
            java.lang.Object r9 = i0.h.a.b.d.d.j0(r9)     // Catch:{ RemoteException -> 0x0088 }
            android.database.Cursor r9 = (android.database.Cursor) r9     // Catch:{ RemoteException -> 0x0088 }
            if (r9 == 0) goto L_0x0052
            boolean r10 = r9.moveToFirst()     // Catch:{ RemoteException -> 0x004f, all -> 0x004c }
            if (r10 != 0) goto L_0x0038
            goto L_0x0052
        L_0x0038:
            int r10 = r9.getInt(r7)     // Catch:{ RemoteException -> 0x004f, all -> 0x004c }
            if (r10 <= 0) goto L_0x0045
            boolean r11 = g(r9)     // Catch:{ RemoteException -> 0x004f, all -> 0x004c }
            if (r11 == 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r8 = r9
        L_0x0046:
            if (r8 == 0) goto L_0x004b
            r8.close()
        L_0x004b:
            return r10
        L_0x004c:
            r10 = move-exception
            r8 = r9
            goto L_0x00ad
        L_0x004f:
            r10 = move-exception
            r8 = r9
            goto L_0x0089
        L_0x0052:
            java.lang.String r10 = "Failed to retrieve remote module version."
            android.util.Log.w(r0, r10)     // Catch:{ RemoteException -> 0x004f, all -> 0x004c }
            if (r9 == 0) goto L_0x005c
            r9.close()
        L_0x005c:
            return r7
        L_0x005d:
            r10 = r9
            goto L_0x00ad
        L_0x005f:
            r10 = r9
            goto L_0x0089
        L_0x0061:
            r9 = move-exception
            goto L_0x005d
        L_0x0063:
            r9 = move-exception
            goto L_0x005f
        L_0x0065:
            r3 = 2
            if (r2 != r3) goto L_0x0077
            java.lang.String r2 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r0, r2)     // Catch:{ RemoteException -> 0x0088 }
            i0.h.a.b.d.d r2 = new i0.h.a.b.d.d     // Catch:{ RemoteException -> 0x0063, all -> 0x0061 }
            r2.<init>(r9)     // Catch:{ RemoteException -> 0x0063, all -> 0x0061 }
            int r9 = r1.H(r2, r10, r11)     // Catch:{ RemoteException -> 0x0088 }
            return r9
        L_0x0077:
            java.lang.String r2 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r0, r2)     // Catch:{ RemoteException -> 0x0088 }
            i0.h.a.b.d.d r2 = new i0.h.a.b.d.d     // Catch:{ RemoteException -> 0x0063, all -> 0x0061 }
            r2.<init>(r9)     // Catch:{ RemoteException -> 0x0063, all -> 0x0061 }
            int r9 = r1.M(r2, r10, r11)     // Catch:{ RemoteException -> 0x0088 }
            return r9
        L_0x0086:
            r10 = move-exception
            goto L_0x00ad
        L_0x0088:
            r10 = move-exception
        L_0x0089:
            java.lang.String r9 = "Failed to retrieve remote module version: "
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x0086 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0086 }
            int r11 = r10.length()     // Catch:{ all -> 0x0086 }
            if (r11 == 0) goto L_0x009e
            java.lang.String r9 = r9.concat(r10)     // Catch:{ all -> 0x0086 }
            goto L_0x00a4
        L_0x009e:
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x0086 }
            r10.<init>(r9)     // Catch:{ all -> 0x0086 }
            r9 = r10
        L_0x00a4:
            android.util.Log.w(r0, r9)     // Catch:{ all -> 0x0086 }
            if (r8 == 0) goto L_0x00ac
            r8.close()
        L_0x00ac:
            return r7
        L_0x00ad:
            if (r8 == 0) goto L_0x00b2
            r8.close()
        L_0x00b2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.h(android.content.Context, java.lang.String, boolean):int");
    }

    public static DynamiteModule i(Context context, String str, int i2) throws LoadingException, RemoteException {
        h hVar;
        Boolean valueOf;
        i0.h.a.b.d.b bVar;
        Class<DynamiteModule> cls = DynamiteModule.class;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i2);
        Log.i("DynamiteModule", sb.toString());
        synchronized (cls) {
            hVar = c;
        }
        if (hVar != null) {
            b bVar2 = f.get();
            if (bVar2 == null || bVar2.a == null) {
                throw new LoadingException("No result cursor", (i0.h.a.b.e.a) null);
            }
            Context applicationContext = context.getApplicationContext();
            Cursor cursor = bVar2.a;
            new i0.h.a.b.d.d(null);
            synchronized (cls) {
                valueOf = Boolean.valueOf(e >= 2);
            }
            if (valueOf.booleanValue()) {
                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                bVar = hVar.p(new i0.h.a.b.d.d(applicationContext), str, i2, new i0.h.a.b.d.d(cursor));
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                bVar = hVar.j(new i0.h.a.b.d.d(applicationContext), str, i2, new i0.h.a.b.d.d(cursor));
            }
            Context context2 = (Context) i0.h.a.b.d.d.j0(bVar);
            if (context2 != null) {
                return new DynamiteModule(context2);
            }
            throw new LoadingException("Failed to get module context", (i0.h.a.b.e.a) null);
        }
        throw new LoadingException("DynamiteLoaderV2 was not cached.", (i0.h.a.b.e.a) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        if (g(r10) != false) goto L_0x007a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int j(android.content.Context r10, java.lang.String r11, boolean r12) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r0 = 0
            java.lang.ThreadLocal<java.lang.Long> r1 = g     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            if (r12 == 0) goto L_0x0016
            java.lang.String r10 = "api_force_staging"
            goto L_0x0018
        L_0x0016:
            java.lang.String r10 = "api"
        L_0x0018:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            r12.<init>()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x009a, all -> 0x0098 }
            if (r10 == 0) goto L_0x0080
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x0093, all -> 0x008f }
            if (r11 == 0) goto L_0x0080
            r11 = 0
            int r11 = r10.getInt(r11)     // Catch:{ Exception -> 0x0093, all -> 0x008f }
            if (r11 <= 0) goto L_0x0079
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r12 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r12)     // Catch:{ Exception -> 0x0093, all -> 0x008f }
            r1 = 2
            java.lang.String r1 = r10.getString(r1)     // Catch:{ all -> 0x0076 }
            d = r1     // Catch:{ all -> 0x0076 }
            java.lang.String r1 = "loaderVersion"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ all -> 0x0076 }
            if (r1 < 0) goto L_0x006e
            int r1 = r10.getInt(r1)     // Catch:{ all -> 0x0076 }
            e = r1     // Catch:{ all -> 0x0076 }
        L_0x006e:
            monitor-exit(r12)     // Catch:{ all -> 0x0076 }
            boolean r12 = g(r10)     // Catch:{ Exception -> 0x0093, all -> 0x008f }
            if (r12 == 0) goto L_0x0079
            goto L_0x007a
        L_0x0076:
            r11 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0076 }
            throw r11     // Catch:{ Exception -> 0x0093, all -> 0x008f }
        L_0x0079:
            r0 = r10
        L_0x007a:
            if (r0 == 0) goto L_0x007f
            r0.close()
        L_0x007f:
            return r11
        L_0x0080:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch:{ Exception -> 0x0093, all -> 0x008f }
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x0093, all -> 0x008f }
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x0093, all -> 0x008f }
            throw r11     // Catch:{ Exception -> 0x0093, all -> 0x008f }
        L_0x008f:
            r11 = move-exception
            r0 = r10
            r10 = r11
            goto L_0x00ab
        L_0x0093:
            r11 = move-exception
            r9 = r11
            r11 = r10
            r10 = r9
            goto L_0x009c
        L_0x0098:
            r10 = move-exception
            goto L_0x00ab
        L_0x009a:
            r10 = move-exception
            r11 = r0
        L_0x009c:
            boolean r12 = r10 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch:{ all -> 0x00a9 }
            if (r12 == 0) goto L_0x00a1
            throw r10     // Catch:{ all -> 0x00a9 }
        L_0x00a1:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r12 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x00a9 }
            java.lang.String r1 = "V2 version check failed"
            r12.<init>(r1, r10, r0)     // Catch:{ all -> 0x00a9 }
            throw r12     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r10 = move-exception
            r0 = r11
        L_0x00ab:
            if (r0 == 0) goto L_0x00b0
            r0.close()
        L_0x00b0:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.j(android.content.Context, java.lang.String, boolean):int");
    }
}
