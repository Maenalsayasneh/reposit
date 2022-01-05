package com.instabug.library.internal.storage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Pair;
import com.instabug.library.Instabug;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.storage.cache.AttachmentsDbHelper;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.model.Attachment;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class AttachmentsUtility {
    public static final double MAX_FILE_SIZE_IN_MB = 5.0d;
    public static final String TAG = "AttachmentsUtility";

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public static boolean decryptAttachmentAndUpdateDb(Attachment attachment) {
        InstabugSDKLogger.d(TAG, "decryptAttachmentAndUpdateDb");
        if (!attachment.isEncrypted() || attachment.getLocalPath() == null) {
            return true;
        }
        boolean decrypt = InstabugCore.decrypt(attachment.getLocalPath());
        boolean z = !decrypt;
        attachment.setEncrypted(z);
        ContentValues contentValues = new ContentValues();
        contentValues.put(InstabugDbContract.AttachmentEntry.COLUMN_ENCRYPTED, Boolean.valueOf(z));
        AttachmentsDbHelper.update(attachment.getId(), contentValues);
        return decrypt;
    }

    public static void encryptAttachments(List<Attachment> list) {
        InstabugSDKLogger.d(TAG, "encryptAttachments");
        if (list != null) {
            for (Attachment next : list) {
                if (!next.isEncrypted() && next.getLocalPath() != null) {
                    next.setEncrypted(InstabugCore.encrypt(next.getLocalPath()));
                }
            }
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public static void encryptAttachmentsAndUpdateDb(List<Attachment> list) {
        InstabugSDKLogger.d(TAG, "encryptAttachmentsAndUpdateDb");
        if (list != null) {
            for (Attachment next : list) {
                if (!next.isEncrypted() && next.getLocalPath() != null) {
                    boolean encrypt = InstabugCore.encrypt(next.getLocalPath());
                    next.setEncrypted(encrypt);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(InstabugDbContract.AttachmentEntry.COLUMN_ENCRYPTED, Boolean.valueOf(encrypt));
                    AttachmentsDbHelper.update(next.getId(), contentValues);
                }
            }
        }
    }

    public static File getAttachmentFile(Context context, String str) {
        File filesAttachmentDirectory = getFilesAttachmentDirectory(context);
        File file = new File(filesAttachmentDirectory, str);
        if (!file.exists()) {
            return file;
        }
        return new File(filesAttachmentDirectory, String.valueOf(System.currentTimeMillis()) + "_" + str);
    }

    public static File getFileFromContentProvider(Context context, Uri uri, String str) {
        if (uri == null) {
            return null;
        }
        InputStream fileInputStreamFileFromUri = getFileInputStreamFileFromUri(context, uri);
        if (fileInputStreamFileFromUri != null) {
            return saveInputStreamToFile(context, fileInputStreamFileFromUri, str);
        }
        InstabugSDKLogger.e(TAG, "Inputstream is null");
        return null;
    }

    public static InputStream getFileInputStreamFileFromUri(Context context, Uri uri) {
        try {
            return context.getContentResolver().openInputStream(uri);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public static Pair<String, String> getFileNameAndSize(Context context, Uri uri) {
        if (uri == null) {
            return null;
        }
        Cursor query = context.getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    return new Pair<>(query.getString(query.getColumnIndex("_display_name")), query.getString(query.getColumnIndex("_size")));
                }
            } finally {
                query.close();
            }
        }
        if (query != null) {
            query.close();
        }
        return null;
    }

    public static File getFilesAttachmentDirectory(Context context) {
        return getNewDirectory(context, InstabugDbContract.AttachmentEntry.TABLE_NAME);
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public static String getGalleryImagePath(Activity activity, Uri uri) {
        Cursor managedQuery;
        if (uri == null || (managedQuery = activity.managedQuery(uri, new String[]{"_data"}, (String) null, (String[]) null, (String) null)) == null) {
            return null;
        }
        int columnIndexOrThrow = managedQuery.getColumnIndexOrThrow("_data");
        managedQuery.moveToFirst();
        return managedQuery.getString(columnIndexOrThrow);
    }

    public static File getNewDirectory(Context context, String str) {
        File file = new File(DiskUtils.getInstabugDirectory(context) + "/" + str + "/");
        if (!file.exists() && file.mkdirs()) {
            try {
                new File(file, ".nomedia").createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    public static Uri getNewFileAttachmentUri(Context context, Uri uri, String str) {
        String str2;
        if (!(uri == null || context == null || uri.getPath() == null)) {
            String lastPathSegment = uri.getLastPathSegment();
            File filesAttachmentDirectory = getFilesAttachmentDirectory(context);
            if (lastPathSegment == null) {
                str2 = "";
            } else {
                str2 = lastPathSegment.toLowerCase();
            }
            if (str == null || SettingsManager.getInstance().getExtraAttachmentFiles() == null || !SettingsManager.getInstance().getExtraAttachmentFiles().containsKey(uri)) {
                str = str2;
            }
            File file = new File(filesAttachmentDirectory, str);
            if (file.exists()) {
                file = new File(filesAttachmentDirectory, System.currentTimeMillis() + "_" + str);
            }
            try {
                if (!validateFileSize(uri, 5.0d)) {
                    InstabugSDKLogger.w(TAG, "Attachment file " + uri.toString() + " size exceeds than the limit " + 5.0d);
                    return null;
                }
                DiskUtils.copyFromUriIntoFile(context, uri, file);
                return Uri.fromFile(file);
            } catch (IOException e) {
                InstabugSDKLogger.e(TAG, e.getMessage(), e);
            }
        }
        return null;
    }

    public static Uri getUriFromBytes(Context context, byte[] bArr, String str) {
        File attachmentFile = getAttachmentFile(context, str);
        try {
            saveBytesToFile(bArr, attachmentFile);
            return Uri.fromFile(attachmentFile);
        } catch (IOException e) {
            InstabugSDKLogger.e(TAG, e.getMessage(), e);
            return null;
        }
    }

    public static File getVideoFile(Context context) {
        File newDirectory = getNewDirectory(context, "videos");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss.SSS", Locale.ENGLISH);
        StringBuilder P0 = a.P0("video-");
        P0.append(simpleDateFormat.format(new Date()));
        P0.append(".mp4");
        return new File(newDirectory, P0.toString());
    }

    public static File getVideoRecordingFramesDirectory(Context context) {
        return getNewDirectory(context, "frames");
    }

    public static boolean isValidSize(double d, double d2) {
        double d3 = d / 1048576.0d;
        if (d3 <= d2) {
            return true;
        }
        InstabugSDKLogger.w(TAG, "External attachment file size is " + d3 + " MBs > maxFileSize " + d2);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a  */
    @android.annotation.SuppressLint({"RESOURCE_LEAK"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void saveBytesToFile(byte[] r2, java.io.File r3) throws java.io.IOException {
        /*
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0016 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0016 }
            r1.<init>(r3)     // Catch:{ all -> 0x0016 }
            r0.<init>(r1)     // Catch:{ all -> 0x0016 }
            r0.write(r2)     // Catch:{ all -> 0x0014 }
            r0.flush()
            r0.close()
            return
        L_0x0014:
            r2 = move-exception
            goto L_0x0018
        L_0x0016:
            r2 = move-exception
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x0020
            r0.flush()
            r0.close()
        L_0x0020:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.storage.AttachmentsUtility.saveBytesToFile(byte[], java.io.File):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC, Splitter:B:25:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d A[SYNTHETIC, Splitter:B:34:0x006d] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007b A[SYNTHETIC, Splitter:B:40:0x007b] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0053=Splitter:B:31:0x0053, B:22:0x003c=Splitter:B:22:0x003c} */
    @android.annotation.SuppressLint({"RESOURCE_LEAK"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File saveInputStreamToFile(android.content.Context r5, java.io.InputStream r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "AttachmentsUtility"
            java.io.File r1 = new java.io.File
            java.io.File r5 = getFilesAttachmentDirectory(r5)
            r1.<init>(r5, r7)
            r5 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0051, Exception -> 0x003a, all -> 0x0038 }
            r7.<init>(r1)     // Catch:{ IOException -> 0x0051, Exception -> 0x003a, all -> 0x0038 }
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch:{ IOException -> 0x0036, Exception -> 0x0034 }
        L_0x0015:
            int r3 = r6.read(r2)     // Catch:{ IOException -> 0x0036, Exception -> 0x0034 }
            r4 = -1
            if (r3 == r4) goto L_0x0021
            r4 = 0
            r7.write(r2, r4, r3)     // Catch:{ IOException -> 0x0036, Exception -> 0x0034 }
            goto L_0x0015
        L_0x0021:
            r6.close()     // Catch:{ IOException -> 0x0036, Exception -> 0x0034 }
            r7.flush()     // Catch:{ IOException -> 0x002b }
            r7.close()     // Catch:{ IOException -> 0x002b }
            goto L_0x002f
        L_0x002b:
            r5 = move-exception
            r5.printStackTrace()
        L_0x002f:
            return r1
        L_0x0030:
            r5 = move-exception
            r6 = r5
            r5 = r7
            goto L_0x0079
        L_0x0034:
            r6 = move-exception
            goto L_0x003c
        L_0x0036:
            r6 = move-exception
            goto L_0x0053
        L_0x0038:
            r6 = move-exception
            goto L_0x0079
        L_0x003a:
            r6 = move-exception
            r7 = r5
        L_0x003c:
            java.lang.String r1 = r6.getMessage()     // Catch:{ all -> 0x0030 }
            com.instabug.library.util.InstabugSDKLogger.e(r0, r1, r6)     // Catch:{ all -> 0x0030 }
            if (r7 == 0) goto L_0x0078
            r7.flush()     // Catch:{ IOException -> 0x004c }
            r7.close()     // Catch:{ IOException -> 0x004c }
            goto L_0x0078
        L_0x004c:
            r6 = move-exception
            r6.printStackTrace()
            goto L_0x0078
        L_0x0051:
            r6 = move-exception
            r7 = r5
        L_0x0053:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0030 }
            r1.<init>()     // Catch:{ all -> 0x0030 }
            java.lang.String r2 = "IO exception: "
            r1.append(r2)     // Catch:{ all -> 0x0030 }
            java.lang.String r2 = r6.getMessage()     // Catch:{ all -> 0x0030 }
            r1.append(r2)     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0030 }
            com.instabug.library.util.InstabugSDKLogger.e(r0, r1, r6)     // Catch:{ all -> 0x0030 }
            if (r7 == 0) goto L_0x0078
            r7.flush()     // Catch:{ IOException -> 0x0074 }
            r7.close()     // Catch:{ IOException -> 0x0074 }
            goto L_0x0078
        L_0x0074:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0078:
            return r5
        L_0x0079:
            if (r5 == 0) goto L_0x0086
            r5.flush()     // Catch:{ IOException -> 0x0082 }
            r5.close()     // Catch:{ IOException -> 0x0082 }
            goto L_0x0086
        L_0x0082:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0086:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.storage.AttachmentsUtility.saveInputStreamToFile(android.content.Context, java.io.InputStream, java.lang.String):java.io.File");
    }

    public static boolean validateFileSize(Uri uri, double d) {
        long j;
        if (Instabug.getApplicationContext() == null || uri.getPath() == null) {
            return false;
        }
        if (uri.toString().contains("android.resource")) {
            try {
                InputStream openInputStream = Instabug.getApplicationContext().getContentResolver().openInputStream(uri);
                if (openInputStream == null) {
                    return false;
                }
                j = (long) openInputStream.available();
            } catch (IOException unused) {
                StringBuilder P0 = a.P0("External attachment file ");
                P0.append(uri.getPath());
                P0.append(" couldn't be loaded to calculate its size");
                InstabugSDKLogger.w(TAG, P0.toString());
                return false;
            }
        } else {
            j = new File(uri.getPath()).length();
        }
        double d2 = (double) j;
        double d3 = d2 / 1048576.0d;
        if (d3 <= d) {
            return isValidSize(d2, d);
        }
        InstabugSDKLogger.w(TAG, "External attachment file size is " + j + " bytes or " + d3 + " MBs > maxFileSize " + d);
        return false;
    }

    public static Uri getNewFileAttachmentUri(Context context, Uri uri, String str, double d) {
        String str2;
        if (!(uri == null || context == null || uri.getPath() == null)) {
            String lastPathSegment = uri.getLastPathSegment();
            File filesAttachmentDirectory = getFilesAttachmentDirectory(context);
            if (lastPathSegment == null) {
                str2 = "";
            } else {
                str2 = lastPathSegment.toLowerCase();
            }
            if (str == null || SettingsManager.getInstance().getExtraAttachmentFiles() == null || !SettingsManager.getInstance().getExtraAttachmentFiles().containsKey(uri)) {
                str = str2;
            }
            File file = new File(filesAttachmentDirectory, str);
            if (file.exists()) {
                file = new File(filesAttachmentDirectory, System.currentTimeMillis() + "_" + str);
            }
            try {
                if (!validateFileSize(uri, d)) {
                    InstabugSDKLogger.w(TAG, "Attachment file " + uri.toString() + " size exceeds than the limit " + 5.0d);
                    return null;
                }
                DiskUtils.copyFromUriIntoFile(context, uri, file);
                return Uri.fromFile(file);
            } catch (IOException e) {
                InstabugSDKLogger.e(TAG, e.getMessage(), e);
            }
        }
        return null;
    }

    public static Uri getNewFileAttachmentUri(Context context, Uri uri) {
        return getNewFileAttachmentUri(context, uri, (String) null);
    }
}
