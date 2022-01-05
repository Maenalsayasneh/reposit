package com.instabug.library.util;

import io.reactivex.plugins.RxJavaPlugins;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import k0.b.l;
import k0.b.z.e.c.h;

public class DiskUtils {
    public static final String TAG = "DiskUtils";

    public static class a implements Callable<List<File>> {
        public final /* synthetic */ File c;

        public a(File file) {
            this.c = file;
        }

        public Object call() throws Exception {
            File[] listFiles;
            ArrayList arrayList = new ArrayList();
            if (this.c.exists() && this.c.isDirectory() && (listFiles = this.c.listFiles()) != null) {
                for (File file : listFiles) {
                    if (!file.delete()) {
                        arrayList.add(file);
                    }
                }
            }
            return arrayList;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void copy(java.io.File r2, java.io.OutputStream r3) throws java.io.IOException {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0014 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0014 }
            copy((java.io.InputStream) r1, (java.io.OutputStream) r3)     // Catch:{ FileNotFoundException -> 0x0010, all -> 0x000d }
            r1.close()
            goto L_0x0020
        L_0x000d:
            r2 = move-exception
            r0 = r1
            goto L_0x0021
        L_0x0010:
            r0 = r1
            goto L_0x0014
        L_0x0012:
            r2 = move-exception
            goto L_0x0021
        L_0x0014:
            java.lang.String r2 = "DiskUtils"
            java.lang.String r3 = "FileNotFoundException: can not copy file to another stream"
            com.instabug.library.util.InstabugSDKLogger.e(r2, r3)     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0020
            r0.close()
        L_0x0020:
            return
        L_0x0021:
            if (r0 == 0) goto L_0x0026
            r0.close()
        L_0x0026:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.util.DiskUtils.copy(java.io.File, java.io.OutputStream):void");
    }

    public static l<List<File>> getCleanDirectoryObservable(File file) {
        return RxJavaPlugins.onAssembly(new h(new a(file))).v(k0.b.d0.a.b());
    }

