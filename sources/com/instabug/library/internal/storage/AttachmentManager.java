package com.instabug.library.internal.storage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import com.instabug.library.Instabug;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@SuppressFBWarnings({"RV_RETURN_VALUE_IGNORED_BAD_PRACTICE"})
public class AttachmentManager {
    private static final double MAX_FILE_SIZE_IN_MB = 50.0d;
    public static final String TAG = "AttachmentManager";

    public interface a {
        void onError(Throwable th);

        void onSuccess(Uri uri);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0085 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008e A[SYNTHETIC, Splitter:B:44:0x008e] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0096 A[Catch:{ IOException -> 0x0092 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b2 A[SYNTHETIC, Splitter:B:59:0x00b2] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ba A[Catch:{ IOException -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ce A[SYNTHETIC, Splitter:B:69:0x00ce] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d6 A[Catch:{ IOException -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:54:0x00a3=Splitter:B:54:0x00a3, B:39:0x007f=Splitter:B:39:0x007f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void copyFromUriIntoFile(android.content.Context r4, android.net.Uri r5, java.io.File r6) {
        /*
            java.lang.String r0 = "AttachmentManager"
            if (r4 != 0) goto L_0x0005
            return
        L_0x0005:
            android.content.ContentResolver r1 = r4.getContentResolver()
            if (r1 != 0) goto L_0x000c
            return
        L_0x000c:
            r1 = 0
            android.content.ContentResolver r2 = r4.getContentResolver()     // Catch:{ FileNotFoundException -> 0x00a1, IOException -> 0x007d, all -> 0x007a }
            java.io.InputStream r5 = r2.openInputStream(r5)     // Catch:{ FileNotFoundException -> 0x00a1, IOException -> 0x007d, all -> 0x007a }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ FileNotFoundException -> 0x00a1, IOException -> 0x007d, all -> 0x007a }
            android.net.Uri r2 = android.net.Uri.fromFile(r6)     // Catch:{ FileNotFoundException -> 0x00a1, IOException -> 0x007d, all -> 0x007a }
            java.io.OutputStream r4 = r4.openOutputStream(r2)     // Catch:{ FileNotFoundException -> 0x00a1, IOException -> 0x007d, all -> 0x007a }
            if (r5 == 0) goto L_0x0079
            if (r4 != 0) goto L_0x0026
            goto L_0x0079
        L_0x0026:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x00a1, IOException -> 0x007d, all -> 0x007a }
            r2.<init>(r5)     // Catch:{ FileNotFoundException -> 0x00a1, IOException -> 0x007d, all -> 0x007a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0077, IOException -> 0x0075 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0077, IOException -> 0x0075 }
            java.lang.String r3 = "Target file path: "
            r5.append(r3)     // Catch:{ FileNotFoundException -> 0x0077, IOException -> 0x0075 }
            java.lang.String r6 = r6.getPath()     // Catch:{ FileNotFoundException -> 0x0077, IOException -> 0x0075 }
            r5.append(r6)     // Catch:{ FileNotFoundException -> 0x0077, IOException -> 0x0075 }
            java.lang.String r5 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0077, IOException -> 0x0075 }
            com.instabug.library.util.InstabugSDKLogger.d(r0, r5)     // Catch:{ FileNotFoundException -> 0x0077, IOException -> 0x0075 }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ FileNotFoundException -> 0x0077, IOException -> 0x0075 }
            r5.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0077, IOException -> 0x0075 }
            r4 = 32768(0x8000, float:4.5918E-41)
            byte[] r4 = new byte[r4]     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x006d, all -> 0x0069 }
        L_0x004d:
            int r6 = r2.read(r4)     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x006d, all -> 0x0069 }
            if (r6 <= 0) goto L_0x0058
            r1 = 0
            r5.write(r4, r1, r6)     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x006d, all -> 0x0069 }
            goto L_0x004d
        L_0x0058:
            r5.close()     // Catch:{ IOException -> 0x0060 }
            r2.close()     // Catch:{ IOException -> 0x0060 }
            goto L_0x00cb
        L_0x0060:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            if (r5 == 0) goto L_0x00cb
            goto L_0x00c4
        L_0x0069:
            r4 = move-exception
            r1 = r5
            goto L_0x00cc
        L_0x006d:
            r4 = move-exception
            r1 = r5
            goto L_0x007f
        L_0x0070:
            r4 = move-exception
            r1 = r5
            goto L_0x00a3
        L_0x0073:
            r4 = move-exception
            goto L_0x00cc
        L_0x0075:
            r4 = move-exception
            goto L_0x007f
        L_0x0077:
            r4 = move-exception
            goto L_0x00a3
        L_0x0079:
            return
        L_0x007a:
            r4 = move-exception
            r2 = r1
            goto L_0x00cc
        L_0x007d:
            r4 = move-exception
            r2 = r1
        L_0x007f:
            java.lang.String r5 = r4.getMessage()     // Catch:{ all -> 0x0073 }
            if (r5 == 0) goto L_0x008c
            java.lang.String r5 = r4.getMessage()     // Catch:{ all -> 0x0073 }
            com.instabug.library.util.InstabugSDKLogger.e(r0, r5, r4)     // Catch:{ all -> 0x0073 }
        L_0x008c:
            if (r1 == 0) goto L_0x0094
            r1.close()     // Catch:{ IOException -> 0x0092 }
            goto L_0x0094
        L_0x0092:
            r4 = move-exception
            goto L_0x009a
        L_0x0094:
            if (r2 == 0) goto L_0x00cb
            r2.close()     // Catch:{ IOException -> 0x0092 }
            goto L_0x00cb
        L_0x009a:
            java.lang.String r5 = r4.getMessage()
            if (r5 == 0) goto L_0x00cb
            goto L_0x00c4
        L_0x00a1:
            r4 = move-exception
            r2 = r1
        L_0x00a3:
            java.lang.String r5 = r4.getMessage()     // Catch:{ all -> 0x0073 }
            if (r5 == 0) goto L_0x00b0
            java.lang.String r5 = r4.getMessage()     // Catch:{ all -> 0x0073 }
            com.instabug.library.util.InstabugSDKLogger.e(r0, r5, r4)     // Catch:{ all -> 0x0073 }
        L_0x00b0:
            if (r1 == 0) goto L_0x00b8
            r1.close()     // Catch:{ IOException -> 0x00b6 }
            goto L_0x00b8
        L_0x00b6:
            r4 = move-exception
            goto L_0x00be
        L_0x00b8:
            if (r2 == 0) goto L_0x00cb
            r2.close()     // Catch:{ IOException -> 0x00b6 }
            goto L_0x00cb
        L_0x00be:
            java.lang.String r5 = r4.getMessage()
            if (r5 == 0) goto L_0x00cb
        L_0x00c4:
            java.lang.String r5 = r4.getMessage()
            com.instabug.library.util.InstabugSDKLogger.e(r0, r5, r4)
        L_0x00cb:
            return
        L_0x00cc:
            if (r1 == 0) goto L_0x00d4
            r1.close()     // Catch:{ IOException -> 0x00d2 }
            goto L_0x00d4
        L_0x00d2:
            r5 = move-exception
            goto L_0x00da
        L_0x00d4:
            if (r2 == 0) goto L_0x00e7
            r2.close()     // Catch:{ IOException -> 0x00d2 }
            goto L_0x00e7
        L_0x00da:
            java.lang.String r6 = r5.getMessage()
            if (r6 == 0) goto L_0x00e7
            java.lang.String r6 = r5.getMessage()
            com.instabug.library.util.InstabugSDKLogger.e(r0, r6, r5)
        L_0x00e7:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.storage.AttachmentManager.copyFromUriIntoFile(android.content.Context, android.net.Uri, java.io.File):void");
    }

    public static void deleteRecursive(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File deleteRecursive : listFiles) {
                    deleteRecursive(deleteRecursive);
                }
            }
            file.delete();
            return;
        }
        file.delete();
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public static File getAttachmentDirectory(Context context) {
        String str;
        if (context == null && Instabug.isBuilt()) {
            context = Instabug.getApplicationContext();
        }
        if (context == null) {
            return null;
        }
        if (context.getExternalFilesDir((String) null) == null || !Environment.getExternalStorageState().equals("mounted")) {
            str = getInternalStoragePath(context);
        } else {
            try {
                str = context.getExternalFilesDir((String) null).getAbsolutePath();
            } catch (NullPointerException unused) {
                str = getInternalStoragePath(context);
            }
        }
        File file = new File(i0.d.a.a.a.n0(str, "/instabug/"));
        if (!file.exists()) {
            file.mkdirs();
            try {
                new File(file, ".nomedia").createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    private static File getAttachmentFile(Context context, String str) {
        File attachmentDirectory = getAttachmentDirectory(context);
        File file = new File(attachmentDirectory, str);
        if (!file.exists()) {
            return file;
        }
        return new File(attachmentDirectory, String.valueOf(System.currentTimeMillis()) + "_" + str);
    }

    public static File getAutoScreenRecordingFile(Context context) {
        File autoScreenRecordingVideosDirectory = getAutoScreenRecordingVideosDirectory(context);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss.SSS", Locale.ENGLISH);
        StringBuilder P0 = i0.d.a.a.a.P0("auto-recording-");
        P0.append(simpleDateFormat.format(new Date()));
        P0.append(".mp4");
        return new File(autoScreenRecordingVideosDirectory, P0.toString());
    }

    public static File getAutoScreenRecordingVideosDirectory(Context context) {
        File file = new File(getAttachmentDirectory(context) + "/auto_recording/");
        if (!file.exists()) {
            file.mkdirs();
            try {
                new File(file, ".nomedia").createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public static String getGalleryImagePath(Activity activity, Uri uri) {
        Cursor managedQuery;
        if (activity == null || uri == null || (managedQuery = activity.managedQuery(uri, new String[]{"_data"}, (String) null, (String[]) null, (String) null)) == null) {
            return null;
        }
        int columnIndexOrThrow = managedQuery.getColumnIndexOrThrow("_data");
        managedQuery.moveToFirst();
        return managedQuery.getString(columnIndexOrThrow);
    }

    private static String getInternalStoragePath(Context context) {
        InstabugSDKLogger.w(TAG, "External storage not available, saving file to internal storage.");
        return context.getFilesDir().getAbsolutePath();
    }

    public static File getNewDirectory(Context context, String str) {
        File file = new File(getAttachmentDirectory(context) + "/" + str + "/");
        if (!file.exists()) {
            file.mkdirs();
            try {
                new File(file, ".nomedia").createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    public static Uri getNewFileUri(Context context, Uri uri, String str) {
        if (uri == null) {
            return null;
        }
        String lastPathSegment = uri.getLastPathSegment();
        String lowerCase = lastPathSegment != null ? lastPathSegment.toLowerCase() : "";
        if (str == null || SettingsManager.getInstance().getExtraAttachmentFiles() == null || !SettingsManager.getInstance().getExtraAttachmentFiles().containsKey(uri)) {
            str = lowerCase;
        }
        File attachmentFile = getAttachmentFile(context, str);
        copyFromUriIntoFile(context, uri, attachmentFile);
        if (!validateFileSize(uri, attachmentFile)) {
            return null;
        }
        return Uri.fromFile(attachmentFile);
    }

    public static Uri getUriFromBytes(Context context, byte[] bArr, String str) {
        File attachmentFile = getAttachmentFile(context, str);
        saveBytesToFile(bArr, attachmentFile);
        return Uri.fromFile(attachmentFile);
    }

    public static File getVideoFile(Context context) {
        File videoRecordingVideosDirectory = getVideoRecordingVideosDirectory(context);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss.SSS", Locale.getDefault());
        StringBuilder P0 = i0.d.a.a.a.P0("video-");
        P0.append(simpleDateFormat.format(new Date()));
        P0.append(".mp4");
        return new File(videoRecordingVideosDirectory, P0.toString());
    }

    public static File getVideoRecordingFramesDirectory(Context context) {
        File file = new File(getAttachmentDirectory(context) + "/frames/");
        if (!file.exists()) {
            file.mkdirs();
            try {
                new File(file, ".nomedia").createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    public static File getVideoRecordingVideosDirectory(Context context) {
        File file = new File(getAttachmentDirectory(context) + "/videos/");
        if (!file.exists()) {
            file.mkdirs();
            try {
                new File(file, ".nomedia").createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    private static Bitmap resizeBitmap(Bitmap bitmap, int i) {
        int i2;
        float width = ((float) bitmap.getWidth()) / ((float) bitmap.getHeight());
        if (width > 1.0f) {
            i2 = (int) (((float) i) / width);
        } else {
            int i3 = (int) (((float) i) * width);
            i2 = i;
            i = i3;
        }
        return Bitmap.createScaledBitmap(bitmap, i, i2, false);
    }

    public static void saveBitmap(Bitmap bitmap, Context context, a aVar) {
        File attachmentDirectory = getAttachmentDirectory(context);
        StringBuilder P0 = i0.d.a.a.a.P0("bug_");
        P0.append(System.currentTimeMillis());
        P0.append("_.jpg");
        File file = new File(attachmentDirectory, P0.toString());
        StringBuilder P02 = i0.d.a.a.a.P0("image path: ");
        P02.append(file.toString());
        InstabugSDKLogger.v(TAG, P02.toString());
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bufferedOutputStream);
            bufferedOutputStream.close();
            Uri fromFile = Uri.fromFile(file);
            if (fromFile != null) {
                aVar.onSuccess(fromFile);
            } else {
                aVar.onError(new Throwable("Uri equal null"));
            }
        } catch (IOException e) {
            aVar.onError(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0067, code lost:
        com.instabug.library.util.InstabugSDKLogger.e(TAG, r4.getMessage(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0031 A[Catch:{ all -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003a A[SYNTHETIC, Splitter:B:23:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0050 A[Catch:{ all -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0059 A[SYNTHETIC, Splitter:B:34:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0071 A[SYNTHETIC, Splitter:B:41:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:29:0x004a=Splitter:B:29:0x004a, B:18:0x002b=Splitter:B:18:0x002b} */
    @android.annotation.SuppressLint({"RESOURCE_LEAK"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void saveBytesToFile(byte[] r4, java.io.File r5) {
        /*
            java.lang.String r0 = "AttachmentManager"
            r1 = 0
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ FileNotFoundException -> 0x0049, IOException -> 0x002a }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0049, IOException -> 0x002a }
            r3.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0049, IOException -> 0x002a }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0049, IOException -> 0x002a }
            r2.write(r4)     // Catch:{ FileNotFoundException -> 0x0025, IOException -> 0x0022, all -> 0x001f }
            r2.flush()     // Catch:{ IOException -> 0x0017 }
            r2.close()     // Catch:{ IOException -> 0x0017 }
            goto L_0x006e
        L_0x0017:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            if (r5 == 0) goto L_0x006e
            goto L_0x0067
        L_0x001f:
            r4 = move-exception
            r1 = r2
            goto L_0x006f
        L_0x0022:
            r4 = move-exception
            r1 = r2
            goto L_0x002b
        L_0x0025:
            r4 = move-exception
            r1 = r2
            goto L_0x004a
        L_0x0028:
            r4 = move-exception
            goto L_0x006f
        L_0x002a:
            r4 = move-exception
        L_0x002b:
            java.lang.String r5 = r4.getMessage()     // Catch:{ all -> 0x0028 }
            if (r5 == 0) goto L_0x0038
            java.lang.String r5 = r4.getMessage()     // Catch:{ all -> 0x0028 }
            com.instabug.library.util.InstabugSDKLogger.e(r0, r5, r4)     // Catch:{ all -> 0x0028 }
        L_0x0038:
            if (r1 == 0) goto L_0x006e
            r1.flush()     // Catch:{ IOException -> 0x0041 }
            r1.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x006e
        L_0x0041:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            if (r5 == 0) goto L_0x006e
            goto L_0x0067
        L_0x0049:
            r4 = move-exception
        L_0x004a:
            java.lang.String r5 = r4.getMessage()     // Catch:{ all -> 0x0028 }
            if (r5 == 0) goto L_0x0057
            java.lang.String r5 = r4.getMessage()     // Catch:{ all -> 0x0028 }
            com.instabug.library.util.InstabugSDKLogger.e(r0, r5, r4)     // Catch:{ all -> 0x0028 }
        L_0x0057:
            if (r1 == 0) goto L_0x006e
            r1.flush()     // Catch:{ IOException -> 0x0060 }
            r1.close()     // Catch:{ IOException -> 0x0060 }
            goto L_0x006e
        L_0x0060:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            if (r5 == 0) goto L_0x006e
        L_0x0067:
            java.lang.String r5 = r4.getMessage()
            com.instabug.library.util.InstabugSDKLogger.e(r0, r5, r4)
        L_0x006e:
            return
        L_0x006f:
            if (r1 == 0) goto L_0x0086
            r1.flush()     // Catch:{ IOException -> 0x0078 }
            r1.close()     // Catch:{ IOException -> 0x0078 }
            goto L_0x0086
        L_0x0078:
            r5 = move-exception
            java.lang.String r1 = r5.getMessage()
            if (r1 == 0) goto L_0x0086
            java.lang.String r1 = r5.getMessage()
            com.instabug.library.util.InstabugSDKLogger.e(r0, r1, r5)
        L_0x0086:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.storage.AttachmentManager.saveBytesToFile(byte[], java.io.File):void");
    }

    private static boolean validateFileSize(Uri uri, File file) {
        if (SettingsManager.getInstance().getExtraAttachmentFiles() == null || !SettingsManager.getInstance().getExtraAttachmentFiles().containsKey(uri)) {
            return true;
        }
        double length = ((double) file.length()) / 1048576.0d;
        if (length <= MAX_FILE_SIZE_IN_MB) {
            return true;
        }
        InstabugSDKLogger.w(TAG, "Attachment size is" + length + ", exceeds " + MAX_FILE_SIZE_IN_MB + " MBs file size limit, ignoring attachment");
        return false;
    }

    public static Uri getNewFileUri(Context context, Uri uri) {
        return getNewFileUri(context, uri, (String) null);
    }

    public static void saveBitmap(Bitmap bitmap, File file, a aVar) {
        StringBuilder P0 = i0.d.a.a.a.P0("frame_");
        P0.append(System.currentTimeMillis());
        P0.append("_.jpg");
        File file2 = new File(file, P0.toString());
        StringBuilder P02 = i0.d.a.a.a.P0("video frame path: ");
        P02.append(file2.toString());
        InstabugSDKLogger.v(TAG, P02.toString());
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
            if ((bitmap.getWidth() > bitmap.getHeight() ? bitmap.getWidth() : bitmap.getHeight()) > 640) {
                resizeBitmap(bitmap, 640).compress(Bitmap.CompressFormat.JPEG, 90, bufferedOutputStream);
            } else {
                resizeBitmap(bitmap, 320).compress(Bitmap.CompressFormat.JPEG, 90, bufferedOutputStream);
            }
            bufferedOutputStream.close();
            Uri fromFile = Uri.fromFile(file2);
            if (fromFile != null) {
                aVar.onSuccess(fromFile);
            } else {
                aVar.onError(new Throwable("Uri equal null"));
            }
        } catch (IOException e) {
            aVar.onError(e);
        }
    }
}
