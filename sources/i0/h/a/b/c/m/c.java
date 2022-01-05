package i0.h.a.b.c.m;

import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public class c {
    public static String a;
    public static int b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049 A[SYNTHETIC, Splitter:B:18:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050 A[SYNTHETIC, Splitter:B:26:0x0050] */
    @androidx.annotation.RecentlyNullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a() {
        /*
            java.lang.String r0 = a
            if (r0 != 0) goto L_0x0055
            int r0 = b
            if (r0 != 0) goto L_0x000e
            int r0 = android.os.Process.myPid()
            b = r0
        L_0x000e:
            int r0 = b
            r1 = 0
            if (r0 > 0) goto L_0x0014
            goto L_0x0053
        L_0x0014:
            r2 = 25
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004d, all -> 0x0046 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x004d, all -> 0x0046 }
            java.lang.String r2 = "/proc/"
            r3.append(r2)     // Catch:{ IOException -> 0x004d, all -> 0x0046 }
            r3.append(r0)     // Catch:{ IOException -> 0x004d, all -> 0x0046 }
            java.lang.String r0 = "/cmdline"
            r3.append(r0)     // Catch:{ IOException -> 0x004d, all -> 0x0046 }
            java.lang.String r0 = r3.toString()     // Catch:{ IOException -> 0x004d, all -> 0x0046 }
            java.io.BufferedReader r0 = b(r0)     // Catch:{ IOException -> 0x004d, all -> 0x0046 }
            java.lang.String r2 = r0.readLine()     // Catch:{ IOException -> 0x004e, all -> 0x0041 }
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r2, r3)     // Catch:{ IOException -> 0x004e, all -> 0x0041 }
            java.lang.String r1 = r2.trim()     // Catch:{ IOException -> 0x004e, all -> 0x0041 }
            r0.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0053
        L_0x0041:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x0047
        L_0x0046:
            r0 = move-exception
        L_0x0047:
            if (r1 == 0) goto L_0x004c
            r1.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            throw r0
        L_0x004d:
            r0 = r1
        L_0x004e:
            if (r0 == 0) goto L_0x0053
            r0.close()     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            a = r1
        L_0x0055:
            java.lang.String r0 = a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.c.m.c.a():java.lang.String");
    }

    public static BufferedReader b(String str) throws IOException {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
