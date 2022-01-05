package com.instabug.bug.screenshot.viewhierarchy.utilities;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import com.instabug.library.internal.storage.DiskUtils;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import i0.j.b.o.b.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ViewHierarchyDiskUtils {
    private static final String TAG = "ViewHierarchyDiskUtils";

    private static void copy(File file, OutputStream outputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            copy((InputStream) fileInputStream, outputStream);
        } finally {
            fileInputStream.close();
        }
    }

    public static File getViewHierarchyImagesDirectory(Context context) {
        File file = new File(DiskUtils.getInstabugDirectory(context) + "/view-hierarchy-images/");
        if (!file.exists() && file.mkdir()) {
            StringBuilder P0 = a.P0("temp directory created successfully: ");
            P0.append(file.getPath());
            P0.append(", time in MS: ");
            P0.append(System.currentTimeMillis());
            InstabugSDKLogger.d(TAG, P0.toString());
        }
        return file;
    }

    public static void saveViewHierarchyImage(i iVar) {
        View view = iVar.n;
        if (view != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getViewHierarchyImagesDirectory(view.getContext()).getAbsolutePath());
            sb.append(File.separator);
            File file = new File(a.y0(sb, iVar.a, ".png"));
            try {
                Bitmap bitmap = iVar.j;
                if (bitmap != null) {
                    DiskUtils.saveBitmapOnDisk(bitmap, file);
                    iVar.k = Uri.fromFile(file);
                    return;
                }
                InstabugSDKLogger.d(TAG, "trying to save a null value bitmap, time in MS: " + System.currentTimeMillis());
            } catch (IOException e) {
                StringBuilder P0 = a.P0("save viewHierarchy image got error: ");
                P0.append(e.getMessage());
                P0.append(", time in MS: ");
                P0.append(System.currentTimeMillis());
                InstabugSDKLogger.e(TAG, P0.toString(), e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0156, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x014a A[SYNTHETIC, Splitter:B:51:0x014a] */
    @android.annotation.SuppressLint({"RESOURCE_LEAK"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized android.net.Uri zipViewHierarchyImages(i0.j.b.o.b.i r9) {
        /*
            java.lang.Class<com.instabug.bug.screenshot.viewhierarchy.utilities.ViewHierarchyDiskUtils> r0 = com.instabug.bug.screenshot.viewhierarchy.utilities.ViewHierarchyDiskUtils.class
            monitor-enter(r0)
            android.view.View r1 = r9.n     // Catch:{ all -> 0x0153 }
            r2 = 0
            if (r1 == 0) goto L_0x0155
            android.content.Context r3 = r1.getContext()     // Catch:{ all -> 0x0153 }
            if (r3 == 0) goto L_0x0155
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0153 }
            r3.<init>()     // Catch:{ all -> 0x0153 }
            java.lang.String r4 = "zip viewHierarchy images just started, time in MS: "
            r3.append(r4)     // Catch:{ all -> 0x0153 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0153 }
            r3.append(r4)     // Catch:{ all -> 0x0153 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0153 }
            java.lang.String r4 = "ViewHierarchyDiskUtils"
            com.instabug.library.util.InstabugSDKLogger.d(r4, r3)     // Catch:{ all -> 0x0153 }
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x0112, all -> 0x0110 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0112, all -> 0x0110 }
            r4.<init>()     // Catch:{ IOException -> 0x0112, all -> 0x0110 }
            android.content.Context r1 = r1.getContext()     // Catch:{ IOException -> 0x0112, all -> 0x0110 }
            java.io.File r1 = com.instabug.library.internal.storage.DiskUtils.getInstabugDirectory(r1)     // Catch:{ IOException -> 0x0112, all -> 0x0110 }
            r4.append(r1)     // Catch:{ IOException -> 0x0112, all -> 0x0110 }
            java.lang.String r1 = java.io.File.separator     // Catch:{ IOException -> 0x0112, all -> 0x0110 }
            r4.append(r1)     // Catch:{ IOException -> 0x0112, all -> 0x0110 }
            java.lang.String r1 = "view_hierarchy_attachment_"
            r4.append(r1)     // Catch:{ IOException -> 0x0112, all -> 0x0110 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0112, all -> 0x0110 }
            r4.append(r5)     // Catch:{ IOException -> 0x0112, all -> 0x0110 }
            java.lang.String r1 = ".zip"
            r4.append(r1)     // Catch:{ IOException -> 0x0112, all -> 0x0110 }
            java.lang.String r1 = r4.toString()     // Catch:{ IOException -> 0x0112, all -> 0x0110 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0112, all -> 0x0110 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0112, all -> 0x0110 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0112, all -> 0x0110 }
            java.util.zip.ZipOutputStream r4 = new java.util.zip.ZipOutputStream     // Catch:{ IOException -> 0x0112, all -> 0x0110 }
            r4.<init>(r1)     // Catch:{ IOException -> 0x0112, all -> 0x0110 }
            java.util.List r9 = i0.h.a.b.c.m.b.o(r9)     // Catch:{ IOException -> 0x00da }
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch:{ IOException -> 0x00da }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ IOException -> 0x00da }
        L_0x006b:
            boolean r1 = r9.hasNext()     // Catch:{ IOException -> 0x00da }
            if (r1 == 0) goto L_0x00dc
            java.lang.Object r1 = r9.next()     // Catch:{ IOException -> 0x00da }
            i0.j.b.o.b.i r1 = (i0.j.b.o.b.i) r1     // Catch:{ IOException -> 0x00da }
            android.net.Uri r5 = r1.k     // Catch:{ IOException -> 0x00da }
            if (r5 == 0) goto L_0x006b
            java.lang.String r5 = r5.getPath()     // Catch:{ IOException -> 0x00da }
            if (r5 == 0) goto L_0x006b
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x00da }
            android.net.Uri r6 = r1.k     // Catch:{ IOException -> 0x00da }
            java.lang.String r6 = r6.getPath()     // Catch:{ IOException -> 0x00da }
            r5.<init>(r6)     // Catch:{ IOException -> 0x00da }
            java.util.zip.ZipEntry r6 = new java.util.zip.ZipEntry     // Catch:{ IOException -> 0x00da }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00da }
            r7.<init>()     // Catch:{ IOException -> 0x00da }
            java.lang.String r1 = r1.a     // Catch:{ IOException -> 0x00da }
            r7.append(r1)     // Catch:{ IOException -> 0x00da }
            java.lang.String r1 = ".png"
            r7.append(r1)     // Catch:{ IOException -> 0x00da }
            java.lang.String r1 = r7.toString()     // Catch:{ IOException -> 0x00da }
            r6.<init>(r1)     // Catch:{ IOException -> 0x00da }
            r4.putNextEntry(r6)     // Catch:{ IOException -> 0x00da }
            copy((java.io.File) r5, (java.io.OutputStream) r4)     // Catch:{ IOException -> 0x00da }
            r4.closeEntry()     // Catch:{ IOException -> 0x00da }
            boolean r1 = r5.delete()     // Catch:{ IOException -> 0x00da }
            if (r1 == 0) goto L_0x006b
            java.lang.String r1 = "ViewHierarchyDiskUtils"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00da }
            r6.<init>()     // Catch:{ IOException -> 0x00da }
            java.lang.String r7 = "file zipped successfully, path: "
            r6.append(r7)     // Catch:{ IOException -> 0x00da }
            java.lang.String r5 = r5.getPath()     // Catch:{ IOException -> 0x00da }
            r6.append(r5)     // Catch:{ IOException -> 0x00da }
            java.lang.String r5 = ", time in MS: "
            r6.append(r5)     // Catch:{ IOException -> 0x00da }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x00da }
            r6.append(r7)     // Catch:{ IOException -> 0x00da }
            java.lang.String r5 = r6.toString()     // Catch:{ IOException -> 0x00da }
            com.instabug.library.util.InstabugSDKLogger.d(r1, r5)     // Catch:{ IOException -> 0x00da }
            goto L_0x006b
        L_0x00da:
            r9 = move-exception
            goto L_0x0114
        L_0x00dc:
            java.lang.String r9 = "ViewHierarchyDiskUtils"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00da }
            r1.<init>()     // Catch:{ IOException -> 0x00da }
            java.lang.String r5 = "zip viewHierarchy images done successfully, path: "
            r1.append(r5)     // Catch:{ IOException -> 0x00da }
            java.lang.String r5 = r3.getPath()     // Catch:{ IOException -> 0x00da }
            r1.append(r5)     // Catch:{ IOException -> 0x00da }
            java.lang.String r5 = ", time in MS: "
            r1.append(r5)     // Catch:{ IOException -> 0x00da }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x00da }
            r1.append(r5)     // Catch:{ IOException -> 0x00da }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x00da }
            com.instabug.library.util.InstabugSDKLogger.d(r9, r1)     // Catch:{ IOException -> 0x00da }
            android.net.Uri r9 = android.net.Uri.fromFile(r3)     // Catch:{ IOException -> 0x00da }
            r4.close()     // Catch:{ IOException -> 0x010a }
            goto L_0x010e
        L_0x010a:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ all -> 0x0153 }
        L_0x010e:
            monitor-exit(r0)
            return r9
        L_0x0110:
            r9 = move-exception
            goto L_0x0148
        L_0x0112:
            r9 = move-exception
            r4 = r2
        L_0x0114:
            java.lang.String r1 = "ViewHierarchyDiskUtils"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0146 }
            r3.<init>()     // Catch:{ all -> 0x0146 }
            java.lang.String r5 = "zip viewHierarchy images got error: "
            r3.append(r5)     // Catch:{ all -> 0x0146 }
            java.lang.String r5 = r9.getMessage()     // Catch:{ all -> 0x0146 }
            r3.append(r5)     // Catch:{ all -> 0x0146 }
            java.lang.String r5 = ", time in MS: "
            r3.append(r5)     // Catch:{ all -> 0x0146 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0146 }
            r3.append(r5)     // Catch:{ all -> 0x0146 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0146 }
            com.instabug.library.util.InstabugSDKLogger.e(r1, r3, r9)     // Catch:{ all -> 0x0146 }
            if (r4 == 0) goto L_0x0144
            r4.close()     // Catch:{ IOException -> 0x0140 }
            goto L_0x0144
        L_0x0140:
            r9 = move-exception
            r9.printStackTrace()     // Catch:{ all -> 0x0153 }
        L_0x0144:
            monitor-exit(r0)
            return r2
        L_0x0146:
            r9 = move-exception
            r2 = r4
        L_0x0148:
            if (r2 == 0) goto L_0x0152
            r2.close()     // Catch:{ IOException -> 0x014e }
            goto L_0x0152
        L_0x014e:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ all -> 0x0153 }
        L_0x0152:
            throw r9     // Catch:{ all -> 0x0153 }
        L_0x0153:
            r9 = move-exception
            goto L_0x0157
        L_0x0155:
            monitor-exit(r0)
            return r2
        L_0x0157:
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.bug.screenshot.viewhierarchy.utilities.ViewHierarchyDiskUtils.zipViewHierarchyImages(i0.j.b.o.b.i):android.net.Uri");
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
