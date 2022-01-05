package i0.h.a.d.a.b;

import android.content.Context;
import com.google.android.play.core.assetpacks.bv;
import i0.h.a.d.a.e.f;
import i0.h.a.d.a.e.z;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public final class y {
    public static final f a = new f("AssetPackStorage");
    public final Context b;
    public final a2 c;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        timeUnit.toMillis(14);
        timeUnit.toMillis(28);
    }

    public y(Context context, a2 a2Var) {
        this.b = context;
        this.c = a2Var;
    }

    public static void b(File file) {
        if (file.listFiles() != null && file.listFiles().length > 1) {
            long c2 = c(file, false);
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals(String.valueOf(c2)) && !file2.getName().equals("stale.tmp")) {
                    g(file2);
                }
            }
        }
    }

    public static long c(File file, boolean z) {
        if (!file.exists()) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        if (z && file.listFiles().length > 1) {
            a.b(5, "Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e) {
            a.a(e, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    public static boolean g(File file) {
        boolean z;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z = true;
            for (File g : listFiles) {
                z &= g(g);
            }
        } else {
            z = true;
        }
        return file.delete() && true == z;
    }

    public final File a(String str) {
        return new File(f(), str);
    }

    public final List<File> d() {
        ArrayList arrayList = new ArrayList();
        try {
            if (f().exists()) {
                if (f().listFiles() != null) {
                    for (File file : f().listFiles()) {
                        if (!file.getCanonicalPath().equals(new File(f(), "_tmp").getCanonicalPath())) {
                            arrayList.add(file);
                        }
                    }
                    return arrayList;
                }
            }
            return arrayList;
        } catch (IOException e) {
            a.b(6, "Could not process directory while scanning installed packs. %s", new Object[]{e});
        }
    }

    public final File e(String str, int i, long j) {
        return new File(new File(new File(new File(f(), "_tmp"), str), String.valueOf(i)), String.valueOf(j));
    }

    public final File f() {
        return new File(this.b.getFilesDir(), "assetpacks");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0095 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0096  */
    @android.support.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i0.h.a.d.a.b.a h(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r8.f()
            r0.<init>(r1, r9)
            boolean r1 = r0.exists()
            r2 = 3
            r3 = 6
            r4 = 1
            r5 = 0
            r6 = 0
            if (r1 != 0) goto L_0x0022
            i0.h.a.d.a.e.f r0 = a
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r5] = r9
            java.lang.String r9 = "Pack not found with pack name: %s"
            r0.b(r2, r9, r1)
        L_0x001f:
            r9 = r6
            goto L_0x0093
        L_0x0022:
            java.io.File r1 = new java.io.File
            i0.h.a.d.a.b.a2 r7 = r8.c
            int r7 = r7.a()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r1.<init>(r0, r7)
            boolean r0 = r1.exists()
            r7 = 2
            if (r0 != 0) goto L_0x0050
            i0.h.a.d.a.e.f r0 = a
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r5] = r9
            i0.h.a.d.a.b.a2 r9 = r8.c
            int r9 = r9.a()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r1[r4] = r9
            java.lang.String r9 = "Pack not found with pack name: %s app version: %s"
            r0.b(r2, r9, r1)
            goto L_0x001f
        L_0x0050:
            java.io.File[] r0 = r1.listFiles()
            if (r0 == 0) goto L_0x007b
            int r1 = r0.length
            if (r1 != 0) goto L_0x005a
            goto L_0x007b
        L_0x005a:
            if (r1 <= r4) goto L_0x0074
            i0.h.a.d.a.e.f r0 = a
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r5] = r9
            i0.h.a.d.a.b.a2 r9 = r8.c
            int r9 = r9.a()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r1[r4] = r9
            java.lang.String r9 = "Multiple pack versions found for pack name: %s app version: %s"
            r0.b(r3, r9, r1)
            goto L_0x001f
        L_0x0074:
            r9 = r0[r5]
            java.lang.String r9 = r9.getCanonicalPath()
            goto L_0x0093
        L_0x007b:
            i0.h.a.d.a.e.f r0 = a
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r5] = r9
            i0.h.a.d.a.b.a2 r9 = r8.c
            int r9 = r9.a()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r1[r4] = r9
            java.lang.String r9 = "No pack version found for pack name: %s app version: %s"
            r0.b(r2, r9, r1)
            goto L_0x001f
        L_0x0093:
            if (r9 != 0) goto L_0x0096
            return r6
        L_0x0096:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "assets"
            r0.<init>(r9, r1)
            boolean r1 = r0.isDirectory()
            if (r1 != 0) goto L_0x00af
            i0.h.a.d.a.e.f r9 = a
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r5] = r0
            java.lang.String r0 = "Failed to find assets directory: %s"
            r9.b(r3, r0, r1)
            return r6
        L_0x00af:
            java.lang.String r0 = r0.getCanonicalPath()
            i0.h.a.d.a.b.c0 r1 = new i0.h.a.d.a.b.c0
            r1.<init>(r5, r9, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.d.a.b.y.h(java.lang.String):i0.h.a.d.a.b.a");
    }

    public final File i(String str, int i, long j) {
        return new File(new File(a(str), String.valueOf(i)), String.valueOf(j));
    }

    public final File j(String str, int i, long j, String str2) {
        return new File(new File(new File(e(str, i, j), "_slices"), "_unverified"), str2);
    }

    public final File k(String str, int i, long j, String str2) {
        return new File(new File(new File(e(str, i, j), "_slices"), "_verified"), str2);
    }

    public final File l(String str, int i, long j) {
        return new File(e(str, i, j), "_packs");
    }

    public final int m(String str, int i, long j) throws IOException {
        File file = new File(l(str, i, j), "merge.tmp");
        if (!file.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    return Integer.parseInt(properties.getProperty("numberOfMerges"));
                } catch (NumberFormatException e) {
                    throw new bv("Merge checkpoint file corrupt.", (Exception) e);
                }
            } else {
                throw new bv("Merge checkpoint file corrupt.");
            }
        } catch (Throwable th) {
            z.a.a(th, th);
        }
        throw th;
    }

    public final void n(String str, int i, long j, int i2) throws IOException {
        File file = new File(l(str, i, j), "merge.tmp");
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i2));
        file.getParentFile().mkdirs();
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    public final File o(String str, int i, long j, String str2) {
        return new File(p(str, i, j, str2), "checkpoint.dat");
    }

    public final File p(String str, int i, long j, String str2) {
        return new File(new File(new File(e(str, i, j), "_slices"), "_metadata"), str2);
    }

    public final long q(String str) {
        return c(new File(a(str), String.valueOf((int) c(a(str), true))), true);
    }
}
