package i0.h.a.b.e;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public final class b implements DynamiteModule.a.b {
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0057=Splitter:B:23:0x0057, B:18:0x003a=Splitter:B:18:0x003a, B:38:0x009a=Splitter:B:38:0x009a} */
    public final int a(android.content.Context r9, java.lang.String r10, boolean r11) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r8 = this;
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x010a }
            java.lang.Boolean r1 = com.google.android.gms.dynamite.DynamiteModule.a     // Catch:{ all -> 0x0107 }
            if (r1 != 0) goto L_0x00d4
            android.content.Context r1 = r9.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00af, IllegalAccessException -> 0x00ad, NoSuchFieldException -> 0x00ab }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00af, IllegalAccessException -> 0x00ad, NoSuchFieldException -> 0x00ab }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException -> 0x00af, IllegalAccessException -> 0x00ad, NoSuchFieldException -> 0x00ab }
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x00af, IllegalAccessException -> 0x00ad, NoSuchFieldException -> 0x00ab }
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException -> 0x00af, IllegalAccessException -> 0x00ad, NoSuchFieldException -> 0x00ab }
            java.lang.Class r2 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00af, IllegalAccessException -> 0x00ad, NoSuchFieldException -> 0x00ab }
            monitor-enter(r2)     // Catch:{ ClassNotFoundException -> 0x00af, IllegalAccessException -> 0x00ad, NoSuchFieldException -> 0x00ab }
            r3 = 0
            java.lang.Object r4 = r1.get(r3)     // Catch:{ all -> 0x00a8 }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x003d
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a8 }
            if (r4 != r1) goto L_0x0037
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00a8 }
            goto L_0x00a6
        L_0x0037:
            com.google.android.gms.dynamite.DynamiteModule.f(r4)     // Catch:{ LoadingException -> 0x003a }
        L_0x003a:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00a8 }
            goto L_0x00a6
        L_0x003d:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r9.getApplicationContext()     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x00a8 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x0057
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a8 }
            r1.set(r3, r4)     // Catch:{ all -> 0x00a8 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00a8 }
            goto L_0x00a6
        L_0x0057:
            int r4 = com.google.android.gms.dynamite.DynamiteModule.j(r9, r10, r11)     // Catch:{ LoadingException -> 0x009d }
            java.lang.String r5 = com.google.android.gms.dynamite.DynamiteModule.d     // Catch:{ LoadingException -> 0x009d }
            if (r5 == 0) goto L_0x009a
            boolean r5 = r5.isEmpty()     // Catch:{ LoadingException -> 0x009d }
            if (r5 == 0) goto L_0x0066
            goto L_0x009a
        L_0x0066:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ LoadingException -> 0x009d }
            r6 = 29
            if (r5 < r6) goto L_0x007d
            dalvik.system.DelegateLastClassLoader r5 = new dalvik.system.DelegateLastClassLoader     // Catch:{ LoadingException -> 0x009d }
            java.lang.String r6 = com.google.android.gms.dynamite.DynamiteModule.d     // Catch:{ LoadingException -> 0x009d }
            java.lang.String r7 = "null reference"
            java.util.Objects.requireNonNull(r6, r7)     // Catch:{ LoadingException -> 0x009d }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x009d }
            r5.<init>(r6, r7)     // Catch:{ LoadingException -> 0x009d }
            goto L_0x008d
        L_0x007d:
            i0.h.a.b.e.c r5 = new i0.h.a.b.e.c     // Catch:{ LoadingException -> 0x009d }
            java.lang.String r6 = com.google.android.gms.dynamite.DynamiteModule.d     // Catch:{ LoadingException -> 0x009d }
            java.lang.String r7 = "null reference"
            java.util.Objects.requireNonNull(r6, r7)     // Catch:{ LoadingException -> 0x009d }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x009d }
            r5.<init>(r6, r7)     // Catch:{ LoadingException -> 0x009d }
        L_0x008d:
            com.google.android.gms.dynamite.DynamiteModule.f(r5)     // Catch:{ LoadingException -> 0x009d }
            r1.set(r3, r5)     // Catch:{ LoadingException -> 0x009d }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ LoadingException -> 0x009d }
            com.google.android.gms.dynamite.DynamiteModule.a = r5     // Catch:{ LoadingException -> 0x009d }
            monitor-exit(r2)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r0)     // Catch:{ all -> 0x0107 }
            goto L_0x0106
        L_0x009a:
            monitor-exit(r2)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r0)     // Catch:{ all -> 0x0107 }
            goto L_0x0106
        L_0x009d:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a8 }
            r1.set(r3, r4)     // Catch:{ all -> 0x00a8 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00a8 }
        L_0x00a6:
            monitor-exit(r2)     // Catch:{ all -> 0x00a8 }
            goto L_0x00d2
        L_0x00a8:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00a8 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00af, IllegalAccessException -> 0x00ad, NoSuchFieldException -> 0x00ab }
        L_0x00ab:
            r1 = move-exception
            goto L_0x00b0
        L_0x00ad:
            r1 = move-exception
            goto L_0x00b0
        L_0x00af:
            r1 = move-exception
        L_0x00b0:
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0107 }
            int r3 = r1.length()     // Catch:{ all -> 0x0107 }
            int r3 = r3 + 30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0107 }
            r4.<init>(r3)     // Catch:{ all -> 0x0107 }
            java.lang.String r3 = "Failed to load module via V2: "
            r4.append(r3)     // Catch:{ all -> 0x0107 }
            r4.append(r1)     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0107 }
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x0107 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0107 }
        L_0x00d2:
            com.google.android.gms.dynamite.DynamiteModule.a = r1     // Catch:{ all -> 0x0107 }
        L_0x00d4:
            monitor-exit(r0)     // Catch:{ all -> 0x0107 }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x010a }
            if (r0 == 0) goto L_0x0102
            int r4 = com.google.android.gms.dynamite.DynamiteModule.j(r9, r10, r11)     // Catch:{ LoadingException -> 0x00e0 }
            goto L_0x0106
        L_0x00e0:
            r10 = move-exception
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x010a }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x010a }
            int r1 = r10.length()     // Catch:{ all -> 0x010a }
            if (r1 == 0) goto L_0x00f8
            java.lang.String r10 = r0.concat(r10)     // Catch:{ all -> 0x010a }
            goto L_0x00fd
        L_0x00f8:
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x010a }
            r10.<init>(r0)     // Catch:{ all -> 0x010a }
        L_0x00fd:
            android.util.Log.w(r11, r10)     // Catch:{ all -> 0x010a }
            r4 = 0
            goto L_0x0106
        L_0x0102:
            int r4 = com.google.android.gms.dynamite.DynamiteModule.h(r9, r10, r11)     // Catch:{ all -> 0x010a }
        L_0x0106:
            return r4
        L_0x0107:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0107 }
            throw r10     // Catch:{ all -> 0x010a }
        L_0x010a:
            r10 = move-exception
            java.lang.String r11 = "null reference"
            java.util.Objects.requireNonNull(r9, r11)     // Catch:{ Exception -> 0x0111 }
            goto L_0x0119
        L_0x0111:
            r9 = move-exception
            java.lang.String r11 = "CrashUtils"
            java.lang.String r0 = "Error adding exception to DropBox!"
            android.util.Log.e(r11, r0, r9)
        L_0x0119:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.e.b.a(android.content.Context, java.lang.String, boolean):int");
    }

    public final int b(Context context, String str) {
        return DynamiteModule.a(context, str);
    }
}