    public static ArrayList<File> listFilesInDirectory(File file) {
        File[] listFiles = file.listFiles();
        Collection arrayList = new ArrayList();
        if (listFiles != null) {
            arrayList = Arrays.asList(listFiles);
            StringBuilder P0 = i0.d.a.a.a.P0("listing ");
            P0.append(listFiles.length);
            P0.append(" files ... at Directory name: ");
            P0.append(file.getName());
            P0.append("Directory path: ");
            P0.append(file.getPath());
            P0.append(", time in MS:");
            P0.append(System.currentTimeMillis());
            InstabugSDKLogger.addVerboseLog("DiskUtils", P0.toString());
        }
        return new ArrayList<>(arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e5 A[SYNTHETIC, Splitter:B:29:0x00e5] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f3 A[SYNTHETIC, Splitter:B:39:0x00f3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized android.net.Uri zipFiles(android.content.Context r5, java.lang.String r6, java.util.ArrayList<java.io.File> r7) {
        /*
            java.lang.Class<com.instabug.library.util.DiskUtils> r0 = com.instabug.library.util.DiskUtils.class
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fc }
            r1.<init>()     // Catch:{ all -> 0x00fc }
            java.lang.String r2 = "zipping "
            r1.append(r2)     // Catch:{ all -> 0x00fc }
            int r2 = r7.size()     // Catch:{ all -> 0x00fc }
            r1.append(r2)     // Catch:{ all -> 0x00fc }
            java.lang.String r2 = " files ... , time in MS:"
            r1.append(r2)     // Catch:{ all -> 0x00fc }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00fc }
            r1.append(r2)     // Catch:{ all -> 0x00fc }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00fc }
            java.lang.String r2 = "DiskUtils"
            com.instabug.library.util.InstabugSDKLogger.v(r2, r1)     // Catch:{ all -> 0x00fc }
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x00bd, all -> 0x00bb }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00bd, all -> 0x00bb }
            r3.<init>()     // Catch:{ IOException -> 0x00bd, all -> 0x00bb }
            java.io.File r5 = com.instabug.library.internal.storage.AttachmentManager.getAttachmentDirectory(r5)     // Catch:{ IOException -> 0x00bd, all -> 0x00bb }
            r3.append(r5)     // Catch:{ IOException -> 0x00bd, all -> 0x00bb }
            java.lang.String r5 = java.io.File.separator     // Catch:{ IOException -> 0x00bd, all -> 0x00bb }
            r3.append(r5)     // Catch:{ IOException -> 0x00bd, all -> 0x00bb }
            r3.append(r6)     // Catch:{ IOException -> 0x00bd, all -> 0x00bb }
            java.lang.String r5 = "_"
            r3.append(r5)     // Catch:{ IOException -> 0x00bd, all -> 0x00bb }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x00bd, all -> 0x00bb }
            r3.append(r5)     // Catch:{ IOException -> 0x00bd, all -> 0x00bb }
            java.lang.String r5 = ".zip"
            r3.append(r5)     // Catch:{ IOException -> 0x00bd, all -> 0x00bb }
            java.lang.String r5 = r3.toString()     // Catch:{ IOException -> 0x00bd, all -> 0x00bb }
            r2.<init>(r5)     // Catch:{ IOException -> 0x00bd, all -> 0x00bb }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00bd, all -> 0x00bb }
            r5.<init>(r2)     // Catch:{ IOException -> 0x00bd, all -> 0x00bb }
            java.util.zip.ZipOutputStream r6 = new java.util.zip.ZipOutputStream     // Catch:{ IOException -> 0x00bd, all -> 0x00bb }
            r6.<init>(r5)     // Catch:{ IOException -> 0x00bd, all -> 0x00bb }
            java.util.Iterator r5 = r7.iterator()     // Catch:{ IOException -> 0x00b9 }
        L_0x0066:
            boolean r7 = r5.hasNext()     // Catch:{ IOException -> 0x00b9 }
            if (r7 == 0) goto L_0x0087
            java.lang.Object r7 = r5.next()     // Catch:{ IOException -> 0x00b9 }
            java.io.File r7 = (java.io.File) r7     // Catch:{ IOException -> 0x00b9 }
            if (r7 == 0) goto L_0x0066
            java.util.zip.ZipEntry r3 = new java.util.zip.ZipEntry     // Catch:{ IOException -> 0x00b9 }
            java.lang.String r4 = r7.getName()     // Catch:{ IOException -> 0x00b9 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x00b9 }
            r6.putNextEntry(r3)     // Catch:{ IOException -> 0x00b9 }
            copy((java.io.File) r7, (java.io.OutputStream) r6)     // Catch:{ IOException -> 0x00b9 }
            r6.closeEntry()     // Catch:{ IOException -> 0x00b9 }
            goto L_0x0066
        L_0x0087:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00b9 }
            r5.<init>()     // Catch:{ IOException -> 0x00b9 }
            java.lang.String r7 = "zipping files have been finished successfully, path: "
            r5.append(r7)     // Catch:{ IOException -> 0x00b9 }
            java.lang.String r7 = r2.getPath()     // Catch:{ IOException -> 0x00b9 }
            r5.append(r7)     // Catch:{ IOException -> 0x00b9 }
            java.lang.String r7 = ", time in MS: "
            r5.append(r7)     // Catch:{ IOException -> 0x00b9 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x00b9 }
            r5.append(r3)     // Catch:{ IOException -> 0x00b9 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x00b9 }
            com.instabug.library.util.InstabugSDKLogger.v(r0, r5)     // Catch:{ IOException -> 0x00b9 }
            android.net.Uri r5 = android.net.Uri.fromFile(r2)     // Catch:{ IOException -> 0x00b9 }
            r6.close()     // Catch:{ IOException -> 0x00b3 }
            goto L_0x00b7
        L_0x00b3:
            r6 = move-exception
            r6.printStackTrace()     // Catch:{ all -> 0x00fc }
        L_0x00b7:
            monitor-exit(r0)
            return r5
        L_0x00b9:
            r5 = move-exception
            goto L_0x00bf
        L_0x00bb:
            r5 = move-exception
            goto L_0x00f1
        L_0x00bd:
            r5 = move-exception
            r6 = r1
        L_0x00bf:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ef }
            r7.<init>()     // Catch:{ all -> 0x00ef }
            java.lang.String r2 = "zipping files went wrong: "
            r7.append(r2)     // Catch:{ all -> 0x00ef }
            java.lang.String r2 = r5.getMessage()     // Catch:{ all -> 0x00ef }
            r7.append(r2)     // Catch:{ all -> 0x00ef }
            java.lang.String r2 = ", time in MS: "
            r7.append(r2)     // Catch:{ all -> 0x00ef }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ef }
            r7.append(r2)     // Catch:{ all -> 0x00ef }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00ef }
            com.instabug.library.util.InstabugSDKLogger.e(r0, r7, r5)     // Catch:{ all -> 0x00ef }
            if (r6 == 0) goto L_0x00ed
            r6.close()     // Catch:{ IOException -> 0x00e9 }
            goto L_0x00ed
        L_0x00e9:
            r5 = move-exception
            r5.printStackTrace()     // Catch:{ all -> 0x00fc }
        L_0x00ed:
            monitor-exit(r0)
            return r1
        L_0x00ef:
            r5 = move-exception
            r1 = r6
        L_0x00f1:
            if (r1 == 0) goto L_0x00fb
            r1.close()     // Catch:{ IOException -> 0x00f7 }
            goto L_0x00fb
        L_0x00f7:
            r6 = move-exception
            r6.printStackTrace()     // Catch:{ all -> 0x00fc }
        L_0x00fb:
            throw r5     // Catch:{ all -> 0x00fc }
        L_0x00fc:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.util.DiskUtils.zipFiles(android.content.Context, java.lang.String, java.util.ArrayList):android.net.Uri");
    }

    private static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[2048];
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }
}
