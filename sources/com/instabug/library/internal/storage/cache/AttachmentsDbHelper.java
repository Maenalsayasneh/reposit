package com.instabug.library.internal.storage.cache;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.model.Attachment;

public class AttachmentsDbHelper {
    private static final String[] ATTACHMENT_COLUMN = {"attachments._id", "name", "local_path", "url", "type", "attachment_state", "video_encoded", "duration", InstabugDbContract.AttachmentEntry.COLUMN_REPORT_ID, InstabugDbContract.AttachmentEntry.COLUMN_ENCRYPTED};

    public static synchronized void delete(long j) {
        synchronized (AttachmentsDbHelper.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            String[] strArr = {String.valueOf(j)};
            openDatabase.beginTransaction();
            try {
                openDatabase.delete(InstabugDbContract.AttachmentEntry.TABLE_NAME, "_id=? ", strArr);
                openDatabase.setTransactionSuccessful();
            } finally {
                openDatabase.endTransaction();
                openDatabase.close();
            }
        }
    }

    public static synchronized void deleteAll() {
        synchronized (AttachmentsDbHelper.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            openDatabase.beginTransaction();
            try {
                openDatabase.delete(InstabugDbContract.AttachmentEntry.TABLE_NAME, (String) null, (String[]) null);
                openDatabase.setTransactionSuccessful();
            } finally {
                openDatabase.endTransaction();
                openDatabase.close();
            }
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public static synchronized long insert(Attachment attachment, String str) {
        long insert;
        synchronized (AttachmentsDbHelper.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            openDatabase.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("url", attachment.getUrl());
                contentValues.put("attachment_state", attachment.getAttachmentState().name());
                contentValues.put("duration", attachment.getDuration());
                contentValues.put("local_path", attachment.getLocalPath());
                contentValues.put("name", attachment.getName());
                contentValues.put("type", attachment.getType().name());
                contentValues.put("video_encoded", Boolean.valueOf(attachment.isVideoEncoded()));
                contentValues.put(InstabugDbContract.AttachmentEntry.COLUMN_REPORT_ID, str);
                contentValues.put(InstabugDbContract.AttachmentEntry.COLUMN_ENCRYPTED, Boolean.valueOf(attachment.isEncrypted()));
                insert = openDatabase.insert(InstabugDbContract.AttachmentEntry.TABLE_NAME, (String) null, contentValues);
                openDatabase.setTransactionSuccessful();
            } finally {
                openDatabase.endTransaction();
                openDatabase.close();
            }
        }
        return insert;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00dc, code lost:
        if (r3 == null) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00eb, code lost:
        if (r3 == null) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ed, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f0, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<com.instabug.library.model.Attachment> retrieve(java.lang.String r20, com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r21) {
        /*
            java.lang.String r1 = "attachments._id"
            java.lang.String r2 = "name"
            java.lang.String r3 = "local_path"
            java.lang.String r4 = "url"
            java.lang.String r5 = "type"
            java.lang.String r6 = "attachment_state"
            java.lang.String r7 = "video_encoded"
            java.lang.String r8 = "duration"
            java.lang.String r9 = "report_id"
            java.lang.String r10 = "encrypted"
            java.lang.String[] r13 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10}
            r0 = 1
            java.lang.String[] r15 = new java.lang.String[r0]
            r1 = 0
            r15[r1] = r20
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            java.lang.String r12 = "attachments"
            java.lang.String r14 = "report_id=?"
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r11 = r21
            android.database.Cursor r3 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x00e1 }
            if (r3 == 0) goto L_0x00dc
            boolean r4 = r3.moveToFirst()     // Catch:{ Exception -> 0x00e1 }
            if (r4 == 0) goto L_0x00dc
        L_0x003e:
            com.instabug.library.model.Attachment r4 = new com.instabug.library.model.Attachment     // Catch:{ Exception -> 0x00e1 }
            r4.<init>()     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r5 = "_id"
            int r5 = r3.getColumnIndex(r5)     // Catch:{ Exception -> 0x00e1 }
            int r5 = r3.getInt(r5)     // Catch:{ Exception -> 0x00e1 }
            long r5 = (long) r5     // Catch:{ Exception -> 0x00e1 }
            r4.setId(r5)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r5 = "name"
            int r5 = r3.getColumnIndex(r5)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r5 = r3.getString(r5)     // Catch:{ Exception -> 0x00e1 }
            r4.setName(r5)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r5 = "attachment_state"
            int r5 = r3.getColumnIndex(r5)     // Catch:{ Exception -> 0x00e1 }
            java.lang.Class<com.instabug.library.model.Attachment$AttachmentState> r6 = com.instabug.library.model.Attachment.AttachmentState.class
            java.lang.String r5 = r3.getString(r5)     // Catch:{ Exception -> 0x00e1 }
            java.lang.Enum r5 = java.lang.Enum.valueOf(r6, r5)     // Catch:{ Exception -> 0x00e1 }
            com.instabug.library.model.Attachment$AttachmentState r5 = (com.instabug.library.model.Attachment.AttachmentState) r5     // Catch:{ Exception -> 0x00e1 }
            r4.setAttachmentState(r5)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r5 = "duration"
            int r5 = r3.getColumnIndex(r5)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r5 = r3.getString(r5)     // Catch:{ Exception -> 0x00e1 }
            r4.setDuration(r5)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r5 = "url"
            int r5 = r3.getColumnIndex(r5)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r5 = r3.getString(r5)     // Catch:{ Exception -> 0x00e1 }
            r4.setUrl(r5)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r5 = "local_path"
            int r5 = r3.getColumnIndex(r5)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r5 = r3.getString(r5)     // Catch:{ Exception -> 0x00e1 }
            r4.setLocalPath(r5)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r5 = "video_encoded"
            int r5 = r3.getColumnIndex(r5)     // Catch:{ Exception -> 0x00e1 }
            int r5 = r3.getInt(r5)     // Catch:{ Exception -> 0x00e1 }
            if (r5 == 0) goto L_0x00a8
            r5 = r0
            goto L_0x00a9
        L_0x00a8:
            r5 = r1
        L_0x00a9:
            r4.setVideoEncoded(r5)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r5 = "type"
            int r5 = r3.getColumnIndex(r5)     // Catch:{ Exception -> 0x00e1 }
            java.lang.Class<com.instabug.library.model.Attachment$Type> r6 = com.instabug.library.model.Attachment.Type.class
            java.lang.String r5 = r3.getString(r5)     // Catch:{ Exception -> 0x00e1 }
            java.lang.Enum r5 = java.lang.Enum.valueOf(r6, r5)     // Catch:{ Exception -> 0x00e1 }
            com.instabug.library.model.Attachment$Type r5 = (com.instabug.library.model.Attachment.Type) r5     // Catch:{ Exception -> 0x00e1 }
            r4.setType(r5)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r5 = "encrypted"
            int r5 = r3.getColumnIndex(r5)     // Catch:{ Exception -> 0x00e1 }
            int r5 = r3.getInt(r5)     // Catch:{ Exception -> 0x00e1 }
            if (r5 == 0) goto L_0x00cf
            r5 = r0
            goto L_0x00d0
        L_0x00cf:
            r5 = r1
        L_0x00d0:
            r4.setEncrypted(r5)     // Catch:{ Exception -> 0x00e1 }
            r2.add(r4)     // Catch:{ Exception -> 0x00e1 }
            boolean r4 = r3.moveToNext()     // Catch:{ Exception -> 0x00e1 }
            if (r4 != 0) goto L_0x003e
        L_0x00dc:
            if (r3 == 0) goto L_0x00f0
            goto L_0x00ed
        L_0x00df:
            r0 = move-exception
            goto L_0x00f1
        L_0x00e1:
            r0 = move-exception
            java.lang.String r1 = "AttachmentsDbHelper"
            java.lang.String r4 = r0.getMessage()     // Catch:{ all -> 0x00df }
            com.instabug.library.util.InstabugSDKLogger.e(r1, r4, r0)     // Catch:{ all -> 0x00df }
            if (r3 == 0) goto L_0x00f0
        L_0x00ed:
            r3.close()
        L_0x00f0:
            return r2
        L_0x00f1:
            if (r3 == 0) goto L_0x00f6
            r3.close()
        L_0x00f6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.storage.cache.AttachmentsDbHelper.retrieve(java.lang.String, com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper):java.util.ArrayList");
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public static synchronized void update(long j, ContentValues contentValues) {
        synchronized (AttachmentsDbHelper.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            String[] strArr = {String.valueOf(j)};
            openDatabase.beginTransaction();
            try {
                openDatabase.update(InstabugDbContract.AttachmentEntry.TABLE_NAME, contentValues, "_id=? ", strArr);
                openDatabase.setTransactionSuccessful();
            } finally {
                openDatabase.endTransaction();
                openDatabase.close();
            }
        }
    }

    public static synchronized void delete(String str, String str2) {
        synchronized (AttachmentsDbHelper.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            String[] strArr = {str, str2};
            openDatabase.beginTransaction();
            try {
                openDatabase.delete(InstabugDbContract.AttachmentEntry.TABLE_NAME, "name = ? and report_id = ?", strArr);
                openDatabase.setTransactionSuccessful();
            } finally {
                openDatabase.endTransaction();
                openDatabase.close();
            }
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public static synchronized void update(String str, String str2, ContentValues contentValues) {
        synchronized (AttachmentsDbHelper.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            String[] strArr = {str, str2};
            openDatabase.beginTransaction();
            try {
                openDatabase.update(InstabugDbContract.AttachmentEntry.TABLE_NAME, contentValues, "name=? and report_id=? ", strArr);
                openDatabase.setTransactionSuccessful();
            } finally {
                openDatabase.endTransaction();
                openDatabase.close();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00cf, code lost:
        if (r11 == null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00de, code lost:
        if (r11 == null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e0, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e3, code lost:
        r0.endTransaction();
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e9, code lost:
        return r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<com.instabug.library.model.Attachment> retrieve(java.lang.String r14) {
        /*
            com.instabug.library.internal.storage.cache.db.DatabaseManager r0 = com.instabug.library.internal.storage.cache.db.DatabaseManager.getInstance()
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r0 = r0.openDatabase()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r11 = 0
            r0.beginTransaction()     // Catch:{ Exception -> 0x00d4 }
            r12 = 1
            java.lang.String[] r5 = new java.lang.String[r12]     // Catch:{ Exception -> 0x00d4 }
            r13 = 0
            r5[r13] = r14     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r2 = "attachments"
            java.lang.String[] r3 = ATTACHMENT_COLUMN     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r4 = "report_id=?"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r1 = r0
            android.database.Cursor r11 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x00d4 }
            if (r11 == 0) goto L_0x00cc
            boolean r14 = r11.moveToFirst()     // Catch:{ Exception -> 0x00d4 }
            if (r14 == 0) goto L_0x00cc
        L_0x002e:
            com.instabug.library.model.Attachment r14 = new com.instabug.library.model.Attachment     // Catch:{ Exception -> 0x00d4 }
            r14.<init>()     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r1 = "_id"
            int r1 = r11.getColumnIndex(r1)     // Catch:{ Exception -> 0x00d4 }
            int r1 = r11.getInt(r1)     // Catch:{ Exception -> 0x00d4 }
            long r1 = (long) r1     // Catch:{ Exception -> 0x00d4 }
            r14.setId(r1)     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r1 = "name"
            int r1 = r11.getColumnIndex(r1)     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r1 = r11.getString(r1)     // Catch:{ Exception -> 0x00d4 }
            r14.setName(r1)     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r1 = "attachment_state"
            int r1 = r11.getColumnIndex(r1)     // Catch:{ Exception -> 0x00d4 }
            java.lang.Class<com.instabug.library.model.Attachment$AttachmentState> r2 = com.instabug.library.model.Attachment.AttachmentState.class
            java.lang.String r1 = r11.getString(r1)     // Catch:{ Exception -> 0x00d4 }
            java.lang.Enum r1 = java.lang.Enum.valueOf(r2, r1)     // Catch:{ Exception -> 0x00d4 }
            com.instabug.library.model.Attachment$AttachmentState r1 = (com.instabug.library.model.Attachment.AttachmentState) r1     // Catch:{ Exception -> 0x00d4 }
            r14.setAttachmentState(r1)     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r1 = "duration"
            int r1 = r11.getColumnIndex(r1)     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r1 = r11.getString(r1)     // Catch:{ Exception -> 0x00d4 }
            r14.setDuration(r1)     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r1 = "url"
            int r1 = r11.getColumnIndex(r1)     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r1 = r11.getString(r1)     // Catch:{ Exception -> 0x00d4 }
            r14.setUrl(r1)     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r1 = "local_path"
            int r1 = r11.getColumnIndex(r1)     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r1 = r11.getString(r1)     // Catch:{ Exception -> 0x00d4 }
            r14.setLocalPath(r1)     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r1 = "video_encoded"
            int r1 = r11.getColumnIndex(r1)     // Catch:{ Exception -> 0x00d4 }
            int r1 = r11.getInt(r1)     // Catch:{ Exception -> 0x00d4 }
            if (r1 == 0) goto L_0x0098
            r1 = r12
            goto L_0x0099
        L_0x0098:
            r1 = r13
        L_0x0099:
            r14.setVideoEncoded(r1)     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r1 = "type"
            int r1 = r11.getColumnIndex(r1)     // Catch:{ Exception -> 0x00d4 }
            java.lang.Class<com.instabug.library.model.Attachment$Type> r2 = com.instabug.library.model.Attachment.Type.class
            java.lang.String r1 = r11.getString(r1)     // Catch:{ Exception -> 0x00d4 }
            java.lang.Enum r1 = java.lang.Enum.valueOf(r2, r1)     // Catch:{ Exception -> 0x00d4 }
            com.instabug.library.model.Attachment$Type r1 = (com.instabug.library.model.Attachment.Type) r1     // Catch:{ Exception -> 0x00d4 }
            r14.setType(r1)     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r1 = "encrypted"
            int r1 = r11.getColumnIndex(r1)     // Catch:{ Exception -> 0x00d4 }
            int r1 = r11.getInt(r1)     // Catch:{ Exception -> 0x00d4 }
            if (r1 <= 0) goto L_0x00bf
            r1 = r12
            goto L_0x00c0
        L_0x00bf:
            r1 = r13
        L_0x00c0:
            r14.setEncrypted(r1)     // Catch:{ Exception -> 0x00d4 }
            r10.add(r14)     // Catch:{ Exception -> 0x00d4 }
            boolean r14 = r11.moveToNext()     // Catch:{ Exception -> 0x00d4 }
            if (r14 != 0) goto L_0x002e
        L_0x00cc:
            r0.setTransactionSuccessful()     // Catch:{ Exception -> 0x00d4 }
            if (r11 == 0) goto L_0x00e3
            goto L_0x00e0
        L_0x00d2:
            r14 = move-exception
            goto L_0x00ea
        L_0x00d4:
            r14 = move-exception
            java.lang.String r1 = "AttachmentsDbHelper"
            java.lang.String r2 = r14.getMessage()     // Catch:{ all -> 0x00d2 }
            com.instabug.library.util.InstabugSDKLogger.e(r1, r2, r14)     // Catch:{ all -> 0x00d2 }
            if (r11 == 0) goto L_0x00e3
        L_0x00e0:
            r11.close()
        L_0x00e3:
            r0.endTransaction()
            r0.close()
            return r10
        L_0x00ea:
            if (r11 == 0) goto L_0x00ef
            r11.close()
        L_0x00ef:
            r0.endTransaction()
            r0.close()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.storage.cache.AttachmentsDbHelper.retrieve(java.lang.String):java.util.ArrayList");
    }
}
