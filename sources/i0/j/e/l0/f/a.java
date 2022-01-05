package i0.j.e.l0.f;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

@SuppressFBWarnings({"DMI_HARDCODED_ABSOLUTE_FILENAME"})
/* compiled from: InstabugRootChecker */
public class a {
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a() {
        /*
            java.lang.String r0 = android.os.Build.TAGS
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            java.lang.String r3 = "test-keys"
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0010
            r0 = r1
            goto L_0x0011
        L_0x0010:
            r0 = r2
        L_0x0011:
            if (r0 != 0) goto L_0x00b2
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x001f }
            java.lang.String r3 = "/system/app/Superuser.apk"
            r0.<init>(r3)     // Catch:{ Exception -> 0x001f }
            boolean r0 = r0.exists()     // Catch:{ Exception -> 0x001f }
            goto L_0x0020
        L_0x001f:
            r0 = r2
        L_0x0020:
            if (r0 != 0) goto L_0x00b2
            java.lang.Class<i0.j.e.l0.f.a> r0 = i0.j.e.l0.f.a.class
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r5 = "/system/xbin/which"
            java.lang.String r6 = "su"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}     // Catch:{ Exception -> 0x00a0 }
            java.lang.Process r4 = r4.exec(r5)     // Catch:{ Exception -> 0x00a0 }
            java.io.BufferedReader r5 = new java.io.BufferedReader
            java.io.InputStreamReader r6 = new java.io.InputStreamReader
            java.io.InputStream r7 = r4.getInputStream()
            java.lang.String r8 = "UTF-8"
            java.nio.charset.Charset r8 = java.nio.charset.Charset.forName(r8)
            r6.<init>(r7, r8)
            r5.<init>(r6)
        L_0x004d:
            java.lang.String r6 = r5.readLine()     // Catch:{ Exception -> 0x0076 }
            if (r6 == 0) goto L_0x006b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0076 }
            r7.<init>()     // Catch:{ Exception -> 0x0076 }
            java.lang.String r8 = "SHELL --> Line received: "
            r7.append(r8)     // Catch:{ Exception -> 0x0076 }
            r7.append(r6)     // Catch:{ Exception -> 0x0076 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0076 }
            com.instabug.library.util.InstabugSDKLogger.addVerboseLog(r0, r7)     // Catch:{ Exception -> 0x0076 }
            r3.add(r6)     // Catch:{ Exception -> 0x0076 }
            goto L_0x004d
        L_0x006b:
            r4.destroy()
            r5.close()     // Catch:{ IOException -> 0x0072 }
            goto L_0x0084
        L_0x0072:
            r4 = move-exception
            goto L_0x0081
        L_0x0074:
            r0 = move-exception
            goto L_0x00a2
        L_0x0076:
            r6 = move-exception
            r6.printStackTrace()     // Catch:{ all -> 0x0074 }
            r4.destroy()
            r5.close()     // Catch:{ IOException -> 0x0072 }
            goto L_0x0084
        L_0x0081:
            r4.printStackTrace()
        L_0x0084:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "SHELL --> Full response was: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.instabug.library.util.InstabugSDKLogger.addVerboseLog(r0, r4)
            int r0 = r3.size()
            if (r0 == 0) goto L_0x00a0
            r0 = r1
            goto L_0x00ae
        L_0x00a0:
            r0 = r2
            goto L_0x00ae
        L_0x00a2:
            r4.destroy()
            r5.close()     // Catch:{ IOException -> 0x00a9 }
            goto L_0x00ad
        L_0x00a9:
            r1 = move-exception
            r1.printStackTrace()
        L_0x00ad:
            throw r0
        L_0x00ae:
            if (r0 == 0) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r1 = r2
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.e.l0.f.a.a():boolean");
    }
}
